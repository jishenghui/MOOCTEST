/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.List;

@java.lang.SuppressWarnings({"fallthrough"}) public class Gomoku {public static class __CLR4_4_100kv4p59ij{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u0047\u006f\u006d\u006f\u006b\u0075\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047634904L,8589935092L,510,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public final static int AI = 1;
    public final static int PLAYER = 2;
    public final static int BLANK = 0;
    private final static int WIN = 0;
    private final static int HUO4 = 1;
    private final static int CHONG4 = 2;
    private final static int HUO3 = 3;
    private final static int MIAN3 = 4;
    private final static int HUO2 = 5;
    private final static int MIAN2 = 6;
    private final static int OL1 = 7;
    private final static int NONE = 8;
    private final static String[] WIN_AI = {"11111"};
    private final static String[] WIN_PLAYER = {"22222"};
    private final static String[] HUO4_AI = {"011110"};
    private final static String[] HUO4_PLAYER = {"022220"};
    private final static String[] CHONG4_AI = {"011112", "211110", "10111", "11011", "11101"};
    private final static String[] CHONG4_PLAYER = {"022221", "122220", "20222", "22022", "22202"};
    private final static String[] HUO3_AI = {"001110", "011100", "010110", "011010"};
    private final static String[] HUO3_PLAYER = {"002220", "022200", "020220", "022020"};
    private final static String[] MIAN3_AI = {"001112", "010112", "011012", "011102", "211100", "211010", "210110", "201110", "00111", "10011", "10101", "10110", "01011", "10011", "11001", "11010", "01101", "10101", "11001", "11100",};
    private final static String[] MIAN3_PLAYER = {"002221", "020221", "022021", "022201", "122200", "122020", "120220", "102220", "00222", "20022", "20202", "20220", "02022", "20022", "22002", "22020", "02202", "20202", "22002", "22200",};
    private final static String[] HUO2_AI = {"000110", "001010", "001100", "001100", "010100", "011000", "000110", "010010", "010100", "001010", "010010", "011000",};
    private final static String[] HUO2_PLAYER = {"000220", "002020", "002200", "002200", "020200", "022000", "000220", "020020", "020200", "002020", "020020", "022000",};
    private final static String[] MIAN2_AI = {"000112", "001012", "010012", "10001", "2010102", "2011002", "211000", "210100", "210010", "2001102"};
    private final static String[] MIAN2_PLAYER = {"000221", "002021", "020021", "20002", "1020201", "1022001", "122000", "120200", "120020", "1002201"};
    private final static String[] OL1_AI = {"1"};
    private final static String[] OL1_PLAYER = {"2"};
    private final static String[] NONE_ = {""};
 
    private final static int BOARD_SIZE = 15;
  
    private static int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
    private static int[][] scoreMatrix = new int[BOARD_SIZE][BOARD_SIZE];
    private static final int INFINITY = 1000000000;


    public static int alphaBeta(Node node, int alpha, int beta, int depth) {try{__CLR4_4_100kv4p59ij.R.inc(0);
        __CLR4_4_100kv4p59ij.R.inc(1);if ((((checkSituation(node.p, getString(node.x, node.y), WIN))&&(__CLR4_4_100kv4p59ij.R.iget(2)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(3)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(4);if ((((node.p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(5)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(6)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(7);return INFINITY;
            } }else {{
                __CLR4_4_100kv4p59ij.R.inc(8);return -INFINITY;
            }
        }}
        }__CLR4_4_100kv4p59ij.R.inc(9);if ((((depth == 0)&&(__CLR4_4_100kv4p59ij.R.iget(10)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(11)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(12);return computeScore();
        }
        }__CLR4_4_100kv4p59ij.R.inc(13);if ((((node.p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(14)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(15)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(16);for (int i = 0; (((i < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(17)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(18)==0&false)); i++) {{
                __CLR4_4_100kv4p59ij.R.inc(19);for (int j = 0; (((j < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(20)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(21)==0&false)); j++) {{
                    __CLR4_4_100kv4p59ij.R.inc(22);if ((((isValid(i, j))&&(__CLR4_4_100kv4p59ij.R.iget(23)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(24)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(25);board[i][j] = node.p;
                        __CLR4_4_100kv4p59ij.R.inc(26);Node child = new Node(node);
                        __CLR4_4_100kv4p59ij.R.inc(27);child.x = i;
                        __CLR4_4_100kv4p59ij.R.inc(28);child.y = j;
                        __CLR4_4_100kv4p59ij.R.inc(29);int val = alphaBeta(child, alpha, beta, depth - 1);
                        __CLR4_4_100kv4p59ij.R.inc(30);board[i][j] = BLANK;
                        __CLR4_4_100kv4p59ij.R.inc(31);if ((((val > alpha)&&(__CLR4_4_100kv4p59ij.R.iget(32)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(33)==0&false))) {{
                            __CLR4_4_100kv4p59ij.R.inc(34);alpha = val;
                            __CLR4_4_100kv4p59ij.R.inc(35);scoreMatrix[i][j] = alpha;
                        }
                        }__CLR4_4_100kv4p59ij.R.inc(36);if ((((alpha >= beta)&&(__CLR4_4_100kv4p59ij.R.iget(37)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(38)==0&false))) {{
                            __CLR4_4_100kv4p59ij.R.inc(39);break;
                        }
                    }}
                }}
                }__CLR4_4_100kv4p59ij.R.inc(40);if ((((alpha >= beta)&&(__CLR4_4_100kv4p59ij.R.iget(41)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(42)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(43);break;
                }
            }}
            }__CLR4_4_100kv4p59ij.R.inc(44);return alpha;
        } }else {{
            __CLR4_4_100kv4p59ij.R.inc(45);for (int i = 0; (((i < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(46)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(47)==0&false)); i++) {{
                __CLR4_4_100kv4p59ij.R.inc(48);for (int j = 0; (((j < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(49)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(50)==0&false)); j++) {{
                    __CLR4_4_100kv4p59ij.R.inc(51);if ((((isValid(i, j))&&(__CLR4_4_100kv4p59ij.R.iget(52)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(53)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(54);board[i][j] = node.p;
                        __CLR4_4_100kv4p59ij.R.inc(55);Node child = new Node(node);
                        __CLR4_4_100kv4p59ij.R.inc(56);child.x = i;
                        __CLR4_4_100kv4p59ij.R.inc(57);child.y = j;
                        __CLR4_4_100kv4p59ij.R.inc(58);int val = alphaBeta(child, alpha, beta, depth - 1);
                        __CLR4_4_100kv4p59ij.R.inc(59);board[i][j] = BLANK;
                        __CLR4_4_100kv4p59ij.R.inc(60);if ((((val < beta)&&(__CLR4_4_100kv4p59ij.R.iget(61)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(62)==0&false))) {{
                            __CLR4_4_100kv4p59ij.R.inc(63);beta = val;
                            __CLR4_4_100kv4p59ij.R.inc(64);scoreMatrix[i][j] = beta;
                        }
                        }__CLR4_4_100kv4p59ij.R.inc(65);if ((((alpha >= beta)&&(__CLR4_4_100kv4p59ij.R.iget(66)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(67)==0&false))) {{
                            __CLR4_4_100kv4p59ij.R.inc(68);break;
                        }
                    }}
                }}
                }__CLR4_4_100kv4p59ij.R.inc(69);if ((((alpha >= beta)&&(__CLR4_4_100kv4p59ij.R.iget(70)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(71)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(72);break;
                }
            }}
            }__CLR4_4_100kv4p59ij.R.inc(73);return beta;
        }
    }}finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}

    public static Node getBestStep(List<Node> nodes) {try{__CLR4_4_100kv4p59ij.R.inc(74);
        __CLR4_4_100kv4p59ij.R.inc(75);Node node = nodes.get(0);
        __CLR4_4_100kv4p59ij.R.inc(76);board[node.x][node.y] = node.p;
        __CLR4_4_100kv4p59ij.R.inc(77);int v = computeScore();
        __CLR4_4_100kv4p59ij.R.inc(78);board[node.x][node.y] = BLANK;
        __CLR4_4_100kv4p59ij.R.inc(79);int index = 0;
        __CLR4_4_100kv4p59ij.R.inc(80);for (int i = 0; (((i < nodes.size())&&(__CLR4_4_100kv4p59ij.R.iget(81)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(82)==0&false)); i++) {{
            __CLR4_4_100kv4p59ij.R.inc(83);Node n = nodes.get(i);
            __CLR4_4_100kv4p59ij.R.inc(84);board[n.x][n.y] = n.p;
            __CLR4_4_100kv4p59ij.R.inc(85);int v1 = computeScore();
            __CLR4_4_100kv4p59ij.R.inc(86);if ((((v1 > v)&&(__CLR4_4_100kv4p59ij.R.iget(87)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(88)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(89);index = i;
            }
            }__CLR4_4_100kv4p59ij.R.inc(90);board[n.x][n.y] = BLANK;
        }
        }__CLR4_4_100kv4p59ij.R.inc(91);node = nodes.get(index);
        __CLR4_4_100kv4p59ij.R.inc(92);return node;
    }finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}

    public static int computeScore() {try{__CLR4_4_100kv4p59ij.R.inc(93);
        __CLR4_4_100kv4p59ij.R.inc(94);int score = 0;
        __CLR4_4_100kv4p59ij.R.inc(95);for (int i = 0; (((i < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(96)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(97)==0&false)); i++) {{
            __CLR4_4_100kv4p59ij.R.inc(98);for (int j = 0; (((j < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(99)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(100)==0&false)); j++) {{
                __CLR4_4_100kv4p59ij.R.inc(101);if ((((board[i][j] != BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(102)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(103)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(104);List<String> list = getString(i, j);
                    __CLR4_4_100kv4p59ij.R.inc(105);if ((((checkSituation(AI, list, WIN))&&(__CLR4_4_100kv4p59ij.R.iget(106)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(107)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(108);score += 100000000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(109);if ((((checkSituation(PLAYER, list, WIN))&&(__CLR4_4_100kv4p59ij.R.iget(110)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(111)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(112);score += -100000000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(113);if ((((checkSituation(AI, list, HUO4))&&(__CLR4_4_100kv4p59ij.R.iget(114)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(115)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(116);score += 10000000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(117);if ((((checkSituation(PLAYER, list, HUO4))&&(__CLR4_4_100kv4p59ij.R.iget(118)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(119)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(120);score += -10000000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(121);if ((((checkSituation(AI, list, CHONG4))&&(__CLR4_4_100kv4p59ij.R.iget(122)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(123)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(124);score += 1000000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(125);if ((((checkSituation(PLAYER, list, CHONG4))&&(__CLR4_4_100kv4p59ij.R.iget(126)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(127)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(128);score += -1000000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(129);if ((((checkSituation(AI, list, HUO3))&&(__CLR4_4_100kv4p59ij.R.iget(130)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(131)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(132);score += 100000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(133);if ((((checkSituation(PLAYER, list, HUO3))&&(__CLR4_4_100kv4p59ij.R.iget(134)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(135)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(136);score += -100000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(137);if ((((checkSituation(AI, list, MIAN3))&&(__CLR4_4_100kv4p59ij.R.iget(138)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(139)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(140);score += 10000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(141);if ((((checkSituation(PLAYER, list, MIAN3))&&(__CLR4_4_100kv4p59ij.R.iget(142)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(143)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(144);score += -10000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(145);if ((((checkSituation(AI, list, HUO2))&&(__CLR4_4_100kv4p59ij.R.iget(146)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(147)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(148);score += 1000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(149);if ((((checkSituation(PLAYER, list, HUO2))&&(__CLR4_4_100kv4p59ij.R.iget(150)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(151)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(152);score += -1000;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(153);if ((((checkSituation(AI, list, MIAN2))&&(__CLR4_4_100kv4p59ij.R.iget(154)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(155)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(156);score += 100;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(157);if ((((checkSituation(PLAYER, list, MIAN2))&&(__CLR4_4_100kv4p59ij.R.iget(158)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(159)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(160);score += -100;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(161);if ((((checkSituation(AI, list, OL1))&&(__CLR4_4_100kv4p59ij.R.iget(162)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(163)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(164);score += 10;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(165);if ((((checkSituation(PLAYER, list, OL1))&&(__CLR4_4_100kv4p59ij.R.iget(166)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(167)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(168);score += -10;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(169);if ((((checkSituation(AI, list, NONE))&&(__CLR4_4_100kv4p59ij.R.iget(170)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(171)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(172);score += 1;
                    }
                    }__CLR4_4_100kv4p59ij.R.inc(173);if ((((checkSituation(PLAYER, list, NONE))&&(__CLR4_4_100kv4p59ij.R.iget(174)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(175)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(176);score += -1;
                    }
                }}
            }}
        }}
        }__CLR4_4_100kv4p59ij.R.inc(177);return score;
    }finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}

    public static boolean checkSituation(int p, List<String> list, int type) {try{__CLR4_4_100kv4p59ij.R.inc(178);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_100kv4p59ij.R.inc(179);switch (type) {
            case WIN:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(180);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(181);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(182)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(183)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(184);if ((((checkString(list, WIN_AI))&&(__CLR4_4_100kv4p59ij.R.iget(185)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(186)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(187);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(188);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(189)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(190)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(191);if ((((checkString(list, WIN_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(192)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(193)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(194);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(195);return false;
            case HUO4:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(196);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(197);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(198)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(199)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(200);if ((((checkString(list, HUO4_AI))&&(__CLR4_4_100kv4p59ij.R.iget(201)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(202)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(203);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(204);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(205)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(206)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(207);if ((((checkString(list, HUO4_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(208)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(209)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(210);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(211);return false;
            case CHONG4:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(212);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(213);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(214)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(215)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(216);if ((((checkString(list, CHONG4_AI))&&(__CLR4_4_100kv4p59ij.R.iget(217)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(218)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(219);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(220);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(221)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(222)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(223);if ((((checkString(list, CHONG4_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(224)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(225)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(226);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(227);return false;
            case HUO3:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(228);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(229);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(230)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(231)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(232);if ((((checkString(list, HUO3_AI))&&(__CLR4_4_100kv4p59ij.R.iget(233)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(234)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(235);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(236);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(237)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(238)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(239);if ((((checkString(list, HUO3_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(240)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(241)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(242);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(243);return false;
            case MIAN3:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(244);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(245);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(246)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(247)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(248);if ((((checkString(list, MIAN3_AI))&&(__CLR4_4_100kv4p59ij.R.iget(249)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(250)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(251);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(252);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(253)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(254)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(255);if ((((checkString(list, MIAN3_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(256)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(257)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(258);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(259);return false;
            case HUO2:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(260);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(261);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(262)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(263)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(264);if ((((checkString(list, HUO2_AI))&&(__CLR4_4_100kv4p59ij.R.iget(265)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(266)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(267);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(268);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(269)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(270)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(271);if ((((checkString(list, HUO2_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(272)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(273)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(274);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(275);return false;
            case MIAN2:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(276);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(277);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(278)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(279)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(280);if ((((checkString(list, MIAN2_AI))&&(__CLR4_4_100kv4p59ij.R.iget(281)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(282)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(283);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(284);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(285)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(286)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(287);if ((((checkString(list, MIAN2_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(288)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(289)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(290);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(291);return false;
            case OL1:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(292);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(293);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(294)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(295)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(296);if ((((checkString(list, OL1_AI))&&(__CLR4_4_100kv4p59ij.R.iget(297)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(298)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(299);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(300);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(301)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(302)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(303);if ((((checkString(list, OL1_PLAYER))&&(__CLR4_4_100kv4p59ij.R.iget(304)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(305)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(306);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(307);return false;
            case NONE:if (!__CLB4_4_1_bool0) {__CLR4_4_100kv4p59ij.R.inc(308);__CLB4_4_1_bool0=true;}
                __CLR4_4_100kv4p59ij.R.inc(309);if ((((p == AI)&&(__CLR4_4_100kv4p59ij.R.iget(310)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(311)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(312);if ((((checkString(list, NONE_))&&(__CLR4_4_100kv4p59ij.R.iget(313)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(314)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(315);return true;
                    }
                }} }else {__CLR4_4_100kv4p59ij.R.inc(316);if ((((p == PLAYER)&&(__CLR4_4_100kv4p59ij.R.iget(317)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(318)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(319);if ((((checkString(list, NONE_))&&(__CLR4_4_100kv4p59ij.R.iget(320)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(321)==0&false))) {{
                        __CLR4_4_100kv4p59ij.R.inc(322);return true;
                    }
                }}
                }}__CLR4_4_100kv4p59ij.R.inc(323);return false;
        }
        __CLR4_4_100kv4p59ij.R.inc(324);return true;
    }finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}

    public static boolean checkString(List<String> list, String[] situation) {try{__CLR4_4_100kv4p59ij.R.inc(325);
        __CLR4_4_100kv4p59ij.R.inc(326);for (String str : list) {{
            __CLR4_4_100kv4p59ij.R.inc(327);for (int i = 0; (((i < situation.length)&&(__CLR4_4_100kv4p59ij.R.iget(328)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(329)==0&false)); i++) {{
                __CLR4_4_100kv4p59ij.R.inc(330);if ((((str.contains(situation[i]))&&(__CLR4_4_100kv4p59ij.R.iget(331)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(332)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(333);return true;
                }
            }}
        }}
        }__CLR4_4_100kv4p59ij.R.inc(334);return false;
    }finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}

    public static List<String> getString(int x, int y) {try{__CLR4_4_100kv4p59ij.R.inc(335);
        __CLR4_4_100kv4p59ij.R.inc(336);List<String> strings = new ArrayList<>();
        __CLR4_4_100kv4p59ij.R.inc(337);StringBuffer sb = new StringBuffer();
        __CLR4_4_100kv4p59ij.R.inc(338);for (int i = 0, j = y; (((i < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(339)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(340)==0&false)); i++) {{
            __CLR4_4_100kv4p59ij.R.inc(341);sb.append(board[i][j]);
        }
        }__CLR4_4_100kv4p59ij.R.inc(342);strings.add(sb.toString());
        __CLR4_4_100kv4p59ij.R.inc(343);sb.delete(0, sb.length());
        __CLR4_4_100kv4p59ij.R.inc(344);for (int i = x, j = 0; (((j < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(345)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(346)==0&false)); j++) {{
            __CLR4_4_100kv4p59ij.R.inc(347);sb.append(board[i][j]);
        }
        }__CLR4_4_100kv4p59ij.R.inc(348);strings.add(sb.toString());
        __CLR4_4_100kv4p59ij.R.inc(349);sb.delete(0, sb.length());
       
        __CLR4_4_100kv4p59ij.R.inc(350);if ((((x + y < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(351)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(352)==0&false))) {{ 
            __CLR4_4_100kv4p59ij.R.inc(353);for (int i = 0, j = x + y; (((i < BOARD_SIZE && j >= 0)&&(__CLR4_4_100kv4p59ij.R.iget(354)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(355)==0&false)); i++, j--) {{
                __CLR4_4_100kv4p59ij.R.inc(356);sb.append(board[i][j]);
            }
        }} }else {{
            __CLR4_4_100kv4p59ij.R.inc(357);for (int i = x + y - 7, j = BOARD_SIZE - 1; (((i < BOARD_SIZE && j >= 0)&&(__CLR4_4_100kv4p59ij.R.iget(358)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(359)==0&false)); i++, j--) {{
                __CLR4_4_100kv4p59ij.R.inc(360);sb.append(board[i][j]);
            }
        }}
        }__CLR4_4_100kv4p59ij.R.inc(361);strings.add(sb.toString());
        __CLR4_4_100kv4p59ij.R.inc(362);sb.delete(0, sb.length());
      
        __CLR4_4_100kv4p59ij.R.inc(363);if ((((x <= y)&&(__CLR4_4_100kv4p59ij.R.iget(364)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(365)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(366);for (int i = 0, j = y - x; (((i < BOARD_SIZE && j < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(367)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(368)==0&false)); i++, j++) {{  // \u59ab\u5b2c\u6d0f\u6d93\u5a41\u7b01\u7459\ufffd
                __CLR4_4_100kv4p59ij.R.inc(369);sb.append(board[i][j]);
            }
        }} }else {{
            __CLR4_4_100kv4p59ij.R.inc(370);for (int i = x - y, j = 0; (((i < BOARD_SIZE && j < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(371)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(372)==0&false)); i++, j++) {{  // \u59ab\u5b2c\u6d0f\u6d93\u5b29\u7b01\u7459\ufffd
                __CLR4_4_100kv4p59ij.R.inc(373);sb.append(board[i][j]);
            }
        }}
        }__CLR4_4_100kv4p59ij.R.inc(374);strings.add(sb.toString());
        __CLR4_4_100kv4p59ij.R.inc(375);sb.delete(0, sb.length());
        __CLR4_4_100kv4p59ij.R.inc(376);return strings;
    }finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}

    public static void initBoard() {try{__CLR4_4_100kv4p59ij.R.inc(377);
        __CLR4_4_100kv4p59ij.R.inc(378);board[7][7] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(379);board[7][6] = AI;
        __CLR4_4_100kv4p59ij.R.inc(380);board[8][6] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(381);board[8][5] = AI;
        __CLR4_4_100kv4p59ij.R.inc(382);board[8][7] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(383);board[9][5] = AI;
        __CLR4_4_100kv4p59ij.R.inc(384);board[9][6] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(385);board[7][5] = AI;
        __CLR4_4_100kv4p59ij.R.inc(386);board[10][5] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(387);board[7][8] = AI;
        __CLR4_4_100kv4p59ij.R.inc(388);board[8][8] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(389);board[8][9] = AI;
        __CLR4_4_100kv4p59ij.R.inc(390);board[6][7] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(391);board[9][7] = AI;
        __CLR4_4_100kv4p59ij.R.inc(392);board[6][6] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(393);board[9][9] = AI;
        __CLR4_4_100kv4p59ij.R.inc(394);board[10][6] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(395);board[11][6] = AI;
        __CLR4_4_100kv4p59ij.R.inc(396);board[10][7] = PLAYER;
        __CLR4_4_100kv4p59ij.R.inc(397);board[10][4] = AI;
        __CLR4_4_100kv4p59ij.R.inc(398);board[6][8] = PLAYER;
    }finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}

    public static boolean isValid(int x, int y) {try{__CLR4_4_100kv4p59ij.R.inc(399);
        __CLR4_4_100kv4p59ij.R.inc(400);if ((((board[x][y] != BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(401)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(402)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(403);return false;
        }
        }__CLR4_4_100kv4p59ij.R.inc(404);if ((((x == 0)&&(__CLR4_4_100kv4p59ij.R.iget(405)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(406)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(407);if ((((y == 0)&&(__CLR4_4_100kv4p59ij.R.iget(408)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(409)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(410);if ((((board[x + 1][y] == BLANK && board[x][y + 1] == BLANK && board[x + 1][y + 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(411)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(412)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(413);return false;
                }
            }} }else {__CLR4_4_100kv4p59ij.R.inc(414);if ((((y == BOARD_SIZE - 1)&&(__CLR4_4_100kv4p59ij.R.iget(415)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(416)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(417);if ((((board[x + 1][y] == BLANK && board[x][y - 1] == BLANK && board[x + 1][y - 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(418)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(419)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(420);return false;
                }
            }} }else {{
                __CLR4_4_100kv4p59ij.R.inc(421);if ((((board[x][y + 1] == BLANK && board[x][y - 1] == BLANK && board[x + 1][y + 1] == BLANK && board[x + 1][y - 1] == BLANK && board[x + 1][y] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(422)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(423)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(424);return false;
                }
            }}
        }}} }else {__CLR4_4_100kv4p59ij.R.inc(425);if ((((y == 0)&&(__CLR4_4_100kv4p59ij.R.iget(426)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(427)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(428);if ((((x == 0)&&(__CLR4_4_100kv4p59ij.R.iget(429)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(430)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(431);if ((((board[x + 1][y] == BLANK && board[x][y + 1] == BLANK && board[x + 1][y + 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(432)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(433)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(434);return false;
                }
            }} }else {__CLR4_4_100kv4p59ij.R.inc(435);if ((((x == BOARD_SIZE - 1)&&(__CLR4_4_100kv4p59ij.R.iget(436)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(437)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(438);if ((((board[x - 1][y] == BLANK && board[x][y + 1] == BLANK && board[x - 1][y + 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(439)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(440)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(441);return false;
                }
            }} }else {{
                __CLR4_4_100kv4p59ij.R.inc(442);if ((((board[x + 1][y] == BLANK && board[x - 1][y] == BLANK && board[x + 1][y + 1] == BLANK && board[x - 1][y + 1] == BLANK && board[x][y + 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(443)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(444)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(445);return false;
                }
            }}
        }}} }else {__CLR4_4_100kv4p59ij.R.inc(446);if ((((x == BOARD_SIZE - 1)&&(__CLR4_4_100kv4p59ij.R.iget(447)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(448)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(449);if ((((y == 0)&&(__CLR4_4_100kv4p59ij.R.iget(450)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(451)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(452);if ((((board[x - 1][y] == BLANK && board[x][y + 1] == BLANK && board[x - 1][y + 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(453)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(454)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(455);return false;
                }
            }} }else {__CLR4_4_100kv4p59ij.R.inc(456);if ((((y == BOARD_SIZE - 1)&&(__CLR4_4_100kv4p59ij.R.iget(457)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(458)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(459);if ((((board[x][y - 1] == BLANK && board[x - 1][y] == BLANK && board[x - 1][y - 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(460)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(461)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(462);return false;
                }
            }} }else {{
                __CLR4_4_100kv4p59ij.R.inc(463);if ((((board[x][y + 1] == BLANK && board[x][y - 1] == BLANK && board[x - 1][y + 1] == BLANK && board[x - 1][y - 1] == BLANK && board[x - 1][y] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(464)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(465)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(466);return false;
                }
            }}
        }}} }else {__CLR4_4_100kv4p59ij.R.inc(467);if ((((y == BOARD_SIZE - 1)&&(__CLR4_4_100kv4p59ij.R.iget(468)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(469)==0&false))) {{
            __CLR4_4_100kv4p59ij.R.inc(470);if ((((x == 0)&&(__CLR4_4_100kv4p59ij.R.iget(471)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(472)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(473);if ((((board[x][y - 1] == BLANK && board[x + 1][y] == BLANK && board[x + 1][y - 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(474)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(475)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(476);return false;
                }
            }} }else {__CLR4_4_100kv4p59ij.R.inc(477);if ((((x == BOARD_SIZE - 1)&&(__CLR4_4_100kv4p59ij.R.iget(478)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(479)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(480);if ((((board[x - 1][y] == BLANK && board[x][y - 1] == BLANK && board[x - 1][y - 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(481)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(482)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(483);return false;
                }
            }} }else {{
                __CLR4_4_100kv4p59ij.R.inc(484);if ((((board[x - 1][y] == BLANK && board[x + 1][y] == BLANK && board[x][y - 1] == BLANK && board[x - 1][y - 1] == BLANK && board[x + 1][y - 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(485)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(486)==0&false))) {{
                    __CLR4_4_100kv4p59ij.R.inc(487);return false;
                }
            }}
        }}} }else {{
            __CLR4_4_100kv4p59ij.R.inc(488);if ((((board[x - 1][y - 1] == BLANK && board[x - 1][y] == BLANK && board[x - 1][y + 1] == BLANK && board[x][y - 1] == BLANK && board[x][y + 1] == BLANK
                    && board[x + 1][y - 1] == BLANK && board[x + 1][y] == BLANK && board[x + 1][y + 1] == BLANK)&&(__CLR4_4_100kv4p59ij.R.iget(489)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(490)==0&false))) {{
                __CLR4_4_100kv4p59ij.R.inc(491);return false;
            }
        }}
        }}}}__CLR4_4_100kv4p59ij.R.inc(492);return true;
    }finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}


    public static void showScore() {try{__CLR4_4_100kv4p59ij.R.inc(493);
        __CLR4_4_100kv4p59ij.R.inc(494);for (int i = 0; (((i < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(495)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(496)==0&false)); i++) {{
            __CLR4_4_100kv4p59ij.R.inc(497);for (int j = 0; (((j < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(498)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(499)==0&false)); j++) {{
                __CLR4_4_100kv4p59ij.R.inc(500);for (int m = 0; (((m < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(501)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(502)==0&false)); m++) {{
                    __CLR4_4_100kv4p59ij.R.inc(503);for (int n = 0; (((n < BOARD_SIZE)&&(__CLR4_4_100kv4p59ij.R.iget(504)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(505)==0&false)); n++) {{
                        __CLR4_4_100kv4p59ij.R.inc(506);if ((((board[m][n] != 0)&&(__CLR4_4_100kv4p59ij.R.iget(507)!=0|true))||(__CLR4_4_100kv4p59ij.R.iget(508)==0&false))) {{
                            __CLR4_4_100kv4p59ij.R.inc(509);scoreMatrix[m][n] = board[m][n];
                        }
                    }}
                }}
            }}
        }}
    }}finally{__CLR4_4_100kv4p59ij.R.flushNeeded();}}
}