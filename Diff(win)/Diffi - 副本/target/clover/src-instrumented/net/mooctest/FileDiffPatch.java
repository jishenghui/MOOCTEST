/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDiffPatch {public static class __CLR4_4_11414ludsyzyn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711785637941L,8589935092L,102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void createPatch(String origfn, String newfn, String patch) {try{__CLR4_4_11414ludsyzyn.R.inc(40);
        __CLR4_4_11414ludsyzyn.R.inc(41);createPatch(origfn, newfn, patch, false);
    }finally{__CLR4_4_11414ludsyzyn.R.flushNeeded();}}
 
    public static void createPatch(String origfn, String newfn, String patch, boolean verbose) {try{__CLR4_4_11414ludsyzyn.R.inc(42);
        __CLR4_4_11414ludsyzyn.R.inc(43);try {
            __CLR4_4_11414ludsyzyn.R.inc(44);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(45)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(46)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(47);System.out.println("Reading file A...");
            }
            }__CLR4_4_11414ludsyzyn.R.inc(48);String a = StringFromFile.readString(origfn);
            __CLR4_4_11414ludsyzyn.R.inc(49);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(50)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(51)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(52);System.out.println("Reading file B...");
            }
            }__CLR4_4_11414ludsyzyn.R.inc(53);String b = StringFromFile.readString(newfn);
            __CLR4_4_11414ludsyzyn.R.inc(54);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(55)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(56)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(57);System.out.println("Looking for links...");
            }
            }__CLR4_4_11414ludsyzyn.R.inc(58);long t = System.currentTimeMillis();
            __CLR4_4_11414ludsyzyn.R.inc(59);RelativeString r = StringIncrementor.diff(a, b, verbose);
            __CLR4_4_11414ludsyzyn.R.inc(60);FileOutputStream C = new FileOutputStream(patch);
            __CLR4_4_11414ludsyzyn.R.inc(61);r.bytesToStream(C);
            __CLR4_4_11414ludsyzyn.R.inc(62);C.close();
            __CLR4_4_11414ludsyzyn.R.inc(63);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(64)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(65)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(66);System.out.println("Patch successfully created in " + (System.currentTimeMillis() - t) / 1000.0 + " seconds");
            }
            }__CLR4_4_11414ludsyzyn.R.inc(67);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(68)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(69)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(70);System.out.println(r);
            }
        }} catch (Exception e) {
            __CLR4_4_11414ludsyzyn.R.inc(71);e.printStackTrace();
        }
    }finally{__CLR4_4_11414ludsyzyn.R.flushNeeded();}}

    public static void doPatch(String origfn, String newfn, String patch) {try{__CLR4_4_11414ludsyzyn.R.inc(72);
        __CLR4_4_11414ludsyzyn.R.inc(73);doPatch(origfn, newfn, patch, false);
    }finally{__CLR4_4_11414ludsyzyn.R.flushNeeded();}}

    public static void doPatch(String origfn, String newfn, String patch, boolean verbose) {try{__CLR4_4_11414ludsyzyn.R.inc(74);
        __CLR4_4_11414ludsyzyn.R.inc(75);FileInputStream A = null;
        __CLR4_4_11414ludsyzyn.R.inc(76);try {
            __CLR4_4_11414ludsyzyn.R.inc(77);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(78)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(79)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(80);System.out.println("Reading file A...");
            }
            }__CLR4_4_11414ludsyzyn.R.inc(81);String a = StringFromFile.readString(origfn);
            __CLR4_4_11414ludsyzyn.R.inc(82);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(83)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(84)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(85);System.out.println("Reading Patch...");
            }
            }__CLR4_4_11414ludsyzyn.R.inc(86);FileInputStream B = new FileInputStream(patch);
            __CLR4_4_11414ludsyzyn.R.inc(87);RelativeString r = new RelativeString(B);
            __CLR4_4_11414ludsyzyn.R.inc(88);B.close();
            __CLR4_4_11414ludsyzyn.R.inc(89);System.out.println(r);
            __CLR4_4_11414ludsyzyn.R.inc(90);long t = System.currentTimeMillis();
            __CLR4_4_11414ludsyzyn.R.inc(91);String c = StringIncrementor.patch(a, r, verbose);
            __CLR4_4_11414ludsyzyn.R.inc(92);FileOutputStream C = new FileOutputStream(newfn);
            __CLR4_4_11414ludsyzyn.R.inc(93);DataOutputStream DC = new DataOutputStream(C);
            __CLR4_4_11414ludsyzyn.R.inc(94);DC.writeBytes(c);
            __CLR4_4_11414ludsyzyn.R.inc(95);DC.flush();
            __CLR4_4_11414ludsyzyn.R.inc(96);DC.close();
            __CLR4_4_11414ludsyzyn.R.inc(97);if ((((verbose)&&(__CLR4_4_11414ludsyzyn.R.iget(98)!=0|true))||(__CLR4_4_11414ludsyzyn.R.iget(99)==0&false))) {{
                __CLR4_4_11414ludsyzyn.R.inc(100);System.out.println("Patch successfully applied in " + (System.currentTimeMillis() - t) / 1000.0 + " seconds");
            }
        }} catch (Exception ex) {
            __CLR4_4_11414ludsyzyn.R.inc(101);ex.printStackTrace();
        }
    }finally{__CLR4_4_11414ludsyzyn.R.flushNeeded();}}
}