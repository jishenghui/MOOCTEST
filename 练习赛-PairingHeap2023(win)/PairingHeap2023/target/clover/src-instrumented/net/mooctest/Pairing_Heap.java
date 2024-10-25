/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author juraj67
 * @param <T>
 */
public class Pairing_Heap <T extends Comparable<T>>  {public static class __CLR4_4_12e2elnvslpxr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0039\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0050\u0061\u0069\u0072\u0069\u006e\u0067\u0048\u0065\u0061\u0070\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697635933302L,8589935092L,231,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private Heap_Item<T> root;
    
    /**
     * Constructor creates an empty Pairing_Heap
     */
    public Pairing_Heap() {try{__CLR4_4_12e2elnvslpxr.R.inc(86);
    }finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Constructor creates new Pairing_Heap with root
     * @param root 
     */
    public Pairing_Heap(Heap_Item<T> root) {try{__CLR4_4_12e2elnvslpxr.R.inc(87);
        __CLR4_4_12e2elnvslpxr.R.inc(88);this.root = root;
    }finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Copy constructor makes a copy of Pairing_Heap
     * @param heap_toCopy 
     */
    public Pairing_Heap(Pairing_Heap<T> heap_toCopy) {try{__CLR4_4_12e2elnvslpxr.R.inc(89);
        __CLR4_4_12e2elnvslpxr.R.inc(90);this.root = heap_toCopy.getRoot();
    }finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
        
    /**
     * Method returns the root of the pairing heap
     * @return 
     */
    public Heap_Item<T> getRoot() {try{__CLR4_4_12e2elnvslpxr.R.inc(91);
        __CLR4_4_12e2elnvslpxr.R.inc(92);return this.root;
    }finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Method returns the root data
     * @return 
     */
    public T peek() {try{__CLR4_4_12e2elnvslpxr.R.inc(93);
        __CLR4_4_12e2elnvslpxr.R.inc(94);return this.root.getData();
    }finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Method inserts a new heap item into the pairing heap
     * @param to_insert
     * @return 
     */
    public Heap_Item<T> push(Heap_Item<T> to_insert) {try{__CLR4_4_12e2elnvslpxr.R.inc(95);
        __CLR4_4_12e2elnvslpxr.R.inc(96);if((((this.root == null)&&(__CLR4_4_12e2elnvslpxr.R.iget(97)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(98)==0&false))) {{
            __CLR4_4_12e2elnvslpxr.R.inc(99);this.root = to_insert;
            __CLR4_4_12e2elnvslpxr.R.inc(100);return this.root;
        } }else {{
            __CLR4_4_12e2elnvslpxr.R.inc(101);this.root = pair(this, new Pairing_Heap(to_insert)).getRoot();
            __CLR4_4_12e2elnvslpxr.R.inc(102);return to_insert;
        }
    }}finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Method removes the root of the pairing heap and also returns heap data
     * @return 
     */
    public T pop() {try{__CLR4_4_12e2elnvslpxr.R.inc(103);
        __CLR4_4_12e2elnvslpxr.R.inc(104);return ((((this.root == null) )&&(__CLR4_4_12e2elnvslpxr.R.iget(105)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(106)==0&false))? null : this.pop_heap_item().getData();
    }finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Method removes the root of the pairing heap, finds the new root and returns the heap item
     * @return 
     */
    private Heap_Item<T> pop_heap_item() {try{__CLR4_4_12e2elnvslpxr.R.inc(107);
        __CLR4_4_12e2elnvslpxr.R.inc(108);if((((this.root == null)&&(__CLR4_4_12e2elnvslpxr.R.iget(109)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(110)==0&false))) {{                                  //if the heap is empty
            __CLR4_4_12e2elnvslpxr.R.inc(111);return null;
        } }else {{
            __CLR4_4_12e2elnvslpxr.R.inc(112);Heap_Item<T> old_root = this.root;
            __CLR4_4_12e2elnvslpxr.R.inc(113);this.root = null;
            __CLR4_4_12e2elnvslpxr.R.inc(114);if((((!old_root.hasLeftSon())&&(__CLR4_4_12e2elnvslpxr.R.iget(115)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(116)==0&false))) {{                    //if the heap contains only the root
                __CLR4_4_12e2elnvslpxr.R.inc(117);return old_root;
            } }else {{                                        //if the heap contains more items
                __CLR4_4_12e2elnvslpxr.R.inc(118);if((((!old_root.getLeftSon().hasRightSon())&&(__CLR4_4_12e2elnvslpxr.R.iget(119)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(120)==0&false))) {{  //if the heap consists of one heap 
                    __CLR4_4_12e2elnvslpxr.R.inc(121);old_root.getLeftSon().setAncestor(null);
                    __CLR4_4_12e2elnvslpxr.R.inc(122);this.root = old_root.getLeftSon();
                    __CLR4_4_12e2elnvslpxr.R.inc(123);return old_root;
                } }else {{                                    //if the heap consists of multiple heaps
                    __CLR4_4_12e2elnvslpxr.R.inc(124);Heap_Item<T> help_item = old_root.getLeftSon();
                    __CLR4_4_12e2elnvslpxr.R.inc(125);help_item.setAncestor(null);
                    __CLR4_4_12e2elnvslpxr.R.inc(126);this.root = multi_heaps_merge(help_item).getRoot(); //returns the heap and sets root
                    __CLR4_4_12e2elnvslpxr.R.inc(127);return old_root;
                }
            }}
        }}
    }}finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Multi-pass pairing heap
     * Method pairs all heaps that remain after the root has been removed
     * @param paLeftSonOfRoot
     * @return 
     */
    private Pairing_Heap<T> multi_heaps_merge(Heap_Item paLeftSonOfRoot) {try{__CLR4_4_12e2elnvslpxr.R.inc(128);
        __CLR4_4_12e2elnvslpxr.R.inc(129);Queue<Pairing_Heap<T>> fifo = new LinkedList<>();
        
        //fills the queue with all heaps
        __CLR4_4_12e2elnvslpxr.R.inc(130);Heap_Item<T> help_item = null;
        __CLR4_4_12e2elnvslpxr.R.inc(131);do {{  
            __CLR4_4_12e2elnvslpxr.R.inc(132);help_item = paLeftSonOfRoot.getRightSon();
            __CLR4_4_12e2elnvslpxr.R.inc(133);paLeftSonOfRoot.removeRightSon();
            __CLR4_4_12e2elnvslpxr.R.inc(134);paLeftSonOfRoot.setAncestor(null);
            __CLR4_4_12e2elnvslpxr.R.inc(135);if((((paLeftSonOfRoot.hasLeftSon())&&(__CLR4_4_12e2elnvslpxr.R.iget(136)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(137)==0&false))) {{
                __CLR4_4_12e2elnvslpxr.R.inc(138);paLeftSonOfRoot.getLeftSon().setAncestor(paLeftSonOfRoot);
            }
            }__CLR4_4_12e2elnvslpxr.R.inc(139);fifo.add(new Pairing_Heap<>(paLeftSonOfRoot));
            __CLR4_4_12e2elnvslpxr.R.inc(140);paLeftSonOfRoot = help_item;
        } }while((((help_item != null)&&(__CLR4_4_12e2elnvslpxr.R.iget(141)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(142)==0&false)));
        
        //pairs two heaps and put them in a queue until only one heap is in queue
        __CLR4_4_12e2elnvslpxr.R.inc(143);while((((fifo.size() != 1)&&(__CLR4_4_12e2elnvslpxr.R.iget(144)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(145)==0&false))) {{
            __CLR4_4_12e2elnvslpxr.R.inc(146);fifo.add(pair(fifo.remove(),fifo.remove()));
        }
        //returns last pairing heap that remains in the queue
        }__CLR4_4_12e2elnvslpxr.R.inc(147);return fifo.remove();   
    }finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    
    
    /**
     * Method pairs two pairing heaps
     * @param paHeap1
     * @param paHeap2
     * @return
     */
    private Pairing_Heap<T> pair(Pairing_Heap<T> paHeap1, Pairing_Heap<T> paHeap2) {try{__CLR4_4_12e2elnvslpxr.R.inc(148);
        __CLR4_4_12e2elnvslpxr.R.inc(149);if((((paHeap1.getRoot() == null)&&(__CLR4_4_12e2elnvslpxr.R.iget(150)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(151)==0&false))) {{
            __CLR4_4_12e2elnvslpxr.R.inc(152);return paHeap2;
        } 
        }__CLR4_4_12e2elnvslpxr.R.inc(153);if((((paHeap2.getRoot() == null)&&(__CLR4_4_12e2elnvslpxr.R.iget(154)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(155)==0&false))) {{
            __CLR4_4_12e2elnvslpxr.R.inc(156);return paHeap1;
        } 
        }__CLR4_4_12e2elnvslpxr.R.inc(157);if((((paHeap1.getRoot().getData().compareTo(paHeap2.getRoot().getData()) <= 0)&&(__CLR4_4_12e2elnvslpxr.R.iget(158)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(159)==0&false))) {{ //if 2 has a worse priority then 1
            __CLR4_4_12e2elnvslpxr.R.inc(160);if((((paHeap1.getRoot().hasLeftSon())&&(__CLR4_4_12e2elnvslpxr.R.iget(161)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(162)==0&false))) {{
                __CLR4_4_12e2elnvslpxr.R.inc(163);Heap_Item<T> help_item = paHeap1.getRoot().getLeftSon();
                __CLR4_4_12e2elnvslpxr.R.inc(164);paHeap1.getRoot().setLeftSon(paHeap2.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(165);paHeap2.getRoot().setAncestor(paHeap1.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(166);paHeap2.getRoot().setRightSon(help_item);
                __CLR4_4_12e2elnvslpxr.R.inc(167);help_item.setAncestor(paHeap2.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(168);return paHeap1;
            } }else {{
                __CLR4_4_12e2elnvslpxr.R.inc(169);paHeap1.getRoot().setLeftSon(paHeap2.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(170);paHeap2.getRoot().setAncestor(paHeap1.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(171);return paHeap1;
            }
        }} }else {{                                                                //if 2 has a better priority then 1
            __CLR4_4_12e2elnvslpxr.R.inc(172);if((((paHeap2.getRoot().hasLeftSon())&&(__CLR4_4_12e2elnvslpxr.R.iget(173)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(174)==0&false))) {{
                __CLR4_4_12e2elnvslpxr.R.inc(175);Heap_Item<T> help_item = paHeap2.getRoot().getLeftSon();
                __CLR4_4_12e2elnvslpxr.R.inc(176);paHeap2.getRoot().setLeftSon(paHeap1.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(177);paHeap1.getRoot().setAncestor(paHeap2.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(178);paHeap1.getRoot().setRightSon(help_item);
                __CLR4_4_12e2elnvslpxr.R.inc(179);help_item.setAncestor(paHeap1.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(180);return paHeap2;
            } }else {{
                __CLR4_4_12e2elnvslpxr.R.inc(181);paHeap2.getRoot().setLeftSon(paHeap1.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(182);paHeap1.getRoot().setAncestor(paHeap2.getRoot());
                __CLR4_4_12e2elnvslpxr.R.inc(183);return paHeap2;
            }
        }}
    }}finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}}
    
    /**
     * Method checks if the positions of the items are correct after the priority change
     * @param paNode 
     */
    public void checkPriority(Heap_Item<T> paNode) {try{__CLR4_4_12e2elnvslpxr.R.inc(184);
        //increasing - checking if the paNode has better priority as his ancestor in multi-way form
        __CLR4_4_12e2elnvslpxr.R.inc(185);if((((paNode.getAncestor() != null && paNode.getMultiWayAncestor().getData().compareTo(paNode.getData()) > 0)&&(__CLR4_4_12e2elnvslpxr.R.iget(186)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(187)==0&false))) {{
            __CLR4_4_12e2elnvslpxr.R.inc(188);paNode.getAncestor().replaceChild(paNode.getData(), null);                  //removes item from heap
            __CLR4_4_12e2elnvslpxr.R.inc(189);paNode.setAncestor(null);
            __CLR4_4_12e2elnvslpxr.R.inc(190);if((((paNode.hasRightSon())&&(__CLR4_4_12e2elnvslpxr.R.iget(191)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(192)==0&false))) {{ 
                __CLR4_4_12e2elnvslpxr.R.inc(193);paNode = this.multi_heaps_merge(paNode).getRoot();
            }
            }__CLR4_4_12e2elnvslpxr.R.inc(194);this.root = this.pair(this, new Pairing_Heap(paNode)).getRoot();               //pairing with root 
            __CLR4_4_12e2elnvslpxr.R.inc(195);return;
        }
        //decreasing - checking if the paNode has a worse priority then his sons in multi-way form
        }__CLR4_4_12e2elnvslpxr.R.inc(196);if((((paNode.hasLeftSon())&&(__CLR4_4_12e2elnvslpxr.R.iget(197)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(198)==0&false))) {{
            __CLR4_4_12e2elnvslpxr.R.inc(199);Heap_Item<T> son_of_node = paNode.getLeftSon();
            __CLR4_4_12e2elnvslpxr.R.inc(200);do {{
                __CLR4_4_12e2elnvslpxr.R.inc(201);if((((paNode.getData().compareTo(son_of_node.getData()) > 0)&&(__CLR4_4_12e2elnvslpxr.R.iget(202)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(203)==0&false))) {{
                    __CLR4_4_12e2elnvslpxr.R.inc(204);son_of_node = paNode.getLeftSon();
                    __CLR4_4_12e2elnvslpxr.R.inc(205);paNode.removeLeftSon();                                             //removes all sons from heap
                    __CLR4_4_12e2elnvslpxr.R.inc(206);son_of_node.setAncestor(null);
                    __CLR4_4_12e2elnvslpxr.R.inc(207);Pairing_Heap<T> merged_heap = this.multi_heaps_merge(son_of_node);  //merging sons

                    __CLR4_4_12e2elnvslpxr.R.inc(208);Heap_Item<T> right_sonof_node = paNode.getRightSon();          
                    __CLR4_4_12e2elnvslpxr.R.inc(209);Heap_Item<T> anchestor_of_node = paNode.getAncestor();
                    __CLR4_4_12e2elnvslpxr.R.inc(210);if((((right_sonof_node != null)&&(__CLR4_4_12e2elnvslpxr.R.iget(211)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(212)==0&false))) {{
                        __CLR4_4_12e2elnvslpxr.R.inc(213);right_sonof_node.setAncestor(null);
                        __CLR4_4_12e2elnvslpxr.R.inc(214);paNode.removeRightSon();
                    }
                    }__CLR4_4_12e2elnvslpxr.R.inc(215);merged_heap = this.pair(merged_heap, new Pairing_Heap(paNode));     //pairs and sets new root
                    //puts a new subtree with a new root at the originally location 
                    __CLR4_4_12e2elnvslpxr.R.inc(216);if((((anchestor_of_node != null)&&(__CLR4_4_12e2elnvslpxr.R.iget(217)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(218)==0&false))) {{                                     //if the item was root
                        __CLR4_4_12e2elnvslpxr.R.inc(219);anchestor_of_node.replaceChild(paNode.getData(),merged_heap.getRoot());
                        __CLR4_4_12e2elnvslpxr.R.inc(220);merged_heap.getRoot().setRightSon(right_sonof_node);                 
                        __CLR4_4_12e2elnvslpxr.R.inc(221);merged_heap.getRoot().setAncestor(anchestor_of_node);
                        __CLR4_4_12e2elnvslpxr.R.inc(222);if((((right_sonof_node != null)&&(__CLR4_4_12e2elnvslpxr.R.iget(223)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(224)==0&false))) {{                                  //if the item has right son
                            __CLR4_4_12e2elnvslpxr.R.inc(225);right_sonof_node.setAncestor(merged_heap.getRoot());
                        }
                    }} }else {{
                        __CLR4_4_12e2elnvslpxr.R.inc(226);this.root = merged_heap.getRoot();
                    }
                    }__CLR4_4_12e2elnvslpxr.R.inc(227);break;
                }
                }__CLR4_4_12e2elnvslpxr.R.inc(228);son_of_node = son_of_node.getRightSon();
            } }while((((son_of_node != null)&&(__CLR4_4_12e2elnvslpxr.R.iget(229)!=0|true))||(__CLR4_4_12e2elnvslpxr.R.iget(230)==0&false)));
        }
    }}finally{__CLR4_4_12e2elnvslpxr.R.flushNeeded();}} 
}
