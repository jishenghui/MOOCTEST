package net.mooctest;

import static org.junit.Assert.*;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class DiffiTest {

    @Test
    public void test() {
    	Option option = new Option(null);
    	Option option1 = new Option(null);
    	Diffi diffi = new Diffi(option);
    	diffi.addOption(option1);
    	
    	
    }
    @Test
    public void test1()  {
		ExtBoolArray extBoolArray = new ExtBoolArray(3);
		extBoolArray.setTrue(1, 2);
		assertFalse(extBoolArray.isFalse(1, 3));
		extBoolArray.setTrue(0, 2);
		assertTrue(extBoolArray.isFalse(2, 1));
		assertEquals(0, extBoolArray.left());
		ExtBoolArray extBoolArray1 = new ExtBoolArray(3);
		assertEquals(0, extBoolArray.left());
	}
    
    @Test
	public void test2(){
    	try {
//    		FileDiffPatch.createPatch("/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt");
//    		FileDiffPatch.createPatch("/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt",true);
//    			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
//    
    @Test
	public void test3()  {
//		try {
////			System.out.println(rootPath);
////			StringFromFile.readString(");
//			String rootPath = System.getProperty("user.dir");
//			
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
    	String rootPath = System.getProperty("user.dir");
    	System.out.println(rootPath);
    	String path = rootPath + "\\src\\test\\java\\net\\mooctest\\aa.txt";
    	try {
    		FileDiffPatch fileDiffPatch = new FileDiffPatch();
    		StringFromFile.readString(path);
    		FileDiffPatch.createPatch(path, path, path);
    		FileDiffPatch.createPatch(path, path, path,true);
    		FileDiffPatch.doPatch(path, path, path);
    		FileDiffPatch.doPatch(path, path, path,true);
    		FileDiffPatch.doPatch("A", null, null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
	}
    
    @Test
	public void test4() throws Exception {
    	IndexedString indexedString = new IndexedString("abc");
    	assertEquals(-1, indexedString.indexOf(new char[3]));
//    	assertEquals(, actual);
	}
    @Test
	public void test5() throws Exception {
		Option option = new Option("hzb","hh");
		Option option1 = new Option("hzb",true,"hh","hh1");
		assertEquals("hh", option.getBeschriebung());
		assertEquals("", option.getDelim());
		assertTrue(option1.isHasArg());
		assertFalse(option.isHasArg());
		assertEquals("hzb", option.getName());
		assertEquals("", option.getDefaultv());
		assertEquals("hh1", option1.getDefaultv());
		assertFalse(option.isIsSet());
		option.parse("a");
		assertTrue(option.isIsSet());
		try {
			option.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			option1.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Option option2 = new Option("hzb", "h", true, "h", "a");
		option2.parse("hzbhaaaa");
		try {

			assertEquals("aaa", option2.getValue());
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		assertFalse(option.is("aaa"));
		Option option3 = new Option("");
		assertTrue(option3.is("-"));
		assertFalse(option2.is("-"));
		Option option4 = new Option("",true,"","");
		assertTrue(option4.is("-"));
		option4.parse("abcd");
		assertFalse(option4.is("-"));
		
	}
//    @Test
//	public void test6() throws Exception {
//    	String rootPath = System.getProperty("user.dir");
//    	System.out.println(rootPath);
//    	String path = rootPath + "\\src\\test\\java\\net\\mooctest\\b.txt";
////    	RelativeString relativeString = new RelativeString(new FileInputStream(path));
////    	RelativeString relativeString1 = new RelativeString(new FileInputStream("a"));
////    	relativeString.debugPrint();
//	}
    @Test
	public void test7() throws Exception {
		StringLink stringLink = new StringLink(new byte[24]);
		IndexedString indexedString = new IndexedString("hello");
		assertEquals(1, indexedString.indexOf("el".toCharArray()));

        assertEquals(-1, indexedString.indexOf("world".toCharArray()));

        assertEquals(0, indexedString.indexOf("h".toCharArray()));

        assertEquals(2, indexedString.indexOf("ll".toCharArray()));
  
       
	}
    @Test
	public void test8() throws Exception {
		StringLink stringLink = new StringLink(0, 10, 20);
		assertEquals(20, stringLink.getLen());
		assertEquals(10, stringLink.getPosNew());
		assertEquals(0, stringLink.getPosOrig());
		assertEquals("{" + 20 + ": " + 0 + "-->" + 10 + "}", stringLink.toString());
		assertNotNull(stringLink.toBytes());
	}
    @Test
	public void test9() throws Exception {
		Diffi diffi = new Diffi();
		diffi.addOption(new Option(""));
		String[] string = {"-"};
		diffi.parse(string);
		Diffi diffi1 = new Diffi();
		Option option = new Option("");
		option.parse("");
		diffi1.addOption(option);
		diffi1.parse(string);
	}
    @Test
	public void test10() throws Exception {
    	StringIncrementor stringIdicrementor = new StringIncrementor();
    	StringIncrementor.diff("a", "b");
    	StringIncrementor.patch("a", new RelativeString());
    	String rootPath = System.getProperty("user.dir");
    	String path = rootPath + "\\src\\test\\java\\net\\mooctest\\b.txt";
    	
    	StringFromFile stringFromFile = new StringFromFile();
    	RelativeString relativeString = new RelativeString();
    	StringLink stringLink = new StringLink(10, 0, 20);
    	assertTrue(relativeString.addLink(stringLink));
//    	assertEquals(null,relativeString.getLink(-1));
    	assertEquals(stringLink, relativeString.getLink(0));
    	relativeString.debugPrint();
	}
    

}
