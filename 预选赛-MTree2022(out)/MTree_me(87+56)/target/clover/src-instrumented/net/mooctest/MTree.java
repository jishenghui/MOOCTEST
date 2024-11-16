/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Set;
import net.mooctest.SplitFunction.SplitResult;


/**
 * The main class that implements the M-Tree.
 *
 * @param <DATA> The type of data that will be indexed by the M-Tree. Objects of
 *        this type are stored in HashMaps and HashSets, so their
 *        {@code hashCode()} and {@code equals()} methods must be consistent.
 */
public class MTree<DATA> {public static class __CLR4_4_12121kv4p5gip{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047643911L,8589935092L,594,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * The type of the results for nearest-neighbor queries.
	 */
	public class ResultItem {
		private ResultItem(DATA data, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(73);
			__CLR4_4_12121kv4p5gip.R.inc(74);this.data = data;
			__CLR4_4_12121kv4p5gip.R.inc(75);this.distance = distance;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		/** A nearest-neighbor. */
		public DATA data;

		/** 
		 * The distance from the nearest-neighbor to the query data object
		 * parameter.
		 */
		public double distance;
	}
	
	
	// Exception classes
	private static class SplitNodeReplacement extends Exception {
		// A subclass of Throwable cannot be generic.  :-(
		// So, we have newNodes declared as Object[] instead of Node[].
		private Object newNodes[];
		
		private SplitNodeReplacement(Object... newNodes) {try{__CLR4_4_12121kv4p5gip.R.inc(76);
			__CLR4_4_12121kv4p5gip.R.inc(77);this.newNodes = newNodes;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}
	
	private static class RootNodeReplacement extends Exception {
		// A subclass of Throwable cannot be generic.  :-(
		// So, we have newRoot declared as Object instead of Node.
		private Object newRoot;
		
		private RootNodeReplacement(Object newRoot) {try{__CLR4_4_12121kv4p5gip.R.inc(78);
			__CLR4_4_12121kv4p5gip.R.inc(79);this.newRoot = newRoot;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}

	
	private static class NodeUnderCapacity extends Exception { }
	

	private static class DataNotFound extends Exception { }

	/**
	 * An {@link Iterable} class which can be iterated to fetch the results of a
	 * nearest-neighbors query.
	 * 
	 * <p>The neighbors are presented in non-decreasing order from the {@code
	 * queryData} argument to the {@link MTree#getNearest(Object, double, int)
	 * getNearest*()}
	 * call.
	 * 
	 * <p>The query on the M-Tree is executed during the iteration, as the
	 * results are fetched. It means that, by the time when the <i>n</i>-th
	 * result is fetched, the next result may still not be known, and the
	 * resources allocated were only the necessary to identify the <i>n</i>
	 * first results.
	 */
	public class Query implements Iterable<ResultItem> {

		private class ResultsIterator implements Iterator<ResultItem> {
			
			private class ItemWithDistances <U> implements Comparable<ItemWithDistances<U>> {
				private U item;
				private double distance;
				private double minDistance;

				public ItemWithDistances(U item, double distance, double minDistance) {try{__CLR4_4_12121kv4p5gip.R.inc(80);
					__CLR4_4_12121kv4p5gip.R.inc(81);this.item = item;
					__CLR4_4_12121kv4p5gip.R.inc(82);this.distance = distance;
					__CLR4_4_12121kv4p5gip.R.inc(83);this.minDistance = minDistance;
				}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

				@Override
				public int compareTo(ItemWithDistances<U> that) {try{__CLR4_4_12121kv4p5gip.R.inc(84);
					__CLR4_4_12121kv4p5gip.R.inc(85);if((((this.minDistance < that.minDistance)&&(__CLR4_4_12121kv4p5gip.R.iget(86)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(87)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(88);return -1;
					} }else {__CLR4_4_12121kv4p5gip.R.inc(89);if((((this.minDistance > that.minDistance)&&(__CLR4_4_12121kv4p5gip.R.iget(90)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(91)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(92);return +1;
					} }else {{
						__CLR4_4_12121kv4p5gip.R.inc(93);return 0;
					}
				}}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			}
			
			
			private ResultItem nextResultItem = null;
			private boolean finished = false;
			private PriorityQueue<ItemWithDistances<Node>> pendingQueue = new PriorityQueue<ItemWithDistances<Node>>();
			private double nextPendingMinDistance;
			private PriorityQueue<ItemWithDistances<Entry>> nearestQueue = new PriorityQueue<ItemWithDistances<Entry>>();
			private int yieldedCount;
			
			private ResultsIterator() {try{__CLR4_4_12121kv4p5gip.R.inc(94);
				__CLR4_4_12121kv4p5gip.R.inc(95);if((((MTree.this.root == null)&&(__CLR4_4_12121kv4p5gip.R.iget(96)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(97)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(98);finished = true;
					__CLR4_4_12121kv4p5gip.R.inc(99);return;
				}
				
				}__CLR4_4_12121kv4p5gip.R.inc(100);double distance = MTree.this.distanceFunction.calculate(Query.this.data, MTree.this.root.data);
				__CLR4_4_12121kv4p5gip.R.inc(101);double minDistance = Math.max(distance - MTree.this.root.radius, 0.0);
				
				__CLR4_4_12121kv4p5gip.R.inc(102);pendingQueue.add(new ItemWithDistances<Node>(MTree.this.root, distance, minDistance));
				__CLR4_4_12121kv4p5gip.R.inc(103);nextPendingMinDistance = minDistance;
			}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			
			
			@Override
			public boolean hasNext() {try{__CLR4_4_12121kv4p5gip.R.inc(104);
				__CLR4_4_12121kv4p5gip.R.inc(105);if((((finished)&&(__CLR4_4_12121kv4p5gip.R.iget(106)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(107)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(108);return false;
				}
				
				}__CLR4_4_12121kv4p5gip.R.inc(109);if((((nextResultItem == null)&&(__CLR4_4_12121kv4p5gip.R.iget(110)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(111)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(112);fetchNext();
				}
				
				}__CLR4_4_12121kv4p5gip.R.inc(113);if((((nextResultItem == null)&&(__CLR4_4_12121kv4p5gip.R.iget(114)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(115)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(116);finished = true;
					__CLR4_4_12121kv4p5gip.R.inc(117);return false;
				} }else {{
					__CLR4_4_12121kv4p5gip.R.inc(118);return true;
				}
			}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			
			@Override
			public ResultItem next() {try{__CLR4_4_12121kv4p5gip.R.inc(119);
				__CLR4_4_12121kv4p5gip.R.inc(120);if((((hasNext())&&(__CLR4_4_12121kv4p5gip.R.iget(121)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(122)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(123);ResultItem next = nextResultItem;
					__CLR4_4_12121kv4p5gip.R.inc(124);nextResultItem = null;
					__CLR4_4_12121kv4p5gip.R.inc(125);return next;
				} }else {{
					__CLR4_4_12121kv4p5gip.R.inc(126);throw new NoSuchElementException();
				}
			}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			
			@Override
			public void remove() {try{__CLR4_4_12121kv4p5gip.R.inc(127);
				__CLR4_4_12121kv4p5gip.R.inc(128);throw new UnsupportedOperationException();
			}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			
			
			private void fetchNext() {try{__CLR4_4_12121kv4p5gip.R.inc(129);
				assert (((!finished)&&(__CLR4_4_12121kv4p5gip.R.iget(130)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(131)==0&false));
				
				__CLR4_4_12121kv4p5gip.R.inc(132);if((((finished  ||  yieldedCount >= Query.this.limit)&&(__CLR4_4_12121kv4p5gip.R.iget(133)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(134)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(135);finished = true;
					__CLR4_4_12121kv4p5gip.R.inc(136);return;
				}
				
				}__CLR4_4_12121kv4p5gip.R.inc(137);while((((!pendingQueue.isEmpty()  ||  !nearestQueue.isEmpty())&&(__CLR4_4_12121kv4p5gip.R.iget(138)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(139)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(140);if((((prepareNextNearest())&&(__CLR4_4_12121kv4p5gip.R.iget(141)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(142)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(143);return;
					}
					
					}assert (((!pendingQueue.isEmpty())&&(__CLR4_4_12121kv4p5gip.R.iget(144)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(145)==0&false));
					
					__CLR4_4_12121kv4p5gip.R.inc(146);ItemWithDistances<Node> pending = pendingQueue.poll();
					__CLR4_4_12121kv4p5gip.R.inc(147);Node node = pending.item;
					
					__CLR4_4_12121kv4p5gip.R.inc(148);for(IndexItem child : node.children.values()) {{
						__CLR4_4_12121kv4p5gip.R.inc(149);if((((Math.abs(pending.distance - child.distanceToParent) - child.radius <= Query.this.range)&&(__CLR4_4_12121kv4p5gip.R.iget(150)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(151)==0&false))) {{
							__CLR4_4_12121kv4p5gip.R.inc(152);double childDistance = MTree.this.distanceFunction.calculate(Query.this.data, child.data);
							__CLR4_4_12121kv4p5gip.R.inc(153);double childMinDistance = Math.max(childDistance - child.radius, 0.0);
							__CLR4_4_12121kv4p5gip.R.inc(154);if((((childMinDistance <= Query.this.range)&&(__CLR4_4_12121kv4p5gip.R.iget(155)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(156)==0&false))) {{
								__CLR4_4_12121kv4p5gip.R.inc(157);if((((child instanceof MTree.Entry)&&(__CLR4_4_12121kv4p5gip.R.iget(158)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(159)==0&false))) {{
									__CLR4_4_12121kv4p5gip.R.inc(160);@SuppressWarnings("unchecked")
									Entry entry = (Entry)child;
									__CLR4_4_12121kv4p5gip.R.inc(161);nearestQueue.add(new ItemWithDistances<Entry>(entry, childDistance, childMinDistance));
								} }else {{
									__CLR4_4_12121kv4p5gip.R.inc(162);@SuppressWarnings("unchecked")
									Node childNode = (Node)child;
									__CLR4_4_12121kv4p5gip.R.inc(163);pendingQueue.add(new ItemWithDistances<Node>(childNode, childDistance, childMinDistance));
								}
							}}
						}}
					}}
					
					}__CLR4_4_12121kv4p5gip.R.inc(164);if((((pendingQueue.isEmpty())&&(__CLR4_4_12121kv4p5gip.R.iget(165)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(166)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(167);nextPendingMinDistance = Double.POSITIVE_INFINITY;
					} }else {{
						__CLR4_4_12121kv4p5gip.R.inc(168);nextPendingMinDistance = pendingQueue.peek().minDistance;
					}
				}}

				}__CLR4_4_12121kv4p5gip.R.inc(169);finished = true;
			}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

			
			private boolean prepareNextNearest() {try{__CLR4_4_12121kv4p5gip.R.inc(170);
				__CLR4_4_12121kv4p5gip.R.inc(171);if((((!nearestQueue.isEmpty())&&(__CLR4_4_12121kv4p5gip.R.iget(172)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(173)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(174);ItemWithDistances<Entry> nextNearest = nearestQueue.peek();
					__CLR4_4_12121kv4p5gip.R.inc(175);if((((nextNearest.distance <= nextPendingMinDistance)&&(__CLR4_4_12121kv4p5gip.R.iget(176)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(177)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(178);nearestQueue.poll();
						__CLR4_4_12121kv4p5gip.R.inc(179);nextResultItem = new ResultItem(nextNearest.item.data, nextNearest.distance);
						__CLR4_4_12121kv4p5gip.R.inc(180);++yieldedCount;
						__CLR4_4_12121kv4p5gip.R.inc(181);return true;
					}
				}}
				
				}__CLR4_4_12121kv4p5gip.R.inc(182);return false;
			}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			
		}
		
		
		private Query(DATA data, double range, int limit) {try{__CLR4_4_12121kv4p5gip.R.inc(183);
			__CLR4_4_12121kv4p5gip.R.inc(184);this.data = data;
			__CLR4_4_12121kv4p5gip.R.inc(185);this.range = range;
			__CLR4_4_12121kv4p5gip.R.inc(186);this.limit = limit;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		
		@Override
		public Iterator<ResultItem> iterator() {try{__CLR4_4_12121kv4p5gip.R.inc(187);
			__CLR4_4_12121kv4p5gip.R.inc(188);return new ResultsIterator();
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		
		private DATA data;
		private double range;
		private int limit;
	}


	
	/**
	 * The default minimum capacity of nodes in an M-Tree, when not specified in
	 * the constructor call.
	 */
	public static final int DEFAULT_MIN_NODE_CAPACITY = 50;


	protected int minNodeCapacity;
	protected int maxNodeCapacity;
	protected DistanceFunction<? super DATA> distanceFunction;
	protected SplitFunction<DATA> splitFunction;
	protected Node root;
	
	
	/**
	 * Constructs an M-Tree with the specified distance function.
	 * @param distanceFunction The object used to calculate the distance between
	 *        two data objects.
	 */
	public MTree(DistanceFunction<? super DATA> distanceFunction,
			SplitFunction<DATA> splitFunction) {
		this(DEFAULT_MIN_NODE_CAPACITY, distanceFunction, splitFunction);__CLR4_4_12121kv4p5gip.R.inc(190);try{__CLR4_4_12121kv4p5gip.R.inc(189);
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	
	/**
	 * Constructs an M-Tree with the specified minimum node capacity and
	 * distance function.
	 * @param minNodeCapacity The minimum capacity for the nodes of the tree.
	 * @param distanceFunction The object used to calculate the distance between
	 *        two data objects.
	 * @param splitFunction The object used to process the split of nodes if
	 *        they are full when a new child must be added.
	 */
	public MTree(int minNodeCapacity,
			DistanceFunction<? super DATA> distanceFunction,
			SplitFunction<DATA> splitFunction) {
		this(minNodeCapacity, 2 * minNodeCapacity - 1, distanceFunction, splitFunction);__CLR4_4_12121kv4p5gip.R.inc(192);try{__CLR4_4_12121kv4p5gip.R.inc(191);
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	
	/**
	 * Constructs an M-Tree with the specified minimum and maximum node
	 * capacities and distance function.
	 * @param minNodeCapacity The minimum capacity for the nodes of the tree.
	 * @param maxNodeCapacity The maximum capacity for the nodes of the tree.
	 * @param distanceFunction The object used to calculate the distance between
	 *        two data objects.
	 * @param splitFunction The object used to process the split of nodes if
	 *        they are full when a new child must be added.
	 */
	public MTree(int minNodeCapacity, int maxNodeCapacity,
			DistanceFunction<? super DATA> distanceFunction,
			SplitFunction<DATA> splitFunction)
	{try{__CLR4_4_12121kv4p5gip.R.inc(193);
		__CLR4_4_12121kv4p5gip.R.inc(194);if((((minNodeCapacity < 2  ||  maxNodeCapacity <= minNodeCapacity  ||
		   distanceFunction == null)&&(__CLR4_4_12121kv4p5gip.R.iget(195)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(196)==0&false))) {{
			__CLR4_4_12121kv4p5gip.R.inc(197);throw new IllegalArgumentException();
		}
		
		}__CLR4_4_12121kv4p5gip.R.inc(198);if((((splitFunction == null)&&(__CLR4_4_12121kv4p5gip.R.iget(199)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(200)==0&false))) {{
			__CLR4_4_12121kv4p5gip.R.inc(201);splitFunction = new ComposedSplitFunction<DATA>(
					new PromotionFunctions.RandomPromotion<DATA>(),
					new PartitionFunctions.BalancedPartition<DATA>()
				);
		}
		
		}__CLR4_4_12121kv4p5gip.R.inc(202);this.minNodeCapacity = minNodeCapacity;
		__CLR4_4_12121kv4p5gip.R.inc(203);this.maxNodeCapacity = maxNodeCapacity;
		__CLR4_4_12121kv4p5gip.R.inc(204);this.distanceFunction = distanceFunction;
		__CLR4_4_12121kv4p5gip.R.inc(205);this.splitFunction = splitFunction;
		__CLR4_4_12121kv4p5gip.R.inc(206);this.root = null;
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	
	
	/**
	 * Adds and indexes a data object.
	 * 
	 * <p>An object that is already indexed should not be added. There is no
	 * validation regarding this, and the behavior is undefined if done.
	 * 
	 * @param data The data object to index.
	 */
	public void add(DATA data) {try{__CLR4_4_12121kv4p5gip.R.inc(207);
		__CLR4_4_12121kv4p5gip.R.inc(208);if((((root == null)&&(__CLR4_4_12121kv4p5gip.R.iget(209)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(210)==0&false))) {{
			__CLR4_4_12121kv4p5gip.R.inc(211);root = new RootLeafNode(data);
			__CLR4_4_12121kv4p5gip.R.inc(212);try {
				__CLR4_4_12121kv4p5gip.R.inc(213);root.addData(data, 0);
			} catch (SplitNodeReplacement e) {
				__CLR4_4_12121kv4p5gip.R.inc(214);throw new RuntimeException("Should never happen!");
			}
		} }else {{
			__CLR4_4_12121kv4p5gip.R.inc(215);double distance = distanceFunction.calculate(data, root.data);
			__CLR4_4_12121kv4p5gip.R.inc(216);try {
				__CLR4_4_12121kv4p5gip.R.inc(217);root.addData(data, distance);
			} catch(SplitNodeReplacement e) {
				__CLR4_4_12121kv4p5gip.R.inc(218);Node newRoot = new RootNode(data);
				__CLR4_4_12121kv4p5gip.R.inc(219);root = newRoot;
				__CLR4_4_12121kv4p5gip.R.inc(220);for(int i = 0; (((i < e.newNodes.length)&&(__CLR4_4_12121kv4p5gip.R.iget(221)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(222)==0&false)); i++) {{
					__CLR4_4_12121kv4p5gip.R.inc(223);@SuppressWarnings("unchecked")
					Node newNode = (Node) e.newNodes[i];
					__CLR4_4_12121kv4p5gip.R.inc(224);distance = distanceFunction.calculate(root.data, newNode.data);
					__CLR4_4_12121kv4p5gip.R.inc(225);root.addChild(newNode, distance);
				}
			}}
		}
	}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}


	/**
	 * Removes a data object from the M-Tree.
	 * @param data The data object to be removed.
	 * @return {@code true} if and only if the object was found.
	 */
	public boolean remove(DATA data) {try{__CLR4_4_12121kv4p5gip.R.inc(226);
		__CLR4_4_12121kv4p5gip.R.inc(227);if((((root == null)&&(__CLR4_4_12121kv4p5gip.R.iget(228)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(229)==0&false))) {{
			__CLR4_4_12121kv4p5gip.R.inc(230);return false;
		}
		
		}__CLR4_4_12121kv4p5gip.R.inc(231);double distanceToRoot = distanceFunction.calculate(data, root.data);
		__CLR4_4_12121kv4p5gip.R.inc(232);try {
			__CLR4_4_12121kv4p5gip.R.inc(233);root.removeData(data, distanceToRoot);
		} catch(RootNodeReplacement e) {
			__CLR4_4_12121kv4p5gip.R.inc(234);@SuppressWarnings("unchecked")
			Node newRoot = (Node) e.newRoot;
			__CLR4_4_12121kv4p5gip.R.inc(235);root = newRoot;
		} catch(DataNotFound e) {
			__CLR4_4_12121kv4p5gip.R.inc(236);return false;
		} catch (NodeUnderCapacity e) {
			__CLR4_4_12121kv4p5gip.R.inc(237);throw new RuntimeException("Should have never happened", e);
		}
		__CLR4_4_12121kv4p5gip.R.inc(238);return true;
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

	/**
	 * Performs a nearest-neighbors query on the M-Tree, constrained by distance.
	 * @param queryData The query data object.
	 * @param range     The maximum distance from {@code queryData} to fetched
	 *                  neighbors.
	 * @return A {@link Query} object used to iterate on the results.
	 */
	public Query getNearestByRange(DATA queryData, double range) {try{__CLR4_4_12121kv4p5gip.R.inc(239);
		__CLR4_4_12121kv4p5gip.R.inc(240);return getNearest(queryData, range, Integer.MAX_VALUE);
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	
	
	/**
	 * Performs a nearest-neighbors query on the M-Tree, constrained by the
	 * number of neighbors.
	 * @param queryData The query data object.
	 * @param limit     The maximum number of neighbors to fetch.
	 * @return A {@link Query} object used to iterate on the results.
	 */
	public Query getNearestByLimit(DATA queryData, int limit) {try{__CLR4_4_12121kv4p5gip.R.inc(241);
		__CLR4_4_12121kv4p5gip.R.inc(242);return getNearest(queryData, Double.POSITIVE_INFINITY, limit);
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

	/**
	 * Performs a nearest-neighbor query on the M-Tree, constrained by distance
	 * and/or the number of neighbors.
	 * @param queryData The query data object.
	 * @param range     The maximum distance from {@code queryData} to fetched
	 *                  neighbors.
	 * @param limit     The maximum number of neighbors to fetch.
	 * @return A {@link Query} object used to iterate on the results.
	 */
	public Query getNearest(DATA queryData, double range, int limit) {try{__CLR4_4_12121kv4p5gip.R.inc(243);
		__CLR4_4_12121kv4p5gip.R.inc(244);return new Query(queryData, range, limit);
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

	/**
	 * Performs a nearest-neighbor query on the M-Tree, without constraints.
	 * @param queryData The query data object.
	 * @return A {@link Query} object used to iterate on the results.
	 */
	public Query getNearest(DATA queryData) {try{__CLR4_4_12121kv4p5gip.R.inc(245);
		__CLR4_4_12121kv4p5gip.R.inc(246);return new Query(queryData, Double.POSITIVE_INFINITY, Integer.MAX_VALUE);
	}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	
	
	protected void _check() {try{__CLR4_4_12121kv4p5gip.R.inc(247);
		__CLR4_4_12121kv4p5gip.R.inc(248);if((((root != null)&&(__CLR4_4_12121kv4p5gip.R.iget(249)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(250)==0&false))) {{
			__CLR4_4_12121kv4p5gip.R.inc(251);root._check();
		}
	}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	

	private class IndexItem {
		DATA data;
		protected double radius;
		double distanceToParent;

		private IndexItem(DATA data) {try{__CLR4_4_12121kv4p5gip.R.inc(252);
			__CLR4_4_12121kv4p5gip.R.inc(253);this.data = data;
			__CLR4_4_12121kv4p5gip.R.inc(254);this.radius = 0;
			__CLR4_4_12121kv4p5gip.R.inc(255);this.distanceToParent = -1;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		int _check() {try{__CLR4_4_12121kv4p5gip.R.inc(256);
			__CLR4_4_12121kv4p5gip.R.inc(257);_checkRadius();
			__CLR4_4_12121kv4p5gip.R.inc(258);_checkDistanceToParent();
			__CLR4_4_12121kv4p5gip.R.inc(259);return 1;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private void _checkRadius() {try{__CLR4_4_12121kv4p5gip.R.inc(260);
			assert (((radius >= 0)&&(__CLR4_4_12121kv4p5gip.R.iget(261)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(262)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		protected void _checkDistanceToParent() {try{__CLR4_4_12121kv4p5gip.R.inc(263);
			assert (((!(this instanceof MTree.RootLeafNode))&&(__CLR4_4_12121kv4p5gip.R.iget(264)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(265)==0&false));
			assert (((!(this instanceof MTree.RootNode))&&(__CLR4_4_12121kv4p5gip.R.iget(266)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(267)==0&false));
			assert (((distanceToParent >= 0)&&(__CLR4_4_12121kv4p5gip.R.iget(268)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(269)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}

	
	
	private abstract class Node extends IndexItem {

		protected Map<DATA, IndexItem> children = new HashMap<DATA, IndexItem>();
		protected Rootness       rootness;
		protected Leafness<DATA> leafness;
		
		private
		<R extends NodeTrait & Rootness, L extends NodeTrait & Leafness<DATA>>
		Node(DATA data, R rootness, L leafness) {
			super(data);__CLR4_4_12121kv4p5gip.R.inc(271);try{__CLR4_4_12121kv4p5gip.R.inc(270);
			
			__CLR4_4_12121kv4p5gip.R.inc(272);rootness.thisNode = this;
			__CLR4_4_12121kv4p5gip.R.inc(273);this.rootness = rootness;
			
			__CLR4_4_12121kv4p5gip.R.inc(274);leafness.thisNode = this;
			__CLR4_4_12121kv4p5gip.R.inc(275);this.leafness = leafness;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private final void addData(DATA data, double distance) throws SplitNodeReplacement {try{__CLR4_4_12121kv4p5gip.R.inc(276);
			__CLR4_4_12121kv4p5gip.R.inc(277);doAddData(data, distance);
			__CLR4_4_12121kv4p5gip.R.inc(278);checkMaxCapacity();
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		int _check() {try{__CLR4_4_12121kv4p5gip.R.inc(279);
			__CLR4_4_12121kv4p5gip.R.inc(280);super._check();
			__CLR4_4_12121kv4p5gip.R.inc(281);_checkMinCapacity();
			__CLR4_4_12121kv4p5gip.R.inc(282);_checkMaxCapacity();

			__CLR4_4_12121kv4p5gip.R.inc(283);int childHeight = -1;
			__CLR4_4_12121kv4p5gip.R.inc(284);for(Map.Entry<DATA, IndexItem> e : children.entrySet()) {{
				__CLR4_4_12121kv4p5gip.R.inc(285);DATA data = e.getKey();
				__CLR4_4_12121kv4p5gip.R.inc(286);IndexItem child = e.getValue();
				assert (((child.data.equals(data))&&(__CLR4_4_12121kv4p5gip.R.iget(287)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(288)==0&false));

				__CLR4_4_12121kv4p5gip.R.inc(289);_checkChildClass(child);
				__CLR4_4_12121kv4p5gip.R.inc(290);_checkChildMetrics(child);

				__CLR4_4_12121kv4p5gip.R.inc(291);int height = child._check();
				__CLR4_4_12121kv4p5gip.R.inc(292);if((((childHeight < 0)&&(__CLR4_4_12121kv4p5gip.R.iget(293)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(294)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(295);childHeight = height;
				} }else {{
					assert (((childHeight == height)&&(__CLR4_4_12121kv4p5gip.R.iget(296)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(297)==0&false));
				}
			}}

			}__CLR4_4_12121kv4p5gip.R.inc(298);return childHeight + 1;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		protected void doAddData(DATA data, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(299);
			__CLR4_4_12121kv4p5gip.R.inc(300);leafness.doAddData(data, distance);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		protected void doRemoveData(DATA data, double distance) throws DataNotFound {try{__CLR4_4_12121kv4p5gip.R.inc(301);
			__CLR4_4_12121kv4p5gip.R.inc(302);leafness.doRemoveData(data, distance);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private final void checkMaxCapacity() throws SplitNodeReplacement {try{__CLR4_4_12121kv4p5gip.R.inc(303);
			__CLR4_4_12121kv4p5gip.R.inc(304);if((((children.size() > MTree.this.maxNodeCapacity)&&(__CLR4_4_12121kv4p5gip.R.iget(305)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(306)==0&false))) {{
				__CLR4_4_12121kv4p5gip.R.inc(307);DistanceFunction<? super DATA> cachedDistanceFunction = DistanceFunctions.cached(MTree.this.distanceFunction);
				__CLR4_4_12121kv4p5gip.R.inc(308);SplitResult<DATA> splitResult = MTree.this.splitFunction.process(children.keySet(), cachedDistanceFunction);
				
				__CLR4_4_12121kv4p5gip.R.inc(309);Node newNode0 = null;
				__CLR4_4_12121kv4p5gip.R.inc(310);Node newNode1 = null;
				__CLR4_4_12121kv4p5gip.R.inc(311);for(int i = 0; (((i < 2)&&(__CLR4_4_12121kv4p5gip.R.iget(312)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(313)==0&false)); ++i) {{
					__CLR4_4_12121kv4p5gip.R.inc(314);DATA promotedData   = splitResult.promoted.get(i);
					__CLR4_4_12121kv4p5gip.R.inc(315);Set<DATA> partition = splitResult.partitions.get(i);
					
					__CLR4_4_12121kv4p5gip.R.inc(316);Node newNode = newSplitNodeReplacement(promotedData);
					__CLR4_4_12121kv4p5gip.R.inc(317);for(DATA data : partition) {{
						__CLR4_4_12121kv4p5gip.R.inc(318);IndexItem child = children.get(data);
						__CLR4_4_12121kv4p5gip.R.inc(319);children.remove(data);
						__CLR4_4_12121kv4p5gip.R.inc(320);double distance = cachedDistanceFunction.calculate(promotedData, data);
						__CLR4_4_12121kv4p5gip.R.inc(321);newNode.addChild(child, distance);
					}

					}__CLR4_4_12121kv4p5gip.R.inc(322);if((((i == 0)&&(__CLR4_4_12121kv4p5gip.R.iget(323)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(324)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(325);newNode0 = newNode;
					} }else {{
						__CLR4_4_12121kv4p5gip.R.inc(326);newNode1 = newNode;
					}
				}}
				}assert (((children.isEmpty())&&(__CLR4_4_12121kv4p5gip.R.iget(327)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(328)==0&false));

				__CLR4_4_12121kv4p5gip.R.inc(329);throw new SplitNodeReplacement(newNode0, newNode1);
			}

		}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		protected Node newSplitNodeReplacement(DATA data) {try{__CLR4_4_12121kv4p5gip.R.inc(330);
			__CLR4_4_12121kv4p5gip.R.inc(331);return leafness.newSplitNodeReplacement(data);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		protected void addChild(IndexItem child, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(332);
			__CLR4_4_12121kv4p5gip.R.inc(333);leafness.addChild(child, distance);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		void removeData(DATA data, double distance) throws RootNodeReplacement, NodeUnderCapacity, DataNotFound {try{__CLR4_4_12121kv4p5gip.R.inc(334);
			__CLR4_4_12121kv4p5gip.R.inc(335);doRemoveData(data, distance);
			__CLR4_4_12121kv4p5gip.R.inc(336);if((((children.size() < getMinCapacity())&&(__CLR4_4_12121kv4p5gip.R.iget(337)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(338)==0&false))) {{
				__CLR4_4_12121kv4p5gip.R.inc(339);throw new NodeUnderCapacity();
			}
		}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		protected int getMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(340);
			__CLR4_4_12121kv4p5gip.R.inc(341);return rootness.getMinCapacity();
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private void updateMetrics(IndexItem child, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(342);
			__CLR4_4_12121kv4p5gip.R.inc(343);child.distanceToParent = distance;
			__CLR4_4_12121kv4p5gip.R.inc(344);updateRadius(child);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private void updateRadius(IndexItem child) {try{__CLR4_4_12121kv4p5gip.R.inc(345);
			__CLR4_4_12121kv4p5gip.R.inc(346);this.radius = Math.max(this.radius, child.distanceToParent + child.radius);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		void _checkMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(347);
			__CLR4_4_12121kv4p5gip.R.inc(348);rootness._checkMinCapacity();
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private void _checkMaxCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(349);
			assert (((children.size() <= MTree.this.maxNodeCapacity)&&(__CLR4_4_12121kv4p5gip.R.iget(350)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(351)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private void _checkChildClass(IndexItem child) {try{__CLR4_4_12121kv4p5gip.R.inc(352);
			__CLR4_4_12121kv4p5gip.R.inc(353);leafness._checkChildClass(child);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private void _checkChildMetrics(IndexItem child) {try{__CLR4_4_12121kv4p5gip.R.inc(354);
			__CLR4_4_12121kv4p5gip.R.inc(355);double dist = MTree.this.distanceFunction.calculate(child.data, this.data);
			assert (((child.distanceToParent == dist)&&(__CLR4_4_12121kv4p5gip.R.iget(356)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(357)==0&false));

			__CLR4_4_12121kv4p5gip.R.inc(358);double sum = child.distanceToParent + child.radius;
			assert (((sum <= this.radius)&&(__CLR4_4_12121kv4p5gip.R.iget(359)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(360)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		protected void _checkDistanceToParent() {try{__CLR4_4_12121kv4p5gip.R.inc(361);
			__CLR4_4_12121kv4p5gip.R.inc(362);rootness._checkDistanceToParent();
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		private MTree<DATA> mtree() {try{__CLR4_4_12121kv4p5gip.R.inc(363);
			__CLR4_4_12121kv4p5gip.R.inc(364);return MTree.this;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}
	
	
	
	
	private abstract class NodeTrait {
		protected Node thisNode;
	}
	
	private interface Leafness<DATA> {
		void doAddData(DATA data, double distance);
		void addChild(MTree<DATA>.IndexItem child, double distance);
		void doRemoveData(DATA data, double distance) throws DataNotFound;
		MTree<DATA>.Node newSplitNodeReplacement(DATA data);
		void _checkChildClass(MTree<DATA>.IndexItem child);
	}
	
	private interface Rootness {
		int getMinCapacity();
		void _checkDistanceToParent();
		void _checkMinCapacity();
	}
	
	
	
	private class RootNodeTrait extends NodeTrait implements Rootness {
		
		@Override
		public int getMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(365);
			__CLR4_4_12121kv4p5gip.R.inc(366);throw new RuntimeException("Should not be called!");
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		@Override
		public void _checkDistanceToParent() {try{__CLR4_4_12121kv4p5gip.R.inc(367);
			assert (((thisNode.distanceToParent == -1)&&(__CLR4_4_12121kv4p5gip.R.iget(368)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(369)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		@Override
		public void _checkMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(370);
			__CLR4_4_12121kv4p5gip.R.inc(371);thisNode._checkMinCapacity();
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
	};


	private class NonRootNodeTrait extends NodeTrait implements Rootness {
		
		@Override
		public int getMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(372);
			__CLR4_4_12121kv4p5gip.R.inc(373);return MTree.this.minNodeCapacity;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		@Override
		public void _checkMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(374);
			assert (((thisNode.children.size() >= thisNode.mtree().minNodeCapacity)&&(__CLR4_4_12121kv4p5gip.R.iget(375)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(376)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		@Override
		public void _checkDistanceToParent() {try{__CLR4_4_12121kv4p5gip.R.inc(377);
			assert (((thisNode.distanceToParent >= 0)&&(__CLR4_4_12121kv4p5gip.R.iget(378)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(379)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	};
	
	
	private class LeafNodeTrait extends NodeTrait implements Leafness<DATA> {
		
		public void doAddData(DATA data, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(380);
			__CLR4_4_12121kv4p5gip.R.inc(381);Entry entry = thisNode.mtree().new Entry(data);
			assert (((!thisNode.children.containsKey(data))&&(__CLR4_4_12121kv4p5gip.R.iget(382)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(383)==0&false));
			__CLR4_4_12121kv4p5gip.R.inc(384);thisNode.children.put(data, entry);
			assert (((thisNode.children.containsKey(data))&&(__CLR4_4_12121kv4p5gip.R.iget(385)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(386)==0&false));
			__CLR4_4_12121kv4p5gip.R.inc(387);thisNode.updateMetrics(entry, distance);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		public void addChild(IndexItem child, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(388);
			assert (((!thisNode.children.containsKey(child.data))&&(__CLR4_4_12121kv4p5gip.R.iget(389)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(390)==0&false));
			__CLR4_4_12121kv4p5gip.R.inc(391);thisNode.children.put(child.data, child);
			assert (((thisNode.children.containsKey(child.data))&&(__CLR4_4_12121kv4p5gip.R.iget(392)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(393)==0&false));
			__CLR4_4_12121kv4p5gip.R.inc(394);thisNode.updateMetrics(child, distance);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		public Node newSplitNodeReplacement(DATA data) {try{__CLR4_4_12121kv4p5gip.R.inc(395);
			__CLR4_4_12121kv4p5gip.R.inc(396);return thisNode.mtree().new LeafNode(data);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		

		@Override
		public void doRemoveData(DATA data, double distance) throws DataNotFound {try{__CLR4_4_12121kv4p5gip.R.inc(397);
			__CLR4_4_12121kv4p5gip.R.inc(398);if((((thisNode.children.remove(data) == null)&&(__CLR4_4_12121kv4p5gip.R.iget(399)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(400)==0&false))) {{
				__CLR4_4_12121kv4p5gip.R.inc(401);throw new DataNotFound();
			}
		}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		public void _checkChildClass(IndexItem child) {try{__CLR4_4_12121kv4p5gip.R.inc(402);
			assert (((child instanceof MTree.Entry)&&(__CLR4_4_12121kv4p5gip.R.iget(403)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(404)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}


	class NonLeafNodeTrait extends NodeTrait implements Leafness<DATA> {
		
		public void doAddData(DATA data, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(405);
			class CandidateChild {
				Node node;
				double distance;
				double metric;
				private CandidateChild(Node node, double distance, double metric) {try{__CLR4_4_12121kv4p5gip.R.inc(406);
					__CLR4_4_12121kv4p5gip.R.inc(407);this.node = node;
					__CLR4_4_12121kv4p5gip.R.inc(408);this.distance = distance;
					__CLR4_4_12121kv4p5gip.R.inc(409);this.metric = metric;
				}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			}
			
			__CLR4_4_12121kv4p5gip.R.inc(410);CandidateChild minRadiusIncreaseNeeded = new CandidateChild(null, -1.0, Double.POSITIVE_INFINITY);
			__CLR4_4_12121kv4p5gip.R.inc(411);CandidateChild nearestDistance         = new CandidateChild(null, -1.0, Double.POSITIVE_INFINITY);
			
			__CLR4_4_12121kv4p5gip.R.inc(412);for(IndexItem item : thisNode.children.values()) {{
				__CLR4_4_12121kv4p5gip.R.inc(413);@SuppressWarnings("unchecked")
				Node child = (Node)item;
				__CLR4_4_12121kv4p5gip.R.inc(414);double childDistance = thisNode.mtree().distanceFunction.calculate(child.data, data);
				__CLR4_4_12121kv4p5gip.R.inc(415);if((((childDistance > child.radius)&&(__CLR4_4_12121kv4p5gip.R.iget(416)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(417)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(418);double radiusIncrease = childDistance - child.radius;
					__CLR4_4_12121kv4p5gip.R.inc(419);if((((radiusIncrease < minRadiusIncreaseNeeded.metric)&&(__CLR4_4_12121kv4p5gip.R.iget(420)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(421)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(422);minRadiusIncreaseNeeded = new CandidateChild(child, childDistance, radiusIncrease);
					}
				}} }else {{
					__CLR4_4_12121kv4p5gip.R.inc(423);if((((childDistance < nearestDistance.metric)&&(__CLR4_4_12121kv4p5gip.R.iget(424)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(425)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(426);nearestDistance = new CandidateChild(child, childDistance, childDistance);
					}
				}}
			}}
			
			}__CLR4_4_12121kv4p5gip.R.inc(427);CandidateChild chosen = ((((nearestDistance.node != null)
			                      )&&(__CLR4_4_12121kv4p5gip.R.iget(428)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(429)==0&false))? nearestDistance
			                      : minRadiusIncreaseNeeded;
			
			__CLR4_4_12121kv4p5gip.R.inc(430);Node child = chosen.node;
			__CLR4_4_12121kv4p5gip.R.inc(431);try {
				__CLR4_4_12121kv4p5gip.R.inc(432);child.addData(data, chosen.distance);
				__CLR4_4_12121kv4p5gip.R.inc(433);thisNode.updateRadius(child);
			} catch(SplitNodeReplacement e) {
				// Replace current child with new nodes
				__CLR4_4_12121kv4p5gip.R.inc(434);IndexItem _ = thisNode.children.remove(child.data);
				assert (((_ != null)&&(__CLR4_4_12121kv4p5gip.R.iget(435)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(436)==0&false));
				
				__CLR4_4_12121kv4p5gip.R.inc(437);for(int i = 0; (((i < e.newNodes.length)&&(__CLR4_4_12121kv4p5gip.R.iget(438)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(439)==0&false)); ++i) {{
					__CLR4_4_12121kv4p5gip.R.inc(440);@SuppressWarnings("unchecked")
					Node newChild = (Node) e.newNodes[i];
					__CLR4_4_12121kv4p5gip.R.inc(441);distance = thisNode.mtree().distanceFunction.calculate(thisNode.data, newChild.data);
					__CLR4_4_12121kv4p5gip.R.inc(442);thisNode.addChild(newChild, distance);
				}
			}}
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		

		public void addChild(IndexItem newChild_, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(443);
			__CLR4_4_12121kv4p5gip.R.inc(444);@SuppressWarnings("unchecked")
			Node newChild = (Node) newChild_;
			
			class ChildWithDistance {
				Node child;
				double distance;
				private ChildWithDistance(Node child, double distance) {try{__CLR4_4_12121kv4p5gip.R.inc(445);
					__CLR4_4_12121kv4p5gip.R.inc(446);this.child = child;
					__CLR4_4_12121kv4p5gip.R.inc(447);this.distance = distance;
				}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
			}
			
			__CLR4_4_12121kv4p5gip.R.inc(448);Deque<ChildWithDistance> newChildren = new ArrayDeque<ChildWithDistance>();
			__CLR4_4_12121kv4p5gip.R.inc(449);newChildren.addFirst(new ChildWithDistance(newChild, distance));
			
			__CLR4_4_12121kv4p5gip.R.inc(450);while((((!newChildren.isEmpty())&&(__CLR4_4_12121kv4p5gip.R.iget(451)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(452)==0&false))) {{
				__CLR4_4_12121kv4p5gip.R.inc(453);ChildWithDistance cwd = newChildren.removeFirst();
				
				__CLR4_4_12121kv4p5gip.R.inc(454);newChild = cwd.child;
				__CLR4_4_12121kv4p5gip.R.inc(455);distance = cwd.distance;
				__CLR4_4_12121kv4p5gip.R.inc(456);if((((thisNode.children.containsKey(newChild.data))&&(__CLR4_4_12121kv4p5gip.R.iget(457)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(458)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(459);@SuppressWarnings("unchecked")
					Node existingChild = (Node) thisNode.children.get(newChild.data);
					assert (((existingChild.data.equals(newChild.data))&&(__CLR4_4_12121kv4p5gip.R.iget(460)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(461)==0&false));
					
					// Transfer the _children_ of the newChild to the existingChild
					__CLR4_4_12121kv4p5gip.R.inc(462);for(IndexItem grandchild : newChild.children.values()) {{
						__CLR4_4_12121kv4p5gip.R.inc(463);existingChild.addChild(grandchild, grandchild.distanceToParent);
					}
					}__CLR4_4_12121kv4p5gip.R.inc(464);newChild.children.clear();
					
					__CLR4_4_12121kv4p5gip.R.inc(465);try {
						__CLR4_4_12121kv4p5gip.R.inc(466);existingChild.checkMaxCapacity();
					} catch(SplitNodeReplacement e) {
						__CLR4_4_12121kv4p5gip.R.inc(467);IndexItem _ = thisNode.children.remove(existingChild.data);
						assert (((_ != null)&&(__CLR4_4_12121kv4p5gip.R.iget(468)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(469)==0&false));
						
						__CLR4_4_12121kv4p5gip.R.inc(470);for(int i = 0; (((i < e.newNodes.length)&&(__CLR4_4_12121kv4p5gip.R.iget(471)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(472)==0&false)); ++i) {{
							__CLR4_4_12121kv4p5gip.R.inc(473);@SuppressWarnings("unchecked")
							Node newNode = (Node) e.newNodes[i];
							__CLR4_4_12121kv4p5gip.R.inc(474);distance = thisNode.mtree().distanceFunction.calculate(thisNode.data, newNode.data);
							__CLR4_4_12121kv4p5gip.R.inc(475);newChildren.addFirst(new ChildWithDistance(newNode, distance));
						}
					}}
				} }else {{
					__CLR4_4_12121kv4p5gip.R.inc(476);thisNode.children.put(newChild.data, newChild);
					__CLR4_4_12121kv4p5gip.R.inc(477);thisNode.updateMetrics(newChild, distance);
				}
			}}
		}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}


		public Node newSplitNodeReplacement(DATA data) {try{__CLR4_4_12121kv4p5gip.R.inc(478);
			__CLR4_4_12121kv4p5gip.R.inc(479);return new InternalNode(data);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}


		public void doRemoveData(DATA data, double distance) throws DataNotFound {try{__CLR4_4_12121kv4p5gip.R.inc(480);
			__CLR4_4_12121kv4p5gip.R.inc(481);for(IndexItem childItem : thisNode.children.values()) {{
				__CLR4_4_12121kv4p5gip.R.inc(482);@SuppressWarnings("unchecked")
				Node child = (Node)childItem;
				__CLR4_4_12121kv4p5gip.R.inc(483);if((((Math.abs(distance - child.distanceToParent) <= child.radius)&&(__CLR4_4_12121kv4p5gip.R.iget(484)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(485)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(486);double distanceToChild = thisNode.mtree().distanceFunction.calculate(data, child.data);
					__CLR4_4_12121kv4p5gip.R.inc(487);if((((distanceToChild <= child.radius)&&(__CLR4_4_12121kv4p5gip.R.iget(488)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(489)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(490);try {
							__CLR4_4_12121kv4p5gip.R.inc(491);child.removeData(data, distanceToChild);
							__CLR4_4_12121kv4p5gip.R.inc(492);thisNode.updateRadius(child);
							__CLR4_4_12121kv4p5gip.R.inc(493);return;
						} catch(DataNotFound e) {
							// If DataNotFound was thrown, then the data was not found in the child
						} catch(NodeUnderCapacity e) {
							__CLR4_4_12121kv4p5gip.R.inc(494);Node expandedChild = balanceChildren(child);
							__CLR4_4_12121kv4p5gip.R.inc(495);thisNode.updateRadius(expandedChild);
							__CLR4_4_12121kv4p5gip.R.inc(496);return;
						} catch (RootNodeReplacement e) {
							__CLR4_4_12121kv4p5gip.R.inc(497);throw new RuntimeException("Should never happen!");
						}
					}
				}}
			}}
			
			}__CLR4_4_12121kv4p5gip.R.inc(498);throw new DataNotFound();
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		
		private Node balanceChildren(Node theChild) {try{__CLR4_4_12121kv4p5gip.R.inc(499);
			// Tries to find anotherChild which can donate a grand-child to theChild.
			
			__CLR4_4_12121kv4p5gip.R.inc(500);Node nearestDonor = null;
			__CLR4_4_12121kv4p5gip.R.inc(501);double distanceNearestDonor = Double.POSITIVE_INFINITY;
			
			__CLR4_4_12121kv4p5gip.R.inc(502);Node nearestMergeCandidate = null;
			__CLR4_4_12121kv4p5gip.R.inc(503);double distanceNearestMergeCandidate = Double.POSITIVE_INFINITY;

			__CLR4_4_12121kv4p5gip.R.inc(504);for(IndexItem child : thisNode.children.values()) {{
				__CLR4_4_12121kv4p5gip.R.inc(505);@SuppressWarnings("unchecked")
				Node anotherChild = (Node)child;
				__CLR4_4_12121kv4p5gip.R.inc(506);if((((anotherChild == theChild)&&(__CLR4_4_12121kv4p5gip.R.iget(507)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(508)==0&false))) {__CLR4_4_12121kv4p5gip.R.inc(509);continue;

				}__CLR4_4_12121kv4p5gip.R.inc(510);double distance = thisNode.mtree().distanceFunction.calculate(theChild.data, anotherChild.data);
				__CLR4_4_12121kv4p5gip.R.inc(511);if((((anotherChild.children.size() > anotherChild.getMinCapacity())&&(__CLR4_4_12121kv4p5gip.R.iget(512)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(513)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(514);if((((distance < distanceNearestDonor)&&(__CLR4_4_12121kv4p5gip.R.iget(515)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(516)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(517);distanceNearestDonor = distance;
						__CLR4_4_12121kv4p5gip.R.inc(518);nearestDonor = anotherChild;
					}
				}} }else {{
					__CLR4_4_12121kv4p5gip.R.inc(519);if((((distance < distanceNearestMergeCandidate)&&(__CLR4_4_12121kv4p5gip.R.iget(520)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(521)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(522);distanceNearestMergeCandidate = distance;
						__CLR4_4_12121kv4p5gip.R.inc(523);nearestMergeCandidate = anotherChild;
					}
				}}
			}}

			}__CLR4_4_12121kv4p5gip.R.inc(524);if((((nearestDonor == null)&&(__CLR4_4_12121kv4p5gip.R.iget(525)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(526)==0&false))) {{
				// Merge
				__CLR4_4_12121kv4p5gip.R.inc(527);for(IndexItem grandchild : theChild.children.values()) {{
					__CLR4_4_12121kv4p5gip.R.inc(528);double distance = thisNode.mtree().distanceFunction.calculate(grandchild.data, nearestMergeCandidate.data);
					__CLR4_4_12121kv4p5gip.R.inc(529);nearestMergeCandidate.addChild(grandchild, distance);
				}

				}__CLR4_4_12121kv4p5gip.R.inc(530);IndexItem removed = thisNode.children.remove(theChild.data);
				assert (((removed != null)&&(__CLR4_4_12121kv4p5gip.R.iget(531)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(532)==0&false));
				__CLR4_4_12121kv4p5gip.R.inc(533);return nearestMergeCandidate;
			} }else {{
				// Donate
				// Look for the nearest grandchild
				__CLR4_4_12121kv4p5gip.R.inc(534);IndexItem nearestGrandchild = null;
				__CLR4_4_12121kv4p5gip.R.inc(535);double nearestGrandchildDistance = Double.POSITIVE_INFINITY;
				__CLR4_4_12121kv4p5gip.R.inc(536);for(IndexItem grandchild : nearestDonor.children.values()) {{
					__CLR4_4_12121kv4p5gip.R.inc(537);double distance = thisNode.mtree().distanceFunction.calculate(grandchild.data, theChild.data);
					__CLR4_4_12121kv4p5gip.R.inc(538);if((((distance < nearestGrandchildDistance)&&(__CLR4_4_12121kv4p5gip.R.iget(539)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(540)==0&false))) {{
						__CLR4_4_12121kv4p5gip.R.inc(541);nearestGrandchildDistance = distance;
						__CLR4_4_12121kv4p5gip.R.inc(542);nearestGrandchild = grandchild;
					}
				}}

				}__CLR4_4_12121kv4p5gip.R.inc(543);IndexItem _ = nearestDonor.children.remove(nearestGrandchild.data);
				assert (((_ != null)&&(__CLR4_4_12121kv4p5gip.R.iget(544)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(545)==0&false));
				__CLR4_4_12121kv4p5gip.R.inc(546);theChild.addChild(nearestGrandchild, nearestGrandchildDistance);
				__CLR4_4_12121kv4p5gip.R.inc(547);return theChild;
			}
		}}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}


		public void _checkChildClass(IndexItem child) {try{__CLR4_4_12121kv4p5gip.R.inc(548);
			assert (((child instanceof MTree.InternalNode
			    || child instanceof MTree.LeafNode)&&(__CLR4_4_12121kv4p5gip.R.iget(549)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(550)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}


	private class RootLeafNode extends Node {
		
		private RootLeafNode(DATA data) {
			super(data, new RootNodeTrait(), new LeafNodeTrait());__CLR4_4_12121kv4p5gip.R.inc(552);try{__CLR4_4_12121kv4p5gip.R.inc(551);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		void removeData(DATA data, double distance) throws RootNodeReplacement, DataNotFound {try{__CLR4_4_12121kv4p5gip.R.inc(553);
			__CLR4_4_12121kv4p5gip.R.inc(554);try {
				__CLR4_4_12121kv4p5gip.R.inc(555);super.removeData(data, distance);
			} catch (NodeUnderCapacity e) {
				assert (((children.isEmpty())&&(__CLR4_4_12121kv4p5gip.R.iget(556)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(557)==0&false));
				__CLR4_4_12121kv4p5gip.R.inc(558);throw new RootNodeReplacement(null);
			}
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		protected int getMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(559);
			__CLR4_4_12121kv4p5gip.R.inc(560);return 1;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}

		void _checkMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(561);
			assert (((children.size() >= 1)&&(__CLR4_4_12121kv4p5gip.R.iget(562)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(563)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}

	private class RootNode extends Node {

		private RootNode(DATA data) {
			super(data, new RootNodeTrait(), new NonLeafNodeTrait());__CLR4_4_12121kv4p5gip.R.inc(565);try{__CLR4_4_12121kv4p5gip.R.inc(564);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		void removeData(DATA data, double distance) throws RootNodeReplacement, NodeUnderCapacity, DataNotFound {try{__CLR4_4_12121kv4p5gip.R.inc(566);
			__CLR4_4_12121kv4p5gip.R.inc(567);try {
				__CLR4_4_12121kv4p5gip.R.inc(568);super.removeData(data, distance);
			} catch(NodeUnderCapacity e) {
				// Promote the only child to root
				__CLR4_4_12121kv4p5gip.R.inc(569);@SuppressWarnings("unchecked")
				Node theChild = (Node)(children.values().iterator().next());
				__CLR4_4_12121kv4p5gip.R.inc(570);Node newRoot;
				__CLR4_4_12121kv4p5gip.R.inc(571);if((((theChild instanceof MTree.InternalNode)&&(__CLR4_4_12121kv4p5gip.R.iget(572)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(573)==0&false))) {{
					__CLR4_4_12121kv4p5gip.R.inc(574);newRoot = new RootNode(theChild.data);
				} }else {{
					assert (((theChild instanceof MTree.LeafNode)&&(__CLR4_4_12121kv4p5gip.R.iget(575)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(576)==0&false));
					__CLR4_4_12121kv4p5gip.R.inc(577);newRoot = new RootLeafNode(theChild.data);
				}

				}__CLR4_4_12121kv4p5gip.R.inc(578);for(IndexItem grandchild : theChild.children.values()) {{
					__CLR4_4_12121kv4p5gip.R.inc(579);distance = MTree.this.distanceFunction.calculate(newRoot.data, grandchild.data);
					__CLR4_4_12121kv4p5gip.R.inc(580);newRoot.addChild(grandchild, distance);
				}
				}__CLR4_4_12121kv4p5gip.R.inc(581);theChild.children.clear();

				__CLR4_4_12121kv4p5gip.R.inc(582);throw new RootNodeReplacement(newRoot);
			}
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		
		@Override
		protected int getMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(583);
			__CLR4_4_12121kv4p5gip.R.inc(584);return 2;
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
		
		@Override
		void _checkMinCapacity() {try{__CLR4_4_12121kv4p5gip.R.inc(585);
			assert (((children.size() >= 2)&&(__CLR4_4_12121kv4p5gip.R.iget(586)!=0|true))||(__CLR4_4_12121kv4p5gip.R.iget(587)==0&false));
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}


	private class InternalNode extends Node {
		private InternalNode(DATA data) {
			super(data, new NonRootNodeTrait(), new NonLeafNodeTrait());__CLR4_4_12121kv4p5gip.R.inc(589);try{__CLR4_4_12121kv4p5gip.R.inc(588);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	};


	private class LeafNode extends Node {

		public LeafNode(DATA data) {
			super(data, new NonRootNodeTrait(), new LeafNodeTrait());__CLR4_4_12121kv4p5gip.R.inc(591);try{__CLR4_4_12121kv4p5gip.R.inc(590);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}


	private class Entry extends IndexItem {
		private Entry(DATA data) {
			super(data);__CLR4_4_12121kv4p5gip.R.inc(593);try{__CLR4_4_12121kv4p5gip.R.inc(592);
		}finally{__CLR4_4_12121kv4p5gip.R.flushNeeded();}}
	}
}
