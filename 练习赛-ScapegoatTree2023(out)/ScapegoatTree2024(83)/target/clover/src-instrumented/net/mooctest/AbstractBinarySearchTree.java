/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * Abstract binary search tree implementation. Its basically fully implemented
 * binary search tree, just template method is provided for creating Node (other
 * trees can have slightly different nodes with more info). This way some code
 * from standart binary search tree can be reused for other kinds of binary
 * trees.
 * 
 * @author Ignas Lelys
 * @created Jun 29, 2011
 * 
 */
public abstract class AbstractBinarySearchTree {public static class __CLR4_4_100l9i5d07t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0073\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u004a\u0061\u0076\u0061\u005f\u0070\u0072\u0061\u0063\u0074\u0069\u0063\u0065\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666335882853L,8589935092L,241,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Root node where whole tree starts. */
    public Node root;

    /** Tree size. */
    protected int size;

    /**
     * Because this is abstract class and various trees have different additional information on 
     * different nodes subclasses uses this abstract method to create nodes (maybe of class {@link Node}
     * or maybe some different node sub class).
     * 
     * @param value Value that node will have.
     * @param parent Node's parent.
     * @param left Node's left child.
     * @param right Node's right child.
     * @return Created node instance.
     */
    protected abstract Node createNode(int value, Node parent, Node left, Node right);

    /**
     * Finds a node with concrete value. If it is not found then null is
     * returned.
     * 
     * @param element
     *            Element value.
     * @return Node with value provided, or null if not found.
     */
    public Node search(int element) {try{__CLR4_4_100l9i5d07t.R.inc(0);
        __CLR4_4_100l9i5d07t.R.inc(1);Node node = root;
        __CLR4_4_100l9i5d07t.R.inc(2);while ((((node != null && node.value != null && node.value != element)&&(__CLR4_4_100l9i5d07t.R.iget(3)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(4)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(5);if ((((element < node.value)&&(__CLR4_4_100l9i5d07t.R.iget(6)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(7)==0&false))) {{
                __CLR4_4_100l9i5d07t.R.inc(8);node = node.left;
            } }else {{
                __CLR4_4_100l9i5d07t.R.inc(9);node = node.right;
            }
        }}
        }__CLR4_4_100l9i5d07t.R.inc(10);return node;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Insert new element to tree.
     * 
     * @param element
     *            Element to insert.
     */
    public Node insert(int element) {try{__CLR4_4_100l9i5d07t.R.inc(11);
        __CLR4_4_100l9i5d07t.R.inc(12);if ((((root == null)&&(__CLR4_4_100l9i5d07t.R.iget(13)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(14)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(15);root = createNode(element, null, null, null);
            __CLR4_4_100l9i5d07t.R.inc(16);size++;
            __CLR4_4_100l9i5d07t.R.inc(17);return root;
        }

        }__CLR4_4_100l9i5d07t.R.inc(18);Node insertParentNode = null;
        __CLR4_4_100l9i5d07t.R.inc(19);Node searchTempNode = root;
        __CLR4_4_100l9i5d07t.R.inc(20);while ((((searchTempNode != null && searchTempNode.value != null)&&(__CLR4_4_100l9i5d07t.R.iget(21)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(22)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(23);insertParentNode = searchTempNode;
            __CLR4_4_100l9i5d07t.R.inc(24);if ((((element < searchTempNode.value)&&(__CLR4_4_100l9i5d07t.R.iget(25)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(26)==0&false))) {{
                __CLR4_4_100l9i5d07t.R.inc(27);searchTempNode = searchTempNode.left;
            } }else {{
                __CLR4_4_100l9i5d07t.R.inc(28);searchTempNode = searchTempNode.right;
            }
        }}

        }__CLR4_4_100l9i5d07t.R.inc(29);Node newNode = createNode(element, insertParentNode, null, null);
        __CLR4_4_100l9i5d07t.R.inc(30);if ((((insertParentNode.value > newNode.value)&&(__CLR4_4_100l9i5d07t.R.iget(31)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(32)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(33);insertParentNode.left = newNode;
        } }else {{
            __CLR4_4_100l9i5d07t.R.inc(34);insertParentNode.right = newNode;
        }

        }__CLR4_4_100l9i5d07t.R.inc(35);size++;
        __CLR4_4_100l9i5d07t.R.inc(36);return newNode;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Removes element if node with such value exists.
     * 
     * @param element
     *            Element value to remove.
     * 
     * @return New node that is in place of deleted node. Or null if element for
     *         delete was not found.
     */
    public Node delete(int element) {try{__CLR4_4_100l9i5d07t.R.inc(37);
        __CLR4_4_100l9i5d07t.R.inc(38);Node deleteNode = search(element);
        __CLR4_4_100l9i5d07t.R.inc(39);if ((((deleteNode != null)&&(__CLR4_4_100l9i5d07t.R.iget(40)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(41)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(42);return delete(deleteNode);
        } }else {{
            __CLR4_4_100l9i5d07t.R.inc(43);return null;
        }
    }}finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Delete logic when node is already found.
     * 
     * @param deleteNode
     *            Node that needs to be deleted.
     * 
     * @return New node that is in place of deleted node. Or null if element for
     *         delete was not found.
     */
    protected Node delete(Node deleteNode) {try{__CLR4_4_100l9i5d07t.R.inc(44);
        __CLR4_4_100l9i5d07t.R.inc(45);if ((((deleteNode != null)&&(__CLR4_4_100l9i5d07t.R.iget(46)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(47)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(48);Node nodeToReturn = null;
            __CLR4_4_100l9i5d07t.R.inc(49);if ((((deleteNode != null)&&(__CLR4_4_100l9i5d07t.R.iget(50)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(51)==0&false))) {{
                __CLR4_4_100l9i5d07t.R.inc(52);if ((((deleteNode.left == null)&&(__CLR4_4_100l9i5d07t.R.iget(53)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(54)==0&false))) {{
                    __CLR4_4_100l9i5d07t.R.inc(55);nodeToReturn = transplant(deleteNode, deleteNode.right);
                } }else {__CLR4_4_100l9i5d07t.R.inc(56);if ((((deleteNode.right == null)&&(__CLR4_4_100l9i5d07t.R.iget(57)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(58)==0&false))) {{
                    __CLR4_4_100l9i5d07t.R.inc(59);nodeToReturn = transplant(deleteNode, deleteNode.left);
                } }else {{
                    __CLR4_4_100l9i5d07t.R.inc(60);Node successorNode = getMinimum(deleteNode.right);
                    __CLR4_4_100l9i5d07t.R.inc(61);if ((((successorNode.parent != deleteNode)&&(__CLR4_4_100l9i5d07t.R.iget(62)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(63)==0&false))) {{
                        __CLR4_4_100l9i5d07t.R.inc(64);transplant(successorNode, successorNode.right);
                        __CLR4_4_100l9i5d07t.R.inc(65);successorNode.right = deleteNode.right;
                        __CLR4_4_100l9i5d07t.R.inc(66);successorNode.right.parent = successorNode;
                    }
                    }__CLR4_4_100l9i5d07t.R.inc(67);transplant(deleteNode, successorNode);
                    __CLR4_4_100l9i5d07t.R.inc(68);successorNode.left = deleteNode.left;
                    __CLR4_4_100l9i5d07t.R.inc(69);successorNode.left.parent = successorNode;
                    __CLR4_4_100l9i5d07t.R.inc(70);nodeToReturn = successorNode;
                }
                }}__CLR4_4_100l9i5d07t.R.inc(71);size--;
            }
    
            }__CLR4_4_100l9i5d07t.R.inc(72);return nodeToReturn;
        }
        }__CLR4_4_100l9i5d07t.R.inc(73);return null;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Put one node from tree (newNode) to the place of another (nodeToReplace).
     * 
     * @param nodeToReplace
     *            Node which is replaced by newNode and removed from tree.
     * @param newNode
     *            New node.
     * 
     * @return New replaced node.
     */
    private Node transplant(Node nodeToReplace, Node newNode) {try{__CLR4_4_100l9i5d07t.R.inc(74);
        __CLR4_4_100l9i5d07t.R.inc(75);if ((((nodeToReplace.parent == null)&&(__CLR4_4_100l9i5d07t.R.iget(76)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(77)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(78);this.root = newNode;
        } }else {__CLR4_4_100l9i5d07t.R.inc(79);if ((((nodeToReplace == nodeToReplace.parent.left)&&(__CLR4_4_100l9i5d07t.R.iget(80)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(81)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(82);nodeToReplace.parent.left = newNode;
        } }else {{
            __CLR4_4_100l9i5d07t.R.inc(83);nodeToReplace.parent.right = newNode;
        }
        }}__CLR4_4_100l9i5d07t.R.inc(84);if ((((newNode != null)&&(__CLR4_4_100l9i5d07t.R.iget(85)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(86)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(87);newNode.parent = nodeToReplace.parent;
        }
        }__CLR4_4_100l9i5d07t.R.inc(88);return newNode;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * @param element
     * @return true if tree contains element.
     */
    public boolean contains(int element) {try{__CLR4_4_100l9i5d07t.R.inc(89);
        __CLR4_4_100l9i5d07t.R.inc(90);return search(element) != null;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * @return Minimum element in tree.
     */
    public int getMinimum() {try{__CLR4_4_100l9i5d07t.R.inc(91);
        __CLR4_4_100l9i5d07t.R.inc(92);return getMinimum(root).value;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * @return Maximum element in tree.
     */
    public int getMaximum() {try{__CLR4_4_100l9i5d07t.R.inc(93);
        __CLR4_4_100l9i5d07t.R.inc(94);return getMaximum(root).value;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Get next element element who is bigger than provided element.
     * 
     * @param element
     *            Element for whom descendand element is searched
     * @return Successor value.
     */
    // TODO Predecessor
    public int getSuccessor(int element) {try{__CLR4_4_100l9i5d07t.R.inc(95);
        __CLR4_4_100l9i5d07t.R.inc(96);return getSuccessor(search(element)).value;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * @return Number of elements in the tree.
     */
    public int getSize() {try{__CLR4_4_100l9i5d07t.R.inc(97);
        __CLR4_4_100l9i5d07t.R.inc(98);return size;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Tree traversal with printing element values. In order method.
     */
    public void printTreeInOrder() {try{__CLR4_4_100l9i5d07t.R.inc(99);
        __CLR4_4_100l9i5d07t.R.inc(100);printTreeInOrder(root);
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Tree traversal with printing element values. Pre order method.
     */
    public void printTreePreOrder() {try{__CLR4_4_100l9i5d07t.R.inc(101);
        __CLR4_4_100l9i5d07t.R.inc(102);printTreePreOrder(root);
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /**
     * Tree traversal with printing element values. Post order method.
     */
    public void printTreePostOrder() {try{__CLR4_4_100l9i5d07t.R.inc(103);
        __CLR4_4_100l9i5d07t.R.inc(104);printTreePostOrder(root);
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    /*-------------------PRIVATE HELPER METHODS-------------------*/

    private void printTreeInOrder(Node entry) {try{__CLR4_4_100l9i5d07t.R.inc(105);
        __CLR4_4_100l9i5d07t.R.inc(106);if ((((entry != null)&&(__CLR4_4_100l9i5d07t.R.iget(107)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(108)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(109);printTreeInOrder(entry.left);
            __CLR4_4_100l9i5d07t.R.inc(110);if ((((entry.value != null)&&(__CLR4_4_100l9i5d07t.R.iget(111)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(112)==0&false))) {{
                __CLR4_4_100l9i5d07t.R.inc(113);System.out.println(entry.value);
            }
            }__CLR4_4_100l9i5d07t.R.inc(114);printTreeInOrder(entry.right);
        }
    }}finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    private void printTreePreOrder(Node entry) {try{__CLR4_4_100l9i5d07t.R.inc(115);
        __CLR4_4_100l9i5d07t.R.inc(116);if ((((entry != null)&&(__CLR4_4_100l9i5d07t.R.iget(117)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(118)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(119);if ((((entry.value != null)&&(__CLR4_4_100l9i5d07t.R.iget(120)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(121)==0&false))) {{
                __CLR4_4_100l9i5d07t.R.inc(122);System.out.println(entry.value);
            }
            }__CLR4_4_100l9i5d07t.R.inc(123);printTreeInOrder(entry.left);
            __CLR4_4_100l9i5d07t.R.inc(124);printTreeInOrder(entry.right);
        }
    }}finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    private void printTreePostOrder(Node entry) {try{__CLR4_4_100l9i5d07t.R.inc(125);
        __CLR4_4_100l9i5d07t.R.inc(126);if ((((entry != null)&&(__CLR4_4_100l9i5d07t.R.iget(127)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(128)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(129);printTreeInOrder(entry.left);
            __CLR4_4_100l9i5d07t.R.inc(130);printTreeInOrder(entry.right);
            __CLR4_4_100l9i5d07t.R.inc(131);if ((((entry.value != null)&&(__CLR4_4_100l9i5d07t.R.iget(132)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(133)==0&false))) {{
                __CLR4_4_100l9i5d07t.R.inc(134);System.out.println(entry.value);
            }
        }}
    }}finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    protected Node getMinimum(Node node) {try{__CLR4_4_100l9i5d07t.R.inc(135);
        __CLR4_4_100l9i5d07t.R.inc(136);while ((((node.left != null)&&(__CLR4_4_100l9i5d07t.R.iget(137)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(138)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(139);node = node.left;
        }
        }__CLR4_4_100l9i5d07t.R.inc(140);return node;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    protected Node getMaximum(Node node) {try{__CLR4_4_100l9i5d07t.R.inc(141);
        __CLR4_4_100l9i5d07t.R.inc(142);while ((((node.right != null)&&(__CLR4_4_100l9i5d07t.R.iget(143)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(144)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(145);node = node.right;
        }
        }__CLR4_4_100l9i5d07t.R.inc(146);return node;
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    protected Node getSuccessor(Node node) {try{__CLR4_4_100l9i5d07t.R.inc(147);
        // if there is right branch, then successor is leftmost node of that
        // subtree
        __CLR4_4_100l9i5d07t.R.inc(148);if ((((node.right != null)&&(__CLR4_4_100l9i5d07t.R.iget(149)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(150)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(151);return getMinimum(node.right);
        } }else {{ // otherwise it is a lowest ancestor whose left child is also
            // ancestor of node
            __CLR4_4_100l9i5d07t.R.inc(152);Node currentNode = node;
            __CLR4_4_100l9i5d07t.R.inc(153);Node parentNode = node.parent;
            __CLR4_4_100l9i5d07t.R.inc(154);while ((((parentNode != null && currentNode == parentNode.right)&&(__CLR4_4_100l9i5d07t.R.iget(155)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(156)==0&false))) {{
                // go up until we find parent that currentNode is not in right
                // subtree.
                __CLR4_4_100l9i5d07t.R.inc(157);currentNode = parentNode;
                __CLR4_4_100l9i5d07t.R.inc(158);parentNode = parentNode.parent;
            }
            }__CLR4_4_100l9i5d07t.R.inc(159);return parentNode;
        }
    }}finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}
    
    //-------------------------------- TREE PRINTING ------------------------------------

    public void printTree() {try{__CLR4_4_100l9i5d07t.R.inc(160);
        __CLR4_4_100l9i5d07t.R.inc(161);printSubtree(root);
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}
    
    public void printSubtree(Node node) {try{__CLR4_4_100l9i5d07t.R.inc(162);
        __CLR4_4_100l9i5d07t.R.inc(163);if ((((node.right != null)&&(__CLR4_4_100l9i5d07t.R.iget(164)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(165)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(166);printTree(node.right, true, "");
        }
        }__CLR4_4_100l9i5d07t.R.inc(167);printNodeValue(node);
        __CLR4_4_100l9i5d07t.R.inc(168);if ((((node.left != null)&&(__CLR4_4_100l9i5d07t.R.iget(169)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(170)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(171);printTree(node.left, false, "");
        }
    }}finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}
    
    private void printNodeValue(Node node) {try{__CLR4_4_100l9i5d07t.R.inc(172);
        __CLR4_4_100l9i5d07t.R.inc(173);if ((((node.value == null)&&(__CLR4_4_100l9i5d07t.R.iget(174)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(175)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(176);System.out.print("<null>");
        } }else {{
            __CLR4_4_100l9i5d07t.R.inc(177);System.out.print(node.value.toString());
        }
        }__CLR4_4_100l9i5d07t.R.inc(178);System.out.println();
    }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}
    
    private void printTree(Node node, boolean isRight, String indent) {try{__CLR4_4_100l9i5d07t.R.inc(179);
        __CLR4_4_100l9i5d07t.R.inc(180);if ((((node.right != null)&&(__CLR4_4_100l9i5d07t.R.iget(181)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(182)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(183);printTree(node.right, true, indent + ((((isRight )&&(__CLR4_4_100l9i5d07t.R.iget(184)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(185)==0&false))? "        " : " |      "));
        }
        }__CLR4_4_100l9i5d07t.R.inc(186);System.out.print(indent);
        __CLR4_4_100l9i5d07t.R.inc(187);if ((((isRight)&&(__CLR4_4_100l9i5d07t.R.iget(188)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(189)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(190);System.out.print(" /");
        } }else {{
            __CLR4_4_100l9i5d07t.R.inc(191);System.out.print(" \\");
        }
        }__CLR4_4_100l9i5d07t.R.inc(192);System.out.print("----- ");
        __CLR4_4_100l9i5d07t.R.inc(193);printNodeValue(node);
        __CLR4_4_100l9i5d07t.R.inc(194);if ((((node.left != null)&&(__CLR4_4_100l9i5d07t.R.iget(195)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(196)==0&false))) {{
            __CLR4_4_100l9i5d07t.R.inc(197);printTree(node.left, false, indent + ((((isRight )&&(__CLR4_4_100l9i5d07t.R.iget(198)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(199)==0&false))? " |      " : "        "));
        }
    }}finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}


    public static class Node {
        public Node(Integer value, Node parent, Node left, Node right) {
            super();__CLR4_4_100l9i5d07t.R.inc(201);try{__CLR4_4_100l9i5d07t.R.inc(200);
            __CLR4_4_100l9i5d07t.R.inc(202);this.value = value;
            __CLR4_4_100l9i5d07t.R.inc(203);this.parent = parent;
            __CLR4_4_100l9i5d07t.R.inc(204);this.left = left;
            __CLR4_4_100l9i5d07t.R.inc(205);this.right = right;
        }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

        public Integer value;
        public Node parent;
        public Node left;
        public Node right;
        
        public boolean isLeaf() {try{__CLR4_4_100l9i5d07t.R.inc(206);
            __CLR4_4_100l9i5d07t.R.inc(207);return left == null && right == null;
        }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_4_100l9i5d07t.R.inc(208);
            __CLR4_4_100l9i5d07t.R.inc(209);final int prime = 31;
            __CLR4_4_100l9i5d07t.R.inc(210);int result = 1;
            __CLR4_4_100l9i5d07t.R.inc(211);result = prime * result + (((((value == null) )&&(__CLR4_4_100l9i5d07t.R.iget(212)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(213)==0&false))? 0 : value.hashCode());
            __CLR4_4_100l9i5d07t.R.inc(214);return result;
        }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_4_100l9i5d07t.R.inc(215);
            __CLR4_4_100l9i5d07t.R.inc(216);if ((((this == obj)&&(__CLR4_4_100l9i5d07t.R.iget(217)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(218)==0&false)))
                {__CLR4_4_100l9i5d07t.R.inc(219);return true;
            }__CLR4_4_100l9i5d07t.R.inc(220);if ((((obj == null)&&(__CLR4_4_100l9i5d07t.R.iget(221)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(222)==0&false)))
                {__CLR4_4_100l9i5d07t.R.inc(223);return false;
            }__CLR4_4_100l9i5d07t.R.inc(224);if ((((getClass() != obj.getClass())&&(__CLR4_4_100l9i5d07t.R.iget(225)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(226)==0&false)))
                {__CLR4_4_100l9i5d07t.R.inc(227);return false;
            }__CLR4_4_100l9i5d07t.R.inc(228);Node other = (Node) obj;
            __CLR4_4_100l9i5d07t.R.inc(229);if ((((value == null)&&(__CLR4_4_100l9i5d07t.R.iget(230)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(231)==0&false))) {{
                __CLR4_4_100l9i5d07t.R.inc(232);if ((((other.value != null)&&(__CLR4_4_100l9i5d07t.R.iget(233)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(234)==0&false)))
                    {__CLR4_4_100l9i5d07t.R.inc(235);return false;
            }} }else {__CLR4_4_100l9i5d07t.R.inc(236);if ((((!value.equals(other.value))&&(__CLR4_4_100l9i5d07t.R.iget(237)!=0|true))||(__CLR4_4_100l9i5d07t.R.iget(238)==0&false)))
                {__CLR4_4_100l9i5d07t.R.inc(239);return false;
            }}__CLR4_4_100l9i5d07t.R.inc(240);return true;
        }finally{__CLR4_4_100l9i5d07t.R.flushNeeded();}}

    }
}
