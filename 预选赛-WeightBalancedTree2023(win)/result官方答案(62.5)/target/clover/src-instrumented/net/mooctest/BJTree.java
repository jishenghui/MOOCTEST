/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.List;

/** BJTree (skeletal) implementation.
*
* MODIFY THE FOLLOWING CLASS.
*
* You are free to make whatever changes you like or to create additional
* classes and files, but avoid reusing/modifying the other files given in this
* folder.
*/
public class BJTree<Key extends Comparable<Key>, Value> {public static class __CLR4_4_11c1clo0x9tox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946106729L,8589935092L,296,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	// Parameters used to determine when to rebalance (see Lecture 13 slides)
	
	private final float ALPHA = 0.66667f; // maximum allowed balance ratio
	private final float BETA = 0.25f; // max ratio filter for exemption
	
	// --------------------------------------------------
	// PUBLIC NODE CLASS
	// --------------------------------------------------
	
	public abstract class Node {
		Key key;
		float weight;
		float maxWeight;
		
		abstract Value find(Key x);
		abstract Node insert(Key x, Value v, float w) throws Exception;
		abstract Node delete(Key x) throws Exception;
		abstract ArrayList<String> getPreorderList(ArrayList<String> arr);
		abstract Value getMin();
		abstract Value getMax();
		abstract Value findDown(Key x);
		abstract Value findUp(Key x);
		abstract Node rebuild(Key x);
		abstract Node buildTree(List<Node> list);
		abstract ArrayList<Node> getExternalNodes(ArrayList<Node> arr);
	}
	
	// --------------------------------------------------
	// INTERNAL NODE CLASS 
	// --------------------------------------------------
	
	public class InternalNode extends Node {
		Node left;
		Node right;
		
		InternalNode(Key key, Node left, Node right) {try{__CLR4_4_11c1clo0x9tox.R.inc(48);
			__CLR4_4_11c1clo0x9tox.R.inc(49);this.key = key;
			__CLR4_4_11c1clo0x9tox.R.inc(50);this.left = left;
			__CLR4_4_11c1clo0x9tox.R.inc(51);this.right = right;
			__CLR4_4_11c1clo0x9tox.R.inc(52);this.weight = this.left.weight + this.right.weight;
			__CLR4_4_11c1clo0x9tox.R.inc(53);this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value find(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(54);
			__CLR4_4_11c1clo0x9tox.R.inc(55);if ((((x.compareTo(this.key) >= 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(56)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(57)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(58);return this.right.find(x);
			} }else {{ 		// compare < 0 
				__CLR4_4_11c1clo0x9tox.R.inc(59);return this.left.find(x);
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		private boolean balance() {try{__CLR4_4_11c1clo0x9tox.R.inc(60);
			__CLR4_4_11c1clo0x9tox.R.inc(61);float bal = Math.max(this.left.weight, this.right.weight) / this.weight;
			__CLR4_4_11c1clo0x9tox.R.inc(62);if ((((bal <= ALPHA)&&(__CLR4_4_11c1clo0x9tox.R.iget(63)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(64)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(65);return true;
			} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(66);return false;
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		private boolean maxR() {try{__CLR4_4_11c1clo0x9tox.R.inc(67);
			__CLR4_4_11c1clo0x9tox.R.inc(68);float maxRat = this.maxWeight / this.weight;
			__CLR4_4_11c1clo0x9tox.R.inc(69);if ((((maxRat > BETA)&&(__CLR4_4_11c1clo0x9tox.R.iget(70)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(71)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(72);return true;
			} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(73);return false;
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Node rebuild(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(74);
			__CLR4_4_11c1clo0x9tox.R.inc(75);if ((((!this.balance() && !this.maxR())&&(__CLR4_4_11c1clo0x9tox.R.iget(76)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(77)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(78);ArrayList<Node> nodes = new ArrayList<>();
				__CLR4_4_11c1clo0x9tox.R.inc(79);nodes = this.getExternalNodes(nodes);
				__CLR4_4_11c1clo0x9tox.R.inc(80);return this.buildTree(nodes);
			} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(81);int compare = x.compareTo(this.key);
				__CLR4_4_11c1clo0x9tox.R.inc(82);if ((((compare >= 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(83)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(84)==0&false))) {{
					__CLR4_4_11c1clo0x9tox.R.inc(85);this.right = this.right.rebuild(x);
				} }else {{ 		// compare < 0 
					__CLR4_4_11c1clo0x9tox.R.inc(86);this.left = this.left.rebuild(x);
				}
			}}
			}__CLR4_4_11c1clo0x9tox.R.inc(87);return this;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Node buildTree(List<Node> nodes) {try{__CLR4_4_11c1clo0x9tox.R.inc(88);
			//System.out.println(nodes.size());
			__CLR4_4_11c1clo0x9tox.R.inc(89);int k = nodes.size();
			//if (k == 0) {
			//	return null;
			//}
			__CLR4_4_11c1clo0x9tox.R.inc(90);if ((((k == 1)&&(__CLR4_4_11c1clo0x9tox.R.iget(91)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(92)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(93);return nodes.get(0);
			}
			}__CLR4_4_11c1clo0x9tox.R.inc(94);float totalWeight = 0;
			__CLR4_4_11c1clo0x9tox.R.inc(95);for (int i = 0; (((i < k)&&(__CLR4_4_11c1clo0x9tox.R.iget(96)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(97)==0&false)); i++) {{
				__CLR4_4_11c1clo0x9tox.R.inc(98);totalWeight += nodes.get(i).weight;
			}
			}__CLR4_4_11c1clo0x9tox.R.inc(99);int b = 0;
			__CLR4_4_11c1clo0x9tox.R.inc(100);float lWt = 0;
			__CLR4_4_11c1clo0x9tox.R.inc(101);float rWt = totalWeight;
			__CLR4_4_11c1clo0x9tox.R.inc(102);float deltaMin = totalWeight;
			
			__CLR4_4_11c1clo0x9tox.R.inc(103);for (int i = 0; (((i < k)&&(__CLR4_4_11c1clo0x9tox.R.iget(104)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(105)==0&false)); i++) {{
				__CLR4_4_11c1clo0x9tox.R.inc(106);lWt += nodes.get(i).weight; 
				__CLR4_4_11c1clo0x9tox.R.inc(107);rWt -= nodes.get(i).weight;
				__CLR4_4_11c1clo0x9tox.R.inc(108);float delta = Math.abs(rWt-lWt);
				__CLR4_4_11c1clo0x9tox.R.inc(109);if ((((delta < deltaMin)&&(__CLR4_4_11c1clo0x9tox.R.iget(110)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(111)==0&false))) {{
					__CLR4_4_11c1clo0x9tox.R.inc(112);b = i + 1;
					__CLR4_4_11c1clo0x9tox.R.inc(113);deltaMin = delta;
				}
			}}
			//System.out.println("b:" + b + " k:" + k);
			
			}__CLR4_4_11c1clo0x9tox.R.inc(114);Node L = this.buildTree(nodes.subList(0, b));
			__CLR4_4_11c1clo0x9tox.R.inc(115);Node R = this.buildTree(nodes.subList(b, k));
			
			__CLR4_4_11c1clo0x9tox.R.inc(116);return new InternalNode(nodes.get(b).key, L, R);
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		ArrayList<Node> getExternalNodes(ArrayList<Node> arr) {try{__CLR4_4_11c1clo0x9tox.R.inc(117);
			__CLR4_4_11c1clo0x9tox.R.inc(118);arr = this.left.getExternalNodes(arr);
			__CLR4_4_11c1clo0x9tox.R.inc(119);arr = this.right.getExternalNodes(arr);
			__CLR4_4_11c1clo0x9tox.R.inc(120);return arr;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Node insert(Key x, Value v, float w) throws Exception {try{__CLR4_4_11c1clo0x9tox.R.inc(121);
			__CLR4_4_11c1clo0x9tox.R.inc(122);if ((((x.compareTo(this.key) < 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(123)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(124)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(125);this.left = this.left.insert(x, v, w);
			} }else {{ // compare >= 0
				__CLR4_4_11c1clo0x9tox.R.inc(126);this.right = this.right.insert(x, v, w);
			}
			
			// Update the weights and max weights and the tree traverses back from the recursion
			}__CLR4_4_11c1clo0x9tox.R.inc(127);this.weight = this.left.weight + this.right.weight;
			__CLR4_4_11c1clo0x9tox.R.inc(128);this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
			
			__CLR4_4_11c1clo0x9tox.R.inc(129);return this;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Node delete(Key x) throws Exception {try{__CLR4_4_11c1clo0x9tox.R.inc(130);
			__CLR4_4_11c1clo0x9tox.R.inc(131);Node filler;
			
			__CLR4_4_11c1clo0x9tox.R.inc(132);if ((((x.compareTo(this.key) >= 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(133)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(134)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(135);filler = this.right.delete(x);
				__CLR4_4_11c1clo0x9tox.R.inc(136);if ((((filler == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(137)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(138)==0&false))) {{
					__CLR4_4_11c1clo0x9tox.R.inc(139);return this.left;
				} }else {{
					__CLR4_4_11c1clo0x9tox.R.inc(140);this.right = filler;
					__CLR4_4_11c1clo0x9tox.R.inc(141);this.weight = this.left.weight + this.right.weight;
					__CLR4_4_11c1clo0x9tox.R.inc(142);this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
					__CLR4_4_11c1clo0x9tox.R.inc(143);return this;
				}
			}} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(144);filler = this.left.delete(x);
				__CLR4_4_11c1clo0x9tox.R.inc(145);if ((((filler == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(146)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(147)==0&false))) {{
					__CLR4_4_11c1clo0x9tox.R.inc(148);return this.right;
				} }else {{
					__CLR4_4_11c1clo0x9tox.R.inc(149);this.left = filler;
					__CLR4_4_11c1clo0x9tox.R.inc(150);this.weight = this.left.weight + this.right.weight;
					__CLR4_4_11c1clo0x9tox.R.inc(151);this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
					__CLR4_4_11c1clo0x9tox.R.inc(152);return this;
				}
			}}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		ArrayList<String> getPreorderList(ArrayList<String> arr) {try{__CLR4_4_11c1clo0x9tox.R.inc(153);
			__CLR4_4_11c1clo0x9tox.R.inc(154);arr.add("(" + this.key.toString() + ") wt: " + this.weight);
			__CLR4_4_11c1clo0x9tox.R.inc(155);arr = this.left.getPreorderList(arr);
			__CLR4_4_11c1clo0x9tox.R.inc(156);arr = this.right.getPreorderList(arr);
			__CLR4_4_11c1clo0x9tox.R.inc(157);return arr;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value getMin() {try{__CLR4_4_11c1clo0x9tox.R.inc(158); 
			__CLR4_4_11c1clo0x9tox.R.inc(159);return this.left.getMin();
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value getMax() {try{__CLR4_4_11c1clo0x9tox.R.inc(160);
			__CLR4_4_11c1clo0x9tox.R.inc(161);return this.right.getMax();
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value findDown(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(162);
			__CLR4_4_11c1clo0x9tox.R.inc(163);if ((((x.compareTo(this.key) < 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(164)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(165)==0&false))) {{ // x goes in left subtree
				__CLR4_4_11c1clo0x9tox.R.inc(166);return this.left.findDown(x);
			} }else {{ // x goes in right subtree
				__CLR4_4_11c1clo0x9tox.R.inc(167);Value v = this.right.findDown(x);
				__CLR4_4_11c1clo0x9tox.R.inc(168);if ((((v == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(169)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(170)==0&false))) {{
					__CLR4_4_11c1clo0x9tox.R.inc(171);return this.left.getMax();
				} }else {{
					__CLR4_4_11c1clo0x9tox.R.inc(172);return v;
				}
			}}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value findUp(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(173);
			__CLR4_4_11c1clo0x9tox.R.inc(174);if ((((x.compareTo(this.key) < 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(175)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(176)==0&false))) {{ // x goes in left subtree
				__CLR4_4_11c1clo0x9tox.R.inc(177);Value v = this.left.findUp(x);
				__CLR4_4_11c1clo0x9tox.R.inc(178);if ((((v == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(179)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(180)==0&false))) {{
					__CLR4_4_11c1clo0x9tox.R.inc(181);return this.right.getMin();
				} }else {{
					__CLR4_4_11c1clo0x9tox.R.inc(182);return v;
				}
			}} }else {{ // x goes in right subtree
				__CLR4_4_11c1clo0x9tox.R.inc(183);return this.right.findUp(x);
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
	}
	
	public class ExternalNode extends Node {
		Value value;
		
		ExternalNode(Key key, Value value, float w) {try{__CLR4_4_11c1clo0x9tox.R.inc(184);
			__CLR4_4_11c1clo0x9tox.R.inc(185);this.key = key;
			__CLR4_4_11c1clo0x9tox.R.inc(186);this.value = value;
			__CLR4_4_11c1clo0x9tox.R.inc(187);this.weight = w;
			__CLR4_4_11c1clo0x9tox.R.inc(188);this.maxWeight = w;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value find(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(189);
			__CLR4_4_11c1clo0x9tox.R.inc(190);if ((((x.compareTo(this.key) == 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(191)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(192)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(193);return this.value;
			} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(194);return null;
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Node rebuild(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(195);
			__CLR4_4_11c1clo0x9tox.R.inc(196);return this;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Node buildTree(List<Node> nodes) {try{__CLR4_4_11c1clo0x9tox.R.inc(197);
			__CLR4_4_11c1clo0x9tox.R.inc(198);return nodes.get(0);
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Node insert(Key x, Value v, float w) throws Exception {try{__CLR4_4_11c1clo0x9tox.R.inc(199);
			__CLR4_4_11c1clo0x9tox.R.inc(200);if ((((x.compareTo(this.key) == 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(201)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(202)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(203);throw new Exception("Duplicate Key!");
			} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(204);Node q = new ExternalNode(x,v, w);
				__CLR4_4_11c1clo0x9tox.R.inc(205);if ((((x.compareTo(this.key) < 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(206)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(207)==0&false))) {{
					__CLR4_4_11c1clo0x9tox.R.inc(208);return new InternalNode(this.key, q, this);
				} }else {{ // compare > 0
					__CLR4_4_11c1clo0x9tox.R.inc(209);return new InternalNode(x, this, q);
				}
			}}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
		Node delete(Key x) throws Exception {try{__CLR4_4_11c1clo0x9tox.R.inc(210);
			__CLR4_4_11c1clo0x9tox.R.inc(211);if ((((x.compareTo(this.key) == 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(212)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(213)==0&false))) {{ // found the key!
				__CLR4_4_11c1clo0x9tox.R.inc(214);return null;
			} }else {{ // fell out of the tree?
				__CLR4_4_11c1clo0x9tox.R.inc(215);throw new Exception("Deleting non-existent key");
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		ArrayList<String> getPreorderList(ArrayList<String> arr) {try{__CLR4_4_11c1clo0x9tox.R.inc(216);
			__CLR4_4_11c1clo0x9tox.R.inc(217);arr.add("[" + this.key.toString() + " " + this.value.toString() + "] wt: " + this.weight);
			__CLR4_4_11c1clo0x9tox.R.inc(218);return arr;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		ArrayList<Node> getExternalNodes(ArrayList<Node> arr) {try{__CLR4_4_11c1clo0x9tox.R.inc(219);
			__CLR4_4_11c1clo0x9tox.R.inc(220);arr.add(this);
			__CLR4_4_11c1clo0x9tox.R.inc(221);return arr;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value getMin() {try{__CLR4_4_11c1clo0x9tox.R.inc(222);
			__CLR4_4_11c1clo0x9tox.R.inc(223);return this.value;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value getMax() {try{__CLR4_4_11c1clo0x9tox.R.inc(224);
			__CLR4_4_11c1clo0x9tox.R.inc(225);return this.value;
		}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value findDown(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(226);
			__CLR4_4_11c1clo0x9tox.R.inc(227);if ((((x.compareTo(this.key) >= 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(228)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(229)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(230);return this.value;
			} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(231);return null;
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
		
		Value findUp(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(232);
			__CLR4_4_11c1clo0x9tox.R.inc(233);if ((((x.compareTo(this.key) <= 0)&&(__CLR4_4_11c1clo0x9tox.R.iget(234)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(235)==0&false))) {{
				__CLR4_4_11c1clo0x9tox.R.inc(236);return this.value;
			} }else {{
				__CLR4_4_11c1clo0x9tox.R.inc(237);return null;
			}
		}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	}
	
	// --------------------------------------------------
	// PUBLIC BJTree FUNCTIONS
	// --------------------------------------------------
	
	private Node root;
	
	public BJTree() {try{__CLR4_4_11c1clo0x9tox.R.inc(238);
		__CLR4_4_11c1clo0x9tox.R.inc(239);this.root = null;
	}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public Value find(Key x) {try{__CLR4_4_11c1clo0x9tox.R.inc(240);
		__CLR4_4_11c1clo0x9tox.R.inc(241);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(242)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(243)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(244);return null;
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(245);return this.root.find(x);
		}
	}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public void insert(Key x, Value v, float w) throws Exception {try{__CLR4_4_11c1clo0x9tox.R.inc(246);
		__CLR4_4_11c1clo0x9tox.R.inc(247);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(248)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(249)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(250);this.root = new ExternalNode(x, v, w);
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(251);this.root = this.root.insert(x, v, w);
		}
		}__CLR4_4_11c1clo0x9tox.R.inc(252);this.root = this.root.rebuild(x);
	}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	
	public void delete(Key x) throws Exception {try{__CLR4_4_11c1clo0x9tox.R.inc(253);
		__CLR4_4_11c1clo0x9tox.R.inc(254);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(255)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(256)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(257);return;
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(258);this.root = this.root.delete(x);
		}
		}__CLR4_4_11c1clo0x9tox.R.inc(259);if ((((this.root != null)&&(__CLR4_4_11c1clo0x9tox.R.iget(260)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(261)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(262);this.root = this.root.rebuild(x);
		}
	}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public void clear() {try{__CLR4_4_11c1clo0x9tox.R.inc(263);
		__CLR4_4_11c1clo0x9tox.R.inc(264);this.root = null;
	}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public ArrayList<String> getPreorderList() {try{__CLR4_4_11c1clo0x9tox.R.inc(265);
		__CLR4_4_11c1clo0x9tox.R.inc(266);ArrayList<String> array = new ArrayList<>();
		__CLR4_4_11c1clo0x9tox.R.inc(267);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(268)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(269)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(270);return array;
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(271);return this.root.getPreorderList(array);
		}
	}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public Value getMin() {try{__CLR4_4_11c1clo0x9tox.R.inc(272);
		__CLR4_4_11c1clo0x9tox.R.inc(273);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(274)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(275)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(276);return null;
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(277);return this.root.getMin();
		}
	}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public Value getMax() {try{__CLR4_4_11c1clo0x9tox.R.inc(278);
		__CLR4_4_11c1clo0x9tox.R.inc(279);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(280)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(281)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(282);return null;
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(283);return this.root.getMax();
		}
	}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public Value findDown(Key x)  {try{__CLR4_4_11c1clo0x9tox.R.inc(284);
		__CLR4_4_11c1clo0x9tox.R.inc(285);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(286)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(287)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(288);return null;
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(289);return this.root.findDown(x);
		}
	}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
	public Value findUp(Key x)  {try{__CLR4_4_11c1clo0x9tox.R.inc(290);
		__CLR4_4_11c1clo0x9tox.R.inc(291);if ((((this.root == null)&&(__CLR4_4_11c1clo0x9tox.R.iget(292)!=0|true))||(__CLR4_4_11c1clo0x9tox.R.iget(293)==0&false))) {{
			__CLR4_4_11c1clo0x9tox.R.inc(294);return null;
		} }else {{
			__CLR4_4_11c1clo0x9tox.R.inc(295);return this.root.findUp(x);
		}
	}}finally{__CLR4_4_11c1clo0x9tox.R.flushNeeded();}}
	
}
