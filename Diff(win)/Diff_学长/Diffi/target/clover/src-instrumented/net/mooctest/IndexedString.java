/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public final class IndexedString {public static class __CLR4_4_12u2ulpniwbn1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0035\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701489467022L,8589935092L,154,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private char[] values;
    private int[][] index;

    private int count(char c) {try{__CLR4_4_12u2ulpniwbn1.R.inc(102);
        __CLR4_4_12u2ulpniwbn1.R.inc(103);int result = 0;
        __CLR4_4_12u2ulpniwbn1.R.inc(104);for (int i = 0; (((i < values.length)&&(__CLR4_4_12u2ulpniwbn1.R.iget(105)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(106)==0&false)); i++) {{
            __CLR4_4_12u2ulpniwbn1.R.inc(107);if ((((values[i] == c)&&(__CLR4_4_12u2ulpniwbn1.R.iget(108)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(109)==0&false))) {{
                __CLR4_4_12u2ulpniwbn1.R.inc(110);result++;
            }
        }}
        }__CLR4_4_12u2ulpniwbn1.R.inc(111);return result;
    }finally{__CLR4_4_12u2ulpniwbn1.R.flushNeeded();}}

    public IndexedString(String s) {try{__CLR4_4_12u2ulpniwbn1.R.inc(112);
        __CLR4_4_12u2ulpniwbn1.R.inc(113);values = new char[s.length()];
        __CLR4_4_12u2ulpniwbn1.R.inc(114);s.getChars(0, s.length(), values, 0);
        __CLR4_4_12u2ulpniwbn1.R.inc(115);index = new int[256][];
        __CLR4_4_12u2ulpniwbn1.R.inc(116);for (char c = 0; (((c < 256)&&(__CLR4_4_12u2ulpniwbn1.R.iget(117)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(118)==0&false)); c++) {{
            __CLR4_4_12u2ulpniwbn1.R.inc(119);index[c] = new int[count(c)];
            __CLR4_4_12u2ulpniwbn1.R.inc(120);int idx = 0;
            __CLR4_4_12u2ulpniwbn1.R.inc(121);for (int i = 0; (((i < values.length)&&(__CLR4_4_12u2ulpniwbn1.R.iget(122)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(123)==0&false)); i++) {{
                __CLR4_4_12u2ulpniwbn1.R.inc(124);if ((((values[i] == c)&&(__CLR4_4_12u2ulpniwbn1.R.iget(125)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(126)==0&false))) {{
                    __CLR4_4_12u2ulpniwbn1.R.inc(127);index[c][idx++] = i;
                }
            }}
        }}
    }}finally{__CLR4_4_12u2ulpniwbn1.R.flushNeeded();}}

    public int indexOf(char[] target) {try{__CLR4_4_12u2ulpniwbn1.R.inc(128);
        __CLR4_4_12u2ulpniwbn1.R.inc(129);char first = target[0];
        __CLR4_4_12u2ulpniwbn1.R.inc(130);int tl = target.length;
        __CLR4_4_12u2ulpniwbn1.R.inc(131);int max = values.length - tl;
        __CLR4_4_12u2ulpniwbn1.R.inc(132);int[] idxa = index[first];
        __CLR4_4_12u2ulpniwbn1.R.inc(133);int idxl = idxa.length;
        __CLR4_4_12u2ulpniwbn1.R.inc(134);int j;
        __CLR4_4_12u2ulpniwbn1.R.inc(135);int end;

        __CLR4_4_12u2ulpniwbn1.R.inc(136);for (int idx = 0; (((idx < idxl)&&(__CLR4_4_12u2ulpniwbn1.R.iget(137)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(138)==0&false)); idx++) {{
            /* Look for first character. */
            __CLR4_4_12u2ulpniwbn1.R.inc(139);int i = idxa[idx];

            /* Found first character, now look at the rest of v2 */
            __CLR4_4_12u2ulpniwbn1.R.inc(140);if ((((i <= max)&&(__CLR4_4_12u2ulpniwbn1.R.iget(141)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(142)==0&false))) {{
                __CLR4_4_12u2ulpniwbn1.R.inc(143);j = i + 1;
                __CLR4_4_12u2ulpniwbn1.R.inc(144);end = i + tl;
                __CLR4_4_12u2ulpniwbn1.R.inc(145);for (int k = 1; (((j < end && values[j] == target[k])&&(__CLR4_4_12u2ulpniwbn1.R.iget(146)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(147)==0&false)); j++, k++) {{
                    __CLR4_4_12u2ulpniwbn1.R.inc(148);;
                }
                }__CLR4_4_12u2ulpniwbn1.R.inc(149);if ((((j == end)&&(__CLR4_4_12u2ulpniwbn1.R.iget(150)!=0|true))||(__CLR4_4_12u2ulpniwbn1.R.iget(151)==0&false))) {{
                    /* Found whole string. */
                    __CLR4_4_12u2ulpniwbn1.R.inc(152);return i;
                }
            }}
        }}
        }__CLR4_4_12u2ulpniwbn1.R.inc(153);return -1;
    }finally{__CLR4_4_12u2ulpniwbn1.R.flushNeeded();}}
}