/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class BJTreeTest {static class __CLR4_4_1eieilo0x9trh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946107870L,8589935092L,595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void find() throws Exception {__CLR4_4_1eieilo0x9trh.R.globalSliceStart(getClass().getName(),522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sfy5nkei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eieilo0x9trh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eieilo0x9trh.R.globalSliceEnd(getClass().getName(),"net.mooctest.BJTreeTest.find",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),522,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sfy5nkei() throws Exception{try{__CLR4_4_1eieilo0x9trh.R.inc(522);
        __CLR4_4_1eieilo0x9trh.R.inc(523);BJTree<Integer, Integer> tree = new BJTree<>();
        __CLR4_4_1eieilo0x9trh.R.inc(524);tree.insert(1, 1, 1);
        __CLR4_4_1eieilo0x9trh.R.inc(525);tree.insert(2, 2, 2);
        __CLR4_4_1eieilo0x9trh.R.inc(526);tree.insert(3, 3, 3);

        __CLR4_4_1eieilo0x9trh.R.inc(527);assertEquals(1, (int)tree.find(1));
        __CLR4_4_1eieilo0x9trh.R.inc(528);assertEquals(2, (int)tree.find(2));
        __CLR4_4_1eieilo0x9trh.R.inc(529);assertEquals(3, (int)tree.find(3));

        __CLR4_4_1eieilo0x9trh.R.inc(530);tree.delete(1);
        __CLR4_4_1eieilo0x9trh.R.inc(531);assertNull(tree.find(1));

        __CLR4_4_1eieilo0x9trh.R.inc(532);tree.clear();
        __CLR4_4_1eieilo0x9trh.R.inc(533);assertNull(tree.find(2));

        // make tree imbalanced
        __CLR4_4_1eieilo0x9trh.R.inc(534);tree.insert(1, 1, 1);
        __CLR4_4_1eieilo0x9trh.R.inc(535);tree.insert(2, 2, 2);
        __CLR4_4_1eieilo0x9trh.R.inc(536);tree.insert(3, 3, 3);
        __CLR4_4_1eieilo0x9trh.R.inc(537);tree.insert(4, 4, 4);
        __CLR4_4_1eieilo0x9trh.R.inc(538);tree.insert(5, 5, 5);
        __CLR4_4_1eieilo0x9trh.R.inc(539);tree.insert(6, 6, 6);
        __CLR4_4_1eieilo0x9trh.R.inc(540);tree.insert(7, 7, 7);
        __CLR4_4_1eieilo0x9trh.R.inc(541);tree.insert(8, 8, 8);
        __CLR4_4_1eieilo0x9trh.R.inc(542);tree.insert(9, 9, 9);
    }finally{__CLR4_4_1eieilo0x9trh.R.flushNeeded();}}

    @Test
    public void getPreorderList() throws Exception {__CLR4_4_1eieilo0x9trh.R.globalSliceStart(getClass().getName(),543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zc1mjef3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eieilo0x9trh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eieilo0x9trh.R.globalSliceEnd(getClass().getName(),"net.mooctest.BJTreeTest.getPreorderList",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),543,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zc1mjef3() throws Exception{try{__CLR4_4_1eieilo0x9trh.R.inc(543);
        __CLR4_4_1eieilo0x9trh.R.inc(544);BJTree<Integer, Integer> tree = new BJTree<>();
        __CLR4_4_1eieilo0x9trh.R.inc(545);tree.insert(1, 1, 1);
        __CLR4_4_1eieilo0x9trh.R.inc(546);tree.insert(2, 2, 2);
        __CLR4_4_1eieilo0x9trh.R.inc(547);tree.insert(3, 3, 3);

        __CLR4_4_1eieilo0x9trh.R.inc(548);assertEquals("[(2) wt: 6.0, [1 1] wt: 1.0, (3) wt: 5.0, [2 2] wt: 2.0, [3 3] wt: 3.0]", tree.getPreorderList().toString());

        __CLR4_4_1eieilo0x9trh.R.inc(549);tree.clear();
        __CLR4_4_1eieilo0x9trh.R.inc(550);assertEquals("[]", tree.getPreorderList().toString());
    }finally{__CLR4_4_1eieilo0x9trh.R.flushNeeded();}}

    @Test
    public void getMin() throws Exception {__CLR4_4_1eieilo0x9trh.R.globalSliceStart(getClass().getName(),551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ze99erfb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eieilo0x9trh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eieilo0x9trh.R.globalSliceEnd(getClass().getName(),"net.mooctest.BJTreeTest.getMin",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ze99erfb() throws Exception{try{__CLR4_4_1eieilo0x9trh.R.inc(551);
        __CLR4_4_1eieilo0x9trh.R.inc(552);BJTree<Integer, Integer> tree = new BJTree<>();
        __CLR4_4_1eieilo0x9trh.R.inc(553);tree.insert(1, 1, 1);
        __CLR4_4_1eieilo0x9trh.R.inc(554);tree.insert(2, 2, 2);
        __CLR4_4_1eieilo0x9trh.R.inc(555);tree.insert(3, 3, 3);

        __CLR4_4_1eieilo0x9trh.R.inc(556);assertEquals(1, (int)tree.getMin());

        __CLR4_4_1eieilo0x9trh.R.inc(557);tree.clear();
        __CLR4_4_1eieilo0x9trh.R.inc(558);assertNull(tree.getMin());
    }finally{__CLR4_4_1eieilo0x9trh.R.flushNeeded();}}

    @Test
    public void getMax() throws Exception {__CLR4_4_1eieilo0x9trh.R.globalSliceStart(getClass().getName(),559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rse72jfj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eieilo0x9trh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eieilo0x9trh.R.globalSliceEnd(getClass().getName(),"net.mooctest.BJTreeTest.getMax",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rse72jfj() throws Exception{try{__CLR4_4_1eieilo0x9trh.R.inc(559);
        __CLR4_4_1eieilo0x9trh.R.inc(560);BJTree<Integer, Integer> tree = new BJTree<>();
        __CLR4_4_1eieilo0x9trh.R.inc(561);tree.insert(1, 1, 1);
        __CLR4_4_1eieilo0x9trh.R.inc(562);tree.insert(2, 2, 2);
        __CLR4_4_1eieilo0x9trh.R.inc(563);tree.insert(3, 3, 3);

        __CLR4_4_1eieilo0x9trh.R.inc(564);assertEquals(3, (int)tree.getMax());

        __CLR4_4_1eieilo0x9trh.R.inc(565);tree.clear();
        __CLR4_4_1eieilo0x9trh.R.inc(566);assertNull(tree.getMax());
    }finally{__CLR4_4_1eieilo0x9trh.R.flushNeeded();}}

    @Test
    public void findDown() throws Exception {__CLR4_4_1eieilo0x9trh.R.globalSliceStart(getClass().getName(),567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnju3ifr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eieilo0x9trh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eieilo0x9trh.R.globalSliceEnd(getClass().getName(),"net.mooctest.BJTreeTest.findDown",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),567,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnju3ifr() throws Exception{try{__CLR4_4_1eieilo0x9trh.R.inc(567);
        __CLR4_4_1eieilo0x9trh.R.inc(568);BJTree<Integer, Integer> tree = new BJTree<>();
        __CLR4_4_1eieilo0x9trh.R.inc(569);tree.insert(1, 1, 1);
        __CLR4_4_1eieilo0x9trh.R.inc(570);tree.insert(2, 2, 2);
        __CLR4_4_1eieilo0x9trh.R.inc(571);tree.insert(3, 3, 3);
        __CLR4_4_1eieilo0x9trh.R.inc(572);tree.insert(4, 4, 4);
        __CLR4_4_1eieilo0x9trh.R.inc(573);tree.insert(5, 5, 5);
        __CLR4_4_1eieilo0x9trh.R.inc(574);tree.insert(6, 6, 6);
        __CLR4_4_1eieilo0x9trh.R.inc(575);tree.insert(7, 7, 7);
        __CLR4_4_1eieilo0x9trh.R.inc(576);tree.insert(8, 8, 8);
        __CLR4_4_1eieilo0x9trh.R.inc(577);tree.insert(9, 9, 9);

        __CLR4_4_1eieilo0x9trh.R.inc(578);assertEquals(5, (int)tree.findDown(5));

        __CLR4_4_1eieilo0x9trh.R.inc(579);tree.clear();
        __CLR4_4_1eieilo0x9trh.R.inc(580);assertNull(tree.findDown(1));
    }finally{__CLR4_4_1eieilo0x9trh.R.flushNeeded();}}

    @Test
    public void findUp() throws Exception {__CLR4_4_1eieilo0x9trh.R.globalSliceStart(getClass().getName(),581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1426mmdg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eieilo0x9trh.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eieilo0x9trh.R.globalSliceEnd(getClass().getName(),"net.mooctest.BJTreeTest.findUp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),581,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1426mmdg5() throws Exception{try{__CLR4_4_1eieilo0x9trh.R.inc(581);
        __CLR4_4_1eieilo0x9trh.R.inc(582);BJTree<Integer, Integer> tree = new BJTree<>();
        __CLR4_4_1eieilo0x9trh.R.inc(583);tree.insert(1, 1, 1);
        __CLR4_4_1eieilo0x9trh.R.inc(584);tree.insert(2, 2, 2);
        __CLR4_4_1eieilo0x9trh.R.inc(585);tree.insert(3, 3, 3);
        __CLR4_4_1eieilo0x9trh.R.inc(586);tree.insert(4, 4, 4);
        __CLR4_4_1eieilo0x9trh.R.inc(587);tree.insert(5, 5, 5);
        __CLR4_4_1eieilo0x9trh.R.inc(588);tree.insert(6, 6, 6);
        __CLR4_4_1eieilo0x9trh.R.inc(589);tree.insert(7, 7, 7);
        __CLR4_4_1eieilo0x9trh.R.inc(590);tree.insert(8, 8, 8);
        __CLR4_4_1eieilo0x9trh.R.inc(591);tree.insert(9, 9, 9);

        __CLR4_4_1eieilo0x9trh.R.inc(592);assertEquals(5, (int)tree.findUp(5));

        __CLR4_4_1eieilo0x9trh.R.inc(593);tree.clear();
        __CLR4_4_1eieilo0x9trh.R.inc(594);assertNull(tree.findUp(1));
    }finally{__CLR4_4_1eieilo0x9trh.R.flushNeeded();}}
}