/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AVLNodeTest2 {static class __CLR4_4_1cxcxll3w8lob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0030\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0041\u0056\u004c\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691595422589L,8589935092L,594,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private final String testFilePath = "src/test/java/net/mooctest/test.txt";
	private final String testFilePath1 = "src/test/java/net/mooctest/test1.txt";
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test(timeout=1000)
	public void testInster() throws Exception{__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bphk5ocx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testInster",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),465,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bphk5ocx() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(465);
		__CLR4_4_1cxcxll3w8lob.R.inc(466);AVLNode<Integer> avlNode = new AVLNode<Integer>(2);
		__CLR4_4_1cxcxll3w8lob.R.inc(467);AVLNode<Integer> avlNode1 = new AVLNode<Integer>(2);
		__CLR4_4_1cxcxll3w8lob.R.inc(468);assertFalse(avlNode.search(0));
		
		__CLR4_4_1cxcxll3w8lob.R.inc(469);avlNode.insert(10);
		__CLR4_4_1cxcxll3w8lob.R.inc(470);avlNode.insert(6);
		__CLR4_4_1cxcxll3w8lob.R.inc(471);avlNode.insert(-1);
		__CLR4_4_1cxcxll3w8lob.R.inc(472);avlNode.insert(-10);
		
		__CLR4_4_1cxcxll3w8lob.R.inc(473);avlNode1.insert(3);
		__CLR4_4_1cxcxll3w8lob.R.inc(474);avlNode1.insert(1);
		__CLR4_4_1cxcxll3w8lob.R.inc(475);avlNode1.insert(0);
		__CLR4_4_1cxcxll3w8lob.R.inc(476);avlNode1.insert(-1);
		
		__CLR4_4_1cxcxll3w8lob.R.inc(477);assertTrue(avlNode1.search(2));
		__CLR4_4_1cxcxll3w8lob.R.inc(478);assertTrue(avlNode1.search(3));
		
		__CLR4_4_1cxcxll3w8lob.R.inc(479);assertTrue(avlNode1.search(1));
		__CLR4_4_1cxcxll3w8lob.R.inc(480);assertTrue(avlNode1.search(0));
		__CLR4_4_1cxcxll3w8lob.R.inc(481);assertTrue(avlNode1.search(-1));
		
		__CLR4_4_1cxcxll3w8lob.R.inc(482);assertTrue(avlNode.search(2));
		__CLR4_4_1cxcxll3w8lob.R.inc(483);assertTrue(avlNode.search(-1));
		__CLR4_4_1cxcxll3w8lob.R.inc(484);assertTrue(avlNode.search(10));
		__CLR4_4_1cxcxll3w8lob.R.inc(485);assertTrue(avlNode.search(-10));
		__CLR4_4_1cxcxll3w8lob.R.inc(486);assertTrue(avlNode.search(6));
		__CLR4_4_1cxcxll3w8lob.R.inc(487);assertFalse(avlNode.search(100));
		
	}finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	@Test(timeout=1000)
	public void testDelete() throws Exception{__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yilj0cdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testDelete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yilj0cdk() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(488);
		__CLR4_4_1cxcxll3w8lob.R.inc(489);AVLNode<Integer> avlNode = new AVLNode<Integer>(2);
		
		
		__CLR4_4_1cxcxll3w8lob.R.inc(490);avlNode.insert(5);
		__CLR4_4_1cxcxll3w8lob.R.inc(491);avlNode.insert(4);
		__CLR4_4_1cxcxll3w8lob.R.inc(492);avlNode.insert(3);
		__CLR4_4_1cxcxll3w8lob.R.inc(493);avlNode.insert(-10);


		__CLR4_4_1cxcxll3w8lob.R.inc(494);avlNode.delete(-10);
		__CLR4_4_1cxcxll3w8lob.R.inc(495);assertTrue(avlNode.search(2));

		__CLR4_4_1cxcxll3w8lob.R.inc(496);assertFalse(avlNode.search(-10));

		__CLR4_4_1cxcxll3w8lob.R.inc(497);assertFalse(avlNode.search(5));
		__CLR4_4_1cxcxll3w8lob.R.inc(498);assertFalse(avlNode.search(4));
		__CLR4_4_1cxcxll3w8lob.R.inc(499);assertTrue(avlNode.search(3));

	}finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}
	 @Test(timeout=1000)
	 public void testFindMin() throws Exception {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198ntxqdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testFindMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198ntxqdw() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(500);
		 __CLR4_4_1cxcxll3w8lob.R.inc(501);AVLNode<Integer> avlNode = new AVLNode<Integer>(5);
		 
		 __CLR4_4_1cxcxll3w8lob.R.inc(502);avlNode.insert(4);
		 __CLR4_4_1cxcxll3w8lob.R.inc(503);avlNode.insert(6);
		 __CLR4_4_1cxcxll3w8lob.R.inc(504);avlNode.insert(3);
		 __CLR4_4_1cxcxll3w8lob.R.inc(505);avlNode.insert(7);
		 __CLR4_4_1cxcxll3w8lob.R.inc(506);avlNode.insert(1);
		 __CLR4_4_1cxcxll3w8lob.R.inc(507);avlNode.insert(8);
		 __CLR4_4_1cxcxll3w8lob.R.inc(508);avlNode.insert(0);
		 
		 
		 
		 __CLR4_4_1cxcxll3w8lob.R.inc(509);assertEquals(Integer.valueOf(0), avlNode.findMin(avlNode).getElement());
		
	 }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}
	
	 @Test(timeout=1000)
	    public void testInsertWord() {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1440o58e6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testInsertWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1440o58e6(){try{__CLR4_4_1cxcxll3w8lob.R.inc(510);
	        __CLR4_4_1cxcxll3w8lob.R.inc(511);Tree tree = new Tree();
	        __CLR4_4_1cxcxll3w8lob.R.inc(512);assertTrue(tree.insertWord("apple"));
	        __CLR4_4_1cxcxll3w8lob.R.inc(513);assertTrue(tree.insertWord("banana"));
	        __CLR4_4_1cxcxll3w8lob.R.inc(514);assertFalse(tree.insertWord("apple")); // \u95b2\u5d85\ue632\u93bb\u6391\u53c6\u9429\u7a3f\u6093\u9357\u66e1\u761d
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}


	    @Test(timeout=1000)
	    public void testInsertWordsFromFile() {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166oklxeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testInsertWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166oklxeb(){try{__CLR4_4_1cxcxll3w8lob.R.inc(515);
	        __CLR4_4_1cxcxll3w8lob.R.inc(516);File file = new File(testFilePath);
	        __CLR4_4_1cxcxll3w8lob.R.inc(517);Tree tree = new Tree();
	        __CLR4_4_1cxcxll3w8lob.R.inc(518);boolean[] inserted = tree.insertWords(file);

	        __CLR4_4_1cxcxll3w8lob.R.inc(519);assertNotNull(inserted);
	        __CLR4_4_1cxcxll3w8lob.R.inc(520);assertEquals(2, inserted.length);
	        __CLR4_4_1cxcxll3w8lob.R.inc(521);assertTrue(inserted[0]);
	        __CLR4_4_1cxcxll3w8lob.R.inc(522);assertTrue(inserted[1]);
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testDeleteWord() throws Exception {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn6viqej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testDeleteWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),523,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn6viqej() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(523);
	        __CLR4_4_1cxcxll3w8lob.R.inc(524);Tree tree = new Tree();
	        __CLR4_4_1cxcxll3w8lob.R.inc(525);tree.insertWord("apple");
	        __CLR4_4_1cxcxll3w8lob.R.inc(526);tree.insertWord("banana");

	        __CLR4_4_1cxcxll3w8lob.R.inc(527);assertTrue(tree.deleteWord("apple"));
	        __CLR4_4_1cxcxll3w8lob.R.inc(528);assertFalse(tree.deleteWord("orange")); // \u6d93\u5d85\u74e8\u9366\u3127\u6b91\u9357\u66e1\u761d
	        __CLR4_4_1cxcxll3w8lob.R.inc(529);assertTrue(tree.deleteWord("banana"));
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testDeleteWordsFromFile() throws Exception {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14akxtleq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testDeleteWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14akxtleq() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(530);
	        __CLR4_4_1cxcxll3w8lob.R.inc(531);File file = new File(testFilePath1);
	        __CLR4_4_1cxcxll3w8lob.R.inc(532);Tree tree = new Tree();
	        
	        __CLR4_4_1cxcxll3w8lob.R.inc(533);System.out.println(tree.insertWord("apple"));
	        __CLR4_4_1cxcxll3w8lob.R.inc(534);tree.insertWord("banana");
	        __CLR4_4_1cxcxll3w8lob.R.inc(535);boolean[] deleted = tree.deleteWords(file);

	        __CLR4_4_1cxcxll3w8lob.R.inc(536);assertNotNull(deleted);
	        __CLR4_4_1cxcxll3w8lob.R.inc(537);assertEquals(2, deleted.length);
	        __CLR4_4_1cxcxll3w8lob.R.inc(538);assertTrue(deleted[0]);
	        __CLR4_4_1cxcxll3w8lob.R.inc(539);assertTrue(deleted[1]);
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testSearchWord() throws Exception {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1asogbf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testSearchWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),540,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1asogbf0() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(540);
	        __CLR4_4_1cxcxll3w8lob.R.inc(541);Tree tree = new Tree();
	        __CLR4_4_1cxcxll3w8lob.R.inc(542);tree.insertWord("apple");
	        __CLR4_4_1cxcxll3w8lob.R.inc(543);tree.insertWord("banana");

	        __CLR4_4_1cxcxll3w8lob.R.inc(544);assertTrue(tree.searchWord("apple"));
	        __CLR4_4_1cxcxll3w8lob.R.inc(545);assertFalse(tree.searchWord("orange")); // \u6d93\u5d85\u74e8\u9366\u3127\u6b91\u9357\u66e1\u761d
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testSearchWordsFromFile() throws Exception {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxttz0f6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testSearchWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),546,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxttz0f6() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(546);
	        __CLR4_4_1cxcxll3w8lob.R.inc(547);File file = new File(testFilePath);
	        __CLR4_4_1cxcxll3w8lob.R.inc(548);Tree tree = new Tree();
	        __CLR4_4_1cxcxll3w8lob.R.inc(549);tree.insertWord("apple");
	        __CLR4_4_1cxcxll3w8lob.R.inc(550);tree.insertWord("banana");
	        __CLR4_4_1cxcxll3w8lob.R.inc(551);boolean[] found = tree.searchWords(file);

	        __CLR4_4_1cxcxll3w8lob.R.inc(552);assertNotNull(found);
	        __CLR4_4_1cxcxll3w8lob.R.inc(553);assertEquals(2, found.length);
	        __CLR4_4_1cxcxll3w8lob.R.inc(554);assertTrue(found[0]);
	        __CLR4_4_1cxcxll3w8lob.R.inc(555);assertTrue(found[1]);
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}
	    @Test(timeout=1000)
	    public void testException() {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12aalq4fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12aalq4fg(){try{__CLR4_4_1cxcxll3w8lob.R.inc(556);
	    	__CLR4_4_1cxcxll3w8lob.R.inc(557);Tree tree = new Tree();
	    	__CLR4_4_1cxcxll3w8lob.R.inc(558);try {
				__CLR4_4_1cxcxll3w8lob.R.inc(559);tree.searchWord("apple");
				__CLR4_4_1cxcxll3w8lob.R.inc(560);tree.deleteWord("apple");
			} catch (Exception e) {
				// TODO \u9477\ue044\u59e9\u9422\u71b8\u579a\u9428\ufffd catch \u9367\ufffd
				__CLR4_4_1cxcxll3w8lob.R.inc(561);e.printStackTrace();
			}
	    	__CLR4_4_1cxcxll3w8lob.R.inc(562);Tree tree2 = new Tree();
	    	__CLR4_4_1cxcxll3w8lob.R.inc(563);assertNull(tree2.insertWords(new File("test.txt")));
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testGetSize()  throws Exception{__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1424v1ofo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testGetSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),564,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1424v1ofo() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(564);
	        __CLR4_4_1cxcxll3w8lob.R.inc(565);Tree tree = new Tree();
	        __CLR4_4_1cxcxll3w8lob.R.inc(566);tree.insertWord("apple");
	        __CLR4_4_1cxcxll3w8lob.R.inc(567);tree.insertWord("banana");
	        __CLR4_4_1cxcxll3w8lob.R.inc(568);tree.insertWord("orange");
	        __CLR4_4_1cxcxll3w8lob.R.inc(569);tree.deleteWord("banana");

	        __CLR4_4_1cxcxll3w8lob.R.inc(570);assertEquals(2, tree.getSize());
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testGetHeightAndToString() {__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lb2addfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testGetHeightAndToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lb2addfv(){try{__CLR4_4_1cxcxll3w8lob.R.inc(571);
	        __CLR4_4_1cxcxll3w8lob.R.inc(572);Tree tree = new Tree();
	        
	        __CLR4_4_1cxcxll3w8lob.R.inc(573);assertEquals(0, tree.getHeight());
	        __CLR4_4_1cxcxll3w8lob.R.inc(574);tree.insertWord("apple");
	        __CLR4_4_1cxcxll3w8lob.R.inc(575);tree.insertWord("banana");
	        __CLR4_4_1cxcxll3w8lob.R.inc(576);tree.insertWord("orange");

	        __CLR4_4_1cxcxll3w8lob.R.inc(577);System.out.println(tree.toString());
	        __CLR4_4_1cxcxll3w8lob.R.inc(578);String expectedOutput =
	                "   bannana   \n" +
	                "  / \\  \n" +
	                " apple orange \n"+
	                "        \r\n"
	                ;
	        __CLR4_4_1cxcxll3w8lob.R.inc(579);assertEquals(2, tree.getHeight());
			__CLR4_4_1cxcxll3w8lob.R.inc(580);assertNotEquals(expectedOutput, tree);
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}
	    
		@Test(timeout=1000)
	    public void testPrintNode() throws Exception{__CLR4_4_1cxcxll3w8lob.R.globalSliceStart(getClass().getName(),581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p39xfgg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cxcxll3w8lob.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cxcxll3w8lob.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testPrintNode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p39xfgg5() throws Exception{try{__CLR4_4_1cxcxll3w8lob.R.inc(581);
	        __CLR4_4_1cxcxll3w8lob.R.inc(582);AVLNode<Integer> root = new AVLNode<>(4);
	        __CLR4_4_1cxcxll3w8lob.R.inc(583);root.insert(2);
	        __CLR4_4_1cxcxll3w8lob.R.inc(584);String s1 = 
	        		" 4   \r\n" + 
	        		"/   \r\n" + 
	        		"2   \n";
	        __CLR4_4_1cxcxll3w8lob.R.inc(585);assertNotEquals(s1,TreePrinter.printNode(root));
	        __CLR4_4_1cxcxll3w8lob.R.inc(586);root.insert(6);
	        __CLR4_4_1cxcxll3w8lob.R.inc(587);root.insert(1);
	        __CLR4_4_1cxcxll3w8lob.R.inc(588);root.insert(3);
	        __CLR4_4_1cxcxll3w8lob.R.inc(589);root.insert(5);
	        __CLR4_4_1cxcxll3w8lob.R.inc(590);root.insert(7);

	        __CLR4_4_1cxcxll3w8lob.R.inc(591);String expectedOutput =
	                "   4   \n" +
	                "  / \\  \n" +
	                " 2   6 \n" +
	                "/ \\ / \\ \n" +
	                "1 3 5 7 \n";

	        __CLR4_4_1cxcxll3w8lob.R.inc(592);String output = TreePrinter.printNode(root);
	        __CLR4_4_1cxcxll3w8lob.R.inc(593);assertNotEquals(expectedOutput, output);
	    }finally{__CLR4_4_1cxcxll3w8lob.R.flushNeeded();}}

	
	
}
