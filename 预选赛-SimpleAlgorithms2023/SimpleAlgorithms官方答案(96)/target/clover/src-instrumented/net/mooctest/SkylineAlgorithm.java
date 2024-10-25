/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;


import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author dimgrichr
 * <p>
 * Space complexity: O(n) Time complexity: O(nlogn), because it is a divide and
 * conquer algorithm
 */
public class SkylineAlgorithm {public static class __CLR4_4_1f2f2lo0x4sbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0039\u0039\u0035\u0037\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697945872219L,8589935092L,619,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ArrayList<Point> points;

    /**
     * Main constructor of the application. ArrayList points gets created, which
     * represents the sum of all edges.
     */
    public SkylineAlgorithm() {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(542);
        __CLR4_4_1f2f2lo0x4sbv.R.inc(543);points = new ArrayList<>();
    }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}

    /**
     * @return points, the ArrayList that includes all points.
     */
    public ArrayList<Point> getPoints() {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(544);
        __CLR4_4_1f2f2lo0x4sbv.R.inc(545);return points;
    }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}

    /**
     * The main divide and conquer, and also recursive algorithm. It gets an
     * ArrayList full of points as an argument. If the size of that ArrayList is
     * 1 or 2, the ArrayList is returned as it is, or with one less point (if
     * the initial size is 2 and one of it's points, is dominated by the other
     * one). On the other hand, if the ArrayList's size is bigger than 2, the
     * function is called again, twice, with arguments the corresponding half of
     * the initial ArrayList each time. Once the flashback has ended, the
     * function produceFinalSkyLine gets called, in order to produce the final
     * skyline, and return it.
     *
     * @param list, the initial list of points
     * @return leftSkyLine, the combination of first half's and second half's
     * skyline
     * @see Point
     */
    public ArrayList<Point> produceSubSkyLines(ArrayList<Point> list) {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(546);
        // part where function exits flashback
        __CLR4_4_1f2f2lo0x4sbv.R.inc(547);int size = list.size();
        __CLR4_4_1f2f2lo0x4sbv.R.inc(548);if ((((size == 1)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(549)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(550)==0&false))) {{
            __CLR4_4_1f2f2lo0x4sbv.R.inc(551);return list;
        } }else {__CLR4_4_1f2f2lo0x4sbv.R.inc(552);if ((((size == 2)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(553)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(554)==0&false))) {{
            __CLR4_4_1f2f2lo0x4sbv.R.inc(555);if ((((list.get(0).dominates(list.get(1)))&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(556)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(557)==0&false))) {{
                __CLR4_4_1f2f2lo0x4sbv.R.inc(558);list.remove(1);
            } }else {{
                __CLR4_4_1f2f2lo0x4sbv.R.inc(559);if ((((list.get(1).dominates(list.get(0)))&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(560)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(561)==0&false))) {{
                    __CLR4_4_1f2f2lo0x4sbv.R.inc(562);list.remove(0);
                }
            }}
            }__CLR4_4_1f2f2lo0x4sbv.R.inc(563);return list;
        }

        // recursive part of the function
        }}__CLR4_4_1f2f2lo0x4sbv.R.inc(564);ArrayList<Point> leftHalf = new ArrayList<>();
        __CLR4_4_1f2f2lo0x4sbv.R.inc(565);ArrayList<Point> rightHalf = new ArrayList<>();
        __CLR4_4_1f2f2lo0x4sbv.R.inc(566);for (int i = 0; (((i < list.size())&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(567)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(568)==0&false)); i++) {{
            __CLR4_4_1f2f2lo0x4sbv.R.inc(569);if ((((i < list.size() / 2)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(570)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(571)==0&false))) {{
                __CLR4_4_1f2f2lo0x4sbv.R.inc(572);leftHalf.add(list.get(i));
            } }else {{
                __CLR4_4_1f2f2lo0x4sbv.R.inc(573);rightHalf.add(list.get(i));
            }
        }}
        }__CLR4_4_1f2f2lo0x4sbv.R.inc(574);ArrayList<Point> leftSubSkyLine = produceSubSkyLines(leftHalf);
        __CLR4_4_1f2f2lo0x4sbv.R.inc(575);ArrayList<Point> rightSubSkyLine = produceSubSkyLines(rightHalf);

        // skyline is produced
        __CLR4_4_1f2f2lo0x4sbv.R.inc(576);return produceFinalSkyLine(leftSubSkyLine, rightSubSkyLine);
    }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}

    /**
     * The first half's skyline gets cleared from some points that are not part
     * of the final skyline (Points with same x-value and different y=values.
     * The point with the smallest y-value is kept). Then, the minimum y-value
     * of the points of first half's skyline is found. That helps us to clear
     * the second half's skyline, because, the points of second half's skyline
     * that have greater y-value of the minimum y-value that we found before,
     * are dominated, so they are not part of the final skyline. Finally, the
     * "cleaned" first half's and second half's skylines, are combined,
     * producing the final skyline, which is returned.
     *
     * @param left the skyline of the left part of points
     * @param right the skyline of the right part of points
     * @return left the final skyline
     */
    public ArrayList<Point> produceFinalSkyLine(ArrayList<Point> left, ArrayList<Point> right) {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(577);
        // dominated points of ArrayList left are removed
        __CLR4_4_1f2f2lo0x4sbv.R.inc(578);for (int i = 0; (((i < left.size() - 1)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(579)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(580)==0&false)); i++) {{
            __CLR4_4_1f2f2lo0x4sbv.R.inc(581);if ((((left.get(i).x == left.get(i + 1).x && left.get(i).y > left.get(i + 1).y)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(582)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(583)==0&false))) {{
                __CLR4_4_1f2f2lo0x4sbv.R.inc(584);left.remove(i);
                __CLR4_4_1f2f2lo0x4sbv.R.inc(585);i--;
            }
        }}

        // minimum y-value is found
        }__CLR4_4_1f2f2lo0x4sbv.R.inc(586);int min = left.get(0).y;
        __CLR4_4_1f2f2lo0x4sbv.R.inc(587);for (int i = 1; (((i < left.size())&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(588)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(589)==0&false)); i++) {{
            __CLR4_4_1f2f2lo0x4sbv.R.inc(590);if ((((min > left.get(i).y)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(591)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(592)==0&false))) {{
                __CLR4_4_1f2f2lo0x4sbv.R.inc(593);min = left.get(i).y;
                __CLR4_4_1f2f2lo0x4sbv.R.inc(594);if ((((min == 1)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(595)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(596)==0&false))) {{
                    __CLR4_4_1f2f2lo0x4sbv.R.inc(597);i = left.size();
                }
            }}
        }}

        // dominated points of ArrayList right are removed
        }__CLR4_4_1f2f2lo0x4sbv.R.inc(598);for (int i = 0; (((i < right.size())&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(599)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(600)==0&false)); i++) {{
            __CLR4_4_1f2f2lo0x4sbv.R.inc(601);if ((((right.get(i).y >= min)&&(__CLR4_4_1f2f2lo0x4sbv.R.iget(602)!=0|true))||(__CLR4_4_1f2f2lo0x4sbv.R.iget(603)==0&false))) {{
                __CLR4_4_1f2f2lo0x4sbv.R.inc(604);right.remove(i);
                __CLR4_4_1f2f2lo0x4sbv.R.inc(605);i--;
            }
        }}

        // final skyline found and returned
        }__CLR4_4_1f2f2lo0x4sbv.R.inc(606);left.addAll(right);
        __CLR4_4_1f2f2lo0x4sbv.R.inc(607);return left;
    }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}

    public static class Point {

        private int x;
        private int y;

        /**
         * The main constructor of Point Class, used to represent the 2
         * Dimension points.
         *
         * @param x the point's x-value.
         * @param y the point's y-value.
         */
        public Point(int x, int y) {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(608);
            __CLR4_4_1f2f2lo0x4sbv.R.inc(609);this.x = x;
            __CLR4_4_1f2f2lo0x4sbv.R.inc(610);this.y = y;
        }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}

        /**
         * @return x, the x-value
         */
        public int getX() {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(611);
            __CLR4_4_1f2f2lo0x4sbv.R.inc(612);return x;
        }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}

        /**
         * @return y, the y-value
         */
        public int getY() {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(613);
            __CLR4_4_1f2f2lo0x4sbv.R.inc(614);return y;
        }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}

        /**
         * Based on the skyline theory, it checks if the point that calls the
         * function dominates the argument point.
         *
         * @param p1 the point that is compared
         * @return true if the point wich calls the function dominates p1 false
         * otherwise.
         */
        public boolean dominates(Point p1) {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(615);
            // checks if p1 is dominated
            __CLR4_4_1f2f2lo0x4sbv.R.inc(616);return ((this.x < p1.x && this.y <= p1.y) || (this.x <= p1.x && this.y < p1.y));
        }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}
    }

    /**
     * It is used to compare the 2 Dimension points, based on their x-values, in
     * order get sorted later.
     */
    class XComparator implements Comparator<Point> {

        @Override
        public int compare(Point a, Point b) {try{__CLR4_4_1f2f2lo0x4sbv.R.inc(617);
            __CLR4_4_1f2f2lo0x4sbv.R.inc(618);return Integer.compare(a.x, b.x);
        }finally{__CLR4_4_1f2f2lo0x4sbv.R.flushNeeded();}}
    }
}
