/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

import net.mooctest.SkylineAlgorithm.Point;

public class BPlusTreeTest {static class __CLR4_4_1jcjclo0xphkd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946838556L,8589935092L,806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	

	@Test
	public void test() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3jc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),696,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3jc(){try{__CLR4_4_1jcjclo0xphkd.R.inc(696);
		__CLR4_4_1jcjclo0xphkd.R.inc(697);BinaryExponentiation binaryExponentiation = new BinaryExponentiation();
		
		__CLR4_4_1jcjclo0xphkd.R.inc(698);assertEquals(1, binaryExponentiation.power(1L, 2L));
		__CLR4_4_1jcjclo0xphkd.R.inc(699);BinaryExponentiation.calculatePower(0, 1);
	}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	@Test
	public void test1() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beujg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beujg(){try{__CLR4_4_1jcjclo0xphkd.R.inc(700);
		__CLR4_4_1jcjclo0xphkd.R.inc(701);BPlusTree<Integer, Integer> bPlusTree = new BPlusTree<>();
		__CLR4_4_1jcjclo0xphkd.R.inc(702);for (int i = 0; (((i < 10)&&(__CLR4_4_1jcjclo0xphkd.R.iget(703)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(704)==0&false)); i++) {{
			__CLR4_4_1jcjclo0xphkd.R.inc(705);bPlusTree.insert(i, i+1);
			
		}
		}__CLR4_4_1jcjclo0xphkd.R.inc(706);for (int i = 0; (((i < 10)&&(__CLR4_4_1jcjclo0xphkd.R.iget(707)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(708)==0&false)); i++) {{
			
			__CLR4_4_1jcjclo0xphkd.R.inc(709);assertNotNull(bPlusTree.search(i));
		}
		}__CLR4_4_1jcjclo0xphkd.R.inc(710);System.out.println(bPlusTree);
		__CLR4_4_1jcjclo0xphkd.R.inc(711);for (int i = 0; (((i < 10)&&(__CLR4_4_1jcjclo0xphkd.R.iget(712)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(713)==0&false)); i++) {{
			__CLR4_4_1jcjclo0xphkd.R.inc(714);bPlusTree.delete(i);
		}
		
	}}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	@Test
	public void test2() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),715,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bjv(){try{__CLR4_4_1jcjclo0xphkd.R.inc(715);
		__CLR4_4_1jcjclo0xphkd.R.inc(716);try {
			__CLR4_4_1jcjclo0xphkd.R.inc(717);BPlusTree<Integer, Integer> bPlusTree = new BPlusTree<>(1);
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			__CLR4_4_1jcjclo0xphkd.R.inc(718);e.printStackTrace();
			
		}
		
		
	}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	@Test
	public void test3() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsjz(){try{__CLR4_4_1jcjclo0xphkd.R.inc(719);
		__CLR4_4_1jcjclo0xphkd.R.inc(720);int[] i = {1,2,5,2};
		__CLR4_4_1jcjclo0xphkd.R.inc(721);MaximumMinimumWindow.calculateMaxOfMin(i,3);
		__CLR4_4_1jcjclo0xphkd.R.inc(722);String[] args = new String[10];
		__CLR4_4_1jcjclo0xphkd.R.inc(723);try {
			__CLR4_4_1jcjclo0xphkd.R.inc(724);MaximumMinimumWindow.main(args);
		} catch (AssertionError e) {
			// TODO: handle exception
		}

	}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	@Test
	public void test4() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9k5(){try{__CLR4_4_1jcjclo0xphkd.R.inc(725);
		__CLR4_4_1jcjclo0xphkd.R.inc(726);SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
		
//			skylineAlgorithm.
//		System.out.println(11);
//		System.out.println();
		__CLR4_4_1jcjclo0xphkd.R.inc(727);assertNotNull(skylineAlgorithm.getPoints());
		__CLR4_4_1jcjclo0xphkd.R.inc(728);ArrayList<SkylineAlgorithm.Point> arrayList = new ArrayList<>();
		__CLR4_4_1jcjclo0xphkd.R.inc(729);for(int i = 0; (((i < 4)&&(__CLR4_4_1jcjclo0xphkd.R.iget(730)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(731)==0&false));i++) {{
			__CLR4_4_1jcjclo0xphkd.R.inc(732);arrayList.add(new SkylineAlgorithm.Point(i, i+1));
		}
		}__CLR4_4_1jcjclo0xphkd.R.inc(733);ArrayList<SkylineAlgorithm.Point> arrayList1 = new ArrayList<>();
		__CLR4_4_1jcjclo0xphkd.R.inc(734);arrayList1.add(new SkylineAlgorithm.Point(1, 2));
		__CLR4_4_1jcjclo0xphkd.R.inc(735);ArrayList<SkylineAlgorithm.Point> arrayList2 = new ArrayList<>();
		__CLR4_4_1jcjclo0xphkd.R.inc(736);SkylineAlgorithm.Point point = new SkylineAlgorithm.Point(1, 2);
		__CLR4_4_1jcjclo0xphkd.R.inc(737);arrayList2.add(point);
		__CLR4_4_1jcjclo0xphkd.R.inc(738);arrayList2.add(point);
		__CLR4_4_1jcjclo0xphkd.R.inc(739);assertNotNull(skylineAlgorithm.produceSubSkyLines(arrayList));
		__CLR4_4_1jcjclo0xphkd.R.inc(740);assertNotNull(skylineAlgorithm.produceSubSkyLines(arrayList1));
		__CLR4_4_1jcjclo0xphkd.R.inc(741);assertNotNull(skylineAlgorithm.produceSubSkyLines(arrayList2));
		__CLR4_4_1jcjclo0xphkd.R.inc(742);assertNotNull(skylineAlgorithm.produceFinalSkyLine(arrayList, arrayList2));
		__CLR4_4_1jcjclo0xphkd.R.inc(743);ArrayList<SkylineAlgorithm.Point> arrayList3 = new ArrayList<>();
		__CLR4_4_1jcjclo0xphkd.R.inc(744);for (int i = 5; (((i >= 5)&&(__CLR4_4_1jcjclo0xphkd.R.iget(745)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(746)==0&false)); i--) {{
			__CLR4_4_1jcjclo0xphkd.R.inc(747);arrayList3.add(new SkylineAlgorithm.Point(1, i));
		}
		}__CLR4_4_1jcjclo0xphkd.R.inc(748);assertNotNull(skylineAlgorithm.produceFinalSkyLine(arrayList3, arrayList2));
	}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	
	@Test
	public void test5() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqkt(){try{__CLR4_4_1jcjclo0xphkd.R.inc(749);
		__CLR4_4_1jcjclo0xphkd.R.inc(750);StrassenMatrixMultiplication strassenMatrixMultiplication = new StrassenMatrixMultiplication();
		__CLR4_4_1jcjclo0xphkd.R.inc(751);int[][] a = new int[2][3];
		__CLR4_4_1jcjclo0xphkd.R.inc(752);int[][] b = new int[2][3];
		__CLR4_4_1jcjclo0xphkd.R.inc(753);for (int i = 0; (((i < a.length)&&(__CLR4_4_1jcjclo0xphkd.R.iget(754)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(755)==0&false)); i++) {{
			__CLR4_4_1jcjclo0xphkd.R.inc(756);for(int j = 0;(((j < a[i].length)&&(__CLR4_4_1jcjclo0xphkd.R.iget(757)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(758)==0&false));j++) {{
				__CLR4_4_1jcjclo0xphkd.R.inc(759);a[i][j] = i;
				__CLR4_4_1jcjclo0xphkd.R.inc(760);b[i][j] = j;
			}
		}}
		}__CLR4_4_1jcjclo0xphkd.R.inc(761);strassenMatrixMultiplication.add(a, b);
		__CLR4_4_1jcjclo0xphkd.R.inc(762);System.out.println(strassenMatrixMultiplication.multiply(a, b));
	}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	@Test
	public void test6() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d7l7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),763,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d7l7(){try{__CLR4_4_1jcjclo0xphkd.R.inc(763);
		__CLR4_4_1jcjclo0xphkd.R.inc(764);BPlusTree bPlusTree = new BPlusTree<Integer, Integer>();
		__CLR4_4_1jcjclo0xphkd.R.inc(765);for (int i = 0; (((i < 5)&&(__CLR4_4_1jcjclo0xphkd.R.iget(766)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(767)==0&false)); i++) {{
			__CLR4_4_1jcjclo0xphkd.R.inc(768);for (int j = 5; (((j <= 10)&&(__CLR4_4_1jcjclo0xphkd.R.iget(769)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(770)==0&false)); j++) {{
				__CLR4_4_1jcjclo0xphkd.R.inc(771);bPlusTree.insert(i,j);
			}
			
		}}
		}__CLR4_4_1jcjclo0xphkd.R.inc(772);assertNotNull(bPlusTree.searchRange(1, BPlusTree.RangePolicy.INCLUSIVE, 2, BPlusTree.RangePolicy.INCLUSIVE));
		__CLR4_4_1jcjclo0xphkd.R.inc(773);;
		__CLR4_4_1jcjclo0xphkd.R.inc(774);assertNull(bPlusTree.search(-1));
		__CLR4_4_1jcjclo0xphkd.R.inc(775);bPlusTree.delete(-1);
		__CLR4_4_1jcjclo0xphkd.R.inc(776);BPlusTree bPlusTree1 = new BPlusTree<Integer, Integer>(3);
		__CLR4_4_1jcjclo0xphkd.R.inc(777);for (int i = 0; (((i < 5)&&(__CLR4_4_1jcjclo0xphkd.R.iget(778)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(779)==0&false)); i++) {{
			__CLR4_4_1jcjclo0xphkd.R.inc(780);for (int j = 5; (((j <= 10)&&(__CLR4_4_1jcjclo0xphkd.R.iget(781)!=0|true))||(__CLR4_4_1jcjclo0xphkd.R.iget(782)==0&false)); j++) {{
				__CLR4_4_1jcjclo0xphkd.R.inc(783);bPlusTree1.insert(i,j);
			}
			
		}}
	}}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	@Test
	public void test7() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw645ols();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw645ols(){try{__CLR4_4_1jcjclo0xphkd.R.inc(784);
		// TODO \u9477\ue044\u59e9\u9422\u71b8\u579a\u9428\u52ec\u67df\u5a09\u66de\u74e8\u93cd\ufffd
		__CLR4_4_1jcjclo0xphkd.R.inc(785);BinaryExponentiation.calculatePower(2, 4);
		__CLR4_4_1jcjclo0xphkd.R.inc(786);String[] args = new String[4];
		__CLR4_4_1jcjclo0xphkd.R.inc(787);ClosestPair.main(args);
		__CLR4_4_1jcjclo0xphkd.R.inc(788);ClosestPair closestPair = new ClosestPair(1);
		
		__CLR4_4_1jcjclo0xphkd.R.inc(789);assertNotNull(closestPair.createLocation(123));

	}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}
	@Test
	public void test8() {__CLR4_4_1jcjclo0xphkd.R.globalSliceStart(getClass().getName(),790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r562y5ly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1jcjclo0xphkd.R.rethrow($CLV_t2$);}finally{__CLR4_4_1jcjclo0xphkd.R.globalSliceEnd(getClass().getName(),"net.mooctest.BPlusTreeTest.test8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r562y5ly(){try{__CLR4_4_1jcjclo0xphkd.R.inc(790);
		__CLR4_4_1jcjclo0xphkd.R.inc(791);SkylineAlgorithm skylineAlgorithm = new SkylineAlgorithm();
		__CLR4_4_1jcjclo0xphkd.R.inc(792);ArrayList<SkylineAlgorithm.Point> arrayList2 = new ArrayList<>();
		__CLR4_4_1jcjclo0xphkd.R.inc(793);arrayList2.add(new SkylineAlgorithm.Point(2,1));
		__CLR4_4_1jcjclo0xphkd.R.inc(794);arrayList2.add(new SkylineAlgorithm.Point(1,1));
		__CLR4_4_1jcjclo0xphkd.R.inc(795);skylineAlgorithm.produceSubSkyLines(arrayList2);
		__CLR4_4_1jcjclo0xphkd.R.inc(796);SkylineAlgorithm.Point point = new SkylineAlgorithm.Point(1,0);
		__CLR4_4_1jcjclo0xphkd.R.inc(797);SkylineAlgorithm.Point point1 = new SkylineAlgorithm.Point(2,2);
		__CLR4_4_1jcjclo0xphkd.R.inc(798);SkylineAlgorithm.Point point2 = new SkylineAlgorithm.Point(1,2);
		__CLR4_4_1jcjclo0xphkd.R.inc(799);SkylineAlgorithm.Point point3 = new SkylineAlgorithm.Point(1,2);
		
		__CLR4_4_1jcjclo0xphkd.R.inc(800);assertTrue(point.dominates(point1));
		__CLR4_4_1jcjclo0xphkd.R.inc(801);assertTrue(point2.dominates(point1));
		__CLR4_4_1jcjclo0xphkd.R.inc(802);assertEquals(1, point.getX());
		__CLR4_4_1jcjclo0xphkd.R.inc(803);assertEquals(0, point.getY());

		__CLR4_4_1jcjclo0xphkd.R.inc(804);Comparator<SkylineAlgorithm.Point> comparator = skylineAlgorithm.new XComparator();
		
		__CLR4_4_1jcjclo0xphkd.R.inc(805);assertEquals(-1, comparator.compare(point, point1));
	}finally{__CLR4_4_1jcjclo0xphkd.R.flushNeeded();}}

}
