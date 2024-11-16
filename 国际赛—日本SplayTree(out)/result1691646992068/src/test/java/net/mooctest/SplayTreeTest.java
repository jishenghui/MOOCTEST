package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplayTreeTest {

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      Integer integer0 = new Integer(0);
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      splayTree0.root = splaySubTree0;
	      Integer integer1 = Integer.getInteger("", (-1));
	      splayTree0.add(integer1);
	      boolean boolean0 = splayTree0.contains(integer0);
	      assertTrue(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.add("");
	      splayTree0.add("P");
	      long long0 = splayTree0.indexOf("");
	      assertEquals(1L, long0);
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.add("");
	      long long0 = splayTree0.size();
	      assertEquals(1L, long0);
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      long long0 = splayTree0.indexOf((String) null);
	      assertEquals((-1L), long0);
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.root = null;
	      // Undeclared exception!
	      try { 
	        splayTree0.toString();
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.root = null;
	      // Undeclared exception!
	      try { 
	        splayTree0.size();
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      Integer integer0 = new Integer(0);
	      splayTree0.root = null;
	      // Undeclared exception!
	      try { 
	        splayTree0.remove(integer0);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.root = null;
	      // Undeclared exception!
	      try { 
	        splayTree0.get(0L);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.add("");
	      // Undeclared exception!
	      try { 
	        splayTree0.contains((String) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.root = null;
	      // Undeclared exception!
	      try { 
	        splayTree0.add("");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      splayTree0.add("");
	      String string0 = splayTree0.get(1L);
	      assertEquals("", string0);
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      String[] stringArray0 = new String[6];
	      // Undeclared exception!
	      SplayTree.main(stringArray0);
	  }

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      Integer integer0 = new Integer(0);
	      boolean boolean0 = splayTree0.contains(integer0);
	      assertFalse(boolean0);
	  }

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      String string0 = splayTree0.get(0);
	      assertNull(string0);
	  }

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      // Undeclared exception!
	      try { 
	        splayTree0.indexOf("");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      long long0 = splayTree0.size();
	      assertEquals(0L, long0);
	  }

	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {
	      SplayTree<String> splayTree0 = new SplayTree<String>();
	      String string0 = splayTree0.toString();
	      assertEquals(" data=null left= null right null sz=0 cnt=0\n", string0);
	  }

	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {
	      SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      Integer integer0 = new Integer(0);
	      splayTree0.remove(integer0);
	  }

}
