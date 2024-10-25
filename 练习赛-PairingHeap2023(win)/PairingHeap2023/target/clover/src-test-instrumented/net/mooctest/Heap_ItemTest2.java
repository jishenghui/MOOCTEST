/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import javax.enterprise.inject.New;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Heap_ItemTest2 {static class __CLR4_4_16p6plnvslq0b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0039\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0050\u0061\u0069\u0072\u0069\u006e\u0067\u0048\u0065\u0061\u0070\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697635933886L,8589935092L,505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	
	@Test
	public void test() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt36p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt36p(){try{__CLR4_4_16p6plnvslq0b.R.inc(241);
	      __CLR4_4_16p6plnvslq0b.R.inc(242);Heap_Item<String> heap_Item0 = new Heap_Item<String>(",");
	      __CLR4_4_16p6plnvslq0b.R.inc(243);Heap_Item<String> heap_Item1 = new Heap_Item<String>(",");
	      __CLR4_4_16p6plnvslq0b.R.inc(244);heap_Item1.setLeftSon(heap_Item0);
	      __CLR4_4_16p6plnvslq0b.R.inc(245);heap_Item0.setLeftSon(heap_Item1);
	      __CLR4_4_16p6plnvslq0b.R.inc(246);heap_Item0.setRightSon(heap_Item1);
	      __CLR4_4_16p6plnvslq0b.R.inc(247);heap_Item1.replaceChild("$", heap_Item0);
	      __CLR4_4_16p6plnvslq0b.R.inc(248);heap_Item0.getSonByData(",");
	      __CLR4_4_16p6plnvslq0b.R.inc(249);heap_Item0.getSonByData("");
	      __CLR4_4_16p6plnvslq0b.R.inc(250);assertTrue(heap_Item0.hasLeftSon());
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test1() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beu6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),251,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beu6z(){try{__CLR4_4_16p6plnvslq0b.R.inc(251);
		__CLR4_4_16p6plnvslq0b.R.inc(252);Heap_Item<Integer> heap_Item = new Heap_Item<>();
		__CLR4_4_16p6plnvslq0b.R.inc(253);heap_Item.setData(1);
		__CLR4_4_16p6plnvslq0b.R.inc(254);Heap_Item<Integer> heap_Item1 = new Heap_Item<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(255);heap_Item.setLeftSon(heap_Item1);
		
		__CLR4_4_16p6plnvslq0b.R.inc(256);heap_Item1.setData(null);
		__CLR4_4_16p6plnvslq0b.R.inc(257);heap_Item1.setData(2);
		__CLR4_4_16p6plnvslq0b.R.inc(258);heap_Item1.getSonByData(1);
		
		__CLR4_4_16p6plnvslq0b.R.inc(259);heap_Item.setRightSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(260);heap_Item.getSonByData(2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(261);Heap_Item<Integer> heap_Item2 = new Heap_Item<Integer>(3);
		__CLR4_4_16p6plnvslq0b.R.inc(262);heap_Item1.setRightSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(263);assertEquals(new Integer(3), heap_Item2.getData());
		__CLR4_4_16p6plnvslq0b.R.inc(264);assertTrue(heap_Item1.hasRightSon());
		
		__CLR4_4_16p6plnvslq0b.R.inc(265);heap_Item1.getSonByData(3);
		__CLR4_4_16p6plnvslq0b.R.inc(266);Heap_Item<Integer> heap_Item3 = new Heap_Item<Integer>();
		
		__CLR4_4_16p6plnvslq0b.R.inc(267);assertNull(heap_Item3.getData());
		

		
		
		__CLR4_4_16p6plnvslq0b.R.inc(268);Heap_Item<Integer> heap_Item4 = new Heap_Item<Integer>(9);
//		assertFalse(heap_Item.replaceChild(1, heap_Item4));
		__CLR4_4_16p6plnvslq0b.R.inc(269);assertTrue(heap_Item.replaceChild(2, heap_Item4));
		
		
		
//		assertNull(heap_Item3.getLeftSon().getData());
//
		__CLR4_4_16p6plnvslq0b.R.inc(270);assertFalse(heap_Item.replaceChild(3, heap_Item4));
		__CLR4_4_16p6plnvslq0b.R.inc(271);heap_Item4.setRightSon(heap_Item4);
		__CLR4_4_16p6plnvslq0b.R.inc(272);assertTrue(heap_Item4.replaceChild(9, heap_Item4));
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test2() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7b7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),273,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7b7l(){try{__CLR4_4_16p6plnvslq0b.R.inc(273);
		__CLR4_4_16p6plnvslq0b.R.inc(274);Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		__CLR4_4_16p6plnvslq0b.R.inc(275);Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		__CLR4_4_16p6plnvslq0b.R.inc(276);Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		__CLR4_4_16p6plnvslq0b.R.inc(277);Heap_Item<Integer> heap_Item3 = new Heap_Item<>(heap_Item1);
		
//		heap_Item.getMultiWayAncestor();
		__CLR4_4_16p6plnvslq0b.R.inc(278);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(279);heap_Item2.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(280);heap_Item3.setAncestor(heap_Item2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(281);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(282);heap_Item.setRightSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(283);heap_Item2.setRightSon(heap_Item3);
		
	
		__CLR4_4_16p6plnvslq0b.R.inc(284);assertEquals(heap_Item, heap_Item1.getAncestor());
		__CLR4_4_16p6plnvslq0b.R.inc(285);assertEquals(heap_Item1, heap_Item.getLeftSon());
//		assertNotEquals(heap_Item, heap_Item1.getMultiWayAncestor());
		__CLR4_4_16p6plnvslq0b.R.inc(286);heap_Item1.getMultiWayAncestor();
		__CLR4_4_16p6plnvslq0b.R.inc(287);assertNull(heap_Item.getMultiWayAncestor());
//		heap_Item3.getMultiWayAncestor();
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test3(){__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zs80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zs80(){try{__CLR4_4_16p6plnvslq0b.R.inc(288);
		__CLR4_4_16p6plnvslq0b.R.inc(289);Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		__CLR4_4_16p6plnvslq0b.R.inc(290);Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		__CLR4_4_16p6plnvslq0b.R.inc(291);Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		__CLR4_4_16p6plnvslq0b.R.inc(292);Heap_Item<Integer> heap_Item3 = new Heap_Item<>(4);
		

		
		__CLR4_4_16p6plnvslq0b.R.inc(293);heap_Item3.setAncestor(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(294);heap_Item2.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(295);heap_Item1.setAncestor(heap_Item);
		
		__CLR4_4_16p6plnvslq0b.R.inc(296);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(297);heap_Item1.setLeftSon(heap_Item3);
		
		__CLR4_4_16p6plnvslq0b.R.inc(298);heap_Item.setRightSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(299);heap_Item2.setRightSon(heap_Item3);
		
//		heap_Item3.getMultiWayAncestor();
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test4() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s98c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s98c(){try{__CLR4_4_16p6plnvslq0b.R.inc(300);
		__CLR4_4_16p6plnvslq0b.R.inc(301);Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		__CLR4_4_16p6plnvslq0b.R.inc(302);Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		__CLR4_4_16p6plnvslq0b.R.inc(303);Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		__CLR4_4_16p6plnvslq0b.R.inc(304);Heap_Item<Integer> heap_Item3 = new Heap_Item<>(4);
		
		__CLR4_4_16p6plnvslq0b.R.inc(305);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(306);heap_Item.removeChild(2);
		__CLR4_4_16p6plnvslq0b.R.inc(307);heap_Item.setRightSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(308);heap_Item.removeChild(3);
		
		__CLR4_4_16p6plnvslq0b.R.inc(309);assertFalse(heap_Item.itIsLeftSon(heap_Item1));
		__CLR4_4_16p6plnvslq0b.R.inc(310);assertNull(heap_Item.getRightSon());
		
		__CLR4_4_16p6plnvslq0b.R.inc(311);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(312);heap_Item.setRightSon(heap_Item2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(313);heap_Item.removeChild(3);
		__CLR4_4_16p6plnvslq0b.R.inc(314);assertNull(heap_Item.getRightSon());
		__CLR4_4_16p6plnvslq0b.R.inc(315);heap_Item.setRightSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(316);heap_Item.removeChild(4);
		__CLR4_4_16p6plnvslq0b.R.inc(317);assertNotNull(heap_Item.getLeftSon());
		__CLR4_4_16p6plnvslq0b.R.inc(318);assertNotNull(heap_Item.getRightSon());
		__CLR4_4_16p6plnvslq0b.R.inc(319);heap_Item.removeLeftSon();
		__CLR4_4_16p6plnvslq0b.R.inc(320);heap_Item.removeRightSon();
		__CLR4_4_16p6plnvslq0b.R.inc(321);assertNull(heap_Item.getLeftSon());
		__CLR4_4_16p6plnvslq0b.R.inc(322);assertNull(heap_Item.getRightSon());
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test5() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kq8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kq8z(){try{__CLR4_4_16p6plnvslq0b.R.inc(323);
		__CLR4_4_16p6plnvslq0b.R.inc(324);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		__CLR4_4_16p6plnvslq0b.R.inc(325);assertNull(pairing_Heap.getRoot());
		__CLR4_4_16p6plnvslq0b.R.inc(326);assertNull(pairing_Heap.pop());
		
		
		
		__CLR4_4_16p6plnvslq0b.R.inc(327);Heap_Item<String> heap_Item = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(328);Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		__CLR4_4_16p6plnvslq0b.R.inc(329);Pairing_Heap<String> pairing_Heap1 = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(330);Pairing_Heap<String> pairing_Heap2 = new Pairing_Heap<>(pairing_Heap1);
		__CLR4_4_16p6plnvslq0b.R.inc(331);assertEquals("a", pairing_Heap1.peek());
		__CLR4_4_16p6plnvslq0b.R.inc(332);assertEquals("a", pairing_Heap1.pop());
		__CLR4_4_16p6plnvslq0b.R.inc(333);assertEquals(heap_Item1, pairing_Heap1.push(heap_Item1));
		__CLR4_4_16p6plnvslq0b.R.inc(334);assertEquals(heap_Item, pairing_Heap1.push(heap_Item));
		
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	@Test
	public void test6() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d79b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d79b(){try{__CLR4_4_16p6plnvslq0b.R.inc(335);
		__CLR4_4_16p6plnvslq0b.R.inc(336);Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		__CLR4_4_16p6plnvslq0b.R.inc(337);Heap_Item<Integer> heap_Item1 = new Heap_Item<>(2);
		__CLR4_4_16p6plnvslq0b.R.inc(338);Heap_Item<Integer> heap_Item2 = new Heap_Item<>(3);
		__CLR4_4_16p6plnvslq0b.R.inc(339);Heap_Item<Integer> heap_Item3 = new Heap_Item<>(3);
		
		__CLR4_4_16p6plnvslq0b.R.inc(340);heap_Item3.setAncestor(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(341);heap_Item2.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(342);heap_Item1.setAncestor(heap_Item);
		
		
		__CLR4_4_16p6plnvslq0b.R.inc(343);heap_Item2.setLeftSon(heap_Item3);
		__CLR4_4_16p6plnvslq0b.R.inc(344);heap_Item1.setLeftSon(heap_Item3);
		
		__CLR4_4_16p6plnvslq0b.R.inc(345);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(346);heap_Item.setRightSon(heap_Item2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(347);Pairing_Heap<Integer> pairing_Heap = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(348);pairing_Heap.checkPriority(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(349);pairing_Heap.checkPriority(heap_Item3);
		
		
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test8() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r562y59q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r562y59q(){try{__CLR4_4_16p6plnvslq0b.R.inc(350);
		__CLR4_4_16p6plnvslq0b.R.inc(351);Heap_Item<String> heap_Item = new Heap_Item<>("3a");
		__CLR4_4_16p6plnvslq0b.R.inc(352);Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		__CLR4_4_16p6plnvslq0b.R.inc(353);Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		__CLR4_4_16p6plnvslq0b.R.inc(354);Heap_Item<String> heap_Item3 = new Heap_Item<>("1d");
		__CLR4_4_16p6plnvslq0b.R.inc(355);Heap_Item<String> heap_Item4 = new Heap_Item<>("e");
		
		__CLR4_4_16p6plnvslq0b.R.inc(356);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(357);heap_Item2.setAncestor(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(358);heap_Item3.setAncestor(heap_Item2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(359);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(360);heap_Item1.setLeftSon(heap_Item3);
		__CLR4_4_16p6plnvslq0b.R.inc(361);heap_Item1.setRightSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(362);heap_Item2.setRightSon(heap_Item3);
		__CLR4_4_16p6plnvslq0b.R.inc(363);heap_Item3.setRightSon(heap_Item4);

		__CLR4_4_16p6plnvslq0b.R.inc(364);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(365);pairing_Heap.checkPriority(heap_Item3);
//		System.out.println(heap_Item3.getMultiWayAncestor().getData().compareTo(heap_Item3.getData()));
//		System.out.println(heap_Item3.getData());
//		System.out.println(heap_Item3.getMultiWayAncestor().getData());
//		System.out.println(heap_Item3.getAncestor().getData());
//		System.out.println("3a".compareTo("1d"));
		
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}} 

	@Test
	public void test9() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue61qma6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),366,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue61qma6(){try{__CLR4_4_16p6plnvslq0b.R.inc(366);
		__CLR4_4_16p6plnvslq0b.R.inc(367);Heap_Item<String> heap_Item = new Heap_Item<>("1b");
		__CLR4_4_16p6plnvslq0b.R.inc(368);Heap_Item<String> heap_Item1 = new Heap_Item<>("2a");
		__CLR4_4_16p6plnvslq0b.R.inc(369);Heap_Item<String> heap_Item2 = new Heap_Item<>("1d");
		__CLR4_4_16p6plnvslq0b.R.inc(370);Heap_Item<String> heap_Item3 = new Heap_Item<>("a");
		
		__CLR4_4_16p6plnvslq0b.R.inc(371);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(372);heap_Item2.setAncestor(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(373);heap_Item3.setAncestor(heap_Item1);
		
		__CLR4_4_16p6plnvslq0b.R.inc(374);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(375);heap_Item1.setLeftSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(376);heap_Item1.setRightSon(heap_Item3);
		
		__CLR4_4_16p6plnvslq0b.R.inc(377);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(378);pairing_Heap.checkPriority(heap_Item1);
		
		__CLR4_4_16p6plnvslq0b.R.inc(379);Heap_Item<String> heap_Item4 = new Heap_Item<>("2a");
		__CLR4_4_16p6plnvslq0b.R.inc(380);Heap_Item<String> heap_Item5 = new Heap_Item<>("1d");
		__CLR4_4_16p6plnvslq0b.R.inc(381);Heap_Item<String> heap_Item6 = new Heap_Item<>("a");
		
		__CLR4_4_16p6plnvslq0b.R.inc(382);heap_Item5.setAncestor(heap_Item4);
		__CLR4_4_16p6plnvslq0b.R.inc(383);heap_Item6.setAncestor(heap_Item4);
		
		__CLR4_4_16p6plnvslq0b.R.inc(384);heap_Item4.setLeftSon(heap_Item5);
		__CLR4_4_16p6plnvslq0b.R.inc(385);heap_Item4.setRightSon(heap_Item6);
		
		__CLR4_4_16p6plnvslq0b.R.inc(386);Pairing_Heap<String> pairing_Heap1 = new Pairing_Heap<>(heap_Item4);
		__CLR4_4_16p6plnvslq0b.R.inc(387);pairing_Heap.checkPriority(heap_Item4);
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test10() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwas(){try{__CLR4_4_16p6plnvslq0b.R.inc(388);
		__CLR4_4_16p6plnvslq0b.R.inc(389);Heap_Item<String> heap_Item = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(390);Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		__CLR4_4_16p6plnvslq0b.R.inc(391);Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		
		__CLR4_4_16p6plnvslq0b.R.inc(392);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(393);heap_Item2.setAncestor(heap_Item1);
		
		__CLR4_4_16p6plnvslq0b.R.inc(394);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(395);heap_Item1.setLeftSon(heap_Item2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(396);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(397);pairing_Heap.pop();
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test11() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonzndb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),398,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonzndb2(){try{__CLR4_4_16p6plnvslq0b.R.inc(398);
		__CLR4_4_16p6plnvslq0b.R.inc(399);Heap_Item<String> heap_Item = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(400);Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		__CLR4_4_16p6plnvslq0b.R.inc(401);Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		
		__CLR4_4_16p6plnvslq0b.R.inc(402);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(403);heap_Item2.setAncestor(heap_Item1);
		
		__CLR4_4_16p6plnvslq0b.R.inc(404);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(405);heap_Item1.setRightSon(heap_Item2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(406);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(407);pairing_Heap.pop();
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test12() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3jabc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3jabc(){try{__CLR4_4_16p6plnvslq0b.R.inc(408);
		__CLR4_4_16p6plnvslq0b.R.inc(409);Heap_Item<String> heap_Item = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(410);Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		
		__CLR4_4_16p6plnvslq0b.R.inc(411);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(412);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(413);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		
//		assertNull(pairing_Heap.getRoot());
		__CLR4_4_16p6plnvslq0b.R.inc(414);pairing_Heap.push(null);
		__CLR4_4_16p6plnvslq0b.R.inc(415);Pairing_Heap<String> pairing_Heap1 = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(416);pairing_Heap1.push(heap_Item1);
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test13() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qtbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qtbl(){try{__CLR4_4_16p6plnvslq0b.R.inc(417);
		__CLR4_4_16p6plnvslq0b.R.inc(418);Heap_Item<String> heap_Item = new Heap_Item<>("3a");
		__CLR4_4_16p6plnvslq0b.R.inc(419);Heap_Item<String> heap_Item1 = new Heap_Item<>("1b");
		__CLR4_4_16p6plnvslq0b.R.inc(420);Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		__CLR4_4_16p6plnvslq0b.R.inc(421);Heap_Item<String> heap_Item3 = new Heap_Item<>("e");
		
		__CLR4_4_16p6plnvslq0b.R.inc(422);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(423);heap_Item2.setAncestor(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(424);heap_Item3.setAncestor(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(425);heap_Item1.setLeftSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(426);heap_Item1.setRightSon(heap_Item3);
		__CLR4_4_16p6plnvslq0b.R.inc(427);heap_Item.setLeftSon(heap_Item1);
		
		
		__CLR4_4_16p6plnvslq0b.R.inc(428);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(429);pairing_Heap.checkPriority(heap_Item);
		
		
		
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	
	@Test
	public void test14() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5ycby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5ycby(){try{__CLR4_4_16p6plnvslq0b.R.inc(430);
		__CLR4_4_16p6plnvslq0b.R.inc(431);Heap_Item<String> heap_Item = new Heap_Item<>("3a");
		__CLR4_4_16p6plnvslq0b.R.inc(432);Heap_Item<String> heap_Item1 = new Heap_Item<>("1b");
		__CLR4_4_16p6plnvslq0b.R.inc(433);Heap_Item<String> heap_Item2 = new Heap_Item<>("c");
		__CLR4_4_16p6plnvslq0b.R.inc(434);Heap_Item<String> heap_Item3 = new Heap_Item<>("e");
		
		__CLR4_4_16p6plnvslq0b.R.inc(435);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(436);heap_Item2.setAncestor(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(437);heap_Item1.setLeftSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(438);heap_Item.setLeftSon(heap_Item1);
		
		
		__CLR4_4_16p6plnvslq0b.R.inc(439);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(440);pairing_Heap.checkPriority(heap_Item);
		
		__CLR4_4_16p6plnvslq0b.R.inc(441);Heap_Item<String> heap_Item4 = new Heap_Item<>("a");
		
		__CLR4_4_16p6plnvslq0b.R.inc(442);Pairing_Heap<String> pairing_Heap2 = new Pairing_Heap<>(heap_Item4);
		__CLR4_4_16p6plnvslq0b.R.inc(443);pairing_Heap2.checkPriority(heap_Item4);
		
		
		
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test15() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75vcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75vcc(){try{__CLR4_4_16p6plnvslq0b.R.inc(444);
		
		__CLR4_4_16p6plnvslq0b.R.inc(445);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		__CLR4_4_16p6plnvslq0b.R.inc(446);Heap_Item<String> heap_Item = new Heap_Item<>("b");
		__CLR4_4_16p6plnvslq0b.R.inc(447);Heap_Item<String> heap_Item1 = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(448);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(449);heap_Item.setLeftSon(heap_Item1);
		
		__CLR4_4_16p6plnvslq0b.R.inc(450);pairing_Heap.checkPriority(heap_Item1);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	@Test
	public void test16() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8decj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8decj(){try{__CLR4_4_16p6plnvslq0b.R.inc(451);
		
		__CLR4_4_16p6plnvslq0b.R.inc(452);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		__CLR4_4_16p6plnvslq0b.R.inc(453);Heap_Item<String> heap_Item = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(454);Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		__CLR4_4_16p6plnvslq0b.R.inc(455);Heap_Item<String> heap_Item2 = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(456);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(457);heap_Item1.setLeftSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(458);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(459);pairing_Heap.checkPriority(heap_Item1);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	@Test
	public void test17() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kxcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kxcs(){try{__CLR4_4_16p6plnvslq0b.R.inc(460);
		
		__CLR4_4_16p6plnvslq0b.R.inc(461);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		__CLR4_4_16p6plnvslq0b.R.inc(462);Heap_Item<String> heap_Item = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(463);Heap_Item<String> heap_Item1 = new Heap_Item<>("b");
		__CLR4_4_16p6plnvslq0b.R.inc(464);Heap_Item<String> heap_Item2 = new Heap_Item<>("a");
		__CLR4_4_16p6plnvslq0b.R.inc(465);Heap_Item<String> heap_Item3 = new Heap_Item<>("1");
		__CLR4_4_16p6plnvslq0b.R.inc(466);heap_Item2.setRightSon(heap_Item3);
		__CLR4_4_16p6plnvslq0b.R.inc(467);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(468);heap_Item1.setLeftSon(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(469);heap_Item.setLeftSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(470);pairing_Heap.checkPriority(heap_Item1);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	
	@Test
	public void test18() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasgd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasgd3(){try{__CLR4_4_16p6plnvslq0b.R.inc(471);
		__CLR4_4_16p6plnvslq0b.R.inc(472);Heap_Item<Integer> heap_Item = new Heap_Item<>();
		__CLR4_4_16p6plnvslq0b.R.inc(473);heap_Item.removeChild(2);
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	@Test
	public void test19() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzzd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),474,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzzd6(){try{__CLR4_4_16p6plnvslq0b.R.inc(474);
		
		__CLR4_4_16p6plnvslq0b.R.inc(475);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		__CLR4_4_16p6plnvslq0b.R.inc(476);Heap_Item<String> heap_Item = new Heap_Item<>("1");
		__CLR4_4_16p6plnvslq0b.R.inc(477);Heap_Item<String> heap_Item1 = new Heap_Item<>("2");
		__CLR4_4_16p6plnvslq0b.R.inc(478);Heap_Item<String> heap_Item2 = new Heap_Item<>("3");
		__CLR4_4_16p6plnvslq0b.R.inc(479);Heap_Item<String> heap_Item3 = new Heap_Item<>("4");
		__CLR4_4_16p6plnvslq0b.R.inc(480);heap_Item1.setAncestor(heap_Item);
		__CLR4_4_16p6plnvslq0b.R.inc(481);heap_Item2.setAncestor(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(482);heap_Item3.setAncestor(heap_Item2);
		__CLR4_4_16p6plnvslq0b.R.inc(483);heap_Item2.setLeftSon(heap_Item3);
		__CLR4_4_16p6plnvslq0b.R.inc(484);heap_Item1.setRightSon(heap_Item2);
		
		__CLR4_4_16p6plnvslq0b.R.inc(485);heap_Item.setLeftSon(heap_Item1);
		
		
	
		__CLR4_4_16p6plnvslq0b.R.inc(486);pairing_Heap.checkPriority(heap_Item);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
		
		
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	@Test
	public void test20() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1avl4kpdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test20",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),487,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1avl4kpdj(){try{__CLR4_4_16p6plnvslq0b.R.inc(487);
		
		__CLR4_4_16p6plnvslq0b.R.inc(488);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		
		__CLR4_4_16p6plnvslq0b.R.inc(489);Heap_Item<String> heap_Item = new Heap_Item<>("1");
		__CLR4_4_16p6plnvslq0b.R.inc(490);Heap_Item<String> heap_Item1 = new Heap_Item<>("2");
		__CLR4_4_16p6plnvslq0b.R.inc(491);heap_Item.setRightSon(heap_Item1);
		
		
		
	
		__CLR4_4_16p6plnvslq0b.R.inc(492);pairing_Heap.checkPriority(heap_Item);
//		System.out.println("aa:"+heap_Item1.getMultiWayAncestor().getData().compareTo(heap_Item1.getData()));
		
		
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void testException() {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12aalq4dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.testException",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),493,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12aalq4dp(){try{__CLR4_4_16p6plnvslq0b.R.inc(493);
		__CLR4_4_16p6plnvslq0b.R.inc(494);Heap_Item<Integer> heap_Item = new Heap_Item<>(1);
		__CLR4_4_16p6plnvslq0b.R.inc(495);Heap_Item<Integer> heap_Item1 = new Heap_Item<>(1);
		__CLR4_4_16p6plnvslq0b.R.inc(496);heap_Item.setRightSon(heap_Item1);
		__CLR4_4_16p6plnvslq0b.R.inc(497);try {
		__CLR4_4_16p6plnvslq0b.R.inc(498);heap_Item1.setAncestor(heap_Item);
//		fail("\u7ecc\u70d8\u5bda\u95bd\u581d\u7d13\u752f\ufffd");
		}catch (NullPointerException e) {
			// TODO: handle exception
		}
//		heap_Item1.getMultiWayAncestor();
	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
	
	@Test
	public void test21() throws Exception {__CLR4_4_16p6plnvslq0b.R.globalSliceStart(getClass().getName(),499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17ml5s8dv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16p6plnvslq0b.R.rethrow($CLV_t2$);}finally{__CLR4_4_16p6plnvslq0b.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest2.test21",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17ml5s8dv() throws Exception{try{__CLR4_4_16p6plnvslq0b.R.inc(499);
		__CLR4_4_16p6plnvslq0b.R.inc(500);Class<Pairing_Heap> class1 = Pairing_Heap.class;
		__CLR4_4_16p6plnvslq0b.R.inc(501);Pairing_Heap<String> pairing_Heap = new Pairing_Heap<>();
		__CLR4_4_16p6plnvslq0b.R.inc(502);Method method = class1.getDeclaredMethod("pop_heap_item");
		__CLR4_4_16p6plnvslq0b.R.inc(503);method.setAccessible(true);
		__CLR4_4_16p6plnvslq0b.R.inc(504);assertNull(method.invoke(pairing_Heap));

	}finally{__CLR4_4_16p6plnvslq0b.R.flushNeeded();}}
}
