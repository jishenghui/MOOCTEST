package net.mooctest;

import java.util.*;
import java.math.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class RepeatedMurmurHashTest {

    private RepeatedMurmurHash hashFunction;
    private byte[] testInput;

    @Before
    public void setUp() {
        hashFunction = new RepeatedMurmurHash(3, 1000);
//        testInput = "Hello World!".getBytes();
    }

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
}
