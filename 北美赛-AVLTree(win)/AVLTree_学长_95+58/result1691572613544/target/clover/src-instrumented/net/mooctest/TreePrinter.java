/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by louay on 4/29/2017.
 */
public class TreePrinter {public static class __CLR4_4_16j6jll3inmo3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0030\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0041\u0056\u004c\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691572608303L,8589935092L,314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static <T extends Comparable<?>> String printNode(AVLNode<T> root) {try{__CLR4_4_16j6jll3inmo3.R.inc(235);
        __CLR4_4_16j6jll3inmo3.R.inc(236);int maxLevel = TreePrinter.maxLevel(root);
        __CLR4_4_16j6jll3inmo3.R.inc(237);StringBuilder sb = new StringBuilder();
        __CLR4_4_16j6jll3inmo3.R.inc(238);return printNodeInternal(Collections.singletonList(root), 1, maxLevel, sb);
    }finally{__CLR4_4_16j6jll3inmo3.R.flushNeeded();}}

    private static <T extends Comparable<?>> String printNodeInternal(List<AVLNode<T>> nodes, int level, int maxLevel, StringBuilder sb) {try{__CLR4_4_16j6jll3inmo3.R.inc(239);
        __CLR4_4_16j6jll3inmo3.R.inc(240);if ((((nodes.isEmpty() || TreePrinter.isAllElementsNull(nodes))&&(__CLR4_4_16j6jll3inmo3.R.iget(241)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(242)==0&false)))
            {__CLR4_4_16j6jll3inmo3.R.inc(243);return "";

        }__CLR4_4_16j6jll3inmo3.R.inc(244);int floor = maxLevel - level;
        __CLR4_4_16j6jll3inmo3.R.inc(245);int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        __CLR4_4_16j6jll3inmo3.R.inc(246);int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        __CLR4_4_16j6jll3inmo3.R.inc(247);int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        __CLR4_4_16j6jll3inmo3.R.inc(248);TreePrinter.printWhitespaces(firstSpaces, sb);

        __CLR4_4_16j6jll3inmo3.R.inc(249);List<AVLNode<T>> newNodes = new ArrayList<>();
        __CLR4_4_16j6jll3inmo3.R.inc(250);for (AVLNode<T> node : nodes) {{
            __CLR4_4_16j6jll3inmo3.R.inc(251);if ((((node != null)&&(__CLR4_4_16j6jll3inmo3.R.iget(252)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(253)==0&false))) {{
                __CLR4_4_16j6jll3inmo3.R.inc(254);System.out.print(node.getElement());
                __CLR4_4_16j6jll3inmo3.R.inc(255);sb.append(node.getElement());
                __CLR4_4_16j6jll3inmo3.R.inc(256);newNodes.add(node.getLeft());
                __CLR4_4_16j6jll3inmo3.R.inc(257);newNodes.add(node.getRight());
            } }else {{
                __CLR4_4_16j6jll3inmo3.R.inc(258);newNodes.add(null);
                __CLR4_4_16j6jll3inmo3.R.inc(259);newNodes.add(null);
                __CLR4_4_16j6jll3inmo3.R.inc(260);System.out.print(" ");
                __CLR4_4_16j6jll3inmo3.R.inc(261);sb.append(" ");
            }

            }__CLR4_4_16j6jll3inmo3.R.inc(262);TreePrinter.printWhitespaces(betweenSpaces, sb);
        }
        }__CLR4_4_16j6jll3inmo3.R.inc(263);System.out.println("");
        __CLR4_4_16j6jll3inmo3.R.inc(264);sb.append("\n");

        __CLR4_4_16j6jll3inmo3.R.inc(265);for (int i = 1; (((i <= endgeLines)&&(__CLR4_4_16j6jll3inmo3.R.iget(266)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(267)==0&false)); i++) {{
            __CLR4_4_16j6jll3inmo3.R.inc(268);for (int j = 0; (((j < nodes.size())&&(__CLR4_4_16j6jll3inmo3.R.iget(269)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(270)==0&false)); j++) {{
                __CLR4_4_16j6jll3inmo3.R.inc(271);TreePrinter.printWhitespaces(firstSpaces - i, sb);
                __CLR4_4_16j6jll3inmo3.R.inc(272);if ((((nodes.get(j) == null)&&(__CLR4_4_16j6jll3inmo3.R.iget(273)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(274)==0&false))) {{
                    __CLR4_4_16j6jll3inmo3.R.inc(275);TreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1, sb);
                    __CLR4_4_16j6jll3inmo3.R.inc(276);continue;
                }

                }__CLR4_4_16j6jll3inmo3.R.inc(277);if ((((nodes.get(j).getLeft() != null)&&(__CLR4_4_16j6jll3inmo3.R.iget(278)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(279)==0&false))) {{
                    __CLR4_4_16j6jll3inmo3.R.inc(280);System.out.print("/");
                    __CLR4_4_16j6jll3inmo3.R.inc(281);sb.append("/");
                }
                }else
                    {__CLR4_4_16j6jll3inmo3.R.inc(282);TreePrinter.printWhitespaces(1, sb);

                }__CLR4_4_16j6jll3inmo3.R.inc(283);TreePrinter.printWhitespaces(i + i - 1, sb);

                __CLR4_4_16j6jll3inmo3.R.inc(284);if ((((nodes.get(j).getRight() != null)&&(__CLR4_4_16j6jll3inmo3.R.iget(285)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(286)==0&false))) {{
                    __CLR4_4_16j6jll3inmo3.R.inc(287);System.out.print("\\");
                    __CLR4_4_16j6jll3inmo3.R.inc(288);sb.append("\\");
                }
                }else
                    {__CLR4_4_16j6jll3inmo3.R.inc(289);TreePrinter.printWhitespaces(1,  sb);

                }__CLR4_4_16j6jll3inmo3.R.inc(290);TreePrinter.printWhitespaces(endgeLines + endgeLines - i, sb);
            }

            }__CLR4_4_16j6jll3inmo3.R.inc(291);System.out.println("");
            __CLR4_4_16j6jll3inmo3.R.inc(292);sb.append("\n");
        }
        }__CLR4_4_16j6jll3inmo3.R.inc(293);printNodeInternal(newNodes, level + 1, maxLevel, sb);
        __CLR4_4_16j6jll3inmo3.R.inc(294);return sb.toString();
    }finally{__CLR4_4_16j6jll3inmo3.R.flushNeeded();}}

    private static void printWhitespaces(int count, StringBuilder sb) {try{__CLR4_4_16j6jll3inmo3.R.inc(295);
        __CLR4_4_16j6jll3inmo3.R.inc(296);for (int i = 0; (((i < count)&&(__CLR4_4_16j6jll3inmo3.R.iget(297)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(298)==0&false)); i++) {{
            __CLR4_4_16j6jll3inmo3.R.inc(299);System.out.print(" ");
            __CLR4_4_16j6jll3inmo3.R.inc(300);sb.append(" ");
        }

    }}finally{__CLR4_4_16j6jll3inmo3.R.flushNeeded();}}

    private static <T extends Comparable<?>> int maxLevel(AVLNode<T> node) {try{__CLR4_4_16j6jll3inmo3.R.inc(301);
        __CLR4_4_16j6jll3inmo3.R.inc(302);if ((((node == null)&&(__CLR4_4_16j6jll3inmo3.R.iget(303)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(304)==0&false)))
            {__CLR4_4_16j6jll3inmo3.R.inc(305);return 0;

        }__CLR4_4_16j6jll3inmo3.R.inc(306);return Math.max(TreePrinter.maxLevel(node.getLeft()), TreePrinter.maxLevel(node.getRight())) + 1;
    }finally{__CLR4_4_16j6jll3inmo3.R.flushNeeded();}}

    private static <T> boolean isAllElementsNull(List<T> list) {try{__CLR4_4_16j6jll3inmo3.R.inc(307);
        __CLR4_4_16j6jll3inmo3.R.inc(308);for (Object object : list) {{
            __CLR4_4_16j6jll3inmo3.R.inc(309);if ((((object != null)&&(__CLR4_4_16j6jll3inmo3.R.iget(310)!=0|true))||(__CLR4_4_16j6jll3inmo3.R.iget(311)==0&false)))
                {__CLR4_4_16j6jll3inmo3.R.inc(312);return false;
        }}

        }__CLR4_4_16j6jll3inmo3.R.inc(313);return true;
    }finally{__CLR4_4_16j6jll3inmo3.R.flushNeeded();}}

}