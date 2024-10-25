package net.mooctest;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.junit.Test;

public class DiffiTest {

	@Test
	public void test() {
		Option option = new Option(null);
		Diffi diffi = new Diffi(option);
	}
	@Test
	public void test1() throws Exception {
		ExtBoolArray extBoolArray = new ExtBoolArray(10);
		assertTrue(extBoolArray.isFalse(10, 2));

		assertTrue(extBoolArray.isFalse(0, 9));
		extBoolArray.setTrue(5, 5);
		assertFalse(extBoolArray.isFalse(5, 5));
		assertEquals(9, extBoolArray.left());
		extBoolArray.setTrue(0, 9);
		assertEquals(0, extBoolArray.left());
		extBoolArray.setTrue(9, 6);

	}
	@Test
	public void test2() throws Exception {
		IndexedString indexedString = new IndexedString("123");
		char[] c = "123".toCharArray();
		char[] c1 = "223".toCharArray();
		assertEquals(0, indexedString.indexOf(c));
		assertEquals(-1, indexedString.indexOf(c1));
		assertEquals(-1, indexedString.indexOf("11111111".toCharArray()));
		assertEquals(-1, indexedString.indexOf("1234455".toCharArray()));

	}
	@Test
	public void test3() throws Exception {
		Option option = new Option(null);
		Option option2 = new Option("苹果","好吃");
		Option option3 = new Option("苹果",true,"好吃","no");
		Option option4 = new Option("","");
		Option option5 = new Option(null,true,"好吃","no");
		Option option6 = new Option("111",true,"11","no");
		Diffi diffi = new Diffi(option);
		assertEquals("好吃", option2.getBeschriebung());
		assertEquals("", option.getBeschriebung());
		assertEquals("", option2.getDelim());
		assertFalse(option2.isHasArg());
		assertTrue(option3.isHasArg());
		assertEquals("苹果", option2.getName());
		assertNull(option.getName());
		assertEquals("",option4.getName() );
		assertEquals("", option2.getDefaultv());
		assertEquals("no", option3.getDefaultv());
		assertFalse(option.isIsSet());
		try {
			option2.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		try {
			option3.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		option2.parse("1");
		try {
			option3.parse("2");
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			option5.parse("1234");
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

		option2.parse("1234");
		option6.parse("111111111");
		assertEquals("111", option6.getValue());
		try {
			assertTrue(option.is("123"));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		assertFalse(option2.is("苹果"));
		assertFalse(option6.is("-111"+"11"));


	}

	@Test
	public void test4() throws Exception {
//    	Option option = new Option(null);
		Diffi diffi = new Diffi();
		Option option2 = new Option("苹果","好吃");
		diffi.addOption(option2);
//    	option2.parse("111111");
		String[] strings = {"-苹果"+"","22","33"};
		diffi.parse(strings);
	}
	@Test
	public void test5() throws Exception {
		FileDiffPatch.createPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt");
		FileDiffPatch.createPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);
		try {
			FileDiffPatch.createPatch("src/main/java/net/mooctest/input1.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);

		} catch (Exception e) {
			// TODO: handle exception
		}
		FileDiffPatch.doPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt");
		FileDiffPatch.doPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);
		try {
			FileDiffPatch.doPatch("src/main/java/net/mooctest/input1.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//	@Test
//	public void test6() throws Exception {
//		FileInputStream b = new FileInputStream("src/main/java/net/mooctest/input.txt");
//		RelativeString relativeString = new RelativeString();
//
//		try {
//			FileInputStream b1 = new FileInputStream("src/main/java/net/mooctest/input1.txt");
//
//			RelativeString r = new RelativeString(b1);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		StringFromFile stringFromFile = new StringFromFile();
//	}
	@Test
	public void test7() throws Exception {
		StringIncrementor stringIncrementor = new StringIncrementor();
		stringIncrementor.diff("", "");
		stringIncrementor.diff("", "123456789012122");
		stringIncrementor.diff("123456789012122", "123456789012122");
		try {
			stringIncrementor.diff(null,null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		try {
			stringIncrementor.diff("11", "123456789012122",true);
		} catch (Exception e) {
			// TODO: handle exception
		}


		stringIncrementor.diff("123456789012122", "123456789012122",true);
//    	stringIncrementor.diff("1111", "12345678901212211111111111111111111111111",true);



	}

	@Test
	public void test8() throws Exception {
		StringLink stringLink = new StringLink(1,2,3);
		byte[] bs = "aaaa".getBytes();
		try {
			StringLink stringLin1 = new StringLink(bs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		assertEquals(3, stringLink.getLen());
		assertEquals(2, stringLink.getPosNew());
		assertEquals(1, stringLink.getPosOrig());
		assertNotNull(stringLink.toBytes());
		StringLink stringLink2 = new StringLink(1,2,-1);
		assertNotNull(stringLink.toBytes());

	}
	@Test
	public void test9() throws Exception {
		RelativeString relativeString = new RelativeString();
		assertEquals(0, relativeString.linksCount());
		try {
			assertEquals("", relativeString.getLink(0));
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		assertTrue(relativeString.addLink(new StringLink(0, 1, 2)));
		assertNotNull(relativeString.getLink(0));
		relativeString.debugPrint();
		FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/net/mooctest/output.txt");
		relativeString.bytesToStream(fileOutputStream);
		try {
			FileOutputStream fileOutputStream1 = new FileOutputStream("src/main/java/net/mooctest/output2.txt");
			relativeString.bytesToStream(fileOutputStream1);
		} catch (Exception e) {
			// TODO: handle exception
		}

		assertEquals(2, relativeString.getLength());
		StringIncrementor stringIncrementor = new StringIncrementor();
	}
	@Test
	public void test10() throws Exception {
//    	RelativeString relativeString = new RelativeString(new FileInputStream("src/main/java/net/mooctest/input.txt"));
		RelativeString relativeString = new RelativeString();
		relativeString.addLink(new StringLink("123".getBytes()));

		StringIncrementor.patch("123", relativeString);
		FileDiffPatch fileDiffPatch = new FileDiffPatch();
		relativeString.addLink(new StringLink(2,2,3));
//    	StringIncrementor.patch("123", relativeString);
	}

}
