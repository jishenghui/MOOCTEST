package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Optional;

//author:TheOnlyman
public class Heap_ItemTest {

	@Test
	public void test() {
		Heap_Item<String> apple = new Heap_Item<String>(",");
		Heap_Item<String> banana = new Heap_Item<String>(",");
		banana.setLeftSon(apple);
		apple.setLeftSon(banana);
		apple.setRightSon(banana);
		banana.replaceChild("$", apple);
		apple.getSonByData(",");
		apple.getSonByData("");
		assertTrue(apple.hasLeftSon());
	}

	@Test
	public void test01() {
		Heap_Item<Integer> girl = new Heap_Item<>(10);
		Heap_Item<Integer> left = new Heap_Item<>(8);
		Heap_Item<Integer> right = new Heap_Item<>(12);
		assertFalse(girl.hasLeftSon());
		assertFalse(girl.hasRightSon());
		girl.setLeftSon(left);
		girl.setRightSon(right);
		assertTrue(girl.hasLeftSon());
		assertTrue(girl.hasRightSon());
		assertNull(girl.getSonByData(7));
		assertEquals(left, girl.getSonByData(8));
		assertEquals(right, girl.getSonByData(12));
		girl.removeChild(8);
		assertNull(girl.getLeftSon());
		girl.removeChild(12);
		assertNull(girl.getRightSon());
		girl.removeChild(11);
		assertFalse(girl.replaceChild(1, new Heap_Item<>(11)));
		girl.setLeftSon(left);
		girl.setRightSon(right);
		Heap_Item<Integer> replace = new Heap_Item<>(20);
		assertTrue(girl.replaceChild(8, replace));
		assertEquals(replace, girl.getLeftSon());
		assertTrue(girl.replaceChild(12, replace));
		assertEquals(replace, girl.getRightSon());
	}

	@Test
	public void test02() {
		Heap_Item<Integer> cat = new Heap_Item<>(10);
		Heap_Item<Integer> dog = new Heap_Item<>(cat);
		assertNull(dog.getMultiWayAncestor());

		Heap_Item<Integer> grandpa = new Heap_Item<>(11);
		Heap_Item<Integer> grandpapa = new Heap_Item<>(12);
		grandpapa.setLeftSon(grandpa);
		grandpa.setAncestor(grandpapa);
		grandpa.setRightSon(cat);
		cat.setAncestor(grandpa);
		dog.setAncestor(cat);
		cat.setRightSon(dog);
		assertSame(dog.getMultiWayAncestor(), grandpapa);

		Heap_Item<Integer> egg = new Heap_Item<>();
		Heap_Item<Integer> fish = new Heap_Item<>();
		fish.setLeftSon(egg);
		egg.setAncestor(fish);
		assertEquals(egg.getMultiWayAncestor(), fish);
	}

	@Test
	public void test03() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(apple.getLeftSon(), banana);
		cat.checkPriority(apple);

	}

	@Test
	public void test04() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(4);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(banana.getLeftSon(), apple);
		apple.setData(3);
		apple.setRightSon(new Heap_Item<>(2));
		cat.checkPriority(apple);
	}

	@Test
	public void test05() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(4);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(banana.getLeftSon(), apple);
		apple.setData(3);
		cat.checkPriority(apple);
	}



	@Test
	public void test06() {
		Heap_Item<Integer> hill = new Heap_Item<>(20);
		Pairing_Heap<Integer> idea = new Pairing_Heap<>();
		assertNull(idea.getRoot());
		assertEquals(hill, idea.push(hill));
		assertEquals(hill, idea.getRoot());
		Heap_Item<Integer> jet = new Heap_Item<>(10);
		assertEquals(idea.push(jet), jet);
		assertEquals(idea.getRoot(), jet);

		Pairing_Heap<Integer> apple = new Pairing_Heap<>(hill);
		Heap_Item<Integer> banana = new Heap_Item<>(10);
		banana.setLeftSon(new Heap_Item<>(8));
		assertEquals(apple.push(banana), banana);
		assertEquals(apple.getRoot(), banana);

		Pairing_Heap<Integer> cat = new Pairing_Heap<>(hill);
		Heap_Item<Integer> dog = new Heap_Item<>(40);
		assertEquals(cat.push(dog), dog);
		assertEquals(cat.getRoot(), hill);
		dog.setLeftSon(new Heap_Item<>(8));
		assertEquals(cat.push(dog), dog);
		assertEquals(cat.getRoot(), hill);

		Pairing_Heap<Integer> egg = new Pairing_Heap<>();
		assertNull(egg.pop());
		Heap_Item<Integer> fish = new Heap_Item<>(10);
		egg.push(fish);
		assertEquals(egg.pop(), Optional.of(10).get());
		egg.push(fish);
		Heap_Item<Integer> girl = new Heap_Item<>(20);
		egg.push(girl);
		assertEquals(egg.pop(), Optional.of(10).get());
		assertEquals(egg.getRoot(), girl);
		Heap_Item<Integer> pp = new Heap_Item<>(40);
		fish.setRightSon(pp);
		egg.push(fish);
		assertEquals(egg.getRoot(), fish);
		assertEquals(egg.pop(), Optional.of(10).get());
		assertEquals(egg.getRoot(), girl);
		egg.push(fish);

		Heap_Item<Integer> ro = new Heap_Item<>(30);
		Pairing_Heap<Integer> l = new Pairing_Heap<>(ro);
		Heap_Item<Integer> rs = new Heap_Item<>(5);
		Heap_Item<Integer> ls = new Heap_Item<>(8);
		rs.setLeftSon(ls);
		ls.setLeftSon(new Heap_Item<>(3));
		l.push(rs);
		assertEquals(l.pop(), Optional.of(5).get());
	}

	@Test
	public void test07() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(apple.getLeftSon(), banana);
		cat.checkPriority(apple);

		banana.setData(5);
		cat.checkPriority(apple);
	}

	@Test
	public void test08() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(apple.getLeftSon(), banana);
		cat.checkPriority(apple);

		banana.setData(5);
		apple.setRightSon(new Heap_Item<>(6));
		cat.checkPriority(apple);
	}

	@Test
	public void test09() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(apple.getLeftSon(), banana);
		cat.checkPriority(apple);

		banana.setData(5);
		apple.setRightSon(new Heap_Item<>(6));
		Heap_Item<Integer> dog = new Heap_Item<>(3);
		Heap_Item<Integer> egg = new Heap_Item<>(3);
		dog.setAncestor(egg);
		egg.setLeftSon(dog);
		apple.setAncestor(dog);
		cat.checkPriority(apple);
	}

	@Test
	public void test10() {
		Heap_Item<Integer> apple = new Heap_Item<>();
		assertNull(apple.getData());
		apple.setData(1);
		assertEquals(apple.getData(), Optional.of(1).get());

	}

	@Test
	public void test11() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(apple.getLeftSon(), banana);
		cat.checkPriority(apple);

		banana.setData(5);
		Heap_Item<Integer> dog = new Heap_Item<>(3);
		Heap_Item<Integer> egg = new Heap_Item<>(3);
		dog.setAncestor(egg);
		egg.setLeftSon(dog);
		apple.setAncestor(dog);
		cat.checkPriority(apple);
	}

	@Test
	public void test12() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(apple.getLeftSon(), banana);
		cat.checkPriority(apple);

		banana.setData(5);
		apple.setRightSon(new Heap_Item<>(1));
		Heap_Item<Integer> dog = new Heap_Item<>(7);
		dog.setRightSon(new Heap_Item<>(8));
		banana.setRightSon(dog);
		Heap_Item<Integer> egg = new Heap_Item<>(3);
		Heap_Item<Integer> fish = new Heap_Item<>(3);
		egg.setAncestor(fish);
		egg.setRightSon(new Heap_Item<>(2));
		fish.setLeftSon(egg);
		egg.setRightSon(new Heap_Item<>(4));
		apple.setAncestor(egg);
		cat.checkPriority(apple);
	}

	@Test
	public void test13() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		cat.checkPriority(apple);
		cat.push(apple);
		cat.push(banana);
		assertEquals(apple.getLeftSon(), banana);
		cat.checkPriority(apple);

		banana.setData(5);
		Heap_Item<Integer> dog = new Heap_Item<>(100);
		dog.setRightSon(new Heap_Item<>(1));
		apple.setLeftSon(dog);
		apple.setRightSon(new Heap_Item<>(1));
		Heap_Item<Integer> egg = new Heap_Item<>(7);
		egg.setRightSon(new Heap_Item<>(8));
		banana.setRightSon(egg);
		Heap_Item<Integer> fish = new Heap_Item<>(3);
		Heap_Item<Integer> girl = new Heap_Item<>(3);
		fish.setAncestor(girl);
		fish.setRightSon(new Heap_Item<>(2));
		girl.setLeftSon(fish);
		fish.setRightSon(new Heap_Item<>(4));
		apple.setAncestor(fish);
		cat.checkPriority(apple);
	}
}
