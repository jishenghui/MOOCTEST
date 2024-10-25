package net.mooctest;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BloomMetadataTest {
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
