/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.util.Vector;


public final class Diffi {public static class __CLR4_4_100lpniwblq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0035\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701489467022L,8589935092L,14,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Vector<Option> options;

    public Diffi(Option... opts) {try{__CLR4_4_100lpniwblq.R.inc(0);
        __CLR4_4_100lpniwblq.R.inc(1);options = new Vector<Option>();
        __CLR4_4_100lpniwblq.R.inc(2);for (Option o : opts) {{
            __CLR4_4_100lpniwblq.R.inc(3);options.add(o);
        }
    }}finally{__CLR4_4_100lpniwblq.R.flushNeeded();}}

    public void addOption(Option obj) {try{__CLR4_4_100lpniwblq.R.inc(4);
        __CLR4_4_100lpniwblq.R.inc(5);options.addElement(obj);
    }finally{__CLR4_4_100lpniwblq.R.flushNeeded();}}

    public void parse(String[] args) {try{__CLR4_4_100lpniwblq.R.inc(6);
        __CLR4_4_100lpniwblq.R.inc(7);argloop:
        for (String s : args) {{
            __CLR4_4_100lpniwblq.R.inc(8);for (Option o : options) {{
                __CLR4_4_100lpniwblq.R.inc(9);if ((((o.is(s))&&(__CLR4_4_100lpniwblq.R.iget(10)!=0|true))||(__CLR4_4_100lpniwblq.R.iget(11)==0&false))) {{
                    __CLR4_4_100lpniwblq.R.inc(12);o.parse(s);
                    __CLR4_4_100lpniwblq.R.inc(13);continue argloop;
                }
            }}
        }}
    }}finally{__CLR4_4_100lpniwblq.R.flushNeeded();}}
}