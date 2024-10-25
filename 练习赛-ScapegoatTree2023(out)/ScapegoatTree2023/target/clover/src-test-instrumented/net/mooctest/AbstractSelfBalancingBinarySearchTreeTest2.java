/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import javax.enterprise.inject.New;

import org.evosuite.shaded.antlr.CSharpCodeGenerator;
import org.junit.Test;

import net.mooctest.AbstractBinarySearchTree.Node;

public class AbstractSelfBalancingBinarySearchTreeTest2 {static class __CLR4_4_1klkllnvslhh0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0039\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697635922772L,8589935092L,935,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3kl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),741,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3kl(){try{__CLR4_4_1klkllnvslhh0.R.inc(741);
		__CLR4_4_1klkllnvslhh0.R.inc(742);ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(743);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.createNode((-3252),
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		__CLR4_4_1klkllnvslhh0.R.inc(744);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = new AbstractBinarySearchTree.Node(
				abstractBinarySearchTree_Node0.value, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0,
				abstractBinarySearchTree_Node0);
		__CLR4_4_1klkllnvslhh0.R.inc(745);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node1);
		__CLR4_4_1klkllnvslhh0.R.inc(746);scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node1);
		__CLR4_4_1klkllnvslhh0.R.inc(747);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node2);
		__CLR4_4_1klkllnvslhh0.R.inc(748);assertTrue(abstractBinarySearchTree_Node1.isLeaf());
		__CLR4_4_1klkllnvslhh0.R.inc(749);assertSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node3);
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	@Test
	public void test1() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beuku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),750,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beuku(){try{__CLR4_4_1klkllnvslhh0.R.inc(750);
		__CLR4_4_1klkllnvslhh0.R.inc(751);ScapegoatTree scapegoatTree = new ScapegoatTree(0);
//		scapegoatTree.printTree();
		__CLR4_4_1klkllnvslhh0.R.inc(752);AbstractBinarySearchTree.Node  node = scapegoatTree.insert(1);
		__CLR4_4_1klkllnvslhh0.R.inc(753);scapegoatTree.printTree();
		__CLR4_4_1klkllnvslhh0.R.inc(754);assertNotNull(scapegoatTree.insert(2));
		__CLR4_4_1klkllnvslhh0.R.inc(755);assertNotNull(scapegoatTree.insert(3));
		__CLR4_4_1klkllnvslhh0.R.inc(756);assertNotNull(scapegoatTree.insert(-1));
		__CLR4_4_1klkllnvslhh0.R.inc(757);assertNotNull(scapegoatTree.insert(2));
		__CLR4_4_1klkllnvslhh0.R.inc(758);assertNull(scapegoatTree.delete(-1));
		__CLR4_4_1klkllnvslhh0.R.inc(759);assertNotNull(scapegoatTree.insert(10));
		__CLR4_4_1klkllnvslhh0.R.inc(760);assertNotNull(scapegoatTree.search(10));
		__CLR4_4_1klkllnvslhh0.R.inc(761);assertNull(scapegoatTree.delete(100));
		__CLR4_4_1klkllnvslhh0.R.inc(762);scapegoatTree.printTree();
		__CLR4_4_1klkllnvslhh0.R.inc(763);System.out.println();
		__CLR4_4_1klkllnvslhh0.R.inc(764);scapegoatTree.printSubtree(node);
		__CLR4_4_1klkllnvslhh0.R.inc(765);System.out.println();
		__CLR4_4_1klkllnvslhh0.R.inc(766);scapegoatTree.printTreeInOrder();
		__CLR4_4_1klkllnvslhh0.R.inc(767);System.out.println();
		__CLR4_4_1klkllnvslhh0.R.inc(768);scapegoatTree.printTreePreOrder();
		__CLR4_4_1klkllnvslhh0.R.inc(769);System.out.println();
		__CLR4_4_1klkllnvslhh0.R.inc(770);scapegoatTree.printTreePostOrder();
//		assertTrue(false);
		
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test2() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7blf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),771,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7blf(){try{__CLR4_4_1klkllnvslhh0.R.inc(771);
		__CLR4_4_1klkllnvslhh0.R.inc(772);ScapegoatTree scapegoatTree = new ScapegoatTree(1);
		__CLR4_4_1klkllnvslhh0.R.inc(773);scapegoatTree.insert(2);
		__CLR4_4_1klkllnvslhh0.R.inc(774);scapegoatTree.insert(3);
		__CLR4_4_1klkllnvslhh0.R.inc(775);scapegoatTree.insert(4);
		__CLR4_4_1klkllnvslhh0.R.inc(776);System.out.println("test2");
		__CLR4_4_1klkllnvslhh0.R.inc(777);scapegoatTree.printTree();
		
		__CLR4_4_1klkllnvslhh0.R.inc(778);System.out.println(scapegoatTree.getSize());
		__CLR4_4_1klkllnvslhh0.R.inc(779);scapegoatTree.delete(4);
		
		__CLR4_4_1klkllnvslhh0.R.inc(780);System.out.println(scapegoatTree.getMaximum());
		
		__CLR4_4_1klkllnvslhh0.R.inc(781);ScapegoatTree scapegoatTree2 = new ScapegoatTree(1);
		__CLR4_4_1klkllnvslhh0.R.inc(782);scapegoatTree2.insert(4);
		__CLR4_4_1klkllnvslhh0.R.inc(783);scapegoatTree2.insert(5);
		__CLR4_4_1klkllnvslhh0.R.inc(784);scapegoatTree2.insert(3);
		__CLR4_4_1klkllnvslhh0.R.inc(785);scapegoatTree2.printTree();
		__CLR4_4_1klkllnvslhh0.R.inc(786);System.out.println(scapegoatTree2.getMinimum());
		__CLR4_4_1klkllnvslhh0.R.inc(787);assertEquals(3, scapegoatTree2.getMinimum());
		__CLR4_4_1klkllnvslhh0.R.inc(788);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(789);AbstractBinarySearchTree.Node node1 = null;
		__CLR4_4_1klkllnvslhh0.R.inc(790);AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(1, node, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(791);scapegoatTree2.findScapegoatNode(node);
		__CLR4_4_1klkllnvslhh0.R.inc(792);scapegoatTree2.findScapegoatNode(node2);
		__CLR4_4_1klkllnvslhh0.R.inc(793);scapegoatTree2.getNodeHeight(node);
		__CLR4_4_1klkllnvslhh0.R.inc(794);scapegoatTree2.getNodeHeight(node1);
		__CLR4_4_1klkllnvslhh0.R.inc(795);scapegoatTree.delete(node1);
		__CLR4_4_1klkllnvslhh0.R.inc(796);AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(797);scapegoatTree.delete(node3);
		__CLR4_4_1klkllnvslhh0.R.inc(798);AbstractBinarySearchTree.Node node4 = new AbstractBinarySearchTree.Node(1, null, null, node2);
		__CLR4_4_1klkllnvslhh0.R.inc(799);scapegoatTree.delete(node4);
		__CLR4_4_1klkllnvslhh0.R.inc(800);AbstractBinarySearchTree.Node node5 = new AbstractBinarySearchTree.Node(1, null, node2, null);
		__CLR4_4_1klkllnvslhh0.R.inc(801);scapegoatTree.delete(node5);
		__CLR4_4_1klkllnvslhh0.R.inc(802);AbstractBinarySearchTree.Node node6 = new AbstractBinarySearchTree.Node(1, null, node2, node2);
		__CLR4_4_1klkllnvslhh0.R.inc(803);scapegoatTree.delete(node6);
		__CLR4_4_1klkllnvslhh0.R.inc(804);AbstractBinarySearchTree.Node node7 = new AbstractBinarySearchTree.Node(1, null, null, null);
		

	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test4() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9md();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9md(){try{__CLR4_4_1klkllnvslhh0.R.inc(805);
		__CLR4_4_1klkllnvslhh0.R.inc(806);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(807);AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(808);AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(809);AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(810);node.right = node1;
		__CLR4_4_1klkllnvslhh0.R.inc(811);node.left = node3;
		__CLR4_4_1klkllnvslhh0.R.inc(812);node1.left = node2;
		__CLR4_4_1klkllnvslhh0.R.inc(813);node2.left = node;
		__CLR4_4_1klkllnvslhh0.R.inc(814);node.parent = node2;
		__CLR4_4_1klkllnvslhh0.R.inc(815);AbstractBinarySearchTree.Node node4 = null;
		__CLR4_4_1klkllnvslhh0.R.inc(816);AbstractBinarySearchTree.Node node5 = new AbstractBinarySearchTree.Node(null, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(817);AbstractBinarySearchTree.Node node6 = new AbstractBinarySearchTree.Node(null, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(818);AbstractBinarySearchTree.Node node7 = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(819);assertTrue(node.equals(node));
		__CLR4_4_1klkllnvslhh0.R.inc(820);assertFalse(node.equals(node4));
		__CLR4_4_1klkllnvslhh0.R.inc(821);assertFalse(node.equals(new String("1")));
		__CLR4_4_1klkllnvslhh0.R.inc(822);assertFalse(node.equals(node1));
		__CLR4_4_1klkllnvslhh0.R.inc(823);assertTrue(node5.equals(node6));
		__CLR4_4_1klkllnvslhh0.R.inc(824);assertFalse(node5.equals(node1));
		__CLR4_4_1klkllnvslhh0.R.inc(825);assertTrue(node.equals(node7));
		__CLR4_4_1klkllnvslhh0.R.inc(826);assertEquals(32, node.hashCode());
		__CLR4_4_1klkllnvslhh0.R.inc(827);assertEquals(31, node5.hashCode());
		__CLR4_4_1klkllnvslhh0.R.inc(828);ScapegoatTree scapegoatTree = new ScapegoatTree(0);
		__CLR4_4_1klkllnvslhh0.R.inc(829);scapegoatTree.delete(node);
		__CLR4_4_1klkllnvslhh0.R.inc(830);scapegoatTree.printSubtree(node5);
		__CLR4_4_1klkllnvslhh0.R.inc(831);scapegoatTree.insert(1);
		__CLR4_4_1klkllnvslhh0.R.inc(832);scapegoatTree.insert(3);
		__CLR4_4_1klkllnvslhh0.R.inc(833);scapegoatTree.insert(-3);
		__CLR4_4_1klkllnvslhh0.R.inc(834);scapegoatTree.insert(4);
		__CLR4_4_1klkllnvslhh0.R.inc(835);assertTrue(scapegoatTree.contains(1));
		__CLR4_4_1klkllnvslhh0.R.inc(836);assertFalse(scapegoatTree.contains(2));
		__CLR4_4_1klkllnvslhh0.R.inc(837);assertEquals(3, scapegoatTree.getSuccessor(1));
		__CLR4_4_1klkllnvslhh0.R.inc(838);scapegoatTree.printTree();
		__CLR4_4_1klkllnvslhh0.R.inc(839);assertEquals(4, scapegoatTree.getSuccessor(3));
		__CLR4_4_1klkllnvslhh0.R.inc(840);scapegoatTree.insert(5);
		__CLR4_4_1klkllnvslhh0.R.inc(841);scapegoatTree.insert(6);
		__CLR4_4_1klkllnvslhh0.R.inc(842);scapegoatTree.insert(-1);
		__CLR4_4_1klkllnvslhh0.R.inc(843);scapegoatTree.insert(0);
		__CLR4_4_1klkllnvslhh0.R.inc(844);scapegoatTree.insert(-2);
		__CLR4_4_1klkllnvslhh0.R.inc(845);scapegoatTree.printTree();
		__CLR4_4_1klkllnvslhh0.R.inc(846);assertEquals(1, scapegoatTree.getSuccessor(0));
		__CLR4_4_1klkllnvslhh0.R.inc(847);try {
			__CLR4_4_1klkllnvslhh0.R.inc(848);scapegoatTree.getSuccessor(6);
		} catch (NullPointerException e) {
			__CLR4_4_1klkllnvslhh0.R.inc(849);System.out.println("\u7ecc\u70d8\u5bda\u95bd\u581d\u7d13\u752f\ufffd");
		}

		
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test5() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqnm(){try{__CLR4_4_1klkllnvslhh0.R.inc(850);
		__CLR4_4_1klkllnvslhh0.R.inc(851);ScapegoatTree s = new ScapegoatTree(2);
		__CLR4_4_1klkllnvslhh0.R.inc(852);s.insert(1);
		__CLR4_4_1klkllnvslhh0.R.inc(853);s.insert(2);
		__CLR4_4_1klkllnvslhh0.R.inc(854);s.insert(3);
		__CLR4_4_1klkllnvslhh0.R.inc(855);s.printTree();
		__CLR4_4_1klkllnvslhh0.R.inc(856);s.delete(3);

	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test6() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d7nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),857,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d7nt(){try{__CLR4_4_1klkllnvslhh0.R.inc(857);
		__CLR4_4_1klkllnvslhh0.R.inc(858);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(859);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(860);AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(861);AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, node1, null);
		__CLR4_4_1klkllnvslhh0.R.inc(862);AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, node1, node2);
		__CLR4_4_1klkllnvslhh0.R.inc(863);node.right = node1;
		
		__CLR4_4_1klkllnvslhh0.R.inc(864);scapegoatTree.rotateLeft(node);
//		scapegoatTree.rotateLeft(node2);
		__CLR4_4_1klkllnvslhh0.R.inc(865);scapegoatTree.rotateLeft(node3);
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test7() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw645oo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw645oo2(){try{__CLR4_4_1klkllnvslhh0.R.inc(866);
		
		__CLR4_4_1klkllnvslhh0.R.inc(867);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(868);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(869);AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(870);AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(871);AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, null, null);
		
		__CLR4_4_1klkllnvslhh0.R.inc(872);node1.parent = node;
		__CLR4_4_1klkllnvslhh0.R.inc(873);node.right = node1;
		__CLR4_4_1klkllnvslhh0.R.inc(874);node2.parent = node1;
		__CLR4_4_1klkllnvslhh0.R.inc(875);node1.left = node2;
		__CLR4_4_1klkllnvslhh0.R.inc(876);node3.parent = node1;
		__CLR4_4_1klkllnvslhh0.R.inc(877);node1.right = node3;
		__CLR4_4_1klkllnvslhh0.R.inc(878);scapegoatTree.rotateLeft(node1);
				
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test8() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r562y5of();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r562y5of(){try{__CLR4_4_1klkllnvslhh0.R.inc(879);
		__CLR4_4_1klkllnvslhh0.R.inc(880);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(881);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(882);AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(1, null, null, null);
//		AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(883);node1.parent = node;
		__CLR4_4_1klkllnvslhh0.R.inc(884);node.left = node1;
		__CLR4_4_1klkllnvslhh0.R.inc(885);scapegoatTree.rotateRight(node);
		
		
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test9() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue61qmom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),886,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue61qmom(){try{__CLR4_4_1klkllnvslhh0.R.inc(886);
		
		__CLR4_4_1klkllnvslhh0.R.inc(887);assertEquals(0, MathUtils.getDigitFromNumber(1, 2));
		__CLR4_4_1klkllnvslhh0.R.inc(888);assertEquals(2, MathUtils.getMax(1, 2));
		__CLR4_4_1klkllnvslhh0.R.inc(889);assertEquals(2, MathUtils.getMax(2, 1));
		__CLR4_4_1klkllnvslhh0.R.inc(890);MathUtils mathUtils = new MathUtils();
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test10() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwor(){try{__CLR4_4_1klkllnvslhh0.R.inc(891);
		__CLR4_4_1klkllnvslhh0.R.inc(892);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(893);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(894);scapegoatTree.root = node;
		
//		System.out.println(scapegoatTree.root.value);
		__CLR4_4_1klkllnvslhh0.R.inc(895);scapegoatTree.search(1);
		__CLR4_4_1klkllnvslhh0.R.inc(896);try {
			__CLR4_4_1klkllnvslhh0.R.inc(897);scapegoatTree.insert(2);
		} catch (Exception e) {
			// TODO: handle exception
			__CLR4_4_1klkllnvslhh0.R.inc(898);System.out.println("\u7ecc\u70d8\u5bda\u95bd\u581d\u7d13\u752f\ufffd");
		}
		
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	@Test
	public void test11() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonzndoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),899,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonzndoz(){try{__CLR4_4_1klkllnvslhh0.R.inc(899);
		__CLR4_4_1klkllnvslhh0.R.inc(900);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(901);AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(902);AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(903);AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(904);node2.parent = node;
		__CLR4_4_1klkllnvslhh0.R.inc(905);node1.left = node2;
		__CLR4_4_1klkllnvslhh0.R.inc(906);node.right = node1;
		__CLR4_4_1klkllnvslhh0.R.inc(907);node.left = node3;
		__CLR4_4_1klkllnvslhh0.R.inc(908);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(909);assertNotNull(scapegoatTree.delete(node));__CLR4_4_1klkllnvslhh0.R.inc(910);;
		
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test12() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3japb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),911,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3japb(){try{__CLR4_4_1klkllnvslhh0.R.inc(911);
		__CLR4_4_1klkllnvslhh0.R.inc(912);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(913);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(914);scapegoatTree.root = node;
		
		__CLR4_4_1klkllnvslhh0.R.inc(915);scapegoatTree.printTreeInOrder();

		__CLR4_4_1klkllnvslhh0.R.inc(916);ScapegoatTree scapegoatTree1 = new ScapegoatTree();
		
		__CLR4_4_1klkllnvslhh0.R.inc(917);scapegoatTree1.printTreePreOrder();
		__CLR4_4_1klkllnvslhh0.R.inc(918);scapegoatTree1.root = node;
		__CLR4_4_1klkllnvslhh0.R.inc(919);scapegoatTree1.printTreePreOrder();
		
		__CLR4_4_1klkllnvslhh0.R.inc(920);ScapegoatTree scapegoatTree2 = new ScapegoatTree();
//		scapegoatTree1.root = node;
		
		__CLR4_4_1klkllnvslhh0.R.inc(921);scapegoatTree2.printTreePostOrder();
		__CLR4_4_1klkllnvslhh0.R.inc(922);scapegoatTree2.root = node;
		__CLR4_4_1klkllnvslhh0.R.inc(923);scapegoatTree2.printTreePostOrder();
		
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
	@Test
	public void test13() throws Exception {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qtpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qtpo() throws Exception{try{__CLR4_4_1klkllnvslhh0.R.inc(924);
		__CLR4_4_1klkllnvslhh0.R.inc(925);Class<ScapegoatTree> class1 = ScapegoatTree.class;
		__CLR4_4_1klkllnvslhh0.R.inc(926);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(927);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		__CLR4_4_1klkllnvslhh0.R.inc(928);Method method = class1.getDeclaredMethod("getSibling",AbstractBinarySearchTree.Node.class);
		__CLR4_4_1klkllnvslhh0.R.inc(929);method.setAccessible(true);
		__CLR4_4_1klkllnvslhh0.R.inc(930);assertNull(method.invoke(scapegoatTree, node));
		
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}

	@Test
	public synchronized void test14() {__CLR4_4_1klkllnvslhh0.R.globalSliceStart(getClass().getName(),931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5ycpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1klkllnvslhh0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1klkllnvslhh0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest2.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),931,$CLV_p$,$CLV_t$);}}private synchronized void  __CLR4_4_1rlg5ycpv(){try{__CLR4_4_1klkllnvslhh0.R.inc(931);
		__CLR4_4_1klkllnvslhh0.R.inc(932);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1klkllnvslhh0.R.inc(933);AbstractBinarySearchTree.Node node = null;
		__CLR4_4_1klkllnvslhh0.R.inc(934);scapegoatTree.delete(node);
	}finally{__CLR4_4_1klkllnvslhh0.R.flushNeeded();}}
	
}
