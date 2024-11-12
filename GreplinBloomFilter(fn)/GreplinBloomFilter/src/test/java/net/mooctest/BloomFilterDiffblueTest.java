package net.mooctest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import net.mooctest.BloomFilter.NewBuilder;
import net.mooctest.BloomFilter.OpenBuilder;

import org.junit.Ignore;

import org.junit.Rule;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BloomFilterDiffblueTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Test NewBuilder {@link NewBuilder#NewBuilder(File, int, double)}.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link BloomFilter.NewBuilder#NewBuilder(File, int, double)}
     *   <li>{@link BloomFilter.NewBuilder#allocator(Allocator)}
     *   <li>{@link BloomFilter.NewBuilder#bucketSize(BucketSize)}
     *   <li>{@link BloomFilter.NewBuilder#closeCallback(CloseCallback)}
     *   <li>{@link BloomFilter.NewBuilder#force(boolean)}
     *   <li>{@link BloomFilter.NewBuilder#seekThreshold(int)}
     * </ul>
     */
    @Test
    public void testNewBuilderNewNewBuilder() {
        // Arrange and Act
        BloomFilter.NewBuilder actualAllocatorResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR);
        BloomFilter.NewBuilder actualBucketSizeResult = actualAllocatorResult.bucketSize(BucketSize.ONE);
        BloomFilter.NewBuilder actualCloseCallbackResult = actualBucketSizeResult
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK);
        BloomFilter.NewBuilder actualForceResult = actualCloseCallbackResult.force(true);
        BloomFilter.NewBuilder actualSeekThresholdResult = actualForceResult.seekThreshold(1);

        // Assert
        File file = actualAllocatorResult.f;
        assertEquals("test.txt", file.getName());
        File file2 = actualBucketSizeResult.f;
        assertEquals("test.txt", file2.getName());
        File file3 = actualCloseCallbackResult.f;
        assertEquals("test.txt", file3.getName());
        File file4 = actualForceResult.f;
        assertEquals("test.txt", file4.getName());
        assertTrue(file.isAbsolute());
        assertTrue(file2.isAbsolute());
        assertTrue(file3.isAbsolute());
        assertTrue(file4.isAbsolute());
        assertSame(actualForceResult, actualSeekThresholdResult);
    }

    /**
     * Test NewBuilder {@link NewBuilder#NewBuilder(File, int, double)}.
     * <p>
     * Method under test:
     * {@link BloomFilter.NewBuilder#NewBuilder(File, int, double)}
     */
    @Test
    public void testNewBuilderNewNewBuilder2() {
        // Arrange and Act
        BloomFilter.NewBuilder actualNewBuilder = new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d);

        // Assert
        File file = actualNewBuilder.f;
        assertEquals("test.txt", file.getName());
        assertEquals(0, actualNewBuilder.hashFns);
        assertEquals(0, actualNewBuilder.totalLength);
        assertEquals(10.0d, actualNewBuilder.falsePositiveRate, 0.0);
        assertEquals(1000, actualNewBuilder.numberOfItems);
        assertEquals(BucketSize.FOUR, actualNewBuilder.bucketSize);
        assertFalse(actualNewBuilder.force);
        assertTrue(file.isAbsolute());
        assertEquals(BloomFilter.DEFAULT_SEEK_THRESHOLD, actualNewBuilder.seekThreshold);
    }

    /**
     * Test NewBuilder {@link NewBuilder#NewBuilder(File, int, double, int, int)}.
     * <p>
     * Method under test:
     * {@link BloomFilter.NewBuilder#NewBuilder(File, int, double, int, int)}
     */
    @Test
    public void testNewBuilderNewNewBuilder3() {
        // Arrange and Act
        BloomFilter.NewBuilder actualNewBuilder = new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d, 3, 19088743);

        // Assert
        File file = actualNewBuilder.f;
        assertEquals("test.txt", file.getName());
        assertEquals(10.0d, actualNewBuilder.falsePositiveRate, 0.0);
        assertEquals(1000, actualNewBuilder.numberOfItems);
        assertEquals(19088743, actualNewBuilder.hashFns);
        assertEquals(3, actualNewBuilder.totalLength);
        assertEquals(BucketSize.FOUR, actualNewBuilder.bucketSize);
        assertFalse(actualNewBuilder.force);
        assertTrue(file.isAbsolute());
        assertEquals(BloomFilter.DEFAULT_SEEK_THRESHOLD, actualNewBuilder.seekThreshold);
    }

    /**
     * Test OpenBuilder {@link OpenBuilder#OpenBuilder(File)}.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link BloomFilter.OpenBuilder#OpenBuilder(File)}
     *   <li>{@link BloomFilter.OpenBuilder#allocator(Allocator)}
     *   <li>{@link BloomFilter.OpenBuilder#closeCallback(CloseCallback)}
     *   <li>{@link BloomFilter.OpenBuilder#seekThreshold(int)}
     * </ul>
     */
    @Test
    public void testOpenBuilderNewOpenBuilder() {
        // Arrange and Act
        BloomFilter.OpenBuilder actualAllocatorResult = (new BloomFilter.OpenBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile())).allocator(BloomFilter.DEFAULT_ALLOCATOR);
        BloomFilter.OpenBuilder actualCloseCallbackResult = actualAllocatorResult
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK);
        BloomFilter.OpenBuilder actualSeekThresholdResult = actualCloseCallbackResult.seekThreshold(1);

        // Assert
        File file = actualAllocatorResult.f;
        assertEquals("test.txt", file.getName());
        File file2 = actualCloseCallbackResult.f;
        assertEquals("test.txt", file2.getName());
        assertTrue(file.isAbsolute());
        assertTrue(file2.isAbsolute());
        assertSame(actualCloseCallbackResult, actualSeekThresholdResult);
    }

    /**
     * Test {@link BloomFilter#openExisting(File)}.
     * <p>
     * Method under test: {@link BloomFilter#openExisting(File)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testOpenExisting() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        BloomFilter.openExisting(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile());
    }

    /**
     * Test {@link BloomFilter#createOptimal(File, int, double, boolean)}.
     * <p>
     * Method under test:
     * {@link BloomFilter#createOptimal(File, int, double, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCreateOptimal() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.io.FileNotFoundException: C:\Users\JSH.HP\AppData\Local\Temp\Invalid number of hashFns (\ bytes) (系统找不到指定的路径。)
        //       at java.base/java.io.RandomAccessFile.open0(Native Method)
        //       at java.base/java.io.RandomAccessFile.open(RandomAccessFile.java:346)
        //       at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:260)
        //       at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:214)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:557)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //       at net.mooctest.BloomFilter.createOptimal(BloomFilter.java:175)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        BloomFilter.createOptimal(
                Paths.get(System.getProperty("java.io.tmpdir"), "Invalid number of hashFns (", " bytes)").toFile(), 1000, 0.5d,
                true);
    }

    /**
     * Test {@link BloomFilter#createOptimal(File, int, double, boolean)}.
     * <ul>
     *   <li>When {@code false}.</li>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#createOptimal(File, int, double, boolean)}
     */
    @Test
    public void testCreateOptimal_whenFalse_thenThrowIllegalArgumentException() throws IOException {
        // Arrange, Act and Assert
        thrown.expect(IllegalArgumentException.class);
        BloomFilter.createOptimal(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 0.5d, false);
    }

    /**
     * Test {@link BloomFilter#createOptimal(File, int, double, boolean)}.
     * <ul>
     *   <li>When minus three.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#createOptimal(File, int, double, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCreateOptimal_whenMinusThree() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Impossibly short size (30 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:105)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //       at net.mooctest.BloomFilter.createOptimal(BloomFilter.java:175)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        BloomFilter.createOptimal(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), -3, 0.5d, true);
    }

    /**
     * Test {@link BloomFilter#createOptimal(File, int, double, boolean)}.
     * <ul>
     *   <li>When one thousand.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#createOptimal(File, int, double, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCreateOptimal_whenOneThousand() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'delete').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        BloomFilter.createOptimal(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 0.5d, true);
    }

    /**
     * Test {@link BloomFilter#createOptimal(File, int, double, boolean)}.
     * <ul>
     *   <li>When ten.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#createOptimal(File, int, double, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCreateOptimal_whenTen() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //       at net.mooctest.BloomFilter.createOptimal(BloomFilter.java:175)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        BloomFilter.createOptimal(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d, true);
    }

    /**
     * Test {@link BloomFilter#createOptimal(File, int, double, boolean)}.
     * <ul>
     *   <li>When ten.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#createOptimal(File, int, double, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCreateOptimal_whenTen2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //       at net.mooctest.BloomFilter.createOptimal(BloomFilter.java:175)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        BloomFilter.createOptimal(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 10, 10.0d, true);
    }

    /**
     * Test {@link BloomFilter#calculateOptimalBucketCount(int, double)}.
     * <ul>
     *   <li>When one thousand.</li>
     *   <li>Then return {@code -4792}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalBucketCount(int, double)}
     */
    @Test
    public void testCalculateOptimalBucketCount_whenOneThousand_thenReturn4792() {
        // Arrange, Act and Assert
        assertEquals(-4792, BloomFilter.calculateOptimalBucketCount(1000, 10.0d));
    }

    /**
     * Test {@link BloomFilter#calculateOptimalBucketCount(int, double)}.
     * <ul>
     *   <li>When one.</li>
     *   <li>Then return minus four.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalBucketCount(int, double)}
     */
    @Test
    public void testCalculateOptimalBucketCount_whenOne_thenReturnMinusFour() {
        // Arrange, Act and Assert
        assertEquals(-4, BloomFilter.calculateOptimalBucketCount(1, 10.0d));
    }

    /**
     * Test {@link BloomFilter#calculateOptimalBucketCount(int, double)}.
     * <ul>
     *   <li>When ten.</li>
     *   <li>Then return minus forty-seven.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalBucketCount(int, double)}
     */
    @Test
    public void testCalculateOptimalBucketCount_whenTen_thenReturnMinusFortySeven() {
        // Arrange, Act and Assert
        assertEquals(-47, BloomFilter.calculateOptimalBucketCount(10, 10.0d));
    }

    /**
     * Test {@link BloomFilter#calculateOptimalBucketCount(int, double)}.
     * <ul>
     *   <li>When three.</li>
     *   <li>Then return minus fourteen.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalBucketCount(int, double)}
     */
    @Test
    public void testCalculateOptimalBucketCount_whenThree_thenReturnMinusFourteen() {
        // Arrange, Act and Assert
        assertEquals(-14, BloomFilter.calculateOptimalBucketCount(3, 10.0d));
    }

    /**
     * Test {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}.
     * <ul>
     *   <li>When {@code 19088743}.</li>
     *   <li>Then return zero.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}
     */
    @Test
    public void testCalculateOptimalHashFunctionCount_when19088743_thenReturnZero() {
        // Arrange, Act and Assert
        assertEquals(0, BloomFilter.calculateOptimalHashFunctionCount(19088743, 3));
    }

    /**
     * Test {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}.
     * <ul>
     *   <li>When one thousand.</li>
     *   <li>Then return zero.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}
     */
    @Test
    public void testCalculateOptimalHashFunctionCount_whenOneThousand_thenReturnZero() {
        // Arrange, Act and Assert
        assertEquals(0, BloomFilter.calculateOptimalHashFunctionCount(1000, 3));
    }

    /**
     * Test {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}.
     * <ul>
     *   <li>When ten.</li>
     *   <li>Then return zero.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}
     */
    @Test
    public void testCalculateOptimalHashFunctionCount_whenTen_thenReturnZero() {
        // Arrange, Act and Assert
        assertEquals(0, BloomFilter.calculateOptimalHashFunctionCount(10, 3));
    }

    /**
     * Test {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}.
     * <ul>
     *   <li>When three.</li>
     *   <li>Then return one.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#calculateOptimalHashFunctionCount(int, int)}
     */
    @Test
    public void testCalculateOptimalHashFunctionCount_whenThree_thenReturnOne() {
        // Arrange, Act and Assert
        assertEquals(1, BloomFilter.calculateOptimalHashFunctionCount(3, 3));
    }

    /**
     * Test {@link BloomFilter#clear()}.
     * <p>
     * Method under test: {@link BloomFilter#clear()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClear() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).clear();
    }

    /**
     * Test {@link BloomFilter#clear()}.
     * <p>
     * Method under test: {@link BloomFilter#clear()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClear2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.clear();
    }

    /**
     * Test {@link BloomFilter#clear()}.
     * <p>
     * Method under test: {@link BloomFilter#clear()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClear3() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.open = false;

        // Act
        bloomFilter.clear();
    }

    /**
     * Test {@link BloomFilter#clear()}.
     * <p>
     * Method under test: {@link BloomFilter#clear()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClear4() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.open = false;

        // Act
        buildResult.clear();
    }

    /**
     * Test {@link BloomFilter#add(byte[])}.
     * <p>
     * Method under test: {@link BloomFilter#add(byte[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAdd() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

        // Act
        bloomFilter.add("AXAXAXAX".getBytes("UTF-8"));
    }

    /**
     * Test {@link BloomFilter#add(byte[])}.
     * <p>
     * Method under test: {@link BloomFilter#add(byte[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testAdd2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.add("AXAXAXAX".getBytes("UTF-8"));
    }

    /**
     * Test {@link BloomFilter#remove(byte[])}.
     * <p>
     * Method under test: {@link BloomFilter#remove(byte[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRemove() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

        // Act
        bloomFilter.remove("AXAXAXAX".getBytes("UTF-8"));
    }

    /**
     * Test {@link BloomFilter#remove(byte[])}.
     * <p>
     * Method under test: {@link BloomFilter#remove(byte[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testRemove2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.remove("AXAXAXAX".getBytes("UTF-8"));
    }

    /**
     * Test {@link BloomFilter#contains(byte[])}.
     * <p>
     * Method under test: {@link BloomFilter#contains(byte[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testContains() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

        // Act
        bloomFilter.contains("AXAXAXAX".getBytes("UTF-8"));
    }

    /**
     * Test {@link BloomFilter#contains(byte[])}.
     * <p>
     * Method under test: {@link BloomFilter#contains(byte[])}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testContains2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.contains("AXAXAXAX".getBytes("UTF-8"));
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush3() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = null;
        bloomFilter.file = null;

        // Act
        bloomFilter.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush4() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = null;
        bloomFilter.file = new RandomAccessFile("foo", "foo");

        // Act
        bloomFilter.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush5() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = new HashMap<>();
        bloomFilter.file = null;

        // Act
        bloomFilter.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush6() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = new HashMap<>();
        bloomFilter.file = new RandomAccessFile("foo", "foo");

        // Act
        bloomFilter.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush7() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = null;
        buildResult.file = null;

        // Act
        buildResult.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush8() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = null;
        buildResult.file = new RandomAccessFile("foo", "foo");

        // Act
        buildResult.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush9() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = new HashMap<>();
        buildResult.file = null;

        // Act
        buildResult.flush();
    }

    /**
     * Test {@link BloomFilter#flush()}.
     * <p>
     * Method under test: {@link BloomFilter#flush()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlush10() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = new HashMap<>();
        buildResult.file = new RandomAccessFile("foo", "foo");

        // Act
        buildResult.flush();
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).flush(true);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.flush(true);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean3() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = null;
        bloomFilter.file = null;

        // Act
        bloomFilter.flush(false);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean4() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = null;
        bloomFilter.file = new RandomAccessFile("foo", "foo");

        // Act
        bloomFilter.flush(false);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean5() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = new HashMap<>();
        bloomFilter.file = null;

        // Act
        bloomFilter.flush(false);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean6() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.cacheDirty = false;
        bloomFilter.unflushedChanges = new HashMap<>();
        bloomFilter.file = new RandomAccessFile("foo", "foo");

        // Act
        bloomFilter.flush(false);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean7() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = null;
        buildResult.file = null;

        // Act
        buildResult.flush(false);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean8() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = null;
        buildResult.file = new RandomAccessFile("foo", "foo");

        // Act
        buildResult.flush(false);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean9() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = new HashMap<>();
        buildResult.file = null;

        // Act
        buildResult.flush(false);
    }

    /**
     * Test {@link BloomFilter#flush(boolean)} with {@code boolean}.
     * <p>
     * Method under test: {@link BloomFilter#flush(boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFlushWithBoolean10() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.cacheDirty = false;
        buildResult.unflushedChanges = new HashMap<>();
        buildResult.file = new RandomAccessFile("foo", "foo");

        // Act
        buildResult.flush(false);
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).close();
    }

    /**
     * Test {@link BloomFilter#unflushedChanges()}.
     * <p>
     * Method under test: {@link BloomFilter#unflushedChanges()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testUnflushedChanges() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).unflushedChanges();
    }

    /**
     * Test {@link BloomFilter#unflushedChanges()}.
     * <p>
     * Method under test: {@link BloomFilter#unflushedChanges()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testUnflushedChanges2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.unflushedChanges();
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose10() throws IOException {
        try (BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build()) {
            buildResult.open = false;
            buildResult.file = new RandomAccessFile("foo", "foo");
            buildResult.cacheDirty = false;
            buildResult.unflushedChanges = new HashMap<>();
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose9() throws IOException {
        try (BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build()) {
            buildResult.open = false;
            buildResult.file = new RandomAccessFile("foo", "foo");
            buildResult.cacheDirty = false;
            buildResult.unflushedChanges = null;
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose8() throws IOException {
        try (BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build()) {
            buildResult.open = false;
            buildResult.file = null;
            buildResult.cacheDirty = false;
            buildResult.unflushedChanges = new HashMap<>();
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose7() throws IOException {
        try (BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build()) {
            buildResult.open = false;
            buildResult.file = null;
            buildResult.cacheDirty = false;
            buildResult.unflushedChanges = null;
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose6() throws IOException {
        try (BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                1, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)) {
            bloomFilter.open = false;
            bloomFilter.file = new RandomAccessFile("foo", "foo");
            bloomFilter.cacheDirty = false;
            bloomFilter.unflushedChanges = new HashMap<>();
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose5() throws IOException {
        try (BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                1, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)) {
            bloomFilter.open = false;
            bloomFilter.file = new RandomAccessFile("foo", "foo");
            bloomFilter.cacheDirty = false;
            bloomFilter.unflushedChanges = null;
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose4() throws IOException {
        try (BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                1, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)) {
            bloomFilter.open = false;
            bloomFilter.file = null;
            bloomFilter.cacheDirty = false;
            bloomFilter.unflushedChanges = new HashMap<>();
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose3() throws IOException {
        try (BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                1, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)) {
            bloomFilter.open = false;
            bloomFilter.file = null;
            bloomFilter.cacheDirty = false;
            bloomFilter.unflushedChanges = null;
        }
    }

    /**
     * Test {@link BloomFilter#close()}.
     * <p>
     * Method under test: {@link BloomFilter#close()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testClose2() throws IOException {
        try (BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build()) {
        }
    }

    /**
     * Test {@link BloomFilter#capacity(double)}.
     * <p>
     * Method under test: {@link BloomFilter#capacity(double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCapacity() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).capacity(10.0d);
    }

    /**
     * Test {@link BloomFilter#capacity(double)}.
     * <p>
     * Method under test: {@link BloomFilter#capacity(double)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCapacity2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.capacity(10.0d);
    }

    /**
     * Test {@link BloomFilter#checkIfOpen()}.
     * <p>
     * Method under test: {@link BloomFilter#checkIfOpen()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCheckIfOpen() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).checkIfOpen();
    }

    /**
     * Test {@link BloomFilter#checkIfOpen()}.
     * <p>
     * Method under test: {@link BloomFilter#checkIfOpen()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCheckIfOpen2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.checkIfOpen();
    }

    /**
     * Test {@link BloomFilter#checkIfOpen()}.
     * <p>
     * Method under test: {@link BloomFilter#checkIfOpen()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCheckIfOpen3() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.open = false;

        // Act
        bloomFilter.checkIfOpen();
    }

    /**
     * Test {@link BloomFilter#checkIfOpen()}.
     * <p>
     * Method under test: {@link BloomFilter#checkIfOpen()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testCheckIfOpen4() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.open = false;

        // Act
        buildResult.checkIfOpen();
    }

    /**
     * Test {@link BloomFilter#setByte(int, byte)}.
     * <p>
     * Method under test: {@link BloomFilter#setByte(int, byte)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetByte() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).setByte(1, (byte) 'A');
    }

    /**
     * Test {@link BloomFilter#setByte(int, byte)}.
     * <p>
     * Method under test: {@link BloomFilter#setByte(int, byte)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetByte2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.setByte(1, (byte) 'A');
    }

    /**
     * Test {@link BloomFilter#setByte(int, byte)}.
     * <p>
     * Method under test: {@link BloomFilter#setByte(int, byte)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetByte3() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.unflushedChanges = null;

        // Act
        bloomFilter.setByte(1, (byte) 'A');
    }

    /**
     * Test {@link BloomFilter#setByte(int, byte)}.
     * <p>
     * Method under test: {@link BloomFilter#setByte(int, byte)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetByte4() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.unflushedChanges = new HashMap<>();

        // Act
        bloomFilter.setByte(1, (byte) 'A');
    }

    /**
     * Test {@link BloomFilter#setByte(int, byte)}.
     * <p>
     * Method under test: {@link BloomFilter#setByte(int, byte)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetByte5() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.unflushedChanges = null;

        // Act
        buildResult.setByte(1, (byte) 'A');
    }

    /**
     * Test {@link BloomFilter#setByte(int, byte)}.
     * <p>
     * Method under test: {@link BloomFilter#setByte(int, byte)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetByte6() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.unflushedChanges = new HashMap<>();

        // Act
        buildResult.setByte(1, (byte) 'A');
    }

    /**
     * Test {@link BloomFilter#getBucketAt(byte, int, int)}.
     * <ul>
     *   <li>When {@link Integer#MIN_VALUE}.</li>
     *   <li>Then return {@code A}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#getBucketAt(byte, int, int)}
     */
    @Test
    public void testGetBucketAt_whenMin_value_thenReturnA() {
        // Arrange, Act and Assert
        assertEquals('A', BloomFilter.getBucketAt((byte) 'A', Integer.MIN_VALUE, 8));
    }

    /**
     * Test {@link BloomFilter#getBucketAt(byte, int, int)}.
     * <ul>
     *   <li>When minus one.</li>
     *   <li>Then return space.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#getBucketAt(byte, int, int)}
     */
    @Test
    public void testGetBucketAt_whenMinusOne_thenReturnSpace() {
        // Arrange, Act and Assert
        assertEquals(' ', BloomFilter.getBucketAt((byte) 'A', -1, 8));
    }

    /**
     * Test {@link BloomFilter#getBucketAt(byte, int, int)}.
     * <ul>
     *   <li>When two.</li>
     *   <li>Then return zero.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#getBucketAt(byte, int, int)}
     */
    @Test
    public void testGetBucketAt_whenTwo_thenReturnZero() {
        // Arrange, Act and Assert
        assertEquals((byte) 0, BloomFilter.getBucketAt((byte) 'A', 2, 3));
    }

    /**
     * Test {@link BloomFilter#getBucketAt(byte, int, int)}.
     * <ul>
     *   <li>When zero.</li>
     *   <li>Then return {@code A}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#getBucketAt(byte, int, int)}
     */
    @Test
    public void testGetBucketAt_whenZero_thenReturnA() {
        // Arrange, Act and Assert
        assertEquals('A', BloomFilter.getBucketAt((byte) 'A', 0, 8));
    }

    /**
     * Test {@link BloomFilter#putBucketAt(byte, int, int, byte)}.
     * <ul>
     *   <li>When five.</li>
     *   <li>Then return {@code i}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#putBucketAt(byte, int, int, byte)}
     */
    @Test
    public void testPutBucketAt_whenFive_thenReturnI() {
        // Arrange, Act and Assert
        assertEquals('i', BloomFilter.putBucketAt((byte) 'A', 2, 3, (byte) 5));
    }

    /**
     * Test {@link BloomFilter#putBucketAt(byte, int, int, byte)}.
     * <ul>
     *   <li>When minus one.</li>
     *   <li>Then return minus sixty-three.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#putBucketAt(byte, int, int, byte)}
     */
    @Test
    public void testPutBucketAt_whenMinusOne_thenReturnMinusSixtyThree() {
        // Arrange, Act and Assert
        assertEquals((byte) -63, BloomFilter.putBucketAt((byte) 'A', 2, -1, (byte) 'A'));
    }

    /**
     * Test {@link BloomFilter#putBucketAt(byte, int, int, byte)}.
     * <ul>
     *   <li>When three.</li>
     *   <li>Then return {@code Q}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#putBucketAt(byte, int, int, byte)}
     */
    @Test
    public void testPutBucketAt_whenThree_thenReturnQ() {
        // Arrange, Act and Assert
        assertEquals('Q', BloomFilter.putBucketAt((byte) 'A', 2, 3, (byte) 2));
    }

    /**
     * Test {@link BloomFilter#putBucketAt(byte, int, int, byte)}.
     * <ul>
     *   <li>When three.</li>
     *   <li>Then return {@code Y}.</li>
     * </ul>
     * <p>
     * Method under test: {@link BloomFilter#putBucketAt(byte, int, int, byte)}
     */
    @Test
    public void testPutBucketAt_whenThree_thenReturnY() {
        // Arrange, Act and Assert
        assertEquals('Y', BloomFilter.putBucketAt((byte) 'A', 2, 3, (byte) 3));
    }

    /**
     * Test {@link BloomFilter#isSet(int)}.
     * <p>
     * Method under test: {@link BloomFilter#isSet(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsSet() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).isSet(1);
    }

    /**
     * Test {@link BloomFilter#isSet(int)}.
     * <p>
     * Method under test: {@link BloomFilter#isSet(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIsSet2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.isSet(1);
    }

    /**
     * Test {@link BloomFilter#modifyBucket(int, boolean)}.
     * <p>
     * Method under test: {@link BloomFilter#modifyBucket(int, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testModifyBucket() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).modifyBucket(1, true);
    }

    /**
     * Test {@link BloomFilter#modifyBucket(int, boolean)}.
     * <p>
     * Method under test: {@link BloomFilter#modifyBucket(int, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testModifyBucket2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.modifyBucket(1, true);
    }

    /**
     * Test {@link BloomFilter#setNewFile(File, boolean)}.
     * <p>
     * Method under test: {@link BloomFilter#setNewFile(File, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetNewFile() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

        // Act
        bloomFilter.setNewFile(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), true);
    }

    /**
     * Test {@link BloomFilter#setNewFile(File, boolean)}.
     * <p>
     * Method under test: {@link BloomFilter#setNewFile(File, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSetNewFile2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.setNewFile(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), true);
    }

    /**
     * Test {@link BloomFilter#incrementCount(int)}.
     * <p>
     * Method under test: {@link BloomFilter#incrementCount(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIncrementCount() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).incrementCount(3);
    }

    /**
     * Test {@link BloomFilter#incrementCount(int)}.
     * <p>
     * Method under test: {@link BloomFilter#incrementCount(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testIncrementCount2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.incrementCount(3);
    }

    /**
     * Test {@link BloomFilter#decrementCount(int)}.
     * <p>
     * Method under test: {@link BloomFilter#decrementCount(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDecrementCount() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).decrementCount(3);
    }

    /**
     * Test {@link BloomFilter#decrementCount(int)}.
     * <p>
     * Method under test: {@link BloomFilter#decrementCount(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDecrementCount2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.decrementCount(3);
    }

    /**
     * Test {@link BloomFilter#getUnderlyingDataBytes()}.
     * <p>
     * Method under test: {@link BloomFilter#getUnderlyingDataBytes()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUnderlyingDataBytes() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).getUnderlyingDataBytes();
    }

    /**
     * Test {@link BloomFilter#getUnderlyingDataBytes()}.
     * <p>
     * Method under test: {@link BloomFilter#getUnderlyingDataBytes()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUnderlyingDataBytes2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.getUnderlyingDataBytes();
    }

    /**
     * Test {@link BloomFilter#getUnderlyingDataBytes()}.
     * <p>
     * Method under test: {@link BloomFilter#getUnderlyingDataBytes()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUnderlyingDataBytes3() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);
        bloomFilter.open = false;

        // Act
        bloomFilter.getUnderlyingDataBytes();
    }

    /**
     * Test {@link BloomFilter#getUnderlyingDataBytes()}.
     * <p>
     * Method under test: {@link BloomFilter#getUnderlyingDataBytes()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetUnderlyingDataBytes4() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();
        buildResult.open = false;

        // Act
        buildResult.getUnderlyingDataBytes();
    }

    /**
     * Test {@link BloomFilter#makeConsistentSnapshot(File, boolean)}.
     * <p>
     * Method under test: {@link BloomFilter#makeConsistentSnapshot(File, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMakeConsistentSnapshot() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        BloomFilter bloomFilter = new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

        // Act
        bloomFilter.makeConsistentSnapshot(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), true);
    }

    /**
     * Test {@link BloomFilter#makeConsistentSnapshot(File, boolean)}.
     * <p>
     * Method under test: {@link BloomFilter#makeConsistentSnapshot(File, boolean)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMakeConsistentSnapshot2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.makeConsistentSnapshot(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), true);
    }

    /**
     * Test {@link BloomFilter#getTotalLength()}.
     * <p>
     * Method under test: {@link BloomFilter#getTotalLength()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetTotalLength() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).getTotalLength();
    }

    /**
     * Test {@link BloomFilter#getTotalLength()}.
     * <p>
     * Method under test: {@link BloomFilter#getTotalLength()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetTotalLength2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.getTotalLength();
    }

    /**
     * Test {@link BloomFilter#getHashFns()}.
     * <p>
     * Method under test: {@link BloomFilter#getHashFns()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetHashFns() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        (new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK)).getHashFns();
    }

    /**
     * Test {@link BloomFilter#getHashFns()}.
     * <p>
     * Method under test: {@link BloomFilter#getHashFns()}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetHashFns2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (-3 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //       at net.mooctest.BloomFilter$NewBuilder.build(BloomFilter.java:326)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        BloomFilter buildResult = (new BloomFilter.NewBuilder(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1000, 10.0d))
                .allocator(BloomFilter.DEFAULT_ALLOCATOR)
                .bucketSize(BucketSize.ONE)
                .closeCallback(BloomFilter.DEFAULT_CLOSE_CALLBACK)
                .force(true)
                .seekThreshold(1)
                .build();

        // Act
        buildResult.getHashFns();
    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}.
     * <ul>
     *   <li>When {@code null}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenNull3() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "net.mooctest.BloomMetadata.getHashFns()" because "this.metadata" is null
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:537)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), true, 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK, null);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}.
     * <ul>
     *   <li>When {@code null}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenNull2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "net.mooctest.Allocator.apply(int)" because "cacheAllocator" is null
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:540)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        File f = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

        // Act
        new BloomFilter(f, true, 1, null, BloomFilter.DEFAULT_CLOSE_CALLBACK,
                BloomMetadata.createNew(1, 19088743, BucketSize.ONE));

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}.
     * <ul>
     *   <li>When {@code false}.</li>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}
     */
    @Test
    public void testNewBloomFilter_whenFalse_thenThrowIllegalArgumentException2() throws IOException {
        // Arrange
        File f = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

        // Act and Assert
        thrown.expect(IllegalArgumentException.class);

        new BloomFilter(f, false, 1, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK,
                BloomMetadata.createNew(1, 19088743, BucketSize.ONE));

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}.
     * <ul>
     *   <li>When {@code false}.</li>
     *   <li>Then return {@link BloomFilter#file} is {@code null}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}
     */
    @Test
    public void testNewBloomFilter_whenFalse_thenReturnFileIsNull2() throws IOException {
        // Arrange and Act
        BloomFilter actualBloomFilter = new BloomFilter(null, false, 1, BloomFilter.DEFAULT_ALLOCATOR,
                BloomFilter.DEFAULT_CLOSE_CALLBACK, BloomMetadata.createNew(1, 19088743, BucketSize.ONE));

        // Assert
        assertNull(actualBloomFilter.file);
        assertNull(actualBloomFilter.unflushedChanges);
        assertEquals(0, actualBloomFilter.unflushedChangeCounter.get());
        ReentrantReadWriteLock reentrantReadWriteLock = actualBloomFilter.cacheLock;
        assertEquals(0, reentrantReadWriteLock.getQueueLength());
        assertEquals(0, reentrantReadWriteLock.getReadHoldCount());
        assertEquals(0, reentrantReadWriteLock.getReadLockCount());
        assertEquals(0, reentrantReadWriteLock.getWriteHoldCount());
        BloomMetadata bloomMetadata = actualBloomFilter.metadata;
        assertEquals(1, bloomMetadata.getMaxCountInBucket());
        assertEquals(1, actualBloomFilter.seekThreshold);
        assertEquals(19088743, actualBloomFilter.getHashFns());
        assertEquals(19088743, bloomMetadata.getHashFns());
        RepeatedMurmurHash repeatedMurmurHash = actualBloomFilter.hash;
        assertEquals(19088743, repeatedMurmurHash.hashCount);
        assertEquals((byte) 2, bloomMetadata.getVersion());
        assertEquals(33, actualBloomFilter.getTotalLength());
        assertEquals(33, bloomMetadata.getTotalLength());
        assertEquals(8, bloomMetadata.getBucketCount());
        assertEquals(8, bloomMetadata.getBucketsPerByte());
        assertEquals(8, repeatedMurmurHash.max);
        assertEquals(BucketSize.ONE, bloomMetadata.getBucketSize());
        assertFalse(reentrantReadWriteLock.hasQueuedThreads());
        assertFalse(reentrantReadWriteLock.isFair());
        assertFalse(reentrantReadWriteLock.isWriteLocked());
        assertFalse(reentrantReadWriteLock.isWriteLockedByCurrentThread());
        assertTrue(actualBloomFilter.cacheDirty);
        assertTrue(actualBloomFilter.open);
        assertEquals(Integer.SIZE, bloomMetadata.getHeaderLength());
        byte[] expectedUnderlyingDataBytes = actualBloomFilter.cache;
        byte[] underlyingDataBytes = actualBloomFilter.getUnderlyingDataBytes();
        assertSame(expectedUnderlyingDataBytes, underlyingDataBytes);
        assertArrayEquals(new byte[]{0}, underlyingDataBytes);
        assertArrayEquals(new byte[]{0}, actualBloomFilter.cache);
    }

    /**
     * Test {@link BloomFilter#BloomFilter(File, int, Allocator, CloseCallback)}.
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'write').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When {@code null}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenNull() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "net.mooctest.Allocator.apply(int)" because "cacheAllocator" is null
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:540)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1, 19088743, true, 1,
                BucketSize.ONE, null, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When {@link Integer#MIN_VALUE}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenMin_value() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Impossibly short size (-268435424 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:105)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), Integer.MIN_VALUE, 19088743,
                true, 1, BucketSize.ONE, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When {@code false}.</li>
     *   <li>Then return {@link BloomFilter#file} is {@code null}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    public void testNewBloomFilter_whenFalse_thenReturnFileIsNull() throws IOException {
        // Arrange and Act
        BloomFilter actualBloomFilter = new BloomFilter(null, 1, 1, false, 1, BucketSize.ONE, BloomFilter.DEFAULT_ALLOCATOR,
                BloomFilter.DEFAULT_CLOSE_CALLBACK);

        // Assert
        assertNull(actualBloomFilter.file);
        assertNull(actualBloomFilter.unflushedChanges);
        assertEquals(0, actualBloomFilter.unflushedChangeCounter.get());
        ReentrantReadWriteLock reentrantReadWriteLock = actualBloomFilter.cacheLock;
        assertEquals(0, reentrantReadWriteLock.getQueueLength());
        assertEquals(0, reentrantReadWriteLock.getReadHoldCount());
        assertEquals(0, reentrantReadWriteLock.getReadLockCount());
        assertEquals(0, reentrantReadWriteLock.getWriteHoldCount());
        assertEquals(1, actualBloomFilter.getHashFns());
        BloomMetadata bloomMetadata = actualBloomFilter.metadata;
        assertEquals(1, bloomMetadata.getHashFns());
        assertEquals(1, bloomMetadata.getMaxCountInBucket());
        assertEquals(1, actualBloomFilter.seekThreshold);
        RepeatedMurmurHash repeatedMurmurHash = actualBloomFilter.hash;
        assertEquals(1, repeatedMurmurHash.hashCount);
        assertEquals((byte) 2, bloomMetadata.getVersion());
        assertEquals(33, actualBloomFilter.getTotalLength());
        assertEquals(33, bloomMetadata.getTotalLength());
        assertEquals(8, bloomMetadata.getBucketCount());
        assertEquals(8, bloomMetadata.getBucketsPerByte());
        assertEquals(8, repeatedMurmurHash.max);
        assertEquals(BucketSize.ONE, bloomMetadata.getBucketSize());
        assertFalse(reentrantReadWriteLock.hasQueuedThreads());
        assertFalse(reentrantReadWriteLock.isFair());
        assertFalse(reentrantReadWriteLock.isWriteLocked());
        assertFalse(reentrantReadWriteLock.isWriteLockedByCurrentThread());
        assertTrue(actualBloomFilter.cacheDirty);
        assertTrue(actualBloomFilter.open);
        assertEquals(Integer.SIZE, bloomMetadata.getHeaderLength());
        byte[] expectedUnderlyingDataBytes = actualBloomFilter.cache;
        byte[] underlyingDataBytes = actualBloomFilter.getUnderlyingDataBytes();
        assertSame(expectedUnderlyingDataBytes, underlyingDataBytes);
        assertArrayEquals(new byte[]{0}, underlyingDataBytes);
        assertArrayEquals(new byte[]{0}, actualBloomFilter.cache);
    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When zero.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenZero2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'delete').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 0, 19088743, true, 1,
                BucketSize.ONE, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When zero.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenZero() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   net.mooctest.InvalidBloomFilter: Invalid number of hashFns (0 bytes)
        //       at net.mooctest.BloomMetadata.<init>(BloomMetadata.java:101)
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new BloomFilter(null, 1, 0, false, 1, BucketSize.ONE, BloomFilter.DEFAULT_ALLOCATOR,
                BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt} toFile.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenPropertyIsJavaIoTmpdirIsTestTxtToFile() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Temporary files were created but not deleted.
        //   The method under test created the following temporary files without deleting
        //   them:
        //     C:\Users\JSH.HP\AppData\Local\Temp\test.txt
        //   Please ensure that temporary files are deleted in the method under test.
        //   See https://diff.blue/R020

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1, 19088743, true, 1,
                BucketSize.ONE, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}.
     * <ul>
     *   <li>When Property is {@code java.io.tmpdir} is {@code test.txt} toFile.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenPropertyIsJavaIoTmpdirIsTestTxtToFile2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access temporary files created outside of the test (file 'C:\Users\JSH.HP\AppData\Local\Temp\test.txt', permission 'delete').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange
        File f = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile();

        // Act
        new BloomFilter(f, true, 1, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK,
                BloomMetadata.createNew(1, 19088743, BucketSize.ONE));

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When {@code false}.</li>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    public void testNewBloomFilter_whenFalse_thenThrowIllegalArgumentException() throws IOException {
        // Arrange, Act and Assert
        thrown.expect(IllegalArgumentException.class);

        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(), 1, 1, false, 1,
                BucketSize.ONE, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}.
     * <ul>
     *   <li>When Property is {@code java.io.tmpdir} is {@code foo} and {@code foo}
     * toFile.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, boolean, int, Allocator, CloseCallback, BloomMetadata)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenPropertyIsJavaIoTmpdirIsFooAndFooToFile() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.io.FileNotFoundException: C:\Users\JSH.HP\AppData\Local\Temp\foo\foo (系统找不到指定的路径。)
        //       at java.base/java.io.RandomAccessFile.open0(Native Method)
        //       at java.base/java.io.RandomAccessFile.open(RandomAccessFile.java:346)
        //       at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:260)
        //       at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:214)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:557)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        File f = Paths.get(System.getProperty("java.io.tmpdir"), "foo", "foo").toFile();

        // Act
        new BloomFilter(f, true, 1, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK,
                BloomMetadata.createNew(1, 19088743, BucketSize.ONE));

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When Property is {@code java.io.tmpdir} is {@code foo} and {@code 42}
     * toFile.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenPropertyIsJavaIoTmpdirIsFooAnd42ToFile() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.io.FileNotFoundException: C:\Users\JSH.HP\AppData\Local\Temp\foo\42 (系统找不到指定的路径。)
        //       at java.base/java.io.RandomAccessFile.open0(Native Method)
        //       at java.base/java.io.RandomAccessFile.open(RandomAccessFile.java:346)
        //       at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:260)
        //       at java.base/java.io.RandomAccessFile.<init>(RandomAccessFile.java:214)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:557)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "foo", "42").toFile(), 1, 19088743, true, 1,
                BucketSize.ONE, BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When Property is {@code java.io.tmpdir} is empty string toFile.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenPropertyIsJavaIoTmpdirIsEmptyStringToFile() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Sandboxing policy violation.
        //   Diffblue Cover ran code in your project that tried
        //     to access files (file 'C:\Users\JSH.HP\AppData\Local\Temp', permission 'delete').
        //   Diffblue Cover's default sandboxing policy disallows this in order to prevent
        //   your code from damaging your system environment.
        //   See https://diff.blue/R011 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "").toFile(), 1, 19088743, true, 1, BucketSize.ONE,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }

    /**
     * Test
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}.
     * <ul>
     *   <li>When Property is {@code java.io.tmpdir} is empty string toFile.</li>
     * </ul>
     * <p>
     * Method under test:
     * {@link BloomFilter#BloomFilter(File, int, int, boolean, int, BucketSize, Allocator, CloseCallback)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testNewBloomFilter_whenPropertyIsJavaIoTmpdirIsEmptyStringToFile2() throws IOException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "net.mooctest.BucketSize.getBits()" because "countBits" is null
        //       at net.mooctest.BloomMetadata.createNew(BloomMetadata.java:78)
        //       at net.mooctest.BloomFilter.<init>(BloomFilter.java:527)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        new BloomFilter(Paths.get(System.getProperty("java.io.tmpdir"), "").toFile(), 1, 19088743, true, 1, null,
                BloomFilter.DEFAULT_ALLOCATOR, BloomFilter.DEFAULT_CLOSE_CALLBACK);

    }
}
