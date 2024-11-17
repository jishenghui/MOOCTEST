package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

import static org.junit.Assert.*;
//mvn clean test-compile org.pitest:pitest-maven:mutationCoverage

/**
 * @Author: 纪圣辉
 * @Description: TODO
 * @DateTime: 2024/10/23 下午7:38
 **/
public class BPlusTreeTest {


    ByteArrayOutputStream outContent;
    Random random = new Random();
    String lineSeparator = System.lineSeparator();//操作系统换行符
    PrintStream printStream;

    BPlusTree tree;

    @Before
    public void setUp() throws Exception {
        tree = new BPlusTree<Integer, String>(100);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testBPlusTree_1() {
        BPlusTree<Integer, String> tree = new BPlusTree<Integer, String>();

        // Test case 1: Insertion of a single key-value pair
        tree.insert(1, "apple");
        assert tree.search(1).equals("apple");

        // Test case 2: Insertion of multiple key-value pairs
        tree.insert(2, "banana");
        tree.insert(3, "cherry");
        assert tree.search(2).equals("banana");
        assert tree.search(3).equals("cherry");

        // Test case 3: Search for a key that exists in the tree
        assert tree.search(2).equals("banana");

        // Test case 4: Search for a key that does not exist in the tree
        assert tree.search(4) == null;

        // Test case 5: Deletion of a key that exists in the tree
        tree.delete(2);
        assert tree.search(2) == null;

        // Test case 6: Deletion of a key that does not exist in the tree
        tree.delete(5);
        assert tree.search(5) == null;

        // Test case 7: Range search with inclusive range
        tree.insert(1, "apple");
        tree.insert(2, "banana");
        tree.insert(3, "cherry");
        assert tree.searchRange(1, BPlusTree.RangePolicy.INCLUSIVE, 3, BPlusTree.RangePolicy.INCLUSIVE).equals(Arrays.asList("apple", "banana", "cherry"));

        // Test case 8: Range search with exclusive range
        assert tree.searchRange(1, BPlusTree.RangePolicy.EXCLUSIVE, 3, BPlusTree.RangePolicy.EXCLUSIVE).equals(Arrays.asList("banana"));

        // Test case 9: Range search with empty tree
        BPlusTree<Integer, String> emptyTree = new BPlusTree<Integer, String>();
        assert emptyTree.searchRange(1, BPlusTree.RangePolicy.INCLUSIVE, 3, BPlusTree.RangePolicy.INCLUSIVE).equals(new ArrayList<String>());

        // Test case 10: Range search with single key in the tree
        tree.insert(1, "apple");
        assert tree.searchRange(1, BPlusTree.RangePolicy.INCLUSIVE, 1, BPlusTree.RangePolicy.INCLUSIVE).equals(Arrays.asList("apple"));

        System.out.println("All test cases pass");
    }

    //捕获控制台输出，每个方法仅限使用一次(没有出缓,保守点)
    public void GetOutPutBefore() {
        outContent = new ByteArrayOutputStream();
        printStream = new PrintStream(outContent);
        System.setOut(printStream);
    }

    public String GetOutPutAfter() {
        return outContent.toString();//获取输出的内容
    }

    //关闭流
    public void GetOutPutEnd() throws IOException {
        outContent.close();
        printStream.close();
    }


    @Test
    public void testBPlusTree_2() {
        tree = new BPlusTree<>(3);
        tree.insert(3, "cherry");
        tree.insert(1, "apple");
        tree.insert(5, "elderberry");
        tree.insert(7, "grape");
        tree.insert(16, "peach");
        tree.insert(14, "papaya");
        tree.insert(4, "date");
        tree.insert(10, "kiwi");
        tree.insert(6, "fig");
        tree.insert(13, "orange");
        tree.insert(2, "banana");
        tree.insert(15, "pear");
        tree.insert(8, "honeydew");
        tree.insert(9, "jackfruit");
        tree.insert(11, "lemon");
        tree.insert(12, "mango");

        String sss = "{[9]}\n{[5], [12, 14]}\n{[3, 4], [7]}, {[10], [13], [16]}\n{[1, 2], [3], [4]}, {[5, 6], [7, 8]}, {[9], [10, 11]}, {[12], [13]}, {[14, 15], [16]}\n";
        String string = tree.toString();
        System.out.println(string);
        assertEquals(sss, string);

        tree.delete(1);
        tree.delete(5);
        tree.delete(2);
        tree.delete(8);
        tree.delete(2);
        tree.delete(14);
        tree.delete(15);

        List list = tree.searchRange(6, BPlusTree.RangePolicy.INCLUSIVE, 13, BPlusTree.RangePolicy.INCLUSIVE);
        assertEquals(list.size(), 7);
        String[] lists = {"fig", "grape", "jackfruit", "kiwi", "lemon", "mango", "orange"};
        for (int i = 0; i < 7; i++) {
            assertEquals(lists[i], list.get(i));
        }
        assertEquals(tree.search(2), null);
        assertEquals("orange", tree.search(13));
    }

    @Test
    public void testBPlusTree_3() {
        tree = new BPlusTree<>(3);
        tree.insert(3, "cherry");
        tree.insert(1, "apple");
        tree.insert(5, "elderberry");
        tree.insert(7, "grape");
        tree.insert(16, "peach");
        tree.insert(14, "papaya");
        tree.insert(4, "date");
        tree.insert(10, "kiwi");
        tree.insert(6, "fig");
        tree.insert(13, "orange");
        tree.insert(2, "banana");
        tree.insert(15, "pear");
        tree.insert(8, "honeydew");
        tree.insert(9, "jackfruit");
        tree.insert(11, "lemon");
        tree.insert(12, "mango");


        tree.delete(1);
        tree.delete(2);
        tree.delete(3);
        tree.delete(4);
        tree.delete(5);
        tree.delete(6);
        tree.delete(7);
        tree.delete(8);
        tree.delete(9);
        tree.delete(10);
        tree.delete(11);
        tree.delete(12);
        tree.delete(13);
        tree.delete(14);
        tree.delete(15);
        tree.delete(16);

        assertEquals("{[]}\n", tree.toString());

    }

    @Test(expected = IllegalArgumentException.class)
    public void testBPlusTree_Exception1() {
        tree = new BPlusTree(2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBPlusTree_Exception2() {
        tree = new BPlusTree(1);
    }


    @Test
    public void testClosestPair01() throws IOException {
        GetOutPutBefore();
        ClosestPair cp = new ClosestPair(12);
        // Test case 1: Normal case with multiple points
        cp.array[0] = cp.buildLocation(2, 3);
        cp.array[1] = cp.buildLocation(2, 16);
        cp.array[2] = cp.buildLocation(3, 9);
        cp.array[3] = cp.buildLocation(6, 3);
        cp.array[4] = cp.buildLocation(7, 7);
        cp.array[5] = cp.buildLocation(19, 4);
        cp.array[6] = cp.buildLocation(10, 11);
        cp.array[7] = cp.buildLocation(15, 2);
        cp.array[8] = cp.buildLocation(15, 19);
        cp.array[9] = cp.buildLocation(16, 11);
        cp.array[10] = cp.buildLocation(17, 13);
        cp.array[11] = cp.buildLocation(9, 12);
        cp.xQuickSort(cp.array, 0, cp.array.length - 1);
        double result1 = cp.closestPair(cp.array, cp.array.length);
        assert result1 == 1.4142135623730951;

        // Test case 2: Case with two points
        cp = new ClosestPair(2);
        cp.array[0] = cp.buildLocation(2, 3);
        cp.array[1] = cp.buildLocation(2, 16);
        cp.xQuickSort(cp.array, 0, cp.array.length - 1);
        double result2 = cp.closestPair(cp.array, cp.array.length);
        assert result2 == 13.0;

        // Test case 3: Case with one point
        cp = new ClosestPair(1);
        cp.array[0] = cp.buildLocation(2, 3);
        cp.xQuickSort(cp.array, 0, cp.array.length - 1);
        double result3 = cp.closestPair(cp.array, cp.array.length);
        assert result3 == 0.0;

        // Test case 4: Case with no points
        cp = new ClosestPair(0);
        double result4 = cp.closestPair(cp.array, cp.array.length);
        assert result4 == 0.0;

        // Test case 5: Case with all points having the same x-coordinate
        cp = new ClosestPair(5);
        cp.array[0] = cp.buildLocation(2, 3);
        cp.array[1] = cp.buildLocation(2, 16);
        cp.array[2] = cp.buildLocation(2, 9);
        cp.array[3] = cp.buildLocation(2, 7);
        cp.array[4] = cp.buildLocation(2, 4);
        cp.xQuickSort(cp.array, 0, cp.array.length - 1);
        double result5 = cp.closestPair(cp.array, cp.array.length);
        assertEquals(1.0, result5, 0.01);

        // Test case 6: Case with all points having the same y-coordinate
        cp = new ClosestPair(5);
        cp.array[0] = cp.buildLocation(2, 3);
        cp.array[1] = cp.buildLocation(16, 3);
        cp.array[2] = cp.buildLocation(9, 3);
        cp.array[3] = cp.buildLocation(7, 3);
        cp.array[4] = cp.buildLocation(4, 3);
        cp.xQuickSort(cp.array, 0, cp.array.length - 1);
        double result6 = cp.closestPair(cp.array, cp.array.length);
        assertEquals(result6, 2.0, 0.01);
        String s = "";
        try {
            ClosestPair.main(new String[]{});
        } catch (Exception e) {
            s = GetOutPutAfter();
        }
        assertEquals(s, "Input data" + lineSeparator +
                "Number of points: 12" + lineSeparator +
                "x: 2.0, y: 3.0" + lineSeparator +
                "x: 2.0, y: 16.0" + lineSeparator +
                "x: 3.0, y: 9.0" + lineSeparator +
                "x: 6.0, y: 3.0" + lineSeparator +
                "x: 7.0, y: 7.0" + lineSeparator +
                "x: 19.0, y: 4.0" + lineSeparator +
                "x: 10.0, y: 11.0" + lineSeparator +
                "x: 15.0, y: 2.0" + lineSeparator +
                "x: 15.0, y: 19.0" + lineSeparator +
                "x: 16.0, y: 11.0" + lineSeparator +
                "x: 17.0, y: 13.0" + lineSeparator +
                "x: 9.0, y: 12.0" + lineSeparator +
                "Output Data" + lineSeparator
        );
        GetOutPutEnd();
    }
    
    
    @Test
    public void testMaximumMinimumWindow() throws IOException {
        GetOutPutBefore();
        MaximumMinimumWindow m = new MaximumMinimumWindow();
        int n=(int)100;
        int[]arr1=new int[]{29,92,7,61,84,43,28,49,77,33,7,37,50,60,23,45,93,17,72,98,98,45,91,89,85,68,85,72,20,12,48,19,19,77,23,19,75,96,70,91,77,6,22,13,9,24,92,77,86,16,54,15,52,23,64,45,31,6,3,51,0,66,35,1,88,70,17,79,66,67,90,23,46,94,78,4,51,78,58,44,11,62,25,91,55,51,69,48,3,53,4,77,47,55,24,91,92,16,48,76};
        int[]arr1_=MaximumMinimumWindow.calculateMaxOfMin(arr1,arr1.length);
        int[]arr2=calculateMaxOfMin1(arr1,arr1.length);
        assertArrayEquals(arr2, arr1_);
        try {
            MaximumMinimumWindow.main(new String[]{});
        }catch (Error e){
            System.out.print("eee");
        }
        String s=GetOutPutAfter();
        assertEquals("98 98 85 70 70 68 45 45 45 45 20 17 17 17 17 17 17 17 12 12 12 12 12 12 12 12 12 12 12 12 7 7 7 7 7 7 7 7 7 7 7 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 3 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 98 98 85 70 70 68 45 45 45 45 20 17 17 17 17 17 17 17 12 12 12 12 12 12 12 12 12 12 12 12 7 7 7 7 7 7 7 7 7 7 7 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 3 3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 70 30 20 10 10 10 10 eee",s );


    }

    int[] calculateMaxOfMin1(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        for (int i = 0; i < n; i++) {
            left[i] = -1;
            right[i] = n;
        }

        for (int i = 0; i < n; i++) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (!s.empty()) {
                left[i] = s.peek();
            }

            s.push(i);
        }

        while (!s.empty()) {
            s.pop();
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (!s.empty()) {
                right[i] = s.peek();
            }

            s.push(i);
        }

        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1;

            ans[len] = Math.max(ans[len], arr[i]);
        }

        for (int i = n - 1; i >= 1; i--) {
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }

        // Print the result
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
        return ans;
    }

}