/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
//author:TheOnlyman
public class AbstractSelfBalancingBinarySearchTreeTest3 {static class __CLR4_4_1pzpzlnvslhi0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0039\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697635922772L,8589935092L,1061,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	AbstractSelfBalancingBinarySearchTree abt;
	AbstractBinarySearchTree.Node node;
	@Before
	public void setUp() {try{__CLR4_4_1pzpzlnvslhi0.R.inc(935);
		__CLR4_4_1pzpzlnvslhi0.R.inc(936);abt = new AbstractSelfBalancingBinarySearchTree() {
			@Override
			protected Node createNode(int value, Node parent, Node left, Node right) {try{__CLR4_4_1pzpzlnvslhi0.R.inc(937);
				__CLR4_4_1pzpzlnvslhi0.R.inc(938);return new Node(value,parent,left,right);
			}finally{__CLR4_4_1pzpzlnvslhi0.R.flushNeeded();}}
		};
		__CLR4_4_1pzpzlnvslhi0.R.inc(939);node = null;
	}finally{__CLR4_4_1pzpzlnvslhi0.R.flushNeeded();}}

	@Test
	public void test() {__CLR4_4_1pzpzlnvslhi0.R.globalSliceStart(getClass().getName(),940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3q4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pzpzlnvslhi0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pzpzlnvslhi0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest3.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),940,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3q4(){try{__CLR4_4_1pzpzlnvslhi0.R.inc(940);
		__CLR4_4_1pzpzlnvslhi0.R.inc(941);ScapegoatTree scapegoatTree0 = new ScapegoatTree();
		__CLR4_4_1pzpzlnvslhi0.R.inc(942);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.createNode((-3252),
				(AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
				(AbstractBinarySearchTree.Node) null);
		__CLR4_4_1pzpzlnvslhi0.R.inc(943);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = new AbstractBinarySearchTree.Node(
				abstractBinarySearchTree_Node0.value, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0,
				abstractBinarySearchTree_Node0);
		__CLR4_4_1pzpzlnvslhi0.R.inc(944);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node1);
		__CLR4_4_1pzpzlnvslhi0.R.inc(945);scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node1);
		__CLR4_4_1pzpzlnvslhi0.R.inc(946);AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0
				.rotateRight(abstractBinarySearchTree_Node2);
		__CLR4_4_1pzpzlnvslhi0.R.inc(947);assertTrue(abstractBinarySearchTree_Node1.isLeaf());
		__CLR4_4_1pzpzlnvslhi0.R.inc(948);assertSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node3);
	}finally{__CLR4_4_1pzpzlnvslhi0.R.flushNeeded();}}

	@Test
	public void test0() {__CLR4_4_1pzpzlnvslhi0.R.globalSliceStart(getClass().getName(),949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1156cmdqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pzpzlnvslhi0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pzpzlnvslhi0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest3.test0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),949,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1156cmdqd(){try{__CLR4_4_1pzpzlnvslhi0.R.inc(949);

	}finally{__CLR4_4_1pzpzlnvslhi0.R.flushNeeded();}}

	@Test
	public void randomTest() {__CLR4_4_1pzpzlnvslhi0.R.globalSliceStart(getClass().getName(),950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1occ718qe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pzpzlnvslhi0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pzpzlnvslhi0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest3.randomTest",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1occ718qe(){try{__CLR4_4_1pzpzlnvslhi0.R.inc(950);
		__CLR4_4_1pzpzlnvslhi0.R.inc(951);int n = 100;
		__CLR4_4_1pzpzlnvslhi0.R.inc(952);Random rnd = new Random(998244353);
		__CLR4_4_1pzpzlnvslhi0.R.inc(953);for(int i=1;(((i<=10)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(954)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(955)==0&false));i++) {{
			__CLR4_4_1pzpzlnvslhi0.R.inc(956);Random random = new Random(rnd.nextInt(100));
			__CLR4_4_1pzpzlnvslhi0.R.inc(957);for (int j=1;(((j<=1000)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(958)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(959)==0&false));j++) {{
				__CLR4_4_1pzpzlnvslhi0.R.inc(960);node = abt.insert(random.nextInt(n));
				__CLR4_4_1pzpzlnvslhi0.R.inc(961);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(962);abt.rotateLeft(abt.root);
				} catch (Exception e) {
				}
				__CLR4_4_1pzpzlnvslhi0.R.inc(963);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(964);abt.rotateLeft(abt.root.left);
				} catch (Exception e) {
				}
				__CLR4_4_1pzpzlnvslhi0.R.inc(965);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(966);abt.rotateLeft(abt.root.right);
				} catch (Exception e) {
				}
				__CLR4_4_1pzpzlnvslhi0.R.inc(967);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(968);abt.rotateRight(abt.root);
				} catch (Exception e) {
				}
			}
			}__CLR4_4_1pzpzlnvslhi0.R.inc(969);abt.root.isLeaf();
			__CLR4_4_1pzpzlnvslhi0.R.inc(970);for (int j=1;(((j<=1000)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(971)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(972)==0&false));j++) {{
				__CLR4_4_1pzpzlnvslhi0.R.inc(973);abt.search(random.nextInt(n));
				__CLR4_4_1pzpzlnvslhi0.R.inc(974);abt.delete(random.nextInt(n));
				__CLR4_4_1pzpzlnvslhi0.R.inc(975);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(976);abt.rotateLeft(abt.root);
				} catch (Exception e) {
				}
				__CLR4_4_1pzpzlnvslhi0.R.inc(977);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(978);abt.rotateLeft(abt.root.left);
				} catch (Exception e) {
				}
				__CLR4_4_1pzpzlnvslhi0.R.inc(979);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(980);abt.rotateLeft(abt.root.right);
				} catch (Exception e) {
				}
				__CLR4_4_1pzpzlnvslhi0.R.inc(981);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(982);abt.rotateRight(abt.root);
				} catch (Exception e) {
				}
			}
		}}
	}}finally{__CLR4_4_1pzpzlnvslhi0.R.flushNeeded();}}

	@Test(timeout=10000)
	public void test1() {__CLR4_4_1pzpzlnvslhi0.R.globalSliceStart(getClass().getName(),983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beurb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pzpzlnvslhi0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pzpzlnvslhi0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest3.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),983,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beurb(){try{__CLR4_4_1pzpzlnvslhi0.R.inc(983);
		__CLR4_4_1pzpzlnvslhi0.R.inc(984);for(int i=1;(((i<=10)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(985)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(986)==0&false));++i) {{
			__CLR4_4_1pzpzlnvslhi0.R.inc(987);ScapegoatTree scapegoatTree0 = new ScapegoatTree();
			__CLR4_4_1pzpzlnvslhi0.R.inc(988);ScapegoatTree.Node [] nod = new ScapegoatTree.Node[105];
			__CLR4_4_1pzpzlnvslhi0.R.inc(989);for(int j=1;(((j<=100)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(990)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(991)==0&false));++j) {{
				__CLR4_4_1pzpzlnvslhi0.R.inc(992);nod[j]=scapegoatTree0.createNode(j%17, null, null, null);
				__CLR4_4_1pzpzlnvslhi0.R.inc(993);scapegoatTree0.createNode(j%13, nod[j], null, null);
				__CLR4_4_1pzpzlnvslhi0.R.inc(994);scapegoatTree0.insert(j%7);
				__CLR4_4_1pzpzlnvslhi0.R.inc(995);scapegoatTree0.delete(j%11);
				__CLR4_4_1pzpzlnvslhi0.R.inc(996);try {

					__CLR4_4_1pzpzlnvslhi0.R.inc(997);if((((scapegoatTree0.contains(j))&&(__CLR4_4_1pzpzlnvslhi0.R.iget(998)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(999)==0&false))) {{}
				}}catch(Exception e) {

				}
			}
			}__CLR4_4_1pzpzlnvslhi0.R.inc(1000);try {
				__CLR4_4_1pzpzlnvslhi0.R.inc(1001);int szz=scapegoatTree0.size;
				__CLR4_4_1pzpzlnvslhi0.R.inc(1002);int mxx=scapegoatTree0.getMaximum();
				__CLR4_4_1pzpzlnvslhi0.R.inc(1003);int mii=scapegoatTree0.getMinimum();
			}catch(Exception e) {

			}
			__CLR4_4_1pzpzlnvslhi0.R.inc(1004);for(int j=5;(((j<=100)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1005)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1006)==0&false));++j) {{
				__CLR4_4_1pzpzlnvslhi0.R.inc(1007);if((((scapegoatTree0.root==nod[j])&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1008)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1009)==0&false))) {{}
				}__CLR4_4_1pzpzlnvslhi0.R.inc(1010);if((((nod[j].parent==null)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1011)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1012)==0&false))) {{
					__CLR4_4_1pzpzlnvslhi0.R.inc(1013);int f=j%4+1;
					__CLR4_4_1pzpzlnvslhi0.R.inc(1014);if((((nod[f].left==null)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1015)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1016)==0&false))) {{
						__CLR4_4_1pzpzlnvslhi0.R.inc(1017);nod[f].left=nod[j];
						__CLR4_4_1pzpzlnvslhi0.R.inc(1018);nod[j].parent=nod[f];
					}}else {__CLR4_4_1pzpzlnvslhi0.R.inc(1019);if((((nod[f].right==null)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1020)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1021)==0&false))) {{
						__CLR4_4_1pzpzlnvslhi0.R.inc(1022);nod[f].right=nod[j];
						__CLR4_4_1pzpzlnvslhi0.R.inc(1023);nod[j].parent=nod[f];
					}
					}}__CLR4_4_1pzpzlnvslhi0.R.inc(1024);if((((nod[j].isLeaf())&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1025)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1026)==0&false))) {{
					}
				}}
				}__CLR4_4_1pzpzlnvslhi0.R.inc(1027);scapegoatTree0.printTree();
				__CLR4_4_1pzpzlnvslhi0.R.inc(1028);scapegoatTree0.printTreeInOrder();
				__CLR4_4_1pzpzlnvslhi0.R.inc(1029);scapegoatTree0.printTreePostOrder();
				__CLR4_4_1pzpzlnvslhi0.R.inc(1030);scapegoatTree0.printTreePreOrder();
			}
			}__CLR4_4_1pzpzlnvslhi0.R.inc(1031);try {
				__CLR4_4_1pzpzlnvslhi0.R.inc(1032);for(int j=1;(((j<=10)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1033)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1034)==0&false));++j) {{
					__CLR4_4_1pzpzlnvslhi0.R.inc(1035);scapegoatTree0.printSubtree(nod[j]);
				}
			}}catch(Exception e2) {

			}
		}
	}}finally{__CLR4_4_1pzpzlnvslhi0.R.flushNeeded();}}
	@Test(timeout=10000)
	public void test3() {__CLR4_4_1pzpzlnvslhi0.R.globalSliceStart(getClass().getName(),1036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1pzpzlnvslhi0.R.rethrow($CLV_t2$);}finally{__CLR4_4_1pzpzlnvslhi0.R.globalSliceEnd(getClass().getName(),"net.mooctest.AbstractSelfBalancingBinarySearchTreeTest3.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsss(){try{__CLR4_4_1pzpzlnvslhi0.R.inc(1036);
		__CLR4_4_1pzpzlnvslhi0.R.inc(1037);for(int i=1;(((i<=10)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1038)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1039)==0&false));++i) {{
			__CLR4_4_1pzpzlnvslhi0.R.inc(1040);ScapegoatTree scapegoatTree0 = new ScapegoatTree();
			__CLR4_4_1pzpzlnvslhi0.R.inc(1041);for(int j=1;(((j<=1000)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1042)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1043)==0&false));++j) {{
				__CLR4_4_1pzpzlnvslhi0.R.inc(1044);scapegoatTree0.insert(j%7);
				__CLR4_4_1pzpzlnvslhi0.R.inc(1045);scapegoatTree0.delete(j%11);
				__CLR4_4_1pzpzlnvslhi0.R.inc(1046);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(1047);if((((scapegoatTree0.contains(j))&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1048)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1049)==0&false))) {{}
				}}catch(Exception e) {

				}
			}
			}__CLR4_4_1pzpzlnvslhi0.R.inc(1050);try {
				__CLR4_4_1pzpzlnvslhi0.R.inc(1051);int szz=scapegoatTree0.size;
				__CLR4_4_1pzpzlnvslhi0.R.inc(1052);int mxx=scapegoatTree0.getMaximum();
				__CLR4_4_1pzpzlnvslhi0.R.inc(1053);int mii=scapegoatTree0.getMinimum();
			}catch(Exception e) {

			}
			__CLR4_4_1pzpzlnvslhi0.R.inc(1054);for(int j=1;(((j<=1000)&&(__CLR4_4_1pzpzlnvslhi0.R.iget(1055)!=0|true))||(__CLR4_4_1pzpzlnvslhi0.R.iget(1056)==0&false));++j) {{
				__CLR4_4_1pzpzlnvslhi0.R.inc(1057);try {
					__CLR4_4_1pzpzlnvslhi0.R.inc(1058);scapegoatTree0.contains(j);
					__CLR4_4_1pzpzlnvslhi0.R.inc(1059);scapegoatTree0.getSuccessor(j);
					__CLR4_4_1pzpzlnvslhi0.R.inc(1060);scapegoatTree0.delete(j);
				}catch(Exception e) {

				}
			}
		}}
	}}finally{__CLR4_4_1pzpzlnvslhi0.R.flushNeeded();}}

}
