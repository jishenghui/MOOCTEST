package net.mooctest;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

import net.mooctest.SkylineAlgorithm.Point;

public class BPlusTreeTest1 {

	

	@Test
	public void test() {
		BinaryExponentiation binaryExponentiation = new BinaryExponentiation();
		
		assertEquals(1, binaryExponentiation.power(1L, 2L));
		BinaryExponentiation.calculatePower(0, 1);
	}
	@Test
	public void test1() {
		BPlusTree<Integer, Integer> bPlusTree = new BPlusTree<>();
		for (int i = 0; i < 10; i++) {
			bPlusTree.insert(i, i+1);
			
		}
		for (int i = 0; i < 10; i++) {
			
			assertNotNull(bPlusTree.search(i));
		}
		System.out.println(bPlusTree);
		for (int i = 0; i < 10; i++) {
			bPlusTree.delete(i);
		}
		
	}
	@Test
	public void test2() {
		try {
			BPlusTree<Integer, Integer> bPlusTree = new BPlusTree<>(1);
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
	}
	@Test
	public void test3() {
		int[] i = {1,2,5,2};
		MaximumMinimumWindow.calculateMaxOfMin(i,3);
		String[] args = new String[10];
		try {
			MaximumMinimumWindow.main(args);
		} catch (AssertionError e) {
			// TODO: handle exception
		}

	}
	@Test
	public void test4() {
		SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
		
//			skylineAlgorithm.
//		System.out.println(11);
//		System.out.println();
		assertNotNull(skylineAlgorithm.getPoints());
		ArrayList<SkylineAlgorithm.Point> arrayList = new ArrayList<>();
		for(int i = 0; i < 4;i++) {
			arrayList.add(new SkylineAlgorithm.Point(i, i+1));
		}
		ArrayList<SkylineAlgorithm.Point> arrayList1 = new ArrayList<>();
		arrayList1.add(new SkylineAlgorithm.Point(1, 2));
		ArrayList<SkylineAlgorithm.Point> arrayList2 = new ArrayList<>();
		SkylineAlgorithm.Point point = new SkylineAlgorithm.Point(1, 2);
		arrayList2.add(point);
		arrayList2.add(point);
		assertNotNull(skylineAlgorithm.produceSubSkyLines(arrayList));
		assertNotNull(skylineAlgorithm.produceSubSkyLines(arrayList1));
		assertNotNull(skylineAlgorithm.produceSubSkyLines(arrayList2));
		assertNotNull(skylineAlgorithm.produceFinalSkyLine(arrayList, arrayList2));
		ArrayList<SkylineAlgorithm.Point> arrayList3 = new ArrayList<>();
		for (int i = 5; i >= 5; i--) {
			arrayList3.add(new SkylineAlgorithm.Point(1, i));
		}
		assertNotNull(skylineAlgorithm.produceFinalSkyLine(arrayList3, arrayList2));
	}
	
	@Test
	public void test5() {
		StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
		int[][] a = new int[2][3];
		int[][] b = new int[2][3];
		for (int i = 0; i < a.length; i++) {
			for(int j = 0;j < a[i].length;j++) {
				a[i][j] = i;
				b[i][j] = j;
			}
		}
		strassenMatrixMultiplication.add(a, b);
		System.out.println(strassenMatrixMultiplication.multiply(a, b));
	}
	@Test
	public void test6() {
		BPlusTree bPlusTree = new BPlusTree<Integer, Integer>();
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j <= 10; j++) {
				bPlusTree.insert(i,j);
			}
			
		}
		assertNotNull(bPlusTree.searchRange(1, BPlusTree.RangePolicy.INCLUSIVE, 2, BPlusTree.RangePolicy.INCLUSIVE));
		;
		assertNull(bPlusTree.search(-1));
		bPlusTree.delete(-1);
		BPlusTree bPlusTree1 = new BPlusTree<Integer, Integer>(3);
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j <= 10; j++) {
				bPlusTree1.insert(i,j);
			}
			
		}
	}
//	@Test
//	public void test7() {
//		// TODO 自动生成的方法存根
//		BinaryExponentiation.calculatePower(2, 4);
//		String[] args = new String[4];
//		ClosestPair.main(args);
//		ClosestPair closestPair = new ClosestPair(1);
//
//		assertNotNull(closestPair.createLocation(123));
//
//	}
	@Test
	public void test8() {
		SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
		ArrayList<SkylineAlgorithm.Point> arrayList2 = new ArrayList<>();
		arrayList2.add(new SkylineAlgorithm.Point(2,1));
		arrayList2.add(new SkylineAlgorithm.Point(1,1));
		skylineAlgorithm.produceSubSkyLines(arrayList2);
		SkylineAlgorithm.Point point = new SkylineAlgorithm.Point(1,0);
		SkylineAlgorithm.Point point1 = new SkylineAlgorithm.Point(2,2);
		SkylineAlgorithm.Point point2 = new SkylineAlgorithm.Point(1,2);
		SkylineAlgorithm.Point point3 = new SkylineAlgorithm.Point(1,2);
		
		assertTrue(point.dominates(point1));
		assertTrue(point2.dominates(point1));
		assertEquals(1, point.getX());
		assertEquals(0, point.getY());

		Comparator<SkylineAlgorithm.Point> comparator = skylineAlgorithm.new XComparator();
		
		assertEquals(-1, comparator.compare(point, point1));
	}

	@Test
	public void test9() {
		ClosestPair closestPair = new ClosestPair(1);
		ClosestPair closestPair1 = new ClosestPair(3);
		ClosestPair.Location[] aLocations = new ClosestPair.Location[2];
		aLocations[0] = new ClosestPair.Location(0.2,0.3);
		aLocations[1] = new ClosestPair.Location(0.2,0.3);
		closestPair.bruteForce(aLocations);
		closestPair1.bruteForce(aLocations);
		
 	}

	@Test
	public void test10() {
		ArrayList<SkylineAlgorithm.Point> arrayList = new ArrayList<>();
		SkylineAlgorithm.Point point = new SkylineAlgorithm.Point(1, 3);
		SkylineAlgorithm.Point point2 = new SkylineAlgorithm.Point(1, 2);
		SkylineAlgorithm.Point point3 = new SkylineAlgorithm.Point(1, 2);
		SkylineAlgorithm.Point point4 = new SkylineAlgorithm.Point(2, 2);
		arrayList.add(point);
		arrayList.add(point2);
		arrayList.add(point3);
		arrayList.add(point4);
		
		SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
		skylineAlgorithm.produceFinalSkyLine(arrayList, arrayList);
		
		ArrayList<SkylineAlgorithm.Point> arrayList1 = new ArrayList<>();
		SkylineAlgorithm.Point point5 = new SkylineAlgorithm.Point(1, 2);
		SkylineAlgorithm.Point point6 = new SkylineAlgorithm.Point(2, 1);
		arrayList1.add(point5);
		arrayList1.add(point6);
		skylineAlgorithm.produceFinalSkyLine(arrayList1, arrayList1);
		ArrayList<SkylineAlgorithm.Point> arrayList2 = new ArrayList<>();
		SkylineAlgorithm.Point point7 = new SkylineAlgorithm.Point(1, 3);
		SkylineAlgorithm.Point point8 = new SkylineAlgorithm.Point(2, 2);
		arrayList2.add(point7);
		arrayList2.add(point8);
		ArrayList<SkylineAlgorithm.Point> arrayList3 = new ArrayList<>();
		SkylineAlgorithm.Point point9 = new SkylineAlgorithm.Point(1, 0);
		SkylineAlgorithm.Point point10 = new SkylineAlgorithm.Point(2, 2);
		SkylineAlgorithm.Point point11 = new SkylineAlgorithm.Point(3, 3);
		arrayList3.add(point9);
		arrayList3.add(point10);
		arrayList3.add(point11);
		skylineAlgorithm.produceFinalSkyLine(arrayList2, arrayList3);

	}
	
	@Test
	public void test11() {
		SkylineAlgorithm.Point point = new SkylineAlgorithm.Point(1, 2);
		SkylineAlgorithm.Point point1 = new SkylineAlgorithm.Point(2, 2);
		assertTrue(point.dominates(point1));
		SkylineAlgorithm.Point point3 = new SkylineAlgorithm.Point(2, 1);
		SkylineAlgorithm.Point point4 = new SkylineAlgorithm.Point(2, 2);
		assertTrue(point3.dominates(point4));
		SkylineAlgorithm.Point point5 = new SkylineAlgorithm.Point(1, 2);
		SkylineAlgorithm.Point point6 = new SkylineAlgorithm.Point(2, 1);
		assertFalse(point5.dominates(point6));
	}
	
	@Test
	public void test12() {
		BPlusTree<Integer, ArrayList<Integer>> aBPlusTree = new BPlusTree<>();
		for(int i = 0;i < 4;i++) {
			ArrayList<Integer> arrayList = new ArrayList<>();
			for(int j = 0;j < i+1;j++) {
				arrayList.add(j);
			}
			aBPlusTree.insert(i, arrayList);
		}
		System.out.println("------------");
		System.out.println(aBPlusTree);
		System.out.println("------------");

	}
	
	@Test
	public void test13() {
		BPlusTree<Integer, Integer> bPlusTree = new BPlusTree<Integer, Integer>();
		bPlusTree.insert (10, 10);
		bPlusTree.searchRange(2, BPlusTree.RangePolicy.EXCLUSIVE, 11, BPlusTree.RangePolicy.EXCLUSIVE);
		bPlusTree.searchRange(2, BPlusTree.RangePolicy.INCLUSIVE, 11, BPlusTree.RangePolicy.INCLUSIVE);
		bPlusTree.searchRange(10, BPlusTree.RangePolicy.EXCLUSIVE, 11, BPlusTree.RangePolicy.INCLUSIVE);
		bPlusTree.searchRange(2, BPlusTree.RangePolicy.EXCLUSIVE, 10, BPlusTree.RangePolicy.EXCLUSIVE);
		bPlusTree.searchRange(10, BPlusTree.RangePolicy.EXCLUSIVE, 0, BPlusTree.RangePolicy.EXCLUSIVE);
		bPlusTree.searchRange(10, BPlusTree.RangePolicy.EXCLUSIVE, 0, BPlusTree.RangePolicy.INCLUSIVE);
		bPlusTree.searchRange(10, BPlusTree.RangePolicy.EXCLUSIVE, 11, BPlusTree.RangePolicy.EXCLUSIVE);
	}
	
}
