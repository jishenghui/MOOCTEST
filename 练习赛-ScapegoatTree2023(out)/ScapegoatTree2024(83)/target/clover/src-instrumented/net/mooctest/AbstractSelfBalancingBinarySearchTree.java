/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * Abstract class for self balancing binary search trees. Contains some methods
 * that is used for self balancing trees.
 * 
 * @author Ignas Lelys
 * @created Jul 24, 2011
 * 
 */
public abstract class AbstractSelfBalancingBinarySearchTree extends AbstractBinarySearchTree {public static class __CLR4_4_16p6pl9i5d08p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0073\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u004a\u0061\u0076\u0061\u005f\u0070\u0072\u0061\u0063\u0074\u0069\u0063\u0065\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666335882853L,8589935092L,281,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Rotate to the left.
     * 
     * @param node Node on which to rotate.
     * @return Node that is in place of provided node after rotation.
     */
    protected Node rotateLeft(Node node) {try{__CLR4_4_16p6pl9i5d08p.R.inc(241);
        __CLR4_4_16p6pl9i5d08p.R.inc(242);Node temp = node.right;
        __CLR4_4_16p6pl9i5d08p.R.inc(243);temp.parent = node.parent;

        __CLR4_4_16p6pl9i5d08p.R.inc(244);node.right = temp.left;
        __CLR4_4_16p6pl9i5d08p.R.inc(245);if ((((node.right != null)&&(__CLR4_4_16p6pl9i5d08p.R.iget(246)!=0|true))||(__CLR4_4_16p6pl9i5d08p.R.iget(247)==0&false))) {{
            __CLR4_4_16p6pl9i5d08p.R.inc(248);node.right.parent = node;
        }

        }__CLR4_4_16p6pl9i5d08p.R.inc(249);temp.left = node;
        __CLR4_4_16p6pl9i5d08p.R.inc(250);node.parent = temp;

        // temp took over node's place so now its parent should point to temp
        __CLR4_4_16p6pl9i5d08p.R.inc(251);if ((((temp.parent != null)&&(__CLR4_4_16p6pl9i5d08p.R.iget(252)!=0|true))||(__CLR4_4_16p6pl9i5d08p.R.iget(253)==0&false))) {{
            __CLR4_4_16p6pl9i5d08p.R.inc(254);if ((((node == temp.parent.left)&&(__CLR4_4_16p6pl9i5d08p.R.iget(255)!=0|true))||(__CLR4_4_16p6pl9i5d08p.R.iget(256)==0&false))) {{
                __CLR4_4_16p6pl9i5d08p.R.inc(257);temp.parent.left = temp;
            } }else {{
                __CLR4_4_16p6pl9i5d08p.R.inc(258);temp.parent.right = temp;
            }
        }} }else {{
            __CLR4_4_16p6pl9i5d08p.R.inc(259);root = temp;
        }
        
        }__CLR4_4_16p6pl9i5d08p.R.inc(260);return temp;
    }finally{__CLR4_4_16p6pl9i5d08p.R.flushNeeded();}}

    /**
     * Rotate to the right.
     * 
     * @param node Node on which to rotate.
     * @return Node that is in place of provided node after rotation.
     */
    protected Node rotateRight(Node node) {try{__CLR4_4_16p6pl9i5d08p.R.inc(261);
        __CLR4_4_16p6pl9i5d08p.R.inc(262);Node temp = node.left;
        __CLR4_4_16p6pl9i5d08p.R.inc(263);temp.parent = node.parent;

        __CLR4_4_16p6pl9i5d08p.R.inc(264);node.left = temp.right;
        __CLR4_4_16p6pl9i5d08p.R.inc(265);if ((((node.left != null)&&(__CLR4_4_16p6pl9i5d08p.R.iget(266)!=0|true))||(__CLR4_4_16p6pl9i5d08p.R.iget(267)==0&false))) {{
            __CLR4_4_16p6pl9i5d08p.R.inc(268);node.left.parent = node;
        }

        }__CLR4_4_16p6pl9i5d08p.R.inc(269);temp.right = node;
        __CLR4_4_16p6pl9i5d08p.R.inc(270);node.parent = temp;

        // temp took over node's place so now its parent should point to temp
        __CLR4_4_16p6pl9i5d08p.R.inc(271);if ((((temp.parent != null)&&(__CLR4_4_16p6pl9i5d08p.R.iget(272)!=0|true))||(__CLR4_4_16p6pl9i5d08p.R.iget(273)==0&false))) {{
            __CLR4_4_16p6pl9i5d08p.R.inc(274);if ((((node == temp.parent.left)&&(__CLR4_4_16p6pl9i5d08p.R.iget(275)!=0|true))||(__CLR4_4_16p6pl9i5d08p.R.iget(276)==0&false))) {{
                __CLR4_4_16p6pl9i5d08p.R.inc(277);temp.parent.left = temp;
            } }else {{
                __CLR4_4_16p6pl9i5d08p.R.inc(278);temp.parent.right = temp;
            }
        }} }else {{
            __CLR4_4_16p6pl9i5d08p.R.inc(279);root = temp;
        }
        
        }__CLR4_4_16p6pl9i5d08p.R.inc(280);return temp;
    }finally{__CLR4_4_16p6pl9i5d08p.R.flushNeeded();}}

}
