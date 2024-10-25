/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BPlusTree<K extends Comparable<? super K>, V> {public static class __CLR4_4_100lo0x4s8c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0039\u0039\u0035\u0037\u005c\u005c\u0053\u0069\u006d\u0070\u006c\u0065\u0041\u006c\u0067\u006f\u0072\u0069\u0074\u0068\u006d\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697945872219L,8589935092L,249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public static enum RangePolicy {
		EXCLUSIVE, INCLUSIVE
	}

	/**
	 * The branching factor used when none specified in constructor.
	 */
	private static final int DEFAULT_BRANCHING_FACTOR = 128;

	/**
	 * The branching factor for the B+ tree, that measures the capacity of nodes
	 * (i.e., the number of children nodes) for internal nodes in the tree.
	 */
	private int branchingFactor;

	/**
	 * The root node of the B+ tree.
	 */
	private Node root;

	public BPlusTree() {
		this(DEFAULT_BRANCHING_FACTOR);__CLR4_4_100lo0x4s8c.R.inc(1);try{__CLR4_4_100lo0x4s8c.R.inc(0);
	}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

	public BPlusTree(int branchingFactor) {try{__CLR4_4_100lo0x4s8c.R.inc(2);
		__CLR4_4_100lo0x4s8c.R.inc(3);if ((((branchingFactor <= 2)&&(__CLR4_4_100lo0x4s8c.R.iget(4)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(5)==0&false)))
			{__CLR4_4_100lo0x4s8c.R.inc(6);throw new IllegalArgumentException("Illegal branching factor: "
					+ branchingFactor);
		}__CLR4_4_100lo0x4s8c.R.inc(7);this.branchingFactor = branchingFactor;
		__CLR4_4_100lo0x4s8c.R.inc(8);root = new LeafNode();
	}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

	/**
	 * Returns the value to which the specified key is associated, or
	 * {@code null} if this tree contains no association for the key.
	 *
	 * <p>
	 * A return value of {@code null} does not <i>necessarily</i> indicate that
	 * the tree contains no association for the key; it's also possible that the
	 * tree explicitly associates the key to {@code null}.
	 * 
	 * @param key
	 *            the key whose associated value is to be returned
	 * 
	 * @return the value to which the specified key is associated, or
	 *         {@code null} if this tree contains no association for the key
	 */
	public V search(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(9);
		__CLR4_4_100lo0x4s8c.R.inc(10);return root.getValue(key);
	}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

	/**
	 * Returns the values associated with the keys specified by the range:
	 * {@code key1} and {@code key2}.
	 * 
	 * @param key1
	 *            the start key of the range
	 * @param policy1
	 *            the range policy, {@link RangePolicy#EXCLUSIVE} or
	 *            {@link RangePolicy#INCLUSIVE}
	 * @param key2
	 *            the end end of the range
	 * @param policy2
	 *            the range policy, {@link RangePolicy#EXCLUSIVE} or
	 *            {@link RangePolicy#INCLUSIVE}
	 * @return the values associated with the keys specified by the range:
	 *         {@code key1} and {@code key2}
	 */
	public List<V> searchRange(K key1, RangePolicy policy1, K key2,
			RangePolicy policy2) {try{__CLR4_4_100lo0x4s8c.R.inc(11);
		__CLR4_4_100lo0x4s8c.R.inc(12);return root.getRange(key1, policy1, key2, policy2);
	}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

	/**
	 * Associates the specified value with the specified key in this tree. If
	 * the tree previously contained a association for the key, the old value is
	 * replaced.
	 * 
	 * @param key
	 *            the key with which the specified value is to be associated
	 * @param value
	 *            the value to be associated with the specified key
	 */
	public void insert(K key, V value) {try{__CLR4_4_100lo0x4s8c.R.inc(13);
		__CLR4_4_100lo0x4s8c.R.inc(14);root.insertValue(key, value);
	}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

	/**
	 * Removes the association for the specified key from this tree if present.
	 * 
	 * @param key
	 *            the key whose association is to be removed from the tree
	 */
	public void delete(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(15);
		__CLR4_4_100lo0x4s8c.R.inc(16);root.deleteValue(key);
	}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

	public String toString() {try{__CLR4_4_100lo0x4s8c.R.inc(17);
		__CLR4_4_100lo0x4s8c.R.inc(18);Queue<List<Node>> queue = new LinkedList<List<Node>>();
		__CLR4_4_100lo0x4s8c.R.inc(19);queue.add(Arrays.asList(root));
		__CLR4_4_100lo0x4s8c.R.inc(20);StringBuilder sb = new StringBuilder();
		__CLR4_4_100lo0x4s8c.R.inc(21);while ((((!queue.isEmpty())&&(__CLR4_4_100lo0x4s8c.R.iget(22)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(23)==0&false))) {{
			__CLR4_4_100lo0x4s8c.R.inc(24);Queue<List<Node>> nextQueue = new LinkedList<List<Node>>();
			__CLR4_4_100lo0x4s8c.R.inc(25);while ((((!queue.isEmpty())&&(__CLR4_4_100lo0x4s8c.R.iget(26)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(27)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(28);List<Node> nodes = queue.remove();
				__CLR4_4_100lo0x4s8c.R.inc(29);sb.append('{');
				__CLR4_4_100lo0x4s8c.R.inc(30);Iterator<Node> it = nodes.iterator();
				__CLR4_4_100lo0x4s8c.R.inc(31);while ((((it.hasNext())&&(__CLR4_4_100lo0x4s8c.R.iget(32)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(33)==0&false))) {{
					__CLR4_4_100lo0x4s8c.R.inc(34);Node node = it.next();
					__CLR4_4_100lo0x4s8c.R.inc(35);sb.append(node.toString());
					__CLR4_4_100lo0x4s8c.R.inc(36);if ((((it.hasNext())&&(__CLR4_4_100lo0x4s8c.R.iget(37)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(38)==0&false)))
						{__CLR4_4_100lo0x4s8c.R.inc(39);sb.append(", ");
					}__CLR4_4_100lo0x4s8c.R.inc(40);if ((((node instanceof BPlusTree.InternalNode)&&(__CLR4_4_100lo0x4s8c.R.iget(41)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(42)==0&false)))
						{__CLR4_4_100lo0x4s8c.R.inc(43);nextQueue.add(((InternalNode) node).children);
				}}
				}__CLR4_4_100lo0x4s8c.R.inc(44);sb.append('}');
				__CLR4_4_100lo0x4s8c.R.inc(45);if ((((!queue.isEmpty())&&(__CLR4_4_100lo0x4s8c.R.iget(46)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(47)==0&false)))
					{__CLR4_4_100lo0x4s8c.R.inc(48);sb.append(", ");
				}else
					{__CLR4_4_100lo0x4s8c.R.inc(49);sb.append('\n');
			}}
			}__CLR4_4_100lo0x4s8c.R.inc(50);queue = nextQueue;
		}

		}__CLR4_4_100lo0x4s8c.R.inc(51);return sb.toString();
	}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

	private abstract class Node {
		List<K> keys;

		int keyNumber() {try{__CLR4_4_100lo0x4s8c.R.inc(52);
			__CLR4_4_100lo0x4s8c.R.inc(53);return keys.size();
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		abstract V getValue(K key);

		abstract void deleteValue(K key);

		abstract void insertValue(K key, V value);

		abstract K getFirstLeafKey();

		abstract List<V> getRange(K key1, RangePolicy policy1, K key2,
				RangePolicy policy2);

		abstract void merge(Node sibling);

		abstract Node split();

		abstract boolean isOverflow();

		abstract boolean isUnderflow();

		public String toString() {try{__CLR4_4_100lo0x4s8c.R.inc(54);
			__CLR4_4_100lo0x4s8c.R.inc(55);return keys.toString();
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}
	}

	private class InternalNode extends Node {
		List<Node> children;

		InternalNode() {try{__CLR4_4_100lo0x4s8c.R.inc(56);
			__CLR4_4_100lo0x4s8c.R.inc(57);this.keys = new ArrayList<K>();
			__CLR4_4_100lo0x4s8c.R.inc(58);this.children = new ArrayList<Node>();
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		V getValue(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(59);
			__CLR4_4_100lo0x4s8c.R.inc(60);return getChild(key).getValue(key);
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		void deleteValue(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(61);
			__CLR4_4_100lo0x4s8c.R.inc(62);Node child = getChild(key);
			__CLR4_4_100lo0x4s8c.R.inc(63);child.deleteValue(key);
			__CLR4_4_100lo0x4s8c.R.inc(64);if ((((child.isUnderflow())&&(__CLR4_4_100lo0x4s8c.R.iget(65)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(66)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(67);Node childLeftSibling = getChildLeftSibling(key);
				__CLR4_4_100lo0x4s8c.R.inc(68);Node childRightSibling = getChildRightSibling(key);
				__CLR4_4_100lo0x4s8c.R.inc(69);Node left = (((childLeftSibling != null )&&(__CLR4_4_100lo0x4s8c.R.iget(70)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(71)==0&false))? childLeftSibling : child;
				__CLR4_4_100lo0x4s8c.R.inc(72);Node right = (((childLeftSibling != null )&&(__CLR4_4_100lo0x4s8c.R.iget(73)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(74)==0&false))? child
						: childRightSibling;
				__CLR4_4_100lo0x4s8c.R.inc(75);left.merge(right);
				__CLR4_4_100lo0x4s8c.R.inc(76);deleteChild(right.getFirstLeafKey());
				__CLR4_4_100lo0x4s8c.R.inc(77);if ((((left.isOverflow())&&(__CLR4_4_100lo0x4s8c.R.iget(78)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(79)==0&false))) {{
					__CLR4_4_100lo0x4s8c.R.inc(80);Node sibling = left.split();
					__CLR4_4_100lo0x4s8c.R.inc(81);insertChild(sibling.getFirstLeafKey(), sibling);
				}
				}__CLR4_4_100lo0x4s8c.R.inc(82);if ((((root.keyNumber() == 0)&&(__CLR4_4_100lo0x4s8c.R.iget(83)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(84)==0&false)))
					{__CLR4_4_100lo0x4s8c.R.inc(85);root = left;
			}}
		}}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		void insertValue(K key, V value) {try{__CLR4_4_100lo0x4s8c.R.inc(86);
			__CLR4_4_100lo0x4s8c.R.inc(87);Node child = getChild(key);
			__CLR4_4_100lo0x4s8c.R.inc(88);child.insertValue(key, value);
			__CLR4_4_100lo0x4s8c.R.inc(89);if ((((child.isOverflow())&&(__CLR4_4_100lo0x4s8c.R.iget(90)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(91)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(92);Node sibling = child.split();
				__CLR4_4_100lo0x4s8c.R.inc(93);insertChild(sibling.getFirstLeafKey(), sibling);
			}
			}__CLR4_4_100lo0x4s8c.R.inc(94);if ((((root.isOverflow())&&(__CLR4_4_100lo0x4s8c.R.iget(95)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(96)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(97);Node sibling = split();
				__CLR4_4_100lo0x4s8c.R.inc(98);InternalNode newRoot = new InternalNode();
				__CLR4_4_100lo0x4s8c.R.inc(99);newRoot.keys.add(sibling.getFirstLeafKey());
				__CLR4_4_100lo0x4s8c.R.inc(100);newRoot.children.add(this);
				__CLR4_4_100lo0x4s8c.R.inc(101);newRoot.children.add(sibling);
				__CLR4_4_100lo0x4s8c.R.inc(102);root = newRoot;
			}
		}}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		K getFirstLeafKey() {try{__CLR4_4_100lo0x4s8c.R.inc(103);
			__CLR4_4_100lo0x4s8c.R.inc(104);return children.get(0).getFirstLeafKey();
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		List<V> getRange(K key1, RangePolicy policy1, K key2,
				RangePolicy policy2) {try{__CLR4_4_100lo0x4s8c.R.inc(105);
			__CLR4_4_100lo0x4s8c.R.inc(106);return getChild(key1).getRange(key1, policy1, key2, policy2);
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		void merge(Node sibling) {try{__CLR4_4_100lo0x4s8c.R.inc(107);
			__CLR4_4_100lo0x4s8c.R.inc(108);@SuppressWarnings("unchecked")
			InternalNode node = (InternalNode) sibling;
			__CLR4_4_100lo0x4s8c.R.inc(109);keys.add(node.getFirstLeafKey());
			__CLR4_4_100lo0x4s8c.R.inc(110);keys.addAll(node.keys);
			__CLR4_4_100lo0x4s8c.R.inc(111);children.addAll(node.children);

		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		Node split() {try{__CLR4_4_100lo0x4s8c.R.inc(112);
			__CLR4_4_100lo0x4s8c.R.inc(113);int from = keyNumber() / 2 + 1, to = keyNumber();
			__CLR4_4_100lo0x4s8c.R.inc(114);InternalNode sibling = new InternalNode();
			__CLR4_4_100lo0x4s8c.R.inc(115);sibling.keys.addAll(keys.subList(from, to));
			__CLR4_4_100lo0x4s8c.R.inc(116);sibling.children.addAll(children.subList(from, to + 1));

			__CLR4_4_100lo0x4s8c.R.inc(117);keys.subList(from - 1, to).clear();
			__CLR4_4_100lo0x4s8c.R.inc(118);children.subList(from, to + 1).clear();

			__CLR4_4_100lo0x4s8c.R.inc(119);return sibling;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		boolean isOverflow() {try{__CLR4_4_100lo0x4s8c.R.inc(120);
			__CLR4_4_100lo0x4s8c.R.inc(121);return children.size() > branchingFactor;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		boolean isUnderflow() {try{__CLR4_4_100lo0x4s8c.R.inc(122);
			__CLR4_4_100lo0x4s8c.R.inc(123);return children.size() < (branchingFactor + 1) / 2;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		Node getChild(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(124);
			__CLR4_4_100lo0x4s8c.R.inc(125);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(126);int childIndex = (((loc >= 0 )&&(__CLR4_4_100lo0x4s8c.R.iget(127)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(128)==0&false))? loc + 1 : -loc - 1;
			__CLR4_4_100lo0x4s8c.R.inc(129);return children.get(childIndex);
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		void deleteChild(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(130);
			__CLR4_4_100lo0x4s8c.R.inc(131);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(132);if ((((loc >= 0)&&(__CLR4_4_100lo0x4s8c.R.iget(133)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(134)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(135);keys.remove(loc);
				__CLR4_4_100lo0x4s8c.R.inc(136);children.remove(loc + 1);
			}
		}}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		void insertChild(K key, Node child) {try{__CLR4_4_100lo0x4s8c.R.inc(137);
			__CLR4_4_100lo0x4s8c.R.inc(138);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(139);int childIndex = (((loc >= 0 )&&(__CLR4_4_100lo0x4s8c.R.iget(140)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(141)==0&false))? loc + 1 : -loc - 1;
			__CLR4_4_100lo0x4s8c.R.inc(142);if ((((loc >= 0)&&(__CLR4_4_100lo0x4s8c.R.iget(143)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(144)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(145);children.set(childIndex, child);
			} }else {{
				__CLR4_4_100lo0x4s8c.R.inc(146);keys.add(childIndex, key);
				__CLR4_4_100lo0x4s8c.R.inc(147);children.add(childIndex + 1, child);
			}
		}}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		Node getChildLeftSibling(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(148);
			__CLR4_4_100lo0x4s8c.R.inc(149);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(150);int childIndex = (((loc >= 0 )&&(__CLR4_4_100lo0x4s8c.R.iget(151)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(152)==0&false))? loc + 1 : -loc - 1;
			__CLR4_4_100lo0x4s8c.R.inc(153);if ((((childIndex > 0)&&(__CLR4_4_100lo0x4s8c.R.iget(154)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(155)==0&false)))
				{__CLR4_4_100lo0x4s8c.R.inc(156);return children.get(childIndex - 1);

			}__CLR4_4_100lo0x4s8c.R.inc(157);return null;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		Node getChildRightSibling(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(158);
			__CLR4_4_100lo0x4s8c.R.inc(159);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(160);int childIndex = (((loc >= 0 )&&(__CLR4_4_100lo0x4s8c.R.iget(161)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(162)==0&false))? loc + 1 : -loc - 1;
			__CLR4_4_100lo0x4s8c.R.inc(163);if ((((childIndex < keyNumber())&&(__CLR4_4_100lo0x4s8c.R.iget(164)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(165)==0&false)))
				{__CLR4_4_100lo0x4s8c.R.inc(166);return children.get(childIndex + 1);

			}__CLR4_4_100lo0x4s8c.R.inc(167);return null;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}
	}

	private class LeafNode extends Node {
		List<V> values;
		LeafNode next;

		LeafNode() {try{__CLR4_4_100lo0x4s8c.R.inc(168);
			__CLR4_4_100lo0x4s8c.R.inc(169);keys = new ArrayList<K>();
			__CLR4_4_100lo0x4s8c.R.inc(170);values = new ArrayList<V>();
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		V getValue(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(171);
			__CLR4_4_100lo0x4s8c.R.inc(172);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(173);return (((loc >= 0 )&&(__CLR4_4_100lo0x4s8c.R.iget(174)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(175)==0&false))? values.get(loc) : null;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		void deleteValue(K key) {try{__CLR4_4_100lo0x4s8c.R.inc(176);
			__CLR4_4_100lo0x4s8c.R.inc(177);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(178);if ((((loc >= 0)&&(__CLR4_4_100lo0x4s8c.R.iget(179)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(180)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(181);keys.remove(loc);
				__CLR4_4_100lo0x4s8c.R.inc(182);values.remove(loc);
			}
		}}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		void insertValue(K key, V value) {try{__CLR4_4_100lo0x4s8c.R.inc(183);
			__CLR4_4_100lo0x4s8c.R.inc(184);int loc = Collections.binarySearch(keys, key);
			__CLR4_4_100lo0x4s8c.R.inc(185);int valueIndex = (((loc >= 0 )&&(__CLR4_4_100lo0x4s8c.R.iget(186)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(187)==0&false))? loc : -loc - 1;
			__CLR4_4_100lo0x4s8c.R.inc(188);if ((((loc >= 0)&&(__CLR4_4_100lo0x4s8c.R.iget(189)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(190)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(191);values.set(valueIndex, value);
			} }else {{
				__CLR4_4_100lo0x4s8c.R.inc(192);keys.add(valueIndex, key);
				__CLR4_4_100lo0x4s8c.R.inc(193);values.add(valueIndex, value);
			}
			}__CLR4_4_100lo0x4s8c.R.inc(194);if ((((root.isOverflow())&&(__CLR4_4_100lo0x4s8c.R.iget(195)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(196)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(197);Node sibling = split();
				__CLR4_4_100lo0x4s8c.R.inc(198);InternalNode newRoot = new InternalNode();
				__CLR4_4_100lo0x4s8c.R.inc(199);newRoot.keys.add(sibling.getFirstLeafKey());
				__CLR4_4_100lo0x4s8c.R.inc(200);newRoot.children.add(this);
				__CLR4_4_100lo0x4s8c.R.inc(201);newRoot.children.add(sibling);
				__CLR4_4_100lo0x4s8c.R.inc(202);root = newRoot;
			}
		}}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		K getFirstLeafKey() {try{__CLR4_4_100lo0x4s8c.R.inc(203);
			__CLR4_4_100lo0x4s8c.R.inc(204);return keys.get(0);
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		List<V> getRange(K key1, RangePolicy policy1, K key2,
				RangePolicy policy2) {try{__CLR4_4_100lo0x4s8c.R.inc(205);
			__CLR4_4_100lo0x4s8c.R.inc(206);List<V> result = new LinkedList<V>();
			__CLR4_4_100lo0x4s8c.R.inc(207);LeafNode node = this;
			__CLR4_4_100lo0x4s8c.R.inc(208);while ((((node != null)&&(__CLR4_4_100lo0x4s8c.R.iget(209)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(210)==0&false))) {{
				__CLR4_4_100lo0x4s8c.R.inc(211);Iterator<K> kIt = node.keys.iterator();
				__CLR4_4_100lo0x4s8c.R.inc(212);Iterator<V> vIt = node.values.iterator();
				__CLR4_4_100lo0x4s8c.R.inc(213);while ((((kIt.hasNext())&&(__CLR4_4_100lo0x4s8c.R.iget(214)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(215)==0&false))) {{
					__CLR4_4_100lo0x4s8c.R.inc(216);K key = kIt.next();
					__CLR4_4_100lo0x4s8c.R.inc(217);V value = vIt.next();
					__CLR4_4_100lo0x4s8c.R.inc(218);int cmp1 = key.compareTo(key1);
					__CLR4_4_100lo0x4s8c.R.inc(219);int cmp2 = key.compareTo(key2);
					__CLR4_4_100lo0x4s8c.R.inc(220);if ((((((policy1 == RangePolicy.EXCLUSIVE && cmp1 > 0) || (policy1 == RangePolicy.INCLUSIVE && cmp1 >= 0))
							&& ((policy2 == RangePolicy.EXCLUSIVE && cmp2 < 0) || (policy2 == RangePolicy.INCLUSIVE && cmp2 <= 0)))&&(__CLR4_4_100lo0x4s8c.R.iget(221)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(222)==0&false)))
						{__CLR4_4_100lo0x4s8c.R.inc(223);result.add(value);
					}else {__CLR4_4_100lo0x4s8c.R.inc(224);if (((((policy2 == RangePolicy.EXCLUSIVE && cmp2 >= 0)
							|| (policy2 == RangePolicy.INCLUSIVE && cmp2 > 0))&&(__CLR4_4_100lo0x4s8c.R.iget(225)!=0|true))||(__CLR4_4_100lo0x4s8c.R.iget(226)==0&false)))
						{__CLR4_4_100lo0x4s8c.R.inc(227);return result;
				}}}
				}__CLR4_4_100lo0x4s8c.R.inc(228);node = node.next;
			}
			}__CLR4_4_100lo0x4s8c.R.inc(229);return result;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		void merge(Node sibling) {try{__CLR4_4_100lo0x4s8c.R.inc(230);
			__CLR4_4_100lo0x4s8c.R.inc(231);@SuppressWarnings("unchecked")
			LeafNode node = (LeafNode) sibling;
			__CLR4_4_100lo0x4s8c.R.inc(232);keys.addAll(node.keys);
			__CLR4_4_100lo0x4s8c.R.inc(233);values.addAll(node.values);
			__CLR4_4_100lo0x4s8c.R.inc(234);next = node.next;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		Node split() {try{__CLR4_4_100lo0x4s8c.R.inc(235);
			__CLR4_4_100lo0x4s8c.R.inc(236);LeafNode sibling = new LeafNode();
			__CLR4_4_100lo0x4s8c.R.inc(237);int from = (keyNumber() + 1) / 2, to = keyNumber();
			__CLR4_4_100lo0x4s8c.R.inc(238);sibling.keys.addAll(keys.subList(from, to));
			__CLR4_4_100lo0x4s8c.R.inc(239);sibling.values.addAll(values.subList(from, to));

			__CLR4_4_100lo0x4s8c.R.inc(240);keys.subList(from, to).clear();
			__CLR4_4_100lo0x4s8c.R.inc(241);values.subList(from, to).clear();

			__CLR4_4_100lo0x4s8c.R.inc(242);sibling.next = next;
			__CLR4_4_100lo0x4s8c.R.inc(243);next = sibling;
			__CLR4_4_100lo0x4s8c.R.inc(244);return sibling;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		boolean isOverflow() {try{__CLR4_4_100lo0x4s8c.R.inc(245);
			__CLR4_4_100lo0x4s8c.R.inc(246);return values.size() > branchingFactor - 1;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}

		@Override
		boolean isUnderflow() {try{__CLR4_4_100lo0x4s8c.R.inc(247);
			__CLR4_4_100lo0x4s8c.R.inc(248);return values.size() < branchingFactor / 2;
		}finally{__CLR4_4_100lo0x4s8c.R.flushNeeded();}}
	}
}
