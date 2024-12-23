package net.mooctest;

import net.mooctest.Allocator;
import net.mooctest.CloseCallback;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * A probabalistic set data structure that supports deletions.
 * Guarantees it will never have a false negative
 * <p/>
 * N.B. Used to use memory mapped files, but they were really buggy in production
 * so switching to our on (probably slower - but safer), caching
 * Supports deletions
 */
public class BloomFilter implements Closeable {

    public static final int BITS_IN_BYTE = 8;
    public static final int DEFAULT_SEEK_THRESHOLD = 20; // See the TestFileIO class for details on how this was decided
    public static final BucketSize DEFAULT_BUCKET_SIZE = BucketSize.FOUR;
    public static final Allocator DEFAULT_ALLOCATOR = new Allocator() {
        @Override
        public byte[] apply(int size) {
            return new byte[size];
        }
    };
    public static final CloseCallback DEFAULT_CLOSE_CALLBACK = new CloseCallback() {
        @Override
        public void close(byte[] cache) {
            // nothing to do by default
        }
    };

    public RandomAccessFile file;
    public byte[] cache = null;

    // Note: unflushedChanges is always implemented as a ConcurrentSkipListMap for a few reasons
    // First, iteration is ordered based on its keys, and its more efficient to seek to each change in order
    // Second, because it's always small (elements<SEEK_THRESHOLD) the O(log(N)) operations aren't a big deal,
    // and are almost always outweighed by benefits of being lock-free.
    // One caveat is that the size() method is O(n) time, so we keep an independent size counter.
    public Map<Integer, Byte> unflushedChanges;
    public final AtomicInteger unflushedChangeCounter = new AtomicInteger(0);

    public volatile boolean cacheDirty;
    public volatile boolean open;

    public final ReentrantReadWriteLock cacheLock = new ReentrantReadWriteLock();

    // how many bytes have to change before we just rewrite the entire file. At some point, a big sequential write
    // becomes cheaper than a bunch of seeks
    public final int seekThreshold;

    public final RepeatedMurmurHash hash;
    public final BloomMetadata metadata;
    public final CloseCallback closeCallback;


    /**
     * Opens an existing bloom filter.
     *
     * @param f the file to open
     * @return the bloom filter
     * @throws IOException if an I/O error is encountered
     */
    public static BloomFilter openExisting(File f) throws IOException {
        return new OpenBuilder(f).build();
    }


    /**
     * Builder pattern for opening an existing Bloom Filter
     */
    public static class OpenBuilder {
        // required parameters
        public final File f;

        // optional parameters - initialize to reasonable defaults
        public int seekThreshold = DEFAULT_SEEK_THRESHOLD;
        public Allocator allocator = DEFAULT_ALLOCATOR;
        public CloseCallback closeCallback = DEFAULT_CLOSE_CALLBACK;


        /**
         * Uses a builder-pattern to open an existing (on-disk) bloom filter.
         *
         * @param f The file the bloomfilter was persisted to.
         */
        public OpenBuilder(File f) {
            this.f = f;
        }


        /**
         * The bloom filter is stored, on disk, as a large binary file. To flush changes to disk, we have two
         * options:
         * A. We could rewrite the entire file to disk as one sequential write.
         * B. We could seek to specific offsets of bytes that have changed in a file, and just modify those
         * <p/>
         * If the number of bytes that we would have to change is greater than the seekThreshold, we will use
         * strategy A. Otherwise, we will use strategy B.
         * <p/>
         * Set to '0' to always prefer strategy A, or Integer.MAX_INT to always use B.
         * <p/>
         * Default is 20.
         *
         * @param seekThreshold Number of seeks we'll accept before just rewriting the file
         * @return The builder
         */
        public OpenBuilder seekThreshold(int seekThreshold) {
            this.seekThreshold = seekThreshold;
            return this;
        }


        /**
         * If you're constantly opening/closing a lot of bloomfilters, using a pool/slab allocator for the byte arrays
         * underlying the in-memory cache might make sense. It probably doesn't (the JVM is *really* good at memory
         * managment). But, if you run into allocation/GC issues, it might be worth checking this out.
         *
         * @param allocator An allocator the bloomfilter will use to allocate the byte[] underlying the in-memory cache
         * @return The builder
         */
        public OpenBuilder allocator(Allocator allocator) {
            this.allocator = allocator;
            return this;
        }


        /**
         * When the bloom filter is closed, it will return the byte[] array underlying the in-memory cache to this function.
         * It's the other piece you'll need (in addition to the 'Allocator') to implement a slab/pool allocator yourself.
         *
         * @param closeCallback A callback that will receive the BloomFilter's underlying byte[] when it is closed.
         * @return The builder
         */
        public OpenBuilder closeCallback(CloseCallback closeCallback) {
            this.closeCallback = closeCallback;
            return this;
        }


        /**
         * Open the on-disk bloom filter you specified in the constructor.
         *
         * @return A bloom filter
         * @throws IOException If the bloomfilter file specified couldn't be read.
         */
        public BloomFilter build() throws IOException {
            return new BloomFilter(f, seekThreshold, allocator, closeCallback);
        }
    }


    /**
     * Create an optimal bloom filter for the given expected number of items and desired false positive rate.
     * Set force true to delete the file if it already exists.
     *
     * @param f                 The file to write to (null if this should be in-memory only)
     * @param numberOfItems     The expected number of items
     * @param falsePositiveRate The desired false positive rate at the given number of items
     * @return A bloom filter
     * @throws IOException If I can't read/write the file specified
     */
    public static BloomFilter createOptimal(File f, int numberOfItems,
                                            double falsePositiveRate, boolean force)
            throws IOException {
        return new NewBuilder(f, numberOfItems, falsePositiveRate).force(force).build();
    }


    public static class NewBuilder {

        // required parameters
        final File f;
        public final int numberOfItems;
        public final int totalLength;
        public final int hashFns;
        public final double falsePositiveRate;

        // optional parameters
        public boolean force = false;
        public BucketSize bucketSize = DEFAULT_BUCKET_SIZE;
        public int seekThreshold = DEFAULT_SEEK_THRESHOLD;
        public Allocator allocator = DEFAULT_ALLOCATOR;
        public CloseCallback closeCallback = DEFAULT_CLOSE_CALLBACK;


        /**
         * Use this parameter to expose whether you want to over-write any existing file at the location you specified.
         * <p/>
         * If you want to open an existing BloomFilter, see the OpenBuilder. If force is set to false and a file exists
         * at the location you specify, the build method will throw an IllegalArgumentException.
         * <p/>
         * Default is false (better safe than sorry).
         *
         * @param force Whether to over-write an existing file at the location you specified
         * @return The builder
         */
        public NewBuilder force(boolean force) {
            this.force = force;
            return this;
        }


        /**
         * Originally, bloom filters had '1-bit' bucket sizes. That made them very space efficient, but it was
         * impossible to delete items.
         * <p/>
         * The larger the bucketSize, the more likely you can delete items as the bloomfilter gets more loaded
         * - but the more space the filter will use on disk and in-memory. Using 2-bit buckets uses twice as
         * much memory/disk as 1-bit buckets - and 8-bit buckets require 8x the memory/disk of 1-bit buckets.
         * <p/>
         * See http://portal.acm.org/citation.cfm?id=285287 for details.
         * <p/>
         * Default is BucketSize.FOUR
         *
         * @param bucketSize How many bits to use per bucket.
         * @return The builder
         */
        public NewBuilder bucketSize(BucketSize bucketSize) {
            this.bucketSize = bucketSize;
            return this;
        }


        /**
         * The bloom filter is stored, on disk, as a large binary file. To flush changes to disk, we have two
         * options:
         * A. We could rewrite the entire file to disk as one sequential write.
         * B. We could seek to specific offsets of bytes that have changed in a file, and just modify those
         * <p/>
         * If the number of bytes that we would have to change is greater than the seekThreshold, we will use
         * strategy A. Otherwise, we will use strategy B.
         * <p/>
         * Set to '0' to always prefer strategy A, or Integer.MAX_INT to always use B.
         * <p/>
         * Default is 20.
         *
         * @param seekThreshold Number of seeks we'll accept before just rewriting the file
         * @return The builder
         */
        public NewBuilder seekThreshold(int seekThreshold) {
            this.seekThreshold = seekThreshold;
            return this;
        }


        /**
         * If you're constantly opening/closing a lot of bloomfilters, using a pool/slab allocator for the byte arrays
         * underlying the in-memory cache might make sense. It probably doesn't for you (the JVM is *really* good at memory
         * managment). But, if you run into allocation/GC issues, it might be worth checking this out.
         *
         * @param allocator An allocator the bloomfilter will use to allocate the byte[] underlying the in-memory cache
         * @return The builder
         */
        public NewBuilder allocator(Allocator allocator) {
            this.allocator = allocator;
            return this;
        }


        /**
         * When the bloom filter is closed, it will return the byte[] array underlying the in-memory cache to this function.
         * It's the other piece you'll need (in addition to the 'Allocator') to implement a slab/pool allocator yourself.
         *
         * @param closeCallback A callback that will receive the BloomFilter's underlying byte[] when it is closed.
         * @return The builder
         */
        public NewBuilder closeCallback(CloseCallback closeCallback) {
            this.closeCallback = closeCallback;
            return this;
        }


        /**
         * Default constructor.
         *
         * @param f                 The file to save the bloom filter into
         * @param numberOfItems     The expected number of items
         * @param falsePositiveRate The acceptable false positive rate
         */
        public NewBuilder(File f, int numberOfItems, double falsePositiveRate) {
            this.f = f;
            this.numberOfItems = numberOfItems;
            this.totalLength = 0;
            this.hashFns = 0;
            this.falsePositiveRate = falsePositiveRate;
        }


        /**
         * This constructor allows a BloomFilter to be built exact specifications for its size and number of hash functions.
         *
         * @param f                 The file to save the bloom filter into
         * @param numberOfItems     The expected number of items
         * @param falsePositiveRate The acceptable false positive rate
         * @param totalLength       The size of the underlying byte array in bytes
         * @param hashFns           The number of hash functions the bloom filter should use
         */
        public NewBuilder(File f, int numberOfItems, double falsePositiveRate, int totalLength, int hashFns) {
            this.f = f;
            this.numberOfItems = numberOfItems;
            this.totalLength = totalLength;
            this.hashFns = hashFns;
            this.falsePositiveRate = falsePositiveRate;
        }

        /**
         * Use the settings provided, and build an actual bloom filter.
         *
         * @return
         * @throws IOException
         */
        public BloomFilter build() throws IOException {
            if (this.totalLength == 0) {
                int buckets = calculateOptimalBucketCount(numberOfItems, falsePositiveRate);
                int hashFns = calculateOptimalHashFunctionCount(numberOfItems, buckets);
                return new BloomFilter(f, buckets, hashFns, force, seekThreshold, bucketSize, allocator, closeCallback);
            } else {
                return new BloomFilter(f, force, seekThreshold, allocator, closeCallback,
                        BloomMetadata.createNewWithLength(totalLength, hashFns, bucketSize));
            }
        }
    }


    public static int calculateOptimalBucketCount(int numberOfItems, double falsePositiveRate) {
        return (int) Math.ceil((numberOfItems * Math.log(falsePositiveRate))
                / Math.log(1.0 / (Math.pow(2.0, Math.log(2.0)))));
    }


    public static int calculateOptimalHashFunctionCount(int numberOfItems, int buckets) {
        return (int) Math.round(Math.log(2.0) * buckets / numberOfItems);
    }


    /**
     * Clears all elements from a bloom filter.
     */
    public void clear() {
        cacheLock.writeLock().lock();
        try {
            checkIfOpen();
            for (int i = 0; i < cache.length; i++) {
                cache[i] = 0;
            }
            cacheDirty = true;
        } finally {
            cacheLock.writeLock().unlock();
        }
    }


    /**
     * Adds the given key to the bloom filter.
     *
     * @param data the key
     */
    public void add(byte[] data) {
        int[] toSet = hash.hash(data);
        cacheLock.writeLock().lock();
        try {
            checkIfOpen();
            for (int i : toSet) {
                incrementCount(i);
            }
            cacheDirty = true;
        } finally {
            cacheLock.writeLock().unlock();
        }
    }


    /**
     * Removes the given key from the bloom filter.
     *
     * @param data the key
     */
    public void remove(byte[] data) {
        int[] toUnset = hash.hash(data);
        cacheLock.writeLock().lock();
        try {
            checkIfOpen();
            for (int i : toUnset) {
                decrementCount(i);
            }
            cacheDirty = true;
        } finally {
            cacheLock.writeLock().unlock();
        }
    }


    /**
     * Checks if the bloom filter contains the key.
     *
     * @param data the key
     * @return whether the key likely is in the bloom filter.  if false, the key is definitely not in the bloom filter.
     * if true, the key is probably in the bloom filter
     */
    public boolean contains(byte[] data) {
        int[] hash = this.hash.hash(data);
        cacheLock.readLock().lock();
        try {
            checkIfOpen();
            for (int i : hash) {
                if (!this.isSet(i)) {
                    return false;
                }
            }
        } finally {
            cacheLock.readLock().unlock();
        }
        return true;
    }


    /**
     * Persists the bloom filter to disk.
     *
     * @throws IOException if I/O errors are encountered.
     */
    public void flush() throws IOException {
        flush(false);
    }


    public void flush(boolean forClose) throws IOException {
        cacheLock.writeLock().lock();
        try {
            if (cacheDirty && unflushedChanges != null && file != null) {
                final int offset = this.metadata.getHeaderLength();

                //it's actually a disk-backed filter with changes
                if (unflushedChangeCounter.get() >= seekThreshold) {
                    file.seek(offset);
                    file.write(cache);
                    if (forClose) {
                        closeCallback.close(cache);
                        cache = null;
                    }
                } else {
                    for (Map.Entry<Integer, Byte> change : unflushedChanges.entrySet()) {
                        file.seek(change.getKey() + offset);
                        file.write(change.getValue());
                    }
                    if (forClose) { // minor optimization, to clear the memory for the cache before the disk I/O
                        closeCallback.close(cache);
                        cache = null;
                    }
                }

                file.getFD().sync();
                cacheDirty = false;
                unflushedChanges.clear();
                unflushedChangeCounter.set(0);
            }
        } finally {
            cacheLock.writeLock().unlock();
        }
    }


    /**
     * Closes the bloom filter.
     *
     * @throws IOException if I/O errors are encountered
     */
    public void close() throws IOException {
        cacheLock.writeLock().lock();
        try {
            if (open) {
                open = false;
                flush(true);
                if (file != null) {
                    file.close();
                }
            }
        } finally {
            cacheLock.writeLock().unlock();
        }
    }


    /**
     * Does this bloom filter have changes which haven't been sync'd to disk?
     *
     * @return True IFF there are unflushed changes
     */
    public boolean unflushedChanges() {
        cacheLock.readLock().lock();
        try {
            return cacheDirty;
        } finally {
            cacheLock.readLock().unlock();
        }
    }


    public int capacity(double falsePositiveRate) {
        int capacity = (int) Math.round((this.metadata.getBucketCount() * Math.log(1.0 / Math.pow(2.0, Math.log(2.0))))
                / Math.log(falsePositiveRate));
        return capacity;
    }


    public void checkIfOpen() {
        if (!open) {
            throw new IllegalStateException("Can't perform any operations on a closed bloom filter");
        }
    }


    // creates a new BloomFilter - access via BloomFilter.createOptimal(...)
    public BloomFilter(File f, int buckets, int hashFns, boolean force, int seekThreshold, BucketSize countBits,
                       Allocator cacheAllocator, CloseCallback callback)
            throws IOException {
        this(f, force, seekThreshold, cacheAllocator, callback, BloomMetadata.createNew(buckets, hashFns, countBits));
    }


    public BloomFilter(File f, boolean force, int seekThreshold,
                       Allocator cacheAllocator, CloseCallback callback, BloomMetadata metadata)
            throws IOException {
        this.metadata = metadata;
        this.closeCallback = callback;
        this.seekThreshold = seekThreshold;
        hash = new RepeatedMurmurHash(this.metadata.getHashFns(), this.metadata.getBucketCount());

        // creating a new filter - so I can just be lazy and start it zero'd
        cache = cacheAllocator.apply(this.metadata.getTotalLength() - this.metadata.getHeaderLength());
        cacheDirty = true;

        open = true;

        if (f != null) {
            if (f.exists()) {
                if (force) {
                    if (!f.delete()) {
                        throw new IOException("Couldn't delete old file at " + f.getAbsolutePath());
                    }
                } else {
                    throw new IllegalArgumentException("Can't create a new BloomFilter at " + f.getAbsolutePath()
                            + " since it already exists");
                }
            }

            file = new RandomAccessFile(f, "rw");
            this.metadata.writeToFile(file);
            file.setLength(metadata.getTotalLength());
            file.getFD().sync();
            unflushedChanges = new ConcurrentSkipListMap<Integer, Byte>();

            if (f.length() != metadata.getTotalLength()) {
                throw new RuntimeException("Bad size - expected " + metadata.getTotalLength() + " but got " + f.length());
            }
        } else {
            unflushedChanges = null; // don't bother keeping track of unflushed changes if this is memory only
            file = null;
        }

        flush();
    }


    // Opens an existing bloom filter.  Access via BloomFilter.openExisting(...)
    public BloomFilter(File f, int seekThreshold, Allocator cacheAllocator, CloseCallback closeCallback)
            throws IOException {
        assert f.exists() && f.isFile() && f.canRead() && f.canWrite() : "Trying to open a non-existent bloom filter";
        this.seekThreshold = seekThreshold;
        this.closeCallback = closeCallback;
        file = new RandomAccessFile(f, "rw");
        this.metadata = BloomMetadata.readHeader(file);
        unflushedChanges = new ConcurrentSkipListMap<Integer, Byte>();

        // load the cache with the on disk data
        cache = cacheAllocator.apply(metadata.getTotalLength() - metadata.getHeaderLength());
        int readRes = file.read(cache);
        assert readRes == (metadata.getTotalLength() - metadata.getHeaderLength())
                : "I only read " + readRes + " bytes, but was expecting " + (metadata.getTotalLength()
                - metadata.getHeaderLength());

        hash = new RepeatedMurmurHash(metadata.getHashFns(), metadata.getBucketCount());
        open = true;
    }


    public void setByte(int position, byte value) {
        assert cacheLock.isWriteLockedByCurrentThread();
        cache[position] = value;
        if (unflushedChanges != null && unflushedChangeCounter.get() < seekThreshold) {
            unflushedChanges.put(position, value);
            unflushedChangeCounter.incrementAndGet();
        }
    }


    // return the integer value of a (possibly improper) subset of bits from a given byte.
    // e.g., if byte x = 01101101, then getNumAt(x, 0, 2) = b01 = d1
    // or getNumAt(x, 4, 4) = b1101 = d13
    protected static byte getBucketAt(byte data, final int offset, final int len) {
        assert offset < BITS_IN_BYTE;
        assert len <= BITS_IN_BYTE;
        assert offset + len <= BITS_IN_BYTE;

        // shift so the bits we want are right-most
        final int shift = (BITS_IN_BYTE - (offset + len));
        data = (byte) (data >>> shift);

        // zero out everything to the left of what we're interested in
        // Java needs the 0xFF & 0xFF since it doesn't have unsigned types, and silently converts bytes to ints. Don't ask.
        final byte mask = (byte) ((0xFF & 0xFF) >> (BITS_IN_BYTE - len));
        data = (byte) (data & mask);

        return data;
    }


    protected static byte putBucketAt(final byte wholeByte, int offset, int len, byte bucketVal) {
        assert offset < BITS_IN_BYTE;
        assert len <= BITS_IN_BYTE;
        assert offset + len <= BITS_IN_BYTE;
        assert bucketVal <= ((1 << len) - 1);

        byte res = wholeByte;

        // first we want to clear the old value of the bucket
        byte mask = (byte) ((1 << len) - 1);
        mask <<= (BITS_IN_BYTE - (offset + len));
        mask = (byte) ~mask; // this is a little annoying, but it works for buckets that are in the 'middle' of a byte
        res &= mask;

        // then we want to set the bits in the bucket correctly
        bucketVal <<= (BITS_IN_BYTE - (offset + len));
        res |= bucketVal;

        return res;
    }


    /**
     * Checks if the given bucket has a count of at least one.
     *
     * @param bucket - the bucket you're interested in
     * @return whether it is set
     */
    public boolean isSet(int bucket) {
        assert bucket >= 0 && bucket < this.metadata.getBucketCount();
        final int indexOfByteContainingBucket = bucket / this.metadata.getBucketsPerByte();
        assert indexOfByteContainingBucket < this.metadata.getTotalLength();

        final int offsetOfBucketInByte = (bucket % this.metadata.getBucketsPerByte())
                * this.metadata.getBucketSize().getBits();
        final byte byteContainingBucket = cache[indexOfByteContainingBucket];
        final byte bucketVal = getBucketAt(byteContainingBucket, offsetOfBucketInByte,
                this.metadata.getBucketSize().getBits());

        return bucketVal != 0;
    }


    // if decr is false, then it's an incr
    public void modifyBucket(int position, boolean decr) {
        assert position >= 0 && position < this.metadata.getBucketCount();

        final int indexOfByteContainingBucket = position / this.metadata.getBucketsPerByte();
        assert indexOfByteContainingBucket < this.metadata.getTotalLength();
        final byte byteContainingBucket = cache[indexOfByteContainingBucket];

        final int offsetOfBucketInByte = (position % this.metadata.getBucketsPerByte()) * this.metadata.getBucketSize().getBits();
        final int bucket = getBucketAt(byteContainingBucket, offsetOfBucketInByte, this.metadata.getBucketSize().getBits());

        // bucket is overflowing, can't do anything
        if (bucket == this.metadata.getMaxCountInBucket()) {
            return;
        }

        assert bucket < this.metadata.getMaxCountInBucket();

        int newBucketVal;
        if (decr) {
            newBucketVal = bucket - 1;
        } else {
            newBucketVal = bucket + 1;
        }

        byte newVal =
                putBucketAt(byteContainingBucket, offsetOfBucketInByte, this.metadata.getBucketSize().getBits(), (byte) newBucketVal);
        setByte(indexOfByteContainingBucket, newVal);
    }


    /**
     * Closes this BloomFilter and sets its file to the given File instead. If the given file already exists and
     * force is true, deletes the existing file first.
     *
     * @param f     The file to save this BloomFilter to on disk
     * @param force If true, forces the existing file for this BloomFilter to be deleted
     * @throws IOException If a problem occurs deleting the old file or creating the new one
     */
    public void setNewFile(File f, boolean force) throws IOException {
        if (f != null) {
            if (f.exists()) {
                if (force) {
                    if (!f.delete()) {
                        throw new IOException("Couldn't delete old file at " + f.getAbsolutePath());
                    }
                } else {
                    throw new IllegalArgumentException("Can't create a new BloomFilter at " + f.getAbsolutePath()
                            + " since it already exists");
                }
            }

            this.file = new RandomAccessFile(f, "rw");
            this.metadata.writeToFile(this.file);
            this.file.setLength(this.metadata.getTotalLength());
            this.file.getFD().sync();

            if (this.unflushedChanges == null) {
                unflushedChanges = new ConcurrentSkipListMap<Integer, Byte>();
            } else {
                this.unflushedChanges.clear();
            }

            this.open = true;

            if (f.length() != this.metadata.getTotalLength()) {
                throw new RuntimeException("Bad size - expected " + this.metadata.getTotalLength() + " but got " + f.length());
            }

            flush();
        }
    }


    /**
     * Increments the count in a given bucket
     *
     * @param bucket - which bucket to increment
     */
    public void incrementCount(int bucket) {
        modifyBucket(bucket, false);
    }


    /**
     * Decrements the count in a given bucket
     *
     * @param bucket - which bucket to increment
     */
    public void decrementCount(int bucket) {
        modifyBucket(bucket, true);
    }


    /**
     * Returns the underlying byte array. Useful for testing and equivalency checking.
     *
     * @return cache - the underlying byte array
     */
    public byte[] getUnderlyingDataBytes() {
        checkIfOpen();
        return cache;
    }

    /**
     * Useful for making a backup. Writes a guaranteed consistent snapshot of the bloom filter
     * to disk. All flushes will be blocked while this snapshot is being taken.
     *
     * @param output The file this bloom filter should be copied to.
     * @param force  If force is set to true and the outputFile already exists, it will be deleted
     */
    public void makeConsistentSnapshot(File output, boolean force) throws IOException {

        if (output.exists()) {
            if (force) {
                output.delete();
            } else {
                throw new IOException("Snapshot file already exists - can't take snapshot");
            }
        }

        this.cacheLock.readLock().lock();
        try {
            RandomAccessFile snapshotFile = new RandomAccessFile(output, "rw");
            try {
                this.metadata.writeToFile(snapshotFile);
                snapshotFile.setLength(this.metadata.getTotalLength());
                snapshotFile.seek(this.metadata.getHeaderLength());
                snapshotFile.write(cache);
                snapshotFile.getFD().sync();
            } finally {
                snapshotFile.close();
            }
        } finally {
            this.cacheLock.readLock().unlock();
        }
    }

    /**
     * Returns the length of the underlying bloom filter byte array.
     *
     * @return the length of the bloom filter byte array
     */
    public int getTotalLength() {
        return this.metadata.getTotalLength();
    }


    /**
     * Returns the number of hash functions this BloomFilter uses.
     *
     * @return the number of hash functions
     */
    public int getHashFns() {
        return this.metadata.getHashFns();
    }
}
