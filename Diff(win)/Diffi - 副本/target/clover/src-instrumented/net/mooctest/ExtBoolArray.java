/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public final class ExtBoolArray {public static class __CLR4_4_1eeludsyzy7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711785637941L,8589935092L,40,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean[] werte;

    public ExtBoolArray(int len) {try{__CLR4_4_1eeludsyzy7.R.inc(14);
        __CLR4_4_1eeludsyzy7.R.inc(15);werte = new boolean[len];
    }finally{__CLR4_4_1eeludsyzy7.R.flushNeeded();}}

    public void setTrue(int a, int b) {try{__CLR4_4_1eeludsyzy7.R.inc(16);
        __CLR4_4_1eeludsyzy7.R.inc(17);for (int i = a; (((i <= b)&&(__CLR4_4_1eeludsyzy7.R.iget(18)!=0|true))||(__CLR4_4_1eeludsyzy7.R.iget(19)==0&false)); i++) {{
            __CLR4_4_1eeludsyzy7.R.inc(20);werte[i] = true;
        }
    }}finally{__CLR4_4_1eeludsyzy7.R.flushNeeded();}}

    public boolean isFalse(int a, int b) {try{__CLR4_4_1eeludsyzy7.R.inc(21);
        __CLR4_4_1eeludsyzy7.R.inc(22);for (int i = a; (((i <= b)&&(__CLR4_4_1eeludsyzy7.R.iget(23)!=0|true))||(__CLR4_4_1eeludsyzy7.R.iget(24)==0&false)); i++) {{
            __CLR4_4_1eeludsyzy7.R.inc(25);if ((((werte[i])&&(__CLR4_4_1eeludsyzy7.R.iget(26)!=0|true))||(__CLR4_4_1eeludsyzy7.R.iget(27)==0&false))) {{
                __CLR4_4_1eeludsyzy7.R.inc(28);return false;
            }
        }}
        }__CLR4_4_1eeludsyzy7.R.inc(29);return true;
    }finally{__CLR4_4_1eeludsyzy7.R.flushNeeded();}}

    public int left() {try{__CLR4_4_1eeludsyzy7.R.inc(30);
        __CLR4_4_1eeludsyzy7.R.inc(31);int result = 0;
        __CLR4_4_1eeludsyzy7.R.inc(32);for (int i = 0; (((i < werte.length)&&(__CLR4_4_1eeludsyzy7.R.iget(33)!=0|true))||(__CLR4_4_1eeludsyzy7.R.iget(34)==0&false)); i++) {{
            __CLR4_4_1eeludsyzy7.R.inc(35);if ((((!werte[i])&&(__CLR4_4_1eeludsyzy7.R.iget(36)!=0|true))||(__CLR4_4_1eeludsyzy7.R.iget(37)==0&false))) {{
                __CLR4_4_1eeludsyzy7.R.inc(38);result++;
            }
        }}
        }__CLR4_4_1eeludsyzy7.R.inc(39);return result;
    }finally{__CLR4_4_1eeludsyzy7.R.flushNeeded();}}
}