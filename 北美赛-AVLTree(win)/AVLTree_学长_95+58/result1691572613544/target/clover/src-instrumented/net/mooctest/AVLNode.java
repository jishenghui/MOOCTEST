/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * Created by Krietallo on 4/27/2017.
 */
public class AVLNode<T> {public static class __CLR4_4_100ll3inmmo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0030\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0041\u0056\u004c\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691572608303L,8589935092L,151,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int ALLOWED_IMBALANCE = 1; //Difference between left and right subtrees
    private T element; // The data in the node
    private AVLNode<T> left; // Left child
    private AVLNode<T> right; // Right child


    public AVLNode(T theElement) {
        this(theElement, null, null);__CLR4_4_100ll3inmmo.R.inc(1);try{__CLR4_4_100ll3inmmo.R.inc(0);
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public AVLNode(T theElement, AVLNode<T> lt, AVLNode<T> rt) {try{__CLR4_4_100ll3inmmo.R.inc(2);
        __CLR4_4_100ll3inmmo.R.inc(3);element = theElement;
        __CLR4_4_100ll3inmmo.R.inc(4);left = lt;
        __CLR4_4_100ll3inmmo.R.inc(5);right = rt;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private static AVLNode balance(AVLNode t) {try{__CLR4_4_100ll3inmmo.R.inc(6);
        __CLR4_4_100ll3inmmo.R.inc(7);if ((((t == null)&&(__CLR4_4_100ll3inmmo.R.iget(8)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(9)==0&false)))
            {__CLR4_4_100ll3inmmo.R.inc(10);return t;

        }__CLR4_4_100ll3inmmo.R.inc(11);if ((((t.getLeftHeight() - t.getRightHeight() > ALLOWED_IMBALANCE)&&(__CLR4_4_100ll3inmmo.R.iget(12)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(13)==0&false)))
            {__CLR4_4_100ll3inmmo.R.inc(14);if ((((((((t.left == null )&&(__CLR4_4_100ll3inmmo.R.iget(15)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(16)==0&false))? 0 : t.left.getLeftHeight()) >= ((((t.left == null )&&(__CLR4_4_100ll3inmmo.R.iget(17)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(18)==0&false))? 0 : t.left.getRightHeight()))&&(__CLR4_4_100ll3inmmo.R.iget(19)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(20)==0&false)))
                {__CLR4_4_100ll3inmmo.R.inc(21);t = rotateWithLeftChild(t);
            }else
                {__CLR4_4_100ll3inmmo.R.inc(22);t = doubleWithLeftChild(t);
        }}else {__CLR4_4_100ll3inmmo.R.inc(23);if ((((t.getRightHeight() - t.getLeftHeight() > ALLOWED_IMBALANCE)&&(__CLR4_4_100ll3inmmo.R.iget(24)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(25)==0&false)))
            {__CLR4_4_100ll3inmmo.R.inc(26);if ((((((((t.right == null )&&(__CLR4_4_100ll3inmmo.R.iget(27)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(28)==0&false))? 0 : t.right.getRightHeight()) >= ((((t.right == null )&&(__CLR4_4_100ll3inmmo.R.iget(29)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(30)==0&false))? 0 : t.right.getLeftHeight()))&&(__CLR4_4_100ll3inmmo.R.iget(31)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(32)==0&false)))
                {__CLR4_4_100ll3inmmo.R.inc(33);t = rotateWithRightChild(t);
            }else
                {__CLR4_4_100ll3inmmo.R.inc(34);t = doubleWithRightChild(t);

        }}}__CLR4_4_100ll3inmmo.R.inc(35);return t;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private static AVLNode rotateWithRightChild(AVLNode k1) {try{__CLR4_4_100ll3inmmo.R.inc(36);
        __CLR4_4_100ll3inmmo.R.inc(37);AVLNode k2 = k1.right;
        __CLR4_4_100ll3inmmo.R.inc(38);k1.right = k2.left;
        __CLR4_4_100ll3inmmo.R.inc(39);k2.left = k1;
        __CLR4_4_100ll3inmmo.R.inc(40);return k2;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private static AVLNode rotateWithLeftChild(AVLNode k2) {try{__CLR4_4_100ll3inmmo.R.inc(41);
        __CLR4_4_100ll3inmmo.R.inc(42);AVLNode k1 = k2.left;
        __CLR4_4_100ll3inmmo.R.inc(43);k2.left = k1.right;
        __CLR4_4_100ll3inmmo.R.inc(44);k1.right = k2;
        __CLR4_4_100ll3inmmo.R.inc(45);return k1;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private static AVLNode doubleWithRightChild(AVLNode k1) {try{__CLR4_4_100ll3inmmo.R.inc(46);
        __CLR4_4_100ll3inmmo.R.inc(47);k1.right = rotateWithLeftChild(k1.right);
        __CLR4_4_100ll3inmmo.R.inc(48);return rotateWithRightChild(k1);
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private static AVLNode doubleWithLeftChild(AVLNode k3) {try{__CLR4_4_100ll3inmmo.R.inc(49);
        __CLR4_4_100ll3inmmo.R.inc(50);k3.left = rotateWithRightChild(k3.left);
        __CLR4_4_100ll3inmmo.R.inc(51);return rotateWithLeftChild(k3);
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private int getLeftHeight() {try{__CLR4_4_100ll3inmmo.R.inc(52);
        __CLR4_4_100ll3inmmo.R.inc(53);return (((this.left == null )&&(__CLR4_4_100ll3inmmo.R.iget(54)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(55)==0&false))? 0 : this.left.getHeight();
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private int getRightHeight() {try{__CLR4_4_100ll3inmmo.R.inc(56);
        __CLR4_4_100ll3inmmo.R.inc(57);return (((this.right == null )&&(__CLR4_4_100ll3inmmo.R.iget(58)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(59)==0&false))? 0 : this.right.getHeight();
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    private static AVLNode remove(Object x, AVLNode source) {try{__CLR4_4_100ll3inmmo.R.inc(60);
        __CLR4_4_100ll3inmmo.R.inc(61);int compareResult = x.toString().compareTo(source.element.toString());

        __CLR4_4_100ll3inmmo.R.inc(62);if ((((compareResult < 0)&&(__CLR4_4_100ll3inmmo.R.iget(63)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(64)==0&false))) {{
            __CLR4_4_100ll3inmmo.R.inc(65);if ((((source.left == null)&&(__CLR4_4_100ll3inmmo.R.iget(66)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(67)==0&false)))
                {__CLR4_4_100ll3inmmo.R.inc(68);return null;
            }__CLR4_4_100ll3inmmo.R.inc(69);source.left = remove(x, source.left);
        } }else {__CLR4_4_100ll3inmmo.R.inc(70);if ((((compareResult > 0)&&(__CLR4_4_100ll3inmmo.R.iget(71)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(72)==0&false))) {{
            __CLR4_4_100ll3inmmo.R.inc(73);if ((((source.right == null)&&(__CLR4_4_100ll3inmmo.R.iget(74)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(75)==0&false)))
                {__CLR4_4_100ll3inmmo.R.inc(76);return null;
            }__CLR4_4_100ll3inmmo.R.inc(77);source.right = remove(x, source.right);
        } }else {__CLR4_4_100ll3inmmo.R.inc(78);if ((((source.left != null && source.right != null)&&(__CLR4_4_100ll3inmmo.R.iget(79)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(80)==0&false))) {{
            // Two children
            __CLR4_4_100ll3inmmo.R.inc(81);source.element = source.findMin(source.right).element;
            __CLR4_4_100ll3inmmo.R.inc(82);source.right = remove(source.element, source.right);
        } }else
            {__CLR4_4_100ll3inmmo.R.inc(83);source = (((source.left != null )&&(__CLR4_4_100ll3inmmo.R.iget(84)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(85)==0&false))? source.left : source.right;
        }}}__CLR4_4_100ll3inmmo.R.inc(86);return balance(source);
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public T getElement() {try{__CLR4_4_100ll3inmmo.R.inc(87);
        __CLR4_4_100ll3inmmo.R.inc(88);return element;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public AVLNode<T> getLeft() {try{__CLR4_4_100ll3inmmo.R.inc(89);
        __CLR4_4_100ll3inmmo.R.inc(90);return left;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public AVLNode<T> getRight() {try{__CLR4_4_100ll3inmmo.R.inc(91);
        __CLR4_4_100ll3inmmo.R.inc(92);return right;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public int getHeight() {try{__CLR4_4_100ll3inmmo.R.inc(93);
        __CLR4_4_100ll3inmmo.R.inc(94);return 1 + Math.max((((this.left == null )&&(__CLR4_4_100ll3inmmo.R.iget(95)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(96)==0&false))? 0 : this.left.getHeight(), (((this.right == null )&&(__CLR4_4_100ll3inmmo.R.iget(97)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(98)==0&false))? 0 : this.right.getHeight());
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public AVLNode<T> insert(T x) throws Exception {try{__CLR4_4_100ll3inmmo.R.inc(99);
        __CLR4_4_100ll3inmmo.R.inc(100);int compareResult = x.toString().compareTo(this.element.toString());
        __CLR4_4_100ll3inmmo.R.inc(101);if ((((compareResult < 0)&&(__CLR4_4_100ll3inmmo.R.iget(102)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(103)==0&false))) {{
            __CLR4_4_100ll3inmmo.R.inc(104);if ((((this.left != null)&&(__CLR4_4_100ll3inmmo.R.iget(105)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(106)==0&false))) {{
                __CLR4_4_100ll3inmmo.R.inc(107);this.left = this.left.insert(x);
            } }else {{
                __CLR4_4_100ll3inmmo.R.inc(108);this.left = new AVLNode<T>(x);
            }
        }} }else {__CLR4_4_100ll3inmmo.R.inc(109);if ((((compareResult > 0)&&(__CLR4_4_100ll3inmmo.R.iget(110)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(111)==0&false))) {{
            __CLR4_4_100ll3inmmo.R.inc(112);if ((((this.right != null)&&(__CLR4_4_100ll3inmmo.R.iget(113)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(114)==0&false))) {{
                __CLR4_4_100ll3inmmo.R.inc(115);this.right = this.right.insert(x);
            } }else {{
                __CLR4_4_100ll3inmmo.R.inc(116);this.right = new AVLNode<T>(x);
            }
        }} }else {{
            __CLR4_4_100ll3inmmo.R.inc(117);throw new Exception("Duplicate");
        }
        }}__CLR4_4_100ll3inmmo.R.inc(118);return balance(this);
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public AVLNode<T> findMin(AVLNode<T> t) {try{__CLR4_4_100ll3inmmo.R.inc(119);
        __CLR4_4_100ll3inmmo.R.inc(120);while ((((t.left != null)&&(__CLR4_4_100ll3inmmo.R.iget(121)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(122)==0&false)))
            {__CLR4_4_100ll3inmmo.R.inc(123);t = t.left;

        }__CLR4_4_100ll3inmmo.R.inc(124);return t;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public boolean search(T x) {try{__CLR4_4_100ll3inmmo.R.inc(125);
        __CLR4_4_100ll3inmmo.R.inc(126);int compareResult = x.toString().compareTo(this.getElement().toString());
        __CLR4_4_100ll3inmmo.R.inc(127);boolean found = true;
        __CLR4_4_100ll3inmmo.R.inc(128);if ((((compareResult < 0)&&(__CLR4_4_100ll3inmmo.R.iget(129)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(130)==0&false))) {{
            __CLR4_4_100ll3inmmo.R.inc(131);if ((((this.left == null)&&(__CLR4_4_100ll3inmmo.R.iget(132)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(133)==0&false)))
                {__CLR4_4_100ll3inmmo.R.inc(134);return false;
            }__CLR4_4_100ll3inmmo.R.inc(135);found = this.left.search(x);
        } }else {__CLR4_4_100ll3inmmo.R.inc(136);if ((((compareResult > 0)&&(__CLR4_4_100ll3inmmo.R.iget(137)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(138)==0&false))) {{
            __CLR4_4_100ll3inmmo.R.inc(139);if ((((this.right == null)&&(__CLR4_4_100ll3inmmo.R.iget(140)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(141)==0&false)))
                {__CLR4_4_100ll3inmmo.R.inc(142);return false;
            }__CLR4_4_100ll3inmmo.R.inc(143);found = this.right.search(x);
        }
        }}__CLR4_4_100ll3inmmo.R.inc(144);return found;

    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}

    public AVLNode<T> delete(T x) {try{__CLR4_4_100ll3inmmo.R.inc(145);
        __CLR4_4_100ll3inmmo.R.inc(146);if ((((search(x))&&(__CLR4_4_100ll3inmmo.R.iget(147)!=0|true))||(__CLR4_4_100ll3inmmo.R.iget(148)==0&false)))
            {__CLR4_4_100ll3inmmo.R.inc(149);return remove(x, this);

        }__CLR4_4_100ll3inmmo.R.inc(150);return null;
    }finally{__CLR4_4_100ll3inmmo.R.flushNeeded();}}
}