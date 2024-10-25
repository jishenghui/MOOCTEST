package net.mooctest;

import org.junit.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.atomic.*;
import java.util.*;

import static org.junit.Assert.*;

public class BloomFilterTest {

    private File testFile;
    private BloomFilter bloomFilter;

    @Before
    public void setUp() throws IOException {
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
}
