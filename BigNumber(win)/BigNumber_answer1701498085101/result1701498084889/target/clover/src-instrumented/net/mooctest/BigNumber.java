/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

public class BigNumber {public static class __CLR4_4_100lpno0x2a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0035\u0039\u0039\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0042\u0069\u0067\u004e\u0075\u006d\u0062\u0065\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701498079583L,8589935092L,172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
    public static String bigNumberSimpleMulti(String f, String s) {try{__CLR4_4_100lpno0x2a.R.inc(0);  
        __CLR4_4_100lpno0x2a.R.inc(1);System.out.print("multi : \n" + f + "*" + s + "=");  
        __CLR4_4_100lpno0x2a.R.inc(2);char signA = f.charAt(0);  
        __CLR4_4_100lpno0x2a.R.inc(3);char signB = s.charAt(0);  
        __CLR4_4_100lpno0x2a.R.inc(4);char sign = '+';  
        __CLR4_4_100lpno0x2a.R.inc(5);if ((((signA == '+' || signA == '-')&&(__CLR4_4_100lpno0x2a.R.iget(6)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(7)==0&false))) {{  
            __CLR4_4_100lpno0x2a.R.inc(8);sign = signA;  
            __CLR4_4_100lpno0x2a.R.inc(9);f = f.substring(1);  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(10);if ((((signB == '+' || signB == '-')&&(__CLR4_4_100lpno0x2a.R.iget(11)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(12)==0&false))) {{  
            __CLR4_4_100lpno0x2a.R.inc(13);if ((((sign == signB)&&(__CLR4_4_100lpno0x2a.R.iget(14)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(15)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(16);sign = '+';  
            } }else {{  
                __CLR4_4_100lpno0x2a.R.inc(17);sign = '-';  
            }  
            }__CLR4_4_100lpno0x2a.R.inc(18);s = s.substring(1);  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(19);char[] a = new StringBuffer(f).reverse().toString().toCharArray();  
        __CLR4_4_100lpno0x2a.R.inc(20);char[] b = new StringBuffer(s).reverse().toString().toCharArray();  
        __CLR4_4_100lpno0x2a.R.inc(21);int lenA = a.length;  
        __CLR4_4_100lpno0x2a.R.inc(22);int lenB = b.length;  
        __CLR4_4_100lpno0x2a.R.inc(23);int len = lenA + lenB;  
        __CLR4_4_100lpno0x2a.R.inc(24);int[] result = new int[len];  
        __CLR4_4_100lpno0x2a.R.inc(25);for (int i = 0; (((i < a.length)&&(__CLR4_4_100lpno0x2a.R.iget(26)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(27)==0&false)); i++) {{  
            __CLR4_4_100lpno0x2a.R.inc(28);for (int j = 0; (((j < b.length)&&(__CLR4_4_100lpno0x2a.R.iget(29)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(30)==0&false)); j++) {{  
                __CLR4_4_100lpno0x2a.R.inc(31);result[i + j] += (int) (a[i] - '0') * (int) (b[j] - '0');  
            }  
        }}  
        }__CLR4_4_100lpno0x2a.R.inc(32);for (int i = 0; (((i < result.length)&&(__CLR4_4_100lpno0x2a.R.iget(33)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(34)==0&false)); i++) {{  
            __CLR4_4_100lpno0x2a.R.inc(35);if ((((result[i] > 10)&&(__CLR4_4_100lpno0x2a.R.iget(36)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(37)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(38);result[i + 1] += result[i] / 10;  
                __CLR4_4_100lpno0x2a.R.inc(39);result[i] %= 10;  
            }  
        }}  
        }__CLR4_4_100lpno0x2a.R.inc(40);StringBuffer sb = new StringBuffer();  
        __CLR4_4_100lpno0x2a.R.inc(41);boolean flag = true;  
        __CLR4_4_100lpno0x2a.R.inc(42);for (int i = len - 1; (((i >= 0)&&(__CLR4_4_100lpno0x2a.R.iget(43)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(44)==0&false)); i--) {{  
            __CLR4_4_100lpno0x2a.R.inc(45);if ((((result[i] == 0 && flag)&&(__CLR4_4_100lpno0x2a.R.iget(46)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(47)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(48);continue;  
            } }else {{  
                __CLR4_4_100lpno0x2a.R.inc(49);flag = false;  
            }  
            }__CLR4_4_100lpno0x2a.R.inc(50);sb.append(result[i]);  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(51);if ((((!sb.toString().equals(""))&&(__CLR4_4_100lpno0x2a.R.iget(52)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(53)==0&false))) {{  
            __CLR4_4_100lpno0x2a.R.inc(54);if ((((sign == '-')&&(__CLR4_4_100lpno0x2a.R.iget(55)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(56)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(57);sb.insert(0, sign);  
            }  
        }} }else {{  
            __CLR4_4_100lpno0x2a.R.inc(58);sb.append(0);  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(59);System.out.println(sb.toString());  
        __CLR4_4_100lpno0x2a.R.inc(60);return sb.toString();
    }finally{__CLR4_4_100lpno0x2a.R.flushNeeded();}}  
    
    public static String bigNumberAdd(String f, String s) {try{__CLR4_4_100lpno0x2a.R.inc(61);  
    	__CLR4_4_100lpno0x2a.R.inc(62);System.out.print("add : \n" + f + "+" + s + "=");  
        __CLR4_4_100lpno0x2a.R.inc(63);char[] a = new StringBuffer(f).reverse().toString().toCharArray();  
        __CLR4_4_100lpno0x2a.R.inc(64);char[] b = new StringBuffer(s).reverse().toString().toCharArray();  
        __CLR4_4_100lpno0x2a.R.inc(65);int lenA = a.length;  
        __CLR4_4_100lpno0x2a.R.inc(66);int lenB = b.length;  
        __CLR4_4_100lpno0x2a.R.inc(67);int len = (((lenA > lenB )&&(__CLR4_4_100lpno0x2a.R.iget(68)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(69)==0&false))? lenA : lenB;  
        __CLR4_4_100lpno0x2a.R.inc(70);int[] result = new int[len + 1];  
        __CLR4_4_100lpno0x2a.R.inc(71);for (int i = 0; (((i < len + 1)&&(__CLR4_4_100lpno0x2a.R.iget(72)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(73)==0&false)); i++) {{  
            __CLR4_4_100lpno0x2a.R.inc(74);int aint = (((i < lenA )&&(__CLR4_4_100lpno0x2a.R.iget(75)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(76)==0&false))? (a[i] - '0') : 0;  
            __CLR4_4_100lpno0x2a.R.inc(77);int bint = (((i < lenB )&&(__CLR4_4_100lpno0x2a.R.iget(78)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(79)==0&false))? (b[i] - '0') : 0;  
            __CLR4_4_100lpno0x2a.R.inc(80);result[i] = aint + bint;  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(81);for (int i = 0; (((i < result.length)&&(__CLR4_4_100lpno0x2a.R.iget(82)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(83)==0&false)); i++) {{  
            __CLR4_4_100lpno0x2a.R.inc(84);if ((((result[i] > 10)&&(__CLR4_4_100lpno0x2a.R.iget(85)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(86)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(87);result[i + 1] += result[i] / 10;  
                __CLR4_4_100lpno0x2a.R.inc(88);result[i] %= 10;  
            }  
        }}  
        }__CLR4_4_100lpno0x2a.R.inc(89);StringBuffer sb = new StringBuffer();  
        __CLR4_4_100lpno0x2a.R.inc(90);boolean flag = true;  
        __CLR4_4_100lpno0x2a.R.inc(91);for (int i = len; (((i >= 0)&&(__CLR4_4_100lpno0x2a.R.iget(92)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(93)==0&false)); i--) {{  
            __CLR4_4_100lpno0x2a.R.inc(94);if ((((result[i] == 0 && flag)&&(__CLR4_4_100lpno0x2a.R.iget(95)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(96)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(97);continue;  
            } }else {{  
                __CLR4_4_100lpno0x2a.R.inc(98);flag = false;  
            }  
            }__CLR4_4_100lpno0x2a.R.inc(99);sb.append(result[i]);  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(100);System.out.println(sb.toString());  
        __CLR4_4_100lpno0x2a.R.inc(101);return sb.toString();  
    }finally{__CLR4_4_100lpno0x2a.R.flushNeeded();}}  
    
    public static String bigNumberSub(String f, String s) {try{__CLR4_4_100lpno0x2a.R.inc(102);  
        __CLR4_4_100lpno0x2a.R.inc(103);System.out.print("sub : \n" + f + "-" + s + "=");  
        __CLR4_4_100lpno0x2a.R.inc(104);char[] a = new StringBuffer(f).reverse().toString().toCharArray();  
        __CLR4_4_100lpno0x2a.R.inc(105);char[] b = new StringBuffer(s).reverse().toString().toCharArray();  
        __CLR4_4_100lpno0x2a.R.inc(106);int lenA = a.length;  
        __CLR4_4_100lpno0x2a.R.inc(107);int lenB = b.length;  
        __CLR4_4_100lpno0x2a.R.inc(108);int len = (((lenA > lenB )&&(__CLR4_4_100lpno0x2a.R.iget(109)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(110)==0&false))? lenA : lenB;  
        __CLR4_4_100lpno0x2a.R.inc(111);int[] result = new int[len];  
        __CLR4_4_100lpno0x2a.R.inc(112);char sign = '+';  
        __CLR4_4_100lpno0x2a.R.inc(113);if ((((lenA < lenB)&&(__CLR4_4_100lpno0x2a.R.iget(114)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(115)==0&false))) {{  
            __CLR4_4_100lpno0x2a.R.inc(116);sign = '-';  
        } }else {__CLR4_4_100lpno0x2a.R.inc(117);if ((((lenA == lenB)&&(__CLR4_4_100lpno0x2a.R.iget(118)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(119)==0&false))) {{  
            __CLR4_4_100lpno0x2a.R.inc(120);int i = lenA - 1;  
            __CLR4_4_100lpno0x2a.R.inc(121);while ((((i > 0 && a[i] == b[i])&&(__CLR4_4_100lpno0x2a.R.iget(122)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(123)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(124);i--;  
            }  
            }__CLR4_4_100lpno0x2a.R.inc(125);if ((((a[i] < b[i])&&(__CLR4_4_100lpno0x2a.R.iget(126)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(127)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(128);sign = '-';  
            }  
        }}  
        }}__CLR4_4_100lpno0x2a.R.inc(129);for (int i = 0; (((i < len)&&(__CLR4_4_100lpno0x2a.R.iget(130)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(131)==0&false)); i++) {{  
            __CLR4_4_100lpno0x2a.R.inc(132);int aint = (((i < lenA )&&(__CLR4_4_100lpno0x2a.R.iget(133)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(134)==0&false))? (a[i] - '0') : 0;  
            __CLR4_4_100lpno0x2a.R.inc(135);int bint = (((i < lenB )&&(__CLR4_4_100lpno0x2a.R.iget(136)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(137)==0&false))? (b[i] - '0') : 0;  
            __CLR4_4_100lpno0x2a.R.inc(138);if ((((sign == '+')&&(__CLR4_4_100lpno0x2a.R.iget(139)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(140)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(141);result[i] = aint - bint;  
            } }else {{  
                __CLR4_4_100lpno0x2a.R.inc(142);result[i] = bint - aint;  
            }  
        }}  
        }__CLR4_4_100lpno0x2a.R.inc(143);for (int i = 0; (((i < result.length - 1)&&(__CLR4_4_100lpno0x2a.R.iget(144)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(145)==0&false)); i++) {{  
            __CLR4_4_100lpno0x2a.R.inc(146);if ((((result[i] < 0)&&(__CLR4_4_100lpno0x2a.R.iget(147)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(148)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(149);result[i + 1] -= 1;  
                __CLR4_4_100lpno0x2a.R.inc(150);result[i] += 10;  
            }  
        }}  
  
        }__CLR4_4_100lpno0x2a.R.inc(151);StringBuffer sb = new StringBuffer();  
        __CLR4_4_100lpno0x2a.R.inc(152);if ((((sign == '-')&&(__CLR4_4_100lpno0x2a.R.iget(153)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(154)==0&false))) {{  
            __CLR4_4_100lpno0x2a.R.inc(155);sb.append('-');  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(156);boolean flag = true;  
        __CLR4_4_100lpno0x2a.R.inc(157);for (int i = len - 1; (((i >= 0)&&(__CLR4_4_100lpno0x2a.R.iget(158)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(159)==0&false)); i--) {{  
            __CLR4_4_100lpno0x2a.R.inc(160);if ((((result[i] == 0 && flag)&&(__CLR4_4_100lpno0x2a.R.iget(161)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(162)==0&false))) {{  
                __CLR4_4_100lpno0x2a.R.inc(163);continue;  
            } }else {{  
                __CLR4_4_100lpno0x2a.R.inc(164);flag = false;  
            }  
            }__CLR4_4_100lpno0x2a.R.inc(165);sb.append(result[i]);  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(166);if ((((sb.toString().equals(""))&&(__CLR4_4_100lpno0x2a.R.iget(167)!=0|true))||(__CLR4_4_100lpno0x2a.R.iget(168)==0&false))) {{  
            __CLR4_4_100lpno0x2a.R.inc(169);sb.append("0");  
        }  
        }__CLR4_4_100lpno0x2a.R.inc(170);System.out.println(sb.toString());  
        __CLR4_4_100lpno0x2a.R.inc(171);return sb.toString();  
    }finally{__CLR4_4_100lpno0x2a.R.flushNeeded();}} 
    
}
