package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

//author:TheOnlyman
public class Pairing_HeapTest {

	@Test(timeout=10000)
	public void test2() {
		Pairing_Heap<String> apple = new Pairing_Heap<>();
		for(int i=1;i<=100;++i) {
			Heap_Item<String> banana = new Heap_Item<String>(",");
			Heap_Item<String> cat = new Heap_Item<String>(".");
			Heap_Item<String> dog = new Heap_Item<String>("x");
			try{
				cat.setAncestor(banana);
				banana.getData();
				if(cat.hasLeftSon()) {};
				if(cat.hasRightSon()) {};
				banana.getLeftSon();
				banana.getRightSon();
				dog.setAncestor(banana);
				banana.setLeftSon(dog);
				banana.setRightSon(cat);
			}catch(Exception e) {

			}
			try{
				apple.pop();
				apple.equals(dog);
			}catch(Exception e) {

			}
			try{
				apple.push(banana);
				apple.push(cat);
				apple.getRoot();
			}catch(Exception e) {

			}
		}
	}
	@Test(timeout=10000)
	public void test3() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(apple);
		assertNull(banana.getMultiWayAncestor());

		Heap_Item<Integer> cat = new Heap_Item<>(11);
		Heap_Item<Integer> dog = new Heap_Item<>(12);
		dog.setLeftSon(cat);
		cat.setAncestor(dog);
		cat.setRightSon(apple);
		apple.setAncestor(cat);
		banana.setAncestor(apple);
		apple.setRightSon(banana);
		assertSame(banana.getMultiWayAncestor(), dog);

		Heap_Item<Integer> son = new Heap_Item<>();
		Heap_Item<Integer> fa = new Heap_Item<>();
		fa.setLeftSon(son);
		son.setAncestor(fa);
		assertEquals(son.getMultiWayAncestor(), fa);
	}
	@Test(timeout=10000)
	public void test4() {
		Heap_Item<Integer> apple = new Heap_Item<>(10);
		Heap_Item<Integer> banana = new Heap_Item<>(20);
		Pairing_Heap<Integer> pairing_heap = new Pairing_Heap<>();
		pairing_heap.checkPriority(apple);
		pairing_heap.push(apple);
		pairing_heap.push(banana);
		pairing_heap.checkPriority(apple);

		banana.setData(5);
		Heap_Item<Integer> cat = new Heap_Item<>(100);
		cat.setRightSon(new Heap_Item<>(1));
		apple.setLeftSon(cat);
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
		pairing_heap.checkPriority(apple);

	}


}
