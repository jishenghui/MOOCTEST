/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

public class AirportTest {static class __CLR4_4_1dqdqlo0x9tr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946107870L,8589935092L,522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test() {__CLR4_4_1dqdqlo0x9tr6.R.globalSliceStart(getClass().getName(),494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dqdqlo0x9tr6.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dqdqlo0x9tr6.R.globalSliceEnd(getClass().getName(),"net.mooctest.AirportTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3dq(){try{__CLR4_4_1dqdqlo0x9tr6.R.inc(494);
        __CLR4_4_1dqdqlo0x9tr6.R.inc(495);Airport airport = new Airport("code", "name", "city", "country", 1, 2);
        __CLR4_4_1dqdqlo0x9tr6.R.inc(496);assertEquals("code", airport.getCode());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(497);assertEquals("name", airport.getName());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(498);assertEquals("city", airport.getCity());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(499);assertEquals("country", airport.getCountry());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(500);assertEquals(1, airport.getX(), 0.0001);
        __CLR4_4_1dqdqlo0x9tr6.R.inc(501);assertEquals(2, airport.getY(), 0.0001);
        __CLR4_4_1dqdqlo0x9tr6.R.inc(502);airport.getCoord(1);
        __CLR4_4_1dqdqlo0x9tr6.R.inc(503);airport.getPoint2D();

        __CLR4_4_1dqdqlo0x9tr6.R.inc(504);assertEquals("city", airport.toString());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(505);assertEquals("code", airport.getString("code-only"));
        __CLR4_4_1dqdqlo0x9tr6.R.inc(506);assertEquals("code, name, city, country, (1.0,2.0)", airport.getString("full"));
        __CLR4_4_1dqdqlo0x9tr6.R.inc(507);assertEquals("name, city, country, (1.0,2.0)", airport.getString("attributes"));
        __CLR4_4_1dqdqlo0x9tr6.R.inc(508);assertEquals("Invalid format!", airport.getString("invalid"));

        __CLR4_4_1dqdqlo0x9tr6.R.inc(509);Airport airport1 = new Airport("code");
        __CLR4_4_1dqdqlo0x9tr6.R.inc(510);assertEquals("code", airport1.getCode());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(511);assertEquals("", airport1.getName());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(512);assertEquals("", airport1.getCity());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(513);assertEquals("", airport1.getCountry());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(514);assertEquals(0, airport1.getX(), 0.0001);
        __CLR4_4_1dqdqlo0x9tr6.R.inc(515);assertEquals(0, airport1.getY(), 0.0001);
        __CLR4_4_1dqdqlo0x9tr6.R.inc(516);assertEquals("", airport1.toString());
        __CLR4_4_1dqdqlo0x9tr6.R.inc(517);assertEquals("", airport1.getString(""));
        __CLR4_4_1dqdqlo0x9tr6.R.inc(518);assertEquals("code", airport1.getString("code-only"));
        __CLR4_4_1dqdqlo0x9tr6.R.inc(519);assertEquals("code, , , , (0.0,0.0)", airport1.getString("full"));
        __CLR4_4_1dqdqlo0x9tr6.R.inc(520);assertEquals(", , , (0.0,0.0)", airport1.getString("attributes"));
        __CLR4_4_1dqdqlo0x9tr6.R.inc(521);assertEquals("Invalid format!", airport1.getString("invalid"));
    }finally{__CLR4_4_1dqdqlo0x9tr6.R.flushNeeded();}}
}