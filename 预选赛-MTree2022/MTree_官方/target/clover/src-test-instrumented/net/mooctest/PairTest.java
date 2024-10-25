/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */
package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class PairTest {static class __CLR4_4_1j7j7kv4p5gna{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047644256L,8589935092L,964,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(timeout = 4000)
  public void test()  throws Throwable  {__CLR4_4_1j7j7kv4p5gna.R.globalSliceStart(getClass().getName(),691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3j7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7j7kv4p5gna.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7j7kv4p5gna.R.globalSliceEnd(getClass().getName(),"net.mooctest.PairTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),691,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3j7() throws Throwable{try{__CLR4_4_1j7j7kv4p5gna.R.inc(691);
      __CLR4_4_1j7j7kv4p5gna.R.inc(692);Pair<Object> pair = new Pair<Object>();
      __CLR4_4_1j7j7kv4p5gna.R.inc(693);pair.second = (Object) "mooctest";
      __CLR4_4_1j7j7kv4p5gna.R.inc(694);Object object = pair.get(1);
      __CLR4_4_1j7j7kv4p5gna.R.inc(695);assertEquals("mooctest", object);
      __CLR4_4_1j7j7kv4p5gna.R.inc(696);try {
    	  __CLR4_4_1j7j7kv4p5gna.R.inc(697);pair.get(-1);
      }catch (Exception e) {
    	  __CLR4_4_1j7j7kv4p5gna.R.inc(698);System.out.println(e.getMessage());
      }
  }finally{__CLR4_4_1j7j7kv4p5gna.R.flushNeeded();}}
  @Test(timeout = 4000)
  public void test1() throws Throwable {__CLR4_4_1j7j7kv4p5gna.R.globalSliceStart(getClass().getName(),699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beujf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7j7kv4p5gna.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7j7kv4p5gna.R.globalSliceEnd(getClass().getName(),"net.mooctest.PairTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beujf() throws Throwable{try{__CLR4_4_1j7j7kv4p5gna.R.inc(699);
	  // test basic functions
	  __CLR4_4_1j7j7kv4p5gna.R.inc(700);PromotionFunctions.RandomPromotion<List<Double>> promotionF = new PromotionFunctions.RandomPromotion<List<Double>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(701);PartitionFunctions.BalancedPartition<List<Double>> partitionF = new PartitionFunctions.BalancedPartition<List<Double>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(702);ComposedSplitFunction<List<Double>> csFunc = new ComposedSplitFunction<List<Double>>(promotionF, partitionF);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(703);MTree<List<Double>> mt = new MTree<List<Double>>(DistanceFunctions.EUCLIDEAN_DOUBLE_LIST, csFunc);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(704);List<Double> vec1 = Arrays.asList(new Double[] {1.0, 2.0, 3.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(705);List<Double> vec2 = Arrays.asList(new Double[] {0.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(706);mt.add(vec1);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(707);assertEquals(vec1, mt.getNearest(vec2).iterator().next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(708);mt.add(vec2);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(709);List<Double> q = Arrays.asList(new Double[] {1.0, 2.0, 2.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(710);assertEquals(vec1, mt.getNearest(q).iterator().next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(711);assertEquals(vec2, mt.getNearest(vec2).iterator().next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(712);mt.remove(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(713);mt.remove(vec2);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(714);vec1 = Arrays.asList(new Double[] {1.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(715);vec2 = Arrays.asList(new Double[] {2.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(716);List<Double> vec3 = Arrays.asList(new Double[] {3.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(717);List<Double> vec4 = Arrays.asList(new Double[] {4.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(718);List<Double> vec5 = Arrays.asList(new Double[] {5.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(719);List<Double> qu = Arrays.asList(new Double[] {3.5, 0.0, 0.0});
	  
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(720);mt.add(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(721);mt.add(vec2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(722);mt.add(vec3);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(723);mt.add(vec4);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(724);mt.add(vec5);

	  __CLR4_4_1j7j7kv4p5gna.R.inc(725);assertEquals(vec3, mt.getNearest(qu).iterator().next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(726);MTree<List<Double>>.Query query = mt.getNearestByLimit(qu, 5);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(727);Iterator<MTree<List<Double>>.ResultItem> queryIt = query.iterator();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(728);assertEquals(vec3, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(729);assertEquals(vec4, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(730);assertEquals(vec2, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(731);assertEquals(vec5, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(732);assertEquals(vec1, queryIt.next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(733);query = mt.getNearestByRange(qu, 10);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(734);queryIt = query.iterator();
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(735);assertEquals(vec3, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(736);assertEquals(vec4, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(737);assertEquals(vec2, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(738);assertEquals(vec5, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(739);assertEquals(vec1, queryIt.next().data);
	  
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(740);query = mt.getNearestByRange(qu, 2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(741);queryIt = query.iterator();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(742);assertEquals(vec3, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(743);assertEquals(vec4, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(744);assertEquals(vec2, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(745);assertEquals(vec5, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(746);assertFalse(queryIt.hasNext());
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(747);query = mt.getNearest(qu, 2, 3);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(748);queryIt = query.iterator();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(749);assertEquals(vec3, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(750);assertEquals(vec4, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(751);assertEquals(vec2, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(752);assertFalse(queryIt.hasNext());
	  __CLR4_4_1j7j7kv4p5gna.R.inc(753);mt._check();
	  
  }finally{__CLR4_4_1j7j7kv4p5gna.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test2() throws Throwable {__CLR4_4_1j7j7kv4p5gna.R.globalSliceStart(getClass().getName(),754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7j7kv4p5gna.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7j7kv4p5gna.R.globalSliceEnd(getClass().getName(),"net.mooctest.PairTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),754,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bky() throws Throwable{try{__CLR4_4_1j7j7kv4p5gna.R.inc(754);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(755);PromotionFunctions.RandomPromotion<List<Integer>> promotionF = new PromotionFunctions.RandomPromotion<List<Integer>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(756);PartitionFunctions.BalancedPartition<List<Integer>> partitionF = new PartitionFunctions.BalancedPartition<List<Integer>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(757);ComposedSplitFunction<List<Integer>> csFunc = new ComposedSplitFunction<List<Integer>>(promotionF, partitionF);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(758);MTree<List<Integer>> mt = new MTree<List<Integer>>(2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  

	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(759);List<Integer> vec1 = Arrays.asList(new Integer[] {0, 0, 1});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(760);List<Integer> vec2 = Arrays.asList(new Integer[] {0, 0, 2});
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(761);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(762);mt.remove(vec1);
	  }catch (Exception e){
		  __CLR4_4_1j7j7kv4p5gna.R.inc(763);System.out.println(e.getMessage());
	  }

	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(764);mt.add(vec2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(765);mt.remove(vec1);

	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(766);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(767);MTree<List<Integer>> mt2 = new MTree<List<Integer>>(3,2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(768);System.out.println(e.getMessage());
	  }
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(769);csFunc = null;
	  
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(770);MTree<List<Integer>> mt2 = new MTree<List<Integer>>(3,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);

	  __CLR4_4_1j7j7kv4p5gna.R.inc(771);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(772);mt2 = new MTree<List<Integer>>(1,2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(773);System.out.println(e.getMessage());
	  }
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(774);DistanceFunction<List<Integer>> dsfunc = null;
	  __CLR4_4_1j7j7kv4p5gna.R.inc(775);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(776);mt2 = new MTree<List<Integer>>(3,dsfunc, csFunc);
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(777);System.out.println(e.getMessage());
	  }
  }finally{__CLR4_4_1j7j7kv4p5gna.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {__CLR4_4_1j7j7kv4p5gna.R.globalSliceStart(getClass().getName(),778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zslm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7j7kv4p5gna.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7j7kv4p5gna.R.globalSliceEnd(getClass().getName(),"net.mooctest.PairTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zslm() throws Throwable{try{__CLR4_4_1j7j7kv4p5gna.R.inc(778);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(779);PromotionFunctions.RandomPromotion<List<Double>> promotionF = new PromotionFunctions.RandomPromotion<List<Double>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(780);PartitionFunctions.BalancedPartition<List<Double>> partitionF = new PartitionFunctions.BalancedPartition<List<Double>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(781);ComposedSplitFunction<List<Double>> csFunc = new ComposedSplitFunction<List<Double>>(promotionF, partitionF);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(782);MTree<List<Double>> mt = new MTree<List<Double>>(2, 3, DistanceFunctions.EUCLIDEAN_DOUBLE_LIST, csFunc);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(783);mt._check();
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(784);List<Double> collec = Arrays.asList(new Double[] {1.461340, 2.4604622, 3.66871, 4.4641, 5.064861, 6.6881});
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(785);List<Double> queryVec = Utils.randomSample(collec, 3);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(786);collec = new ArrayList<Double>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(787);queryVec = Utils.randomSample(collec, 1);
	  	
	  __CLR4_4_1j7j7kv4p5gna.R.inc(788);queryVec = Arrays.asList(new Double[] {1.461340, 2.4604622, 3.66871});
	  
	  
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(789);List<Double> vec1 = Arrays.asList(new Double[] {1.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(790);List<Double> vec2 = Arrays.asList(new Double[] {2.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(791);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(792);assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  }catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(793);System.out.println(e.getMessage());
	  }
	  __CLR4_4_1j7j7kv4p5gna.R.inc(794);List<Double> vec3 = Arrays.asList(new Double[] {3.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(795);List<Double> vec4 = Arrays.asList(new Double[] {4.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(796);List<Double> vec5 = Arrays.asList(new Double[] {5.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(797);List<Double> vec6 = Arrays.asList(new Double[] {6.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(798);List<Double> vec7 = Arrays.asList(new Double[] {7.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(799);List<Double> vec8 = Arrays.asList(new Double[] {8.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(800);List<Double> vec9 = Arrays.asList(new Double[] {9.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(801);List<Double> vec901 = Arrays.asList(new Double[] {9.01, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(802);List<Double> vec902 = Arrays.asList(new Double[] {9.02, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(803);List<Double> vec903 = Arrays.asList(new Double[] {9.03, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(804);List<Double> vec904 = Arrays.asList(new Double[] {9.04, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(805);List<Double> vec905 = Arrays.asList(new Double[] {9.05, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(806);List<Double> vec906 = Arrays.asList(new Double[] {9.06, 0.0, 0.0});
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(807);mt.add(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(808);mt.add(vec2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(809);mt.add(vec3);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(810);mt.add(vec4);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(811);mt.add(vec5);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(812);mt.add(vec6);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(813);mt.add(vec7);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(814);mt.add(vec8);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(815);mt.add(vec9);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(816);mt.add(vec901);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(817);mt.add(vec902);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(818);mt.add(vec903);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(819);mt.add(vec904);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(820);mt.add(vec905);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(821);mt.add(vec906);

	  __CLR4_4_1j7j7kv4p5gna.R.inc(822);mt._check();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(823);queryVec = Arrays.asList(new Double[] {1.461340, 2.4604622, 3.66871});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(824);assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(825);queryVec = Arrays.asList(new Double[] {9.461340, 2.4604622, 9.66871});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(826);assertEquals(vec906, mt.getNearest(queryVec).iterator().next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(827);queryVec = Arrays.asList(new Double[] {7.461340, 2.4604622, 9.66871});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(828);assertEquals(vec7, mt.getNearest(queryVec).iterator().next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(829);List<Double> vecS = Arrays.asList(new Double[] {9.07, 10.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(830);List<Double> vecX = Arrays.asList(new Double[] {9.07, 0.0, 0.0, 10.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(831);mt.add(vecX);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(832);mt.add(vecS);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(833);assertEquals(vecS, mt.getNearest(queryVec).iterator().next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(834);assertEquals(vecS, mt.getNearest(vecS).iterator().next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(835);queryVec = Arrays.asList(new Double[] {7.461340});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(836);assertEquals(vecS, mt.getNearest(vecS).iterator().next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(837);mt.remove(vecX);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(838);mt.remove(vecS);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(839);List<Double> vecN = Arrays.asList(new Double[] {-9.07, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(840);mt.add(vecN);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(841);queryVec = Arrays.asList(new Double[] {7.461340, 2.4604622, 9.66871, 9.07, 134.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(842);MTree<List<Double>>.Query query = mt.getNearestByLimit(queryVec, 5);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(843);Iterator<MTree<List<Double>>.ResultItem> queryIt = query.iterator();
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(844);assertEquals(vec7, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(845);assertEquals(vec8, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(846);assertEquals(vec6, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(847);assertEquals(vec9, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(848);assertEquals(vec901, queryIt.next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(849);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(850);assertEquals(null, queryIt.next().data);
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(851);System.out.println(e.getMessage());
	  }
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(852);mt.remove(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(853);mt.remove(vec2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(854);mt.remove(vec3);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(855);mt.remove(vec4);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(856);mt.remove(vec5);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(857);mt.remove(vec6);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(858);mt.remove(vec7);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(859);mt.remove(vec8);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(860);mt.remove(vec9);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(861);mt.remove(vec901);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(862);mt.remove(vec902);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(863);mt.remove(vec903);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(864);mt.remove(vec904);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(865);mt.remove(vec905);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(866);mt.remove(vec906);
  }finally{__CLR4_4_1j7j7kv4p5gna.R.flushNeeded();}}
  
  
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {__CLR4_4_1j7j7kv4p5gna.R.globalSliceStart(getClass().getName(),867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9o3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7j7kv4p5gna.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7j7kv4p5gna.R.globalSliceEnd(getClass().getName(),"net.mooctest.PairTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9o3() throws Throwable{try{__CLR4_4_1j7j7kv4p5gna.R.inc(867);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(868);PromotionFunctions.RandomPromotion<List<Double>> promotionF = new PromotionFunctions.RandomPromotion<List<Double>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(869);PartitionFunctions.BalancedPartition<List<Double>> partitionF = new PartitionFunctions.BalancedPartition<List<Double>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(870);ComposedSplitFunction<List<Double>> csFunc = new ComposedSplitFunction<List<Double>>(promotionF, partitionF);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(871);MTree<List<Double>> mt = new MTree<List<Double>>(2, 3, DistanceFunctions.EUCLIDEAN_DOUBLE_LIST, csFunc);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(872);List<Double> vec1 = Arrays.asList(new Double[] {1.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(873);List<Double> vec2 = Arrays.asList(new Double[] {2.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(874);List<Double> vec3 = Arrays.asList(new Double[] {-3.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(875);List<Double> vec4 = Arrays.asList(new Double[] {4.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(876);List<Double> vec5 = Arrays.asList(new Double[] {5.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(877);List<Double> vec6 = Arrays.asList(new Double[] {-6.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(878);List<Double> vec7 = Arrays.asList(new Double[] {7.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(879);List<Double> vec8 = Arrays.asList(new Double[] {-8.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(880);List<Double> vec9 = Arrays.asList(new Double[] {9.0, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(881);List<Double> vec901 = Arrays.asList(new Double[] {-9.01, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(882);List<Double> vec902 = Arrays.asList(new Double[] {9.02, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(883);List<Double> vec903 = Arrays.asList(new Double[] {-9.03, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(884);List<Double> vec904 = Arrays.asList(new Double[] {9.04, 0.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(885);List<Double> vec09 = Arrays.asList(new Double[] {0.0, 9.0, 0.0});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(886);List<Double> vec92 = Arrays.asList(new Double[] {9.0, 0.0});
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(887);mt.add(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(888);mt.add(vec2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(889);mt.add(vec3);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(890);mt.add(vec4);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(891);mt.add(vec5);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(892);mt.add(vec6);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(893);mt.add(vec7);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(894);mt.add(vec8);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(895);mt.add(vec9);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(896);mt.add(vec901);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(897);mt.add(vec902);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(898);mt.add(vec903);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(899);mt.add(vec904);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(900);mt.add(vec09);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(901);mt.add(vec92);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(902);List<Double> queryVec = Arrays.asList(new Double[] {6.461340, 2.4604622, 3.66871, 5.2354, 7.3689});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(903);double minV = Utils.minMax(queryVec).first.doubleValue();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(904);double maxV = Utils.minMax(queryVec).second.doubleValue();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(905);assertEquals(2.4604622, minV, 0.00000001);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(906);assertEquals(7.3689, maxV, 0.00000001);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(907);queryVec = null;
	  __CLR4_4_1j7j7kv4p5gna.R.inc(908);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(909);minV = Utils.minMax(queryVec).first.doubleValue();
	  }catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(910);System.out.println(e.getMessage());
	  }
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(911);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(912);List<Double> ls = mt.getNearest(queryVec).iterator().next().data;
	  }catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(913);System.out.println(e.getMessage());
	  }

	  __CLR4_4_1j7j7kv4p5gna.R.inc(914);mt.remove(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(915);mt.remove(vec2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(916);mt.remove(vec3);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(917);mt.remove(vec4);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(918);mt.remove(vec5);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(919);mt.remove(vec6);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(920);mt.remove(vec7);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(921);mt.remove(vec8);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(922);mt.remove(vec9);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(923);mt.remove(vec901);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(924);mt.remove(vec902);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(925);mt.remove(vec903);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(926);mt.remove(vec904);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(927);mt.remove(vec92);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(928);mt.remove(vec09);
  }finally{__CLR4_4_1j7j7kv4p5gna.R.flushNeeded();}}
  
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {__CLR4_4_1j7j7kv4p5gna.R.globalSliceStart(getClass().getName(),929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1j7j7kv4p5gna.R.rethrow($CLV_t2$);}finally{__CLR4_4_1j7j7kv4p5gna.R.globalSliceEnd(getClass().getName(),"net.mooctest.PairTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),929,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqpt() throws Throwable{try{__CLR4_4_1j7j7kv4p5gna.R.inc(929);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(930);PromotionFunctions.RandomPromotion<List<Integer>> promotionF = new PromotionFunctions.RandomPromotion<List<Integer>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(931);PartitionFunctions.BalancedPartition<List<Integer>> partitionF = new PartitionFunctions.BalancedPartition<List<Integer>>();
	  __CLR4_4_1j7j7kv4p5gna.R.inc(932);ComposedSplitFunction<List<Integer>> csFunc = new ComposedSplitFunction<List<Integer>>(promotionF, partitionF);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(933);MTree<List<Integer>> mt = new MTree<List<Integer>>(2,DistanceFunctions.EUCLIDEAN_INTEGER_LIST, csFunc);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(934);List<Integer> queryVec = Arrays.asList(new Integer[] {1, 2, 3});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(935);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(936);List<Integer> tmp = mt.getNearest(queryVec).iterator().next().data;
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(937);System.out.println(e.getMessage());
	  }
	  __CLR4_4_1j7j7kv4p5gna.R.inc(938);List<Integer> vec1 = Arrays.asList(new Integer[] {1,2,3});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(939);List<Integer> vec2 = Arrays.asList(new Integer[] {1,0,3});
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(940);mt.add(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(941);assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(942);mt.add(vec2);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(943);assertEquals(vec1, mt.getNearest(queryVec).iterator().next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(944);mt.remove(vec1);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(945);assertEquals(vec2, mt.getNearest(queryVec).iterator().next().data);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(946);mt.add(vec1);
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(947);vec1 = null;
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(948);assertEquals(Arrays.asList(new Integer[] {1,2,3}), mt.getNearest(queryVec).iterator().next().data);
	  __CLR4_4_1j7j7kv4p5gna.R.inc(949);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(950);mt.add(vec1);
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(951);System.out.println(e.getMessage());
	  }
	  __CLR4_4_1j7j7kv4p5gna.R.inc(952);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(953);queryVec = null;
		  __CLR4_4_1j7j7kv4p5gna.R.inc(954);assertEquals(Arrays.asList(new Integer[] {1,2,3}), mt.getNearest(queryVec).iterator().next().data);
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(955);System.out.println(e.getMessage());
	  }
	  
	  __CLR4_4_1j7j7kv4p5gna.R.inc(956);List<Double> queryVec2 = Arrays.asList(new Double[] {});
	  __CLR4_4_1j7j7kv4p5gna.R.inc(957);try {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(958);Double minV = Utils.minMax(queryVec2).first;
		  __CLR4_4_1j7j7kv4p5gna.R.inc(959);Double maxV = Utils.minMax(queryVec2).second;
		  __CLR4_4_1j7j7kv4p5gna.R.inc(960);Double res = null;
		  __CLR4_4_1j7j7kv4p5gna.R.inc(961);assertEquals(res, minV);
		  __CLR4_4_1j7j7kv4p5gna.R.inc(962);assertEquals(res, maxV);
	  }
	  catch (Exception e) {
		  __CLR4_4_1j7j7kv4p5gna.R.inc(963);System.out.println(e.getMessage());  
	  }
  }finally{__CLR4_4_1j7j7kv4p5gna.R.flushNeeded();}}
}
