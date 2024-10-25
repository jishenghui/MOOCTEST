package net.mooctest;
import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;



import org.junit.Test;

import net.mooctest.UnrolledLinkedList.ULLIterator;

public class Test1 {
	private void assertThrows(Runnable r, Class<? extends Throwable> exception) {
		try {
			r.run();
			fail();
		} catch (Exception e) {
			assertTrue(exception.isAssignableFrom(e.getClass()));
		}
	}
	@Test
	public void test1(){
		UnrolledLinkedList<Integer> unrolledLinkedList = new UnrolledLinkedList<>(8);
		UnrolledLinkedList<Integer> unrolledLinkedList1 = new UnrolledLinkedList<>();
		assertFalse(unrolledLinkedList.remove(null));
		assertFalse(unrolledLinkedList.remove(new Integer(1)));
		try {
			UnrolledLinkedList<Integer> unrolledLinkedList2 = new UnrolledLinkedList<>(7);
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
		
		assertEquals(0, unrolledLinkedList.size());
//		boolean add = unrolledLinkedList.add(1);
		assertTrue(unrolledLinkedList.add(1));
		assertEquals(1, unrolledLinkedList.size());
		assertTrue(unrolledLinkedList1.isEmpty());
		assertFalse(unrolledLinkedList.isEmpty());
		assertTrue(unrolledLinkedList.contains(1));
		assertFalse(unrolledLinkedList.contains(2));
		
		Iterator<Integer> iterator = unrolledLinkedList.iterator();
//		assertEquals((Integer)1, iterator.next());
		assertNotNull(unrolledLinkedList.iterator());
		assertNotNull(unrolledLinkedList.toArray());
		assertNotNull(unrolledLinkedList1.toArray());
		Integer[] integers = new Integer[0];
		Integer[] integers1 = new Integer[10];
		Integer[] integers2 = new Integer[1];
		assertNotNull(unrolledLinkedList.toArray(integers));
		assertNotNull(unrolledLinkedList.toArray(integers1));
		assertNotNull(unrolledLinkedList.toArray(integers));
		assertNotNull(unrolledLinkedList.toArray(integers2));
		assertNotNull(unrolledLinkedList1.toArray(integers2));
		unrolledLinkedList1.firstNode = null;
		assertNotNull(unrolledLinkedList1.toArray());
		assertNotNull(unrolledLinkedList1.toArray(integers1));
		assertArrayEquals(integers, unrolledLinkedList1.toArray(integers));
		assertFalse(unrolledLinkedList.remove(null));
		assertTrue(unrolledLinkedList.remove(new Integer(1)));
		assertFalse(unrolledLinkedList.remove(new Integer(2)));
		unrolledLinkedList.firstNode.elements[0] = null;
		assertFalse(unrolledLinkedList.remove(null));
		unrolledLinkedList.firstNode = null;
		assertFalse(unrolledLinkedList.remove(null));
		assertFalse(unrolledLinkedList.remove(new Integer(2)));		
		assertEquals(unrolledLinkedList.toArray().length, 0);
		unrolledLinkedList.add(1);
		assertEquals(1, unrolledLinkedList.toArray().length);
		unrolledLinkedList.toArray();
	}
	
	@Test
	public void test2(){
		UnrolledLinkedList<Integer> unrolledLinkedList1 = new UnrolledLinkedList<>();
		assertTrue(unrolledLinkedList1.add(null));
		assertTrue(unrolledLinkedList1.add(2));
		assertTrue(unrolledLinkedList1.remove(null));
//		unrolledLinkedList1.firstNode.numElements = -1;
		assertFalse(unrolledLinkedList1.remove(new Integer(10)));
		try {
			unrolledLinkedList1.containsAll(null);
		} catch (Exception e) {
			// TODO: handle exception
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		assertTrue(unrolledLinkedList1.containsAll(arrayList));
		assertFalse(unrolledLinkedList1.addAll(arrayList));
		assertFalse(unrolledLinkedList1.removeAll(arrayList));
//		assertTrue(unrolledLinkedList1.retainAll(arrayList));
		arrayList.add(2);
		assertTrue(unrolledLinkedList1.containsAll(arrayList));
		assertTrue(unrolledLinkedList1.addAll(arrayList));
		assertTrue(unrolledLinkedList1.removeAll(arrayList));
//		assertTrue(unrolledLinkedList1.retainAll(arrayList));
		arrayList.add(3);
		assertFalse(unrolledLinkedList1.containsAll(arrayList));
		try {
			unrolledLinkedList1.addAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		assertTrue(unrolledLinkedList1.addAll(arrayList));
		try {
			unrolledLinkedList1.removeAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		assertTrue(unrolledLinkedList1.removeAll(arrayList));
		try {
			unrolledLinkedList1.retainAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		assertFalse(unrolledLinkedList1.retainAll(arrayList));
		
		UnrolledLinkedList<Integer> unrolledLinkedList2 = new UnrolledLinkedList<>();
		assertTrue(unrolledLinkedList2.add(2));
		ArrayList<Integer> arrayList2 = new ArrayList<>();
//		arrayList2.add(2);
		assertTrue(unrolledLinkedList2.retainAll(arrayList2));
		unrolledLinkedList1.clear();
		assertEquals(0, unrolledLinkedList1.firstNode.numElements);
		unrolledLinkedList1.firstNode.numElements = -1;
		unrolledLinkedList1.clear();
		assertEquals(0, unrolledLinkedList1.firstNode.numElements);
		unrolledLinkedList2.addAll(arrayList);
		unrolledLinkedList2.firstNode.numElements=-1;
		assertFalse(unrolledLinkedList2.remove(null));
//		unrolledLinkedList2.firstNode = 
//		unrolledLinkedList2.clear();


	}
	@Test
	public void testName() throws Exception {
		UnrolledLinkedList<Integer> unrolledLinkedList = new UnrolledLinkedList<>();
		unrolledLinkedList.clear();
		assertTrue(unrolledLinkedList.isEmpty());
		unrolledLinkedList.add(1);
		assertFalse(unrolledLinkedList.isEmpty());
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
			arrayList.add(i);
		}
		unrolledLinkedList.clear();
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
		}
		
		assertTrue(unrolledLinkedList.removeAll(arrayList));
		arrayList.add(3);
		assertFalse(unrolledLinkedList.removeAll(arrayList));
		ArrayList<Integer> list = new ArrayList<>();
		Integer[] integers = new Integer[30];
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
			assertEquals(new Integer(i), unrolledLinkedList.get(i));
			list.add(i);
			integers[i] = i;
		}
		try {
			unrolledLinkedList.get(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			unrolledLinkedList.get(30);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
//		System.out.println(unrolledLinkedList.lastNode.numElements);
		assertEquals(unrolledLinkedList.get(8), new Integer(8));
		assertEquals(unrolledLinkedList.get(15), new Integer(15));
		UnrolledLinkedList<Integer> unrolledLinkedList2 = new UnrolledLinkedList<Integer>();
		
		assertEquals(integers.length,unrolledLinkedList2.toArray(integers).length);
	}
	
	@Test
	public void testName2() throws Exception {
		UnrolledLinkedList<Integer> unrolledLinkedList = new UnrolledLinkedList<>();

//		unrolledLinkedList.se, element)
		assertThrows(()->{
			unrolledLinkedList.set(-1, 2);
		}, IndexOutOfBoundsException.class);
		assertThrows(()->{
			unrolledLinkedList.set(0, 2);
		}, IndexOutOfBoundsException.class);
		unrolledLinkedList.add(1);
		assertEquals(1, (int)unrolledLinkedList.set(0, 1));
		assertTrue(unrolledLinkedList.remove(new Integer(1)));
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
		}
		
		assertEquals(8, (int)unrolledLinkedList.set(8, 10));
		assertEquals(15, (int)unrolledLinkedList.set(15, 9));
		assertEquals(14, (int)unrolledLinkedList.set(14, 9));
		unrolledLinkedList.clear();
		assertThrows(()->{
			unrolledLinkedList.add(-1, 2);
		}, IndexOutOfBoundsException.class);
		assertThrows(()->{
			unrolledLinkedList.add(1, 2);
		}, IndexOutOfBoundsException.class);
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
		}
		unrolledLinkedList.add(8,3);
		assertEquals(3, (int)unrolledLinkedList.get(8));
		assertEquals(31, unrolledLinkedList.size);
		unrolledLinkedList.add(16,6);
		assertEquals(6,(int)unrolledLinkedList.get(16));
		assertEquals(32, unrolledLinkedList.size());
		assertThrows(()->{
			unrolledLinkedList.remove(-1);
		}, IndexOutOfBoundsException.class);
		assertThrows(()->{
			unrolledLinkedList.remove(100);
		}, IndexOutOfBoundsException.class);
		assertEquals(3, (int)unrolledLinkedList.remove(8));
		assertEquals(6, (int)unrolledLinkedList.remove(15));
		assertEquals(15, (int)unrolledLinkedList.remove(15));
		unrolledLinkedList.clear();
		assertTrue(unrolledLinkedList.add(null));
		assertEquals(0, unrolledLinkedList.indexOf(null));
		assertTrue(unrolledLinkedList.remove(null));
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
		}
		assertEquals(-1, unrolledLinkedList.indexOf(null));
		assertEquals(-1, unrolledLinkedList.lastIndexOf(null));
		assertTrue(unrolledLinkedList.add(null));
		assertTrue(unrolledLinkedList.add(null));
		assertEquals(31, unrolledLinkedList.lastIndexOf(null));
		assertEquals(-1, unrolledLinkedList.lastIndexOf(31));
		assertEquals(0, unrolledLinkedList.lastIndexOf(0));
		unrolledLinkedList.clear();
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
		}
		UnrolledLinkedList.ULLIterator listIterator = (UnrolledLinkedList.ULLIterator)unrolledLinkedList.listIterator();
		assertEquals(1, listIterator.nextIndex());
		while (listIterator.hasNext()) {
			Integer integer = (Integer) listIterator.next();
		}
		
		assertThrows(()->{
			unrolledLinkedList.listIterator(-1);
		}, IndexOutOfBoundsException.class);
		assertThrows(()->{
			unrolledLinkedList.listIterator(31);
		}, IndexOutOfBoundsException.class);
		UnrolledLinkedList.ULLIterator listIterator2 = (UnrolledLinkedList.ULLIterator)unrolledLinkedList.listIterator(8);
		assertEquals(9, listIterator2.nextIndex());
		UnrolledLinkedList.ULLIterator listIterator3 = (UnrolledLinkedList.ULLIterator)unrolledLinkedList.listIterator(15);
		assertEquals(16, listIterator3.nextIndex());
		while (listIterator2.hasPrevious()) {
			Integer previous = (int)listIterator2.previous();
		}
		assertThrows(()->{
//			unrolledLinkedList.add(null);
			UnrolledLinkedList.ULLIterator listIterator4 = (UnrolledLinkedList.ULLIterator)unrolledLinkedList.listIterator(8);
			listIterator4.ptr = 2;
			listIterator4.currentNode.numElements = 2;
			listIterator4.currentNode.next = null;
			listIterator4.next();
			
		}, NoSuchElementException.class);
		assertThrows(()->{
			unrolledLinkedList.add(null);
			UnrolledLinkedList.ULLIterator listIterator4 = (UnrolledLinkedList.ULLIterator)unrolledLinkedList.listIterator(8);
//			listIterator4.ptr = 2;
//			listIterator4.currentNode.numElements = 2;
			listIterator4.currentNode.previous = null;
			listIterator4.previous();
			
		}, NoSuchElementException.class);
		assertEquals(28, listIterator.previousIndex());
		UnrolledLinkedList.ULLIterator lIterator5 = unrolledLinkedList.new ULLIterator(null, 0, 0);
		assertEquals(1, lIterator5.nextIndex());
		assertEquals(-1, lIterator5.previousIndex());
//		listIterator.add(3);
		assertEquals(29, listIterator.index);
		assertThrows(()->{
			listIterator.remove();	
		}, ConcurrentModificationException.class);
		unrolledLinkedList.clear();
		for (int i = 0; i < 30; i++) {
			assertTrue(unrolledLinkedList.add(i));
		}
		UnrolledLinkedList.ULLIterator lt = (ULLIterator) unrolledLinkedList.listIterator();
		assertEquals(1, lt.nextIndex());
		lt.next();
		lt.remove();
		assertEquals(2, lt.nextIndex());
		lt = (ULLIterator) unrolledLinkedList.listIterator();
		Integer i = (Integer)lt.next();
		lt.set(20);
	
//		System.out.println();
		assertFalse(lt.currentNode.elements[lt.ptr].equals(i));
		lt.next();
		lt.add(new Integer(90));
		assertEquals(2,lt.index);
//		unrolledLinkedList.insertIntoNode(unrolledLinkedList.new Node(), ptr, element);
	}
	@Test
	public void testName3() throws Exception {
		UnrolledLinkedList<Integer> unrolledLinkedList = new UnrolledLinkedList<>();
		assertEquals(0, unrolledLinkedList.toArray().length);
		for (int i = 0; i < 60; i++) {
			unrolledLinkedList.add(i);
		}
//		Object[] array = unrolledLinkedList.toArray();
		assertEquals(60, unrolledLinkedList.toArray().length);
		assertEquals(60, unrolledLinkedList.toArray(new Integer[60]).length);
		
		UnrolledLinkedList<Integer>.Node node = unrolledLinkedList.new Node();
		node.next = unrolledLinkedList.new Node();
		node.numElements = 16;
		unrolledLinkedList.insertIntoNode(node, 2, 8);
	}
	@Test
	public void testName4() throws Exception {
		UnrolledLinkedList<Integer> unrolledLinkedList = new UnrolledLinkedList<>();

		assertEquals(0, unrolledLinkedList.toArray().length);
		for (int i = 0; i < 60; i++) {
			unrolledLinkedList.add(i);
		}
		assertTrue(unrolledLinkedList.add(null));		
		assertEquals(unrolledLinkedList.size()-1,unrolledLinkedList.indexOf(null));
		assertEquals(unrolledLinkedList.indexOf(59), 59);
		unrolledLinkedList.lastNode.numElements-=1;
		assertEquals(-1, unrolledLinkedList.lastIndexOf(null));
	}
	@Test
	public void testName5() throws Exception {
//		UnrolledLinkedList<Integer> unrolledLinkedList = new UnrolledLinkedList<>();
		UnrolledLinkedList<Integer> unrolledLinkedList1 = new UnrolledLinkedList<>();
		assertTrue(unrolledLinkedList1.add(null));
		assertTrue(unrolledLinkedList1.add(2));
		assertTrue(unrolledLinkedList1.remove(null));
		assertEquals(1, unrolledLinkedList1.size());
		for (int i = 0; i < 100; i++) {
			assertTrue(unrolledLinkedList1.add(i));
		}
		assertFalse(unrolledLinkedList1.remove(null));
		Integer[] integers = new Integer[1];
		assertEquals(101, unrolledLinkedList1.toArray(integers).length);
		assertEquals(2, (int)unrolledLinkedList1.toArray(new Integer[100])[0]);
		for (int i = 0; i <= 100; i++) {
			unrolledLinkedList1.remove(0);
		}
		unrolledLinkedList1.clear();
		assertFalse(unrolledLinkedList1.remove(new Integer(2)));
		assertEquals(unrolledLinkedList1.size(),0);
		Integer[] aIntegers = new Integer[0];
		Integer[] aIntegers2 = unrolledLinkedList1.toArray(aIntegers);
		assertEquals(aIntegers.length, aIntegers2.length);
		
		
	}
}
