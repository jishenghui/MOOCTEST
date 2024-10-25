package net.mooctest;



import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

import org.junit.Test;

import net.mooctest.UnrolledLinkedList.ULLIterator;


public class UnrolledLinkedListTest {

	@Test(timeout = 2000)
	public void test() {
		UnrolledLinkedList<Integer> unrolledLinkedList0 = new UnrolledLinkedList<Integer>();
		assertEquals(0, unrolledLinkedList0.size());
		assertTrue(unrolledLinkedList0.isEmpty());
	}

	@Test
	public void test1() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		try {
			for (int i = 0; i < 9; i++) {
				assertNotNull(uLinkedList.remove(i));
//				assertEquals(i, (int)uLinkedList.remove(i));
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
		uLinkedList.remove(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		try {
			UnrolledLinkedList<Integer> uLinkedList1 = new UnrolledLinkedList<>(2);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
		UnrolledLinkedList<Integer> uLinkedList2 = new UnrolledLinkedList<>(8);
		for (int i = 0; i < 10; i++) {
			uLinkedList2.add(i);
		}
	
		try {
			uLinkedList.add(-1,2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.add(20,2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		for (int i = 0; i < 5; i++) {
			uLinkedList.add(i,i++);
			
		}
		UnrolledLinkedList<Integer> uLinkedList3 = new UnrolledLinkedList<>();
		for (int i = 0; i < 5; i++) {
			uLinkedList3.add(i);
		}
		uLinkedList3.add(1,2);
		ArrayList<Integer> list = new ArrayList<Integer>();
	
		
		list.add(1);
		list.add(2);
		
		assertTrue(uLinkedList3.addAll(list));
		uLinkedList.clear();
		uLinkedList2.clear();
		uLinkedList3.clear();
		try {
			uLinkedList3.addAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}
	
	@Test
	public void test2() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		UnrolledLinkedList<Integer> uLinkedList1 = new UnrolledLinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		
		assertTrue(uLinkedList.contains(2));
		assertFalse(uLinkedList.contains(-1));
		uLinkedList1.firstNode.elements[1] = null;
		assertEquals(-1, uLinkedList.indexOf(null));
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(20);
		list.add(1);
		list.add(2);
		assertTrue(uLinkedList.containsAll(list));
		assertFalse(uLinkedList.containsAll(list1));
		try {
			uLinkedList.containsAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	@Test
	public void test3() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		
		try {
			uLinkedList.get(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.get(2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		
		for (int i = 0; i < 10; i++) {
			assertNotNull(uLinkedList.get(i));
		}
		
	
	}
	
	@Test
	public void test4() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();

		
		try {
			uLinkedList.set(-1, 2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.set(2, 2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	

		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		for (int i = 0; i < 10; i++) {
			uLinkedList.set(i, i++);
		}
		assertFalse(uLinkedList.isEmpty());
	}
	
	@Test
	public void test5() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
//		UnrolledLinkedList.ULLIterator uIterator1 = (ULLIterator) uLinkedList.iterator();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		UnrolledLinkedList.ULLIterator uIterator = (ULLIterator) uLinkedList.iterator();
		UnrolledLinkedList.ULLIterator uIterator1 = (ULLIterator) uLinkedList.listIterator();
		uIterator.add(2);
		try {
			uIterator.checkForModification();
		} catch (ConcurrentModificationException e) {
			// TODO: handle exception
		}

		assertTrue(uIterator.hasNext());
		assertFalse(uIterator.hasPrevious());
//		assertFalse(uIterator1.hasPrevious());
		try {
			uIterator.previous();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

	}
	@Test
	public void test6() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		UnrolledLinkedList<Integer> uLinkedList1 = new UnrolledLinkedList<>();
//		UnrolledLinkedList.ULLIterator uIterator1 = (ULLIterator) uLinkedList.iterator();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		assertEquals(-1, uLinkedList.lastIndexOf(null));
		assertEquals(2, uLinkedList.lastIndexOf(2));
		assertEquals(-1, uLinkedList.lastIndexOf(20));
		
	}
	
	@Test
	public void test7() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		try {
			uLinkedList.listIterator(2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.listIterator(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		uLinkedList.listIterator(2);
		uLinkedList.listIterator(9);
		uLinkedList.listIterator(10);
		UnrolledLinkedList.Node node = uLinkedList.new Node();
		node.next = node;
		UnrolledLinkedList.Node node1 = uLinkedList.new Node();
		UnrolledLinkedList.Node node2 = uLinkedList.new Node();
		
		node1.next = node1;
		node1.next = null;
		uLinkedList.mergeWithNextNode(node);
//		uLinkedList.mergeWithNextNode(uLinkedList.new Node());
	}
	
	@Test
	public void test8() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		
		assertFalse(uLinkedList.remove(null));
//		assertTrue(uLinkedList.remove(2));
		
	}
	@Test
	public void test9() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		
		
		assertTrue(uLinkedList.remove(new Integer(2)));
		assertFalse(uLinkedList.remove(new Integer(20)));
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(3);
		arrayList1.add(20);
		arrayList.add(2);
		arrayList.add(3);
		try {
			uLinkedList.removeAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.retainAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		assertTrue(uLinkedList.removeAll(arrayList));
		assertTrue(uLinkedList.retainAll(arrayList));
		assertFalse(uLinkedList.retainAll(arrayList1));
	}
	@Test
	public void test10() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		assertNotNull(uLinkedList.toArray());
		Integer[] a = {1,2,3,4};
		Integer[] a1 = new Integer[18];
		assertNotNull(uLinkedList.toArray(a));
		assertNotNull(uLinkedList.toArray(a1));
	}
	@Test
	public void test11() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		UnrolledLinkedList.ULLIterator uIterator = (UnrolledLinkedList.ULLIterator)uLinkedList.iterator();

		assertEquals(1, uIterator.next());
		try {
			uIterator.ptr = 20;
			uIterator.next();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		uIterator.ptr = 20;
		uIterator.currentNode.next = uLinkedList.new Node();
		uIterator.next();
		assertEquals(3, uIterator.nextIndex());
		assertEquals(1, uIterator.previousIndex());
		uIterator.ptr = 0;
//		uIterator.remove();
	}
	@Test
	public void test12() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		UnrolledLinkedList.ULLIterator uIterator = (UnrolledLinkedList.ULLIterator)uLinkedList.iterator();
		uIterator.set(3);
		uIterator.remove();
	}
	@Test
	public void test13() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		UnrolledLinkedList.ULLIterator uIterator = (UnrolledLinkedList.ULLIterator)uLinkedList.iterator();
		uIterator.ptr = 2;
		uIterator.previous();
		uIterator.ptr = 0;
		
		uIterator.currentNode.previous = uLinkedList.new Node();
		
		try {
			uIterator.previous();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Test
	public void test14() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		uLinkedList.firstNode.numElements = 1;
		try {
			uLinkedList.add(1,2);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.add(8,2);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.remove(1);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.remove(8);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}
	
	@Test
	public void test15() {
		UnrolledLinkedList<String> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add("a"+i);
		}
		uLinkedList.add(null);
		assertEquals(10, uLinkedList.indexOf(null));
		uLinkedList.add(null);
		assertEquals(11, uLinkedList.lastIndexOf(null));
		
	}
	@Test
	public void test16() {
		UnrolledLinkedList<String> uLinkedList = new UnrolledLinkedList<>();
		for (int i = 0; i < 10; i++) {
			uLinkedList.add("a"+i);
		}
		uLinkedList.firstNode.numElements = 1;
		try {
			uLinkedList.listIterator(2);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.listIterator(8);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		
	}
	
	@Test
	public void test17() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		UnrolledLinkedList.Node uNode = uLinkedList.new Node();
		UnrolledLinkedList.Node uNode1 = uLinkedList.new Node();
		uNode.next = uNode1;
		uNode.numElements = 8;
		uLinkedList.insertIntoNode(uNode, 2, 3);
	}
	@Test
	public void test18() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		UnrolledLinkedList.Node uNode = uLinkedList.new Node();
		UnrolledLinkedList.Node uNode1 = uLinkedList.new Node();
		uNode.next = uNode1;
		uNode1.numElements = 1;
		uNode.numElements = 6;
		uLinkedList.removeFromNode(uNode, 2);
		UnrolledLinkedList.Node uNode3 = uLinkedList.new Node();
		UnrolledLinkedList.Node uNode4 = uLinkedList.new Node();
		uNode3.next = uNode;
		uNode3.previous = uNode4;
		uNode4.numElements = 1;
		uNode3.numElements = 6;
		try {
			uLinkedList.removeFromNode(uNode3, 0);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}
	
	@Test
	public void test19() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		UnrolledLinkedList.Node uNode = uLinkedList.new Node();
		UnrolledLinkedList.Node uNode1 = uLinkedList.new Node();
		uNode.next = uNode1;
		uNode1.numElements = 1;
		uNode.numElements = 6;
		uLinkedList.firstNode.numElements=2;
		uLinkedList.set(2,3);
		uLinkedList.get(2);
		uLinkedList.lastNode.numElements=2;
		try {
			uLinkedList.set(5,3);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			uLinkedList.get(5);
		} catch (Exception e) {
			// TODO: handle exception
		}
		uLinkedList.lastNode = uNode1;
		uLinkedList.mergeWithNextNode(uNode);
	}
	
	@Test
	public void test20() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		assertEquals(0, uLinkedList.size());
		Object[] objects = new Object[0];
		Object[] objects1 = new Object[10];
		Integer[] i1 = new Integer[0];
		Integer[] i2 = new Integer[10];
		Integer[] i3 = new Integer[11];
		Integer[] i4 = uLinkedList.toArray(i1);
		assertArrayEquals(objects,uLinkedList.toArray());
		assertArrayEquals(i1, uLinkedList.toArray(i1));
		assertEquals(0, i4.length);
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
			objects1[i] = i;
			i2[i]=i;
		}
		assertEquals(10, uLinkedList.size());
		assertArrayEquals(i2, uLinkedList.toArray(i1));
		assertArrayEquals(i3, uLinkedList.toArray(i3));
		assertArrayEquals(objects1, uLinkedList.toArray());
	}
	@Test
	public void test21() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		boolean b = false;
		assertTrue(uLinkedList.add(1));
	}
	@Test
	public void test22() {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
		}
		assertFalse(uLinkedList.remove(null));
	}
	@Test
	public void test23() throws Exception {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		Integer[] integers = new Integer[10];
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		Integer[] integers1 = new Integer[0];
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
			integers[i] = i;
			list.add(i);
		}

		
		assertArrayEquals(integers, uLinkedList.toArray(integers1));
		assertTrue(uLinkedList.addAll(list));
		assertFalse(uLinkedList.addAll(list1));
		list1.add(100);
		assertFalse(uLinkedList.removeAll(list1));
		try {
			uLinkedList.get(-1);

		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	
		uLinkedList.firstNode.numElements = 0;
	
		uLinkedList.clear();
		uLinkedList.firstNode.numElements = -1;
		uLinkedList.clear();
		assertEquals(0, uLinkedList.firstNode.numElements);
		
	}
	@Test
	public void testName() throws Exception {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		Integer[] integers = new Integer[10];
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		Integer[] integers1 = new Integer[0];
		for (int i = 0; i < 10; i++) {
			uLinkedList.add(i);
			integers[i] = i;
			list.add(i);
		}
		
	
		assertEquals(new Integer(0), uLinkedList.set(0, null));
		assertEquals(null, uLinkedList.get(0));
	}
	@Test
	public void testName2() throws Exception {
		UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		assertEquals(uLinkedList.toArray(new Integer[0]).length, 0);
		for (int i = 0; i < 30; i++) {
			assertTrue(uLinkedList.add(i));
		}
		for (int i = 0; i < 30; i++) {
			assertEquals(i,(int)uLinkedList.remove(0));
		}
		for (int i = 0; i < 30; i++) {
			assertTrue(uLinkedList.add(i));
		}
		for (int i = 0; i < 30; i++) {
			assertTrue(uLinkedList.remove((Integer)i));
		}
		for (int i = 0; i < 30; i++) {
			assertTrue(uLinkedList.add(i));
		}
		assertEquals(15, (int)uLinkedList.remove(15));
		
		
		
	}
	
}
