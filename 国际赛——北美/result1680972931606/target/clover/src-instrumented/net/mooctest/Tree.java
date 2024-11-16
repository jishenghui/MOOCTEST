/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by louay on 4/28/2017.
 */
public class Tree {public static class __CLR4_4_14747lg87voj8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0031\u0039\u0034\u005c\u005c\u0031\u0031\u0037\u0038\u0033\u0030\u005c\u005c\u0041\u0056\u004c\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1680972927825L,8589935092L,235,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private AVLNode<String> root = null;
    private int size;

    public Tree(){try{__CLR4_4_14747lg87voj8.R.inc(151);
        __CLR4_4_14747lg87voj8.R.inc(152);size = 0;
    }finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_14747lg87voj8.R.inc(153);
        __CLR4_4_14747lg87voj8.R.inc(154);return TreePrinter.printNode(root);
    }finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public boolean insertWord(String word){try{__CLR4_4_14747lg87voj8.R.inc(155);
        __CLR4_4_14747lg87voj8.R.inc(156);if ((((root == null)&&(__CLR4_4_14747lg87voj8.R.iget(157)!=0|true))||(__CLR4_4_14747lg87voj8.R.iget(158)==0&false))){{
            __CLR4_4_14747lg87voj8.R.inc(159);root = new AVLNode<String>(word);
            __CLR4_4_14747lg87voj8.R.inc(160);size++;
            __CLR4_4_14747lg87voj8.R.inc(161);return true;
        } }else {{
            __CLR4_4_14747lg87voj8.R.inc(162);try {
                __CLR4_4_14747lg87voj8.R.inc(163);root = root.insert(word);
                __CLR4_4_14747lg87voj8.R.inc(164);size++;
                __CLR4_4_14747lg87voj8.R.inc(165);return true;
            } catch (Exception e) {
                __CLR4_4_14747lg87voj8.R.inc(166);return false;
            }
        }
    }}finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public boolean[] insertWords(File file){try{__CLR4_4_14747lg87voj8.R.inc(167);
        __CLR4_4_14747lg87voj8.R.inc(168);try {
            __CLR4_4_14747lg87voj8.R.inc(169);List<String> lines = Files.readAllLines(Paths.get(file.getPath()));
            __CLR4_4_14747lg87voj8.R.inc(170);boolean[] inserted = new boolean[lines.size()];
            __CLR4_4_14747lg87voj8.R.inc(171);int i = 0;
            __CLR4_4_14747lg87voj8.R.inc(172);for (String line : lines) {{
                __CLR4_4_14747lg87voj8.R.inc(173);inserted[i] = this.insertWord(line);
                __CLR4_4_14747lg87voj8.R.inc(174);i++;
            }
            }__CLR4_4_14747lg87voj8.R.inc(175);return inserted;
        } catch (IOException e) {
            __CLR4_4_14747lg87voj8.R.inc(176);e.printStackTrace();
            __CLR4_4_14747lg87voj8.R.inc(177);return null;
        }
    }finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public boolean deleteWord(String word) throws Exception {try{__CLR4_4_14747lg87voj8.R.inc(178);
        __CLR4_4_14747lg87voj8.R.inc(179);if ((((root != null)&&(__CLR4_4_14747lg87voj8.R.iget(180)!=0|true))||(__CLR4_4_14747lg87voj8.R.iget(181)==0&false))) {{
            __CLR4_4_14747lg87voj8.R.inc(182);if ((((root.getElement().equals(word) && size == 1)&&(__CLR4_4_14747lg87voj8.R.iget(183)!=0|true))||(__CLR4_4_14747lg87voj8.R.iget(184)==0&false))) {{
                __CLR4_4_14747lg87voj8.R.inc(185);size--;
                __CLR4_4_14747lg87voj8.R.inc(186);root = null;
                __CLR4_4_14747lg87voj8.R.inc(187);return true;
            }
            }__CLR4_4_14747lg87voj8.R.inc(188);AVLNode<String> deletedNode = root.delete(word);
            __CLR4_4_14747lg87voj8.R.inc(189);if ((((deletedNode == null)&&(__CLR4_4_14747lg87voj8.R.iget(190)!=0|true))||(__CLR4_4_14747lg87voj8.R.iget(191)==0&false))) {{
                __CLR4_4_14747lg87voj8.R.inc(192);return false;
            }
            }__CLR4_4_14747lg87voj8.R.inc(193);root = deletedNode;
            __CLR4_4_14747lg87voj8.R.inc(194);size--;
            __CLR4_4_14747lg87voj8.R.inc(195);if ((((size == 0)&&(__CLR4_4_14747lg87voj8.R.iget(196)!=0|true))||(__CLR4_4_14747lg87voj8.R.iget(197)==0&false))) {{
                __CLR4_4_14747lg87voj8.R.inc(198);this.root = null;
            }
            }__CLR4_4_14747lg87voj8.R.inc(199);return true;
        } }else {{
            __CLR4_4_14747lg87voj8.R.inc(200);throw new Exception("Tree is empty");
        }
    }}finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public boolean[] deleteWords(File file) throws Exception {try{__CLR4_4_14747lg87voj8.R.inc(201);
        __CLR4_4_14747lg87voj8.R.inc(202);try {
            __CLR4_4_14747lg87voj8.R.inc(203);List<String> lines = Files.readAllLines(Paths.get(file.getPath()));
            __CLR4_4_14747lg87voj8.R.inc(204);boolean[] deleted = new boolean[lines.size()];
            __CLR4_4_14747lg87voj8.R.inc(205);int i = 0;
            __CLR4_4_14747lg87voj8.R.inc(206);for (String line : lines) {{
                __CLR4_4_14747lg87voj8.R.inc(207);deleted[i] = this.deleteWord(line);
                __CLR4_4_14747lg87voj8.R.inc(208);i++;
            }
            }__CLR4_4_14747lg87voj8.R.inc(209);return deleted;
        } catch (IOException e) {
            __CLR4_4_14747lg87voj8.R.inc(210);e.printStackTrace();
            __CLR4_4_14747lg87voj8.R.inc(211);return null;
        }
    }finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public boolean searchWord(String word) throws Exception {try{__CLR4_4_14747lg87voj8.R.inc(212);
        __CLR4_4_14747lg87voj8.R.inc(213);if ((((root == null)&&(__CLR4_4_14747lg87voj8.R.iget(214)!=0|true))||(__CLR4_4_14747lg87voj8.R.iget(215)==0&false))){{
            __CLR4_4_14747lg87voj8.R.inc(216);throw new Exception("Tree is empty");
        } }else {{
            __CLR4_4_14747lg87voj8.R.inc(217);return root.search(word);
        }
    }}finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public boolean[] searchWords(File file) throws Exception {try{__CLR4_4_14747lg87voj8.R.inc(218);
        __CLR4_4_14747lg87voj8.R.inc(219);try {
            __CLR4_4_14747lg87voj8.R.inc(220);List<String> lines = Files.readAllLines(Paths.get(file.getPath()));
            __CLR4_4_14747lg87voj8.R.inc(221);boolean[] found = new boolean[lines.size()];
            __CLR4_4_14747lg87voj8.R.inc(222);int i = 0;
            __CLR4_4_14747lg87voj8.R.inc(223);for (String line : lines) {{
                __CLR4_4_14747lg87voj8.R.inc(224);found[i] = this.searchWord(line);
                __CLR4_4_14747lg87voj8.R.inc(225);i++;
            }
            }__CLR4_4_14747lg87voj8.R.inc(226);return found;

        } catch (IOException e) {
            __CLR4_4_14747lg87voj8.R.inc(227);e.printStackTrace();
        }
        __CLR4_4_14747lg87voj8.R.inc(228);return null;
    }finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public int getSize() {try{__CLR4_4_14747lg87voj8.R.inc(229);
        __CLR4_4_14747lg87voj8.R.inc(230);return size;
    }finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_4_14747lg87voj8.R.inc(231);
        __CLR4_4_14747lg87voj8.R.inc(232);return (((this.root == null)&&(__CLR4_4_14747lg87voj8.R.iget(233)!=0|true))||(__CLR4_4_14747lg87voj8.R.iget(234)==0&false))? 0 : this.root.getHeight();
    }finally{__CLR4_4_14747lg87voj8.R.flushNeeded();}}
}