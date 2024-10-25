package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.hamcrest.core.StringContains.containsString;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class AVLNodeTest {

	@Test
	public void test() throws Exception {


		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream oldOUT = System.out;
		System.setOut(new PrintStream(outContent));
		System.out.println(outContent.toString());


		AVLNode<Integer> n1 = new AVLNode<>(40);
		AVLNode<Integer> n2 = new AVLNode<>(40);
		AVLNode<Integer> n3 = new AVLNode<>(40);


		n1.insert(20);
		n1.insert(60);
		n1.insert(10);
		n1.insert(30);
		n1.insert(50);
		n1.insert(70);

		assertTrue(n1.search(10));
		assertTrue(n1.search(20));
		assertTrue(n1.search(30));
		assertTrue(n1.search(40));
		assertTrue(n1.search(50));
		assertTrue(n1.search(60));
		assertTrue(n1.search(70));
		assertFalse(n1.search(5));
		assertFalse(n1.search(100));
		n1 = n1.delete(20);
		n1 = n1.delete(60);
		n1 = n1.delete(10);

		assert !n1.search(10);
		assert !n1.search(20);
		assert !n1.search(60);
		assert n1.search(30);
		assert n1.search(40);
		assert n1.search(50);
		assert n1.search(70);

		try {
			n1.insert(40);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertNull(n2.delete(0));
		n1.findMin(n2);
		n1.getLeft();
		n1.getRight();

		n2.findMin(n1);
		n1 = n1.delete(40);
		n1 = n1.delete(20);



		try {
			n2.insert(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			n2.insert(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		n2.insert(10);
		n2.insert(101);
		n2.insert(102);
		n2.insert(-1);
		n2.insert(-2);
		try {
			n2.insert(100);
		}catch (Exception e){}

		n3.insert(10);
		n3.insert(15);
		n3.insert(20);
		n3.insert(25);
		n3.insert(70);
		n3.insert(100);
		TreePrinter.printNode(n1);
		TreePrinter.printNode(n2);
		TreePrinter.printNode(n3);

		try {
			n3.insert(73);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			n3.insert(72);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		n3.delete(2);
		n3.delete(10);
		n3.delete(50);
		n3.delete(100);
		n3.delete(73);

		AVLNode<Integer> n4 = new AVLNode<>(40, null, n2);
		AVLNode<Integer> n5 = new AVLNode<>(40, n1, null);

		n4.delete(10);
		Class<?> clazz = AVLNode.class;
		Method method = clazz.getDeclaredMethod("remove", Object.class, AVLNode.class);
		method.setAccessible(true);
		Object result = method.invoke(n4, 10, n4);
		Object result1 = method.invoke(n4, 50, n4);
		Object result2 = method.invoke(n5, 10, n4);
		Object result3 = method.invoke(n4, 50, n4);
		Tree t1 = new Tree();
		Tree t2 = new Tree();

		assertTrue(t1.insertWord("a"));
		assertTrue(t1.insertWord("b"));
		try {
			t1.insertWord("a");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

		assertNotEquals("", t1.toString());
		assertNotEquals(" ", t1.toString());

		File f1 = new File("src/test/resources/1.txt");
		t1.insertWords(f1);
//		try{
//			File f2 = new File("src/test/resources");
//			t1.insertWords(f2);
//		}catch (Exception e){
//		}
		try {
			t1.deleteWord(null);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		t1.deleteWords(f1);
		try {
			t1.searchWord("a");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			t1.deleteWord("a");
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		assertTrue(t1.insertWord("a"));
		assertTrue(t1.insertWord("ada"));
		assertTrue(t1.insertWord("aa"));
		Class<?> clazz1 = Tree.class;
		Field field = clazz1.getDeclaredField("size");
		field.setAccessible(true);
		int size = (int)field.get(t1);
		assertEquals(3, size);

		assertFalse(t1.deleteWord("da"));
		assertTrue(t1.deleteWord("ada"));
		assertTrue(t1.deleteWord("aa"));
		assertTrue(t1.deleteWord("a"));

		size = (int)field.get(t1);
		assertEquals(0, size);

		t1.insertWords(f1);
//		t1.deleteWord(null);
//		try{
//			File f2 = new File("src/test/resources");
//			t1.deleteWords(f2);
//		}catch (Exception e){
//		}
//		try{
//			File f2 = new File("src/test/resources");
//			t1.searchWords(f2);
//		}catch (Exception e){
//		}
//		t1.deleteWord("n");
		t1.searchWords(f1);
		t1.getHeight();
		t1.getSize();
		t2.getHeight();


		t2.insertWord("a");
		t2.insertWord("ada");
		t2.insertWord("aa");

		assertTrue(t2.deleteWord("ada"));
		assertTrue(t2.deleteWord("a"));
		assertTrue(t2.deleteWord("aa"));
//		System.out.println(t2.toString());
		String s1 = "  b";
		String s2 = " a";
		String s3 = "        ";
		String s4 = " 40";
		String s5 = "100 70";
		String s6 = "        ";
		String s7 = "        ";


		assertThat(outContent.toString(), containsString("null"));
		assertThat(outContent.toString(), containsString("Tree is empty"));
		assertThat(outContent.toString(), containsString("a"));
		assertThat(outContent.toString(), containsString("b"));
		assertThat(outContent.toString(), containsString("Duplicate"));
		assertThat(outContent.toString(), containsString(s1));
		assertThat(outContent.toString(), containsString(s2));
		assertThat(outContent.toString(), containsString(s3));
		assertThat(outContent.toString(), containsString(s4));
		assertThat(outContent.toString(), containsString(s5));
		assertThat(outContent.toString(), containsString(s6));
		assertThat(outContent.toString(), containsString(s7));

	}




}
