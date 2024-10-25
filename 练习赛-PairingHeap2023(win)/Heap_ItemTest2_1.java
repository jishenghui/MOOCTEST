package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import javax.enterprise.inject.New;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Heap_ItemTest2 {
	
	
	@Test
	public void test() {
	      Heap_Item<String> heap_Item0 = new Heap_Item<String>(",");
	      Heap_Item<String> heap_Item1 = new Heap_Item<String>(",");
	      heap_Item1.setLeftSon(heap_Item0);
	      heap_Item0.setLeftSon(heap_Item1);
	      heap_Item0.setRightSon(heap_Item1);
	      heap_Item1.replaceChild("$", heap_Item0);
	      heap_Item0.getSonByData(",");
	      heap_Item0.getSonByData("");
	      assertTrue(heap_Item0.hasLeftSon());
	}
	
	@Test
	public void test1() {
		Heap_Item<Integer> heap_Item = new Heap_Item<>();
		heap_Item.setData(1);
		Heap_Item<Integer> heap_Item1 = new Heap_Item<>(heap_Item);
		heap_Item.setLeftSon(heap_Item1);
		
		heap_Item1.setData(null);
		heap_Item1.setData(2);
		heap_Item1.getSonByData(1);
		
		heap_Item.setRightSon(heap_Item1);
		heap_Item.getSonByData(2);
		
		Heap_Item<Integer> heap_Item2 = new Heap_Item<Integer>(3);
		heap_Item1.setRightSon(heap_Item2);
		assertEquals(new Integer(3), heap_Item2.getData());
		assertTrue(heap_Item1.hasRightSon());
		
		heap_Item1.getSonByData(3);
		Heap_Item<Integer> heap_Item3 = new Heap_Item<Integer>();
		
		assertNull(heap_Item3.getData());
		

		
		
		Heap_Item<Integer> heap_Item4 = new Heap_Item<Integer>(9);
//		assertFalse(heap_Item.replaceChild(1, heap_Item4));
		assertTrue(heap_Item.replaceChild(2, heap_Item4));
		
		
		
//		assertNull(heap_Item3.getLeftSon().getData());
//
		assertFalse(heap_Item.replaceChild(3, heap_Item4));
		heap_Item4.setRightSon(heap_Item4);
		assertTrue(heap_Item4.replaceChild(9, heap_Item4));
	}
	
	@Test
	public void test2() {
		Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		Heap_Item<Integer> heap_Item3 = new Heap_Item<>(heap_Item1);
		
//		heap_Item.getMultiWayAncestor();
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item);
		heap_Item3.setAncestor(heap_Item2);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item.setRightSon(heap_Item2);
		heap_Item2.setRightSon(heap_Item3);
		
	
		assertEquals(heap_Item, heap_Item1.getAncestor());
		assertEquals(heap_Item1, heap_Item.getLeftSon());
//		assertNotEquals(heap_Item, heap_Item1.getMultiWayAncestor());
		heap_Item1.getMultiWayAncestor();
		assertNull(heap_Item.getMultiWayAncestor());
//		heap_Item3.getMultiWayAncestor();
	}
	
	@Test
	public void test3(){
		Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		Heap_Item<Integer> heap_Item3 = new Heap_Item<>(4);
		

		
		heap_Item3.setAncestor(heap_Item2);
		heap_Item2.setAncestor(heap_Item);
		heap_Item1.setAncestor(heap_Item);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item1.setLeftSon(heap_Item3);
		
		heap_Item.setRightSon(heap_Item2);
		heap_Item2.setRightSon(heap_Item3);
		
//		heap_Item3.getMultiWayAncestor();
	}
	
	@Test
	public void test4() {
		Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		Heap_Item<Integer> heap_Item3 = new Heap_Item<>(4);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item.removeChild(2);
		heap_Item.setRightSon(heap_Item2);
		heap_Item.removeChild(3);
		
		assertFalse(heap_Item.itIsLeftSon(heap_Item1));
		assertNull(heap_Item.getRightSon());
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item.setRightSon(heap_Item2);
		
		heap_Item.removeChild(3);
		assertNull(heap_Item.getRightSon());
		heap_Item.setRightSon(heap_Item2);
		heap_Item.removeChild(4);
		assertNotNull(heap_Item.getLeftSon());
		assertNotNull(heap_Item.getRightSon());
		heap_Item.removeLeftSon();
		heap_Item.removeRightSon();
		assertNull(heap_Item.getLeftSon());
		assertNull(heap_Item.getRightSon());
	}
	
	@Test
	public void test5() {
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		assertNull(pairing_Heap.getRoot());
		assertNull(pairing_Heap.pop());
		
		
		
		Heap_Item<String> heap_Item = new Heap_Item<>("a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		Pairing_Heap<String> pairing_Heap1 = new Pairing_Heap<>(heap_Item);
		Pairing_Heap<String> pairing_Heap2 = new Pairing_Heap<>(pairing_Heap1);
		assertEquals("a", pairing_Heap1.peek());
		assertEquals("a", pairing_Heap1.pop());
		assertEquals(heap_Item1, pairing_Heap1.push(heap_Item1));
		assertEquals(heap_Item, pairing_Heap1.push(heap_Item));
		
	}
	@Test
	public void test6() {
		Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		Heap_Item<Integer> heap_Item3 = new Heap_Item<>(3);
		
		heap_Item3.setAncestor(heap_Item2);
		heap_Item2.setAncestor(heap_Item);
		heap_Item1.setAncestor(heap_Item);
		
		
		heap_Item2.setLeftSon(heap_Item3);
		heap_Item1.setLeftSon(heap_Item3);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item.setRightSon(heap_Item2);
		
		Pairing_Heap<Integer> pairing_Heap = new Pairing_Heap<>(heap_Item);
		pairing_Heap.checkPriority(heap_Item1);
		pairing_Heap.checkPriority(heap_Item3);
		
		
	}
	
	@Test
	public void test8() {
		Heap_Item<String> heap_Item = new Heap_Item<>("3a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		Heap_Item<String> heap_Item3 = new Heap_Item<>("1d");
		Heap_Item<String> heap_Item4 = new Heap_Item<>("e");
		
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item1);
		heap_Item3.setAncestor(heap_Item2);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item1.setLeftSon(heap_Item3);
		heap_Item1.setRightSon(heap_Item2);
		heap_Item2.setRightSon(heap_Item3);
		heap_Item3.setRightSon(heap_Item4);

		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		pairing_Heap.checkPriority(heap_Item3);
//		System.out.println(heap_Item3.getMultiWayAncestor().getData().compareTo(heap_Item3.getData()));
//		System.out.println(heap_Item3.getData());
//		System.out.println(heap_Item3.getMultiWayAncestor().getData());
//		System.out.println(heap_Item3.getAncestor().getData());
//		System.out.println("3a".compareTo("1d"));
		
	} 

	@Test
	public void test9() {
		Heap_Item<String> heap_Item = new Heap_Item<>("1b");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("2a");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("1d");
		Heap_Item<String> heap_Item3 = new Heap_Item<>("a");
		
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item1);
		heap_Item3.setAncestor(heap_Item1);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item1.setLeftSon(heap_Item2);
		heap_Item1.setRightSon(heap_Item3);
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		pairing_Heap.checkPriority(heap_Item1);
		
		Heap_Item<String> heap_Item4 = new Heap_Item<>("2a");
		Heap_Item<String> heap_Item5 = new Heap_Item<>("1d");
		Heap_Item<String> heap_Item6 = new Heap_Item<>("a");
		
		heap_Item5.setAncestor(heap_Item4);
		heap_Item6.setAncestor(heap_Item4);
		
		heap_Item4.setLeftSon(heap_Item5);
		heap_Item4.setRightSon(heap_Item6);
		
		Pairing_Heap<String> pairing_Heap1 = new Pairing_Heap<>(heap_Item4);
		pairing_Heap.checkPriority(heap_Item4);
	}
	
	@Test
	public void test10() {
		Heap_Item<String> heap_Item = new Heap_Item<>("a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item1);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item1.setLeftSon(heap_Item2);
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		pairing_Heap.pop();
	}
	
	@Test
	public void test11() {
		Heap_Item<String> heap_Item = new Heap_Item<>("a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item1);
		
		heap_Item.setLeftSon(heap_Item1);
		heap_Item1.setRightSon(heap_Item2);
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		pairing_Heap.pop();
	}
	
	@Test
	public void test12() {
		Heap_Item<String> heap_Item = new Heap_Item<>("a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		
		heap_Item1.setAncestor(heap_Item);
		heap_Item.setLeftSon(heap_Item1);
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		
//		assertNull(pairing_Heap.getRoot());
		pairing_Heap.push(null);
		Pairing_Heap<String> pairing_Heap1 = new Pairing_Heap<>(heap_Item);
		pairing_Heap1.push(heap_Item1);
	}
	
	@Test
	public void test13() {
		Heap_Item<String> heap_Item = new Heap_Item<>("3a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("1b");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		Heap_Item<String> heap_Item3 = new Heap_Item<>("e");
		
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item1);
		heap_Item3.setAncestor(heap_Item1);
		heap_Item1.setLeftSon(heap_Item2);
		heap_Item1.setRightSon(heap_Item3);
		heap_Item.setLeftSon(heap_Item1);
		
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		pairing_Heap.checkPriority(heap_Item);
		
		
		
	}
	
	
	@Test
	public void test14() {
		Heap_Item<String> heap_Item = new Heap_Item<>("3a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("1b");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		Heap_Item<String> heap_Item3 = new Heap_Item<>("e");
		
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item1);
		heap_Item1.setLeftSon(heap_Item2);
		heap_Item.setLeftSon(heap_Item1);
		
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		pairing_Heap.checkPriority(heap_Item);
		
		Heap_Item<String> heap_Item4 = new Heap_Item<>("a");
		
		Pairing_Heap<String> pairing_Heap2 = new Pairing_Heap<>(heap_Item4);
		pairing_Heap2.checkPriority(heap_Item4);
		
		
		
	}
	
	@Test
	public void test15() {
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		Heap_Item<String> heap_Item = new Heap_Item<>("b");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("a");
		heap_Item1.setAncestor(heap_Item);
		heap_Item.setLeftSon(heap_Item1);
		
		pairing_Heap.checkPriority(heap_Item1);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
	}
	@Test
	public void test16() {
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		Heap_Item<String> heap_Item = new Heap_Item<>("a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("a");
		heap_Item1.setAncestor(heap_Item);
		heap_Item1.setLeftSon(heap_Item2);
		heap_Item.setLeftSon(heap_Item1);
		pairing_Heap.checkPriority(heap_Item1);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
	}
	@Test
	public void test17() {
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		Heap_Item<String> heap_Item = new Heap_Item<>("a");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("a");
		Heap_Item<String> heap_Item3 = new Heap_Item<>("1");
		heap_Item2.setRightSon(heap_Item3);
		heap_Item1.setAncestor(heap_Item);
		heap_Item1.setLeftSon(heap_Item2);
		heap_Item.setLeftSon(heap_Item1);
		pairing_Heap.checkPriority(heap_Item1);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
	}
	
	
	@Test
	public void test18() {
		Heap_Item<Integer> heap_Item = new Heap_Item<>();
		heap_Item.removeChild(2);
	}
	@Test
	public void test19() {
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		Heap_Item<String> heap_Item = new Heap_Item<>("1");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("2");
		Heap_Item<String> heap_Item2 = new Heap_Item<>("3");
		Heap_Item<String> heap_Item3 = new Heap_Item<>("4");
		heap_Item1.setAncestor(heap_Item);
		heap_Item2.setAncestor(heap_Item1);
		heap_Item3.setAncestor(heap_Item2);
		heap_Item2.setLeftSon(heap_Item3);
		heap_Item1.setRightSon(heap_Item2);
		
		heap_Item.setLeftSon(heap_Item1);
		
		
	
		pairing_Heap.checkPriority(heap_Item);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
		
		
	}
	@Test
	public void test20() {
		
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		Heap_Item<String> heap_Item = new Heap_Item<>("1");
		Heap_Item<String> heap_Item1 = new Heap_Item<>("2");
		heap_Item.setRightSon(heap_Item1);
		
		
		
	
		pairing_Heap.checkPriority(heap_Item);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
		
		
	}
	
	@Test
	public void testException() {
		Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		Heap_Item<Integer> heap_Item1 = new Heap_Item<>(1);
		heap_Item.setRightSon(heap_Item1);
		try {
		heap_Item1.setAncestor(heap_Item);
//		fail("空指针异�?");
		}catch (NullPointerException e) {
			// TODO: handle exception
		}
//		heap_Item1.getMultiWayAncestor();
	}
	
	@Test
	public void test21() throws Exception {
		Class<Pairing_Heap> class1 = Pairing_Heap.class;
		Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		Method method = class1.getDeclaredMethod("pop_heap_item");
		method.setAccessible(true);
		assertNull(method.invoke(pairing_Heap));

	}
}
