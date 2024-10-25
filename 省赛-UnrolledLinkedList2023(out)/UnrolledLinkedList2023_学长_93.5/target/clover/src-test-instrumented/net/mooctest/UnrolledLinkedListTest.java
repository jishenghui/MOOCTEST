/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

import org.junit.Test;

import net.mooctest.UnrolledLinkedList.ULLIterator;

public class UnrolledLinkedListTest {static class __CLR4_4_1d7d7loux02ai{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0030\u0035\u0038\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0055\u006e\u0072\u006f\u006c\u006c\u0065\u0064\u004c\u0069\u006e\u006b\u0065\u0064\u004c\u0069\u0073\u0074\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1699759637631L,8589935092L,772,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test(timeout = 2000)
	public void test() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),475,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3d7(){try{__CLR4_4_1d7d7loux02ai.R.inc(475);
		__CLR4_4_1d7d7loux02ai.R.inc(476);UnrolledLinkedList<Integer> unrolledLinkedList0 = new UnrolledLinkedList<Integer>();
		__CLR4_4_1d7d7loux02ai.R.inc(477);assertEquals(0, unrolledLinkedList0.size());
		__CLR4_4_1d7d7loux02ai.R.inc(478);assertTrue(unrolledLinkedList0.isEmpty());
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}

	@Test
	public void test1() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beudb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beudb(){try{__CLR4_4_1d7d7loux02ai.R.inc(479);
		__CLR4_4_1d7d7loux02ai.R.inc(480);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(481);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(482)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(483)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(484);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(485);try {
			__CLR4_4_1d7d7loux02ai.R.inc(486);for (int i = 0; (((i < 9)&&(__CLR4_4_1d7d7loux02ai.R.iget(487)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(488)==0&false)); i++) {{
				__CLR4_4_1d7d7loux02ai.R.inc(489);assertNotNull(uLinkedList.remove(i));
			}
		}} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(490);try {
		__CLR4_4_1d7d7loux02ai.R.inc(491);uLinkedList.remove(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		__CLR4_4_1d7d7loux02ai.R.inc(492);try {
			__CLR4_4_1d7d7loux02ai.R.inc(493);UnrolledLinkedList<Integer> uLinkedList1 = new UnrolledLinkedList<>(2);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(494);UnrolledLinkedList<Integer> uLinkedList2 = new UnrolledLinkedList<>(8);
		__CLR4_4_1d7d7loux02ai.R.inc(495);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(496)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(497)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(498);uLinkedList2.add(i);
		}
	
		}__CLR4_4_1d7d7loux02ai.R.inc(499);try {
			__CLR4_4_1d7d7loux02ai.R.inc(500);uLinkedList.add(-1,2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(501);try {
			__CLR4_4_1d7d7loux02ai.R.inc(502);uLinkedList.add(20,2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(503);for (int i = 0; (((i < 5)&&(__CLR4_4_1d7d7loux02ai.R.iget(504)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(505)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(506);uLinkedList.add(i,i++);
			
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(507);UnrolledLinkedList<Integer> uLinkedList3 = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(508);for (int i = 0; (((i < 5)&&(__CLR4_4_1d7d7loux02ai.R.iget(509)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(510)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(511);uLinkedList3.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(512);uLinkedList3.add(1,2);
		__CLR4_4_1d7d7loux02ai.R.inc(513);ArrayList<Integer> list = new ArrayList<Integer>();
	
		
		__CLR4_4_1d7d7loux02ai.R.inc(514);list.add(1);
		__CLR4_4_1d7d7loux02ai.R.inc(515);list.add(2);
		
		__CLR4_4_1d7d7loux02ai.R.inc(516);assertTrue(uLinkedList3.addAll(list));
		__CLR4_4_1d7d7loux02ai.R.inc(517);uLinkedList.clear();
		__CLR4_4_1d7d7loux02ai.R.inc(518);uLinkedList2.clear();
		__CLR4_4_1d7d7loux02ai.R.inc(519);uLinkedList3.clear();
		__CLR4_4_1d7d7loux02ai.R.inc(520);try {
			__CLR4_4_1d7d7loux02ai.R.inc(521);uLinkedList3.addAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test2() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bei(){try{__CLR4_4_1d7d7loux02ai.R.inc(522);
		__CLR4_4_1d7d7loux02ai.R.inc(523);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(524);UnrolledLinkedList<Integer> uLinkedList1 = new UnrolledLinkedList<>();
		
		__CLR4_4_1d7d7loux02ai.R.inc(525);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(526)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(527)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(528);uLinkedList.add(i);
		}
		
		}__CLR4_4_1d7d7loux02ai.R.inc(529);assertTrue(uLinkedList.contains(2));
		__CLR4_4_1d7d7loux02ai.R.inc(530);assertFalse(uLinkedList.contains(-1));
		__CLR4_4_1d7d7loux02ai.R.inc(531);uLinkedList1.firstNode.elements[1] = null;
		__CLR4_4_1d7d7loux02ai.R.inc(532);assertEquals(-1, uLinkedList.indexOf(null));
		__CLR4_4_1d7d7loux02ai.R.inc(533);ArrayList<Integer> list = new ArrayList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(534);ArrayList<Integer> list1 = new ArrayList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(535);list1.add(20);
		__CLR4_4_1d7d7loux02ai.R.inc(536);list.add(1);
		__CLR4_4_1d7d7loux02ai.R.inc(537);list.add(2);
		__CLR4_4_1d7d7loux02ai.R.inc(538);assertTrue(uLinkedList.containsAll(list));
		__CLR4_4_1d7d7loux02ai.R.inc(539);assertFalse(uLinkedList.containsAll(list1));
		__CLR4_4_1d7d7loux02ai.R.inc(540);try {
			__CLR4_4_1d7d7loux02ai.R.inc(541);uLinkedList.containsAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test3() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsf2(){try{__CLR4_4_1d7d7loux02ai.R.inc(542);
		__CLR4_4_1d7d7loux02ai.R.inc(543);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		
		__CLR4_4_1d7d7loux02ai.R.inc(544);try {
			__CLR4_4_1d7d7loux02ai.R.inc(545);uLinkedList.get(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(546);try {
			__CLR4_4_1d7d7loux02ai.R.inc(547);uLinkedList.get(2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		
		__CLR4_4_1d7d7loux02ai.R.inc(548);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(549)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(550)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(551);uLinkedList.add(i);
		}
		
		}__CLR4_4_1d7d7loux02ai.R.inc(552);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(553)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(554)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(555);assertNotNull(uLinkedList.get(i));
		}
		
	
	}}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test4() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),556,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9fg(){try{__CLR4_4_1d7d7loux02ai.R.inc(556);
		__CLR4_4_1d7d7loux02ai.R.inc(557);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();

		
		__CLR4_4_1d7d7loux02ai.R.inc(558);try {
			__CLR4_4_1d7d7loux02ai.R.inc(559);uLinkedList.set(-1, 2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(560);try {
			__CLR4_4_1d7d7loux02ai.R.inc(561);uLinkedList.set(2, 2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	

		__CLR4_4_1d7d7loux02ai.R.inc(562);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(563)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(564)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(565);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(566);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(567)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(568)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(569);uLinkedList.set(i, i++);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(570);assertFalse(uLinkedList.isEmpty());
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test5() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),571,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqfv(){try{__CLR4_4_1d7d7loux02ai.R.inc(571);
		__CLR4_4_1d7d7loux02ai.R.inc(572);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
//		UnrolledLinkedList.ULLIterator uIterator1 = (ULLIterator) uLinkedList.iterator();
		__CLR4_4_1d7d7loux02ai.R.inc(573);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(574)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(575)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(576);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(577);UnrolledLinkedList.ULLIterator uIterator = (ULLIterator) uLinkedList.iterator();
		__CLR4_4_1d7d7loux02ai.R.inc(578);UnrolledLinkedList.ULLIterator uIterator1 = (ULLIterator) uLinkedList.listIterator();
		__CLR4_4_1d7d7loux02ai.R.inc(579);uIterator.add(2);
		__CLR4_4_1d7d7loux02ai.R.inc(580);try {
			__CLR4_4_1d7d7loux02ai.R.inc(581);uIterator.checkForModification();
		} catch (ConcurrentModificationException e) {
			// TODO: handle exception
		}

		__CLR4_4_1d7d7loux02ai.R.inc(582);assertTrue(uIterator.hasNext());
		__CLR4_4_1d7d7loux02ai.R.inc(583);assertFalse(uIterator.hasPrevious());
//		assertFalse(uIterator1.hasPrevious());
		__CLR4_4_1d7d7loux02ai.R.inc(584);try {
			__CLR4_4_1d7d7loux02ai.R.inc(585);uIterator.previous();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test6() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d7ga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),586,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d7ga(){try{__CLR4_4_1d7d7loux02ai.R.inc(586);
		__CLR4_4_1d7d7loux02ai.R.inc(587);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(588);UnrolledLinkedList<Integer> uLinkedList1 = new UnrolledLinkedList<>();
//		UnrolledLinkedList.ULLIterator uIterator1 = (ULLIterator) uLinkedList.iterator();
		__CLR4_4_1d7d7loux02ai.R.inc(589);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(590)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(591)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(592);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(593);assertEquals(-1, uLinkedList.lastIndexOf(null));
		__CLR4_4_1d7d7loux02ai.R.inc(594);assertEquals(2, uLinkedList.lastIndexOf(2));
		__CLR4_4_1d7d7loux02ai.R.inc(595);assertEquals(-1, uLinkedList.lastIndexOf(20));
		
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test7() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw645ogk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw645ogk(){try{__CLR4_4_1d7d7loux02ai.R.inc(596);
		__CLR4_4_1d7d7loux02ai.R.inc(597);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(598);try {
			__CLR4_4_1d7d7loux02ai.R.inc(599);uLinkedList.listIterator(2);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(600);try {
			__CLR4_4_1d7d7loux02ai.R.inc(601);uLinkedList.listIterator(-1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(602);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(603)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(604)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(605);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(606);uLinkedList.listIterator(2);
		__CLR4_4_1d7d7loux02ai.R.inc(607);uLinkedList.listIterator(9);
		__CLR4_4_1d7d7loux02ai.R.inc(608);uLinkedList.listIterator(10);
		__CLR4_4_1d7d7loux02ai.R.inc(609);UnrolledLinkedList.Node node = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(610);node.next = node;
		__CLR4_4_1d7d7loux02ai.R.inc(611);UnrolledLinkedList.Node node1 = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(612);UnrolledLinkedList.Node node2 = uLinkedList.new Node();
		
		__CLR4_4_1d7d7loux02ai.R.inc(613);node1.next = node1;
		__CLR4_4_1d7d7loux02ai.R.inc(614);node1.next = null;
		__CLR4_4_1d7d7loux02ai.R.inc(615);uLinkedList.mergeWithNextNode(node);
//		uLinkedList.mergeWithNextNode(uLinkedList.new Node());
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test8() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r562y5h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),616,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r562y5h4(){try{__CLR4_4_1d7d7loux02ai.R.inc(616);
		__CLR4_4_1d7d7loux02ai.R.inc(617);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(618);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(619)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(620)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(621);uLinkedList.add(i);
		}
		
		}__CLR4_4_1d7d7loux02ai.R.inc(622);assertFalse(uLinkedList.remove(null));
//		assertTrue(uLinkedList.remove(2));
		
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test9() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue61qmhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue61qmhb(){try{__CLR4_4_1d7d7loux02ai.R.inc(623);
		__CLR4_4_1d7d7loux02ai.R.inc(624);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(625);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(626)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(627)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(628);uLinkedList.add(i);
		}
		
		
		}__CLR4_4_1d7d7loux02ai.R.inc(629);assertTrue(uLinkedList.remove(new Integer(2)));
		__CLR4_4_1d7d7loux02ai.R.inc(630);assertFalse(uLinkedList.remove(new Integer(20)));
		__CLR4_4_1d7d7loux02ai.R.inc(631);ArrayList<Integer> arrayList = new ArrayList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(632);ArrayList<Integer> arrayList1 = new ArrayList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(633);arrayList1.add(3);
		__CLR4_4_1d7d7loux02ai.R.inc(634);arrayList1.add(20);
		__CLR4_4_1d7d7loux02ai.R.inc(635);arrayList.add(2);
		__CLR4_4_1d7d7loux02ai.R.inc(636);arrayList.add(3);
		__CLR4_4_1d7d7loux02ai.R.inc(637);try {
			__CLR4_4_1d7d7loux02ai.R.inc(638);uLinkedList.removeAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(639);try {
			__CLR4_4_1d7d7loux02ai.R.inc(640);uLinkedList.retainAll(null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(641);assertTrue(uLinkedList.removeAll(arrayList));
		__CLR4_4_1d7d7loux02ai.R.inc(642);assertTrue(uLinkedList.retainAll(arrayList));
		__CLR4_4_1d7d7loux02ai.R.inc(643);assertFalse(uLinkedList.retainAll(arrayList1));
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test10() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwhw(){try{__CLR4_4_1d7d7loux02ai.R.inc(644);
		__CLR4_4_1d7d7loux02ai.R.inc(645);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(646);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(647)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(648)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(649);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(650);assertNotNull(uLinkedList.toArray());
		__CLR4_4_1d7d7loux02ai.R.inc(651);Integer[] a = {1,2,3,4};
		__CLR4_4_1d7d7loux02ai.R.inc(652);Integer[] a1 = new Integer[18];
		__CLR4_4_1d7d7loux02ai.R.inc(653);assertNotNull(uLinkedList.toArray(a));
		__CLR4_4_1d7d7loux02ai.R.inc(654);assertNotNull(uLinkedList.toArray(a1));
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test11() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonzndi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonzndi7(){try{__CLR4_4_1d7d7loux02ai.R.inc(655);
		__CLR4_4_1d7d7loux02ai.R.inc(656);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(657);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(658)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(659)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(660);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(661);UnrolledLinkedList.ULLIterator uIterator = (UnrolledLinkedList.ULLIterator)uLinkedList.iterator();

		__CLR4_4_1d7d7loux02ai.R.inc(662);assertEquals(1, uIterator.next());
		__CLR4_4_1d7d7loux02ai.R.inc(663);try {
			__CLR4_4_1d7d7loux02ai.R.inc(664);uIterator.ptr = 20;
			__CLR4_4_1d7d7loux02ai.R.inc(665);uIterator.next();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(666);uIterator.ptr = 20;
		__CLR4_4_1d7d7loux02ai.R.inc(667);uIterator.currentNode.next = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(668);uIterator.next();
		__CLR4_4_1d7d7loux02ai.R.inc(669);assertEquals(3, uIterator.nextIndex());
		__CLR4_4_1d7d7loux02ai.R.inc(670);assertEquals(1, uIterator.previousIndex());
		__CLR4_4_1d7d7loux02ai.R.inc(671);uIterator.ptr = 0;
//		uIterator.remove();
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test12() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3jaio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),672,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3jaio(){try{__CLR4_4_1d7d7loux02ai.R.inc(672);
		__CLR4_4_1d7d7loux02ai.R.inc(673);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(674);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(675)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(676)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(677);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(678);UnrolledLinkedList.ULLIterator uIterator = (UnrolledLinkedList.ULLIterator)uLinkedList.iterator();
		__CLR4_4_1d7d7loux02ai.R.inc(679);uIterator.set(3);
		__CLR4_4_1d7d7loux02ai.R.inc(680);uIterator.remove();
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test13() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qtix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),681,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qtix(){try{__CLR4_4_1d7d7loux02ai.R.inc(681);
		__CLR4_4_1d7d7loux02ai.R.inc(682);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(683);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(684)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(685)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(686);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(687);UnrolledLinkedList.ULLIterator uIterator = (UnrolledLinkedList.ULLIterator)uLinkedList.iterator();
		__CLR4_4_1d7d7loux02ai.R.inc(688);uIterator.ptr = 2;
		__CLR4_4_1d7d7loux02ai.R.inc(689);uIterator.previous();
		__CLR4_4_1d7d7loux02ai.R.inc(690);uIterator.ptr = 0;
		
		__CLR4_4_1d7d7loux02ai.R.inc(691);uIterator.currentNode.previous = uLinkedList.new Node();
		
		__CLR4_4_1d7d7loux02ai.R.inc(692);try {
			__CLR4_4_1d7d7loux02ai.R.inc(693);uIterator.previous();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test14() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5ycja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5ycja(){try{__CLR4_4_1d7d7loux02ai.R.inc(694);
		__CLR4_4_1d7d7loux02ai.R.inc(695);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(696);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(697)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(698)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(699);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(700);uLinkedList.firstNode.numElements = 1;
		__CLR4_4_1d7d7loux02ai.R.inc(701);try {
			__CLR4_4_1d7d7loux02ai.R.inc(702);uLinkedList.add(1,2);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(703);try {
			__CLR4_4_1d7d7loux02ai.R.inc(704);uLinkedList.add(8,2);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(705);try {
			__CLR4_4_1d7d7loux02ai.R.inc(706);uLinkedList.remove(1);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(707);try {
			__CLR4_4_1d7d7loux02ai.R.inc(708);uLinkedList.remove(8);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test15() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75vjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75vjp(){try{__CLR4_4_1d7d7loux02ai.R.inc(709);
		__CLR4_4_1d7d7loux02ai.R.inc(710);UnrolledLinkedList<String> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(711);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(712)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(713)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(714);uLinkedList.add("a"+i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(715);uLinkedList.add(null);
		__CLR4_4_1d7d7loux02ai.R.inc(716);assertEquals(10, uLinkedList.indexOf(null));
		__CLR4_4_1d7d7loux02ai.R.inc(717);uLinkedList.add(null);
		__CLR4_4_1d7d7loux02ai.R.inc(718);assertEquals(11, uLinkedList.lastIndexOf(null));
		
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test16() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8dejz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8dejz(){try{__CLR4_4_1d7d7loux02ai.R.inc(719);
		__CLR4_4_1d7d7loux02ai.R.inc(720);UnrolledLinkedList<String> uLinkedList = new UnrolledLinkedList<>();
		__CLR4_4_1d7d7loux02ai.R.inc(721);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(722)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(723)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(724);uLinkedList.add("a"+i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(725);uLinkedList.firstNode.numElements = 1;
		__CLR4_4_1d7d7loux02ai.R.inc(726);try {
			__CLR4_4_1d7d7loux02ai.R.inc(727);uLinkedList.listIterator(2);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(728);try {
			__CLR4_4_1d7d7loux02ai.R.inc(729);uLinkedList.listIterator(8);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test17() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kxka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),730,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kxka(){try{__CLR4_4_1d7d7loux02ai.R.inc(730);
		__CLR4_4_1d7d7loux02ai.R.inc(731);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		__CLR4_4_1d7d7loux02ai.R.inc(732);UnrolledLinkedList.Node uNode = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(733);UnrolledLinkedList.Node uNode1 = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(734);uNode.next = uNode1;
		__CLR4_4_1d7d7loux02ai.R.inc(735);uNode.numElements = 8;
		__CLR4_4_1d7d7loux02ai.R.inc(736);uLinkedList.insertIntoNode(uNode, 2, 3);
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	@Test
	public void test18() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1elgasgkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test18",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1elgasgkh(){try{__CLR4_4_1d7d7loux02ai.R.inc(737);
		__CLR4_4_1d7d7loux02ai.R.inc(738);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		__CLR4_4_1d7d7loux02ai.R.inc(739);UnrolledLinkedList.Node uNode = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(740);UnrolledLinkedList.Node uNode1 = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(741);uNode.next = uNode1;
		__CLR4_4_1d7d7loux02ai.R.inc(742);uNode1.numElements = 1;
		__CLR4_4_1d7d7loux02ai.R.inc(743);uNode.numElements = 6;
		__CLR4_4_1d7d7loux02ai.R.inc(744);uLinkedList.removeFromNode(uNode, 2);
		__CLR4_4_1d7d7loux02ai.R.inc(745);UnrolledLinkedList.Node uNode3 = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(746);UnrolledLinkedList.Node uNode4 = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(747);uNode3.next = uNode;
		__CLR4_4_1d7d7loux02ai.R.inc(748);uNode3.previous = uNode4;
		__CLR4_4_1d7d7loux02ai.R.inc(749);uNode4.numElements = 1;
		__CLR4_4_1d7d7loux02ai.R.inc(750);uNode3.numElements = 6;
		__CLR4_4_1d7d7loux02ai.R.inc(751);try {
			__CLR4_4_1d7d7loux02ai.R.inc(752);uLinkedList.removeFromNode(uNode3, 0);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}

	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	@Test
	public void test19() {__CLR4_4_1d7d7loux02ai.R.globalSliceStart(getClass().getName(),753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1bcgbzzkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1d7d7loux02ai.R.rethrow($CLV_t2$);}finally{__CLR4_4_1d7d7loux02ai.R.globalSliceEnd(getClass().getName(),"net.mooctest.UnrolledLinkedListTest.test19",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1bcgbzzkx(){try{__CLR4_4_1d7d7loux02ai.R.inc(753);
		__CLR4_4_1d7d7loux02ai.R.inc(754);UnrolledLinkedList<Integer> uLinkedList = new UnrolledLinkedList<>(8);
		__CLR4_4_1d7d7loux02ai.R.inc(755);for (int i = 0; (((i < 10)&&(__CLR4_4_1d7d7loux02ai.R.iget(756)!=0|true))||(__CLR4_4_1d7d7loux02ai.R.iget(757)==0&false)); i++) {{
			__CLR4_4_1d7d7loux02ai.R.inc(758);uLinkedList.add(i);
		}
		}__CLR4_4_1d7d7loux02ai.R.inc(759);UnrolledLinkedList.Node uNode = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(760);UnrolledLinkedList.Node uNode1 = uLinkedList.new Node();
		__CLR4_4_1d7d7loux02ai.R.inc(761);uNode.next = uNode1;
		__CLR4_4_1d7d7loux02ai.R.inc(762);uNode1.numElements = 1;
		__CLR4_4_1d7d7loux02ai.R.inc(763);uNode.numElements = 6;
		__CLR4_4_1d7d7loux02ai.R.inc(764);uLinkedList.firstNode.numElements=2;
		__CLR4_4_1d7d7loux02ai.R.inc(765);uLinkedList.set(2,3);
		__CLR4_4_1d7d7loux02ai.R.inc(766);uLinkedList.get(2);
		__CLR4_4_1d7d7loux02ai.R.inc(767);uLinkedList.lastNode.numElements=2;
		__CLR4_4_1d7d7loux02ai.R.inc(768);try {
			__CLR4_4_1d7d7loux02ai.R.inc(769);uLinkedList.set(5,3);
		} catch (Exception e) {
			// TODO: handle exception
		}
		__CLR4_4_1d7d7loux02ai.R.inc(770);try {
			__CLR4_4_1d7d7loux02ai.R.inc(771);uLinkedList.get(5);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}finally{__CLR4_4_1d7d7loux02ai.R.flushNeeded();}}
	
	
}
