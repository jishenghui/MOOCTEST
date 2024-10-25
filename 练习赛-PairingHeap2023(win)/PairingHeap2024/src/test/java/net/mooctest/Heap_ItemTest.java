package net.mooctest;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class Heap_ItemTest {

    @Test
    public void testReplaceChild() {
        Heap_Item<String> heap_Item0 = new Heap_Item<String>(",");
        Heap_Item<String> heap_Item1 = new Heap_Item<String>(".");
        Heap_Item<String> heap_Item2 = new Heap_Item<String>(",");
        Heap_Item<String> heap_Item3 = new Heap_Item<String>("/");
        Heap_Item<String> heap_Item4 = new Heap_Item<String>("'");
        Heap_Item<String> heap_Item5 = new Heap_Item<String>(";");
        Heap_Item<String> heap_Item6 = new Heap_Item<String>("!");
        Heap_Item<String> heap_Item7 = new Heap_Item<String>("?");

        heap_Item0.setRightSon(heap_Item1);
        heap_Item0.setLeftSon(heap_Item2);
        heap_Item1.setRightSon(heap_Item3);
        heap_Item1.setLeftSon(heap_Item4);
        heap_Item2.setRightSon(heap_Item5);
        heap_Item2.setLeftSon(heap_Item6);
        heap_Item1.setAncestor(heap_Item0);
        heap_Item2.setAncestor(heap_Item0);
        heap_Item3.setAncestor(heap_Item1);
        heap_Item4.setAncestor(heap_Item1);
        heap_Item5.setAncestor(heap_Item2);
        heap_Item6.setAncestor(heap_Item2);

        assertEquals(heap_Item5.getMultiWayAncestor(),heap_Item0);
        assertEquals(heap_Item2.getMultiWayAncestor(),heap_Item0);

        assertTrue(heap_Item0.itIsLeftSon(heap_Item2));
        assertFalse(heap_Item0.itIsLeftSon(heap_Item1));

        assertFalse(heap_Item7.hasRightSon());
        assertFalse(heap_Item7.hasLeftSon());

        assertFalse(heap_Item0.replaceChild("xxx",null));
        assertTrue(heap_Item0.replaceChild(".",null));
        assertTrue(heap_Item0.replaceChild(",",null));
        assertFalse(heap_Item0.replaceChild(",",null));
        assertFalse(heap_Item0.replaceChild(",",null));

        heap_Item2.removeChild(";");
        heap_Item2.removeChild("!");
        assertNull(heap_Item2.getLeftSon());
        assertNull(heap_Item2.getRightSon());
        heap_Item2.removeChild(";");
        heap_Item2.removeChild("!");

        assertEquals(heap_Item1.getSonByData("'"),heap_Item4);
        assertNull(heap_Item1.getSonByData("x"));
        assertEquals(heap_Item3,heap_Item1.getSonByData("/"));
        assertNull(heap_Item2.getSonByData("x"));
        assertNull(heap_Item2.getSonByData("x"));

        assertNull(heap_Item0.getMultiWayAncestor());


        Heap_Item heapItem8=new Heap_Item(heap_Item1);
        Heap_Item heapItem9=new Heap_Item<>();
        heapItem9.removeLeftSon();
        heapItem9.removeRightSon();


    }





    private Pairing_Heap<Integer> heap;

    @Before
    public void setUp() {
        heap = new Pairing_Heap<>();
    }

    @Test
    public void testEmptyHeap() {
        assertNull(heap.getRoot());
        heap=new Pairing_Heap<Integer>(new Heap_Item<>());
        assertNull(heap.peek());
    }

    @Test
    public void testPushSingleElement() {
        Heap_Item<Integer> newItem = new Heap_Item<>(5);
        heap.push(newItem);
        assertEquals(5, heap.peek().intValue());
    }

    @Test
    public void testPushMultipleElements() {
        Heap_Item<Integer> item1 = new Heap_Item<>(3);
        Heap_Item<Integer> item2 = new Heap_Item<>(4);
        Heap_Item<Integer> item3 = new Heap_Item<>(2);

        heap.push(item1);
        heap.push(item2);
        heap.push(item3);

        assertEquals((Integer)2, heap.peek());
    }

    @Test
    public void testPopFromHeap1() {
        Heap_Item<Integer> item1 = new Heap_Item<>(10);
        Heap_Item<Integer> item2 = new Heap_Item<>(5);
        Heap_Item<Integer> item3 = new Heap_Item<>(20);
        Heap_Item<Integer> item4 = new Heap_Item<>(40);
        Heap_Item<Integer> item5 = new Heap_Item<>(60);
        Heap_Item<Integer> item6 = new Heap_Item<>(15);
        Heap_Item<Integer> item7 = new Heap_Item<>(1);
        Heap_Item<Integer> item8 = new Heap_Item<>(1000);
        Heap_Item<Integer> item9 = new Heap_Item<>(200);
        Heap_Item<Integer> item10 = new Heap_Item<>(35);


        heap.push(item1);
        heap.push(item2);
        heap.push(item3);
        heap.push(item4);
        heap.push(item5);
        heap.push(item6);
        heap.push(item7);
        heap.push(item8);
        heap.push(item9);
        heap.push(item10);

        assertNotNull(heap.pop());
        assertEquals(5, heap.peek().intValue());
        assertEquals(5, heap.pop().intValue());
        assertEquals(10,heap.pop().intValue());
        assertEquals(15,heap.pop().intValue());
        assertEquals(20,heap.pop().intValue());
        assertEquals(35,heap.pop().intValue());
        assertEquals(40,heap.pop().intValue());
        assertEquals(60,heap.pop().intValue());
        assertEquals(200,heap.pop().intValue());
        assertEquals(1000,heap.pop().intValue());




    }

    @Test
    public void testPopFromHeap2() {
        Heap_Item<Integer> item1 = new Heap_Item<>(10);
        Heap_Item<Integer> item2 = new Heap_Item<>(5);
        Heap_Item<Integer> item3 = new Heap_Item<>(20);

        heap.push(item1);
        heap.push(item2);
        heap.push(item3);
        heap.getRoot().setLeftSon(item1);
        assertEquals(5, heap.pop().intValue());
        heap.getRoot().setLeftSon(null);
        assertEquals(10, heap.pop().intValue());
    }

    @Test
    public void testPopFromEmptyHeap() {
        assertNull(heap.pop());
    }

    @Test
    public void testCheckPriorityIncrease() {
        Heap_Item<Integer> item1 = new Heap_Item<>(8);
        Heap_Item<Integer> item2 = new Heap_Item<>(4);

        heap.push(item1);
        item1.setData(2); // Decrease priority
        heap.checkPriority(item1);
        heap.push(item2);

        assertEquals(2, heap.peek().intValue());
    }

    @Test
    public void testCheckPriorityDecrease() {
        Heap_Item<Integer> item1 = new Heap_Item<>(8);
        Heap_Item<Integer> item2 = new Heap_Item<>(4);

        heap.push(item1);
        heap.push(item2);
        item2.setData(12); // Increase priority
        heap.checkPriority(item2);

        assertEquals(8, heap.peek().intValue());
    }

    @Test
    public void testCheckPriorityDecrease1() {
        Heap_Item<Integer>heap_Item0=new Heap_Item<>(6);
        Heap_Item<Integer>heap_Item1=new Heap_Item<>(3);
        Heap_Item<Integer>heap_Item2=new Heap_Item<>(12);
        Heap_Item<Integer>heap_Item3=new Heap_Item<>(2);
        Heap_Item<Integer>heap_Item4=new Heap_Item<>(1);
        Heap_Item<Integer>heap_Item5=new Heap_Item<>(7);
        Heap_Item<Integer>heap_Item6=new Heap_Item<>(9);
        Heap_Item<Integer>heap_Item7=new Heap_Item<>(2);
        Heap_Item<Integer>heap_Item8=new Heap_Item<>(11);
        Heap_Item<Integer>heap_Item9=new Heap_Item<>(14);

        heap_Item0.setRightSon(heap_Item1);
        heap_Item0.setLeftSon(heap_Item2);
        heap_Item1.setRightSon(heap_Item3);
        heap_Item1.setLeftSon(heap_Item4);
        heap_Item2.setRightSon(heap_Item5);
        heap_Item2.setLeftSon(heap_Item6);
        heap_Item1.setAncestor(heap_Item0);
        heap_Item2.setAncestor(heap_Item0);
        heap_Item3.setAncestor(heap_Item1);
        heap_Item4.setAncestor(heap_Item1);
        heap_Item5.setAncestor(heap_Item2);
        heap_Item6.setAncestor(heap_Item2);

        heap.push(heap_Item0);
        heap.push(heap_Item1);
        heap.push(heap_Item2);
        heap.push(heap_Item3);
        heap.push(heap_Item4);
        heap.push(heap_Item5);
        assertSame(heap.push(heap_Item6),heap_Item6);

        heap.checkPriority(heap_Item0);
        heap.checkPriority(heap_Item2);
        heap.checkPriority(heap_Item3);
        heap.checkPriority(heap_Item5);


    }

    @Test
    public void test_out_push(){
        assertNull(heap.push(null));
        Pairing_Heap heap1=new Pairing_Heap<>(heap);
        assertSame(heap1.getRoot(),heap.getRoot());

    }



}
