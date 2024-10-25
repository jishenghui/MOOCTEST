package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class Heap_ItemTest {

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

}
