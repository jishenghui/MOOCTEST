/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

//Java Program to Implement Binary Exponentiation (power in log n)

/*
* Binary Exponentiation is a method to calculate a to the power of b.
* It is used to calculate a^n in O(log n) time.
*
* Reference:
* https://iq.opengenus.org/binary-exponentiation/
*/

public class BinaryExponentiation {public static class __CLR4_4_16x6xlo0x4s9d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0039\u0039\u0035\u0037\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697945872219L,8589935092L,272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

 // recursive function to calculate a to the power of b
 public static long calculatePower(long x, long y) {try{__CLR4_4_16x6xlo0x4s9d.R.inc(249);
     __CLR4_4_16x6xlo0x4s9d.R.inc(250);if ((((y == 0)&&(__CLR4_4_16x6xlo0x4s9d.R.iget(251)!=0|true))||(__CLR4_4_16x6xlo0x4s9d.R.iget(252)==0&false))) {{
         __CLR4_4_16x6xlo0x4s9d.R.inc(253);return 1;
     }
     }__CLR4_4_16x6xlo0x4s9d.R.inc(254);long val = calculatePower(x, y / 2);
     __CLR4_4_16x6xlo0x4s9d.R.inc(255);if ((((y % 2 == 0)&&(__CLR4_4_16x6xlo0x4s9d.R.iget(256)!=0|true))||(__CLR4_4_16x6xlo0x4s9d.R.iget(257)==0&false))) {{
         __CLR4_4_16x6xlo0x4s9d.R.inc(258);return val * val;
     }
     }__CLR4_4_16x6xlo0x4s9d.R.inc(259);return val * val * x;
 }finally{__CLR4_4_16x6xlo0x4s9d.R.flushNeeded();}}

 // iterative function to calculate a to the power of b
 long power(long N, long M) {try{__CLR4_4_16x6xlo0x4s9d.R.inc(260);
     __CLR4_4_16x6xlo0x4s9d.R.inc(261);long power = N, sum = 1;
     __CLR4_4_16x6xlo0x4s9d.R.inc(262);while ((((M > 0)&&(__CLR4_4_16x6xlo0x4s9d.R.iget(263)!=0|true))||(__CLR4_4_16x6xlo0x4s9d.R.iget(264)==0&false))) {{
         __CLR4_4_16x6xlo0x4s9d.R.inc(265);if (((((M & 1) == 1)&&(__CLR4_4_16x6xlo0x4s9d.R.iget(266)!=0|true))||(__CLR4_4_16x6xlo0x4s9d.R.iget(267)==0&false))) {{
             __CLR4_4_16x6xlo0x4s9d.R.inc(268);sum *= power;
         }
         }__CLR4_4_16x6xlo0x4s9d.R.inc(269);power = power * power;
         __CLR4_4_16x6xlo0x4s9d.R.inc(270);M = M >> 1;
     }
     }__CLR4_4_16x6xlo0x4s9d.R.inc(271);return sum;
 }finally{__CLR4_4_16x6xlo0x4s9d.R.flushNeeded();}}
}
