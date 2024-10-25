/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public class StringIncrementor {public static class __CLR4_4_17z7zlpniwbor{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0035\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701489467022L,8589935092L,372,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static RelativeString diff(String a, String b) {try{__CLR4_4_17z7zlpniwbor.R.inc(287);
        __CLR4_4_17z7zlpniwbor.R.inc(288);return diff(a, b, false);
    }finally{__CLR4_4_17z7zlpniwbor.R.flushNeeded();}}

    public static RelativeString diff(String a, String b, boolean verbose) {try{__CLR4_4_17z7zlpniwbor.R.inc(289);
        __CLR4_4_17z7zlpniwbor.R.inc(290);RelativeString result = new RelativeString();
        __CLR4_4_17z7zlpniwbor.R.inc(291);ExtBoolArray vergeben = new ExtBoolArray(b.length());
        __CLR4_4_17z7zlpniwbor.R.inc(292);System.out.println("Creating index...");
        __CLR4_4_17z7zlpniwbor.R.inc(293);IndexedString ai = new IndexedString(a);
        __CLR4_4_17z7zlpniwbor.R.inc(294);System.out.println("Searching links...");
        __CLR4_4_17z7zlpniwbor.R.inc(295);char[] target = new char[13];
        __CLR4_4_17z7zlpniwbor.R.inc(296);for (int posB = 0; (((posB < b.length() - 12)&&(__CLR4_4_17z7zlpniwbor.R.iget(297)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(298)==0&false)); posB++) {{
            __CLR4_4_17z7zlpniwbor.R.inc(299);int l = 13;
            
            __CLR4_4_17z7zlpniwbor.R.inc(300);b.getChars(posB, posB + 13, target, 0);
            __CLR4_4_17z7zlpniwbor.R.inc(301);int posA = ai.indexOf(target);
            __CLR4_4_17z7zlpniwbor.R.inc(302);if ((((posA == -1)&&(__CLR4_4_17z7zlpniwbor.R.iget(303)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(304)==0&false))) {{
                __CLR4_4_17z7zlpniwbor.R.inc(305);if ((((verbose && posB % (b.length() / 1000) == 0)&&(__CLR4_4_17z7zlpniwbor.R.iget(306)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(307)==0&false))) {{
                    __CLR4_4_17z7zlpniwbor.R.inc(308);System.out.println("@ " + (Math.round(posB / (double) b.length() * 1000) / 10.0) + "%");
                }
                }__CLR4_4_17z7zlpniwbor.R.inc(309);continue;
            }
            }__CLR4_4_17z7zlpniwbor.R.inc(310);int posALast = posA;
            __CLR4_4_17z7zlpniwbor.R.inc(311);while ((((posA != -1 && posB + l < b.length() && posA + l < a.length())&&(__CLR4_4_17z7zlpniwbor.R.iget(312)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(313)==0&false))) {{
                __CLR4_4_17z7zlpniwbor.R.inc(314);l++;
                __CLR4_4_17z7zlpniwbor.R.inc(315);if ((((a.charAt(posA + l - 1) != b.charAt(posB + l - 1))&&(__CLR4_4_17z7zlpniwbor.R.iget(316)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(317)==0&false))) {{
                    __CLR4_4_17z7zlpniwbor.R.inc(318);posALast = posA;
                   
                    __CLR4_4_17z7zlpniwbor.R.inc(319);char[] target2 = new char[l];
                    __CLR4_4_17z7zlpniwbor.R.inc(320);b.getChars(posB, posB + l, target2, 0);
                    __CLR4_4_17z7zlpniwbor.R.inc(321);posA = ai.indexOf(target2);
                }
            }}
            }__CLR4_4_17z7zlpniwbor.R.inc(322);if ((((posA == -1)&&(__CLR4_4_17z7zlpniwbor.R.iget(323)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(324)==0&false))) {{
                __CLR4_4_17z7zlpniwbor.R.inc(325);l--;
                __CLR4_4_17z7zlpniwbor.R.inc(326);posA = posALast;
            }
            }__CLR4_4_17z7zlpniwbor.R.inc(327);vergeben.setTrue(posB, posB + l - 1);
            __CLR4_4_17z7zlpniwbor.R.inc(328);StringLink sl = new StringLink(posA, posB, l);
            __CLR4_4_17z7zlpniwbor.R.inc(329);if ((((verbose)&&(__CLR4_4_17z7zlpniwbor.R.iget(330)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(331)==0&false))) {{
                __CLR4_4_17z7zlpniwbor.R.inc(332);System.out.println(sl + " @ " + (Math.round(posB / (double) b.length() * 1000) / 10.0) + "%");
            }
            }__CLR4_4_17z7zlpniwbor.R.inc(333);result.addLink(sl);
            __CLR4_4_17z7zlpniwbor.R.inc(334);posB += l - 1;
        }
        }__CLR4_4_17z7zlpniwbor.R.inc(335);StringBuilder rest = new StringBuilder();
        __CLR4_4_17z7zlpniwbor.R.inc(336);synchronized (rest) {
            __CLR4_4_17z7zlpniwbor.R.inc(337);for (int i = 0; (((i < b.length())&&(__CLR4_4_17z7zlpniwbor.R.iget(338)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(339)==0&false)); i++) {{
                __CLR4_4_17z7zlpniwbor.R.inc(340);if ((((vergeben.isFalse(i, i))&&(__CLR4_4_17z7zlpniwbor.R.iget(341)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(342)==0&false))) {{
                    __CLR4_4_17z7zlpniwbor.R.inc(343);rest.append(b.charAt(i));
                }
            }}
        }}
        __CLR4_4_17z7zlpniwbor.R.inc(344);result.setAbsolute(rest.toString());
        __CLR4_4_17z7zlpniwbor.R.inc(345);return result;
    }finally{__CLR4_4_17z7zlpniwbor.R.flushNeeded();}}

    public static String patch(String a, RelativeString r) {try{__CLR4_4_17z7zlpniwbor.R.inc(346);
        __CLR4_4_17z7zlpniwbor.R.inc(347);return patch(a, r, false);
    }finally{__CLR4_4_17z7zlpniwbor.R.flushNeeded();}}

    public static String patch(String a, RelativeString r, boolean verbose) {try{__CLR4_4_17z7zlpniwbor.R.inc(348);
        __CLR4_4_17z7zlpniwbor.R.inc(349);StringBuilder result = new StringBuilder(r.getLength());
        __CLR4_4_17z7zlpniwbor.R.inc(350);int posAbs = 0;
        __CLR4_4_17z7zlpniwbor.R.inc(351);for (int i = 0; (((i < r.linksCount())&&(__CLR4_4_17z7zlpniwbor.R.iget(352)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(353)==0&false)); i++) {{
            __CLR4_4_17z7zlpniwbor.R.inc(354);StringLink si = r.getLink(i);
            __CLR4_4_17z7zlpniwbor.R.inc(355);if ((((result.length() != si.getPosNew())&&(__CLR4_4_17z7zlpniwbor.R.iget(356)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(357)==0&false))) {{
                __CLR4_4_17z7zlpniwbor.R.inc(358);int diff = si.getPosNew() - result.length();
                __CLR4_4_17z7zlpniwbor.R.inc(359);if ((((verbose)&&(__CLR4_4_17z7zlpniwbor.R.iget(360)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(361)==0&false))) {{
                    __CLR4_4_17z7zlpniwbor.R.inc(362);System.out.println("Adding " + diff + " absolute Bytes from pos#" + posAbs);
                }
                }__CLR4_4_17z7zlpniwbor.R.inc(363);result.append(r.getAbsolute().substring(posAbs, posAbs + diff));
                __CLR4_4_17z7zlpniwbor.R.inc(364);posAbs += diff;
            }
            }__CLR4_4_17z7zlpniwbor.R.inc(365);if ((((verbose)&&(__CLR4_4_17z7zlpniwbor.R.iget(366)!=0|true))||(__CLR4_4_17z7zlpniwbor.R.iget(367)==0&false))) {{
                __CLR4_4_17z7zlpniwbor.R.inc(368);System.out.println("Adding Link: " + si);
            }
            }__CLR4_4_17z7zlpniwbor.R.inc(369);result.append(a.substring(si.getPosOrig(), si.getPosOrig() + si.getLen()));
        }
        }__CLR4_4_17z7zlpniwbor.R.inc(370);result.append(r.getAbsolute().substring(posAbs));
        __CLR4_4_17z7zlpniwbor.R.inc(371);return result.toString();
    }finally{__CLR4_4_17z7zlpniwbor.R.flushNeeded();}}
}