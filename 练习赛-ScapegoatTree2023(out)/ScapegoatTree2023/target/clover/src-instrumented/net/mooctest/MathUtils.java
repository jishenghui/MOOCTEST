/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * Some syntactic sugar for math operations.
 * 
 * @author Ignas Lelys
 * @created May 3, 2011
 *
 */
public class MathUtils {public static class __CLR4_4_17t7tl9i5d094{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0073\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u004a\u0061\u0076\u0061\u005f\u0070\u0072\u0061\u0063\u0074\u0069\u0063\u0065\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666335882853L,8589935092L,289,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * Extracts digit from integer number.
     * 
     * @param number Number from which digit is extracted.
     * @param digitIndex index of digit to get. 0 - last one.
     * 
     * @return Required digit.
     */
    public static int getDigitFromNumber(int number, int digitIndex) {try{__CLR4_4_17t7tl9i5d094.R.inc(281);
        // TODO error check and efficiency (maybe put powers of 10 to array)
        __CLR4_4_17t7tl9i5d094.R.inc(282);return number / (int)Math.pow(10, digitIndex) % 10;
    }finally{__CLR4_4_17t7tl9i5d094.R.flushNeeded();}}
    
    /**
     * Returns bigger integer.
     * 
     * @param first First number.
     * @param second Second number.
     * @return Bigger number.
     */
    public static int getMax(int first, int second) {try{__CLR4_4_17t7tl9i5d094.R.inc(283);
        __CLR4_4_17t7tl9i5d094.R.inc(284);return (((first > second )&&(__CLR4_4_17t7tl9i5d094.R.iget(285)!=0|true))||(__CLR4_4_17t7tl9i5d094.R.iget(286)==0&false))? first : second;
    }finally{__CLR4_4_17t7tl9i5d094.R.flushNeeded();}}
    
    /**
     * Calculates logarithm.
     */
    public static double logarithm(double base, double a) {try{__CLR4_4_17t7tl9i5d094.R.inc(287);
        __CLR4_4_17t7tl9i5d094.R.inc(288);return Math.log(a) / Math.log(base);
    }finally{__CLR4_4_17t7tl9i5d094.R.flushNeeded();}}

}
