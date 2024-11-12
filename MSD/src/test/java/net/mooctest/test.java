package net.mooctest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    private String[] strings;
    private int[] integers;

    @Before
    public void setUp() {
        // 初始化测试数据
        strings = new String[] {"banana", "apple", "orange", "mango", "grape"};
        integers = new int[] {25, 3, 99, 42, 10};
    }

    // 测试String类型的排序
    @Test
    public void testSortStrings() {
        // 排序前
        String[] unsortedStrings = strings.clone();
        MSD.sort(unsortedStrings);

        // 排序后
        String[] expectedStrings = new String[] {"apple", "banana", "grape", "mango", "orange"};
        assertArrayEquals("String array should be sorted in lexicographical order.", expectedStrings, unsortedStrings);
    }

    // 测试int类型的排序
    @Test
    public void testSortIntegers() {
        // 排序前
        int[] unsortedIntegers = integers.clone();
        MSD.sort(unsortedIntegers);

        // 排序后
        int[] expectedIntegers = new int[] {3, 10, 25, 42, 99};
        assertArrayEquals("Integer array should be sorted in ascending order.", expectedIntegers, unsortedIntegers);
    }

    // 测试空字符串数组
    @Test
    public void testSortEmptyStrings() {
        String[] emptyStrings = new String[0];
        MSD.sort(emptyStrings);
        assertEquals("Empty string array should remain empty.", 0, emptyStrings.length);
    }

    // 测试空整数数组
    @Test
    public void testSortEmptyIntegers() {
        int[] emptyIntegers = new int[0];
        MSD.sort(emptyIntegers);
        assertEquals("Empty integer array should remain empty.", 0, emptyIntegers.length);
    }

    // 测试单个元素的字符串数组
    @Test
    public void testSortSingleString() {
        String[] singleString = new String[] {"apple"};
        MSD.sort(singleString);
        String[] expected = new String[] {"apple"};
        assertArrayEquals("Single string array should remain the same.", expected, singleString);
    }

    // 测试单个元素的整数数组
    @Test
    public void testSortSingleInteger() {
        int[] singleInteger = new int[] {42};
        MSD.sort(singleInteger);
        int[] expected = new int[] {42};
        assertArrayEquals("Single integer array should remain the same.", expected, singleInteger);
    }

    // 测试包含重复元素的字符串数组
    @Test
    public void testSortStringsWithDuplicates() {
        String[] stringsWithDuplicates = new String[] {"apple", "banana", "apple", "orange", "banana"};
        MSD.sort(stringsWithDuplicates);
        String[] expected = new String[] {"apple", "apple", "banana", "banana", "orange"};
        assertArrayEquals("String array with duplicates should be sorted correctly.", expected, stringsWithDuplicates);
    }

    // 测试包含重复元素的整数数组
    @Test
    public void testSortIntegersWithDuplicates() {
        int[] integersWithDuplicates = new int[] {42, 25, 42, 10, 25};
        MSD.sort(integersWithDuplicates);
        int[] expected = new int[] {10, 25, 25, 42, 42};
        assertArrayEquals("Integer array with duplicates should be sorted correctly.", expected, integersWithDuplicates);
    }

    // 测试已经排好序的字符串数组
    @Test
    public void testSortAlreadySortedStrings() {
        String[] sortedStrings = new String[] {"apple", "banana", "grape", "mango", "orange"};
        MSD.sort(sortedStrings);
        String[] expected = new String[] {"apple", "banana", "grape", "mango", "orange"};
        assertArrayEquals("Already sorted string array should remain the same.", expected, sortedStrings);
    }

    // 测试已经排好序的整数数组
    @Test
    public void testSortAlreadySortedIntegers() {
        int[] sortedIntegers = new int[] {3, 10, 25, 42, 99};
        MSD.sort(sortedIntegers);
        int[] expected = new int[] {3, 10, 25, 42, 99};
        assertArrayEquals("Already sorted integer array should remain the same.", expected, sortedIntegers);
    }
}
