package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Random;

import static org.junit.Assert.*;

public class BSTTest {

    BST<String, Integer> st;
    char[] ckey;
    String[] key;
    Integer[] value;
    int[] use;

    /**
     * 初始化方法，用于准备数据结构和随机生成值
     * 此方法不接受参数，也没有返回值
     * 主要作用是为后续的操作初始化所需的数组和数据
     */
    public void initialize() {
        // 定义一个整型数组use，包含一系列预设的数值
        use = new int[]{4, 17, 28, 36, 45, 51, 68, 96, 98, 77, 71, 64, 60, 12, 35, 9};

        // 创建一个Random对象，用于后续生成随机数
        Random random = new Random();

        // 初始化字符数组ckey，用于存储16个字符
        ckey = new char[16];

        // 初始化字符串数组key，用于存储16个字符串
        key = new String[16];

        // 初始化整型数组value，用于存储16个整数
        value = new Integer[16];

        // 遍历use数组，为ckey, key, value数组赋值
        for (int i = 0; i < 16; i++) {
            // 将use数组中的元素转换为字符，存入ckey数组
            ckey[i] = (char) (use[i]);

            // 将ckey数组中的字符转换为字符串，存入key数组
            key[i] = String.valueOf((ckey[i]));

            // 生成一个随机整数，存入value数组
            value[i] = random.nextInt(1000);

            // 将key-value对存入同步树形图st
            st.put(key[i], value[i]);
        }

        // 特别处理第10个元素，将其存入同步树形图st
        st.put(String.valueOf((ckey[10])), value[10]);
    }


    @Before
    public void setUp() throws Exception {
        st = new BST<String, Integer>();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void isEmpty() {
        assertTrue(st.isEmpty());
        st.put("i", 10);
        assertFalse(st.isEmpty());
    }

    @Test
    public void size() {
        assertEquals(0, st.size());
        st.put("i", 10);
        assertEquals(1, st.size());
    }

    @Test
    public void contains() {
        try {
            st.contains(null);
        } catch (IllegalArgumentException e) {
            System.out.println("argument to contains() is null");
        }
        assertFalse(st.contains("i"));
        st.put("i", 10);
        assertTrue(st.contains("i"));
    }

    @Test
    public void get() {
        try {
            st.get(null);
        } catch (IllegalArgumentException e) {
            System.out.println("calls get() with a null key");
        }
        assertNull(st.get("i"));
        st.put("i", 10);
        assertEquals((Integer) 10, (Integer) st.get("i"));
        st.deleteMin();

        initialize();

        assertEquals(16, st.size());

        for (int i = 0; i < key.length; i++) {
            assertEquals(value[i], st.get(key[i]));
        }

    }

    @Test
    public void put() {
        try {
            st.put(null, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("calls put() with a null key");
        }
        try {
            st.put(null, null);
        } catch (IllegalArgumentException e) {
            System.out.println("calls delete() with a null key");
        }
        st.put("11", null);
        assertNull(st.get("11"));
        initialize();
        assertEquals(16, st.size());
        for (int i = 0; i < 16; i++) {
            assertEquals(value[i], st.get(key[i]));
        }
    }

    @Test
    public void deleteMin() {
        try {
            st.deleteMin();
        } catch (NoSuchElementException e) {
            System.out.println("Symbol table underflow");
        }
        initialize();
        Arrays.sort(ckey);
//        Arrays.sort(value);
        for (int i = 0; i < 15; i++) {
            String out = String.valueOf(ckey[i]);
            assertEquals(out, (String) st.min());
            st.deleteMin();
            assertNull(st.get(out));
        }
    }

    @Test
    public void deleteMax() {
        try {
            st.deleteMax();
        } catch (NoSuchElementException e) {
            System.out.println("Symbol table underflow");
        }
        initialize();
        Arrays.sort(ckey);
        for (int i = 15; i >= 0; i--) {
            String out = String.valueOf(ckey[i]);
            assertEquals(out, (String) st.max());
            st.deleteMax();
            assertNull(st.get(out));
        }
    }

    @Test
    public void delete() {
        try {
            st.delete(null);
        } catch (IllegalArgumentException e) {
            System.out.println("calls delete() with a null key");
        }
        st.delete("1");
        initialize();
        int[] out = {0, 10, 9, 12, 13, 3, 11, 6, 2, 8, 1, 15, 14, 7, 4, 5};
        for (int i = 0; i < 16; i++) {
            String o = key[out[i]];
            st.delete(o);
            assertNull(st.get(o));
        }
    }

    @Test
    public void MinAndMax_Exception() {
        try {
            st.min();
        } catch (NoSuchElementException e) {
        }
        try {
            st.max();
        } catch (NoSuchElementException e) {
        }
    }


    @Test
    public void floor() {
        try {
            st.floor("1");
        } catch (NoSuchElementException e) {
        }
        initialize();
        Arrays.sort(ckey);
        for (int i = 1; i < 14; i++) {
            assertEquals(String.valueOf(ckey[i]), st.floor(String.valueOf(ckey[i])));
        }
        assertNull(st.floor(String.valueOf(((char) 0))));
        try {
            st.floor(null);
        } catch (IllegalArgumentException e) {
        }

    }

    @Test
    public void floor2() {
        assertNull(st.floor2("1"));
        initialize();
        Arrays.sort(ckey);
        for (int i = 1; i < 14; i++) {
            assertEquals(String.valueOf(ckey[i]), st.floor2(String.valueOf(ckey[i])));
        }
    }

    @Test
    public void ceiling() {
        try {
            st.ceiling("1");
        } catch (NoSuchElementException e) {
        }
        initialize();
        Arrays.sort(ckey);
        for (int i = 1; i < 14; i++) {
            assertEquals(String.valueOf(ckey[i]), st.ceiling(String.valueOf(ckey[i])));
        }
        assertNull(st.ceiling(String.valueOf(((char) 128))));
        try {
            st.ceiling(null);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void select() {
        try {
            st.select(2);
        } catch (IllegalArgumentException e) {
        }
        try {
            st.select(-1);
        } catch (IllegalArgumentException e) {
        }
        initialize();
        Arrays.sort(ckey);
        for (int i = 0; i < 16; i++) {
            assertEquals(ckey[i] + "", st.select(i));
        }
    }

    @Test
    public void rank() {
        initialize();
        Arrays.sort(ckey);
        for (int i = 1; i < 14; i++) {
            assertEquals(i, st.rank(String.valueOf(ckey[i])));
        }
        try {
            st.rank(null);
        } catch (IllegalArgumentException e) {
            System.out.println("argument to rank() is null");
        }
    }

    @Test
    public void keys() {
        assertEquals("", st.keys().toString());
        initialize();
        assertEquals("\u0004 \t \f \u0011 \u001C # $ - 3 < @ D G M ` b ", st.keys().toString());
    }

    @Test
    public void testKeys() {
        initialize();
        assertEquals("\u0004 \t \f \u0011 \u001C # $ - 3 < @ D G ", st.keys(key[0], key[10]).toString());
        assertEquals("\u0004 \t \f \u0011 \u001C # $ - ", st.keys(key[0], key[4]).toString());
        assertEquals("", st.keys(key[8], key[15]).toString());
        try {
            st.keys("null", null);
        } catch (IllegalArgumentException e) {
        }
        try {
            st.keys(null, "null");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testSize() {
        initialize();
        assertEquals(6, st.size(key[2], key[12]));
        assertEquals(0, st.size(key[8], key[11]));
        assertEquals(4, st.size(key[1], key[3]));
        assertEquals(0, st.size(key[6], key[1]));
        assertEquals(8, st.size(key[3], key[9]));
        assertEquals(2, st.size(key[11], key[6]));
        assertEquals(0, st.size(key[13], key[15]));
        assertEquals(13, st.size(key[15], key[9]));
        assertEquals(6, st.size(key[13], key[4]));
        assertEquals(3, st.size(key[12], key[6]));
        assertEquals(0, st.size("zzz", "jjj"));
        assertEquals(4, st.size(key[10], "jjj"));
        assertEquals(0, st.size("zzz", key[3]));


        try {
            st.size("null", null);
        } catch (IllegalArgumentException e) {
        }
        try {
            st.size(null, "null");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void height() {
        initialize();
        assertEquals(9, st.height());
    }

    @Test
    public void levelOrder() {
        initialize();
        assertEquals("\u0004 \u0011 \f \u001C \t $ # - 3 D @ ` < M b G ", st.levelOrder().toString());
    }


    @Test
    public void testt() {


    }


    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    ByteArrayOutputStream baoStream;
//    PrintStream cacheStream;
//    PrintStream oldStream;


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
//        baoStream = new ByteArrayOutputStream(1024);
//        cacheStream = new PrintStream(baoStream);//临时输出
//        oldStream = System.out;//缓存系统输出
//        System.setOut(cacheStream);
    }

    @After
    public void restoreStreams() throws IOException {
        System.setOut(System.out);
//        baoStream.close();
//        cacheStream.close();
//        oldStream.close();
    }

    @Test
    public void testPrintln_Object() {
        StdOut.println();
        StdOut.println("Hello");
        StdOut.println(true);
        StdOut.println('c');
        StdOut.println(3.14);
        StdOut.println(3.14f);
        StdOut.println(123);
        StdOut.println(123L);
        StdOut.println((short) 123);
        StdOut.println((byte) 123);
        StdOut.print();
        StdOut.print("Hello");
        StdOut.print(true);
        StdOut.print('c');
        StdOut.print(3.14);
        StdOut.print(3.14f);
        StdOut.print(123);
        StdOut.print(123L);
        StdOut.print((short) 123);
        StdOut.print((byte) 123);
        StdOut.printf("%s", "Hello");
        StdOut.printf(Locale.US, "%s", "Hello");
        assertEquals("\r\n" +
                "Hello\r\n" +
                "true\r\n" +
                "c\r\n" +
                "3.14\r\n" +
                "3.14\r\n" +
                "123\r\n" +
                "123\r\n" +
                "123\r\n" +
                "123\r\n" +
                "Hellotruec3.143.14123123123123HelloHello", outContent.toString());
    }


}
