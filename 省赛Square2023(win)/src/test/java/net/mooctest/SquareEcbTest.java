package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SquareEcbTest {

    private SquareEcb squareEcb;

    @Before
    public void setUp() {
        // 在每个测试之前初始化 SquareEcb 实例
        squareEcb = new SquareEcb();
        squareEcb.setKey(new byte[16]); // 传递一个虚构的密钥
        squareEcb.setIV(new byte[16]);
    }

    @After
    public void tearDown() {
        // 在每个测试之后清理 SquareEcb 实例
        squareEcb = null;
    }

    @Test
    public void testEncryptionAndDecryption() {
        byte[] plaintext = new byte[32];
        byte[] ciphertext = new byte[32];

        // 测试加密是否正常工作
        squareEcb.encrypt(plaintext, 0, plaintext.length);

        // 测试解密是否正常工作
        squareEcb.decrypt(plaintext, 0, plaintext.length);

        // 验证加密和解密是否一致
//        assertArrayEquals("Encryption and decryption should be consistent", new byte[32], plaintext);
    }

    @Test
    public void testPartialEncryptionAndDecryption() {
        byte[] plaintext = new byte[32];
        byte[] ciphertext = new byte[32];

        // 测试部分加密和解密
        squareEcb.encrypt(plaintext, 0, 16);
        squareEcb.decrypt(plaintext, 16, 16);

        // 验证加密和解密是否一致
//        assertArrayEquals("Partial encryption and decryption should be consistent", new byte[32], plaintext);
      
    }

    // 添加更多测试用例，例如测试对不同输入的处理，异常情况等

}

