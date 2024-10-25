package net.mooctest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.junit.Test;


public class UnrolledLinkedListTest {
	
	private void assertThrows(Runnable r, Class<? extends Throwable> exception) {
		try {
			r.run();
			fail();
		} catch (Exception e) {
			assertTrue(exception.isAssignableFrom(e.getClass()));
		}
	}
	
	@Test
	public void testThrows() {
		assertThrows(() -> {
			new UnrolledLinkedList<Integer>(1);
		}, IllegalArgumentException.class);
		UnrolledLinkedList<Integer> list = new UnrolledLinkedList<Integer>();
		assertThrows(() -> {
			list.add(5, 0);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.add(-1, 0);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.get(5);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.get(-1);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.remove(5);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.remove(-1);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.addAll(null);
		}, NullPointerException.class);
		assertThrows(() -> {
			list.removeAll(null);
		}, NullPointerException.class);
		assertThrows(() -> {
			list.retainAll(null);
		}, NullPointerException.class);
		assertThrows(() -> {
			list.containsAll(null);
		}, NullPointerException.class);
		assertThrows(() -> {
			UnrolledLinkedList<Integer>.ULLIterator it = (UnrolledLinkedList<Integer>.ULLIterator)list.iterator();
			it.next();
		}, NoSuchElementException.class);
		assertThrows(() -> {
			UnrolledLinkedList<Integer>.ULLIterator it = (UnrolledLinkedList<Integer>.ULLIterator)list.iterator();
			it.previous();
		}, NoSuchElementException.class);
		assertThrows(() -> {
			list.add(1);
			Iterator<Integer> it = list.iterator();
			list.add(1);
			it.next();
		}, ConcurrentModificationException.class);
		assertThrows(() -> {
			UnrolledLinkedList<Integer>.ULLIterator it = (UnrolledLinkedList<Integer>.ULLIterator)list.iterator();
			it.next();
			list.add(2);
			it.previous();
		}, ConcurrentModificationException.class);
		assertThrows(() -> {
			list.listIterator(-1);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.listIterator(100);
		}, IndexOutOfBoundsException.class);
		assertThrows(() -> {
			list.set(100, -1);
		}, IndexOutOfBoundsException.class);
	}
	
	

	@Test(timeout = 2000)
	public void test() {
		UnrolledLinkedList<Integer> list = new UnrolledLinkedList<Integer>();
		assertEquals(0, list.size());
		assertTrue(list.isEmpty());
		assertFalse(list.contains(null));
		assertEquals(list.toArray().length, 0);
		assertEquals(list.toArray(new Integer[0]).length, 0);
		assertEquals(-1, list.lastIndexOf(0));
		assertEquals(-1, list.lastIndexOf(null));
		assertFalse(list.remove(null));
		List<Integer> stubList = Arrays.asList(1,2,3,4);
		assertFalse(list.containsAll(stubList));
		assertFalse(list.removeAll(stubList));
		assertFalse(list.retainAll(stubList));
		list.clear();
		
		assertTrue(list.add(0));
		assertFalse(list.isEmpty());
		assertTrue(list.addAll(stubList));
		assertTrue(list.remove(new Integer(1)));
		assertTrue(list.retainAll(Arrays.asList(0, 3, 4)));
		assertTrue(list.containsAll(Arrays.asList(0, 3)));
		assertEquals(4, (int)list.set(2, 5));
		assertEquals(5, (int)list.remove(2));
		assertTrue(list.removeAll(stubList));
		
		for(int i = 0; i < 60; i++) list.add(i);
		UnrolledLinkedList<Integer>.ULLIterator it = (UnrolledLinkedList<Integer>.ULLIterator)list.iterator();
		assertEquals(1, it.nextIndex());
		while(it.hasNext()) {
			it.next();
		}
		assertEquals(it.previousIndex(), list.size() - 2);
		while(it.hasPrevious()) {
			it.previous();
		}
		

		it = (UnrolledLinkedList<Integer>.ULLIterator)list.iterator();
		it.next();
		it.add(-1);

		it = (UnrolledLinkedList<Integer>.ULLIterator)list.iterator();
		it.next();
		it.remove();

		it = (UnrolledLinkedList<Integer>.ULLIterator)list.iterator();
		it.next();
		it.set(-2);
		
		ListIterator<Integer> lit = list.listIterator();
		assertEquals(-2, (int) lit.next());
		lit = list.listIterator(3);
		assertEquals(3, (int) lit.next());
		lit = list.listIterator(17);
		assertEquals(17, (int) lit.next());
		lit = list.listIterator(44);
		assertEquals(44, (int) lit.next());
		lit = list.listIterator(59);
		assertEquals(59, (int) lit.next());
		list.add(5, 101);
		list.add(18, 102);
		list.add(44, 103);
		
		assertEquals(101, (int) list.get(5));
		assertEquals(102, (int) list.get(18));
		assertEquals(103, (int) list.get(44));
		assertEquals(44, list.indexOf(103));
		assertEquals(44, list.lastIndexOf(103));
		assertEquals(103, (int) list.set(44, null));
		
		assertEquals(44, list.indexOf(null));
		assertEquals(44, list.lastIndexOf(null));
		assertEquals(101, (int) list.set(5, 201));
		assertEquals(102, (int) list.set(18, 202));
		assertEquals(201, (int) list.remove(5));
		assertEquals(202, (int) list.remove(17));
		assertTrue(list.remove(null));
		list.remove(40);
		
		list.toArray();
		list.toArray(new Integer[0]);
		
		list.clear();

		for(int i = 0; i < 20; i++) list.add(i);
		for(int i = 0; i < 20; i++) list.remove(0);
	}

}
