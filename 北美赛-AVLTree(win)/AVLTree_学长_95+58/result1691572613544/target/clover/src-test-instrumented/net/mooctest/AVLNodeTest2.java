/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AVLNodeTest2 {static class __CLR4_4_1cbcbll3inmqw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0030\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0041\u0056\u004c\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691572609207L,8589935092L,572,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private final String testFilePath = "src/test/java/net/mooctest/test.txt";
	private final String testFilePath1 = "src/test/java/net/mooctest/test1.txt";
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test(timeout=1000)
	public void testInster() throws Exception{__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bphk5ocb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testInster",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bphk5ocb() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(443);
		__CLR4_4_1cbcbll3inmqw.R.inc(444);AVLNode<Integer> avlNode = new AVLNode<Integer>(2);
		__CLR4_4_1cbcbll3inmqw.R.inc(445);AVLNode<Integer> avlNode1 = new AVLNode<Integer>(2);
		__CLR4_4_1cbcbll3inmqw.R.inc(446);assertFalse(avlNode.search(0));
		
		__CLR4_4_1cbcbll3inmqw.R.inc(447);avlNode.insert(10);
		__CLR4_4_1cbcbll3inmqw.R.inc(448);avlNode.insert(6);
		__CLR4_4_1cbcbll3inmqw.R.inc(449);avlNode.insert(-1);
		__CLR4_4_1cbcbll3inmqw.R.inc(450);avlNode.insert(-10);
		
		__CLR4_4_1cbcbll3inmqw.R.inc(451);avlNode1.insert(3);
		__CLR4_4_1cbcbll3inmqw.R.inc(452);avlNode1.insert(1);
		__CLR4_4_1cbcbll3inmqw.R.inc(453);avlNode1.insert(0);
		__CLR4_4_1cbcbll3inmqw.R.inc(454);avlNode1.insert(-1);
		
		__CLR4_4_1cbcbll3inmqw.R.inc(455);assertTrue(avlNode1.search(2));
		__CLR4_4_1cbcbll3inmqw.R.inc(456);assertTrue(avlNode1.search(3));
		
		__CLR4_4_1cbcbll3inmqw.R.inc(457);assertTrue(avlNode1.search(1));
		__CLR4_4_1cbcbll3inmqw.R.inc(458);assertTrue(avlNode1.search(0));
		__CLR4_4_1cbcbll3inmqw.R.inc(459);assertTrue(avlNode1.search(-1));
		
		__CLR4_4_1cbcbll3inmqw.R.inc(460);assertTrue(avlNode.search(2));
		__CLR4_4_1cbcbll3inmqw.R.inc(461);assertTrue(avlNode.search(-1));
		__CLR4_4_1cbcbll3inmqw.R.inc(462);assertTrue(avlNode.search(10));
		__CLR4_4_1cbcbll3inmqw.R.inc(463);assertTrue(avlNode.search(-10));
		__CLR4_4_1cbcbll3inmqw.R.inc(464);assertTrue(avlNode.search(6));
		__CLR4_4_1cbcbll3inmqw.R.inc(465);assertFalse(avlNode.search(100));
		
	}finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	@Test(timeout=1000)
	public void testDelete() throws Exception{__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1yilj0ccy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testDelete",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),466,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1yilj0ccy() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(466);
		__CLR4_4_1cbcbll3inmqw.R.inc(467);AVLNode<Integer> avlNode = new AVLNode<Integer>(2);
		
		
		__CLR4_4_1cbcbll3inmqw.R.inc(468);avlNode.insert(5);
		__CLR4_4_1cbcbll3inmqw.R.inc(469);avlNode.insert(4);
		__CLR4_4_1cbcbll3inmqw.R.inc(470);avlNode.insert(3);
		__CLR4_4_1cbcbll3inmqw.R.inc(471);avlNode.insert(-10);


		__CLR4_4_1cbcbll3inmqw.R.inc(472);avlNode.delete(-10);
		__CLR4_4_1cbcbll3inmqw.R.inc(473);assertTrue(avlNode.search(2));

		__CLR4_4_1cbcbll3inmqw.R.inc(474);assertFalse(avlNode.search(-10));

		__CLR4_4_1cbcbll3inmqw.R.inc(475);assertFalse(avlNode.search(5));
		__CLR4_4_1cbcbll3inmqw.R.inc(476);assertFalse(avlNode.search(4));
		__CLR4_4_1cbcbll3inmqw.R.inc(477);assertTrue(avlNode.search(3));

	}finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}
	 @Test(timeout=1000)
	 public void testFindMin() throws Exception {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_198ntxqda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testFindMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),478,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_198ntxqda() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(478);
		 __CLR4_4_1cbcbll3inmqw.R.inc(479);AVLNode<Integer> avlNode = new AVLNode<Integer>(5);
		 
		 __CLR4_4_1cbcbll3inmqw.R.inc(480);avlNode.insert(4);
		 __CLR4_4_1cbcbll3inmqw.R.inc(481);avlNode.insert(6);
		 __CLR4_4_1cbcbll3inmqw.R.inc(482);avlNode.insert(3);
		 __CLR4_4_1cbcbll3inmqw.R.inc(483);avlNode.insert(7);
		 __CLR4_4_1cbcbll3inmqw.R.inc(484);avlNode.insert(1);
		 __CLR4_4_1cbcbll3inmqw.R.inc(485);avlNode.insert(8);
		 __CLR4_4_1cbcbll3inmqw.R.inc(486);avlNode.insert(0);
		 
		 
		 
		 __CLR4_4_1cbcbll3inmqw.R.inc(487);assertEquals(Integer.valueOf(0), avlNode.findMin(avlNode).getElement());
		
	 }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}
	
	 @Test(timeout=1000)
	    public void testInsertWord() {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1440o58dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testInsertWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1440o58dk(){try{__CLR4_4_1cbcbll3inmqw.R.inc(488);
	        __CLR4_4_1cbcbll3inmqw.R.inc(489);Tree tree = new Tree();
	        __CLR4_4_1cbcbll3inmqw.R.inc(490);assertTrue(tree.insertWord("apple"));
	        __CLR4_4_1cbcbll3inmqw.R.inc(491);assertTrue(tree.insertWord("banana"));
	        __CLR4_4_1cbcbll3inmqw.R.inc(492);assertFalse(tree.insertWord("apple")); // \u95b2\u5d85\ue632\u93bb\u6391\u53c6\u9429\u7a3f\u6093\u9357\u66e1\u761d
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}


	    @Test(timeout=1000)
	    public void testInsertWordsFromFile() {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_166oklxdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testInsertWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_166oklxdp(){try{__CLR4_4_1cbcbll3inmqw.R.inc(493);
	        __CLR4_4_1cbcbll3inmqw.R.inc(494);File file = new File(testFilePath);
	        __CLR4_4_1cbcbll3inmqw.R.inc(495);Tree tree = new Tree();
	        __CLR4_4_1cbcbll3inmqw.R.inc(496);boolean[] inserted = tree.insertWords(file);

	        __CLR4_4_1cbcbll3inmqw.R.inc(497);assertNotNull(inserted);
	        __CLR4_4_1cbcbll3inmqw.R.inc(498);assertEquals(2, inserted.length);
	        __CLR4_4_1cbcbll3inmqw.R.inc(499);assertTrue(inserted[0]);
	        __CLR4_4_1cbcbll3inmqw.R.inc(500);assertTrue(inserted[1]);
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testDeleteWord() throws Exception {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jn6viqdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testDeleteWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),501,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jn6viqdx() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(501);
	        __CLR4_4_1cbcbll3inmqw.R.inc(502);Tree tree = new Tree();
	        __CLR4_4_1cbcbll3inmqw.R.inc(503);tree.insertWord("apple");
	        __CLR4_4_1cbcbll3inmqw.R.inc(504);tree.insertWord("banana");

	        __CLR4_4_1cbcbll3inmqw.R.inc(505);assertTrue(tree.deleteWord("apple"));
	        __CLR4_4_1cbcbll3inmqw.R.inc(506);assertFalse(tree.deleteWord("orange")); // \u6d93\u5d85\u74e8\u9366\u3127\u6b91\u9357\u66e1\u761d
	        __CLR4_4_1cbcbll3inmqw.R.inc(507);assertTrue(tree.deleteWord("banana"));
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testDeleteWordsFromFile() throws Exception {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14akxtle4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testDeleteWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),508,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14akxtle4() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(508);
	        __CLR4_4_1cbcbll3inmqw.R.inc(509);File file = new File(testFilePath1);
	        __CLR4_4_1cbcbll3inmqw.R.inc(510);Tree tree = new Tree();
	        
	        __CLR4_4_1cbcbll3inmqw.R.inc(511);System.out.println(tree.insertWord("apple"));
	        __CLR4_4_1cbcbll3inmqw.R.inc(512);tree.insertWord("banana");
	        __CLR4_4_1cbcbll3inmqw.R.inc(513);boolean[] deleted = tree.deleteWords(file);

	        __CLR4_4_1cbcbll3inmqw.R.inc(514);assertNotNull(deleted);
	        __CLR4_4_1cbcbll3inmqw.R.inc(515);assertEquals(2, deleted.length);
	        __CLR4_4_1cbcbll3inmqw.R.inc(516);assertTrue(deleted[0]);
	        __CLR4_4_1cbcbll3inmqw.R.inc(517);assertTrue(deleted[1]);
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testSearchWord() throws Exception {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1asogbee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testSearchWord",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1asogbee() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(518);
	        __CLR4_4_1cbcbll3inmqw.R.inc(519);Tree tree = new Tree();
	        __CLR4_4_1cbcbll3inmqw.R.inc(520);tree.insertWord("apple");
	        __CLR4_4_1cbcbll3inmqw.R.inc(521);tree.insertWord("banana");

	        __CLR4_4_1cbcbll3inmqw.R.inc(522);assertTrue(tree.searchWord("apple"));
	        __CLR4_4_1cbcbll3inmqw.R.inc(523);assertFalse(tree.searchWord("orange")); // \u6d93\u5d85\u74e8\u9366\u3127\u6b91\u9357\u66e1\u761d
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testSearchWordsFromFile() throws Exception {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cxttz0ek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testSearchWordsFromFile",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cxttz0ek() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(524);
	        __CLR4_4_1cbcbll3inmqw.R.inc(525);File file = new File(testFilePath);
	        __CLR4_4_1cbcbll3inmqw.R.inc(526);Tree tree = new Tree();
	        __CLR4_4_1cbcbll3inmqw.R.inc(527);tree.insertWord("apple");
	        __CLR4_4_1cbcbll3inmqw.R.inc(528);tree.insertWord("banana");
	        __CLR4_4_1cbcbll3inmqw.R.inc(529);boolean[] found = tree.searchWords(file);

	        __CLR4_4_1cbcbll3inmqw.R.inc(530);assertNotNull(found);
	        __CLR4_4_1cbcbll3inmqw.R.inc(531);assertEquals(2, found.length);
	        __CLR4_4_1cbcbll3inmqw.R.inc(532);assertTrue(found[0]);
	        __CLR4_4_1cbcbll3inmqw.R.inc(533);assertTrue(found[1]);
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}
	    @Test(timeout=1000)
	    public void testException() {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12aalq4eu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),534,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12aalq4eu(){try{__CLR4_4_1cbcbll3inmqw.R.inc(534);
	    	__CLR4_4_1cbcbll3inmqw.R.inc(535);Tree tree = new Tree();
	    	__CLR4_4_1cbcbll3inmqw.R.inc(536);try {
				__CLR4_4_1cbcbll3inmqw.R.inc(537);tree.searchWord("apple");
				__CLR4_4_1cbcbll3inmqw.R.inc(538);tree.deleteWord("apple");
			} catch (Exception e) {
				// TODO \u9477\ue044\u59e9\u9422\u71b8\u579a\u9428\ufffd catch \u9367\ufffd
				__CLR4_4_1cbcbll3inmqw.R.inc(539);e.printStackTrace();
			}
	    	__CLR4_4_1cbcbll3inmqw.R.inc(540);Tree tree2 = new Tree();
	    	__CLR4_4_1cbcbll3inmqw.R.inc(541);assertNull(tree2.insertWords(new File("test.txt")));
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testGetSize()  throws Exception{__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1424v1of2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testGetSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1424v1of2() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(542);
	        __CLR4_4_1cbcbll3inmqw.R.inc(543);Tree tree = new Tree();
	        __CLR4_4_1cbcbll3inmqw.R.inc(544);tree.insertWord("apple");
	        __CLR4_4_1cbcbll3inmqw.R.inc(545);tree.insertWord("banana");
	        __CLR4_4_1cbcbll3inmqw.R.inc(546);tree.insertWord("orange");
	        __CLR4_4_1cbcbll3inmqw.R.inc(547);tree.deleteWord("banana");

	        __CLR4_4_1cbcbll3inmqw.R.inc(548);assertEquals(2, tree.getSize());
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	    @Test(timeout=1000)
	    public void testGetHeightAndToString() {__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lb2addf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testGetHeightAndToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lb2addf9(){try{__CLR4_4_1cbcbll3inmqw.R.inc(549);
	        __CLR4_4_1cbcbll3inmqw.R.inc(550);Tree tree = new Tree();
	        
	        __CLR4_4_1cbcbll3inmqw.R.inc(551);assertEquals(0, tree.getHeight());
	        __CLR4_4_1cbcbll3inmqw.R.inc(552);tree.insertWord("apple");
	        __CLR4_4_1cbcbll3inmqw.R.inc(553);tree.insertWord("banana");
	        __CLR4_4_1cbcbll3inmqw.R.inc(554);tree.insertWord("orange");

	        __CLR4_4_1cbcbll3inmqw.R.inc(555);System.out.println(tree.toString());
	        __CLR4_4_1cbcbll3inmqw.R.inc(556);String expectedOutput =
	                "   bannana   \n" +
	                "  / \\  \n" +
	                " apple orange \n"+
	                "        \r\n"
	                ;
	        __CLR4_4_1cbcbll3inmqw.R.inc(557);assertEquals(2, tree.getHeight());
			__CLR4_4_1cbcbll3inmqw.R.inc(558);assertNotEquals(expectedOutput, tree);
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}
	    
		@Test(timeout=1000)
	    public void testPrintNode() throws Exception{__CLR4_4_1cbcbll3inmqw.R.globalSliceStart(getClass().getName(),559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1p39xfgfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cbcbll3inmqw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cbcbll3inmqw.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest2.testPrintNode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1p39xfgfj() throws Exception{try{__CLR4_4_1cbcbll3inmqw.R.inc(559);
	        __CLR4_4_1cbcbll3inmqw.R.inc(560);AVLNode<Integer> root = new AVLNode<>(4);
	        __CLR4_4_1cbcbll3inmqw.R.inc(561);root.insert(2);
	        __CLR4_4_1cbcbll3inmqw.R.inc(562);String s1 = 
	        		" 4   \r\n" + 
	        		"/   \r\n" + 
	        		"2   \n";
	        __CLR4_4_1cbcbll3inmqw.R.inc(563);assertNotEquals(s1,TreePrinter.printNode(root));
	        __CLR4_4_1cbcbll3inmqw.R.inc(564);root.insert(6);
	        __CLR4_4_1cbcbll3inmqw.R.inc(565);root.insert(1);
	        __CLR4_4_1cbcbll3inmqw.R.inc(566);root.insert(3);
	        __CLR4_4_1cbcbll3inmqw.R.inc(567);root.insert(5);
	        __CLR4_4_1cbcbll3inmqw.R.inc(568);root.insert(7);

	        __CLR4_4_1cbcbll3inmqw.R.inc(569);String expectedOutput =
	                "   4   \n" +
	                "  / \\  \n" +
	                " 2   6 \n" +
	                "/ \\ / \\ \n" +
	                "1 3 5 7 \n";

	        __CLR4_4_1cbcbll3inmqw.R.inc(570);String output = TreePrinter.printNode(root);
	        __CLR4_4_1cbcbll3inmqw.R.inc(571);assertNotEquals(expectedOutput, output);
	    }finally{__CLR4_4_1cbcbll3inmqw.R.flushNeeded();}}

	
	
}
