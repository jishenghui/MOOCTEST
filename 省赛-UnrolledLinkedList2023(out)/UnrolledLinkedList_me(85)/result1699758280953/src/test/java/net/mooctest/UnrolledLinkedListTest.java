package net.mooctest;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;

//1h20min
public class UnrolledLinkedListTest extends TestCase {
    UnrolledLinkedList list;
    int[] arr;
    int[] arr1;

    @Before
    public void setUp() throws Exception {
        list = new UnrolledLinkedList<Integer>();
        arr = new int[]{7, 2, 3, 8, 14, 6, 0, -5, -27, 33, 76};
        for (int i : arr) {
            list.add(i);
        }

    }

    @Test(expected = IllegalArgumentException.class)
    public void testE() {
        try {
            list = new UnrolledLinkedList(0);
        } catch (IllegalArgumentException e) {
            System.out.println("nodeCapacity < 8");
        }finally {
            System.out.println();
        }
        // 原测试未覆盖到边界8
        list=new UnrolledLinkedList<>(8);
        assertEquals(8,list.nodeCapacity);
    }


    @Test
    public void tearDown() throws Exception {
        list = null;
    }

    @Test
    public void testSize() {
        assertEquals(11, list.size);

    }

    @Test
    public void testIsEmpty() {
        assertFalse(list.isEmpty());
        list = new UnrolledLinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testContains() {
        assertTrue(list.contains(76));
        assertFalse(list.contains(10000));
    }

    @Test
    public void testIterator() {
        Iterator<Integer> outlist = list.iterator();
        assertEquals(Optional.of(2), Optional.of(outlist.next()));
    }

    @Test
    public void testToArray() {
        Object[] testarr = list.toArray();
        assertEquals(arr.length, testarr.length);
        for (int i = 0; i < arr.length; i++) {
            assertEquals((Integer) arr[i], (Integer) testarr[i]);
        }
    }

    @Test
    public void testTestToArray1() {
        Object[] testarr1 = new Object[16];

        list.toArray(testarr1);

        for (int i = 0; i < arr.length; i++) {
            assertEquals((Integer) arr[i], (Integer) testarr1[i]);
        }

        Object[] testarr2 = new Object[0];
        testarr2=list.toArray(testarr2);
        // 对源代码`if (a.length < size)`的边界进行修改后能够正常通过:
        // 原测试代码未接受在给予数组大小不够时重开数组的返回
        assertEquals(testarr2.length, 11);
        for (int i = 0; i < testarr2.length; i++) {
            assertEquals((Integer) arr[i], (Integer) testarr2[i]);
        }

    }

    @Test
    public void testAdd() {
        assertTrue(list.add(1024));
        assertTrue(list.add(1024));
        assertEquals(13, list.size);
    }

    @Test
    public void testRemove() {
        assertFalse(list.remove(null));
        list.add(null);
        assertTrue(list.remove(null));
        assertTrue(list.remove((Object) 76));
        assertFalse(list.remove((Object) "abs"));
        assertEquals(10, list.size);
    }

    @Test
    public void testContainsAll() {
        try {
            list.containsAll(null);

        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        list.add(arr);
        assertTrue(list.containsAll(Collections.singleton(arr)));
        arr = new int[10];
        assertFalse(list.containsAll(Collections.singleton(arr)));
    }

    @Test
    public void testAddAll() {
        try {
            list.addAll(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        assertTrue(list.addAll(Collections.singleton(arr)));
        assertEquals(12, list.size());
    }

    @Test
    public void testRemoveAll() {
        LinkedList<Integer> outlist = new LinkedList<>();
        outlist.add(76);
        outlist.add(-27);
        outlist.add(1024);
        try {
            list.removeAll(null);
        } catch (NullPointerException e) {
            System.out.println("集合为空");
        }
        assertTrue(list.removeAll(outlist));
        assertEquals(9, list.size());
    }

    @Test
    public void testRetainAll() {
        LinkedList<Integer> outlist = new LinkedList<>();
        outlist.add(76);
        outlist.add(-27);
        outlist.add(1024);
        assertTrue(list.retainAll(outlist));
        assertEquals(2, list.size);
        try {
            list.retainAll(null);
        } catch (NullPointerException e) {

        }
    }


    @Test
    public void testClear() {

        UnrolledLinkedList<Integer> list1 = new UnrolledLinkedList<>();
        for (int i : arr) {
            list1.add(i);
        }
        list.firstNode.next = list1.firstNode;
        list.clear();
        assertEquals(0, list.size);
        assertEquals(11, list1.size);
    }

    @Test
    public void testGet() {
        assertEquals(7, list.get(0));
        assertEquals(-5, list.get(7));
        try {
            list.get(-1);
        } catch (IndexOutOfBoundsException e) {
        }
        try {
            list.get(100);
        } catch (IndexOutOfBoundsException e) {
        }

        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }
        assertEquals(arr1[3], list.get(11 + 3));
        assertEquals(arr2[3], list.get(11 + 16 + 3));
    }

    @Test
    public void testSet() {
        assertEquals(list.get(7), list.set(7, 5));
        assertEquals(list.get(3), list.set(3, 81));
        try {
            list.set(-1, null);
        } catch (IndexOutOfBoundsException e) {
        }
        try {
            list.set(100, null);
        } catch (IndexOutOfBoundsException e) {
        }


        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }

        assertEquals(list.get(31), list.set(31, 5));
        assertEquals(list.get(17), list.set(17, 515));


    }

    @Test
    public void testTestAdd() {
        list.add(7, 1249);
        assertEquals(list.get(7), 1249);
        list.add(3, 5058);
        assertEquals(list.get(3), 5058);
        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }

        list.add(17, 7747);
        assertEquals(list.get(17), 7747);
        list.add(30, 80477);
        assertEquals(list.get(30), 80477);
        try {
            list.add(10101, 7747);

        } catch (IndexOutOfBoundsException e) {

        }
        try {
            list.add(-10101, 7747);

        } catch (IndexOutOfBoundsException e) {

        }
    }

    @Test
    public void testTestRemove() {
        assertEquals(7, list.remove(0));
        assertEquals(76, list.remove(9));

        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }

        assertEquals(arr1[17 - 9], list.remove(17));
        assertEquals(arr2[30 - 9 - 15], list.remove(30));

        try {
            list.remove(10101);

        } catch (IndexOutOfBoundsException e) {

        }
        try {
            list.remove(-10101);

        } catch (IndexOutOfBoundsException e) {

        }

    }

    @Test
    public void testIndexOf() {

        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }
        assertEquals(-1, list.indexOf(null));
        list.add(13, null);
        assertEquals(13, list.indexOf(null));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(-1, list.lastIndexOf(-1));
        assertEquals(10, list.lastIndexOf(76));
        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }
        assertEquals(-1, list.lastIndexOf(null));

        list.add(13, null);
        assertEquals(13, list.lastIndexOf(null));
    }

    @Test
    public void testListIterator() {
        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }
        ListIterator<Integer> firstnodelist = list.listIterator();

    }

    @Test
    public void testTestListIterator() {
        ListIterator testlist;
        int index = 3;
        testlist = list.listIterator(index);
        assertEquals(index + 1, testlist.nextIndex());
        index = 7;
        testlist = list.listIterator(index);
        assertEquals(index + 1, testlist.nextIndex());
        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }
        index = 30;
        testlist = list.listIterator(index);
        assertEquals(index + 1, testlist.nextIndex());
        index = 16;
        testlist = list.listIterator(index);
        assertEquals(index + 1, testlist.nextIndex());
        try {
            list.listIterator(-1);
        } catch (IndexOutOfBoundsException e) {

        }
        try {
            list.listIterator(10000);
        } catch (IndexOutOfBoundsException e) {

        }
    }

    @Test
    public void testInsertIntoNode() {

        UnrolledLinkedList.ULLIterator firstnodelist = (UnrolledLinkedList.ULLIterator) list.listIterator(8);
        firstnodelist.set(-111);

        assertEquals(-111,firstnodelist.currentNode.elements[8]);
        assertEquals(-5, firstnodelist.previous());
        firstnodelist.add(3);
        try {
            firstnodelist.set(2);
        } catch (ConcurrentModificationException e) {

        }
        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }


        firstnodelist = (UnrolledLinkedList.ULLIterator) list.listIterator(33);
        assertEquals(arr2[33 - 11 - 16], firstnodelist.next());
        assertTrue(firstnodelist.hasNext());
        assertTrue(firstnodelist.hasPrevious());

        try {
            firstnodelist = (UnrolledLinkedList.ULLIterator) list.listIterator();
            firstnodelist.previous();
        } catch (NoSuchElementException e) {

        }


    }

    @Test
    public void testRemoveFromNode() {
        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }

        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }
        UnrolledLinkedList.Node temp=list.firstNode;
        list.removeFromNode(temp,7);
        assertEquals(-1,list.indexOf(-5));
    }

    @Test
    public void testMergeWithNextNode() {
        arr1 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr1[i]);
        }

        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 16; i++) {
            list.add(arr2[i]);
        }
        list.mergeWithNextNode(list.firstNode);
        UnrolledLinkedList.ULLIterator firstnodelist = (UnrolledLinkedList.ULLIterator) list.listIterator(8);
        firstnodelist.remove();
        assertEquals(15,firstnodelist.currentNode.numElements);
    }
}