package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SquareTest {


    /**
     * 准备测试需要的key.
     */
    private byte[] key;
    /**
     * 加密字节码.
     */
    private byte[] plaintext;
    /*
     * 被加密字节码
     * */
    private byte[] ciphertext;
    /*
     * 准备类
     */
    private Square square;
    /*
     * 准备类
     */
    private SquareCbc squareCbc;
    /*
     * 准备类
     * */
    private SquareCfb squareCfb;
    /*
     * 准备类
     * */
    private SquareCfb squareCfb1;
    /*
     * 准备测试需要的key
     * */
    private byte[] key1;
    /*
     * 备用测试的iv
     * */
    private byte[] iv;
    /*
     * 准备被测对象
     * */
    private SquareCts squareCts;


    private SquareCts squareCts1;

    /**
     * @Param squareEcb 准备加密的squareEcb
     */
    private SquareEcb squareEcb;

    /**
     * @Param squareOfb 准备加密的squareOfb
     */
    private SquareOfb squareOfb;

    /**
     * @Param squareOfb1 准备备份解密的squareOfb1
     */
    private SquareOfb squareOfb1;

    @Before
    public void setUp() {
        key = "123456789abcdefg".getBytes();
        plaintext = "abcdefghijklmnop".getBytes();
        ciphertext = "shijiejujuelewo!".getBytes();
        square = new Square(key);
        squareCbc = new SquareCbc();
        squareCfb = new SquareCfb();
        key1 = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        iv = new byte[]{17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
        squareCfb1 = new SquareCfb();
        squareCts = new SquareCts();
        squareCts1 = new SquareCts();
        squareEcb = new SquareEcb();
        squareOfb = new SquareOfb();
        squareOfb1 = new SquareOfb();
    }


    /**
     * @Pure:encrypted 编码
     */
    @Test
    public void TestSquare() {
        byte[] encrypted = new byte[Square.BLOCK_LENGTH];
        byte[] decrypted = new byte[Square.BLOCK_LENGTH];

        square.blockEncrypt(plaintext, 0, encrypted, 0);
        square.blockDecrypt(encrypted, 0, decrypted, 0);

        assertArrayEquals("Decrypting encrypted data should return original data", plaintext, decrypted);

        try {
            square.finalize();
        } catch (Throwable e) {
            System.err.println("越界");
        }


    }


    @Test
    public void TestSquareCbc() {
        squareCbc.setKey(key);
        squareCbc.setIV(plaintext);
        byte[] b;
        b = Arrays.copyOf(ciphertext, 16);
        byte[] c;
        c = Arrays.copyOf(plaintext, 16); //key作为解密密钥
        squareCbc.encrypt(b, 0, Square.BLOCK_LENGTH);
        squareCbc.decrypt(c, 0, Square.BLOCK_LENGTH); //密钥解密
        squareCbc.decrypt(b, 0, Square.BLOCK_LENGTH);
        assertArrayEquals(ciphertext, b);

        try {
            squareCbc.finalize();
        } catch (Throwable e) {

        }
    }

    @Test
    public void TestSquareCfb() {
        squareCfb.setKey(key);
        squareCfb.setIV(plaintext);
        squareCfb1.setKey(key);
        squareCfb1.setIV(plaintext);

        byte[] a = Arrays.copyOf(ciphertext, 16);
        byte[] b = Arrays.copyOf(plaintext, 16);

        squareCfb.encrypt(a, 0, 16);
        squareCfb.decrypt(b, 0, 16);
        squareCfb.decrypt(a, 0, 16);
        assertArrayEquals(ciphertext, a);

        try {
            squareCfb.finalize();
        } catch (Throwable e) {

        }
    }

    @Test
    public void TestSquareCfb_1() {
        squareCfb.setKey(key);
        squareCfb.setIV(plaintext);
        squareCfb1.setKey(key);
        squareCfb1.setIV(plaintext);

        byte[] c = Arrays.copyOf(ciphertext, 16);
        byte[] d = Arrays.copyOf(ciphertext, 16);
        squareCfb.encrypt(c, 0, 8);
        squareCfb1.decrypt(c, 0, 8);
        assertArrayEquals(d, c);

    }

    @Test
    public void TestSquareCfb2() {
        squareCfb.setKey(key);
        squareCfb.setIV(plaintext);
        squareCfb1.setKey(key);
        squareCfb1.setIV(plaintext);

        byte[] c = "jishenghuitianxiawudiaaa".getBytes();
        byte[] d = "jishenghuitianxiawudiaaa".getBytes();
        squareCfb.encrypt(c, 0, 20);
        squareCfb1.decrypt(c, 0, 20);
        assertArrayEquals(d, c);
        squareCfb.encrypt(c, 0, 8);
        squareCfb1.decrypt(c, 0, 8);
        assertArrayEquals(d, c);

    }

    @Test
    public void TestSquareCfb3() {
        squareCfb.setKey(key);
        squareCfb.setIV(plaintext);
        squareCfb1.setKey(key);
        squareCfb1.setIV(plaintext);

        byte[] c = "jishenghuitianxiawudiaaa".getBytes();
        byte[] d = "jishenghuitianxiawudiaaa".getBytes();
        squareCfb.encrypt(c, 0, 20);
        squareCfb1.decrypt(c, 0, 20);
        assertArrayEquals(d, c);
        squareCfb.encrypt(c, 0, 16);
        squareCfb1.decrypt(c, 0, 16);
        assertArrayEquals(d, c);
    }


    @Test
    public void TestSquareCts() {
        squareCts.setKey(key);
        squareCts.setIV(plaintext);
        squareCts1.setKey(key);
        squareCts1.setIV(plaintext);

        byte[] a = Arrays.copyOf(ciphertext, 16);
        byte[] b = Arrays.copyOf(ciphertext, 16);

        squareCts.encrypt(a, 0, 16);
        squareCts1.decrypt(a, 0, 16);
        assertArrayEquals(b, a);

        try {
            squareCts.finalize();
        } catch (Throwable e) {

        }
    }

    @Test(timeout = 1000)
    public void TestSquareCts1() {
        try {
            squareCts.setKey(key);
            squareCts.setIV(plaintext);
            byte[] a = Arrays.copyOf(ciphertext, 16);
            squareCts.encrypt(a, 0, 8);
            assertArrayEquals(a, Arrays.copyOf(ciphertext, 16));
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
        }

    }

    @Test(timeout = 1000)
    public void TestSquareCts2() {
        try {
            squareCts.setKey(key);
            squareCts.setIV(plaintext);
            byte[] a = Arrays.copyOf(ciphertext, 16);
            squareCts.decrypt(a, 0, 8);
            assertArrayEquals(a, Arrays.copyOf(ciphertext, 16));
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
        }

    }

    @Test
    public void TestSquareCts3() {
        squareCts.setKey(key);
        squareCts.setIV(plaintext);
        squareCts1.setKey(key);
        squareCts1.setIV(plaintext);

        byte[] a = "jishenghuitianxiawudijishenghuitianxiawudi".getBytes();
        byte[] b = "jishenghuitianxiawudijishenghuitianxiawudi".getBytes();

        squareCts.encrypt(a, 0, 40);
        squareCts1.decrypt(a, 0, 40);
        assertArrayEquals(b, a);

    }

    @Test
    public void TestSquareEcb() {
        squareEcb.setKey(key);
        squareEcb.setIV(plaintext);
        byte[] e = Arrays.copyOf(ciphertext, 16);
        byte[] a = "jishenghuitianxiawudijishenghuitianxiawudi".getBytes();
        byte[] b = "jishenghuitianxiawudijishenghuitianxiawudi".getBytes();
        byte[] c = "jishenghuitianxiawudijishenghuitianxiawudi".getBytes();
        squareEcb.encrypt(e, 0, 16);
        squareEcb.decrypt(e, 0, 16);
        squareEcb.encrypt(a, 0, 8);
        squareEcb.decrypt(a, 0, 8);
        squareEcb.encrypt(b, 0, 24);
        squareEcb.decrypt(b, 0, 24);
        assertArrayEquals(ciphertext, e);
        assertArrayEquals(c, a);
        assertArrayEquals(c, b);
    }

    @Test
    public void TestSquareOfb() {
        squareOfb.setKey(key);
        squareOfb.setIV(plaintext);
        squareOfb1.setKey(key);
        squareOfb1.setIV(plaintext);

        byte[] a = Arrays.copyOf(ciphertext, 16);

        squareOfb.encrypt(a, 0, 16);
        squareOfb1.decrypt(a, 0, 16);
        assertArrayEquals(ciphertext, a);

        try {
            squareOfb.finalize();
        } catch (Throwable e) {

        }
    }

    @Test
    public void TestSquareOfbW() {
        squareOfb.setKey(key);
        squareOfb.setIV(plaintext);

        byte[] a = Arrays.copyOf(ciphertext, 16);

        squareOfb.encrypt(a, 0, 16);
        squareOfb.setIV(plaintext);
        squareOfb.decrypt(a, 0, 16);
        assertArrayEquals(ciphertext, a);

    }

    @Test
    public void TestSquareOfbOut() {
        squareOfb.setKey(key);
        squareOfb.setIV(plaintext);

        byte[] a = "jishenghuitianxiawudijishenghuitianxiawudi".getBytes();
        byte[] c = "jishenghuitianxiawudijishenghuitianxiawudi".getBytes();

        squareOfb.encrypt(a, 0, 20);
        squareOfb.encrypt(a, 0, 16);
        squareOfb.encrypt(a, 0, 8);
        squareOfb.setIV(plaintext);
        squareOfb.decrypt(a, 0, 20);
        squareOfb.decrypt(a, 0, 16);
        squareOfb.decrypt(a, 0, 8);
        assertArrayEquals(c, a);

    }

}
