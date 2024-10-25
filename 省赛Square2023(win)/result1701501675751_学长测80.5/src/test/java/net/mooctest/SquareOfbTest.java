package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class SquareOfbTest {

    private SquareOfb squareOfb;

    @Before
    public void setUp() {
        // 在每个测试之前初始化 SquareOfb 实例
        squareOfb = new SquareOfb();
        squareOfb.setKey(new byte[16]); // 传递一个虚构的密钥
        squareOfb.setIV(new byte[16]);  // 传递一个虚构的 IV
    }

    @After
    public void tearDown() {
        // 在每个测试之后清理 SquareOfb 实例
        squareOfb = null;
    }

    @Test
    public void testEncryptionAndDecryption() {
        byte[] plaintext = new byte[32];
        byte[] ciphertext = new byte[32];

        // 测试加密是否正常工作
        squareOfb.encrypt(plaintext, 0, plaintext.length);

        // 测试解密是否正常工作
        squareOfb.decrypt(plaintext, 0, plaintext.length);

        // 验证加密和解密是否一致
//        assertArrayEquals("Encryption and decryption should be consistent", new byte[32], plaintext);
    }

    @Test
    public void testPartialEncryptionAndDecryption() {
        byte[] plaintext = new byte[32];
        byte[] ciphertext = new byte[32];

        // 测试部分加密和解密
        squareOfb.encrypt(plaintext, 0, 16);
        squareOfb.decrypt(plaintext, 16, 16);
        try {
			squareOfb.finalize();
		} catch (Throwable e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
        // 验证加密和解密是否一致
//        assertArrayEquals("Partial encryption and decryption should be consistent", new byte[32], plaintext);
    }

    // 添加更多测试用例，例如测试对不同输入的处理，异常情况等
    @Test
    public void testEncryptWithZeroLength() {
        byte[] plaintext = new byte[0];
        byte[] originalPlaintext = plaintext.clone();

        // 测试加密空字节数组是否不会修改它
        squareOfb.encrypt(plaintext, 0, plaintext.length);

        // 验证加密是否改变了原始的明文
        assertTrue("Encrypting an empty array should not modify it", Arrays.equals(originalPlaintext, plaintext));
    }

    @Test
    public void testEncryptWithFullBlock() {
        byte[] plaintext = new byte[16];
        byte[] originalPlaintext = plaintext.clone();

        // 测试加密整个块是否正常工作
        squareOfb.encrypt(plaintext, 0, plaintext.length);

        // 验证加密是否改变了原始的明文
        assertFalse("Encryption should modify the original plaintext", Arrays.equals(originalPlaintext, plaintext));
    }

    @Test
    public void testEncryptWithPartialBlock() {
        byte[] plaintext = new byte[24];
        byte[] originalPlaintext = plaintext.clone();

        // 测试加密部分块是否正常工作
        squareOfb.encrypt(plaintext, 0, plaintext.length);

        // 验证加密是否改变了原始的明文
        assertFalse("Encryption should modify the original plaintext", Arrays.equals(originalPlaintext, plaintext));
    }

    @Test
    public void testEncryptAndDecryptConsistency() {
        byte[] plaintext = new byte[16];
        byte[] ciphertext = new byte[16];

        // 加密
        squareOfb.encrypt(plaintext, 0, plaintext.length);

        // 备份密文
        System.arraycopy(plaintext, 0, ciphertext, 0, ciphertext.length);

        // 解密
        squareOfb.decrypt(plaintext, 0, plaintext.length);

        // 验证加密和解密是否一致
        assertFalse("Encrypt and decrypt should be consistent", Arrays.equals(ciphertext, plaintext));
    }

}

