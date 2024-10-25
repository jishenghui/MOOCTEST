/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * 
 * @author juraj67
 * @param <T>
 */
public class Heap_Item <T extends Comparable<T>> {public static class __CLR4_4_100l9ktl98r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0030\u0032\u0031\u005c\u005c\u0031\u0031\u0033\u0037\u0033\u0032\u005c\u005c\u0050\u0061\u0069\u0072\u0069\u006e\u0067\u0048\u0065\u0061\u0070\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666497510699L,8589935092L,86,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private Heap_Item ancestor;
    private Heap_Item leftSon;
    private Heap_Item rightSon;
    private T data;
    
    /**
     * Constructor creates an empty Heap_Item
     */
    public Heap_Item() {try{__CLR4_4_100l9ktl98r.R.inc(0);
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Constructor creates a new Heap_Item
     * @param data 
     */
    public Heap_Item(T data) {try{__CLR4_4_100l9ktl98r.R.inc(1);
        __CLR4_4_100l9ktl98r.R.inc(2);this.data = data;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Copy constructor makes a copy of Heap_Item
     * @param paCopy_HeapItem 
     */
    public Heap_Item(Heap_Item<T> paCopy_HeapItem) {try{__CLR4_4_100l9ktl98r.R.inc(3);
        __CLR4_4_100l9ktl98r.R.inc(4);this.leftSon = paCopy_HeapItem.getLeftSon();
        __CLR4_4_100l9ktl98r.R.inc(5);this.rightSon = paCopy_HeapItem.getRightSon();
        __CLR4_4_100l9ktl98r.R.inc(6);this.data = paCopy_HeapItem.getData();
        __CLR4_4_100l9ktl98r.R.inc(7);this.ancestor = paCopy_HeapItem.getAncestor();
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}

    /**
     * Method returns the ancestor in binary form
     */
    public Heap_Item<T> getAncestor() {try{__CLR4_4_100l9ktl98r.R.inc(8);
        __CLR4_4_100l9ktl98r.R.inc(9);return ancestor;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method sets the ancestor of the heap (in binary form)
     * @param ancestor 
     */
    public void setAncestor(Heap_Item ancestor) {try{__CLR4_4_100l9ktl98r.R.inc(10);
        __CLR4_4_100l9ktl98r.R.inc(11);this.ancestor = ancestor;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns the ancestor of the multi-way pairing heap
     * @return 
     */
    public Heap_Item<T> getMultiWayAncestor() {try{__CLR4_4_100l9ktl98r.R.inc(12);
        __CLR4_4_100l9ktl98r.R.inc(13);if((((this.ancestor != null)&&(__CLR4_4_100l9ktl98r.R.iget(14)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(15)==0&false))) {{
            __CLR4_4_100l9ktl98r.R.inc(16);if((((this.ancestor.itIsLeftSon(this))&&(__CLR4_4_100l9ktl98r.R.iget(17)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(18)==0&false))) {{
                __CLR4_4_100l9ktl98r.R.inc(19);return this.ancestor;
            } }else {{
                __CLR4_4_100l9ktl98r.R.inc(20);Heap_Item<T> node = this.ancestor;
                __CLR4_4_100l9ktl98r.R.inc(21);while((((!node.getAncestor().itIsLeftSon(node))&&(__CLR4_4_100l9ktl98r.R.iget(22)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(23)==0&false))) {{
                    __CLR4_4_100l9ktl98r.R.inc(24);node = node.getAncestor();
                }
                }__CLR4_4_100l9ktl98r.R.inc(25);return node.getAncestor();
            }
        }}
        }__CLR4_4_100l9ktl98r.R.inc(26);return null;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns the left son of heap
     * @return 
     */
    public Heap_Item<T> getLeftSon() {try{__CLR4_4_100l9ktl98r.R.inc(27);
        __CLR4_4_100l9ktl98r.R.inc(28);return this.leftSon;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns the right son of heap
     * @return 
     */
    public Heap_Item<T> getRightSon() {try{__CLR4_4_100l9ktl98r.R.inc(29);
        __CLR4_4_100l9ktl98r.R.inc(30);return this.rightSon;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns heap data
     * @return 
     */
    public T getData() {try{__CLR4_4_100l9ktl98r.R.inc(31);
        __CLR4_4_100l9ktl98r.R.inc(32);return ((((this.data == null )&&(__CLR4_4_100l9ktl98r.R.iget(33)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(34)==0&false))? null : this.data);
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method sets the heap data
     * @param data 
     */
    public void setData(T data) {try{__CLR4_4_100l9ktl98r.R.inc(35);
        __CLR4_4_100l9ktl98r.R.inc(36);this.data = data;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Set left son of the heap 
     * @param leftSon 
     */
    public void setLeftSon(Heap_Item leftSon) {try{__CLR4_4_100l9ktl98r.R.inc(37);
        __CLR4_4_100l9ktl98r.R.inc(38);this.leftSon = leftSon;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Set right son of the heap 
     * @param rightSon 
     */
    public void setRightSon(Heap_Item rightSon) {try{__CLR4_4_100l9ktl98r.R.inc(39);
        __CLR4_4_100l9ktl98r.R.inc(40);this.rightSon = rightSon;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns true if the heap has a left son
     * @return 
     */
    public boolean hasLeftSon() {try{__CLR4_4_100l9ktl98r.R.inc(41);
        __CLR4_4_100l9ktl98r.R.inc(42);return (this.leftSon != null);
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns true if the heap has a right son
     * @return 
     */
    public boolean hasRightSon() {try{__CLR4_4_100l9ktl98r.R.inc(43);
        __CLR4_4_100l9ktl98r.R.inc(44);return (this.rightSon != null);
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method removes the left son from the heap
     */
    public void removeLeftSon() {try{__CLR4_4_100l9ktl98r.R.inc(45);
        __CLR4_4_100l9ktl98r.R.inc(46);this.leftSon = null;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method removes the right son from the heap
     */
    public void removeRightSon() {try{__CLR4_4_100l9ktl98r.R.inc(47);
        __CLR4_4_100l9ktl98r.R.inc(48);this.rightSon = null;
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns an item that matches the criteria
     * @param paCriterion
     * @return 
     */
    public Heap_Item<T> getSonByData(T paCriterion) {try{__CLR4_4_100l9ktl98r.R.inc(49);
        __CLR4_4_100l9ktl98r.R.inc(50);if((((this.hasLeftSon() && this.leftSon.getData().compareTo(paCriterion) == 0)&&(__CLR4_4_100l9ktl98r.R.iget(51)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(52)==0&false))) {{
            __CLR4_4_100l9ktl98r.R.inc(53);return this.leftSon;
        } }else {__CLR4_4_100l9ktl98r.R.inc(54);if((((this.hasRightSon() && this.rightSon.getData().compareTo(paCriterion) == 0)&&(__CLR4_4_100l9ktl98r.R.iget(55)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(56)==0&false))) {{
            __CLR4_4_100l9ktl98r.R.inc(57);return this.rightSon;
        } }else {{
            __CLR4_4_100l9ktl98r.R.inc(58);return null;
        }
    }}}finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method removes an item that matches the criteria
     * @param paCriterion 
     */
    public void removeChild(T paCriterion) {try{__CLR4_4_100l9ktl98r.R.inc(59);
        __CLR4_4_100l9ktl98r.R.inc(60);if((((this.hasLeftSon() && this.leftSon.getData().compareTo(paCriterion) == 0)&&(__CLR4_4_100l9ktl98r.R.iget(61)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(62)==0&false))) {{
            __CLR4_4_100l9ktl98r.R.inc(63);this.leftSon = null;
            __CLR4_4_100l9ktl98r.R.inc(64);return;
        } 
        }__CLR4_4_100l9ktl98r.R.inc(65);if((((this.hasRightSon() && this.rightSon.getData().compareTo(paCriterion) == 0)&&(__CLR4_4_100l9ktl98r.R.iget(66)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(67)==0&false))) {{
            __CLR4_4_100l9ktl98r.R.inc(68);this.rightSon = null;
            __CLR4_4_100l9ktl98r.R.inc(69);return;
        }
    }}finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method returns true, if the parameter matches the left son of the heap
     * @param paNode
     * @return 
     */
    public boolean itIsLeftSon(Heap_Item<T> paNode) {try{__CLR4_4_100l9ktl98r.R.inc(70);
        __CLR4_4_100l9ktl98r.R.inc(71);return ((((this.leftSon == paNode )&&(__CLR4_4_100l9ktl98r.R.iget(72)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(73)==0&false))? true : false);
    }finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
    
    /**
     * Method replaces a son who meets the criteria
     * @param paCriterion
     * @param paNode
     * @return 
     */
    public boolean replaceChild(T paCriterion, Heap_Item<T> paNode) {try{__CLR4_4_100l9ktl98r.R.inc(74);
        __CLR4_4_100l9ktl98r.R.inc(75);if((((this.hasLeftSon() && this.leftSon.getData().compareTo(paCriterion) == 0)&&(__CLR4_4_100l9ktl98r.R.iget(76)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(77)==0&false))) {{
            __CLR4_4_100l9ktl98r.R.inc(78);this.leftSon = paNode;
            __CLR4_4_100l9ktl98r.R.inc(79);return true;
        } }else {__CLR4_4_100l9ktl98r.R.inc(80);if((((this.hasRightSon()&& this.rightSon.getData().compareTo(paCriterion) == 0)&&(__CLR4_4_100l9ktl98r.R.iget(81)!=0|true))||(__CLR4_4_100l9ktl98r.R.iget(82)==0&false))){{
            __CLR4_4_100l9ktl98r.R.inc(83);this.rightSon = paNode;
            __CLR4_4_100l9ktl98r.R.inc(84);return true;
        } }else {{ 
            __CLR4_4_100l9ktl98r.R.inc(85);return false;
        }
    }}}finally{__CLR4_4_100l9ktl98r.R.flushNeeded();}}
}
