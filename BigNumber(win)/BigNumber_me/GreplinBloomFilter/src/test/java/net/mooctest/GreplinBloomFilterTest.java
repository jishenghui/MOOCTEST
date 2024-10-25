package net.mooctest;
import java.util.*;
import java.math.*;
import org.junit.*;
import java.io.*;
import java.nio.file.*;
import static org.junit.Assert.*;

public class GreplinBloomFilterTest {

    private File testFile;
    private BloomFilter bloomFilter;
    private RepeatedMurmurHash hashFunction;
    private byte[] testInput;
    @Before
    public void setUp() throws IOException {
        hashFunction = new RepeatedMurmurHash(3, 1000);
        testFile = File.createTempFile("bloom-filter-test", ".tmp");
        testFile.deleteOnExit();

        // 创建一个BloomFilter实例
        bloomFilter = BloomFilter.createOptimal(testFile, 10000, 0.01, true);
    }

    @After
    public void tearDown() throws IOException {
        if (bloomFilter != null) {
            bloomFilter.close();
        }
//        Files.deleteIfExists(testFile.toPath());
    }





    @Test
    public void testAddAndContains() throws IOException {
        byte[] data = "test".getBytes();
        bloomFilter.add(data);
        assertTrue(bloomFilter.contains(data));
    }

    @Test
    public void testRemove() throws IOException {
        byte[] data = "test".getBytes();
        bloomFilter.add(data);
        bloomFilter.remove(data);
        assertFalse(bloomFilter.contains(data));
    }

    @Test
    public void testClear() throws IOException {
        byte[] data = "test".getBytes();
        bloomFilter.add(data);
        bloomFilter.clear();
        assertFalse(bloomFilter.contains(data));
    }

    @Test
    public void testFlush() throws IOException {
        byte[] data = "test".getBytes();
        bloomFilter.add(data);
        bloomFilter.flush();
        BloomFilter reopenedBloomFilter = BloomFilter.openExisting(testFile);
        assertTrue(reopenedBloomFilter.contains(data));
    }

    @Test(expected = IllegalStateException.class)
    public void testClosedOperations() throws IOException {
        bloomFilter.close();
        bloomFilter.add("test".getBytes());
    }

    @Test
    public void testUnflushedChanges() throws IOException {
        byte[] data = "test".getBytes();
        bloomFilter.add(data);
        assertTrue(bloomFilter.unflushedChanges());
        bloomFilter.flush();
        assertFalse(bloomFilter.unflushedChanges());
    }

    @Test
    public void testSetNewFile() throws IOException {
        try {
            bloomFilter.setNewFile(testFile,true);
        }catch (Exception e){
            System.out.println("Couldn't delete old file at " + tempFile.getAbsolutePath());
        }
        testFile = File.createTempFile("bloom-filter", ".tmp");
        bloomFilter.setNewFile(testFile,true);
//        bloomFilter.setNewFile(new File(""),false);
        tempFile.delete();
        testFile = File.createTempFile("bloom-filter", ".tmp");
        try {
            bloomFilter.setNewFile(testFile,false);
        }catch (Exception e){
            System.out.println("Can't create a new BloomFilter at " + tempFile.getAbsolutePath()
                    + " since it already exists");
        }

    }

    @Test
    public void testBloomFilter() throws IOException {
        File f1=new File("NullTest01",".tmp");
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        try {
            BloomFilter b1=new BloomFilter(f1,false,10,BloomFilter.DEFAULT_ALLOCATOR,BloomFilter.DEFAULT_CLOSE_CALLBACK,metadata);
        }catch (Exception e){
            System.out.println(1);
        }
        try {
            BloomFilter b1=new BloomFilter(f1,true,10,BloomFilter.DEFAULT_ALLOCATOR,BloomFilter.DEFAULT_CLOSE_CALLBACK,metadata);
        }catch (Exception e){
            System.out.println(2);
        }

    }








//    @Before
//    public void setUp() {
//
////        testInput = "Hello World!".getBytes();
//    }

    @Test
    public void hash_GivenByteArray_ShouldReturnExpectedHashValues() {
        testInput = "Hello World!".getBytes();
        int[] actualHashes = hashFunction.hash(testInput);
//        testInput = "Hello World!".getBytes();
        int[] expectedHashes = {52,474,296}; // These would be expected values you'd have to calculate or provide.
        assertEquals("长度",expectedHashes.length,actualHashes.length);
        for (int i = 0; i < expectedHashes.length; i++) {
            assertEquals(expectedHashes[i],actualHashes[i]);
        }
//        assertEquals("Hash function did not produce expected results1", expectedHashes, actualHashes);
    }

    @Test
    public void hash_GivenEmptyByteArray_ShouldReturnExpectedHashValues() {
        byte[] emptyInput = new byte[0];
        int[] expectedHashes = {0, 0, 0}; // Expected values for an empty input.
        int[] actualHashes = hashFunction.hash(emptyInput);
        assertEquals(expectedHashes.length,actualHashes.length);
        for (int i = 0; i < expectedHashes.length; i++) {
            assertEquals(expectedHashes[i],actualHashes[i]);
        }
//        assertEquals("Hash function did not produce expected results for empty input2", expectedHashes, actualHashes);
    }

    @Test
    public void hash_GivenSameByteArray_ShouldReturnConsistentHashValues() {
        testInput = "hi  oaj f oajfo aih".getBytes();

        int[] hashes1 = hashFunction.hash(testInput);
        int[] hashes2 = hashFunction.hash(testInput);
        assertEquals(hashes1.length,hashes2.length);
        for (int i = 0; i < hashes2.length; i++) {
            assertEquals(hashes1[i],hashes2[i]);
        }
//        assertEquals("Hash function did not produce consistent results3", hashes1, hashes2);
    }

    @Test
    public void hash_GivenSameByteArray_ShouldReturnConsistentHashValues1() {
        testInput = "hi  oaj f oih".getBytes();

        int[] hashes1 = hashFunction.hash(testInput);
        int[] hashes2 = hashFunction.hash(testInput);
        assertEquals(hashes1.length,hashes2.length);
        for (int i = 0; i < hashes2.length; i++) {
            assertEquals(hashes1[i],hashes2[i]);
        }
//        assertEquals("Hash function did not produce consistent results3", hashes1, hashes2);
    }

    @Test
    public void hash_GivenDifferentByteArray_ShouldReturnDifferentHashValues() {
        testInput = "Hello World!".getBytes();

        byte[] differentInput = "Goodbye World!".getBytes();
        int[] hashes1 = hashFunction.hash(testInput);
        int[] hashes2 = hashFunction.hash(differentInput);

        assertNotEquals("Hash function did not produce different results for different inputs", hashes1, hashes2);
    }








    File tempFile;
    @Test
    public void testCreateNew_ValidInput_CorrectMetadata() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(BloomMetadata.VERSION, metadata.getVersion());
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.getHeaderLength());
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES + 2, metadata.getTotalLength());
        assertEquals(2, metadata.getHashFns());
        assertEquals(BucketSize.ONE, metadata.getBucketSize());
    }

    @Test
    public void testCreateNewWithLength_ValidInput_CorrectMetadata() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNewWithLength(32, 2, BucketSize.ONE);
        assertEquals(BloomMetadata.VERSION, metadata.getVersion());
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.getHeaderLength());
        assertEquals(32, metadata.getTotalLength());
        assertEquals(2, metadata.getHashFns());
        assertEquals(BucketSize.ONE, metadata.getBucketSize());
    }

    @Test
    public void testBytes_ValidBits_CorrectBytes() {
        assertEquals(1, BloomMetadata.bytes(8));
        assertEquals(2, BloomMetadata.bytes(9));
        assertEquals(4, BloomMetadata.bytes(32));
    }

    @Test
    public void testReadOldStyleHeader_ValidInput_CorrectMetadata() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(tempFile, "rw")) {
            file.writeInt(2);
            file.writeInt(16);
            BloomMetadata metadata = BloomMetadata.readOldStyleHeader(file, 2, 16);
            assertEquals((byte) 1, metadata.getVersion());
            assertEquals(2 * BloomMetadata.INT_SIZE, metadata.getHeaderLength());
            assertEquals(24, metadata.getTotalLength());
            assertEquals(2, metadata.getHashFns());
            assertEquals(BucketSize.FOUR, metadata.getBucketSize());
        }
    }

    @Test
    public void testReadNewStyleHeader_ValidInput_CorrectMetadata() throws IOException {

        try (RandomAccessFile file = new RandomAccessFile(tempFile, "rw")) {
            file.writeInt(0);
            file.writeInt(0);
            file.write(BloomMetadata.MAGIC_WORD);
            file.writeByte(BloomMetadata.VERSION);
            file.writeInt(BloomMetadata.EXPECTED_HEADER_BYTES);
            file.writeInt(32);
            file.writeInt(2);
            file.writeInt(BucketSize.ONE.getBits());
            file.writeInt(0);

            BloomMetadata metadata = BloomMetadata.readNewStyleHeader(file);
            assertEquals(BloomMetadata.VERSION, metadata.getVersion());
            assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.getHeaderLength());
            assertEquals(32, metadata.getTotalLength());
            assertEquals(2, metadata.getHashFns());
            assertEquals(BucketSize.ONE, metadata.getBucketSize());
        }
    }

    @Test
    public void testReadHeader_ValidNewStyleHeader_CorrectMetadata() throws IOException {

        try (RandomAccessFile file = new RandomAccessFile(tempFile, "rw")) {
            file.writeBytes("hello world!");
            file.writeBytes("hello world!");
            file.writeBytes("hello world!");
            file.writeBytes("hello world!");
            file.writeBytes("hello world!");
            file.writeBytes("hello world!");
            BloomMetadata metadata = BloomMetadata.readHeader(file);
            assertEquals(BloomMetadata.VERSION, metadata.getVersion());
            assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.getHeaderLength());
            assertEquals(32, metadata.getTotalLength());
            assertEquals(2, metadata.getHashFns());
            assertEquals(BucketSize.ONE, metadata.getBucketSize());
        }
    }

    @Test
    public void testReadHeader_ValidOldStyleHeader_CorrectMetadata() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(tempFile, "rw")) {
//            file.writeInt(2);
//            file.writeInt(16);
            BloomMetadata metadata = BloomMetadata.readHeader(file);
            assertEquals((byte) 1, metadata.getVersion());
            assertEquals(2 * BloomMetadata.INT_SIZE, metadata.getHeaderLength());
            assertEquals(24, metadata.getTotalLength());
            assertEquals(2, metadata.getHashFns());
            assertEquals(BucketSize.FOUR, metadata.getBucketSize());
        }
    }

    @Test
    public void testGetVersion() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(BloomMetadata.VERSION, metadata.getVersion());
    }

    @Test
    public void testGetHeaderLength() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.getHeaderLength());
    }

    @Test
    public void testGetTotalLength() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNewWithLength(32, 2, BucketSize.ONE);
        assertEquals(32, metadata.getTotalLength());
    }

    @Test
    public void testGetHashFns() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(2, metadata.getHashFns());
    }

    @Test
    public void testGetBucketSize() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(BucketSize.ONE, metadata.getBucketSize());
    }

    @Test
    public void testGetMaxCountInBucket() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(1, metadata.getMaxCountInBucket());
    }

    @Test
    public void testGetBucketsPerByte() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(8, metadata.getBucketsPerByte());
    }

    @Test
    public void testGetBucketCount() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(160, metadata.getBucketCount());
    }

    @Test
    public void testWriteToFile_OldStyle() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(tempFile, "rw")) {
            BloomMetadata metadata = BloomMetadata.readOldStyleHeader(file, 2, 16);
            metadata.writeToFile(file);
            file.seek(0);
            assertEquals(2, file.readInt());
            assertEquals(16, file.readInt());
        }
    }

    @Test
    public void testWriteToFile_NewStyle() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(tempFile, "rw")) {
            BloomMetadata metadata = BloomMetadata.readNewStyleHeader(file);
            metadata.writeToFile(file);
            file.seek(0);
            byte[] magicWord = new byte[BloomMetadata.MAGIC_WORD.length];
            file.read(magicWord);
            assertEquals(BloomMetadata.MAGIC_WORD, magicWord);
            assertEquals(BloomMetadata.VERSION, file.readByte());
            assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, file.readInt());
            assertEquals(32, file.readInt());
            assertEquals(2, file.readInt());
            assertEquals(BucketSize.ONE.getBits(), file.readInt());
            assertEquals(0, file.readInt());
        }
    }

    //    /**
//     * 创建一个临时文件，用于存储 bloom metadata 测试的相关数据
//     *
//     * 该方法使用 Java 的 File 类创建一个临时文件，并确保在程序结束时删除这个文件
//     *
//     * @return 返回一个新创建的临时File对象
//     * @throws IOException 如果创建临时文件时发生IO错误
//     */
//    private File createTempFile() throws IOException {
//        // 创建一个以 "bloomMetadataTest" 开头，以 ".tmp" 结尾的临时文件
//        File tempFile = File.createTempFile("bloomMetadataTest", ".tmp");
//
//        // 设置临时文件在程序退出时自动删除
//        tempFile.deleteOnExit();
//
//        // 返回新创建的临时文件对象
//        return tempFile;
//    }
    @Before
    public void createTempFile() throws IOException {
        // 创建一个以 "bloomMetadataTest" 开头，以 ".tmp" 结尾的临时文件
        tempFile = File.createTempFile("bloomMetadataTest", ".tmp");
        // 返回新创建的临时文件对象
//        return tempFile;
    }
    @After
    public void createTempFile1() throws IOException {
        // 创建一个以 "bloomMetadataTest" 开头，以 ".tmp" 结尾的临时文件
        tempFile.delete();
        // 返回新创建的临时文件对象
//        return tempFile;
    }
}
