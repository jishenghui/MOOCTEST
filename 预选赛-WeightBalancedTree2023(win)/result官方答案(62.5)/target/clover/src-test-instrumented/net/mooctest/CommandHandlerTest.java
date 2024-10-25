/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CommandHandlerTest {static class __CLR4_4_1gjgjlo0x9trq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946107870L,8589935092L,612,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void summarizeFind() {__CLR4_4_1gjgjlo0x9trq.R.globalSliceStart(getClass().getName(),595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cnobkxgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjgjlo0x9trq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjgjlo0x9trq.R.globalSliceEnd(getClass().getName(),"net.mooctest.CommandHandlerTest.summarizeFind",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),595,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cnobkxgj(){try{__CLR4_4_1gjgjlo0x9trq.R.inc(595);
        __CLR4_4_1gjgjlo0x9trq.R.inc(596);CommandHandler commandHandler = new CommandHandler(new BJTree<String, Airport>());
        __CLR4_4_1gjgjlo0x9trq.R.inc(597);Airport airport = new Airport("1", "1", "1", "1", 1, 1);
        __CLR4_4_1gjgjlo0x9trq.R.inc(598);commandHandler.summarizeFind("find 1", "1", airport);
    }finally{__CLR4_4_1gjgjlo0x9trq.R.flushNeeded();}}

    @Test
    public void summarizeGet() {__CLR4_4_1gjgjlo0x9trq.R.globalSliceStart(getClass().getName(),599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g0byt8gn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjgjlo0x9trq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjgjlo0x9trq.R.globalSliceEnd(getClass().getName(),"net.mooctest.CommandHandlerTest.summarizeGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g0byt8gn(){try{__CLR4_4_1gjgjlo0x9trq.R.inc(599);
        __CLR4_4_1gjgjlo0x9trq.R.inc(600);CommandHandler commandHandler = new CommandHandler(new BJTree<String, Airport>());
        __CLR4_4_1gjgjlo0x9trq.R.inc(601);Airport airport = new Airport("1", "1", "1", "1", 1, 1);
        __CLR4_4_1gjgjlo0x9trq.R.inc(602);commandHandler.summarizeGet("find 1", airport);
    }finally{__CLR4_4_1gjgjlo0x9trq.R.flushNeeded();}}

    @Test
    public void treeStructure() {__CLR4_4_1gjgjlo0x9trq.R.globalSliceStart(getClass().getName(),603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n09884gr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjgjlo0x9trq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjgjlo0x9trq.R.globalSliceEnd(getClass().getName(),"net.mooctest.CommandHandlerTest.treeStructure",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n09884gr(){try{__CLR4_4_1gjgjlo0x9trq.R.inc(603);
        __CLR4_4_1gjgjlo0x9trq.R.inc(604);CommandHandler commandHandler = new CommandHandler(new BJTree<String, Airport>());

        __CLR4_4_1gjgjlo0x9trq.R.inc(605);ArrayList<String> array = new ArrayList<>();
        __CLR4_4_1gjgjlo0x9trq.R.inc(606);for (int i = 0; (((i < 10)&&(__CLR4_4_1gjgjlo0x9trq.R.iget(607)!=0|true))||(__CLR4_4_1gjgjlo0x9trq.R.iget(608)==0&false)); i++) {{
            __CLR4_4_1gjgjlo0x9trq.R.inc(609);array.add(String.valueOf(i));
        }
        }__CLR4_4_1gjgjlo0x9trq.R.inc(610);commandHandler.treeStructure(array);
    }finally{__CLR4_4_1gjgjlo0x9trq.R.flushNeeded();}}

    @Test
    public void treeStructureHelper() {__CLR4_4_1gjgjlo0x9trq.R.globalSliceStart(getClass().getName(),611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1i7wup6gz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1gjgjlo0x9trq.R.rethrow($CLV_t2$);}finally{__CLR4_4_1gjgjlo0x9trq.R.globalSliceEnd(getClass().getName(),"net.mooctest.CommandHandlerTest.treeStructureHelper",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1i7wup6gz(){try{__CLR4_4_1gjgjlo0x9trq.R.inc(611);
    }finally{__CLR4_4_1gjgjlo0x9trq.R.flushNeeded();}}
}