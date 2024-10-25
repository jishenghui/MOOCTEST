/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static net.mooctest.BPlusTree.RangePolicy.EXCLUSIVE;
import static net.mooctest.BPlusTree.RangePolicy.INCLUSIVE;

public class BPlusTreeTest {static class __CLR4_4_1jcjclo0x4sfg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0039\u0039\u0035\u0037\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697945872865L,8589935092L,774,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() {__CLR4_4_1jcjclo0x4sfg.R.globalSliceStart(getClass().getName(),696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3jc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0x4sfg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0x4sfg.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3jc(){try{__CLR4_4_1jcjclo0x4sfg.R.inc(696);
		__CLR4_4_1jcjclo0x4sfg.R.inc(697);ClosestPair.main(null);
		__CLR4_4_1jcjclo0x4sfg.R.inc(698);int[] arr = new int[] {10, 20, 30, 50, 10, 70, 30};
		__CLR4_4_1jcjclo0x4sfg.R.inc(699);int[] target = new int[] {0,70, 30, 20, 10, 10, 10, 10};
		__CLR4_4_1jcjclo0x4sfg.R.inc(700);int[] res = MaximumMinimumWindow.calculateMaxOfMin(arr, arr.length);
		__CLR4_4_1jcjclo0x4sfg.R.inc(701);BPlusTree<Integer, Object> bPlusTree=new BPlusTree<>(4);
		__CLR4_4_1jcjclo0x4sfg.R.inc(702);bPlusTree.insert(0,"a");
		__CLR4_4_1jcjclo0x4sfg.R.inc(703);bPlusTree.insert(1,"b");
		__CLR4_4_1jcjclo0x4sfg.R.inc(704);bPlusTree.insert(2,"c");
		__CLR4_4_1jcjclo0x4sfg.R.inc(705);bPlusTree.insert(4,"e");
		__CLR4_4_1jcjclo0x4sfg.R.inc(706);bPlusTree.insert(3,"d");
		__CLR4_4_1jcjclo0x4sfg.R.inc(707);bPlusTree.search(3);
		__CLR4_4_1jcjclo0x4sfg.R.inc(708);bPlusTree.search(0);
		__CLR4_4_1jcjclo0x4sfg.R.inc(709);bPlusTree.toString();
		__CLR4_4_1jcjclo0x4sfg.R.inc(710);bPlusTree.searchRange(0,EXCLUSIVE,4,INCLUSIVE);
		__CLR4_4_1jcjclo0x4sfg.R.inc(711);bPlusTree.searchRange(0,INCLUSIVE,4,INCLUSIVE);
		__CLR4_4_1jcjclo0x4sfg.R.inc(712);bPlusTree.searchRange(0,EXCLUSIVE,4,EXCLUSIVE);
		__CLR4_4_1jcjclo0x4sfg.R.inc(713);bPlusTree.delete(3);
		__CLR4_4_1jcjclo0x4sfg.R.inc(714);bPlusTree.delete(4);
		__CLR4_4_1jcjclo0x4sfg.R.inc(715);BPlusTree<Integer, Object> bPlusTree1=new BPlusTree<>(3);
		__CLR4_4_1jcjclo0x4sfg.R.inc(716);bPlusTree1.insert(0,"a");
		__CLR4_4_1jcjclo0x4sfg.R.inc(717);bPlusTree1.insert(1,"b");
		__CLR4_4_1jcjclo0x4sfg.R.inc(718);bPlusTree1.insert(2,"c");
		__CLR4_4_1jcjclo0x4sfg.R.inc(719);bPlusTree1.insert(4,"e");
		__CLR4_4_1jcjclo0x4sfg.R.inc(720);bPlusTree1.insert(3,"d");
		__CLR4_4_1jcjclo0x4sfg.R.inc(721);bPlusTree1.search(3);
		__CLR4_4_1jcjclo0x4sfg.R.inc(722);bPlusTree1.search(0);
		__CLR4_4_1jcjclo0x4sfg.R.inc(723);bPlusTree1.toString();
		__CLR4_4_1jcjclo0x4sfg.R.inc(724);bPlusTree1.searchRange(0,EXCLUSIVE,4,INCLUSIVE);
		__CLR4_4_1jcjclo0x4sfg.R.inc(725);bPlusTree1.searchRange(0,INCLUSIVE,4,INCLUSIVE);
		__CLR4_4_1jcjclo0x4sfg.R.inc(726);bPlusTree1.searchRange(0,EXCLUSIVE,4,EXCLUSIVE);
		__CLR4_4_1jcjclo0x4sfg.R.inc(727);bPlusTree1.delete(3);
		__CLR4_4_1jcjclo0x4sfg.R.inc(728);bPlusTree1.insert(-1,"e");
		__CLR4_4_1jcjclo0x4sfg.R.inc(729);bPlusTree1.insert(-2,"e");
		__CLR4_4_1jcjclo0x4sfg.R.inc(730);bPlusTree1.delete(2);
		__CLR4_4_1jcjclo0x4sfg.R.inc(731);bPlusTree1.delete(1);

		__CLR4_4_1jcjclo0x4sfg.R.inc(732);BinaryExponentiation binaryExponentiation=new BinaryExponentiation();
		__CLR4_4_1jcjclo0x4sfg.R.inc(733);binaryExponentiation.power(15,4);
		__CLR4_4_1jcjclo0x4sfg.R.inc(734);BinaryExponentiation.calculatePower(3,5);
		__CLR4_4_1jcjclo0x4sfg.R.inc(735);BinaryExponentiation.calculatePower(3,0);
		__CLR4_4_1jcjclo0x4sfg.R.inc(736);try{
			__CLR4_4_1jcjclo0x4sfg.R.inc(737);MaximumMinimumWindow.main(null);
		}
		catch (AssertionError ignored)
		{

		}
		__CLR4_4_1jcjclo0x4sfg.R.inc(738);SkylineAlgorithm skylineAlgorithm=new SkylineAlgorithm();
		__CLR4_4_1jcjclo0x4sfg.R.inc(739);ArrayList<SkylineAlgorithm.Point> points=new ArrayList<>();
		__CLR4_4_1jcjclo0x4sfg.R.inc(740);points.add(new SkylineAlgorithm.Point(1,2));
		__CLR4_4_1jcjclo0x4sfg.R.inc(741);points.add(new SkylineAlgorithm.Point(3,7));
		__CLR4_4_1jcjclo0x4sfg.R.inc(742);points.add(new SkylineAlgorithm.Point(-1,2));
		__CLR4_4_1jcjclo0x4sfg.R.inc(743);points.add(new SkylineAlgorithm.Point(1,-2));
		__CLR4_4_1jcjclo0x4sfg.R.inc(744);points.add(new SkylineAlgorithm.Point(88,21));

		__CLR4_4_1jcjclo0x4sfg.R.inc(745);ArrayList<SkylineAlgorithm.Point> points2=new ArrayList<>();
		__CLR4_4_1jcjclo0x4sfg.R.inc(746);points2.add(new SkylineAlgorithm.Point(0,0));
		__CLR4_4_1jcjclo0x4sfg.R.inc(747);points2.add(new SkylineAlgorithm.Point(-3,7));
		__CLR4_4_1jcjclo0x4sfg.R.inc(748);points2.add(new SkylineAlgorithm.Point(-1,-8));
		__CLR4_4_1jcjclo0x4sfg.R.inc(749);points2.add(new SkylineAlgorithm.Point(1,-2));
		__CLR4_4_1jcjclo0x4sfg.R.inc(750);points2.add(new SkylineAlgorithm.Point(-4,21));

		__CLR4_4_1jcjclo0x4sfg.R.inc(751);points2.get(0).getX();
		__CLR4_4_1jcjclo0x4sfg.R.inc(752);points2.get(0).getY();
		__CLR4_4_1jcjclo0x4sfg.R.inc(753);points2.get(0).equals(points.get(0));

		__CLR4_4_1jcjclo0x4sfg.R.inc(754);skylineAlgorithm.getPoints();
		__CLR4_4_1jcjclo0x4sfg.R.inc(755);skylineAlgorithm.produceSubSkyLines(points);
		__CLR4_4_1jcjclo0x4sfg.R.inc(756);skylineAlgorithm.produceFinalSkyLine(points,points2);
		__CLR4_4_1jcjclo0x4sfg.R.inc(757);skylineAlgorithm.produceSubSkyLines(points2);

		__CLR4_4_1jcjclo0x4sfg.R.inc(758);ArrayList<SkylineAlgorithm.Point> points3=new ArrayList<>();
		__CLR4_4_1jcjclo0x4sfg.R.inc(759);ArrayList<SkylineAlgorithm.Point> points4=new ArrayList<>();
		__CLR4_4_1jcjclo0x4sfg.R.inc(760);points3.add(new SkylineAlgorithm.Point(1,8));
		__CLR4_4_1jcjclo0x4sfg.R.inc(761);points3.add(new SkylineAlgorithm.Point(1,2));
		__CLR4_4_1jcjclo0x4sfg.R.inc(762);points3.add(new SkylineAlgorithm.Point(2,1));
		__CLR4_4_1jcjclo0x4sfg.R.inc(763);points4.add(new SkylineAlgorithm.Point(1,2));
		__CLR4_4_1jcjclo0x4sfg.R.inc(764);points4.add(new SkylineAlgorithm.Point(1,5));
		__CLR4_4_1jcjclo0x4sfg.R.inc(765);skylineAlgorithm.produceFinalSkyLine(points3,points4);
		__CLR4_4_1jcjclo0x4sfg.R.inc(766);StrassenMatrixMultiplication strassenMatrixMultiplication=new StrassenMatrixMultiplication();
		__CLR4_4_1jcjclo0x4sfg.R.inc(767);int[][] A={{1,2,3,4},{1,2,3,5},{9,5,-8,-1},{-5,-1,5,5}};
		__CLR4_4_1jcjclo0x4sfg.R.inc(768);int[][] B={{1,2,7,6},{1,3,4,6},{9,-1,9,7},{-5,5,3,3}};
		__CLR4_4_1jcjclo0x4sfg.R.inc(769);strassenMatrixMultiplication.add(A,B);
		__CLR4_4_1jcjclo0x4sfg.R.inc(770);strassenMatrixMultiplication.join(A,B,0,0);
		__CLR4_4_1jcjclo0x4sfg.R.inc(771);strassenMatrixMultiplication.multiply(A,B);
		__CLR4_4_1jcjclo0x4sfg.R.inc(772);strassenMatrixMultiplication.sub(A,B);
		__CLR4_4_1jcjclo0x4sfg.R.inc(773);strassenMatrixMultiplication.split(A,B,0,0);
	}finally{__CLR4_4_1jcjclo0x4sfg.R.flushNeeded();}}

}