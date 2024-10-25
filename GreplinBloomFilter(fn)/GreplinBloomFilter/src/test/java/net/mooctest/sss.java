package net.mooctest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import net.mooctest.BloomFilter.NewBuilder;
import net.mooctest.BloomFilter.OpenBuilder;

public class sss{

    @Test
    public void testCreateNew() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(BloomMetadata.VERSION, metadata.version);
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.headerLength);
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES + 2, metadata.totalLength);
        assertEquals(2, metadata.hashFns);
        assertEquals(BucketSize.ONE, metadata.bucketSize);
    }
    @Test
    public void test1() throws Exception {
        RepeatedMurmurHash rmh = new RepeatedMurmurHash(2, 1000);
        assertEquals(2, rmh.hashCount);
        RepeatedMurmurHash rmh1 = new RepeatedMurmurHash(2, 1000);
        assertEquals(1000, rmh1.max);
        byte[] data = "hello".getBytes();
        int seed = 0;
        int expected =RepeatedMurmurHash.hashOnce(data, seed);
        assertNotEquals(0, expected);

        byte[] data1 = "hello".getBytes();
        RepeatedMurmurHash rmh2 = new RepeatedMurmurHash(2, 1000);
        int[] result = rmh2.hash(data1);
        assertNotEquals(0, result[0]);
        assertNotEquals(0, result[1]);
        assertNotEquals(result[0], result[1]);


        byte[] data2 = "hello".getBytes();
        RepeatedMurmurHash rmh3 = new RepeatedMurmurHash(2, 1000);
        int[] result1 = rmh.hash(data2);
        int seed1 = 1;
        int[] anotherResult = rmh2.hash(data2);
//        assertNotEquals(result[0], anotherResult[0]);
//        assertNotEquals(result[1], anotherResult[1]);


        byte[] data3 = "hello".getBytes();
        RepeatedMurmurHash rmh4 = new RepeatedMurmurHash(1, 1000);
        int[] result2 = rmh4.hash(data3);
        RepeatedMurmurHash rmh5 = new RepeatedMurmurHash(2, 1000);
        int[] result3 = rmh5.hash(data3);

    }
    @Test
    public void test2() throws Exception {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
//        BloomFilter bloomFilter = new
        metadata.createNewWithLength(200, 10, BucketSize.FOUR);
        try {
            BloomMetadata metadata1 = BloomMetadata.createNew(10, -1, BucketSize.ONE);

        } catch (InvalidBloomFilter e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        try {
            BloomMetadata metadata1 = BloomMetadata.createNewWithLength(20, 20, BucketSize.FOUR);

        } catch (InvalidBloomFilter e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        assertEquals(3, BloomMetadata.bytes(20));
        assertEquals(1, BloomMetadata.bytes(8));
        assertEquals(2, metadata.getVersion());
        assertEquals(32, metadata.getHeaderLength());
        assertEquals(34, metadata.getTotalLength());
        assertEquals(2, metadata.getHashFns());
        assertEquals(BucketSize.ONE, metadata.getBucketSize());
        assertEquals(1, metadata.getMaxCountInBucket());
        assertEquals(8, metadata.getBucketsPerByte());
        assertEquals(16, metadata.getBucketCount());

        assertEquals(BucketSize.ONE, BucketSize.getBucketSize(1));
    }
    @Test
    public void test4() throws Exception {
        String rootPath = System.getProperty("user.dir");
        System.out.println(rootPath);
        String path = rootPath + "\\src\\test\\java\\net\\mooctest\\1.txt";
        OpenBuilder openBuilder = new BloomFilter.OpenBuilder(new File(path));
        openBuilder.seekThreshold(10);
//    	openBuilder.allocator()
        NewBuilder newBuilder = new BloomFilter.NewBuilder(new File(path), 10, 0.3);
        newBuilder.force(true);
        newBuilder.bucketSize(BucketSize.ONE);
        newBuilder.seekThreshold(20);
        NewBuilder newBuilder1 = new BloomFilter.NewBuilder(new File(path), 10, 0.3,10,9);

        assertEquals(26, BloomFilter.calculateOptimalBucketCount(10, 0.3));
        assertEquals(0, BloomFilter.calculateOptimalHashFunctionCount(10, 2));
        BloomFilter.getBucketAt((byte)2, 2, 4);
        BloomFilter.putBucketAt((byte)2, 2, 4,(byte)2);

    }

}
