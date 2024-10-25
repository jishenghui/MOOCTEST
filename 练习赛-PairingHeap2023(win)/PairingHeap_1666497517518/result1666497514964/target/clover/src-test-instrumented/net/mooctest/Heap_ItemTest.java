/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Heap_ItemTest {static class __CLR4_4_16f6fl9ktl9b6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0030\u0032\u0031\u005c\u005c\u0031\u0031\u0033\u0037\u0033\u0032\u005c\u005c\u0050\u0061\u0069\u0072\u0069\u006e\u0067\u0048\u0065\u0061\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666497511252L,8589935092L,329,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	Heap_Item<String> heap_Item = new Heap_Item<>();
	Heap_Item<String> heap_Item0 = new Heap_Item<String>("a");
	Heap_Item<String> heap_Item1 = new Heap_Item<String>("b");
	Heap_Item<String> heap_Item2 = new Heap_Item<>(heap_Item1);
	Heap_Item<String> heap_Item3 = new Heap_Item<String>("c");
	Heap_Item<String> heap_Item4 = new Heap_Item<String>("1");
	Heap_Item<String> heap_Item5 = new Heap_Item<String>("2");
	Heap_Item<String> heap_Item6 = new Heap_Item<String>("3");
	Heap_Item<String> heap_Item7 = new Heap_Item<String>("4");
	Heap_Item<String> heap_Item8 = new Heap_Item<String>("8");
	Heap_Item<String> heap_Item9 = new Heap_Item<String>("7");
	Heap_Item<String> heap_Item10 = new Heap_Item<String>("6");
	Heap_Item<String> heap_Item11 = new Heap_Item<String>("5");
	Heap_Item<String> heap_Item12 = new Heap_Item<String>("12");
	Heap_Item<String> heap_Item13 = new Heap_Item<String>("13");
	Heap_Item<String> heap_Item14 = new Heap_Item<String>("14");

	@Test
	public void Heap_Item_test() {__CLR4_4_16f6fl9ktl9b6.R.globalSliceStart(getClass().getName(),231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1w1odxu6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktl9b6.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktl9b6.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.Heap_Item_test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1w1odxu6f(){try{__CLR4_4_16f6fl9ktl9b6.R.inc(231);
		  __CLR4_4_16f6fl9ktl9b6.R.inc(232);heap_Item1.setAncestor(heap_Item0);
		  __CLR4_4_16f6fl9ktl9b6.R.inc(233);heap_Item.getMultiWayAncestor();
		  __CLR4_4_16f6fl9ktl9b6.R.inc(234);heap_Item2.getMultiWayAncestor();
	      __CLR4_4_16f6fl9ktl9b6.R.inc(235);heap_Item1.setLeftSon(heap_Item0);
	      __CLR4_4_16f6fl9ktl9b6.R.inc(236);heap_Item0.setLeftSon(heap_Item1);
		  __CLR4_4_16f6fl9ktl9b6.R.inc(237);heap_Item1.getMultiWayAncestor();
		  __CLR4_4_16f6fl9ktl9b6.R.inc(238);heap_Item0.removeLeftSon();
		  __CLR4_4_16f6fl9ktl9b6.R.inc(239);heap_Item0.removeRightSon();
		  __CLR4_4_16f6fl9ktl9b6.R.inc(240);heap_Item1.removeLeftSon();
		  __CLR4_4_16f6fl9ktl9b6.R.inc(241);heap_Item0.setAncestor(heap_Item);
		  __CLR4_4_16f6fl9ktl9b6.R.inc(242);heap_Item.setAncestor(heap_Item2);
		  __CLR4_4_16f6fl9ktl9b6.R.inc(243);heap_Item2.setLeftSon(heap_Item);
		  __CLR4_4_16f6fl9ktl9b6.R.inc(244);heap_Item1.setLeftSon(heap_Item1);
		  __CLR4_4_16f6fl9ktl9b6.R.inc(245);heap_Item1.getMultiWayAncestor();
		  __CLR4_4_16f6fl9ktl9b6.R.inc(246);heap_Item1.setRightSon(heap_Item3);
	      __CLR4_4_16f6fl9ktl9b6.R.inc(247);heap_Item1.getSonByData("b");
	      __CLR4_4_16f6fl9ktl9b6.R.inc(248);heap_Item1.getSonByData("c");
		  __CLR4_4_16f6fl9ktl9b6.R.inc(249);heap_Item1.getSonByData("a");
		  __CLR4_4_16f6fl9ktl9b6.R.inc(250);heap_Item0.getSonByData("a");
		  __CLR4_4_16f6fl9ktl9b6.R.inc(251);heap_Item1.removeChild("b");
		  __CLR4_4_16f6fl9ktl9b6.R.inc(252);heap_Item1.removeChild("c");
		  __CLR4_4_16f6fl9ktl9b6.R.inc(253);heap_Item1.removeChild("a");
		  __CLR4_4_16f6fl9ktl9b6.R.inc(254);heap_Item.removeChild("a");
		__CLR4_4_16f6fl9ktl9b6.R.inc(255);heap_Item1.setLeftSon(heap_Item1);
		__CLR4_4_16f6fl9ktl9b6.R.inc(256);heap_Item1.setRightSon(heap_Item3);

		__CLR4_4_16f6fl9ktl9b6.R.inc(257);assertTrue(heap_Item1.replaceChild("b",heap_Item1));
		__CLR4_4_16f6fl9ktl9b6.R.inc(258);assertTrue(heap_Item1.replaceChild("c",heap_Item1));
		__CLR4_4_16f6fl9ktl9b6.R.inc(259);assertFalse(heap_Item1.replaceChild("a",heap_Item1));
		__CLR4_4_16f6fl9ktl9b6.R.inc(260);assertFalse(heap_Item0.replaceChild("a",heap_Item1));
		__CLR4_4_16f6fl9ktl9b6.R.inc(261);assertFalse(heap_Item1.replaceChild("$", heap_Item0));
		__CLR4_4_16f6fl9ktl9b6.R.inc(262);heap_Item.getData();
		__CLR4_4_16f6fl9ktl9b6.R.inc(263);String str = "c";
		__CLR4_4_16f6fl9ktl9b6.R.inc(264);heap_Item.setData(str);
		__CLR4_4_16f6fl9ktl9b6.R.inc(265);assertEquals("c",heap_Item.getData());
	}finally{__CLR4_4_16f6fl9ktl9b6.R.flushNeeded();}}

	@Test
	public void Pairing_Heap_test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {__CLR4_4_16f6fl9ktl9b6.R.globalSliceStart(getClass().getName(),266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r17bl77e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktl9b6.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktl9b6.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.Pairing_Heap_test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r17bl77e() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{try{__CLR4_4_16f6fl9ktl9b6.R.inc(266);
		__CLR4_4_16f6fl9ktl9b6.R.inc(267);Pairing_Heap<String> ph0 = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktl9b6.R.inc(268);Pairing_Heap<String> ph_0 = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktl9b6.R.inc(269);Pairing_Heap<String> ph00 = new Pairing_Heap<>((Heap_Item) null);

		__CLR4_4_16f6fl9ktl9b6.R.inc(270);Pairing_Heap<String> ph1 = new Pairing_Heap<>(heap_Item4);
		__CLR4_4_16f6fl9ktl9b6.R.inc(271);Pairing_Heap<String> ph2 = new Pairing_Heap<>(ph1);
		__CLR4_4_16f6fl9ktl9b6.R.inc(272);Pairing_Heap<String> ph3 = new Pairing_Heap<>(heap_Item7);
		__CLR4_4_16f6fl9ktl9b6.R.inc(273);Pairing_Heap<String> ph4 = new Pairing_Heap<>(heap_Item8);

		__CLR4_4_16f6fl9ktl9b6.R.inc(274);assertEquals("1",ph1.peek());
		__CLR4_4_16f6fl9ktl9b6.R.inc(275);ph0.push(heap_Item4);
		__CLR4_4_16f6fl9ktl9b6.R.inc(276);ph1.push(heap_Item5);
		__CLR4_4_16f6fl9ktl9b6.R.inc(277);assertNull(ph_0.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(278);assertEquals("1",ph0.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(279);assertEquals("4",ph3.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(280);heap_Item4.setLeftSon(heap_Item5);
		__CLR4_4_16f6fl9ktl9b6.R.inc(281);heap_Item5.setRightSon(heap_Item6);
		__CLR4_4_16f6fl9ktl9b6.R.inc(282);heap_Item5.setLeftSon(heap_Item6);
		__CLR4_4_16f6fl9ktl9b6.R.inc(283);heap_Item6.setLeftSon(heap_Item7);
		__CLR4_4_16f6fl9ktl9b6.R.inc(284);assertEquals("1",ph1.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(285);assertEquals("2",ph1.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(286);assertEquals("3",ph1.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(287);heap_Item8.setLeftSon(heap_Item9);
		__CLR4_4_16f6fl9ktl9b6.R.inc(288);heap_Item9.setRightSon(heap_Item10);
		__CLR4_4_16f6fl9ktl9b6.R.inc(289);heap_Item9.setLeftSon(heap_Item10);
		__CLR4_4_16f6fl9ktl9b6.R.inc(290);heap_Item10.setLeftSon(heap_Item11);
		__CLR4_4_16f6fl9ktl9b6.R.inc(291);assertEquals("8",ph4.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(292);assertEquals("6",ph4.pop());
		__CLR4_4_16f6fl9ktl9b6.R.inc(293);assertEquals("5",ph4.pop());

		__CLR4_4_16f6fl9ktl9b6.R.inc(294);Pairing_Heap<String> phm1 = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktl9b6.R.inc(295);Class clazz = phm1.getClass();
		__CLR4_4_16f6fl9ktl9b6.R.inc(296);Method method1,method2,method3;
		__CLR4_4_16f6fl9ktl9b6.R.inc(297);method1 = clazz.getDeclaredMethod("pair", Pairing_Heap.class, Pairing_Heap.class);
		__CLR4_4_16f6fl9ktl9b6.R.inc(298);method2 = clazz.getDeclaredMethod("pair", Pairing_Heap.class, Pairing_Heap.class);
		__CLR4_4_16f6fl9ktl9b6.R.inc(299);method3 = clazz.getDeclaredMethod("pop_heap_item");
		__CLR4_4_16f6fl9ktl9b6.R.inc(300);method1.setAccessible(true);
		__CLR4_4_16f6fl9ktl9b6.R.inc(301);method2.setAccessible(true);
		__CLR4_4_16f6fl9ktl9b6.R.inc(302);method3.setAccessible(true);
		__CLR4_4_16f6fl9ktl9b6.R.inc(303);method1.invoke(phm1,ph00,ph1);
		__CLR4_4_16f6fl9ktl9b6.R.inc(304);method2.invoke(phm1,ph1,ph00);
		__CLR4_4_16f6fl9ktl9b6.R.inc(305);method3.invoke(phm1);

		__CLR4_4_16f6fl9ktl9b6.R.inc(306);ph0.checkPriority(heap_Item0);
		__CLR4_4_16f6fl9ktl9b6.R.inc(307);ph0.checkPriority(heap_Item1);
		__CLR4_4_16f6fl9ktl9b6.R.inc(308);ph0.checkPriority(heap_Item2);
		__CLR4_4_16f6fl9ktl9b6.R.inc(309);ph0.checkPriority(heap_Item3);
		__CLR4_4_16f6fl9ktl9b6.R.inc(310);ph0.checkPriority(heap_Item4);
		__CLR4_4_16f6fl9ktl9b6.R.inc(311);ph0.checkPriority(heap_Item5);
		__CLR4_4_16f6fl9ktl9b6.R.inc(312);ph0.checkPriority(heap_Item6);
		__CLR4_4_16f6fl9ktl9b6.R.inc(313);ph0.checkPriority(heap_Item7);
		__CLR4_4_16f6fl9ktl9b6.R.inc(314);ph0.checkPriority(heap_Item8);
		__CLR4_4_16f6fl9ktl9b6.R.inc(315);ph0.checkPriority(heap_Item9);
		__CLR4_4_16f6fl9ktl9b6.R.inc(316);ph0.checkPriority(heap_Item10);
		__CLR4_4_16f6fl9ktl9b6.R.inc(317);ph0.checkPriority(heap_Item11);

		__CLR4_4_16f6fl9ktl9b6.R.inc(318);heap_Item12.setAncestor(heap_Item13);
		__CLR4_4_16f6fl9ktl9b6.R.inc(319);heap_Item13.setLeftSon(heap_Item12);
		__CLR4_4_16f6fl9ktl9b6.R.inc(320);heap_Item12.setRightSon(heap_Item13);
		__CLR4_4_16f6fl9ktl9b6.R.inc(321);ph0.checkPriority(heap_Item12);
		__CLR4_4_16f6fl9ktl9b6.R.inc(322);heap_Item12.removeRightSon();
		__CLR4_4_16f6fl9ktl9b6.R.inc(323);ph0.checkPriority(heap_Item12);

		__CLR4_4_16f6fl9ktl9b6.R.inc(324);heap_Item14.setLeftSon(heap_Item7);
		__CLR4_4_16f6fl9ktl9b6.R.inc(325);heap_Item14.setRightSon(heap_Item10);
		__CLR4_4_16f6fl9ktl9b6.R.inc(326);heap_Item7.setRightSon(heap_Item9);
		__CLR4_4_16f6fl9ktl9b6.R.inc(327);heap_Item14.setAncestor(heap_Item10);
		__CLR4_4_16f6fl9ktl9b6.R.inc(328);ph0.checkPriority(heap_Item14);

	}finally{__CLR4_4_16f6fl9ktl9b6.R.flushNeeded();}}

}
