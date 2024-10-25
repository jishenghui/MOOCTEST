/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AbstractSelfBalancingBinarySearchTreeTest4 {static class __CLR4_4_1ththlnvslhii{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0039\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697635922772L,8589935092L,1179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {__CLR4_4_1ththlnvslhii.R.globalSliceStart(getClass().getName(),1061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3th();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ththlnvslhii.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ththlnvslhii.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest4.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3th() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{try{__CLR4_4_1ththlnvslhii.R.inc(1061);
		__CLR4_4_1ththlnvslhii.R.inc(1062);ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		__CLR4_4_1ththlnvslhii.R.inc(1063);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.createNode((-3252),
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		__CLR4_4_1ththlnvslhii.R.inc(1064);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = new AbstractBinarySearchTree.Node(
				abstractBinarySearchTree_Node0.value, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0,
				abstractBinarySearchTree_Node0);
		__CLR4_4_1ththlnvslhii.R.inc(1065);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node1);
		__CLR4_4_1ththlnvslhii.R.inc(1066);scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node1);
		__CLR4_4_1ththlnvslhii.R.inc(1067);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node2);
		__CLR4_4_1ththlnvslhii.R.inc(1068);assertTrue(abstractBinarySearchTree_Node1.isLeaf());
		__CLR4_4_1ththlnvslhii.R.inc(1069);assertSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node3);

		__CLR4_4_1ththlnvslhii.R.inc(1070);ScapegoatTree st1 = new ScapegoatTree(100);
		__CLR4_4_1ththlnvslhii.R.inc(1071);ScapegoatTree st2 = new ScapegoatTree();

		__CLR4_4_1ththlnvslhii.R.inc(1072);st1.insert(1);
		__CLR4_4_1ththlnvslhii.R.inc(1073);st1.insert(2);
		__CLR4_4_1ththlnvslhii.R.inc(1074);st1.insert(3);
		__CLR4_4_1ththlnvslhii.R.inc(1075);st1.insert(5);
		__CLR4_4_1ththlnvslhii.R.inc(1076);st1.insert(7);
		__CLR4_4_1ththlnvslhii.R.inc(1077);st1.insert(-23);
		__CLR4_4_1ththlnvslhii.R.inc(1078);st1.insert(87);
		__CLR4_4_1ththlnvslhii.R.inc(1079);st1.insert(1000);
		__CLR4_4_1ththlnvslhii.R.inc(1080);st1.insert(0);
		__CLR4_4_1ththlnvslhii.R.inc(1081);st1.insert(0);

		__CLR4_4_1ththlnvslhii.R.inc(1082);st1.delete(1);
		__CLR4_4_1ththlnvslhii.R.inc(1083);st1.delete(100);
		__CLR4_4_1ththlnvslhii.R.inc(1084);st1.delete(10);
		__CLR4_4_1ththlnvslhii.R.inc(1085);st1.delete(1);
		__CLR4_4_1ththlnvslhii.R.inc(1086);st1.delete(1000);

		__CLR4_4_1ththlnvslhii.R.inc(1087);assertFalse(st1.contains(1));
		__CLR4_4_1ththlnvslhii.R.inc(1088);assertTrue(st1.contains(0));

		__CLR4_4_1ththlnvslhii.R.inc(1089);assertEquals(-23,st1.getMinimum());
		__CLR4_4_1ththlnvslhii.R.inc(1090);assertEquals(87,st1.getMaximum());

		__CLR4_4_1ththlnvslhii.R.inc(1091);assertEquals(2,st1.getSuccessor(0));
		__CLR4_4_1ththlnvslhii.R.inc(1092);assertEquals(3,st1.getSuccessor(2));

		__CLR4_4_1ththlnvslhii.R.inc(1093);st1.printTreePreOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1094);st1.printTreeInOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1095);st1.printTreePostOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1096);st2.printTreePreOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1097);st2.printTreeInOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1098);st2.printTreePostOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1099);st1.printTree();

		__CLR4_4_1ththlnvslhii.R.inc(1100);AbstractBinarySearchTree.Node abstn0 = new AbstractBinarySearchTree.Node(null,null,null,null);
		__CLR4_4_1ththlnvslhii.R.inc(1101);assertEquals(31,abstn0.hashCode());

		__CLR4_4_1ththlnvslhii.R.inc(1102);AbstractBinarySearchTree.Node abstn1 = new AbstractBinarySearchTree.Node(1,null,null,null);
		__CLR4_4_1ththlnvslhii.R.inc(1103);AbstractBinarySearchTree.Node abstn2 = new AbstractBinarySearchTree.Node(2,null,null,null);
		__CLR4_4_1ththlnvslhii.R.inc(1104);AbstractBinarySearchTree.Node abstn3 = new AbstractBinarySearchTree.Node(2,abstn2,abstn1,null);
		__CLR4_4_1ththlnvslhii.R.inc(1105);AbstractBinarySearchTree.Node abstn4 = new AbstractBinarySearchTree.Node(2,abstn2,abstn1,null);
		__CLR4_4_1ththlnvslhii.R.inc(1106);AbstractBinarySearchTree.Node abstn5 = new AbstractBinarySearchTree.Node(2,abstn2,abstn1,null);
		__CLR4_4_1ththlnvslhii.R.inc(1107);AbstractBinarySearchTree.Node abstn6 = new AbstractBinarySearchTree.Node(2,null,abstn3,abstn5);
		__CLR4_4_1ththlnvslhii.R.inc(1108);AbstractBinarySearchTree.Node abstn00 = new AbstractBinarySearchTree.Node(null,abstn1,null,null);

		__CLR4_4_1ththlnvslhii.R.inc(1109);assertEquals(32,abstn1.hashCode());

		__CLR4_4_1ththlnvslhii.R.inc(1110);assertFalse(abstn1.equals(null));
		__CLR4_4_1ththlnvslhii.R.inc(1111);assertFalse(abstn1.equals(new Integer(1)));
		__CLR4_4_1ththlnvslhii.R.inc(1112);assertFalse(abstn1.equals(new String("1")));
		__CLR4_4_1ththlnvslhii.R.inc(1113);assertTrue(abstn1.equals(abstn1));
		__CLR4_4_1ththlnvslhii.R.inc(1114);assertFalse(abstn1.equals(abstn0));
		__CLR4_4_1ththlnvslhii.R.inc(1115);assertFalse(abstn1.equals(abstn2));
		__CLR4_4_1ththlnvslhii.R.inc(1116);assertTrue(abstn0.equals(abstn0));
		__CLR4_4_1ththlnvslhii.R.inc(1117);assertFalse(abstn0.equals(abstn1));
		__CLR4_4_1ththlnvslhii.R.inc(1118);assertTrue(abstn0.equals(abstn00));

		__CLR4_4_1ththlnvslhii.R.inc(1119);st2.insert(1);
		__CLR4_4_1ththlnvslhii.R.inc(1120);st2.insert(1);
		__CLR4_4_1ththlnvslhii.R.inc(1121);st2.insert(2);
		__CLR4_4_1ththlnvslhii.R.inc(1122);st2.insert(3);
		__CLR4_4_1ththlnvslhii.R.inc(1123);st2.insert(5);
		__CLR4_4_1ththlnvslhii.R.inc(1124);st2.insert(7);
		__CLR4_4_1ththlnvslhii.R.inc(1125);st2.insert(-23);
		__CLR4_4_1ththlnvslhii.R.inc(1126);st2.insert(87);
		__CLR4_4_1ththlnvslhii.R.inc(1127);st2.insert(1000);
		__CLR4_4_1ththlnvslhii.R.inc(1128);st2.insert(0);
		__CLR4_4_1ththlnvslhii.R.inc(1129);st2.insert(-1);

		__CLR4_4_1ththlnvslhii.R.inc(1130);assertEquals(1,st2.getSuccessor(0));
		__CLR4_4_1ththlnvslhii.R.inc(1131);assertEquals(3,st2.getSuccessor(2));

		__CLR4_4_1ththlnvslhii.R.inc(1132);st2.printTree();
		__CLR4_4_1ththlnvslhii.R.inc(1133);st2.printTreePreOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1134);st2.printTreeInOrder();
		__CLR4_4_1ththlnvslhii.R.inc(1135);st2.printTreePostOrder();

		__CLR4_4_1ththlnvslhii.R.inc(1136);st2.delete(-1);
		__CLR4_4_1ththlnvslhii.R.inc(1137);st2.delete(1);
		__CLR4_4_1ththlnvslhii.R.inc(1138);st2.delete(100);
		__CLR4_4_1ththlnvslhii.R.inc(1139);st2.delete(10);
		__CLR4_4_1ththlnvslhii.R.inc(1140);st2.delete(0);
		__CLR4_4_1ththlnvslhii.R.inc(1141);st2.delete(null);

		__CLR4_4_1ththlnvslhii.R.inc(1142);st2.printTree();

		__CLR4_4_1ththlnvslhii.R.inc(1143);st2.delete(abstn0);
		__CLR4_4_1ththlnvslhii.R.inc(1144);st2.delete(abstractBinarySearchTree_Node1);
		__CLR4_4_1ththlnvslhii.R.inc(1145);st2.delete(abstn3);

		__CLR4_4_1ththlnvslhii.R.inc(1146);assertEquals(2,MathUtils.getMax(1,2));
		__CLR4_4_1ththlnvslhii.R.inc(1147);assertEquals(2,MathUtils.getMax(2,1));
		__CLR4_4_1ththlnvslhii.R.inc(1148);assertEquals(1,MathUtils.getMax(1,1));
		__CLR4_4_1ththlnvslhii.R.inc(1149);assertEquals(0,MathUtils.getDigitFromNumber(1,1));

		__CLR4_4_1ththlnvslhii.R.inc(1150);st1.printSubtree(abstn1);
		__CLR4_4_1ththlnvslhii.R.inc(1151);st1.printSubtree(abstn0);
		__CLR4_4_1ththlnvslhii.R.inc(1152);st1.printSubtree(abstn2);


		__CLR4_4_1ththlnvslhii.R.inc(1153);ScapegoatTree st3 = new ScapegoatTree(1);
		__CLR4_4_1ththlnvslhii.R.inc(1154);st3.insert(1);
		__CLR4_4_1ththlnvslhii.R.inc(1155);st3.insert(2);
		__CLR4_4_1ththlnvslhii.R.inc(1156);st3.insert(1);
		__CLR4_4_1ththlnvslhii.R.inc(1157);st3.insert(4);
		__CLR4_4_1ththlnvslhii.R.inc(1158);st3.insert(2);
		__CLR4_4_1ththlnvslhii.R.inc(1159);st3.printTree();
		__CLR4_4_1ththlnvslhii.R.inc(1160);st3.delete(2);

		__CLR4_4_1ththlnvslhii.R.inc(1161);st3.rotateRight(abstn3);
		__CLR4_4_1ththlnvslhii.R.inc(1162);st3.rotateRight(abstn5);

		__CLR4_4_1ththlnvslhii.R.inc(1163);st3.rotateLeft(abstn1);
		__CLR4_4_1ththlnvslhii.R.inc(1164);st3.rotateLeft(abstn2);

		__CLR4_4_1ththlnvslhii.R.inc(1165);st3.rotateRight(abstn6);

		__CLR4_4_1ththlnvslhii.R.inc(1166);ScapegoatTree stm = new ScapegoatTree();
		__CLR4_4_1ththlnvslhii.R.inc(1167);Class clazz = stm.getClass();
		__CLR4_4_1ththlnvslhii.R.inc(1168);Method method1,method2,method3;
		__CLR4_4_1ththlnvslhii.R.inc(1169);method1 = clazz.getDeclaredMethod("getNodeHeight", AbstractBinarySearchTree.Node.class);
		__CLR4_4_1ththlnvslhii.R.inc(1170);method2 = clazz.getDeclaredMethod("getSibling", AbstractBinarySearchTree.Node.class);
		__CLR4_4_1ththlnvslhii.R.inc(1171);method3 = clazz.getDeclaredMethod("findScapegoatNode", AbstractBinarySearchTree.Node.class);
		__CLR4_4_1ththlnvslhii.R.inc(1172);method1.setAccessible(true);
		__CLR4_4_1ththlnvslhii.R.inc(1173);method2.setAccessible(true);
		__CLR4_4_1ththlnvslhii.R.inc(1174);method3.setAccessible(true);
		__CLR4_4_1ththlnvslhii.R.inc(1175);method1.invoke(stm,(AbstractBinarySearchTree.Node)null);
		__CLR4_4_1ththlnvslhii.R.inc(1176);method2.invoke(stm,abstn0);
		__CLR4_4_1ththlnvslhii.R.inc(1177);method3.invoke(stm,abstn0);

		__CLR4_4_1ththlnvslhii.R.inc(1178);MathUtils a = new MathUtils();
	}finally{__CLR4_4_1ththlnvslhii.R.flushNeeded();}}

}
