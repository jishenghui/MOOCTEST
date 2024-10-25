/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AVLNodeTest {static class __CLR4_4_18q8qll3inmq0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0030\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0041\u0056\u004c\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691572609207L,8589935092L,443,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private final String testFilePath = "src/test/java/net/mooctest/test.txt";
	private final String testFilePath1 = "src/test/java/net/mooctest/test1.txt";
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test(timeout=1000)
	public void testInster() throws Exception{__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bphk5o8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testInster",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bphk5o8q() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(314);
		__CLR4_4_18q8qll3inmq0.R.inc(315);AVLNode<Integer> avlNode = new AVLNode<Integer>(2);
		__CLR4_4_18q8qll3inmq0.R.inc(316);AVLNode<Integer> avlNode1 = new AVLNode<Integer>(2);
		__CLR4_4_18q8qll3inmq0.R.inc(317);assertFalse(avlNode.search(0));
		
		__CLR4_4_18q8qll3inmq0.R.inc(318);avlNode.insert(10);
		__CLR4_4_18q8qll3inmq0.R.inc(319);avlNode.insert(6);
		__CLR4_4_18q8qll3inmq0.R.inc(320);avlNode.insert(-1);
		__CLR4_4_18q8qll3inmq0.R.inc(321);avlNode.insert(-10);
		
		__CLR4_4_18q8qll3inmq0.R.inc(322);avlNode1.insert(3);
		__CLR4_4_18q8qll3inmq0.R.inc(323);avlNode1.insert(1);
		__CLR4_4_18q8qll3inmq0.R.inc(324);avlNode1.insert(0);
		__CLR4_4_18q8qll3inmq0.R.inc(325);avlNode1.insert(-1);
		
		__CLR4_4_18q8qll3inmq0.R.inc(326);assertTrue(avlNode1.search(2));
		__CLR4_4_18q8qll3inmq0.R.inc(327);assertTrue(avlNode1.search(3));
		
		__CLR4_4_18q8qll3inmq0.R.inc(328);assertTrue(avlNode1.search(1));
		__CLR4_4_18q8qll3inmq0.R.inc(329);assertTrue(avlNode1.search(0));
		__CLR4_4_18q8qll3inmq0.R.inc(330);assertTrue(avlNode1.search(-1));
		
		__CLR4_4_18q8qll3inmq0.R.inc(331);assertTrue(avlNode.search(2));
		__CLR4_4_18q8qll3inmq0.R.inc(332);assertTrue(avlNode.search(-1));
		__CLR4_4_18q8qll3inmq0.R.inc(333);assertTrue(avlNode.search(10));
		__CLR4_4_18q8qll3inmq0.R.inc(334);assertTrue(avlNode.search(-10));
		__CLR4_4_18q8qll3inmq0.R.inc(335);assertTrue(avlNode.search(6));
		__CLR4_4_18q8qll3inmq0.R.inc(336);assertFalse(avlNode.search(100));
		
	}finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	@Test(timeout=1000)
	public void testDelete() throws Exception{__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yilj0c9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testDelete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yilj0c9d() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(337);
		__CLR4_4_18q8qll3inmq0.R.inc(338);AVLNode<Integer> avlNode = new AVLNode<Integer>(2);
		
		
		__CLR4_4_18q8qll3inmq0.R.inc(339);avlNode.insert(5);
		__CLR4_4_18q8qll3inmq0.R.inc(340);avlNode.insert(4);
		__CLR4_4_18q8qll3inmq0.R.inc(341);avlNode.insert(3);
		__CLR4_4_18q8qll3inmq0.R.inc(342);avlNode.insert(-10);


		__CLR4_4_18q8qll3inmq0.R.inc(343);avlNode.delete(-10);
		__CLR4_4_18q8qll3inmq0.R.inc(344);assertTrue(avlNode.search(2));

		__CLR4_4_18q8qll3inmq0.R.inc(345);assertFalse(avlNode.search(-10));

		__CLR4_4_18q8qll3inmq0.R.inc(346);assertFalse(avlNode.search(5));
		__CLR4_4_18q8qll3inmq0.R.inc(347);assertFalse(avlNode.search(4));
		__CLR4_4_18q8qll3inmq0.R.inc(348);assertTrue(avlNode.search(3));

	}finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}
	 @Test(timeout=1000)
	 public void testFindMin() throws Exception {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198ntxq9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testFindMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198ntxq9p() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(349);
		 __CLR4_4_18q8qll3inmq0.R.inc(350);AVLNode<Integer> avlNode = new AVLNode<Integer>(5);
		 
		 __CLR4_4_18q8qll3inmq0.R.inc(351);avlNode.insert(4);
		 __CLR4_4_18q8qll3inmq0.R.inc(352);avlNode.insert(6);
		 __CLR4_4_18q8qll3inmq0.R.inc(353);avlNode.insert(3);
		 __CLR4_4_18q8qll3inmq0.R.inc(354);avlNode.insert(7);
		 __CLR4_4_18q8qll3inmq0.R.inc(355);avlNode.insert(1);
		 __CLR4_4_18q8qll3inmq0.R.inc(356);avlNode.insert(8);
		 __CLR4_4_18q8qll3inmq0.R.inc(357);avlNode.insert(0);
		 
		 
		 
		 __CLR4_4_18q8qll3inmq0.R.inc(358);assertEquals(Integer.valueOf(0), avlNode.findMin(avlNode).getElement());
		
	 }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}
	
	 @Test(timeout=1000)
	    public void testInsertWord() {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1440o589z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testInsertWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),359,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1440o589z(){try{__CLR4_4_18q8qll3inmq0.R.inc(359);
	        __CLR4_4_18q8qll3inmq0.R.inc(360);Tree tree = new Tree();
	        __CLR4_4_18q8qll3inmq0.R.inc(361);assertTrue(tree.insertWord("apple"));
	        __CLR4_4_18q8qll3inmq0.R.inc(362);assertTrue(tree.insertWord("banana"));
	        __CLR4_4_18q8qll3inmq0.R.inc(363);assertFalse(tree.insertWord("apple")); // \u95b2\u5d85\ue632\u93bb\u6391\u53c6\u9429\u7a3f\u6093\u9357\u66e1\u761d
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}


	    @Test(timeout=1000)
	    public void testInsertWordsFromFile() {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166oklxa4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testInsertWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),364,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166oklxa4(){try{__CLR4_4_18q8qll3inmq0.R.inc(364);
	        __CLR4_4_18q8qll3inmq0.R.inc(365);File file = new File(testFilePath);
	        __CLR4_4_18q8qll3inmq0.R.inc(366);Tree tree = new Tree();
	        __CLR4_4_18q8qll3inmq0.R.inc(367);boolean[] inserted = tree.insertWords(file);

	        __CLR4_4_18q8qll3inmq0.R.inc(368);assertNotNull(inserted);
	        __CLR4_4_18q8qll3inmq0.R.inc(369);assertEquals(2, inserted.length);
	        __CLR4_4_18q8qll3inmq0.R.inc(370);assertTrue(inserted[0]);
	        __CLR4_4_18q8qll3inmq0.R.inc(371);assertTrue(inserted[1]);
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testDeleteWord() throws Exception {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn6viqac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testDeleteWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn6viqac() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(372);
	        __CLR4_4_18q8qll3inmq0.R.inc(373);Tree tree = new Tree();
	        __CLR4_4_18q8qll3inmq0.R.inc(374);tree.insertWord("apple");
	        __CLR4_4_18q8qll3inmq0.R.inc(375);tree.insertWord("banana");

	        __CLR4_4_18q8qll3inmq0.R.inc(376);assertTrue(tree.deleteWord("apple"));
	        __CLR4_4_18q8qll3inmq0.R.inc(377);assertFalse(tree.deleteWord("orange")); // \u6d93\u5d85\u74e8\u9366\u3127\u6b91\u9357\u66e1\u761d
	        __CLR4_4_18q8qll3inmq0.R.inc(378);assertTrue(tree.deleteWord("banana"));
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testDeleteWordsFromFile() throws Exception {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14akxtlaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testDeleteWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14akxtlaj() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(379);
	        __CLR4_4_18q8qll3inmq0.R.inc(380);File file = new File(testFilePath1);
	        __CLR4_4_18q8qll3inmq0.R.inc(381);Tree tree = new Tree();
	        
	        __CLR4_4_18q8qll3inmq0.R.inc(382);System.out.println(tree.insertWord("apple"));
	        __CLR4_4_18q8qll3inmq0.R.inc(383);tree.insertWord("banana");
	        __CLR4_4_18q8qll3inmq0.R.inc(384);boolean[] deleted = tree.deleteWords(file);

	        __CLR4_4_18q8qll3inmq0.R.inc(385);assertNotNull(deleted);
	        __CLR4_4_18q8qll3inmq0.R.inc(386);assertEquals(2, deleted.length);
	        __CLR4_4_18q8qll3inmq0.R.inc(387);assertTrue(deleted[0]);
	        __CLR4_4_18q8qll3inmq0.R.inc(388);assertTrue(deleted[1]);
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testSearchWord() throws Exception {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1asogbat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testSearchWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),389,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1asogbat() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(389);
	        __CLR4_4_18q8qll3inmq0.R.inc(390);Tree tree = new Tree();
	        __CLR4_4_18q8qll3inmq0.R.inc(391);tree.insertWord("apple");
	        __CLR4_4_18q8qll3inmq0.R.inc(392);tree.insertWord("banana");

	        __CLR4_4_18q8qll3inmq0.R.inc(393);assertTrue(tree.searchWord("apple"));
	        __CLR4_4_18q8qll3inmq0.R.inc(394);assertFalse(tree.searchWord("orange")); // \u6d93\u5d85\u74e8\u9366\u3127\u6b91\u9357\u66e1\u761d
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testSearchWordsFromFile() throws Exception {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxttz0az();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testSearchWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),395,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxttz0az() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(395);
	        __CLR4_4_18q8qll3inmq0.R.inc(396);File file = new File(testFilePath);
	        __CLR4_4_18q8qll3inmq0.R.inc(397);Tree tree = new Tree();
	        __CLR4_4_18q8qll3inmq0.R.inc(398);tree.insertWord("apple");
	        __CLR4_4_18q8qll3inmq0.R.inc(399);tree.insertWord("banana");
	        __CLR4_4_18q8qll3inmq0.R.inc(400);boolean[] found = tree.searchWords(file);

	        __CLR4_4_18q8qll3inmq0.R.inc(401);assertNotNull(found);
	        __CLR4_4_18q8qll3inmq0.R.inc(402);assertEquals(2, found.length);
	        __CLR4_4_18q8qll3inmq0.R.inc(403);assertTrue(found[0]);
	        __CLR4_4_18q8qll3inmq0.R.inc(404);assertTrue(found[1]);
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}
	    @Test(timeout=1000)
	    public void testException() {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12aalq4b9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),405,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12aalq4b9(){try{__CLR4_4_18q8qll3inmq0.R.inc(405);
	    	__CLR4_4_18q8qll3inmq0.R.inc(406);Tree tree = new Tree();
	    	__CLR4_4_18q8qll3inmq0.R.inc(407);try {
				__CLR4_4_18q8qll3inmq0.R.inc(408);tree.searchWord("apple");
				__CLR4_4_18q8qll3inmq0.R.inc(409);tree.deleteWord("apple");
				
			} catch (Exception e) {
				__CLR4_4_18q8qll3inmq0.R.inc(410);e.printStackTrace();
//				thrown.expect(Exception.class);
//				thrown.expectMessage("Tree is empty");
			}
	    	__CLR4_4_18q8qll3inmq0.R.inc(411);Tree tree2 = new Tree();
	    	__CLR4_4_18q8qll3inmq0.R.inc(412);assertNull(tree2.insertWords(new File("test.txt")));
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testGetSize()  throws Exception{__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1424v1obh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testGetSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),413,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1424v1obh() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(413);
	        __CLR4_4_18q8qll3inmq0.R.inc(414);Tree tree = new Tree();
	        __CLR4_4_18q8qll3inmq0.R.inc(415);tree.insertWord("apple");
	        __CLR4_4_18q8qll3inmq0.R.inc(416);tree.insertWord("banana");
	        __CLR4_4_18q8qll3inmq0.R.inc(417);tree.insertWord("orange");
	        __CLR4_4_18q8qll3inmq0.R.inc(418);tree.deleteWord("banana");

	        __CLR4_4_18q8qll3inmq0.R.inc(419);assertEquals(2, tree.getSize());
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testGetHeightAndToString() {__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lb2addbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testGetHeightAndToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lb2addbo(){try{__CLR4_4_18q8qll3inmq0.R.inc(420);
	        __CLR4_4_18q8qll3inmq0.R.inc(421);Tree tree = new Tree();
	        
	        __CLR4_4_18q8qll3inmq0.R.inc(422);assertEquals(0, tree.getHeight());
	        __CLR4_4_18q8qll3inmq0.R.inc(423);tree.insertWord("apple");
	        __CLR4_4_18q8qll3inmq0.R.inc(424);tree.insertWord("banana");
	        __CLR4_4_18q8qll3inmq0.R.inc(425);tree.insertWord("orange");

	        __CLR4_4_18q8qll3inmq0.R.inc(426);System.out.println(tree.toString());
	        __CLR4_4_18q8qll3inmq0.R.inc(427);String expectedOutput =
	                "   bannana   \n" +
	                "  / \\  \n" +
	                " apple orange \n"+
	                "        \r\n"
	                ;
	        __CLR4_4_18q8qll3inmq0.R.inc(428);assertEquals(2, tree.getHeight());
			__CLR4_4_18q8qll3inmq0.R.inc(429);assertNotEquals(expectedOutput, tree);
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}
	    
		@Test(timeout=1000)
	    public void testPrintNode() throws Exception{__CLR4_4_18q8qll3inmq0.R.globalSliceStart(getClass().getName(),430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p39xfgby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qll3inmq0.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qll3inmq0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.testPrintNode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p39xfgby() throws Exception{try{__CLR4_4_18q8qll3inmq0.R.inc(430);
	        __CLR4_4_18q8qll3inmq0.R.inc(431);AVLNode<Integer> root = new AVLNode<>(4);
	        __CLR4_4_18q8qll3inmq0.R.inc(432);root.insert(2);
	        __CLR4_4_18q8qll3inmq0.R.inc(433);String s1 = 
	        		" 4   \r\n" + 
	        		"/   \r\n" + 
	        		"2   \n";
	        __CLR4_4_18q8qll3inmq0.R.inc(434);assertNotEquals(s1,TreePrinter.printNode(root));
	        __CLR4_4_18q8qll3inmq0.R.inc(435);root.insert(6);
	        __CLR4_4_18q8qll3inmq0.R.inc(436);root.insert(1);
	        __CLR4_4_18q8qll3inmq0.R.inc(437);root.insert(3);
	        __CLR4_4_18q8qll3inmq0.R.inc(438);root.insert(5);
	        __CLR4_4_18q8qll3inmq0.R.inc(439);root.insert(7);

	        __CLR4_4_18q8qll3inmq0.R.inc(440);String expectedOutput =
	                "   4   \n" +
	                "  / \\  \n" +
	                " 2   6 \n" +
	                "/ \\ / \\ \n" +
	                "1 3 5 7 \n";

	        __CLR4_4_18q8qll3inmq0.R.inc(441);String output = TreePrinter.printNode(root);
	        __CLR4_4_18q8qll3inmq0.R.inc(442);assertNotEquals(expectedOutput, output);
	    }finally{__CLR4_4_18q8qll3inmq0.R.flushNeeded();}}

	
	
}
