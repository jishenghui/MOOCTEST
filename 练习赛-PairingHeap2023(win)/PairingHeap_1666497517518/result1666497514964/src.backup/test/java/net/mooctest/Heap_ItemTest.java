package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Heap_ItemTest {
	Heap_Item<String> heap_Item = new Heap_Item<>();
	Heap_Item<String> heap_Item0 = new Heap_Item<String>("a");
	Heap_Item<String> heap_Item1 = new Heap_Item<String>("b");
	Heap_Item<String> heap_Item2 = new Heap_Item<>(heap_Item1);
	Heap_Item<String> heap_Item3 = new Heap_Item<String>("c");
	Heap_Item<String> heap_Item4 = new Heap_Item<String>("1");
	Heap_Item<String> heap_Item5 = new Heap_Item<String>("2");
	Heap_Item<String> heap_Item6 = new Heap_Item<String>("3");
	Heap_Item<String> heap_Item7 = new Heap_Item<String>("4");
	Heap_Item<String> heap_Item8 = new Heap_Item<String>("8");
	Heap_Item<String> heap_Item9 = new Heap_Item<String>("7");
	Heap_Item<String> heap_Item10 = new Heap_Item<String>("6");
	Heap_Item<String> heap_Item11 = new Heap_Item<String>("5");
	Heap_Item<String> heap_Item12 = new Heap_Item<String>("12");
	Heap_Item<String> heap_Item13 = new Heap_Item<String>("13");
	Heap_Item<String> heap_Item14 = new Heap_Item<String>("14");

	@Test
	public void Heap_Item_test() {
		  heap_Item1.setAncestor(heap_Item0);
		  heap_Item.getMultiWayAncestor();
		  heap_Item2.getMultiWayAncestor();
	      heap_Item1.setLeftSon(heap_Item0);
	      heap_Item0.setLeftSon(heap_Item1);
		  heap_Item1.getMultiWayAncestor();
		  heap_Item0.removeLeftSon();
		  heap_Item0.removeRightSon();
		  heap_Item1.removeLeftSon();
		  heap_Item0.setAncestor(heap_Item);
		  heap_Item.setAncestor(heap_Item2);
		  heap_Item2.setLeftSon(heap_Item);
		  heap_Item1.setLeftSon(heap_Item1);
		  heap_Item1.getMultiWayAncestor();
		  heap_Item1.setRightSon(heap_Item3);
	      heap_Item1.getSonByData("b");
	      heap_Item1.getSonByData("c");
		  heap_Item1.getSonByData("a");
		  heap_Item0.getSonByData("a");
		  heap_Item1.removeChild("b");
		  heap_Item1.removeChild("c");
		  heap_Item1.removeChild("a");
		  heap_Item.removeChild("a");
		heap_Item1.setLeftSon(heap_Item1);
		heap_Item1.setRightSon(heap_Item3);

		assertTrue(heap_Item1.replaceChild("b",heap_Item1));
		assertTrue(heap_Item1.replaceChild("c",heap_Item1));
		assertFalse(heap_Item1.replaceChild("a",heap_Item1));
		assertFalse(heap_Item0.replaceChild("a",heap_Item1));
		assertFalse(heap_Item1.replaceChild("$", heap_Item0));
		heap_Item.getData();
		String str = "c";
		heap_Item.setData(str);
		assertEquals("c",heap_Item.getData());
	}

	@Test
	public void Pairing_Heap_test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Pairing_Heap<String> ph0 = new Pairing_Heap<>();
		Pairing_Heap<String> ph_0 = new Pairing_Heap<>();
		Pairing_Heap<String> ph00 = new Pairing_Heap<>((Heap_Item) null);

		Pairing_Heap<String> ph1 = new Pairing_Heap<>(heap_Item4);
		Pairing_Heap<String> ph2 = new Pairing_Heap<>(ph1);
		Pairing_Heap<String> ph3 = new Pairing_Heap<>(heap_Item7);
		Pairing_Heap<String> ph4 = new Pairing_Heap<>(heap_Item8);

		assertEquals("1",ph1.peek());
		ph0.push(heap_Item4);
		ph1.push(heap_Item5);
		assertNull(ph_0.pop());
		assertEquals("1",ph0.pop());
		assertEquals("4",ph3.pop());
		heap_Item4.setLeftSon(heap_Item5);
		heap_Item5.setRightSon(heap_Item6);
		heap_Item5.setLeftSon(heap_Item6);
		heap_Item6.setLeftSon(heap_Item7);
		assertEquals("1",ph1.pop());
		assertEquals("2",ph1.pop());
		assertEquals("3",ph1.pop());
		heap_Item8.setLeftSon(heap_Item9);
		heap_Item9.setRightSon(heap_Item10);
		heap_Item9.setLeftSon(heap_Item10);
		heap_Item10.setLeftSon(heap_Item11);
		assertEquals("8",ph4.pop());
		assertEquals("6",ph4.pop());
		assertEquals("5",ph4.pop());

		Pairing_Heap<String> phm1 = new Pairing_Heap<>();
		Class clazz = phm1.getClass();
		Method method1,method2,method3;
		method1 = clazz.getDeclaredMethod("pair", Pairing_Heap.class, Pairing_Heap.class);
		method2 = clazz.getDeclaredMethod("pair", Pairing_Heap.class, Pairing_Heap.class);
		method3 = clazz.getDeclaredMethod("pop_heap_item");
		method1.setAccessible(true);
		method2.setAccessible(true);
		method3.setAccessible(true);
		method1.invoke(phm1,ph00,ph1);
		method2.invoke(phm1,ph1,ph00);
		method3.invoke(phm1);

		ph0.checkPriority(heap_Item0);
		ph0.checkPriority(heap_Item1);
		ph0.checkPriority(heap_Item2);
		ph0.checkPriority(heap_Item3);
		ph0.checkPriority(heap_Item4);
		ph0.checkPriority(heap_Item5);
		ph0.checkPriority(heap_Item6);
		ph0.checkPriority(heap_Item7);
		ph0.checkPriority(heap_Item8);
		ph0.checkPriority(heap_Item9);
		ph0.checkPriority(heap_Item10);
		ph0.checkPriority(heap_Item11);

		heap_Item12.setAncestor(heap_Item13);
		heap_Item13.setLeftSon(heap_Item12);
		heap_Item12.setRightSon(heap_Item13);
		ph0.checkPriority(heap_Item12);
		heap_Item12.removeRightSon();
		ph0.checkPriority(heap_Item12);

		heap_Item14.setLeftSon(heap_Item7);
		heap_Item14.setRightSon(heap_Item10);
		heap_Item7.setRightSon(heap_Item9);
		heap_Item14.setAncestor(heap_Item10);
		ph0.checkPriority(heap_Item14);

	}

}
