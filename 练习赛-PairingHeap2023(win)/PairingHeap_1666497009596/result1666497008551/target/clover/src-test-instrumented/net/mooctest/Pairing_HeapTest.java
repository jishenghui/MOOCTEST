/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

//author:TheOnlyman
public class Pairing_HeapTest {static class __CLR4_4_1d1d1l9ktacfz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0030\u0032\u0031\u005c\u005c\u0031\u0032\u0032\u0039\u0037\u0033\u005c\u005c\u0050\u0061\u0069\u0072\u0069\u006e\u0067\u0048\u0065\u0061\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666497002053L,8589935092L,542,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test(timeout=10000)
	public void test2() {__CLR4_4_1d1d1l9ktacfz.R.globalSliceStart(getClass().getName(),469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d1d1l9ktacfz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d1d1l9ktacfz.R.globalSliceEnd(getClass().getName(),"net.mooctest.Pairing_HeapTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),469,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bd1(){try{__CLR4_4_1d1d1l9ktacfz.R.inc(469);
		__CLR4_4_1d1d1l9ktacfz.R.inc(470);Pairing_Heap<String> apple = new Pairing_Heap<>();
		__CLR4_4_1d1d1l9ktacfz.R.inc(471);for(int i=1;(((i<=100)&&(__CLR4_4_1d1d1l9ktacfz.R.iget(472)!=0|true))||(__CLR4_4_1d1d1l9ktacfz.R.iget(473)==0&false));++i) {{
			__CLR4_4_1d1d1l9ktacfz.R.inc(474);Heap_Item<String> banana = new Heap_Item<String>(",");
			__CLR4_4_1d1d1l9ktacfz.R.inc(475);Heap_Item<String> cat = new Heap_Item<String>(".");
			__CLR4_4_1d1d1l9ktacfz.R.inc(476);Heap_Item<String> dog = new Heap_Item<String>("x");
			__CLR4_4_1d1d1l9ktacfz.R.inc(477);try{
				__CLR4_4_1d1d1l9ktacfz.R.inc(478);cat.setAncestor(banana);
				__CLR4_4_1d1d1l9ktacfz.R.inc(479);banana.getData();
				__CLR4_4_1d1d1l9ktacfz.R.inc(480);if((((cat.hasLeftSon())&&(__CLR4_4_1d1d1l9ktacfz.R.iget(481)!=0|true))||(__CLR4_4_1d1d1l9ktacfz.R.iget(482)==0&false))) {{}}__CLR4_4_1d1d1l9ktacfz.R.inc(483);;
				__CLR4_4_1d1d1l9ktacfz.R.inc(484);if((((cat.hasRightSon())&&(__CLR4_4_1d1d1l9ktacfz.R.iget(485)!=0|true))||(__CLR4_4_1d1d1l9ktacfz.R.iget(486)==0&false))) {{}}__CLR4_4_1d1d1l9ktacfz.R.inc(487);;
				__CLR4_4_1d1d1l9ktacfz.R.inc(488);banana.getLeftSon();
				__CLR4_4_1d1d1l9ktacfz.R.inc(489);banana.getRightSon();
				__CLR4_4_1d1d1l9ktacfz.R.inc(490);dog.setAncestor(banana);
				__CLR4_4_1d1d1l9ktacfz.R.inc(491);banana.setLeftSon(dog);
				__CLR4_4_1d1d1l9ktacfz.R.inc(492);banana.setRightSon(cat);
			}catch(Exception e) {

			}
			__CLR4_4_1d1d1l9ktacfz.R.inc(493);try{
				__CLR4_4_1d1d1l9ktacfz.R.inc(494);apple.pop();
				__CLR4_4_1d1d1l9ktacfz.R.inc(495);apple.equals(dog);
			}catch(Exception e) {

			}
			__CLR4_4_1d1d1l9ktacfz.R.inc(496);try{
				__CLR4_4_1d1d1l9ktacfz.R.inc(497);apple.push(banana);
				__CLR4_4_1d1d1l9ktacfz.R.inc(498);apple.push(cat);
				__CLR4_4_1d1d1l9ktacfz.R.inc(499);apple.getRoot();
			}catch(Exception e) {

			}
		}
	}}finally{__CLR4_4_1d1d1l9ktacfz.R.flushNeeded();}}
	@Test(timeout=10000)
	public void test3() {__CLR4_4_1d1d1l9ktacfz.R.globalSliceStart(getClass().getName(),500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d1d1l9ktacfz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d1d1l9ktacfz.R.globalSliceEnd(getClass().getName(),"net.mooctest.Pairing_HeapTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsdw(){try{__CLR4_4_1d1d1l9ktacfz.R.inc(500);
		__CLR4_4_1d1d1l9ktacfz.R.inc(501);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_1d1d1l9ktacfz.R.inc(502);Heap_Item<Integer> banana = new Heap_Item<>(apple);
		__CLR4_4_1d1d1l9ktacfz.R.inc(503);assertNull(banana.getMultiWayAncestor());

		__CLR4_4_1d1d1l9ktacfz.R.inc(504);Heap_Item<Integer> cat = new Heap_Item<>(11);
		__CLR4_4_1d1d1l9ktacfz.R.inc(505);Heap_Item<Integer> dog = new Heap_Item<>(12);
		__CLR4_4_1d1d1l9ktacfz.R.inc(506);dog.setLeftSon(cat);
		__CLR4_4_1d1d1l9ktacfz.R.inc(507);cat.setAncestor(dog);
		__CLR4_4_1d1d1l9ktacfz.R.inc(508);cat.setRightSon(apple);
		__CLR4_4_1d1d1l9ktacfz.R.inc(509);apple.setAncestor(cat);
		__CLR4_4_1d1d1l9ktacfz.R.inc(510);banana.setAncestor(apple);
		__CLR4_4_1d1d1l9ktacfz.R.inc(511);apple.setRightSon(banana);
		__CLR4_4_1d1d1l9ktacfz.R.inc(512);assertSame(banana.getMultiWayAncestor(), dog);

		__CLR4_4_1d1d1l9ktacfz.R.inc(513);Heap_Item<Integer> son = new Heap_Item<>();
		__CLR4_4_1d1d1l9ktacfz.R.inc(514);Heap_Item<Integer> fa = new Heap_Item<>();
		__CLR4_4_1d1d1l9ktacfz.R.inc(515);fa.setLeftSon(son);
		__CLR4_4_1d1d1l9ktacfz.R.inc(516);son.setAncestor(fa);
		__CLR4_4_1d1d1l9ktacfz.R.inc(517);assertEquals(son.getMultiWayAncestor(), fa);
	}finally{__CLR4_4_1d1d1l9ktacfz.R.flushNeeded();}}
	@Test(timeout=10000)
	public void test4() {__CLR4_4_1d1d1l9ktacfz.R.globalSliceStart(getClass().getName(),518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d1d1l9ktacfz.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d1d1l9ktacfz.R.globalSliceEnd(getClass().getName(),"net.mooctest.Pairing_HeapTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9ee(){try{__CLR4_4_1d1d1l9ktacfz.R.inc(518);
		__CLR4_4_1d1d1l9ktacfz.R.inc(519);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_1d1d1l9ktacfz.R.inc(520);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_1d1d1l9ktacfz.R.inc(521);Pairing_Heap<Integer> pairing_heap = new Pairing_Heap<>();
		__CLR4_4_1d1d1l9ktacfz.R.inc(522);pairing_heap.checkPriority(apple);
		__CLR4_4_1d1d1l9ktacfz.R.inc(523);pairing_heap.push(apple);
		__CLR4_4_1d1d1l9ktacfz.R.inc(524);pairing_heap.push(banana);
		__CLR4_4_1d1d1l9ktacfz.R.inc(525);pairing_heap.checkPriority(apple);

		__CLR4_4_1d1d1l9ktacfz.R.inc(526);banana.setData(5);
		__CLR4_4_1d1d1l9ktacfz.R.inc(527);Heap_Item<Integer> cat = new Heap_Item<>(100);
		__CLR4_4_1d1d1l9ktacfz.R.inc(528);cat.setRightSon(new Heap_Item<>(1));
		__CLR4_4_1d1d1l9ktacfz.R.inc(529);apple.setLeftSon(cat);
		__CLR4_4_1d1d1l9ktacfz.R.inc(530);apple.setRightSon(new Heap_Item<>(1));
		__CLR4_4_1d1d1l9ktacfz.R.inc(531);Heap_Item<Integer> egg = new Heap_Item<>(7);
		__CLR4_4_1d1d1l9ktacfz.R.inc(532);egg.setRightSon(new Heap_Item<>(8));
		__CLR4_4_1d1d1l9ktacfz.R.inc(533);banana.setRightSon(egg);
		__CLR4_4_1d1d1l9ktacfz.R.inc(534);Heap_Item<Integer> fish = new Heap_Item<>(3);
		__CLR4_4_1d1d1l9ktacfz.R.inc(535);Heap_Item<Integer> girl = new Heap_Item<>(3);
		__CLR4_4_1d1d1l9ktacfz.R.inc(536);fish.setAncestor(girl);
		__CLR4_4_1d1d1l9ktacfz.R.inc(537);fish.setRightSon(new Heap_Item<>(2));
		__CLR4_4_1d1d1l9ktacfz.R.inc(538);girl.setLeftSon(fish);
		__CLR4_4_1d1d1l9ktacfz.R.inc(539);fish.setRightSon(new Heap_Item<>(4));
		__CLR4_4_1d1d1l9ktacfz.R.inc(540);apple.setAncestor(fish);
		__CLR4_4_1d1d1l9ktacfz.R.inc(541);pairing_heap.checkPriority(apple);

	}finally{__CLR4_4_1d1d1l9ktacfz.R.flushNeeded();}}


}
