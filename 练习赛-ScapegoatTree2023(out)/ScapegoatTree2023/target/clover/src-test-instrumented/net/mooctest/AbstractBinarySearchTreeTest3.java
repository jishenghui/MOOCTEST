/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
//author:TheOnlyman
public class AbstractBinarySearchTreeTest3 {static class __CLR4_4_1bpbplnvslhet{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0039\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697635922772L,8589935092L,547,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	AbstractBinarySearchTree abt;
	AbstractBinarySearchTree.Node node;
	@Before
	public void setUp() {try{__CLR4_4_1bpbplnvslhet.R.inc(421);
		__CLR4_4_1bpbplnvslhet.R.inc(422);abt = new AbstractBinarySearchTree() {
			@Override
			protected Node createNode(int value, Node parent, Node left, Node right) {try{__CLR4_4_1bpbplnvslhet.R.inc(423);
				__CLR4_4_1bpbplnvslhet.R.inc(424);return new Node(value,parent,left,right);
			}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}
		};
		__CLR4_4_1bpbplnvslhet.R.inc(425);node = null;
	}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}

	@Test
	public void test0() {__CLR4_4_1bpbplnvslhet.R.globalSliceStart(getClass().getName(),426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1156cmdbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bpbplnvslhet.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bpbplnvslhet.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinarySearchTreeTest3.test0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1156cmdbu(){try{__CLR4_4_1bpbplnvslhet.R.inc(426);
		__CLR4_4_1bpbplnvslhet.R.inc(427);node = new AbstractBinarySearchTree.Node(null,null,null,null);
		__CLR4_4_1bpbplnvslhet.R.inc(428);node.hashCode();
		__CLR4_4_1bpbplnvslhet.R.inc(429);abt.insert(20);
		__CLR4_4_1bpbplnvslhet.R.inc(430);assertFalse(node.equals(abt.root));
		__CLR4_4_1bpbplnvslhet.R.inc(431);assertTrue(node.equals(node));
		__CLR4_4_1bpbplnvslhet.R.inc(432);assertTrue(node.equals(new AbstractBinarySearchTree.Node(null,abt.root,null,null)));

		__CLR4_4_1bpbplnvslhet.R.inc(433);abt.root = node;
		
		__CLR4_4_1bpbplnvslhet.R.inc(434);try {
			__CLR4_4_1bpbplnvslhet.R.inc(435);abt.insert(20);
		} catch (Exception e) {
		}

		__CLR4_4_1bpbplnvslhet.R.inc(436);abt.printTreeInOrder();
		__CLR4_4_1bpbplnvslhet.R.inc(437);abt.printTree();
		__CLR4_4_1bpbplnvslhet.R.inc(438);abt.printTreePostOrder();
		__CLR4_4_1bpbplnvslhet.R.inc(439);abt.printTreePreOrder();
	}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}
	
	@Test
	public void test1() {__CLR4_4_1bpbplnvslhet.R.globalSliceStart(getClass().getName(),440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beuc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bpbplnvslhet.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bpbplnvslhet.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinarySearchTreeTest3.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beuc8(){try{__CLR4_4_1bpbplnvslhet.R.inc(440);

		__CLR4_4_1bpbplnvslhet.R.inc(441);abt.insert(20);
		__CLR4_4_1bpbplnvslhet.R.inc(442);node = abt.search(20);
		__CLR4_4_1bpbplnvslhet.R.inc(443);assertEquals(new Integer(20),node.value);
		__CLR4_4_1bpbplnvslhet.R.inc(444);assertNull(node.parent);

		__CLR4_4_1bpbplnvslhet.R.inc(445);node = abt.insert(10);
		__CLR4_4_1bpbplnvslhet.R.inc(446);assertEquals(new Integer(20),node.parent.value);
		__CLR4_4_1bpbplnvslhet.R.inc(447);assertEquals(node, node.parent.left);

		__CLR4_4_1bpbplnvslhet.R.inc(448);node = abt.insert(30);
		__CLR4_4_1bpbplnvslhet.R.inc(449);assertEquals(new Integer(20),node.parent.value);
		__CLR4_4_1bpbplnvslhet.R.inc(450);assertEquals(node, node.parent.right);

		__CLR4_4_1bpbplnvslhet.R.inc(451);node = abt.search(20);
		__CLR4_4_1bpbplnvslhet.R.inc(452);assertNotNull(node);
		__CLR4_4_1bpbplnvslhet.R.inc(453);assertEquals(new Integer(20), node.value);

		__CLR4_4_1bpbplnvslhet.R.inc(454);node = abt.search(10);
		__CLR4_4_1bpbplnvslhet.R.inc(455);assertNotNull(node);
		__CLR4_4_1bpbplnvslhet.R.inc(456);assertEquals(new Integer(10), node.value);

		__CLR4_4_1bpbplnvslhet.R.inc(457);node = abt.search(11);
		__CLR4_4_1bpbplnvslhet.R.inc(458);assertNull(node);
	}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}

	@Test
	public void test2() {__CLR4_4_1bpbplnvslhet.R.globalSliceStart(getClass().getName(),459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bpbplnvslhet.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bpbplnvslhet.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinarySearchTreeTest3.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bcr(){try{__CLR4_4_1bpbplnvslhet.R.inc(459);

		__CLR4_4_1bpbplnvslhet.R.inc(460);abt.insert(20);
		__CLR4_4_1bpbplnvslhet.R.inc(461);node = abt.search(20);
		__CLR4_4_1bpbplnvslhet.R.inc(462);node = abt.insert(10);
		__CLR4_4_1bpbplnvslhet.R.inc(463);node = abt.insert(30);
		__CLR4_4_1bpbplnvslhet.R.inc(464);abt.getSuccessor(20);
		__CLR4_4_1bpbplnvslhet.R.inc(465);assertTrue(abt.contains(20));
		__CLR4_4_1bpbplnvslhet.R.inc(466);assertFalse(abt.contains(11));
		__CLR4_4_1bpbplnvslhet.R.inc(467);assertEquals(3,abt.getSize());
		__CLR4_4_1bpbplnvslhet.R.inc(468);try {
			__CLR4_4_1bpbplnvslhet.R.inc(469);abt.getSuccessor(30);
		} catch (Exception e) {
		}
		__CLR4_4_1bpbplnvslhet.R.inc(470);abt.printTree();
		__CLR4_4_1bpbplnvslhet.R.inc(471);assertTrue(node.equals(new AbstractBinarySearchTree.Node(30,abt.root,null,null)));
		__CLR4_4_1bpbplnvslhet.R.inc(472);assertFalse(abt.root.isLeaf());
		__CLR4_4_1bpbplnvslhet.R.inc(473);node.hashCode();
		__CLR4_4_1bpbplnvslhet.R.inc(474);assertFalse(node.equals(null));
		__CLR4_4_1bpbplnvslhet.R.inc(475);assertFalse(node.equals(abt.root));
		__CLR4_4_1bpbplnvslhet.R.inc(476);assertTrue(node.equals(node));
		__CLR4_4_1bpbplnvslhet.R.inc(477);assertFalse(node.equals(new AbstractBinarySearchTree.Node(null,null,null,null)));
		__CLR4_4_1bpbplnvslhet.R.inc(478);assertFalse(node.equals(abt));

		__CLR4_4_1bpbplnvslhet.R.inc(479);abt.delete(null);
		__CLR4_4_1bpbplnvslhet.R.inc(480);abt.delete(11);
		__CLR4_4_1bpbplnvslhet.R.inc(481);abt.delete(20);

	}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}

	@Test
	public void test3() {__CLR4_4_1bpbplnvslhet.R.globalSliceStart(getClass().getName(),482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bpbplnvslhet.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bpbplnvslhet.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinarySearchTreeTest3.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsde(){try{__CLR4_4_1bpbplnvslhet.R.inc(482);

		__CLR4_4_1bpbplnvslhet.R.inc(483);abt.insert(20);
		__CLR4_4_1bpbplnvslhet.R.inc(484);node = abt.search(20);
		__CLR4_4_1bpbplnvslhet.R.inc(485);node = abt.insert(10);
		__CLR4_4_1bpbplnvslhet.R.inc(486);abt.printTree();
		__CLR4_4_1bpbplnvslhet.R.inc(487);assertFalse(node.equals(new AbstractBinarySearchTree.Node(30,abt.root,null,null)));
		__CLR4_4_1bpbplnvslhet.R.inc(488);assertFalse(abt.root.isLeaf());
		__CLR4_4_1bpbplnvslhet.R.inc(489);node.hashCode();
		__CLR4_4_1bpbplnvslhet.R.inc(490);assertFalse(node.equals(null));
		__CLR4_4_1bpbplnvslhet.R.inc(491);assertFalse(node.equals(abt.root));
		__CLR4_4_1bpbplnvslhet.R.inc(492);assertTrue(node.equals(node));
		__CLR4_4_1bpbplnvslhet.R.inc(493);assertFalse(node.equals(new AbstractBinarySearchTree.Node(null,null,null,null)));
		__CLR4_4_1bpbplnvslhet.R.inc(494);assertFalse(node.equals(abt));

		__CLR4_4_1bpbplnvslhet.R.inc(495);abt.delete(null);
		__CLR4_4_1bpbplnvslhet.R.inc(496);abt.delete(11);
		__CLR4_4_1bpbplnvslhet.R.inc(497);abt.delete(20);

	}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}

	@Test
	public void test4() {__CLR4_4_1bpbplnvslhet.R.globalSliceStart(getClass().getName(),498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9du();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bpbplnvslhet.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bpbplnvslhet.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinarySearchTreeTest3.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),498,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9du(){try{__CLR4_4_1bpbplnvslhet.R.inc(498);

		__CLR4_4_1bpbplnvslhet.R.inc(499);abt.insert(20);
		__CLR4_4_1bpbplnvslhet.R.inc(500);node = abt.search(20);
		__CLR4_4_1bpbplnvslhet.R.inc(501);node = abt.insert(30);
		__CLR4_4_1bpbplnvslhet.R.inc(502);abt.insert(25);
		__CLR4_4_1bpbplnvslhet.R.inc(503);abt.printTree();
		__CLR4_4_1bpbplnvslhet.R.inc(504);assertTrue(node.equals(new AbstractBinarySearchTree.Node(30,abt.root,null,null)));
		__CLR4_4_1bpbplnvslhet.R.inc(505);assertFalse(abt.root.isLeaf());
		__CLR4_4_1bpbplnvslhet.R.inc(506);node.hashCode();
		__CLR4_4_1bpbplnvslhet.R.inc(507);assertFalse(node.equals(null));
		__CLR4_4_1bpbplnvslhet.R.inc(508);assertFalse(node.equals(abt.root));
		__CLR4_4_1bpbplnvslhet.R.inc(509);assertTrue(node.equals(node));
		__CLR4_4_1bpbplnvslhet.R.inc(510);assertFalse(node.equals(new AbstractBinarySearchTree.Node(null,null,null,null)));
		__CLR4_4_1bpbplnvslhet.R.inc(511);assertFalse(node.equals(abt));

		__CLR4_4_1bpbplnvslhet.R.inc(512);abt.delete(null);
		__CLR4_4_1bpbplnvslhet.R.inc(513);abt.delete(11);
		__CLR4_4_1bpbplnvslhet.R.inc(514);abt.delete(20);

	}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}

	@Test
	public void cornerTest() {__CLR4_4_1bpbplnvslhet.R.globalSliceStart(getClass().getName(),515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nesoiaeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bpbplnvslhet.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bpbplnvslhet.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinarySearchTreeTest3.cornerTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nesoiaeb(){try{__CLR4_4_1bpbplnvslhet.R.inc(515);

	}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}

	@Test
	public void randomTest() {__CLR4_4_1bpbplnvslhet.R.globalSliceStart(getClass().getName(),516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1occ718ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bpbplnvslhet.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bpbplnvslhet.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractBinarySearchTreeTest3.randomTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),516,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1occ718ec(){try{__CLR4_4_1bpbplnvslhet.R.inc(516);
		__CLR4_4_1bpbplnvslhet.R.inc(517);int n = 100;
		__CLR4_4_1bpbplnvslhet.R.inc(518);Random rnd = new Random(998244353);
		__CLR4_4_1bpbplnvslhet.R.inc(519);for(int i=1;(((i<=10)&&(__CLR4_4_1bpbplnvslhet.R.iget(520)!=0|true))||(__CLR4_4_1bpbplnvslhet.R.iget(521)==0&false));i++) {{
			__CLR4_4_1bpbplnvslhet.R.inc(522);Random random = new Random(rnd.nextInt(100));
			__CLR4_4_1bpbplnvslhet.R.inc(523);for (int j=1;(((j<=1000)&&(__CLR4_4_1bpbplnvslhet.R.iget(524)!=0|true))||(__CLR4_4_1bpbplnvslhet.R.iget(525)==0&false));j++) {{
				__CLR4_4_1bpbplnvslhet.R.inc(526);node = abt.insert(random.nextInt(n));
				__CLR4_4_1bpbplnvslhet.R.inc(527);assertTrue(node.isLeaf());
			}
			}__CLR4_4_1bpbplnvslhet.R.inc(528);abt.root.isLeaf();
			__CLR4_4_1bpbplnvslhet.R.inc(529);for (int j=1;(((j<=1000)&&(__CLR4_4_1bpbplnvslhet.R.iget(530)!=0|true))||(__CLR4_4_1bpbplnvslhet.R.iget(531)==0&false));j++) {{
				__CLR4_4_1bpbplnvslhet.R.inc(532);abt.search(random.nextInt(n));
				__CLR4_4_1bpbplnvslhet.R.inc(533);abt.delete(random.nextInt(n));
				__CLR4_4_1bpbplnvslhet.R.inc(534);abt.getMinimum();
				__CLR4_4_1bpbplnvslhet.R.inc(535);abt.getMaximum();
				__CLR4_4_1bpbplnvslhet.R.inc(536);try {
					__CLR4_4_1bpbplnvslhet.R.inc(537);abt.getSuccessor(abt.root);
				} catch (Exception e) {
				}
				__CLR4_4_1bpbplnvslhet.R.inc(538);if((((j%200==0)&&(__CLR4_4_1bpbplnvslhet.R.iget(539)!=0|true))||(__CLR4_4_1bpbplnvslhet.R.iget(540)==0&false))) {{
					__CLR4_4_1bpbplnvslhet.R.inc(541);abt.printTreeInOrder();
					__CLR4_4_1bpbplnvslhet.R.inc(542);abt.printTree();
					__CLR4_4_1bpbplnvslhet.R.inc(543);abt.printSubtree(abt.root);
					__CLR4_4_1bpbplnvslhet.R.inc(544);abt.printSubtree(abt.root);
					__CLR4_4_1bpbplnvslhet.R.inc(545);abt.printTreePostOrder();
					__CLR4_4_1bpbplnvslhet.R.inc(546);abt.printTreePostOrder();
				}
			}}
		}}
	}}finally{__CLR4_4_1bpbplnvslhet.R.flushNeeded();}}


}
