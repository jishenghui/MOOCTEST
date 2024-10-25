/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
//author:TheOnlyman
public class ScapegoatTreeTest {static class __CLR4_4_1wrwrlnvslhiv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0039\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697635922772L,8589935092L,1213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test1() {__CLR4_4_1wrwrlnvslhiv.R.globalSliceStart(getClass().getName(),1179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beuwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wrwrlnvslhiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wrwrlnvslhiv.R.globalSliceEnd(getClass().getName(),"net.mooctest.ScapegoatTreeTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1179,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beuwr(){try{__CLR4_4_1wrwrlnvslhiv.R.inc(1179);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1180);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1wrwrlnvslhiv.R.inc(1181);for(int i=0;(((i < 10)&&(__CLR4_4_1wrwrlnvslhiv.R.iget(1182)!=0|true))||(__CLR4_4_1wrwrlnvslhiv.R.iget(1183)==0&false));i++) {{
			__CLR4_4_1wrwrlnvslhiv.R.inc(1184);scapegoatTree.insert(i);
		}
		}__CLR4_4_1wrwrlnvslhiv.R.inc(1185);for(int i = 0;(((i < 10)&&(__CLR4_4_1wrwrlnvslhiv.R.iget(1186)!=0|true))||(__CLR4_4_1wrwrlnvslhiv.R.iget(1187)==0&false));i++) {{
			__CLR4_4_1wrwrlnvslhiv.R.inc(1188);scapegoatTree.delete(i);
		}
		}__CLR4_4_1wrwrlnvslhiv.R.inc(1189);for(int i=10;(((i >= 0)&&(__CLR4_4_1wrwrlnvslhiv.R.iget(1190)!=0|true))||(__CLR4_4_1wrwrlnvslhiv.R.iget(1191)==0&false));i--) {{
			__CLR4_4_1wrwrlnvslhiv.R.inc(1192);scapegoatTree.insert(i);
		}
//		for(int i = 0;i < 10;i++) {
//			scapegoatTree.delete(i);
//		}
		}__CLR4_4_1wrwrlnvslhiv.R.inc(1193);scapegoatTree.printTree();
		__CLR4_4_1wrwrlnvslhiv.R.inc(1194);scapegoatTree.printTreeInOrder();
		__CLR4_4_1wrwrlnvslhiv.R.inc(1195);scapegoatTree.printTreePostOrder();
		__CLR4_4_1wrwrlnvslhiv.R.inc(1196);scapegoatTree.printTreePreOrder();
		
		
//		
	}finally{__CLR4_4_1wrwrlnvslhiv.R.flushNeeded();}}
	
	@Test
	public void test2() {__CLR4_4_1wrwrlnvslhiv.R.globalSliceStart(getClass().getName(),1197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wrwrlnvslhiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wrwrlnvslhiv.R.globalSliceEnd(getClass().getName(),"net.mooctest.ScapegoatTreeTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1197,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bx9(){try{__CLR4_4_1wrwrlnvslhiv.R.inc(1197);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1198);ScapegoatTree scapegoatTree = new ScapegoatTree(0);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1199);AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1200);AbstractBinarySearchTree.Node node1 = null;
		__CLR4_4_1wrwrlnvslhiv.R.inc(1201);scapegoatTree.findScapegoatNode(node);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1202);scapegoatTree.getNodeHeight(node1);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1203);scapegoatTree.printSubtree(node);
		
				
	}finally{__CLR4_4_1wrwrlnvslhiv.R.flushNeeded();}}
	
	@Test
	public void test3() {__CLR4_4_1wrwrlnvslhiv.R.globalSliceStart(getClass().getName(),1204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1wrwrlnvslhiv.R.rethrow($CLV_t2$);}finally{__CLR4_4_1wrwrlnvslhiv.R.globalSliceEnd(getClass().getName(),"net.mooctest.ScapegoatTreeTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),1204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsxg(){try{__CLR4_4_1wrwrlnvslhiv.R.inc(1204);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1205);ScapegoatTree scapegoatTree = new ScapegoatTree();
		__CLR4_4_1wrwrlnvslhiv.R.inc(1206);Class<ScapegoatTree> class1 = ScapegoatTree.class;
		__CLR4_4_1wrwrlnvslhiv.R.inc(1207);AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(null,null,null,null);
		__CLR4_4_1wrwrlnvslhiv.R.inc(1208);try {
			__CLR4_4_1wrwrlnvslhiv.R.inc(1209);Method method = class1.getDeclaredMethod("getSibling", AbstractBinarySearchTree.Node.class);
			__CLR4_4_1wrwrlnvslhiv.R.inc(1210);method.setAccessible(true);
			__CLR4_4_1wrwrlnvslhiv.R.inc(1211);method.invoke(scapegoatTree, node1);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO \u9477\ue044\u59e9\u9422\u71b8\u579a\u9428\ufffd catch \u9367\ufffd
			__CLR4_4_1wrwrlnvslhiv.R.inc(1212);e.printStackTrace();
		}
	}finally{__CLR4_4_1wrwrlnvslhiv.R.flushNeeded();}}

}
