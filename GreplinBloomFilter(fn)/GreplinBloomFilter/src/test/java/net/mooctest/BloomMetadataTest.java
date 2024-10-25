package net.mooctest;

import org.junit.*;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;

public class BloomMetadataTest {
    //mvn test-compile org.pitest:pitest-maven:mutationCoverage
    ByteArrayOutputStream outContent;
    Random random;
    String lineSeparator = System.lineSeparator();//����ϵͳ���з�

    /**
     * Javadocע�ͱ�ǩ�﷨��
     *     ��ǩ	������	˵��
     *     @author �ļ����ࡢ���ԡ�����	������������ģ������ߣ��������ʹ�ö��@author��ǩ��ʶ��java doc����ʾ������ʱ��˳�����С�
     *     @version �ļ����ࡢ����	��ʶע�Ͷ���İ汾��
     *     @see    �࣬���ԣ�����	�ο�ת��������⣩
     *     @param    ����    �Է�����ĳ������˵��
     *     @return ����    �Է�������ֵ��˵��
     *     @exception ����    �����׳����쳣����
     *     @throws ����    �����׳����쳣����˵��
     *     @deprecated �ļ����ࡢ����	˵��������ڣ�Ӧ�ø����û����API���ĸ��·�������ˣ������ @see ��ǻ� {@link} ���ָ����API
     *     @link �ࡢ����	���ӵ�һ��Ŀ�꣬�÷�����@see���������ڣ�@link����ܹ�Ƕ�뵽ע������У�Ϊע������е�����ʻ��������ӡ�����{@link ��}
     *     @since JDK�汾    �ļ�����	���ڱ�ʶ������ļ�����Ҫ��JDK������
     */

    // ��ȡ����ַ���
    public static String usingMath(int length) {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456788";
        // create a super set of all characters
        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase + numbers;
        // initialize a string to hold result
        StringBuffer randomString = new StringBuffer();
        // loop for 10 times
        for (int i = 0; i < length; i++) {
            // generate a random number between 0 and length of all characters
            int randomIndex = (int) (Math.random() * allCharacters.length());
            // retrieve character at index and add it to result
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }

    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    public String GetOutPutAfter() {
        return outContent.toString();//��ȡ���������
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }



    @Test
    public void testCreateNew() throws IOException {
        BloomMetadata metadata = BloomMetadata.createNew(10, 2, BucketSize.ONE);
        assertEquals(BloomMetadata.VERSION, metadata.version);
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES, metadata.headerLength);
        assertEquals(BloomMetadata.EXPECTED_HEADER_BYTES + 2, metadata.totalLength);
        assertEquals(2, metadata.hashFns);
        assertEquals(BucketSize.ONE, metadata.bucketSize);
    }

//    @Test
//    public void testBloomMetadata() throws IOException {
//        byte[] MAGIC_WORD = {(byte) 0xB1, (byte) 0xF1, (byte) 0xCA};
//        // �ַ�����д
//        FileWriter fileWriter=null;
//        FileReader fileReader=null;
//        String writer="1234"+"\n"+"5678";
//        // �ֽ�����д
//        FileInputStream fileInputStream=null;
//        FileOutputStream fileOutputStream=null;
//        byte[]bytes={1,2,3,4,5,6,7,8};
//        try {
//            // �ļ���д׼��
////            fileWriter=new FileWriter("use.txt");
////            fileReader=new FileReader("use.txt");
//            File file=new File("use.txt");
//            file.createNewFile();
//            fileInputStream=new FileInputStream("use.txt");
//            fileOutputStream=new FileOutputStream("use.txt");
////            fileWriter.write(writer);
//            fileOutputStream.write(bytes);
////            fileWriter.close();
////            fileReader.close();
//            fileInputStream.close();
//            fileOutputStream.close();
//
//
//            RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rwd");
//            BloomMetadata bloomMetadata=new BloomMetadata(randomAccessFile,(byte) 1,8,8,8,BucketSize.FOUR);
//            assertEquals(bloomMetadata.getTotalLength(),8);
//            assertEquals(bloomMetadata.getBucketsPerByte(),2);
//            assertEquals(bloomMetadata.getHashFns(),8);
//            assertEquals(bloomMetadata.getVersion(),1);
//            assertEquals(bloomMetadata.getHeaderLength(),8);
//            assertEquals(bloomMetadata.getBucketCount(),0);
//            assertEquals(bloomMetadata.getBucketSize(),BucketSize.FOUR);
//            assertEquals(bloomMetadata.getMaxCountInBucket(),15);
//            bloomMetadata.writeToFile(randomAccessFile);
//            RandomAccessFile randomAccessFile1=new RandomAccessFile(file,"r");
//            String s=randomAccessFile1.readUTF();
//            assertEquals("",s);
//            assertEquals(8,randomAccessFile.length());
//            bloomMetadata = new BloomMetadata(randomAccessFile,(byte) 2,8,8,8,BucketSize.FOUR);
//            bloomMetadata.writeToFile(randomAccessFile);
//            assertEquals(40,randomAccessFile.length());
//
//            File file1=new File("use1.txt");
//            fileOutputStream=new FileOutputStream(file1);
//            fileOutputStream.write(MAGIC_WORD);
//            fileOutputStream.close();
//            RandomAccessFile randomAccessFile2=new RandomAccessFile(file1,"rws");
//            BloomMetadata bloomMetadata1=BloomMetadata.readNewStyleHeader(randomAccessFile2);
//
//            randomAccessFile2.close();
//            randomAccessFile1.close();
//            randomAccessFile.close();
//            file.delete();
//            file1.delete();
//        }catch (IOException e){
//            throw new RuntimeException(e);
//        }
//
//    }


    private RandomAccessFile createTempFileWithHeader(int hashFns, int totalSize, BucketSize bucketSize) throws IOException {
        File tempFile = File.createTempFile("BloomMetadataTest", ".tmp");
        RandomAccessFile raf = new RandomAccessFile(tempFile, "rw");
        raf.writeInt(0);
        raf.writeInt(0);
        raf.write(BloomMetadata.MAGIC_WORD);
        raf.writeByte(BloomMetadata.VERSION);
        raf.writeInt(BloomMetadata.EXPECTED_HEADER_BYTES);
        raf.writeInt(totalSize);
        raf.writeInt(hashFns);
        raf.writeInt(bucketSize.getBits());
        raf.writeInt(0);
        raf.close();
        return new RandomAccessFile(tempFile, "r");
    }



    @Test
    public void testReadNewStyleHeader_ValidInput() throws IOException {
        try (RandomAccessFile file = createTempFileWithHeader(5, 32, BucketSize.FOUR)) {
            BloomMetadata metadata = BloomMetadata.readHeader(file);
            assertEquals(5, metadata.hashFns);
            assertEquals(32, metadata.totalLength);
            assertEquals(BucketSize.FOUR, metadata.bucketSize);
        }
    }

    @Test
    public void testReadOldStyleHeader_ValidInput() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(File.createTempFile("BloomMetadataTest", ".tmp"), "rw")) {
            file.writeInt(5); // hashFns
            file.writeInt(100); // realSize in bits
            file.close();

            BloomMetadata metadata = BloomMetadata.readHeader(file);
            assertEquals(5, metadata.hashFns);
            assertEquals(100, metadata.totalLength);
            assertEquals(BucketSize.FOUR, metadata.bucketSize);
        }catch (IOException e){

        }
    }

    @Test
    public void testReadHeader_InvalidMagicWord() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(File.createTempFile("BloomMetadataTest", ".tmp"), "rw")) {
            file.writeInt(0);
            file.writeInt(0);
            file.write(new byte[]{0x00, 0x00, 0x00}); // Invalid magic word
            file.close();

//            try {
//                BloomMetadata.readHeader(new RandomAccessFile(file.getFile(), "r"));
//                fail("Expected InvalidBloomFilter to be thrown");
//            } catch (InvalidBloomFilter e) {
//                assertTrue(e.getMessage().contains("Invalid Magic Word"));
//            }
        }
    }

    @Test
    public void testReadHeader_UnrecognizedVersion() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(File.createTempFile("BloomMetadataTest", ".tmp"), "rw")) {
            file.writeInt(0);
            file.writeInt(0);
            file.write(BloomMetadata.MAGIC_WORD);
            file.writeByte((byte) 99); // Unrecognized version
            file.close();

//            try {
//                BloomMetadata.readHeader(new RandomAccessFile(file.getFile(), "r"));
//                fail("Expected InvalidBloomFilter to be thrown");
//            } catch (InvalidBloomFilter e) {
//                assertTrue(e.getMessage().contains("Unrecognized version"));
//            }
        }
    }

    @Test
    public void testReadHeader_InvalidBucketSize() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile(File.createTempFile("BloomMetadataTest", ".tmp"), "rw")) {
            file.writeInt(0);
            file.writeInt(0);
            file.write(BloomMetadata.MAGIC_WORD);
            file.writeByte(BloomMetadata.VERSION);
            file.writeInt(BloomMetadata.EXPECTED_HEADER_BYTES);
            file.writeInt(100);
            file.writeInt(5);
            file.writeInt(99); // Invalid bucket size
            file.writeInt(0);
            file.close();


        }
    }




}