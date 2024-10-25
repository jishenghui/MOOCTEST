package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplaySubTreeTest2 {

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(">");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find("-");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("I");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find("-");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.get(1L);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.remove(integer0);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      
	      long long0 = splaySubTree1.size();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertEquals(0L, long0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.remove("");
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.remove("");
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree2.size());
	      assertEquals(0L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree2.remove("");
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertEquals((-1L), splaySubTree0.size());
	      assertEquals((-1L), splaySubTree2.size());
	      assertEquals(0L, splaySubTree4.size());
	      
	      long long0 = splaySubTree2.size();
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertEquals((-1L), long0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertEquals((-1L), splaySubTree0.size());
	      assertEquals((-1L), splaySubTree2.size());
	  }

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.remove(integer0);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      
	      SplaySubTree<Integer> splaySubTree2 = splaySubTree0.remove(integer0);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals((-1L), splaySubTree0.size());
	      assertEquals(0L, splaySubTree2.size());
	      
	      Integer integer1 = new Integer(1);
	      assertEquals(1, (int)integer1);
	      assertNotNull(integer1);
	      assertFalse(integer1.equals((Object)integer0));
	      
	      SplaySubTree<Integer> splaySubTree3 = splaySubTree0.remove(integer1);
	      assertSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(integer0.equals((Object)integer1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(integer1.equals((Object)integer0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals((-1L), splaySubTree0.size());
	      assertEquals((-1L), splaySubTree3.size());
	  }

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree1.add("E =");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree4.remove("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree1.size());
	      assertEquals(3L, splaySubTree4.size());
	      assertEquals(3L, splaySubTree5.size());
	      
	      SplaySubTree<String> splaySubTree6 = splaySubTree4.remove("E =");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertSame(splaySubTree4, splaySubTree6);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree6, splaySubTree3);
	      assertNotSame(splaySubTree6, splaySubTree1);
	      assertSame(splaySubTree6, splaySubTree4);
	      assertNotSame(splaySubTree6, splaySubTree0);
	      assertNotSame(splaySubTree6, splaySubTree5);
	      assertNotSame(splaySubTree6, splaySubTree2);
	      assertNotNull(splaySubTree6);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree4.size());
	      assertEquals(2L, splaySubTree6.size());
	      
	      long long0 = splaySubTree4.indexOf("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertSame(splaySubTree4, splaySubTree6);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertEquals(0L, long0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree4.size());
	  }

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.remove(integer0);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      
	      Integer integer1 = splaySubTree1.getData();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNull(integer1);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("i");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.remove("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree3.get(0L);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree3.size());
	      assertEquals(0L, splaySubTree4.size());
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.remove("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.find("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree2.size());
	  }

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.add(integer0);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<Integer> splaySubTree2 = splaySubTree1.remove(integer0);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<Integer> splaySubTree3 = splaySubTree2.remove(integer0);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(0L, splaySubTree2.size());
	      assertEquals(0L, splaySubTree3.size());
	      
	      SplaySubTree<Integer> splaySubTree4 = splaySubTree2.remove(integer0);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals((-1L), splaySubTree0.size());
	      assertEquals((-1L), splaySubTree1.size());
	      assertEquals((-1L), splaySubTree2.size());
	      assertEquals(0L, splaySubTree4.size());
	      
	      SplaySubTree<Integer> splaySubTree5 = splaySubTree2.find(integer0);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertSame(splaySubTree2, splaySubTree5);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree5, splaySubTree1);
	      assertSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertEquals((-1L), splaySubTree0.size());
	      assertEquals((-1L), splaySubTree1.size());
	      assertEquals((-1L), splaySubTree2.size());
	      assertEquals((-1L), splaySubTree5.size());
	  }

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>((String) null);
	      assertNotNull(splaySubTree0);
	      assertEquals(0L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add((String) null);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add(" sz=");
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.add("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree0.add(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree3, splaySubTree1);
	      assertSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(4L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree1.add("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertEquals(3L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree4.add(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertSame(splaySubTree5, splaySubTree0);
	      assertSame(splaySubTree5, splaySubTree1);
	      assertSame(splaySubTree5, splaySubTree3);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertEquals(6L, splaySubTree0.size());
	      assertEquals(6L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree4.size());
	      assertEquals(6L, splaySubTree5.size());
	      
	      // Undeclared exception!
	      try { 
	        splaySubTree3.get(5L);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      // Undeclared exception!
	      try { 
	        splaySubTree0.find((String) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree0.add(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertEquals(4L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree4.size());
	  }

	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("s");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree1.add("s");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree4.size());
	      
	      boolean boolean0 = splaySubTree0.splay();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertEquals(5L, splaySubTree0.size());
	      
	      boolean boolean1 = splaySubTree2.splay();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertTrue(boolean1);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertTrue(boolean1 == boolean0);
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(5L, splaySubTree2.size());
	  }

	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("s");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      boolean boolean0 = splaySubTree1.splay();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>((Integer) null);
	      assertNotNull(splaySubTree0);
	      assertEquals(0L, splaySubTree0.size());
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.find((Integer) null);
	      assertNull(splaySubTree1);
	      assertEquals(0L, splaySubTree0.size());
	  }

	  @Test(timeout = 4000)
	  public void test18()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree1.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree2.add("1");
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree2.size());
	      assertEquals(5L, splaySubTree5.size());
	      
	      SplaySubTree<String> splaySubTree6 = splaySubTree4.remove("");
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertSame(splaySubTree4, splaySubTree6);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertSame(splaySubTree6, splaySubTree4);
	      assertNotSame(splaySubTree6, splaySubTree3);
	      assertNotSame(splaySubTree6, splaySubTree5);
	      assertNotSame(splaySubTree6, splaySubTree0);
	      assertNotSame(splaySubTree6, splaySubTree2);
	      assertSame(splaySubTree6, splaySubTree1);
	      assertNotNull(splaySubTree6);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree2));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree4.size());
	      assertEquals(4L, splaySubTree6.size());
	      
	      SplaySubTree<String> splaySubTree7 = splaySubTree5.add(" ");
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree6);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree7);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree6);
	      assertNotSame(splaySubTree5, splaySubTree7);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree7, splaySubTree1);
	      assertNotSame(splaySubTree7, splaySubTree2);
	      assertNotSame(splaySubTree7, splaySubTree5);
	      assertNotSame(splaySubTree7, splaySubTree4);
	      assertNotSame(splaySubTree7, splaySubTree6);
	      assertNotSame(splaySubTree7, splaySubTree0);
	      assertNotSame(splaySubTree7, splaySubTree3);
	      assertNotNull(splaySubTree7);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(2L, splaySubTree5.size());
	      assertEquals(5L, splaySubTree7.size());
	  }

	  @Test(timeout = 4000)
	  public void test19()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("g");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree0.add("g");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree1.add("");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertEquals(3L, splaySubTree0.size());
	      assertEquals(5L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree5.size());
	      
	      boolean boolean0 = splaySubTree3.splay();
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree5);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(5L, splaySubTree3.size());
	  }

	  @Test(timeout = 4000)
	  public void test20()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("g");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree0.add("gE");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree2.add("g");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(5L, splaySubTree5.size());
	      
	      boolean boolean0 = splaySubTree1.splay();
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(5L, splaySubTree1.size());
	      
	      boolean boolean1 = splaySubTree3.splay();
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree5);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertTrue(boolean1);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertTrue(boolean1 == boolean0);
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(5L, splaySubTree3.size());
	  }

	  @Test(timeout = 4000)
	  public void test21()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree0.add("");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree1.add("s");
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree5.size());
	      
	      boolean boolean0 = splaySubTree2.splay();
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertEquals(5L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree6 = splaySubTree4.get(0L);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNull(splaySubTree6);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals(5L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree4.size());
	  }

	  @Test(timeout = 4000)
	  public void test22()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" ");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree0.add("E");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals(3L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree1.add("E");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals(3L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree4.size());
	  }

	  @Test(timeout = 4000)
	  public void test23()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.remove("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.remove("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(0L, splaySubTree2.size());
	      
	      // Undeclared exception!
	      try { 
	        splaySubTree2.indexOf("");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test24()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("s");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.remove("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree2.size());
	      assertEquals(2L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree3.add("d");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(1L, splaySubTree3.size());
	      assertEquals(3L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree2.remove("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertSame(splaySubTree5, splaySubTree1);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree5.size());
	  }

	  @Test(timeout = 4000)
	  public void test25()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("s");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      boolean boolean0 = splaySubTree0.splay();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertEquals(2L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.remove("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree1.remove("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertSame(splaySubTree3, splaySubTree0);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree3.size());
	  }

	  @Test(timeout = 4000)
	  public void test26()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("k");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      // Undeclared exception!
	      try { 
	        splaySubTree0.remove(" sz=");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test27()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      // Undeclared exception!
	      try { 
	        splaySubTree0.remove(" sz=");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test28()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree0.add((String) null);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertSame(splaySubTree4, splaySubTree2);
	      assertSame(splaySubTree4, splaySubTree0);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree1.add(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree5.size());
	      
	      boolean boolean0 = splaySubTree2.splay();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(4L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree6 = splaySubTree4.remove(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertSame(splaySubTree4, splaySubTree2);
	      assertSame(splaySubTree4, splaySubTree6);
	      assertSame(splaySubTree4, splaySubTree0);
	      assertSame(splaySubTree6, splaySubTree0);
	      assertSame(splaySubTree6, splaySubTree4);
	      assertNotSame(splaySubTree6, splaySubTree1);
	      assertNotSame(splaySubTree6, splaySubTree5);
	      assertSame(splaySubTree6, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree3);
	      assertNotNull(splaySubTree6);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree3));
	      assertEquals(3L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree4.size());
	      assertEquals(3L, splaySubTree6.size());
	      
	      SplaySubTree<String> splaySubTree7 = splaySubTree2.remove("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree6);
	      assertNotSame(splaySubTree2, splaySubTree7);
	      assertNotSame(splaySubTree7, splaySubTree0);
	      assertNotSame(splaySubTree7, splaySubTree6);
	      assertNotSame(splaySubTree7, splaySubTree2);
	      assertNotSame(splaySubTree7, splaySubTree4);
	      assertSame(splaySubTree7, splaySubTree3);
	      assertNotSame(splaySubTree7, splaySubTree1);
	      assertNotSame(splaySubTree7, splaySubTree5);
	      assertNotNull(splaySubTree7);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree5));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(0L, splaySubTree2.size());
	      assertEquals(2L, splaySubTree7.size());
	      
	      SplaySubTree<String> splaySubTree8 = splaySubTree5.remove("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree8);
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree8);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree7);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree6);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree8);
	      assertNotSame(splaySubTree8, splaySubTree5);
	      assertNotSame(splaySubTree8, splaySubTree4);
	      assertSame(splaySubTree8, splaySubTree1);
	      assertNotSame(splaySubTree8, splaySubTree6);
	      assertNotSame(splaySubTree8, splaySubTree2);
	      assertNotSame(splaySubTree8, splaySubTree0);
	      assertNotSame(splaySubTree8, splaySubTree7);
	      assertNotSame(splaySubTree8, splaySubTree3);
	      assertNotNull(splaySubTree8);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree8.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree8.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree8.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree8.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree8.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree8.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree8.equals((Object)splaySubTree3));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree5.size());
	      assertEquals(1L, splaySubTree8.size());
	      
	      SplaySubTree<String> splaySubTree9 = splaySubTree5.remove(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree9);
	      assertNotSame(splaySubTree0, splaySubTree8);
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree9);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree8);
	      assertNotSame(splaySubTree5, splaySubTree9);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree7);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree6);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree8);
	      assertNotSame(splaySubTree9, splaySubTree4);
	      assertSame(splaySubTree9, splaySubTree7);
	      assertNotSame(splaySubTree9, splaySubTree0);
	      assertNotSame(splaySubTree9, splaySubTree2);
	      assertNotSame(splaySubTree9, splaySubTree6);
	      assertSame(splaySubTree9, splaySubTree3);
	      assertNotSame(splaySubTree9, splaySubTree8);
	      assertNotSame(splaySubTree9, splaySubTree1);
	      assertNotSame(splaySubTree9, splaySubTree5);
	      assertNotNull(splaySubTree9);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree8));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree8));
	      assertFalse(splaySubTree9.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree9.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree9.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree9.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree9.equals((Object)splaySubTree8));
	      assertFalse(splaySubTree9.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree9.equals((Object)splaySubTree5));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(0L, splaySubTree5.size());
	      assertEquals(0L, splaySubTree9.size());
	  }

	  @Test(timeout = 4000)
	  public void test29()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree1.add(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree3.size());
	      
	      boolean boolean0 = splaySubTree0.splay();
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertEquals(4L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree0.remove(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertEquals(3L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree3.remove("");
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree5);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree3.size());
	      assertEquals(2L, splaySubTree5.size());
	      
	      SplaySubTree<String> splaySubTree6 = splaySubTree3.remove(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertSame(splaySubTree3, splaySubTree6);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree5);
	      assertNotSame(splaySubTree6, splaySubTree4);
	      assertNotSame(splaySubTree6, splaySubTree5);
	      assertNotSame(splaySubTree6, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree0);
	      assertSame(splaySubTree6, splaySubTree3);
	      assertNotSame(splaySubTree6, splaySubTree1);
	      assertNotNull(splaySubTree6);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree3.size());
	      assertEquals(1L, splaySubTree6.size());
	      
	      // Undeclared exception!
	      try { 
	        splaySubTree6.remove(" sz=");
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }

	  @Test(timeout = 4000)
	  public void test30()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.remove((Integer) null);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test31()  throws Throwable  {
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>((Integer) null);
	      assertNotNull(splaySubTree0);
	      assertEquals(0L, splaySubTree0.size());
	      
	      Integer integer0 = new Integer(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.add(integer0);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(0L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	  }

	  @Test(timeout = 4000)
	  public void test32()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("s");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree1.add("s");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree4.size());
	      
	      long long0 = splaySubTree4.indexOf("w");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertEquals((-1L), long0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(5L, splaySubTree4.size());
	  }

	  @Test(timeout = 4000)
	  public void test33()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" sz=");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("g");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.find(" sz=");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree2.add("g");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(3L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree0.add("g");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree2.add("g");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree3);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(1L, splaySubTree2.size());
	      assertEquals(5L, splaySubTree5.size());
	      
	      SplaySubTree<String> splaySubTree6 = splaySubTree4.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree6);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree1);
	      assertNotSame(splaySubTree6, splaySubTree0);
	      assertNotSame(splaySubTree6, splaySubTree3);
	      assertNotSame(splaySubTree6, splaySubTree5);
	      assertNotSame(splaySubTree6, splaySubTree4);
	      assertNotNull(splaySubTree6);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree4));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree4.size());
	      assertEquals(6L, splaySubTree6.size());
	      
	      SplaySubTree<String> splaySubTree7 = splaySubTree1.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree7, splaySubTree6);
	      assertNotSame(splaySubTree7, splaySubTree5);
	      assertNotSame(splaySubTree7, splaySubTree0);
	      assertNotSame(splaySubTree7, splaySubTree4);
	      assertNotSame(splaySubTree7, splaySubTree2);
	      assertNotSame(splaySubTree7, splaySubTree1);
	      assertNotSame(splaySubTree7, splaySubTree3);
	      assertNotNull(splaySubTree7);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(7L, splaySubTree7.size());
	      
	      boolean boolean0 = splaySubTree2.splay();
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree6);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree7);
	      assertNotSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree3);
	      assertNotSame(splaySubTree2, splaySubTree6);
	      assertNotSame(splaySubTree2, splaySubTree4);
	      assertNotSame(splaySubTree2, splaySubTree5);
	      assertNotSame(splaySubTree2, splaySubTree7);
	      assertSame(splaySubTree2, splaySubTree0);
	      assertTrue(boolean0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree7));
	      assertEquals(7L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(7L, splaySubTree2.size());
	      
	      long long0 = splaySubTree4.indexOf("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertNotSame(splaySubTree4, splaySubTree5);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotSame(splaySubTree4, splaySubTree6);
	      assertNotSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree7);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertEquals((-1L), long0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree7));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertEquals(7L, splaySubTree0.size());
	      assertEquals(6L, splaySubTree4.size());
	  }

	  @Test(timeout = 4000)
	  public void test34()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree1.add("s");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      long long0 = splaySubTree2.indexOf("");
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree0, splaySubTree1);
	      assertSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertEquals(2L, long0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertEquals(2L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      assertEquals(3L, splaySubTree2.size());
	  }

	  @Test(timeout = 4000)
	  public void test35()  throws Throwable  {
	      Integer integer0 = Integer.valueOf(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      long long0 = splaySubTree0.indexOf((Integer) null);
	      assertEquals((-1L), long0);
	      assertEquals(1L, splaySubTree0.size());
	  }

	  @Test(timeout = 4000)
	  public void test36()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("s");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree1.add("E =");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(1L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree3.size());
	      
	      SplaySubTree<String> splaySubTree4 = splaySubTree3.remove("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertSame(splaySubTree4, splaySubTree1);
	      assertNotSame(splaySubTree4, splaySubTree0);
	      assertNotSame(splaySubTree4, splaySubTree2);
	      assertNotSame(splaySubTree4, splaySubTree3);
	      assertNotNull(splaySubTree4);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree4.equals((Object)splaySubTree3));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree1.size());
	      assertEquals(3L, splaySubTree3.size());
	      assertEquals(3L, splaySubTree4.size());
	      
	      SplaySubTree<String> splaySubTree5 = splaySubTree3.remove("E =");
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree3);
	      assertSame(splaySubTree1, splaySubTree4);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree1, splaySubTree5);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree4);
	      assertSame(splaySubTree3, splaySubTree5);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertNotSame(splaySubTree3, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree4);
	      assertNotSame(splaySubTree5, splaySubTree1);
	      assertNotSame(splaySubTree5, splaySubTree2);
	      assertNotSame(splaySubTree5, splaySubTree0);
	      assertSame(splaySubTree5, splaySubTree3);
	      assertNotNull(splaySubTree5);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree5.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(0L, splaySubTree1.size());
	      assertEquals(2L, splaySubTree3.size());
	      assertEquals(2L, splaySubTree5.size());
	      
	      SplaySubTree<String> splaySubTree6 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree0);
	      assertNotSame(splaySubTree6, splaySubTree1);
	      assertNotSame(splaySubTree6, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree3);
	      assertNotSame(splaySubTree6, splaySubTree4);
	      assertNotSame(splaySubTree6, splaySubTree5);
	      assertNotNull(splaySubTree6);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree5));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree6.size());
	      
	      SplaySubTree<String> splaySubTree7 = splaySubTree6.get(1L);
	      assertNotSame(splaySubTree0, splaySubTree5);
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree6);
	      assertNotSame(splaySubTree0, splaySubTree4);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree7);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree0);
	      assertNotSame(splaySubTree6, splaySubTree1);
	      assertNotSame(splaySubTree6, splaySubTree7);
	      assertNotSame(splaySubTree6, splaySubTree2);
	      assertNotSame(splaySubTree6, splaySubTree3);
	      assertNotSame(splaySubTree6, splaySubTree4);
	      assertNotSame(splaySubTree6, splaySubTree5);
	      assertSame(splaySubTree7, splaySubTree2);
	      assertNotSame(splaySubTree7, splaySubTree1);
	      assertNotSame(splaySubTree7, splaySubTree6);
	      assertNotSame(splaySubTree7, splaySubTree3);
	      assertNotSame(splaySubTree7, splaySubTree5);
	      assertNotSame(splaySubTree7, splaySubTree0);
	      assertNotSame(splaySubTree7, splaySubTree4);
	      assertNotNull(splaySubTree7);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree4));
	      assertFalse(splaySubTree6.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree6));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree5));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree7.equals((Object)splaySubTree4));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree6.size());
	      assertEquals(1L, splaySubTree7.size());
	  }

	  @Test(timeout = 4000)
	  public void test37()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.get((-1L));
	      assertNull(splaySubTree1);
	      assertEquals(1L, splaySubTree0.size());
	  }

	  @Test(timeout = 4000)
	  public void test38()  throws Throwable  {
	      Integer integer0 = new Integer(0);
	      assertEquals(0, (int)integer0);
	      assertNotNull(integer0);
	      
	      SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<Integer> splaySubTree1 = splaySubTree0.get(2L);
	      assertNull(splaySubTree1);
	      assertEquals(1L, splaySubTree0.size());
	  }

	  @Test(timeout = 4000)
	  public void test39()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("s");
	      assertNotNull(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	      
	      SplaySubTree<String> splaySubTree1 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotNull(splaySubTree1);
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(2L, splaySubTree1.size());
	      
	      SplaySubTree<String> splaySubTree2 = splaySubTree0.add("");
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertNotSame(splaySubTree2, splaySubTree0);
	      assertNotSame(splaySubTree2, splaySubTree1);
	      assertNotNull(splaySubTree2);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree2.equals((Object)splaySubTree1));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(3L, splaySubTree2.size());
	      
	      SplaySubTree<String> splaySubTree3 = splaySubTree1.add("");
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertSame(splaySubTree3, splaySubTree1);
	      assertNotNull(splaySubTree3);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree3.size());
	      
	      String string0 = splaySubTree3.toString();
	      assertNotSame(splaySubTree0, splaySubTree3);
	      assertNotSame(splaySubTree0, splaySubTree1);
	      assertNotSame(splaySubTree0, splaySubTree2);
	      assertSame(splaySubTree1, splaySubTree3);
	      assertNotSame(splaySubTree1, splaySubTree2);
	      assertNotSame(splaySubTree1, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree0);
	      assertNotSame(splaySubTree3, splaySubTree2);
	      assertSame(splaySubTree3, splaySubTree1);
	      assertEquals(" data= left= null right= sz=4 cnt=2\n data= left= null right=s sz=2 cnt=1\n data=s left= null right null sz=1 cnt=1\n", string0);
	      assertNotNull(string0);
	      assertFalse(splaySubTree0.equals((Object)splaySubTree3));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree1));
	      assertFalse(splaySubTree0.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree2));
	      assertFalse(splaySubTree1.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree0));
	      assertFalse(splaySubTree3.equals((Object)splaySubTree2));
	      assertEquals(1L, splaySubTree0.size());
	      assertEquals(4L, splaySubTree1.size());
	      assertEquals(4L, splaySubTree3.size());
	  }

	  @Test(timeout = 4000)
	  public void test40()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>(" ");
	      splaySubTree0.add("");
	      splaySubTree0.add("s");
	      splaySubTree0.toString();
	      assertEquals(2L, splaySubTree0.size());
	  }

	  @Test(timeout = 4000)
	  public void test41()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      long long0 = splaySubTree0.size();
	      assertEquals(1L, long0);
	  }

	  @Test(timeout = 4000)
	  public void test42()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      splaySubTree0.split("");
	      assertEquals(1L, splaySubTree0.size());
	  }

	  @Test(timeout = 4000)
	  public void test43()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      splaySubTree0.join(splaySubTree0);
	      assertEquals(1L, splaySubTree0.size());
	  }

	  @Test(timeout = 4000)
	  public void test44()  throws Throwable  {
	      SplaySubTree<String> splaySubTree0 = new SplaySubTree<String>("");
	      splaySubTree0.getData();
	      assertEquals(1L, splaySubTree0.size());
	  }
}
