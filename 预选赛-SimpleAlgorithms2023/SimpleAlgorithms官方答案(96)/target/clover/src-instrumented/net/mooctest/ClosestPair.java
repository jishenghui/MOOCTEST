/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;


/**
 * For a set of points in a coordinates system (10000 maximum), ClosestPair
 * class calculates the two closest points.
 */
public final class ClosestPair {public static class __CLR4_4_17k7klo0x4sab{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0039\u0039\u0035\u0037\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697945872219L,8589935092L,480,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Number of points
     */
    int numberPoints;
    /**
     * Input data, maximum 10000.
     */
    private Location[] array;
    /**
     * Minimum point coordinate.
     */
    Location point1 = null;
    /**
     * Minimum point coordinate.
     */
    Location point2 = null;
    /**
     * Minimum point length.
     */
    private static double minNum = Double.MAX_VALUE;

    public static void setMinNum(double minNum) {try{__CLR4_4_17k7klo0x4sab.R.inc(272);
        __CLR4_4_17k7klo0x4sab.R.inc(273);ClosestPair.minNum = minNum;
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    public static void setSecondCount(int secondCount) {try{__CLR4_4_17k7klo0x4sab.R.inc(274);
        __CLR4_4_17k7klo0x4sab.R.inc(275);ClosestPair.secondCount = secondCount;
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * secondCount
     */
    private static int secondCount = 0;

    /**
     * Constructor.
     */
    ClosestPair(int points) {try{__CLR4_4_17k7klo0x4sab.R.inc(276);
        __CLR4_4_17k7klo0x4sab.R.inc(277);numberPoints = points;
        __CLR4_4_17k7klo0x4sab.R.inc(278);array = new Location[numberPoints];
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * Location class is an auxiliary type to keep points coordinates.
     */
    public static class Location {

        double x;
        double y;

        /**
         * @param xpar (IN Parameter) x coordinate <br>
         * @param ypar (IN Parameter) y coordinate <br>
         */
        Location(final double xpar, final double ypar) {try{__CLR4_4_17k7klo0x4sab.R.inc(279); // Save x, y coordinates
            __CLR4_4_17k7klo0x4sab.R.inc(280);this.x = xpar;
            __CLR4_4_17k7klo0x4sab.R.inc(281);this.y = ypar;
        }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}
    }

    public Location[] createLocation(int numberValues) {try{__CLR4_4_17k7klo0x4sab.R.inc(282);
        __CLR4_4_17k7klo0x4sab.R.inc(283);return new Location[numberValues];
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    public Location buildLocation(double x, double y) {try{__CLR4_4_17k7klo0x4sab.R.inc(284);
        __CLR4_4_17k7klo0x4sab.R.inc(285);return new Location(x, y);
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * xPartition function: arrange x-axis.
     *
     * @param a (IN Parameter) array of points <br>
     * @param first (IN Parameter) first point <br>
     * @param last (IN Parameter) last point <br>
     * @return pivot index
     */
    public int xPartition(final Location[] a, final int first, final int last) {try{__CLR4_4_17k7klo0x4sab.R.inc(286);
        __CLR4_4_17k7klo0x4sab.R.inc(287);Location pivot = a[last]; // pivot
        __CLR4_4_17k7klo0x4sab.R.inc(288);int i = first - 1;
        __CLR4_4_17k7klo0x4sab.R.inc(289);Location temp; // Temporarily store value for position transformation
        __CLR4_4_17k7klo0x4sab.R.inc(290);for (int j = first; (((j <= last - 1)&&(__CLR4_4_17k7klo0x4sab.R.iget(291)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(292)==0&false)); j++) {{
            __CLR4_4_17k7klo0x4sab.R.inc(293);if ((((a[j].x <= pivot.x)&&(__CLR4_4_17k7klo0x4sab.R.iget(294)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(295)==0&false))) {{ // Less than or less than pivot
                __CLR4_4_17k7klo0x4sab.R.inc(296);i++;
                __CLR4_4_17k7klo0x4sab.R.inc(297);temp = a[i]; // array[i] <-> array[j]
                __CLR4_4_17k7klo0x4sab.R.inc(298);a[i] = a[j];
                __CLR4_4_17k7klo0x4sab.R.inc(299);a[j] = temp;
            }
        }}
        }__CLR4_4_17k7klo0x4sab.R.inc(300);i++;
        __CLR4_4_17k7klo0x4sab.R.inc(301);temp = a[i]; // array[pivot] <-> array[i]
        __CLR4_4_17k7klo0x4sab.R.inc(302);a[i] = a[last];
        __CLR4_4_17k7klo0x4sab.R.inc(303);a[last] = temp;
        __CLR4_4_17k7klo0x4sab.R.inc(304);return i; // pivot index
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * yPartition function: arrange y-axis.
     *
     * @param a (IN Parameter) array of points <br>
     * @param first (IN Parameter) first point <br>
     * @param last (IN Parameter) last point <br>
     * @return pivot index
     */
    public int yPartition(final Location[] a, final int first, final int last) {try{__CLR4_4_17k7klo0x4sab.R.inc(305);
        __CLR4_4_17k7klo0x4sab.R.inc(306);Location pivot = a[last]; // pivot
        __CLR4_4_17k7klo0x4sab.R.inc(307);int i = first - 1;
        __CLR4_4_17k7klo0x4sab.R.inc(308);Location temp; // Temporarily store value for position transformation
        __CLR4_4_17k7klo0x4sab.R.inc(309);for (int j = first; (((j <= last - 1)&&(__CLR4_4_17k7klo0x4sab.R.iget(310)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(311)==0&false)); j++) {{
            __CLR4_4_17k7klo0x4sab.R.inc(312);if ((((a[j].y <= pivot.y)&&(__CLR4_4_17k7klo0x4sab.R.iget(313)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(314)==0&false))) {{ // Less than or less than pivot
                __CLR4_4_17k7klo0x4sab.R.inc(315);i++;
                __CLR4_4_17k7klo0x4sab.R.inc(316);temp = a[i]; // array[i] <-> array[j]
                __CLR4_4_17k7klo0x4sab.R.inc(317);a[i] = a[j];
                __CLR4_4_17k7klo0x4sab.R.inc(318);a[j] = temp;
            }
        }}
        }__CLR4_4_17k7klo0x4sab.R.inc(319);i++;
        __CLR4_4_17k7klo0x4sab.R.inc(320);temp = a[i]; // array[pivot] <-> array[i]
        __CLR4_4_17k7klo0x4sab.R.inc(321);a[i] = a[last];
        __CLR4_4_17k7klo0x4sab.R.inc(322);a[last] = temp;
        __CLR4_4_17k7klo0x4sab.R.inc(323);return i; // pivot index
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * xQuickSort function: //x-axis Quick Sorting.
     *
     * @param a (IN Parameter) array of points <br>
     * @param first (IN Parameter) first point <br>
     * @param last (IN Parameter) last point <br>
     */
    public void xQuickSort(final Location[] a, final int first, final int last) {try{__CLR4_4_17k7klo0x4sab.R.inc(324);
        __CLR4_4_17k7klo0x4sab.R.inc(325);if ((((first < last)&&(__CLR4_4_17k7klo0x4sab.R.iget(326)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(327)==0&false))) {{
            __CLR4_4_17k7klo0x4sab.R.inc(328);int q = xPartition(a, first, last); // pivot
            __CLR4_4_17k7klo0x4sab.R.inc(329);xQuickSort(a, first, q - 1); // Left
            __CLR4_4_17k7klo0x4sab.R.inc(330);xQuickSort(a, q + 1, last); // Right
        }
    }}finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * yQuickSort function: //y-axis Quick Sorting.
     *
     * @param a (IN Parameter) array of points <br>
     * @param first (IN Parameter) first point <br>
     * @param last (IN Parameter) last point <br>
     */
    public void yQuickSort(final Location[] a, final int first, final int last) {try{__CLR4_4_17k7klo0x4sab.R.inc(331);
        __CLR4_4_17k7klo0x4sab.R.inc(332);if ((((first < last)&&(__CLR4_4_17k7klo0x4sab.R.iget(333)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(334)==0&false))) {{
            __CLR4_4_17k7klo0x4sab.R.inc(335);int q = yPartition(a, first, last); // pivot
            __CLR4_4_17k7klo0x4sab.R.inc(336);yQuickSort(a, first, q - 1); // Left
            __CLR4_4_17k7klo0x4sab.R.inc(337);yQuickSort(a, q + 1, last); // Right
        }
    }}finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * closestPair function: find closest pair.
     *
     * @param a (IN Parameter) array stored before divide <br>
     * @param indexNum (IN Parameter) number coordinates divideArray <br>
     * @return minimum distance <br>
     */
    public double closestPair(final Location[] a, final int indexNum) {try{__CLR4_4_17k7klo0x4sab.R.inc(338);
        __CLR4_4_17k7klo0x4sab.R.inc(339);Location[] divideArray = new Location[indexNum];
        __CLR4_4_17k7klo0x4sab.R.inc(340);System.arraycopy(a, 0, divideArray, 0, indexNum); // Copy previous array
        __CLR4_4_17k7klo0x4sab.R.inc(341);int divideX = indexNum / 2; // Intermediate value for divide
        __CLR4_4_17k7klo0x4sab.R.inc(342);Location[] leftArray = new Location[divideX]; // divide - left array
        // divide-right array
        __CLR4_4_17k7klo0x4sab.R.inc(343);Location[] rightArray = new Location[indexNum - divideX];
        __CLR4_4_17k7klo0x4sab.R.inc(344);if ((((indexNum <= 3)&&(__CLR4_4_17k7klo0x4sab.R.iget(345)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(346)==0&false))) {{ // If the number of coordinates is 3 or less
            __CLR4_4_17k7klo0x4sab.R.inc(347);return bruteForce(divideArray);
        }
        // divide-left array
        }__CLR4_4_17k7klo0x4sab.R.inc(348);System.arraycopy(divideArray, 0, leftArray, 0, divideX);
        // divide-right array
        __CLR4_4_17k7klo0x4sab.R.inc(349);System.arraycopy(divideArray, divideX, rightArray, 0, indexNum - divideX);

        __CLR4_4_17k7klo0x4sab.R.inc(350);double minLeftArea; // Minimum length of left array
        __CLR4_4_17k7klo0x4sab.R.inc(351);double minRightArea; // Minimum length of right array
        __CLR4_4_17k7klo0x4sab.R.inc(352);double minValue; // Minimum lengt

        __CLR4_4_17k7klo0x4sab.R.inc(353);minLeftArea = closestPair(leftArray, divideX); // recursive closestPair
        __CLR4_4_17k7klo0x4sab.R.inc(354);minRightArea = closestPair(rightArray, indexNum - divideX);
        // window size (= minimum length)
        __CLR4_4_17k7klo0x4sab.R.inc(355);minValue = Math.min(minLeftArea, minRightArea);

        // Create window.  Set the size for creating a window
        // and creating a new array for the coordinates in the window
        __CLR4_4_17k7klo0x4sab.R.inc(356);for (int i = 0; (((i < indexNum)&&(__CLR4_4_17k7klo0x4sab.R.iget(357)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(358)==0&false)); i++) {{
            __CLR4_4_17k7klo0x4sab.R.inc(359);double xGap = Math.abs(divideArray[divideX].x - divideArray[i].x);
            __CLR4_4_17k7klo0x4sab.R.inc(360);if ((((xGap < minValue)&&(__CLR4_4_17k7klo0x4sab.R.iget(361)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(362)==0&false))) {{
                __CLR4_4_17k7klo0x4sab.R.inc(363);ClosestPair.setSecondCount(secondCount + 1); // size of the array
            } }else {{
                __CLR4_4_17k7klo0x4sab.R.inc(364);if ((((divideArray[i].x > divideArray[divideX].x)&&(__CLR4_4_17k7klo0x4sab.R.iget(365)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(366)==0&false))) {{
                    __CLR4_4_17k7klo0x4sab.R.inc(367);break;
                }
            }}
        }}
        // new array for coordinates in window
        }__CLR4_4_17k7klo0x4sab.R.inc(368);Location[] firstWindow = new Location[secondCount];
        __CLR4_4_17k7klo0x4sab.R.inc(369);int k = 0;
        __CLR4_4_17k7klo0x4sab.R.inc(370);for (int i = 0; (((i < indexNum)&&(__CLR4_4_17k7klo0x4sab.R.iget(371)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(372)==0&false)); i++) {{
            __CLR4_4_17k7klo0x4sab.R.inc(373);double xGap = Math.abs(divideArray[divideX].x - divideArray[i].x);
            __CLR4_4_17k7klo0x4sab.R.inc(374);if ((((xGap < minValue)&&(__CLR4_4_17k7klo0x4sab.R.iget(375)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(376)==0&false))) {{ // if it's inside a window
                __CLR4_4_17k7klo0x4sab.R.inc(377);firstWindow[k] = divideArray[i]; // put in an array
                __CLR4_4_17k7klo0x4sab.R.inc(378);k++;
            } }else {{
                __CLR4_4_17k7klo0x4sab.R.inc(379);if ((((divideArray[i].x > divideArray[divideX].x)&&(__CLR4_4_17k7klo0x4sab.R.iget(380)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(381)==0&false))) {{
                    __CLR4_4_17k7klo0x4sab.R.inc(382);break;
                }
            }}
        }}
        }__CLR4_4_17k7klo0x4sab.R.inc(383);yQuickSort(firstWindow, 0, secondCount - 1); // Sort by y coordinates
        /* Coordinates in Window */
        __CLR4_4_17k7klo0x4sab.R.inc(384);double length;
        // size comparison within window
        __CLR4_4_17k7klo0x4sab.R.inc(385);for (int i = 0; (((i < secondCount - 1)&&(__CLR4_4_17k7klo0x4sab.R.iget(386)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(387)==0&false)); i++) {{
            __CLR4_4_17k7klo0x4sab.R.inc(388);for (int j = (i + 1); (((j < secondCount)&&(__CLR4_4_17k7klo0x4sab.R.iget(389)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(390)==0&false)); j++) {{
                __CLR4_4_17k7klo0x4sab.R.inc(391);double xGap = Math.abs(firstWindow[i].x - firstWindow[j].x);
                __CLR4_4_17k7klo0x4sab.R.inc(392);double yGap = Math.abs(firstWindow[i].y - firstWindow[j].y);
                __CLR4_4_17k7klo0x4sab.R.inc(393);if ((((yGap < minValue)&&(__CLR4_4_17k7klo0x4sab.R.iget(394)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(395)==0&false))) {{
                    __CLR4_4_17k7klo0x4sab.R.inc(396);length = Math.sqrt(Math.pow(xGap, 2) + Math.pow(yGap, 2));
                    // If measured distance is less than current min distance
                    __CLR4_4_17k7klo0x4sab.R.inc(397);if ((((length < minValue)&&(__CLR4_4_17k7klo0x4sab.R.iget(398)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(399)==0&false))) {{
                        // Change minimum distance to current distance
                        __CLR4_4_17k7klo0x4sab.R.inc(400);minValue = length;
                        // Conditional for registering final coordinate
                        __CLR4_4_17k7klo0x4sab.R.inc(401);if ((((length < minNum)&&(__CLR4_4_17k7klo0x4sab.R.iget(402)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(403)==0&false))) {{
                            __CLR4_4_17k7klo0x4sab.R.inc(404);ClosestPair.setMinNum(length);
                            __CLR4_4_17k7klo0x4sab.R.inc(405);point1 = firstWindow[i];
                            __CLR4_4_17k7klo0x4sab.R.inc(406);point2 = firstWindow[j];
                        }
                    }}
                }} }else {{
                    __CLR4_4_17k7klo0x4sab.R.inc(407);break;
                }
            }}
        }}
        }__CLR4_4_17k7klo0x4sab.R.inc(408);ClosestPair.setSecondCount(0);
        __CLR4_4_17k7klo0x4sab.R.inc(409);return minValue;
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * bruteForce function: When the number of coordinates is less than 3.
     *
     * @param arrayParam (IN Parameter) array stored before divide <br>
     * @return <br>
     */
    public double bruteForce(final Location[] arrayParam) {try{__CLR4_4_17k7klo0x4sab.R.inc(410);
        __CLR4_4_17k7klo0x4sab.R.inc(411);double minValue = Double.MAX_VALUE; // minimum distance
        __CLR4_4_17k7klo0x4sab.R.inc(412);double length;
        __CLR4_4_17k7klo0x4sab.R.inc(413);double xGap; // Difference between x coordinates
        __CLR4_4_17k7klo0x4sab.R.inc(414);double yGap; // Difference between y coordinates
        __CLR4_4_17k7klo0x4sab.R.inc(415);double result = 0;

        __CLR4_4_17k7klo0x4sab.R.inc(416);if ((((arrayParam.length == 2)&&(__CLR4_4_17k7klo0x4sab.R.iget(417)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(418)==0&false))) {{
            // Difference between x coordinates
            __CLR4_4_17k7klo0x4sab.R.inc(419);xGap = (arrayParam[0].x - arrayParam[1].x);
            // Difference between y coordinates
            __CLR4_4_17k7klo0x4sab.R.inc(420);yGap = (arrayParam[0].y - arrayParam[1].y);
            // distance between coordinates
            __CLR4_4_17k7klo0x4sab.R.inc(421);length = Math.sqrt(Math.pow(xGap, 2) + Math.pow(yGap, 2));
            // Conditional statement for registering final coordinate
            __CLR4_4_17k7klo0x4sab.R.inc(422);if ((((length < minNum)&&(__CLR4_4_17k7klo0x4sab.R.iget(423)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(424)==0&false))) {{
                __CLR4_4_17k7klo0x4sab.R.inc(425);ClosestPair.setMinNum(length);
            }
            }__CLR4_4_17k7klo0x4sab.R.inc(426);point1 = arrayParam[0];
            __CLR4_4_17k7klo0x4sab.R.inc(427);point2 = arrayParam[1];
            __CLR4_4_17k7klo0x4sab.R.inc(428);result = length;
        }
        }__CLR4_4_17k7klo0x4sab.R.inc(429);if ((((arrayParam.length == 3)&&(__CLR4_4_17k7klo0x4sab.R.iget(430)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(431)==0&false))) {{
            __CLR4_4_17k7klo0x4sab.R.inc(432);for (int i = 0; (((i < arrayParam.length - 1)&&(__CLR4_4_17k7klo0x4sab.R.iget(433)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(434)==0&false)); i++) {{
                __CLR4_4_17k7klo0x4sab.R.inc(435);for (int j = (i + 1); (((j < arrayParam.length)&&(__CLR4_4_17k7klo0x4sab.R.iget(436)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(437)==0&false)); j++) {{
                    // Difference between x coordinates
                    __CLR4_4_17k7klo0x4sab.R.inc(438);xGap = (arrayParam[i].x - arrayParam[j].x);
                    // Difference between y coordinates
                    __CLR4_4_17k7klo0x4sab.R.inc(439);yGap = (arrayParam[i].y - arrayParam[j].y);
                    // distance between coordinates
                    __CLR4_4_17k7klo0x4sab.R.inc(440);length = Math.sqrt(Math.pow(xGap, 2) + Math.pow(yGap, 2));
                    // If measured distance is less than current min distance
                    __CLR4_4_17k7klo0x4sab.R.inc(441);if ((((length < minValue)&&(__CLR4_4_17k7klo0x4sab.R.iget(442)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(443)==0&false))) {{
                        // Change minimum distance to current distance
                        __CLR4_4_17k7klo0x4sab.R.inc(444);minValue = length;
                        __CLR4_4_17k7klo0x4sab.R.inc(445);if ((((length < minNum)&&(__CLR4_4_17k7klo0x4sab.R.iget(446)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(447)==0&false))) {{
                            // Registering final coordinate
                            __CLR4_4_17k7klo0x4sab.R.inc(448);ClosestPair.setMinNum(length);
                            __CLR4_4_17k7klo0x4sab.R.inc(449);point1 = arrayParam[i];
                            __CLR4_4_17k7klo0x4sab.R.inc(450);point2 = arrayParam[j];
                        }
                    }}
                }}
            }}
            }__CLR4_4_17k7klo0x4sab.R.inc(451);result = minValue;
        }
        }__CLR4_4_17k7klo0x4sab.R.inc(452);return result; // If only one point returns 0.
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}

    /**
     * main function: execute class.
     *
     * @param args (IN Parameter) <br>
     */
    public static void main(final String[] args) {try{__CLR4_4_17k7klo0x4sab.R.inc(453);
        // Input data consists of one x-coordinate and one y-coordinate
        __CLR4_4_17k7klo0x4sab.R.inc(454);ClosestPair cp = new ClosestPair(12);
        __CLR4_4_17k7klo0x4sab.R.inc(455);cp.array[0] = cp.buildLocation(2, 3);
        __CLR4_4_17k7klo0x4sab.R.inc(456);cp.array[1] = cp.buildLocation(2, 16);
        __CLR4_4_17k7klo0x4sab.R.inc(457);cp.array[2] = cp.buildLocation(3, 9);
        __CLR4_4_17k7klo0x4sab.R.inc(458);cp.array[3] = cp.buildLocation(6, 3);
        __CLR4_4_17k7klo0x4sab.R.inc(459);cp.array[4] = cp.buildLocation(7, 7);
        __CLR4_4_17k7klo0x4sab.R.inc(460);cp.array[5] = cp.buildLocation(19, 4);
        __CLR4_4_17k7klo0x4sab.R.inc(461);cp.array[6] = cp.buildLocation(10, 11);
        __CLR4_4_17k7klo0x4sab.R.inc(462);cp.array[7] = cp.buildLocation(15, 2);
        __CLR4_4_17k7klo0x4sab.R.inc(463);cp.array[8] = cp.buildLocation(15, 19);
        __CLR4_4_17k7klo0x4sab.R.inc(464);cp.array[9] = cp.buildLocation(16, 11);
        __CLR4_4_17k7klo0x4sab.R.inc(465);cp.array[10] = cp.buildLocation(17, 13);
        __CLR4_4_17k7klo0x4sab.R.inc(466);cp.array[11] = cp.buildLocation(9, 12);

        __CLR4_4_17k7klo0x4sab.R.inc(467);System.out.println("Input data");
        __CLR4_4_17k7klo0x4sab.R.inc(468);System.out.println("Number of points: " + cp.array.length);
        __CLR4_4_17k7klo0x4sab.R.inc(469);for (int i = 0; (((i < cp.array.length)&&(__CLR4_4_17k7klo0x4sab.R.iget(470)!=0|true))||(__CLR4_4_17k7klo0x4sab.R.iget(471)==0&false)); i++) {{
            __CLR4_4_17k7klo0x4sab.R.inc(472);System.out.println("x: " + cp.array[i].x + ", y: " + cp.array[i].y);
        }

        }__CLR4_4_17k7klo0x4sab.R.inc(473);cp.xQuickSort(cp.array, 0, cp.array.length - 1); // Sorting by x value

        __CLR4_4_17k7klo0x4sab.R.inc(474);double result; // minimum distance

        __CLR4_4_17k7klo0x4sab.R.inc(475);result = cp.closestPair(cp.array, cp.array.length);
        // ClosestPair start
        // minimum distance coordinates and distance output
        __CLR4_4_17k7klo0x4sab.R.inc(476);System.out.println("Output Data");
        __CLR4_4_17k7klo0x4sab.R.inc(477);System.out.println("(" + cp.point1.x + ", " + cp.point1.y + ")");
        __CLR4_4_17k7klo0x4sab.R.inc(478);System.out.println("(" + cp.point2.x + ", " + cp.point2.y + ")");
        __CLR4_4_17k7klo0x4sab.R.inc(479);System.out.println("Minimum Distance : " + result);
    }finally{__CLR4_4_17k7klo0x4sab.R.flushNeeded();}}
}
