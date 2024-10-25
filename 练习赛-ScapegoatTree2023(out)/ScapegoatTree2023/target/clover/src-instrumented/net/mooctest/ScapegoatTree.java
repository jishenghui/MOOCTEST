/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



/**
 * Scapegoat tree non recursive implementation.
 * Warning: not sure if my implementations is really correct, didn't have time to learn more about scapegoat trees.
 * 
 * @author Ignas Lelys
 * @created Jul 28, 2011
 * 
 */
public class ScapegoatTree extends AbstractSelfBalancingBinarySearchTree {public static class __CLR4_4_18181l9i5d09p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0053\u006f\u0066\u0074\u0077\u0061\u0072\u0065\u0073\u005c\u005c\u004a\u0061\u0076\u0061\u005c\u005c\u004a\u0061\u0076\u0061\u005f\u0070\u0072\u0061\u0063\u0074\u0069\u0063\u0065\u005c\u005c\u0053\u0063\u0061\u0070\u0065\u0067\u006f\u0061\u0074\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1666335882853L,8589935092L,421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Alpha parameter. */
    private double alpha = 0.57;
    
    private int maxSize = 0;
    
    /**
     * Constructor.
     */
    public ScapegoatTree() {
        super();__CLR4_4_18181l9i5d09p.R.inc(290);try{__CLR4_4_18181l9i5d09p.R.inc(289);
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}

    /**
     * Constructor.
     * 
     * @param alpha Alpha parameter.
     */
    public ScapegoatTree(double alpha) {
        super();__CLR4_4_18181l9i5d09p.R.inc(292);try{__CLR4_4_18181l9i5d09p.R.inc(291);
        __CLR4_4_18181l9i5d09p.R.inc(293);this.alpha = alpha;
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}

    /**
     * {@inheritDoc}
     */
    @Override
    public Node insert(int element) {try{__CLR4_4_18181l9i5d09p.R.inc(294);
        __CLR4_4_18181l9i5d09p.R.inc(295);Node inserted = super.insert(element);
        __CLR4_4_18181l9i5d09p.R.inc(296);int height = getNodeHeight(inserted);
        __CLR4_4_18181l9i5d09p.R.inc(297);if ((((height > getHAlpha())&&(__CLR4_4_18181l9i5d09p.R.iget(298)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(299)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(300);Node scapegoat = findScapegoatNode(inserted);
            __CLR4_4_18181l9i5d09p.R.inc(301);Node scapegoatParent = scapegoat.parent;
            __CLR4_4_18181l9i5d09p.R.inc(302);boolean scapegoatOnParentsLeft = scapegoatParent != null && scapegoatParent.left == scapegoat;
            __CLR4_4_18181l9i5d09p.R.inc(303);Node rebuiltSubtree = rebuildTree(getSubtreeSize(scapegoat), scapegoat);
            __CLR4_4_18181l9i5d09p.R.inc(304);rebuiltSubtree.parent = scapegoatParent;
            __CLR4_4_18181l9i5d09p.R.inc(305);if ((((scapegoatParent != null)&&(__CLR4_4_18181l9i5d09p.R.iget(306)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(307)==0&false))) {{
                __CLR4_4_18181l9i5d09p.R.inc(308);if ((((scapegoatOnParentsLeft)&&(__CLR4_4_18181l9i5d09p.R.iget(309)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(310)==0&false))) {{
                    __CLR4_4_18181l9i5d09p.R.inc(311);scapegoatParent.left = rebuiltSubtree;
                } }else {{
                    __CLR4_4_18181l9i5d09p.R.inc(312);scapegoatParent.right = rebuiltSubtree;
                }
            }}
            }__CLR4_4_18181l9i5d09p.R.inc(313);if ((((scapegoat == root)&&(__CLR4_4_18181l9i5d09p.R.iget(314)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(315)==0&false))) {{
                __CLR4_4_18181l9i5d09p.R.inc(316);root = rebuiltSubtree;
            }
            }__CLR4_4_18181l9i5d09p.R.inc(317);maxSize = getSize();
        }
        }__CLR4_4_18181l9i5d09p.R.inc(318);return inserted;
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Node delete(int element) {try{__CLR4_4_18181l9i5d09p.R.inc(319);
        __CLR4_4_18181l9i5d09p.R.inc(320);Node replaceNode = super.delete(element);
        __CLR4_4_18181l9i5d09p.R.inc(321);if ((((getSize() <= alpha * maxSize)&&(__CLR4_4_18181l9i5d09p.R.iget(322)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(323)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(324);root = rebuildTree(getSize(), root);
            __CLR4_4_18181l9i5d09p.R.inc(325);maxSize = getSize();
        }
        }__CLR4_4_18181l9i5d09p.R.inc(326);return replaceNode;
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Node createNode(int value, Node parent, Node left, Node right) {try{__CLR4_4_18181l9i5d09p.R.inc(327);
        __CLR4_4_18181l9i5d09p.R.inc(328);return new Node(value, parent, left, right);
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}
    
    /**
     * Finds scapegoat node which is used for rebalancing the tree.
     * 
     * @return Scapegoat node.
     */
    protected Node findScapegoatNode(Node node) {try{__CLR4_4_18181l9i5d09p.R.inc(329);
        __CLR4_4_18181l9i5d09p.R.inc(330);int size = 1;
        __CLR4_4_18181l9i5d09p.R.inc(331);int height = 0;
        __CLR4_4_18181l9i5d09p.R.inc(332);int totalSize = 0;
        __CLR4_4_18181l9i5d09p.R.inc(333);while ((((node.parent != null)&&(__CLR4_4_18181l9i5d09p.R.iget(334)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(335)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(336);height++;
            __CLR4_4_18181l9i5d09p.R.inc(337);totalSize = 1 + size + getSubtreeSize(getSibling(node));
            __CLR4_4_18181l9i5d09p.R.inc(338);if ((((height > Math.floor(MathUtils.logarithm(1 / alpha, totalSize)))&&(__CLR4_4_18181l9i5d09p.R.iget(339)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(340)==0&false))) {{
                __CLR4_4_18181l9i5d09p.R.inc(341);return node.parent;
            }
            }__CLR4_4_18181l9i5d09p.R.inc(342);node = node.parent;
            __CLR4_4_18181l9i5d09p.R.inc(343);size = totalSize;
        }
        }__CLR4_4_18181l9i5d09p.R.inc(344);return null;
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}

    /**
     * Rebuilds unbalanced tree.
     * Found this implementation much clearer and easier to make it work: https://github.com/satchamo/Scapegoat-Tree/blob/master/scapegoat.py
     * Could't get implementations from pdfs to work.
     * 
     * @param size Size of subtree.
     * @param scapegoat Scapegoat is the root of subtree of {@link size} number of nodes.
     * 
     * @return Balanced subtree.
     */
    protected Node rebuildTree(int size, Node scapegoat) {try{__CLR4_4_18181l9i5d09p.R.inc(345);
        __CLR4_4_18181l9i5d09p.R.inc(346);List<Node> nodes = new ArrayList<Node>();
        
        // flatten tree without recursion
        __CLR4_4_18181l9i5d09p.R.inc(347);Node currentNode = scapegoat;
        __CLR4_4_18181l9i5d09p.R.inc(348);boolean done = false;
        __CLR4_4_18181l9i5d09p.R.inc(349);Stack<Node> stack = new Stack<>();
        __CLR4_4_18181l9i5d09p.R.inc(350);while ((((!done)&&(__CLR4_4_18181l9i5d09p.R.iget(351)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(352)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(353);if ((((currentNode != null)&&(__CLR4_4_18181l9i5d09p.R.iget(354)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(355)==0&false))) {{
                __CLR4_4_18181l9i5d09p.R.inc(356);stack.push(currentNode);
                __CLR4_4_18181l9i5d09p.R.inc(357);currentNode = currentNode.left;
            } }else {{
                __CLR4_4_18181l9i5d09p.R.inc(358);if ((((!stack.isEmpty())&&(__CLR4_4_18181l9i5d09p.R.iget(359)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(360)==0&false))) {{
                    __CLR4_4_18181l9i5d09p.R.inc(361);currentNode = stack.pop();
                    __CLR4_4_18181l9i5d09p.R.inc(362);nodes.add(currentNode);
                    __CLR4_4_18181l9i5d09p.R.inc(363);currentNode = currentNode.right;
                } }else {{
                    __CLR4_4_18181l9i5d09p.R.inc(364);done = true;
                }
            }}
        }}
        
        // build tree from flattened list of nodes
        }__CLR4_4_18181l9i5d09p.R.inc(365);return buildTree(nodes, 0, size - 1);
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}
    
    /**
     * Build balanced tree from flattened tree.
     */
    private Node buildTree(List<Node> nodes, int start, int end) {try{__CLR4_4_18181l9i5d09p.R.inc(366);
        __CLR4_4_18181l9i5d09p.R.inc(367);int middle = (int)Math.ceil(((double)(start + end)) / 2.0);
        __CLR4_4_18181l9i5d09p.R.inc(368);if ((((start > end)&&(__CLR4_4_18181l9i5d09p.R.iget(369)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(370)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(371);return null;
        }

        // middle becomes root of subtree instead of scapegoat
        }__CLR4_4_18181l9i5d09p.R.inc(372);Node node = nodes.get(middle);
        
        // recursively get left and right nodes
        __CLR4_4_18181l9i5d09p.R.inc(373);Node leftNode = buildTree(nodes, start, middle - 1);
        __CLR4_4_18181l9i5d09p.R.inc(374);node.left = leftNode;
        __CLR4_4_18181l9i5d09p.R.inc(375);if ((((leftNode != null)&&(__CLR4_4_18181l9i5d09p.R.iget(376)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(377)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(378);leftNode.parent = node;
        }
        }__CLR4_4_18181l9i5d09p.R.inc(379);Node rightNode = buildTree(nodes, middle + 1, end);
        __CLR4_4_18181l9i5d09p.R.inc(380);node.right = rightNode;
        __CLR4_4_18181l9i5d09p.R.inc(381);if ((((rightNode != null)&&(__CLR4_4_18181l9i5d09p.R.iget(382)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(383)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(384);rightNode.parent = node;
        }
        }__CLR4_4_18181l9i5d09p.R.inc(385);return node;
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}
    
    /**
     * @return Node's sibling.
     */
    // TODO move to AbstractBinaySearchTree and use in other trees where needed.
    private Node getSibling(Node node) {try{__CLR4_4_18181l9i5d09p.R.inc(386);
        __CLR4_4_18181l9i5d09p.R.inc(387);if ((((node.parent != null)&&(__CLR4_4_18181l9i5d09p.R.iget(388)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(389)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(390);if ((((node.parent.left == node)&&(__CLR4_4_18181l9i5d09p.R.iget(391)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(392)==0&false))) {{
                __CLR4_4_18181l9i5d09p.R.inc(393);return node.parent.right;
            } }else {{
                __CLR4_4_18181l9i5d09p.R.inc(394);return node.parent.left;
            }
        }}
        }__CLR4_4_18181l9i5d09p.R.inc(395);return null;
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}
    
    /**
     * Calculate size of subtree.
     * 
     * @param node
     *            Subtree root node.
     * @return Number of elements in the subtree.
     */
    // TODO move to AbstractBinaySearchTree
    protected int getSubtreeSize(Node node) {try{__CLR4_4_18181l9i5d09p.R.inc(396);
        __CLR4_4_18181l9i5d09p.R.inc(397);if ((((node == null)&&(__CLR4_4_18181l9i5d09p.R.iget(398)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(399)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(400);return 0;
        }
        }__CLR4_4_18181l9i5d09p.R.inc(401);if ((((node.isLeaf())&&(__CLR4_4_18181l9i5d09p.R.iget(402)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(403)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(404);return 1;
        } }else {{
            __CLR4_4_18181l9i5d09p.R.inc(405);int sum = 1;
            __CLR4_4_18181l9i5d09p.R.inc(406);sum += getSubtreeSize(node.left);
            __CLR4_4_18181l9i5d09p.R.inc(407);sum += getSubtreeSize(node.right);
            __CLR4_4_18181l9i5d09p.R.inc(408);return sum;
        }
    }}finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}
    
    // TODO move to AbstractBinaySearchTree
    protected int getNodeHeight(Node node) {try{__CLR4_4_18181l9i5d09p.R.inc(409);
        __CLR4_4_18181l9i5d09p.R.inc(410);if ((((node == null)&&(__CLR4_4_18181l9i5d09p.R.iget(411)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(412)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(413);return -1;
        } }else {__CLR4_4_18181l9i5d09p.R.inc(414);if ((((node.parent == null)&&(__CLR4_4_18181l9i5d09p.R.iget(415)!=0|true))||(__CLR4_4_18181l9i5d09p.R.iget(416)==0&false))) {{
            __CLR4_4_18181l9i5d09p.R.inc(417);return 0;
        } }else {{
            __CLR4_4_18181l9i5d09p.R.inc(418);return getNodeHeight(node.parent) + 1;
        }
    }}}finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}

    private int getHAlpha() {try{__CLR4_4_18181l9i5d09p.R.inc(419);
        __CLR4_4_18181l9i5d09p.R.inc(420);return (int)Math.floor(MathUtils.logarithm(1 / alpha, (double)getSize()));
    }finally{__CLR4_4_18181l9i5d09p.R.flushNeeded();}}

}