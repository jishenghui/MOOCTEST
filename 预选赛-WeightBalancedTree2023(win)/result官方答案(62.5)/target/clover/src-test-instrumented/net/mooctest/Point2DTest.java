/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Point2DTest {static class __CLR4_4_1h0h0lo0x9trw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946107870L,8589935092L,636,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test() {__CLR4_4_1h0h0lo0x9trw.R.globalSliceStart(getClass().getName(),612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3h0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0h0lo0x9trw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0h0lo0x9trw.R.globalSliceEnd(getClass().getName(),"net.mooctest.Point2DTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3h0(){try{__CLR4_4_1h0h0lo0x9trw.R.inc(612);
        __CLR4_4_1h0h0lo0x9trw.R.inc(613);Point2D point2D = new Point2D();
        __CLR4_4_1h0h0lo0x9trw.R.inc(614);assertEquals(2, point2D.getDim());

        __CLR4_4_1h0h0lo0x9trw.R.inc(615);point2D = new Point2D(1, 2);
        __CLR4_4_1h0h0lo0x9trw.R.inc(616);assertEquals(1, point2D.get(0), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(617);assertEquals(1, point2D.getX(), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(618);assertEquals(2, point2D.getY(), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(619);assertEquals("(1.0,2.0)", point2D.toString());

        __CLR4_4_1h0h0lo0x9trw.R.inc(620);float[] coord = {1, 2};
        __CLR4_4_1h0h0lo0x9trw.R.inc(621);point2D = new Point2D(coord);
        __CLR4_4_1h0h0lo0x9trw.R.inc(622);assertEquals(1, point2D.get(0), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(623);assertEquals(1, point2D.getX(), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(624);assertEquals(2, point2D.getY(), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(625);assertEquals("(1.0,2.0)", point2D.toString());

        __CLR4_4_1h0h0lo0x9trw.R.inc(626);point2D = new Point2D(point2D);
        __CLR4_4_1h0h0lo0x9trw.R.inc(627);assertEquals(1, point2D.get(0), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(628);assertEquals(1, point2D.getX(), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(629);assertEquals(2, point2D.getY(), 0.0001);
        __CLR4_4_1h0h0lo0x9trw.R.inc(630);assertEquals("(1.0,2.0)", point2D.toString());

    }finally{__CLR4_4_1h0h0lo0x9trw.R.flushNeeded();}}

    @Test
    public void getDim() {__CLR4_4_1h0h0lo0x9trw.R.globalSliceStart(getClass().getName(),631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jo6jl3hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0h0lo0x9trw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0h0lo0x9trw.R.globalSliceEnd(getClass().getName(),"net.mooctest.Point2DTest.getDim",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jo6jl3hj(){try{__CLR4_4_1h0h0lo0x9trw.R.inc(631);
    }finally{__CLR4_4_1h0h0lo0x9trw.R.flushNeeded();}}

    @Test
    public void get() {__CLR4_4_1h0h0lo0x9trw.R.globalSliceStart(getClass().getName(),632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1o9onqbhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0h0lo0x9trw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0h0lo0x9trw.R.globalSliceEnd(getClass().getName(),"net.mooctest.Point2DTest.get",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),632,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1o9onqbhk(){try{__CLR4_4_1h0h0lo0x9trw.R.inc(632);
    }finally{__CLR4_4_1h0h0lo0x9trw.R.flushNeeded();}}

    @Test
    public void getX() {__CLR4_4_1h0h0lo0x9trw.R.globalSliceStart(getClass().getName(),633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hsx16fhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0h0lo0x9trw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0h0lo0x9trw.R.globalSliceEnd(getClass().getName(),"net.mooctest.Point2DTest.getX",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hsx16fhl(){try{__CLR4_4_1h0h0lo0x9trw.R.inc(633);
    }finally{__CLR4_4_1h0h0lo0x9trw.R.flushNeeded();}}

    @Test
    public void getY() {__CLR4_4_1h0h0lo0x9trw.R.globalSliceStart(getClass().getName(),634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ejx2dyhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0h0lo0x9trw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0h0lo0x9trw.R.globalSliceEnd(getClass().getName(),"net.mooctest.Point2DTest.getY",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),634,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ejx2dyhm(){try{__CLR4_4_1h0h0lo0x9trw.R.inc(634);
    }finally{__CLR4_4_1h0h0lo0x9trw.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_4_1h0h0lo0x9trw.R.globalSliceStart(getClass().getName(),635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hrxdidhn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1h0h0lo0x9trw.R.rethrow($CLV_t2$);}finally{__CLR4_4_1h0h0lo0x9trw.R.globalSliceEnd(getClass().getName(),"net.mooctest.Point2DTest.testToString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hrxdidhn(){try{__CLR4_4_1h0h0lo0x9trw.R.inc(635);
    }finally{__CLR4_4_1h0h0lo0x9trw.R.flushNeeded();}}
}