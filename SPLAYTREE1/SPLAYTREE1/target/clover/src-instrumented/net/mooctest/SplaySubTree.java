/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

public class SplaySubTree<T extends Comparable<T>> {public static class __CLR4_4_100ll4usq3b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0038\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0050\u004c\u0041\u0059\u0054\u0052\u0045\u0045\u0031\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691653466433L,8589935092L,498,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private T data;
	private SplaySubTree<T> left, right, parent;
	private long size; // number of nodes in tree
	private int count;

	/**
	 * @param node
	 *            - If node==null then size will be 0 otherwise node will be in the
	 *            tree and size will be 1
	 */
	public SplaySubTree(T node) {try{__CLR4_4_100ll4usq3b.R.inc(0);
		__CLR4_4_100ll4usq3b.R.inc(1);data = node;
		__CLR4_4_100ll4usq3b.R.inc(2);if ((((node != null)&&(__CLR4_4_100ll4usq3b.R.iget(3)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(4)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(5);size = count = 1;
		}
	}}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}
	
	

	public String toString() {try{__CLR4_4_100ll4usq3b.R.inc(6);
		__CLR4_4_100ll4usq3b.R.inc(7);String lft = "";
		__CLR4_4_100ll4usq3b.R.inc(8);String rght = "";
		__CLR4_4_100ll4usq3b.R.inc(9);String myData = " data=" + data;
		__CLR4_4_100ll4usq3b.R.inc(10);if ((((left != null)&&(__CLR4_4_100ll4usq3b.R.iget(11)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(12)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(13);myData += " left=" + left.data;
			__CLR4_4_100ll4usq3b.R.inc(14);lft = left.toString();
		} }else {{
			__CLR4_4_100ll4usq3b.R.inc(15);myData += " left= null";
		}
		}__CLR4_4_100ll4usq3b.R.inc(16);if ((((right != null)&&(__CLR4_4_100ll4usq3b.R.iget(17)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(18)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(19);myData += " right=" + right.data;
			__CLR4_4_100ll4usq3b.R.inc(20);rght = right.toString();
		} }else {{
			__CLR4_4_100ll4usq3b.R.inc(21);myData += " right null";
		}
		}__CLR4_4_100ll4usq3b.R.inc(22);myData += " sz="+size + " cnt="+count;
		__CLR4_4_100ll4usq3b.R.inc(23);return myData + "\n" + lft + rght;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	public T getData() {try{__CLR4_4_100ll4usq3b.R.inc(24);
		__CLR4_4_100ll4usq3b.R.inc(25);return data;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @param index
	 *            - of the node to search for.
	 * @return - null if index<=0 or index>=size otherwise SubTree at index.
	 */
	public SplaySubTree<T> get(long index) {try{__CLR4_4_100ll4usq3b.R.inc(26);
		__CLR4_4_100ll4usq3b.R.inc(27);if ((((index > size || index < 0)&&(__CLR4_4_100ll4usq3b.R.iget(28)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(29)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(30);return null;
		}__CLR4_4_100ll4usq3b.R.inc(31);long cS = 1;
		__CLR4_4_100ll4usq3b.R.inc(32);SplaySubTree<T> cT = this;
		__CLR4_4_100ll4usq3b.R.inc(33);if ((((cT.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(34)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(35)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(36);cS += cT.left.size;
		}__CLR4_4_100ll4usq3b.R.inc(37);while ((((cS != index)&&(__CLR4_4_100ll4usq3b.R.iget(38)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(39)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(40);if ((((cS > index)&&(__CLR4_4_100ll4usq3b.R.iget(41)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(42)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(43);cS--;
				__CLR4_4_100ll4usq3b.R.inc(44);cT = cT.left;
				__CLR4_4_100ll4usq3b.R.inc(45);if ((((cT != null && cT.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(46)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(47)==0&false)))
					{__CLR4_4_100ll4usq3b.R.inc(48);cS -= cT.right.size;
			}} }else {{
				__CLR4_4_100ll4usq3b.R.inc(49);cS++;
				__CLR4_4_100ll4usq3b.R.inc(50);cT = cT.right;
				__CLR4_4_100ll4usq3b.R.inc(51);if ((((cT != null && cT.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(52)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(53)==0&false)))
					{__CLR4_4_100ll4usq3b.R.inc(54);cS += cT.left.size;
			}}
		}}
		}__CLR4_4_100ll4usq3b.R.inc(55);return cT;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @return - the number of nodes in the tree.
	 */
	public long size() {try{__CLR4_4_100ll4usq3b.R.inc(56);
		__CLR4_4_100ll4usq3b.R.inc(57);return size;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @param node
	 *            - to search for.
	 * @return - the index of node. All nodes are ordered according to the
	 *         compareTo(T) method.
	 * 
	 */
	public long indexOf(T node) {try{__CLR4_4_100ll4usq3b.R.inc(58);
		__CLR4_4_100ll4usq3b.R.inc(59);if ((((node == null)&&(__CLR4_4_100ll4usq3b.R.iget(60)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(61)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(62);return -1;
		}__CLR4_4_100ll4usq3b.R.inc(63);long cI = 1;
		__CLR4_4_100ll4usq3b.R.inc(64);SplaySubTree<T> cT = this;
		__CLR4_4_100ll4usq3b.R.inc(65);if ((((cT.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(66)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(67)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(68);cI += cT.left.size;
		}__CLR4_4_100ll4usq3b.R.inc(69);while ((((!cT.data.equals(node))&&(__CLR4_4_100ll4usq3b.R.iget(70)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(71)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(72);if ((((cT.data.compareTo(node) > 0)&&(__CLR4_4_100ll4usq3b.R.iget(73)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(74)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(75);cI--;
				__CLR4_4_100ll4usq3b.R.inc(76);cT = cT.left;
				__CLR4_4_100ll4usq3b.R.inc(77);if ((((cT != null && cT.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(78)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(79)==0&false)))
					{__CLR4_4_100ll4usq3b.R.inc(80);cI -= cT.right.size;
			}} }else {{
				__CLR4_4_100ll4usq3b.R.inc(81);cI++;
				__CLR4_4_100ll4usq3b.R.inc(82);cT = cT.right;
				__CLR4_4_100ll4usq3b.R.inc(83);if ((((cT != null && cT.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(84)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(85)==0&false)))
					{__CLR4_4_100ll4usq3b.R.inc(86);cI += cT.left.size;
			}}
			}__CLR4_4_100ll4usq3b.R.inc(87);if ((((cT == null)&&(__CLR4_4_100ll4usq3b.R.iget(88)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(89)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(90);return -1;
		}}

		}__CLR4_4_100ll4usq3b.R.inc(91);return cI;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @param node
	 *            - is added to the tree. If node is null tree is unchanged.
	 * @return - New root of the tree.
	 */
	public SplaySubTree<T> add(T node) {try{__CLR4_4_100ll4usq3b.R.inc(92);
		__CLR4_4_100ll4usq3b.R.inc(93);if ((((node == null)&&(__CLR4_4_100ll4usq3b.R.iget(94)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(95)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(96);return this;
		}__CLR4_4_100ll4usq3b.R.inc(97);if ((((this.data == null)&&(__CLR4_4_100ll4usq3b.R.iget(98)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(99)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(100);return new SplaySubTree<T>(node);
		}__CLR4_4_100ll4usq3b.R.inc(101);SplaySubTree<T> current = this;
		__CLR4_4_100ll4usq3b.R.inc(102);SplaySubTree<T> child = null;

		__CLR4_4_100ll4usq3b.R.inc(103);if ((((this.data.compareTo(node) < 0)&&(__CLR4_4_100ll4usq3b.R.iget(104)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(105)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(106);child = this.right;
		}else {__CLR4_4_100ll4usq3b.R.inc(107);if((((this.data.compareTo(node)>0)&&(__CLR4_4_100ll4usq3b.R.iget(108)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(109)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(110);child = this.left;
		}}__CLR4_4_100ll4usq3b.R.inc(111);while ((((child != null && current.data.compareTo(node)!=0)&&(__CLR4_4_100ll4usq3b.R.iget(112)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(113)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(114);current = child;
			__CLR4_4_100ll4usq3b.R.inc(115);if ((((current.data.compareTo(node) < 0)&&(__CLR4_4_100ll4usq3b.R.iget(116)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(117)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(118);child = current.right;
			}else {__CLR4_4_100ll4usq3b.R.inc(119);if((((current.data.compareTo(node)>0)&&(__CLR4_4_100ll4usq3b.R.iget(120)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(121)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(122);child = current.left;
		}}}
		
		}__CLR4_4_100ll4usq3b.R.inc(123);SplaySubTree<T> newNode = new SplaySubTree<T>(node);
		__CLR4_4_100ll4usq3b.R.inc(124);if ((((current.data.compareTo(node) < 0)&&(__CLR4_4_100ll4usq3b.R.iget(125)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(126)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(127);current.right = newNode;
		} }else {__CLR4_4_100ll4usq3b.R.inc(128);if((((current.data.compareTo(node)>0)&&(__CLR4_4_100ll4usq3b.R.iget(129)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(130)==0&false))){{
			__CLR4_4_100ll4usq3b.R.inc(131);current.left = newNode;
		}}else {{
			__CLR4_4_100ll4usq3b.R.inc(132);current.size++;
			__CLR4_4_100ll4usq3b.R.inc(133);current.count++;
			__CLR4_4_100ll4usq3b.R.inc(134);newNode = current;
			__CLR4_4_100ll4usq3b.R.inc(135);current = newNode.parent;
		}
		}}__CLR4_4_100ll4usq3b.R.inc(136);newNode.parent = current;
		__CLR4_4_100ll4usq3b.R.inc(137);if ((((newNode.splay())&&(__CLR4_4_100ll4usq3b.R.iget(138)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(139)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(140);return newNode;
		}__CLR4_4_100ll4usq3b.R.inc(141);return this;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @param node
	 *            - is removed from the tree. If node is null tree is unchanged.
	 * @return - New root of the tree.
	 */
	public SplaySubTree<T> remove(T node) {try{__CLR4_4_100ll4usq3b.R.inc(142);
		__CLR4_4_100ll4usq3b.R.inc(143);if ((((node == null)&&(__CLR4_4_100ll4usq3b.R.iget(144)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(145)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(146);return this;
		}__CLR4_4_100ll4usq3b.R.inc(147);SplaySubTree<T> x = find(node);
		__CLR4_4_100ll4usq3b.R.inc(148);if ((((x == null)&&(__CLR4_4_100ll4usq3b.R.iget(149)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(150)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(151);return this;
		}__CLR4_4_100ll4usq3b.R.inc(152);if((((x.data.equals(node))&&(__CLR4_4_100ll4usq3b.R.iget(153)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(154)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(155);x.count--;
			__CLR4_4_100ll4usq3b.R.inc(156);x.size--;
			__CLR4_4_100ll4usq3b.R.inc(157);if((((size>0)&&(__CLR4_4_100ll4usq3b.R.iget(158)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(159)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(160);x.splay();
				__CLR4_4_100ll4usq3b.R.inc(161);return x;
			}
		}}
		// To delete a node x:
		// if x has no children remove it.

		}__CLR4_4_100ll4usq3b.R.inc(162);if ((((x.left == null && x.right == null)&&(__CLR4_4_100ll4usq3b.R.iget(163)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(164)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(165);if ((((x.parent != null)&&(__CLR4_4_100ll4usq3b.R.iget(166)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(167)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(168);if ((((x.parent.left == x)&&(__CLR4_4_100ll4usq3b.R.iget(169)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(170)==0&false))) {{
					__CLR4_4_100ll4usq3b.R.inc(171);parent.left = null;
				} }else
					{__CLR4_4_100ll4usq3b.R.inc(172);parent.right = null;
			}} }else
				{__CLR4_4_100ll4usq3b.R.inc(173);return new SplaySubTree(null);

		}}
		// if x has one child remove x, and put the child in place of x
		}__CLR4_4_100ll4usq3b.R.inc(174);if ((((x.left == null)&&(__CLR4_4_100ll4usq3b.R.iget(175)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(176)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(177);if ((((x.parent != null)&&(__CLR4_4_100ll4usq3b.R.iget(178)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(179)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(180);if ((((x.parent.left == x)&&(__CLR4_4_100ll4usq3b.R.iget(181)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(182)==0&false))) {{
					__CLR4_4_100ll4usq3b.R.inc(183);parent.left = x.right;
					__CLR4_4_100ll4usq3b.R.inc(184);x.right.parent = parent;
					__CLR4_4_100ll4usq3b.R.inc(185);x = x.right;
				} }else {{
					__CLR4_4_100ll4usq3b.R.inc(186);parent.right = x.right;
					__CLR4_4_100ll4usq3b.R.inc(187);x.right.parent = parent;
					__CLR4_4_100ll4usq3b.R.inc(188);x = x.right;
				}
			}} }else {{
				__CLR4_4_100ll4usq3b.R.inc(189);x.right.parent = null;
				__CLR4_4_100ll4usq3b.R.inc(190);return x.right;
			}
		}} }else {__CLR4_4_100ll4usq3b.R.inc(191);if ((((x.right == null)&&(__CLR4_4_100ll4usq3b.R.iget(192)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(193)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(194);if ((((x.parent != null)&&(__CLR4_4_100ll4usq3b.R.iget(195)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(196)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(197);if ((((x.parent.left == x)&&(__CLR4_4_100ll4usq3b.R.iget(198)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(199)==0&false))) {{
					__CLR4_4_100ll4usq3b.R.inc(200);parent.left = x.left;
					__CLR4_4_100ll4usq3b.R.inc(201);x.left.parent = parent;
					__CLR4_4_100ll4usq3b.R.inc(202);x = x.left;
				} }else {{
					__CLR4_4_100ll4usq3b.R.inc(203);parent.right = x.left;
					__CLR4_4_100ll4usq3b.R.inc(204);x.left.parent = parent;
					__CLR4_4_100ll4usq3b.R.inc(205);x = x.left;
				}
			}} }else {{
				__CLR4_4_100ll4usq3b.R.inc(206);x.left.parent = null;
				__CLR4_4_100ll4usq3b.R.inc(207);return x.left;
			}
		}} }else {{
			// if x has two children, swap its value with that of
			// the rightmost node of its left sub tree
			__CLR4_4_100ll4usq3b.R.inc(208);SplaySubTree<T> rmc = x.left;
			__CLR4_4_100ll4usq3b.R.inc(209);while ((((rmc.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(210)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(211)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(212);rmc = rmc.right;
			}__CLR4_4_100ll4usq3b.R.inc(213);x.data = rmc.data;
			// Then remove that node instead.
			__CLR4_4_100ll4usq3b.R.inc(214);rmc.left.parent = rmc.parent;
			__CLR4_4_100ll4usq3b.R.inc(215);if ((((rmc.parent == x)&&(__CLR4_4_100ll4usq3b.R.iget(216)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(217)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(218);x.left = rmc.left;
			} }else {{
				__CLR4_4_100ll4usq3b.R.inc(219);rmc.parent.right = rmc.left;
			}
			}__CLR4_4_100ll4usq3b.R.inc(220);x = rmc;
		}

		// After deletion, splay the parent of the removed node to the top of
		// the tree.
		}}__CLR4_4_100ll4usq3b.R.inc(221);x.splay();
		__CLR4_4_100ll4usq3b.R.inc(222);return x;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @param other
	 * @return
	 */
	public SplaySubTree<T> join(SplaySubTree<T> other) {try{__CLR4_4_100ll4usq3b.R.inc(223);
		__CLR4_4_100ll4usq3b.R.inc(224);return null;

	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @param node
	 * @return
	 */
	public SplaySubTree<T> split(T node) {try{__CLR4_4_100ll4usq3b.R.inc(225);
		__CLR4_4_100ll4usq3b.R.inc(226);return null;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * @param node
	 * @return
	 */
	public SplaySubTree<T> find(T node) {try{__CLR4_4_100ll4usq3b.R.inc(227);
		__CLR4_4_100ll4usq3b.R.inc(228);SplaySubTree<T> current = this;
		__CLR4_4_100ll4usq3b.R.inc(229);if ((((this.data == null)&&(__CLR4_4_100ll4usq3b.R.iget(230)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(231)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(232);return null;
		}__CLR4_4_100ll4usq3b.R.inc(233);while ((((current != null)&&(__CLR4_4_100ll4usq3b.R.iget(234)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(235)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(236);if ((((node.equals(current.data))&&(__CLR4_4_100ll4usq3b.R.iget(237)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(238)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(239);return current;
			}__CLR4_4_100ll4usq3b.R.inc(240);if ((((node.compareTo(current.data) < 0)&&(__CLR4_4_100ll4usq3b.R.iget(241)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(242)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(243);current = current.left;
			}else
				{__CLR4_4_100ll4usq3b.R.inc(244);current = current.right;
		}}
		}__CLR4_4_100ll4usq3b.R.inc(245);return current;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * Assuming this node is an interior or leaf node of a larger tree this method
	 * moves this node up to the root balancing the tree in the process
	 */
	public boolean splay() {try{__CLR4_4_100ll4usq3b.R.inc(246);
		// if (Math.random() < 0.5)
		// return false;   // if putting this back in, be careful about updating size when adding and removing nodes
		__CLR4_4_100ll4usq3b.R.inc(247);while ((((this.parent != null)&&(__CLR4_4_100ll4usq3b.R.iget(248)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(249)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(250);SplaySubTree<T> p = this.parent;
			__CLR4_4_100ll4usq3b.R.inc(251);SplaySubTree<T> g = p.parent;
			__CLR4_4_100ll4usq3b.R.inc(252);if ((((g == null && this == p.left)&&(__CLR4_4_100ll4usq3b.R.iget(253)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(254)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(255);zig();
			} }else {__CLR4_4_100ll4usq3b.R.inc(256);if ((((g == null && this == p.right)&&(__CLR4_4_100ll4usq3b.R.iget(257)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(258)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(259);zag();
			} }else {__CLR4_4_100ll4usq3b.R.inc(260);if ((((p.left == this && g.left == p)&&(__CLR4_4_100ll4usq3b.R.iget(261)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(262)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(263);zigzig();
			} }else {__CLR4_4_100ll4usq3b.R.inc(264);if ((((p.right == this && g.right == p)&&(__CLR4_4_100ll4usq3b.R.iget(265)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(266)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(267);zagzag();
			} }else {__CLR4_4_100ll4usq3b.R.inc(268);if ((((p.right == this && g.left == p)&&(__CLR4_4_100ll4usq3b.R.iget(269)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(270)==0&false))) {{
				__CLR4_4_100ll4usq3b.R.inc(271);zigzag();
			} }else {{
				__CLR4_4_100ll4usq3b.R.inc(272);zagzig();
			}
		}}}}}}
		}__CLR4_4_100ll4usq3b.R.inc(273);return true;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * This is a helper method used in the splay() operation
	 */
	private void zig() {try{__CLR4_4_100ll4usq3b.R.inc(274);
		__CLR4_4_100ll4usq3b.R.inc(275);SplaySubTree<T> b = this.right;
		__CLR4_4_100ll4usq3b.R.inc(276);SplaySubTree<T> p = this.parent;

		__CLR4_4_100ll4usq3b.R.inc(277);this.right = p;
		__CLR4_4_100ll4usq3b.R.inc(278);p.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(279);p.left = b;
		__CLR4_4_100ll4usq3b.R.inc(280);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(281)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(282)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(283);b.parent = p;
		}__CLR4_4_100ll4usq3b.R.inc(284);this.parent = null;
		__CLR4_4_100ll4usq3b.R.inc(285);p.size = p.count;
		__CLR4_4_100ll4usq3b.R.inc(286);if ((((p.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(287)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(288)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(289);p.size += p.right.size;
		}__CLR4_4_100ll4usq3b.R.inc(290);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(291)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(292)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(293);p.size += b.size;
		}__CLR4_4_100ll4usq3b.R.inc(294);this.size = p.size + this.count;
		__CLR4_4_100ll4usq3b.R.inc(295);if ((((this.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(296)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(297)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(298);this.size += this.left.size;
	}}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * This is a helper method used in the splay() operation
	 */
	private void zag() {try{__CLR4_4_100ll4usq3b.R.inc(299);
		__CLR4_4_100ll4usq3b.R.inc(300);SplaySubTree<T> b = this.left;
		__CLR4_4_100ll4usq3b.R.inc(301);SplaySubTree<T> p = this.parent;

		__CLR4_4_100ll4usq3b.R.inc(302);this.left = p;
		__CLR4_4_100ll4usq3b.R.inc(303);p.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(304);p.right = b;
		__CLR4_4_100ll4usq3b.R.inc(305);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(306)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(307)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(308);b.parent = p;
		}__CLR4_4_100ll4usq3b.R.inc(309);this.parent = null;
		__CLR4_4_100ll4usq3b.R.inc(310);p.size = p.count;
		__CLR4_4_100ll4usq3b.R.inc(311);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(312)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(313)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(314);p.size += b.size;
		}__CLR4_4_100ll4usq3b.R.inc(315);if ((((p.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(316)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(317)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(318);p.size += p.left.size;
		}__CLR4_4_100ll4usq3b.R.inc(319);this.size = p.size + this.count;
		__CLR4_4_100ll4usq3b.R.inc(320);if ((((this.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(321)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(322)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(323);this.size += this.right.size;
	}}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * This is a helper method used by zigzig, zagzag, zigzag, zagzig This "fixes"
	 * the great grandparent
	 */
	private void fixGG(SplaySubTree<T> g) {try{__CLR4_4_100ll4usq3b.R.inc(324);
		__CLR4_4_100ll4usq3b.R.inc(325);SplaySubTree<T> gg = g.parent;
		__CLR4_4_100ll4usq3b.R.inc(326);if ((((gg != null)&&(__CLR4_4_100ll4usq3b.R.iget(327)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(328)==0&false))) {{
			__CLR4_4_100ll4usq3b.R.inc(329);if ((((g == gg.left)&&(__CLR4_4_100ll4usq3b.R.iget(330)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(331)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(332);gg.left = this;
			}__CLR4_4_100ll4usq3b.R.inc(333);if ((((g == gg.right)&&(__CLR4_4_100ll4usq3b.R.iget(334)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(335)==0&false)))
				{__CLR4_4_100ll4usq3b.R.inc(336);gg.right = this;
		}}
		}__CLR4_4_100ll4usq3b.R.inc(337);this.parent = gg;
		// might need to update size
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * This is a helper method used in the splay() operation
	 */
	private void zigzig() {try{__CLR4_4_100ll4usq3b.R.inc(338);
		__CLR4_4_100ll4usq3b.R.inc(339);SplaySubTree<T> g = parent.parent;
		__CLR4_4_100ll4usq3b.R.inc(340);SplaySubTree<T> b = this.right;
		__CLR4_4_100ll4usq3b.R.inc(341);SplaySubTree<T> p = this.parent;
		__CLR4_4_100ll4usq3b.R.inc(342);SplaySubTree<T> c = p.right;
		__CLR4_4_100ll4usq3b.R.inc(343);fixGG(g);

		__CLR4_4_100ll4usq3b.R.inc(344);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(345)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(346)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(347);b.parent = p;
		}__CLR4_4_100ll4usq3b.R.inc(348);p.left = b;
		__CLR4_4_100ll4usq3b.R.inc(349);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(350)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(351)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(352);c.parent = g;
		}__CLR4_4_100ll4usq3b.R.inc(353);g.left = c;
		__CLR4_4_100ll4usq3b.R.inc(354);g.parent = p;
		__CLR4_4_100ll4usq3b.R.inc(355);p.right = g;
		__CLR4_4_100ll4usq3b.R.inc(356);p.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(357);this.right = p;

		__CLR4_4_100ll4usq3b.R.inc(358);g.size = g.count;
		__CLR4_4_100ll4usq3b.R.inc(359);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(360)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(361)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(362);g.size += c.size;
		}__CLR4_4_100ll4usq3b.R.inc(363);if ((((g.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(364)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(365)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(366);g.size += g.right.size;
		}__CLR4_4_100ll4usq3b.R.inc(367);p.size = p.count;
		__CLR4_4_100ll4usq3b.R.inc(368);if ((((g != null)&&(__CLR4_4_100ll4usq3b.R.iget(369)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(370)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(371);p.size += g.size;
		}__CLR4_4_100ll4usq3b.R.inc(372);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(373)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(374)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(375);p.size += b.size;
		}__CLR4_4_100ll4usq3b.R.inc(376);this.size = p.size + this.count;
		__CLR4_4_100ll4usq3b.R.inc(377);if ((((this.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(378)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(379)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(380);this.size += this.left.size;
	}}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * This is a helper method used in the splay() operation
	 */
	private void zagzag() {try{__CLR4_4_100ll4usq3b.R.inc(381);
		__CLR4_4_100ll4usq3b.R.inc(382);SplaySubTree<T> g = parent.parent;
		__CLR4_4_100ll4usq3b.R.inc(383);SplaySubTree<T> b = this.left;
		__CLR4_4_100ll4usq3b.R.inc(384);SplaySubTree<T> p = this.parent;
		__CLR4_4_100ll4usq3b.R.inc(385);SplaySubTree<T> c = p.left;

		__CLR4_4_100ll4usq3b.R.inc(386);fixGG(g);
		__CLR4_4_100ll4usq3b.R.inc(387);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(388)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(389)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(390);b.parent = p;
		// above line throws java.lang.NullPointerException

		}__CLR4_4_100ll4usq3b.R.inc(391);p.right = b;
		__CLR4_4_100ll4usq3b.R.inc(392);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(393)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(394)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(395);c.parent = g;
		}__CLR4_4_100ll4usq3b.R.inc(396);g.right = c;
		__CLR4_4_100ll4usq3b.R.inc(397);g.parent = p;
		__CLR4_4_100ll4usq3b.R.inc(398);p.left = g;
		__CLR4_4_100ll4usq3b.R.inc(399);p.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(400);this.left = p;
		__CLR4_4_100ll4usq3b.R.inc(401);g.size = g.count;
		__CLR4_4_100ll4usq3b.R.inc(402);if ((((g.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(403)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(404)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(405);g.size += g.left.size;
		}__CLR4_4_100ll4usq3b.R.inc(406);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(407)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(408)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(409);g.size += c.size;
		}__CLR4_4_100ll4usq3b.R.inc(410);p.size = g.size + p.count;
		__CLR4_4_100ll4usq3b.R.inc(411);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(412)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(413)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(414);p.size += b.size;
		}__CLR4_4_100ll4usq3b.R.inc(415);this.size = p.size + this.count;
		__CLR4_4_100ll4usq3b.R.inc(416);if ((((this.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(417)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(418)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(419);this.size += this.right.size;
	}}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * This is a helper method used in the splay() operation
	 */
	private void zigzag() {try{__CLR4_4_100ll4usq3b.R.inc(420);
		__CLR4_4_100ll4usq3b.R.inc(421);SplaySubTree<T> g = parent.parent;
		__CLR4_4_100ll4usq3b.R.inc(422);SplaySubTree<T> b = this.left;
		__CLR4_4_100ll4usq3b.R.inc(423);SplaySubTree<T> p = this.parent;
		__CLR4_4_100ll4usq3b.R.inc(424);SplaySubTree<T> c = this.right;

		__CLR4_4_100ll4usq3b.R.inc(425);fixGG(g);
		__CLR4_4_100ll4usq3b.R.inc(426);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(427)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(428)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(429);b.parent = p;
		}__CLR4_4_100ll4usq3b.R.inc(430);p.right = b;
		__CLR4_4_100ll4usq3b.R.inc(431);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(432)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(433)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(434);c.parent = g;
		}__CLR4_4_100ll4usq3b.R.inc(435);g.left = c;
		__CLR4_4_100ll4usq3b.R.inc(436);p.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(437);this.left = p;
		__CLR4_4_100ll4usq3b.R.inc(438);g.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(439);this.right = g;
		__CLR4_4_100ll4usq3b.R.inc(440);g.size = g.count;
		__CLR4_4_100ll4usq3b.R.inc(441);if ((((g.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(442)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(443)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(444);g.size += g.right.size;
		}__CLR4_4_100ll4usq3b.R.inc(445);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(446)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(447)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(448);g.size += c.size;
		}__CLR4_4_100ll4usq3b.R.inc(449);p.size = p.count;
		__CLR4_4_100ll4usq3b.R.inc(450);if ((((p.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(451)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(452)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(453);p.size += p.left.size;
		}__CLR4_4_100ll4usq3b.R.inc(454);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(455)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(456)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(457);p.size += b.size;
		}__CLR4_4_100ll4usq3b.R.inc(458);this.size = g.size + p.size + this.count;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

	/**
	 * This is a helper method used in the splay() operation
	 */
	private void zagzig() {try{__CLR4_4_100ll4usq3b.R.inc(459);

		__CLR4_4_100ll4usq3b.R.inc(460);SplaySubTree<T> g = parent.parent;
		__CLR4_4_100ll4usq3b.R.inc(461);SplaySubTree<T> b = this.right;
		__CLR4_4_100ll4usq3b.R.inc(462);SplaySubTree<T> p = this.parent;
		__CLR4_4_100ll4usq3b.R.inc(463);SplaySubTree<T> c = this.left;
		__CLR4_4_100ll4usq3b.R.inc(464);fixGG(g);
		__CLR4_4_100ll4usq3b.R.inc(465);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(466)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(467)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(468);b.parent = p;
		}__CLR4_4_100ll4usq3b.R.inc(469);p.left = b;
		__CLR4_4_100ll4usq3b.R.inc(470);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(471)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(472)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(473);c.parent = g;
		}__CLR4_4_100ll4usq3b.R.inc(474);g.right = c;
		__CLR4_4_100ll4usq3b.R.inc(475);p.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(476);this.right = p;
		__CLR4_4_100ll4usq3b.R.inc(477);g.parent = this;
		__CLR4_4_100ll4usq3b.R.inc(478);this.left = g;
		__CLR4_4_100ll4usq3b.R.inc(479);g.size = g.count;
		__CLR4_4_100ll4usq3b.R.inc(480);if ((((g.left != null)&&(__CLR4_4_100ll4usq3b.R.iget(481)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(482)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(483);g.size += g.left.size;
		}__CLR4_4_100ll4usq3b.R.inc(484);if ((((c != null)&&(__CLR4_4_100ll4usq3b.R.iget(485)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(486)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(487);g.size += c.size;
		}__CLR4_4_100ll4usq3b.R.inc(488);p.size = p.count;
		__CLR4_4_100ll4usq3b.R.inc(489);if ((((p.right != null)&&(__CLR4_4_100ll4usq3b.R.iget(490)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(491)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(492);p.size += p.right.size;
		}__CLR4_4_100ll4usq3b.R.inc(493);if ((((b != null)&&(__CLR4_4_100ll4usq3b.R.iget(494)!=0|true))||(__CLR4_4_100ll4usq3b.R.iget(495)==0&false)))
			{__CLR4_4_100ll4usq3b.R.inc(496);p.size += b.size;
		}__CLR4_4_100ll4usq3b.R.inc(497);this.size = g.size + p.size + this.count;
	}finally{__CLR4_4_100ll4usq3b.R.flushNeeded();}}

}
