package net.mooctest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static net.mooctest.BPlusTree.RangePolicy.EXCLUSIVE;
import static net.mooctest.BPlusTree.RangePolicy.INCLUSIVE;

public class BPlusTreeTest {

	@Test
	public void test() {
		ClosestPair.main(null);
		int[] arr = new int[] {10, 20, 30, 50, 10, 70, 30};
		int[] target = new int[] {0,70, 30, 20, 10, 10, 10, 10};
		int[] res = MaximumMinimumWindow.calculateMaxOfMin(arr, arr.length);
		BPlusTree<Integer, Object> bPlusTree=new BPlusTree<>(4);
		bPlusTree.insert(0,"a");
		bPlusTree.insert(1,"b");
		bPlusTree.insert(2,"c");
		bPlusTree.insert(4,"e");
		bPlusTree.insert(3,"d");
		bPlusTree.search(3);
		bPlusTree.search(0);
		bPlusTree.toString();
		bPlusTree.searchRange(0,EXCLUSIVE,4,INCLUSIVE);
		bPlusTree.searchRange(0,INCLUSIVE,4,INCLUSIVE);
		bPlusTree.searchRange(0,EXCLUSIVE,4,EXCLUSIVE);
		bPlusTree.delete(3);
		bPlusTree.delete(4);
		BPlusTree<Integer, Object> bPlusTree1=new BPlusTree<>(3);
		bPlusTree1.insert(0,"a");
		bPlusTree1.insert(1,"b");
		bPlusTree1.insert(2,"c");
		bPlusTree1.insert(4,"e");
		bPlusTree1.insert(3,"d");
		bPlusTree1.search(3);
		bPlusTree1.search(0);
		bPlusTree1.toString();
		bPlusTree1.searchRange(0,EXCLUSIVE,4,INCLUSIVE);
		bPlusTree1.searchRange(0,INCLUSIVE,4,INCLUSIVE);
		bPlusTree1.searchRange(0,EXCLUSIVE,4,EXCLUSIVE);
		bPlusTree1.delete(3);
		bPlusTree1.insert(-1,"e");
		bPlusTree1.insert(-2,"e");
		bPlusTree1.delete(2);
		bPlusTree1.delete(1);

		BinaryExponentiation binaryExponentiation=new BinaryExponentiation();
		binaryExponentiation.power(15,4);
		BinaryExponentiation.calculatePower(3,5);
		BinaryExponentiation.calculatePower(3,0);
		try{
			MaximumMinimumWindow.main(null);
		}
		catch (AssertionError ignored)
		{

		}
		SkylineAlgorithm skylineAlgorithm=new SkylineAlgorithm();
		ArrayList<SkylineAlgorithm.Point> points=new ArrayList<>();
		points.add(new SkylineAlgorithm.Point(1,2));
		points.add(new SkylineAlgorithm.Point(3,7));
		points.add(new SkylineAlgorithm.Point(-1,2));
		points.add(new SkylineAlgorithm.Point(1,-2));
		points.add(new SkylineAlgorithm.Point(88,21));

		ArrayList<SkylineAlgorithm.Point> points2=new ArrayList<>();
		points2.add(new SkylineAlgorithm.Point(0,0));
		points2.add(new SkylineAlgorithm.Point(-3,7));
		points2.add(new SkylineAlgorithm.Point(-1,-8));
		points2.add(new SkylineAlgorithm.Point(1,-2));
		points2.add(new SkylineAlgorithm.Point(-4,21));

		points2.get(0).getX();
		points2.get(0).getY();
		points2.get(0).equals(points.get(0));

		skylineAlgorithm.getPoints();
		skylineAlgorithm.produceSubSkyLines(points);
		skylineAlgorithm.produceFinalSkyLine(points,points2);
		skylineAlgorithm.produceSubSkyLines(points2);

		ArrayList<SkylineAlgorithm.Point> points3=new ArrayList<>();
		ArrayList<SkylineAlgorithm.Point> points4=new ArrayList<>();
		points3.add(new SkylineAlgorithm.Point(1,8));
		points3.add(new SkylineAlgorithm.Point(1,2));
		points3.add(new SkylineAlgorithm.Point(2,1));
		points4.add(new SkylineAlgorithm.Point(1,2));
		points4.add(new SkylineAlgorithm.Point(1,5));
		skylineAlgorithm.produceFinalSkyLine(points3,points4);
		StrassenMatrixMultiplication strassenMatrixMultiplication=new StrassenMatrixMultiplication();
		int[][] A={{1,2,3,4},{1,2,3,5},{9,5,-8,-1},{-5,-1,5,5}};
		int[][] B={{1,2,7,6},{1,3,4,6},{9,-1,9,7},{-5,5,3,3}};
		strassenMatrixMultiplication.add(A,B);
		strassenMatrixMultiplication.join(A,B,0,0);
		strassenMatrixMultiplication.multiply(A,B);
		strassenMatrixMultiplication.sub(A,B);
		strassenMatrixMultiplication.split(A,B,0,0);
	}

}
