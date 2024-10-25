package net.mooctest;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class DiffiTest2 {

    @Test
    public void test() {
    	Option option = new Option(null);
    	Option option1 = new Option(null);
    	Diffi diffi = new Diffi(option);
    	diffi.addOption(option1);
    	
//    	diffi.parse(new String[3]);
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
    		FileDiffPatch.createPatch("/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt");
    		FileDiffPatch.createPatch("/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt",true);
    			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
    
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
    @Test
	public void test6() throws Exception {
    	String rootPath = System.getProperty("user.dir");
    	System.out.println(rootPath);
    	String path = rootPath + "\\src\\test\\java\\net\\mooctest\\b.txt";
//    	RelativeString relativeString = new RelativeString(new FileInputStream(path));
//    	RelativeString relativeString1 = new RelativeString(new FileInputStream("a"));
//    	relativeString.debugPrint();
	}
    @Test
	public void test7() throws Exception {
		StringLink stringLink = new StringLink(new byte[24]);
		
	}
    

}