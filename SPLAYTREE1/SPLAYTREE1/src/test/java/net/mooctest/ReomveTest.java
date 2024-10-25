package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReomveTest {

//	@Test
//	public void test() {
//		Integer i1 = new Integer(0);
//		SplaySubTree<Integer> s1 = new SplaySubTree<Integer>(i1);
//		s1.add(2);
//		s1.add(-1);
//		SplaySubTree<Integer> s2 = s1.remove(i1);
//		
//		System.out.println(s2);
//		SplaySubTree<Integer> s3 = s2.remove(2);
//		System.out.println(s3);
//		SplaySubTree<Integer> s4 = s2.remove(-1);
//		System.out.println(s4);
//		SplaySubTree<Integer> s5 = s2.remove(0);
//		System.out.println(s5);
////		SplaySubTree<Integer> s6 = s5.remove(-1);
////		System.out.println(s6);
////		SplaySubTree<Integer> s6 = s5.remove(2);
////		System.out.println(s6);
//		
//	}
	
	@Test
	public void name() {
		String A = "A";
		String B = "B";
		String a = "a";
		
		SplaySubTree<String> s1 = new SplaySubTree<String>(B);
		s1.add(a);
		s1.add(A);
		System.out.println(s1.size());
		System.out.println(s1);
		
		SplaySubTree<String> s2 = s1.remove(a);
		System.out.println(s2.size());
		System.out.println(s2);
		
		SplaySubTree<String> s3 = s2.remove(A);
		System.out.println(s3.size());
		System.out.println(s3);
		SplaySubTree<String> s4 = s3.remove(a);
		System.out.println(s4.size());
		System.out.println(s4);
		SplaySubTree<String> s5 = s4.remove(a);
		System.out.println(s5.size());
		System.out.println(s5);
		
		SplaySubTree<String> s6 = s5.remove(A);
		System.out.println(s6.size());
		System.out.println(s6);
		
		SplaySubTree<String> s7 = s6.remove(A);
		System.out.println(s7.size());
		System.out.println(s7);
		SplaySubTree<String> s8 = s7.remove(B);
		System.out.println(s8.size());
		System.out.println(s8);
		
		
	}

}
