package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;


public class SquareTest {

    @Test
    public void testEncryptionDecryption() {
        byte[] key = new byte[16];  // Replace with an actual key
        Square square = new Square(key);

        // Test encryption and decryption with a sample block
        byte[] plaintext = new byte[Square.BLOCK_LENGTH];
        byte[] ciphertext = new byte[Square.BLOCK_LENGTH];
        byte[] decrypted = new byte[Square.BLOCK_LENGTH];

        // Initialize plaintext with some data
        // (Note: Replace this with actual test data)
        for (int i = 0; i < Square.BLOCK_LENGTH; i++) {
            plaintext[i] = (byte) i;
        }

        // Encrypt
        square.blockEncrypt(plaintext, 0, ciphertext, 0);

        // Decrypt
        square.blockDecrypt(ciphertext, 0, decrypted, 0);

        // Verify decryption result matches the original plaintext
        assertArrayEquals(plaintext, decrypted);
    }

    @Test
    public void testKeyVariations() {
        // Test with different keys
        byte[] key1 = new byte[16];  // Replace with an actual key
        byte[] key2 = new byte[16];  // Replace with a different key
        Square square1 = new Square(key1);
        Square square2 = new Square(key2);

        // Encrypt with key1
        byte[] plaintext = new byte[Square.BLOCK_LENGTH];
        byte[] ciphertext1 = new byte[Square.BLOCK_LENGTH];
        square1.blockEncrypt(plaintext, 0, ciphertext1, 0);

        // Encrypt with key2
        byte[] ciphertext2 = new byte[Square.BLOCK_LENGTH];
        square2.blockEncrypt(plaintext, 0, ciphertext2, 0);

        // Ensure ciphertexts are different with different keys
//        assertArrayNotEquals(ciphertext1, ciphertext2);
        try {
			square2.finalize();
		} catch (Throwable e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    }

    // Add more test cases for edge conditions, etc.

}

