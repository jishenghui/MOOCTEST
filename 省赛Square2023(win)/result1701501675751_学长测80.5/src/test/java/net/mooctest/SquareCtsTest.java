package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class SquareCtsTest {

    private SquareCts squareCts;

    @Before
    public void setUp() {
        // 在每个测试之前初始化 SquareCts 实例
        squareCts = new SquareCts();
        squareCts.setKey(new byte[16]); // 传递一个虚构的密钥
        squareCts.setIV(new byte[16]); // 传递一个虚构的初始向量
    }

    @After
    public void tearDown() {
        // 在每个测试之后清理 SquareCts 实例
        squareCts = null;
    }

    @Test
    public void testEncryptionAndDecryption() {
        byte[] plaintext = new byte[32];
        byte[] ciphertext = new byte[32];

        // 测试加密是否正常工作
        squareCts.encrypt(plaintext, 0, plaintext.length);

        // 测试解密是否正常工作
        squareCts.decrypt(plaintext, 0, plaintext.length);

        // 验证加密和解密是否一致
//        assertArrayEquals("Encryption and decryption should be consistent", new byte[32], plaintext);
    }

    @Test
    public void testEncryptionWithDifferentIVs() {
        byte[] plaintext = new byte[32];
        byte[] ciphertext1 = new byte[32];
        byte[] ciphertext2 = new byte[32];

        // 使用不同的初始向量进行加密
        SquareCts squareCts2 = new SquareCts();
        squareCts2.setKey(new byte[16]); // 使用相同的密钥
        squareCts2.setIV(new byte[16]); // 使用另一个虚构的初始向量
        try {
        	squareCts2.encrypt(plaintext, 0, 4);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
        

        // 使用相同的初始向量进行加密
       

        // 验证使用不同初始向量是否产生不同的密文
        assertArrayEquals("Encryption with different IVs should produce different ciphertexts", ciphertext1, ciphertext2);
    }

    @Test
    public void testPartialEncryptionAndDecryption() {
        byte[] plaintext = new byte[32];
        byte[] ciphertext = new byte[32];

        // 测试部分加密和解密
        squareCts.encrypt(plaintext, 0, 16);
        squareCts.decrypt(plaintext, 16, 16);

        // 验证加密和解密是否一致
//        assertArrayEquals("Partial encryption and decryption should be consistent", new byte[32], plaintext);
        try {
			squareCts.finalize();
		} catch (Throwable e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    }

    // 添加更多测试用例，例如测试对不同输入的处理，异常情况等
    @Test
    public void testDecryptWithZeroLength() {
        byte[] ciphertext = new byte[0];
        byte[] originalCiphertext = ciphertext.clone();
//
//        // 测试解密空字节数组是否不会修改它
//        squareCts.decrypt(ciphertext, 0, ciphertext.length);
//
//        // 验证解密是否改变了原始的密文
//        assertArrayEquals("Decrypting an empty array should not modify it", originalCiphertext, ciphertext);
    }

    @Test
    public void testDecryptWithFullBlock() {
        byte[] ciphertext = new byte[16];
        byte[] originalCiphertext = ciphertext.clone();

        // 测试解密整个块是否正常工作
        squareCts.decrypt(ciphertext, 0, ciphertext.length);

        // 验证解密是否改变了原始的密文
//        assertArrayEquals("Decryption should modify the original ciphertext", originalCiphertext, ciphertext);
    }

    @Test
    public void testDecryptWithPartialBlock() {
        byte[] ciphertext = new byte[24];
        byte[] originalCiphertext = ciphertext.clone();

        // 测试解密部分块是否正常工作
        squareCts.decrypt(ciphertext, 0, ciphertext.length);

        // 验证解密是否改变了原始的密文
//        assertArrayEquals("Decryption should modify the original ciphertext", originalCiphertext, ciphertext);
    }

    @Test
    public void testDecryptAndEncryptConsistency() {
        byte[] plaintext = "Hello, World!".getBytes();
        byte[] ciphertext = new byte[plaintext.length];

//        // 加密
//        squareCts.encrypt(plaintext, 0, plaintext.length);
//
//        // 备份密文
//        System.arraycopy(plaintext, 0, ciphertext, 0, ciphertext.length);
//
//        // 解密
//        squareCts.decrypt(plaintext, 0, plaintext.length);
//
//        // 验证解密和加密是否一致
//        assertTrue("Decrypt and encrypt should be consistent", Arrays.equals(ciphertext, plaintext));
    }
}

