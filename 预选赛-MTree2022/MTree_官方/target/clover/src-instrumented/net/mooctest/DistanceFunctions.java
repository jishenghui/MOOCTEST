/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Some pre-defined implementations of {@linkplain DistanceFunction distance
 * functions}.
 */
public final class DistanceFunctions {public static class __CLR4_4_177kv4p5ggi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047643911L,8589935092L,73,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
    /**
     * Don't let anyone instantiate this class.
     */
	private DistanceFunctions() {try{__CLR4_4_177kv4p5ggi.R.inc(7);}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
	
	
	/**
	 * Creates a cached version of a {@linkplain DistanceFunction distance
	 * function}. This method is used internally by {@link MTree} to create
	 * a cached distance function to pass to the {@linkplain SplitFunction split
	 * function}.
	 * @param distanceFunction The distance function to create a cached version
	 *        of.
	 * @return The cached distance function.
	 */
	public static <Data> DistanceFunction<Data> cached(final DistanceFunction<Data> distanceFunction) {try{__CLR4_4_177kv4p5ggi.R.inc(8);
		__CLR4_4_177kv4p5ggi.R.inc(9);return new DistanceFunction<Data>() {
			class Pair {
				Data data1;
				Data data2;
				
				public Pair(Data data1, Data data2) {try{__CLR4_4_177kv4p5ggi.R.inc(10);
					__CLR4_4_177kv4p5ggi.R.inc(11);this.data1 = data1;
					__CLR4_4_177kv4p5ggi.R.inc(12);this.data2 = data2;
				}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}

				@Override
				public int hashCode() {try{__CLR4_4_177kv4p5ggi.R.inc(13);
					__CLR4_4_177kv4p5ggi.R.inc(14);return data1.hashCode() ^ data2.hashCode();
				}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
				
				@Override
				public boolean equals(Object arg0) {try{__CLR4_4_177kv4p5ggi.R.inc(15);
					__CLR4_4_177kv4p5ggi.R.inc(16);if((((arg0 instanceof Pair)&&(__CLR4_4_177kv4p5ggi.R.iget(17)!=0|true))||(__CLR4_4_177kv4p5ggi.R.iget(18)==0&false))) {{
						__CLR4_4_177kv4p5ggi.R.inc(19);Pair that = (Pair) arg0;
						__CLR4_4_177kv4p5ggi.R.inc(20);return this.data1.equals(that.data1)
						    && this.data2.equals(that.data2);
					} }else {{
						__CLR4_4_177kv4p5ggi.R.inc(21);return false;
					}
				}}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
			}
			
			private final Map<Pair, Double> cache = new HashMap<Pair, Double>();
			
			@Override
			public double calculate(Data data1, Data data2) {try{__CLR4_4_177kv4p5ggi.R.inc(22);
				__CLR4_4_177kv4p5ggi.R.inc(23);Pair pair1 = new Pair(data1, data2);
				__CLR4_4_177kv4p5ggi.R.inc(24);Double distance = cache.get(pair1);
				__CLR4_4_177kv4p5ggi.R.inc(25);if((((distance != null)&&(__CLR4_4_177kv4p5ggi.R.iget(26)!=0|true))||(__CLR4_4_177kv4p5ggi.R.iget(27)==0&false))) {{
					__CLR4_4_177kv4p5ggi.R.inc(28);return distance;
				}
				
				}__CLR4_4_177kv4p5ggi.R.inc(29);Pair pair2 = new Pair(data2, data1);
				__CLR4_4_177kv4p5ggi.R.inc(30);distance = cache.get(pair2);
				__CLR4_4_177kv4p5ggi.R.inc(31);if((((distance != null)&&(__CLR4_4_177kv4p5ggi.R.iget(32)!=0|true))||(__CLR4_4_177kv4p5ggi.R.iget(33)==0&false))) {{
					__CLR4_4_177kv4p5ggi.R.inc(34);return distance;
				}
				
				}__CLR4_4_177kv4p5ggi.R.inc(35);distance = distanceFunction.calculate(data1, data2);
				__CLR4_4_177kv4p5ggi.R.inc(36);cache.put(pair1, distance);
				__CLR4_4_177kv4p5ggi.R.inc(37);cache.put(pair2, distance);
				__CLR4_4_177kv4p5ggi.R.inc(38);return distance;
			}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
		};
	}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
	
	
	
	/**
	 * An interface to represent coordinates in Euclidean spaces.
	 * @see <a href="http://en.wikipedia.org/wiki/Euclidean_space">"Euclidean
	 *      Space" article at Wikipedia</a>
	 */
	public interface EuclideanCoordinate {
		/**
		 * The number of dimensions.
		 */
		int dimensions();
		
		/**
		 * A method to access the {@code index}-th component of the coordinate.
		 * 
		 * @param index The index of the component. Must be less than {@link
		 *              #dimensions()}. 
		 */
		double get(int index);
	}
	
	
	/**
	 * Calculates the distance between two {@linkplain EuclideanCoordinate 
	 * euclidean coordinates}.
	 */
	public static double euclidean(EuclideanCoordinate coord1, EuclideanCoordinate coord2) {try{__CLR4_4_177kv4p5ggi.R.inc(39);
		__CLR4_4_177kv4p5ggi.R.inc(40);int size = Math.min(coord1.dimensions(), coord2.dimensions());
		__CLR4_4_177kv4p5ggi.R.inc(41);double distance = 0;
		__CLR4_4_177kv4p5ggi.R.inc(42);for(int i = 0; (((i < size)&&(__CLR4_4_177kv4p5ggi.R.iget(43)!=0|true))||(__CLR4_4_177kv4p5ggi.R.iget(44)==0&false)); i++) {{
			__CLR4_4_177kv4p5ggi.R.inc(45);double diff = coord1.get(i) - coord2.get(i);
			__CLR4_4_177kv4p5ggi.R.inc(46);distance += diff * diff;
		}
		}__CLR4_4_177kv4p5ggi.R.inc(47);distance = Math.sqrt(distance);
		__CLR4_4_177kv4p5ggi.R.inc(48);return distance;
	}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}


	/**
	 * A {@linkplain DistanceFunction distance function} object that calculates
	 * the distance between two {@linkplain EuclideanCoordinate euclidean
	 * coordinates}.
	 */
	public static final DistanceFunction<EuclideanCoordinate> EUCLIDEAN = new DistanceFunction<DistanceFunctions.EuclideanCoordinate>() {
		@Override
		public double calculate(EuclideanCoordinate coord1, EuclideanCoordinate coord2) {try{__CLR4_4_177kv4p5ggi.R.inc(49);
			__CLR4_4_177kv4p5ggi.R.inc(50);return DistanceFunctions.euclidean(coord1, coord2);
		}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
	};
	
	
	/**
	 * A {@linkplain DistanceFunction distance function} object that calculates
	 * the distance between two coordinates represented by {@linkplain 
	 * java.util.List lists} of {@link java.lang.Integer}s.
	 */
	public static final DistanceFunction<List<Integer>> EUCLIDEAN_INTEGER_LIST = new DistanceFunction<List<Integer>>() {
		@Override
		public double calculate(List<Integer> data1, List<Integer> data2) {try{__CLR4_4_177kv4p5ggi.R.inc(51);
			class IntegerListEuclideanCoordinate implements EuclideanCoordinate {
				List<Integer> list;
				public IntegerListEuclideanCoordinate(List<Integer> list) {try{__CLR4_4_177kv4p5ggi.R.inc(52); __CLR4_4_177kv4p5ggi.R.inc(53);this.list = list; }finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
				@Override public int dimensions() {try{__CLR4_4_177kv4p5ggi.R.inc(54); __CLR4_4_177kv4p5ggi.R.inc(55);return list.size(); }finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
				@Override public double get(int index) {try{__CLR4_4_177kv4p5ggi.R.inc(56); __CLR4_4_177kv4p5ggi.R.inc(57);return list.get(index); }finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
			}__CLR4_4_177kv4p5ggi.R.inc(58);;
			__CLR4_4_177kv4p5ggi.R.inc(59);IntegerListEuclideanCoordinate coord1 = new IntegerListEuclideanCoordinate(data1);
			__CLR4_4_177kv4p5ggi.R.inc(60);IntegerListEuclideanCoordinate coord2 = new IntegerListEuclideanCoordinate(data2);
			__CLR4_4_177kv4p5ggi.R.inc(61);return DistanceFunctions.euclidean(coord1, coord2);
		}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
	};
	
	/**
	 * A {@linkplain DistanceFunction distance function} object that calculates
	 * the distance between two coordinates represented by {@linkplain 
	 * java.util.List lists} of {@link java.lang.Double}s.
	 */
	public static final DistanceFunction<List<Double>> EUCLIDEAN_DOUBLE_LIST = new DistanceFunction<List<Double>>() {
		@Override
		public double calculate(List<Double> data1, List<Double> data2) {try{__CLR4_4_177kv4p5ggi.R.inc(62);
			class DoubleListEuclideanCoordinate implements EuclideanCoordinate {
				List<Double> list;
				public DoubleListEuclideanCoordinate(List<Double> list) {try{__CLR4_4_177kv4p5ggi.R.inc(63); __CLR4_4_177kv4p5ggi.R.inc(64);this.list = list; }finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
				@Override public int dimensions() {try{__CLR4_4_177kv4p5ggi.R.inc(65); __CLR4_4_177kv4p5ggi.R.inc(66);return list.size(); }finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
				@Override public double get(int index) {try{__CLR4_4_177kv4p5ggi.R.inc(67); __CLR4_4_177kv4p5ggi.R.inc(68);return list.get(index); }finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
			}__CLR4_4_177kv4p5ggi.R.inc(69);;
			__CLR4_4_177kv4p5ggi.R.inc(70);DoubleListEuclideanCoordinate coord1 = new DoubleListEuclideanCoordinate(data1);
			__CLR4_4_177kv4p5ggi.R.inc(71);DoubleListEuclideanCoordinate coord2 = new DoubleListEuclideanCoordinate(data2);
			__CLR4_4_177kv4p5ggi.R.inc(72);return DistanceFunctions.euclidean(coord1, coord2);
		}finally{__CLR4_4_177kv4p5ggi.R.flushNeeded();}}
	};
}
