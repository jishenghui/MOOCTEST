package net.mooctest;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

import net.mooctest.SkylineAlgorithm.Point;

public class BPlusTreeTest2 {

	

	@Test
	public void test13() {
		BPlusTree<Integer, Integer> bPlusTree = new BPlusTree<Integer, Integer>();
		bPlusTree.insert(10, 10);
		bPlusTree.searchRange(2, BPlusTree.RangePolicy.EXCLUSIVE, 11, BPlusTree.RangePolicy.EXCLUSIVE);
		
	}
	
}
