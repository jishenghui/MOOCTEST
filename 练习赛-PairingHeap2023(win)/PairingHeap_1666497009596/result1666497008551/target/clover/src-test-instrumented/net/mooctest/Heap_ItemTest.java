/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Optional;

//author:TheOnlyman
public class Heap_ItemTest {static class __CLR4_4_16f6fl9ktacf9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0030\u0032\u0031\u005c\u005c\u0031\u0032\u0032\u0039\u0037\u0033\u005c\u005c\u0050\u0061\u0069\u0072\u0069\u006e\u0067\u0048\u0065\u0061\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666497002053L,8589935092L,469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt36f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt36f(){try{__CLR4_4_16f6fl9ktacf9.R.inc(231);
		__CLR4_4_16f6fl9ktacf9.R.inc(232);Heap_Item<String> apple = new Heap_Item<String>(",");
		__CLR4_4_16f6fl9ktacf9.R.inc(233);Heap_Item<String> banana = new Heap_Item<String>(",");
		__CLR4_4_16f6fl9ktacf9.R.inc(234);banana.setLeftSon(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(235);apple.setLeftSon(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(236);apple.setRightSon(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(237);banana.replaceChild("$", apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(238);apple.getSonByData(",");
		__CLR4_4_16f6fl9ktacf9.R.inc(239);apple.getSonByData("");
		__CLR4_4_16f6fl9ktacf9.R.inc(240);assertTrue(apple.hasLeftSon());
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test01() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33u6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33u6p(){try{__CLR4_4_16f6fl9ktacf9.R.inc(241);
		__CLR4_4_16f6fl9ktacf9.R.inc(242);Heap_Item<Integer> girl = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(243);Heap_Item<Integer> left = new Heap_Item<>(8);
		__CLR4_4_16f6fl9ktacf9.R.inc(244);Heap_Item<Integer> right = new Heap_Item<>(12);
		__CLR4_4_16f6fl9ktacf9.R.inc(245);assertFalse(girl.hasLeftSon());
		__CLR4_4_16f6fl9ktacf9.R.inc(246);assertFalse(girl.hasRightSon());
		__CLR4_4_16f6fl9ktacf9.R.inc(247);girl.setLeftSon(left);
		__CLR4_4_16f6fl9ktacf9.R.inc(248);girl.setRightSon(right);
		__CLR4_4_16f6fl9ktacf9.R.inc(249);assertTrue(girl.hasLeftSon());
		__CLR4_4_16f6fl9ktacf9.R.inc(250);assertTrue(girl.hasRightSon());
		__CLR4_4_16f6fl9ktacf9.R.inc(251);assertNull(girl.getSonByData(7));
		__CLR4_4_16f6fl9ktacf9.R.inc(252);assertEquals(left, girl.getSonByData(8));
		__CLR4_4_16f6fl9ktacf9.R.inc(253);assertEquals(right, girl.getSonByData(12));
		__CLR4_4_16f6fl9ktacf9.R.inc(254);girl.removeChild(8);
		__CLR4_4_16f6fl9ktacf9.R.inc(255);assertNull(girl.getLeftSon());
		__CLR4_4_16f6fl9ktacf9.R.inc(256);girl.removeChild(12);
		__CLR4_4_16f6fl9ktacf9.R.inc(257);assertNull(girl.getRightSon());
		__CLR4_4_16f6fl9ktacf9.R.inc(258);girl.removeChild(11);
		__CLR4_4_16f6fl9ktacf9.R.inc(259);assertFalse(girl.replaceChild(1, new Heap_Item<>(11)));
		__CLR4_4_16f6fl9ktacf9.R.inc(260);girl.setLeftSon(left);
		__CLR4_4_16f6fl9ktacf9.R.inc(261);girl.setRightSon(right);
		__CLR4_4_16f6fl9ktacf9.R.inc(262);Heap_Item<Integer> replace = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(263);assertTrue(girl.replaceChild(8, replace));
		__CLR4_4_16f6fl9ktacf9.R.inc(264);assertEquals(replace, girl.getLeftSon());
		__CLR4_4_16f6fl9ktacf9.R.inc(265);assertTrue(girl.replaceChild(12, replace));
		__CLR4_4_16f6fl9ktacf9.R.inc(266);assertEquals(replace, girl.getRightSon());
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test02() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wb7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),267,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wb7f(){try{__CLR4_4_16f6fl9ktacf9.R.inc(267);
		__CLR4_4_16f6fl9ktacf9.R.inc(268);Heap_Item<Integer> cat = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(269);Heap_Item<Integer> dog = new Heap_Item<>(cat);
		__CLR4_4_16f6fl9ktacf9.R.inc(270);assertNull(dog.getMultiWayAncestor());

		__CLR4_4_16f6fl9ktacf9.R.inc(271);Heap_Item<Integer> grandpa = new Heap_Item<>(11);
		__CLR4_4_16f6fl9ktacf9.R.inc(272);Heap_Item<Integer> grandpapa = new Heap_Item<>(12);
		__CLR4_4_16f6fl9ktacf9.R.inc(273);grandpapa.setLeftSon(grandpa);
		__CLR4_4_16f6fl9ktacf9.R.inc(274);grandpa.setAncestor(grandpapa);
		__CLR4_4_16f6fl9ktacf9.R.inc(275);grandpa.setRightSon(cat);
		__CLR4_4_16f6fl9ktacf9.R.inc(276);cat.setAncestor(grandpa);
		__CLR4_4_16f6fl9ktacf9.R.inc(277);dog.setAncestor(cat);
		__CLR4_4_16f6fl9ktacf9.R.inc(278);cat.setRightSon(dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(279);assertSame(dog.getMultiWayAncestor(), grandpapa);

		__CLR4_4_16f6fl9ktacf9.R.inc(280);Heap_Item<Integer> egg = new Heap_Item<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(281);Heap_Item<Integer> fish = new Heap_Item<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(282);fish.setLeftSon(egg);
		__CLR4_4_16f6fl9ktacf9.R.inc(283);egg.setAncestor(fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(284);assertEquals(egg.getMultiWayAncestor(), fish);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test03() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0os7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0os7x(){try{__CLR4_4_16f6fl9ktacf9.R.inc(285);
		__CLR4_4_16f6fl9ktacf9.R.inc(286);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(287);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(288);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(289);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(290);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(291);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(292);assertEquals(apple.getLeftSon(), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(293);cat.checkPriority(apple);

	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test04() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh986();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh986(){try{__CLR4_4_16f6fl9ktacf9.R.inc(294);
		__CLR4_4_16f6fl9ktacf9.R.inc(295);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(296);Heap_Item<Integer> banana = new Heap_Item<>(4);
		__CLR4_4_16f6fl9ktacf9.R.inc(297);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(298);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(299);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(300);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(301);assertEquals(banana.getLeftSon(), apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(302);apple.setData(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(303);apple.setRightSon(new Heap_Item<>(2));
		__CLR4_4_16f6fl9ktacf9.R.inc(304);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test05() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9q8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9q8h(){try{__CLR4_4_16f6fl9ktacf9.R.inc(305);
		__CLR4_4_16f6fl9ktacf9.R.inc(306);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(307);Heap_Item<Integer> banana = new Heap_Item<>(4);
		__CLR4_4_16f6fl9ktacf9.R.inc(308);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(309);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(310);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(311);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(312);assertEquals(banana.getLeftSon(), apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(313);apple.setData(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(314);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}



	@Test
	public void test06() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx278r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx278r(){try{__CLR4_4_16f6fl9ktacf9.R.inc(315);
		__CLR4_4_16f6fl9ktacf9.R.inc(316);Heap_Item<Integer> hill = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(317);Pairing_Heap<Integer> idea = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(318);assertNull(idea.getRoot());
		__CLR4_4_16f6fl9ktacf9.R.inc(319);assertEquals(hill, idea.push(hill));
		__CLR4_4_16f6fl9ktacf9.R.inc(320);assertEquals(hill, idea.getRoot());
		__CLR4_4_16f6fl9ktacf9.R.inc(321);Heap_Item<Integer> jet = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(322);assertEquals(idea.push(jet), jet);
		__CLR4_4_16f6fl9ktacf9.R.inc(323);assertEquals(idea.getRoot(), jet);

		__CLR4_4_16f6fl9ktacf9.R.inc(324);Pairing_Heap<Integer> apple = new Pairing_Heap<>(hill);
		__CLR4_4_16f6fl9ktacf9.R.inc(325);Heap_Item<Integer> banana = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(326);banana.setLeftSon(new Heap_Item<>(8));
		__CLR4_4_16f6fl9ktacf9.R.inc(327);assertEquals(apple.push(banana), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(328);assertEquals(apple.getRoot(), banana);

		__CLR4_4_16f6fl9ktacf9.R.inc(329);Pairing_Heap<Integer> cat = new Pairing_Heap<>(hill);
		__CLR4_4_16f6fl9ktacf9.R.inc(330);Heap_Item<Integer> dog = new Heap_Item<>(40);
		__CLR4_4_16f6fl9ktacf9.R.inc(331);assertEquals(cat.push(dog), dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(332);assertEquals(cat.getRoot(), hill);
		__CLR4_4_16f6fl9ktacf9.R.inc(333);dog.setLeftSon(new Heap_Item<>(8));
		__CLR4_4_16f6fl9ktacf9.R.inc(334);assertEquals(cat.push(dog), dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(335);assertEquals(cat.getRoot(), hill);

		__CLR4_4_16f6fl9ktacf9.R.inc(336);Pairing_Heap<Integer> egg = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(337);assertNull(egg.pop());
		__CLR4_4_16f6fl9ktacf9.R.inc(338);Heap_Item<Integer> fish = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(339);egg.push(fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(340);assertEquals(egg.pop(), Optional.of(10).get());
		__CLR4_4_16f6fl9ktacf9.R.inc(341);egg.push(fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(342);Heap_Item<Integer> girl = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(343);egg.push(girl);
		__CLR4_4_16f6fl9ktacf9.R.inc(344);assertEquals(egg.pop(), Optional.of(10).get());
		__CLR4_4_16f6fl9ktacf9.R.inc(345);assertEquals(egg.getRoot(), girl);
		__CLR4_4_16f6fl9ktacf9.R.inc(346);Heap_Item<Integer> pp = new Heap_Item<>(40);
		__CLR4_4_16f6fl9ktacf9.R.inc(347);fish.setRightSon(pp);
		__CLR4_4_16f6fl9ktacf9.R.inc(348);egg.push(fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(349);assertEquals(egg.getRoot(), fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(350);assertEquals(egg.pop(), Optional.of(10).get());
		__CLR4_4_16f6fl9ktacf9.R.inc(351);assertEquals(egg.getRoot(), girl);
		__CLR4_4_16f6fl9ktacf9.R.inc(352);egg.push(fish);

		__CLR4_4_16f6fl9ktacf9.R.inc(353);Heap_Item<Integer> ro = new Heap_Item<>(30);
		__CLR4_4_16f6fl9ktacf9.R.inc(354);Pairing_Heap<Integer> l = new Pairing_Heap<>(ro);
		__CLR4_4_16f6fl9ktacf9.R.inc(355);Heap_Item<Integer> rs = new Heap_Item<>(5);
		__CLR4_4_16f6fl9ktacf9.R.inc(356);Heap_Item<Integer> ls = new Heap_Item<>(8);
		__CLR4_4_16f6fl9ktacf9.R.inc(357);rs.setLeftSon(ls);
		__CLR4_4_16f6fl9ktacf9.R.inc(358);ls.setLeftSon(new Heap_Item<>(3));
		__CLR4_4_16f6fl9ktacf9.R.inc(359);l.push(rs);
		__CLR4_4_16f6fl9ktacf9.R.inc(360);assertEquals(l.pop(), Optional.of(5).get());
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test07() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuoa1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuoa1(){try{__CLR4_4_16f6fl9ktacf9.R.inc(361);
		__CLR4_4_16f6fl9ktacf9.R.inc(362);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(363);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(364);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(365);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(366);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(367);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(368);assertEquals(apple.getLeftSon(), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(369);cat.checkPriority(apple);

		__CLR4_4_16f6fl9ktacf9.R.inc(370);banana.setData(5);
		__CLR4_4_16f6fl9ktacf9.R.inc(371);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test08() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun5ac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),372,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun5ac(){try{__CLR4_4_16f6fl9ktacf9.R.inc(372);
		__CLR4_4_16f6fl9ktacf9.R.inc(373);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(374);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(375);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(376);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(377);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(378);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(379);assertEquals(apple.getLeftSon(), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(380);cat.checkPriority(apple);

		__CLR4_4_16f6fl9ktacf9.R.inc(381);banana.setData(5);
		__CLR4_4_16f6fl9ktacf9.R.inc(382);apple.setRightSon(new Heap_Item<>(6));
		__CLR4_4_16f6fl9ktacf9.R.inc(383);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test09() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfmao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),384,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfmao(){try{__CLR4_4_16f6fl9ktacf9.R.inc(384);
		__CLR4_4_16f6fl9ktacf9.R.inc(385);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(386);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(387);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(388);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(389);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(390);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(391);assertEquals(apple.getLeftSon(), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(392);cat.checkPriority(apple);

		__CLR4_4_16f6fl9ktacf9.R.inc(393);banana.setData(5);
		__CLR4_4_16f6fl9ktacf9.R.inc(394);apple.setRightSon(new Heap_Item<>(6));
		__CLR4_4_16f6fl9ktacf9.R.inc(395);Heap_Item<Integer> dog = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(396);Heap_Item<Integer> egg = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(397);dog.setAncestor(egg);
		__CLR4_4_16f6fl9ktacf9.R.inc(398);egg.setLeftSon(dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(399);apple.setAncestor(dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(400);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test10() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),401,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwb5(){try{__CLR4_4_16f6fl9ktacf9.R.inc(401);
		__CLR4_4_16f6fl9ktacf9.R.inc(402);Heap_Item<Integer> apple = new Heap_Item<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(403);assertNull(apple.getData());
		__CLR4_4_16f6fl9ktacf9.R.inc(404);apple.setData(1);
		__CLR4_4_16f6fl9ktacf9.R.inc(405);assertEquals(apple.getData(), Optional.of(1).get());

	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test11() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonzndba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonzndba(){try{__CLR4_4_16f6fl9ktacf9.R.inc(406);
		__CLR4_4_16f6fl9ktacf9.R.inc(407);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(408);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(409);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(410);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(411);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(412);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(413);assertEquals(apple.getLeftSon(), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(414);cat.checkPriority(apple);

		__CLR4_4_16f6fl9ktacf9.R.inc(415);banana.setData(5);
		__CLR4_4_16f6fl9ktacf9.R.inc(416);Heap_Item<Integer> dog = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(417);Heap_Item<Integer> egg = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(418);dog.setAncestor(egg);
		__CLR4_4_16f6fl9ktacf9.R.inc(419);egg.setLeftSon(dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(420);apple.setAncestor(dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(421);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test12() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3jabq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),422,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3jabq(){try{__CLR4_4_16f6fl9ktacf9.R.inc(422);
		__CLR4_4_16f6fl9ktacf9.R.inc(423);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(424);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(425);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(426);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(427);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(428);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(429);assertEquals(apple.getLeftSon(), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(430);cat.checkPriority(apple);

		__CLR4_4_16f6fl9ktacf9.R.inc(431);banana.setData(5);
		__CLR4_4_16f6fl9ktacf9.R.inc(432);apple.setRightSon(new Heap_Item<>(1));
		__CLR4_4_16f6fl9ktacf9.R.inc(433);Heap_Item<Integer> dog = new Heap_Item<>(7);
		__CLR4_4_16f6fl9ktacf9.R.inc(434);dog.setRightSon(new Heap_Item<>(8));
		__CLR4_4_16f6fl9ktacf9.R.inc(435);banana.setRightSon(dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(436);Heap_Item<Integer> egg = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(437);Heap_Item<Integer> fish = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(438);egg.setAncestor(fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(439);egg.setRightSon(new Heap_Item<>(2));
		__CLR4_4_16f6fl9ktacf9.R.inc(440);fish.setLeftSon(egg);
		__CLR4_4_16f6fl9ktacf9.R.inc(441);egg.setRightSon(new Heap_Item<>(4));
		__CLR4_4_16f6fl9ktacf9.R.inc(442);apple.setAncestor(egg);
		__CLR4_4_16f6fl9ktacf9.R.inc(443);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}

	@Test
	public void test13() {__CLR4_4_16f6fl9ktacf9.R.globalSliceStart(getClass().getName(),444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qtcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16f6fl9ktacf9.R.rethrow($CLV_t2$);}finally{__CLR4_4_16f6fl9ktacf9.R.globalSliceEnd(getClass().getName(),"net.mooctest.Heap_ItemTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qtcc(){try{__CLR4_4_16f6fl9ktacf9.R.inc(444);
		__CLR4_4_16f6fl9ktacf9.R.inc(445);Heap_Item<Integer> apple = new Heap_Item<>(10);
		__CLR4_4_16f6fl9ktacf9.R.inc(446);Heap_Item<Integer> banana = new Heap_Item<>(20);
		__CLR4_4_16f6fl9ktacf9.R.inc(447);Pairing_Heap<Integer> cat = new Pairing_Heap<>();
		__CLR4_4_16f6fl9ktacf9.R.inc(448);cat.checkPriority(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(449);cat.push(apple);
		__CLR4_4_16f6fl9ktacf9.R.inc(450);cat.push(banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(451);assertEquals(apple.getLeftSon(), banana);
		__CLR4_4_16f6fl9ktacf9.R.inc(452);cat.checkPriority(apple);

		__CLR4_4_16f6fl9ktacf9.R.inc(453);banana.setData(5);
		__CLR4_4_16f6fl9ktacf9.R.inc(454);Heap_Item<Integer> dog = new Heap_Item<>(100);
		__CLR4_4_16f6fl9ktacf9.R.inc(455);dog.setRightSon(new Heap_Item<>(1));
		__CLR4_4_16f6fl9ktacf9.R.inc(456);apple.setLeftSon(dog);
		__CLR4_4_16f6fl9ktacf9.R.inc(457);apple.setRightSon(new Heap_Item<>(1));
		__CLR4_4_16f6fl9ktacf9.R.inc(458);Heap_Item<Integer> egg = new Heap_Item<>(7);
		__CLR4_4_16f6fl9ktacf9.R.inc(459);egg.setRightSon(new Heap_Item<>(8));
		__CLR4_4_16f6fl9ktacf9.R.inc(460);banana.setRightSon(egg);
		__CLR4_4_16f6fl9ktacf9.R.inc(461);Heap_Item<Integer> fish = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(462);Heap_Item<Integer> girl = new Heap_Item<>(3);
		__CLR4_4_16f6fl9ktacf9.R.inc(463);fish.setAncestor(girl);
		__CLR4_4_16f6fl9ktacf9.R.inc(464);fish.setRightSon(new Heap_Item<>(2));
		__CLR4_4_16f6fl9ktacf9.R.inc(465);girl.setLeftSon(fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(466);fish.setRightSon(new Heap_Item<>(4));
		__CLR4_4_16f6fl9ktacf9.R.inc(467);apple.setAncestor(fish);
		__CLR4_4_16f6fl9ktacf9.R.inc(468);cat.checkPriority(apple);
	}finally{__CLR4_4_16f6fl9ktacf9.R.flushNeeded();}}
}
