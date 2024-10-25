/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given an integer array. The task is to find the maximum of the minimum of
 * every window size in the array. Note: Window size varies from 1 to the size
 * of the Array.
 * <p>
 * For example,
 * <p>
 * N = 7
 * arr[] = {10,20,30,50,10,70,30}
 * <p>
 * So the answer for the above would be : 70 30 20 10 10 10 10
 * <p>
 * We need to consider window sizes from 1 to length of array in each iteration.
 * So in the iteration 1 the windows would be [10], [20], [30], [50], [10],
 * [70], [30]. Now we need to check the minimum value in each window. Since the
 * window size is 1 here the minimum element would be the number itself. Now the
 * maximum out of these is the result in iteration 1. In the second iteration we
 * need to consider window size 2, so there would be [10,20], [20,30], [30,50],
 * [50,10], [10,70], [70,30]. Now the minimum of each window size would be
 * [10,20,30,10,10] and the maximum out of these is 30. Similarly we solve for
 * other window sizes.
 *
 * @author sahil
 */
public class MaximumMinimumWindow {public static class __CLR4_4_1dcdclo0xphh2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946837852L,8589935092L,542,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * This function contains the logic of finding maximum of minimum for every
     * window size using Stack Data Structure.
     *
     * @param arr Array containing the numbers
     * @param n Length of the array
     * @return result array
     */
    public static int[] calculateMaxOfMin(int[] arr, int n) {try{__CLR4_4_1dcdclo0xphh2.R.inc(480);
        __CLR4_4_1dcdclo0xphh2.R.inc(481);Stack<Integer> s = new Stack<>();
        __CLR4_4_1dcdclo0xphh2.R.inc(482);int[] left = new int[n + 1];
        __CLR4_4_1dcdclo0xphh2.R.inc(483);int[] right = new int[n + 1];
        __CLR4_4_1dcdclo0xphh2.R.inc(484);for (int i = 0; (((i < n)&&(__CLR4_4_1dcdclo0xphh2.R.iget(485)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(486)==0&false)); i++) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(487);left[i] = -1;
            __CLR4_4_1dcdclo0xphh2.R.inc(488);right[i] = n;
        }

        }__CLR4_4_1dcdclo0xphh2.R.inc(489);for (int i = 0; (((i < n)&&(__CLR4_4_1dcdclo0xphh2.R.iget(490)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(491)==0&false)); i++) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(492);while ((((!s.empty() && arr[s.peek()] >= arr[i])&&(__CLR4_4_1dcdclo0xphh2.R.iget(493)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(494)==0&false))) {{
                __CLR4_4_1dcdclo0xphh2.R.inc(495);s.pop();
            }

            }__CLR4_4_1dcdclo0xphh2.R.inc(496);if ((((!s.empty())&&(__CLR4_4_1dcdclo0xphh2.R.iget(497)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(498)==0&false))) {{
                __CLR4_4_1dcdclo0xphh2.R.inc(499);left[i] = s.peek();
            }

            }__CLR4_4_1dcdclo0xphh2.R.inc(500);s.push(i);
        }

        }__CLR4_4_1dcdclo0xphh2.R.inc(501);while ((((!s.empty())&&(__CLR4_4_1dcdclo0xphh2.R.iget(502)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(503)==0&false))) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(504);s.pop();
        }

        }__CLR4_4_1dcdclo0xphh2.R.inc(505);for (int i = n - 1; (((i >= 0)&&(__CLR4_4_1dcdclo0xphh2.R.iget(506)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(507)==0&false)); i--) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(508);while ((((!s.empty() && arr[s.peek()] >= arr[i])&&(__CLR4_4_1dcdclo0xphh2.R.iget(509)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(510)==0&false))) {{
                __CLR4_4_1dcdclo0xphh2.R.inc(511);s.pop();
            }

            }__CLR4_4_1dcdclo0xphh2.R.inc(512);if ((((!s.empty())&&(__CLR4_4_1dcdclo0xphh2.R.iget(513)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(514)==0&false))) {{
                __CLR4_4_1dcdclo0xphh2.R.inc(515);right[i] = s.peek();
            }

            }__CLR4_4_1dcdclo0xphh2.R.inc(516);s.push(i);
        }

        }__CLR4_4_1dcdclo0xphh2.R.inc(517);int[] ans = new int[n + 1];
        __CLR4_4_1dcdclo0xphh2.R.inc(518);for (int i = 0; (((i <= n)&&(__CLR4_4_1dcdclo0xphh2.R.iget(519)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(520)==0&false)); i++) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(521);ans[i] = 0;
        }

        }__CLR4_4_1dcdclo0xphh2.R.inc(522);for (int i = 0; (((i < n)&&(__CLR4_4_1dcdclo0xphh2.R.iget(523)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(524)==0&false)); i++) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(525);int len = right[i] - left[i] - 1;

            __CLR4_4_1dcdclo0xphh2.R.inc(526);ans[len] = Math.max(ans[len], arr[i]);
        }

        }__CLR4_4_1dcdclo0xphh2.R.inc(527);for (int i = n - 1; (((i >= 1)&&(__CLR4_4_1dcdclo0xphh2.R.iget(528)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(529)==0&false)); i--) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(530);ans[i] = Math.max(ans[i], ans[i + 1]);
        }

        // Print the result
        }__CLR4_4_1dcdclo0xphh2.R.inc(531);for (int i = 1; (((i <= n)&&(__CLR4_4_1dcdclo0xphh2.R.iget(532)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(533)==0&false)); i++) {{
            __CLR4_4_1dcdclo0xphh2.R.inc(534);System.out.print(ans[i] + " ");
        }
        }__CLR4_4_1dcdclo0xphh2.R.inc(535);return ans;
    }finally{__CLR4_4_1dcdclo0xphh2.R.flushNeeded();}}

    public static void main(String[] args) {try{__CLR4_4_1dcdclo0xphh2.R.inc(536);
        __CLR4_4_1dcdclo0xphh2.R.inc(537);int[] arr = new int[] {10, 20, 30, 50, 10, 70, 30};
        __CLR4_4_1dcdclo0xphh2.R.inc(538);int[] target = new int[] {70, 30, 20, 10, 10, 10, 10};
        __CLR4_4_1dcdclo0xphh2.R.inc(539);int[] res = calculateMaxOfMin(arr, arr.length);
        assert (((Arrays.equals(target, res))&&(__CLR4_4_1dcdclo0xphh2.R.iget(540)!=0|true))||(__CLR4_4_1dcdclo0xphh2.R.iget(541)==0&false));
    }finally{__CLR4_4_1dcdclo0xphh2.R.flushNeeded();}}
}