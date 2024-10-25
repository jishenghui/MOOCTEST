package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.Test;


public class GomokuTest {

  @Test(timeout = 4000)
  public void test()  {
	  Gomoku.initBoard();
      assertEquals("[000000000000000, 000000000000000, 0, 000000222100000]", Gomoku.getString(0, 0).toString());
      assertTrue(Gomoku.checkSituation(2, Gomoku.getString(0, 0), 4));
      assertEquals("[000000001100000, 000000222000000, 0000000, 000000000000]", Gomoku.getString(6, 9).toString());
      assertTrue(Gomoku.checkSituation(2, Gomoku.getString(6, 6), 3));
      
//      System.out.println(Gomoku.getString(6, 9).toString());
      assertEquals(-396900, Gomoku.computeScore());
      
      assertEquals(4903300, Gomoku.alphaBeta(new Node(1,6,9), -1000000000, 1000000000, 1));
	  assertEquals(-5156700, Gomoku.alphaBeta(new Node(1,6,5), -1000000000, 1000000000, 2));
	  assertEquals(-44700, Gomoku.alphaBeta(new Node(1,6,9), -1000000000, 1000000000, 3));
	  
	  List<Node> nodes = new ArrayList<Node>();
	  
	  for (int i=0; i<15; ++i) {
		  for (int j=0; j<15; ++j) {
			  if (Gomoku.isValid(i, j)) {
				  Node node = new Node();
				  node.p = 1;
				  node.x = i;
				  node.y = j;
				  nodes.add(node);
			  }
		  }
	  }
	  
	  Node res = Gomoku.getBestStep(nodes);
	  assertEquals(6, res.x);
	  assertEquals(5, res.y);
	  
//      System.out.println(Gomoku.alphaBeta(new Node(1,6,9), -1000000000, 1000000000, 1));
//      System.out.println(Gomoku.alphaBeta(new Node(1,6,5), -1000000000, 1000000000, 3));
	  
      
  }
  @Test(timeout = 6000)
  public void test2()  {
	  
	  Gomoku.initBoard();
	  Gomoku.showScore();
  }
  @Test(timeout = 6000)
  public void test3()  {
	  
	  Class cls = Gomoku.class;
	  int[][] nBoard = new int[15][15];
	  nBoard[10][9] = 1;
	  nBoard[6][9] = 2; 
	  try {
		Field fld = cls.getDeclaredField("board");
		fld.setAccessible(true);
		Object obj = fld.get(null);
		fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Gomoku.initBoard();
	  assertTrue(Gomoku.checkSituation(2, Gomoku.getString(6, 9), 1));
	  assertTrue(Gomoku.checkSituation(1, Gomoku.getString(10, 9), 3));
	  assertEquals(-556056710, Gomoku.alphaBeta(new Node(2,6,5), -1000000000, 1000000000, 3));
	  
  }
  @Test(timeout = 6000)
  public void test4()  {
	  
	  Class cls = Gomoku.class;
	  int[][] nBoard = new int[15][15];
	  nBoard[10][9] = 1;
	  nBoard[6][9] = 2; 
	  nBoard[6][10] = 2;
	  try {
		Field fld = cls.getDeclaredField("board");
		fld.setAccessible(true);
		Object obj = fld.get(null);
		fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Gomoku.initBoard();
	  assertTrue(Gomoku.checkSituation(2, Gomoku.getString(6, 9), 0));
	  assertEquals(-499658910,Gomoku.computeScore());
  }
  
  @Test(timeout = 6000)
  public void test5()  {
	  Class cls = Gomoku.class;
	  int[][] nBoard = new int[15][15];
	  nBoard[10][9] = 0;
	  nBoard[7][9] = 1; 
	  nBoard[6][9] = 1;
	  try {
		Field fld = cls.getDeclaredField("board");
		fld.setAccessible(true);
		Object obj = fld.get(null);
		fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Gomoku.initBoard();
	  assertTrue(Gomoku.checkSituation(1, Gomoku.getString(7, 5), 4));
	  assertTrue(Gomoku.checkSituation(1, Gomoku.getString(8, 5), 4));
	  assertTrue(Gomoku.checkSituation(1, Gomoku.getString(9, 5), 4));
	  assertTrue(Gomoku.checkSituation(2, Gomoku.getString(9, 5), 4));
	  assertTrue(Gomoku.checkSituation(2, Gomoku.getString(8, 14), 8));
	  assertTrue(Gomoku.checkSituation(1, Gomoku.getString(8, 14), 7));
	  
	  
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 0));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 1));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 2));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 3));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 4));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 5));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 6));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 7));
	  assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 8));
	  assertEquals(493950800, Gomoku.alphaBeta(new Node(1,10,9), -1000000000, 1000000000, 2));
	  
  }
  
  @Test(timeout = 6000)
  public void test6()  {
	  Class cls = Gomoku.class;
	  int[][] nBoard = new int[15][15];
	  nBoard[7][9] = 1; 
	  nBoard[6][9] = 1;
	  nBoard[10][9] = 1;
	  nBoard[11][8] = 2;
	  nBoard[12][9] = 2;
	  try {
		Field fld = cls.getDeclaredField("board");
		fld.setAccessible(true);
		Object obj = fld.get(null);
		fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Gomoku.initBoard();
	  assertTrue(Gomoku.checkSituation(1, Gomoku.getString(7, 9), 0));
	  assertEquals("[000000111110200, 000001121100000, 000000, 0000002100000]",Gomoku.getString(7, 9).toString());
	  
	  
	  
  }
  
  
}
