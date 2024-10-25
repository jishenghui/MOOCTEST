/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Some pre-defined implementations of {@linkplain PartitionFunction partition
 * functions}.
 */
public final class PartitionFunctions {public static class __CLR4_4_1gugukv4p5gk1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047643911L,8589935092L,645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Don't let anyone instantiate this class.
     */
	private PartitionFunctions() {try{__CLR4_4_1gugukv4p5gk1.R.inc(606);}finally{__CLR4_4_1gugukv4p5gk1.R.flushNeeded();}}
	
	
	/**
	 * A {@linkplain PartitionFunction partition function} that tries to
	 * distribute the data objects equally between the promoted data objects,
	 * associating to each promoted data objects the nearest data objects.
	 * 
	 * @param <DATA> The type of the data objects.
	 */
	public static class BalancedPartition<DATA> implements PartitionFunction<DATA> {
		
		/**
		 * Processes the balanced partition.
		 * 
		 * <p>The algorithm is roughly equivalent to this:
		 * <pre>
		 *     While dataSet is not Empty:
		 *         X := The object in dataSet which is nearest to promoted.<b>first</b>
		 *         Remove X from dataSet
		 *         Add X to result.<b>first</b>
		 *         
		 *         Y := The object in dataSet which is nearest to promoted.<b>second</b>
		 *         Remove Y from dataSet
		 *         Add Y to result.<b>second</b>
		 *         
		 *     Return result
		 * </pre>
		 * 
		 * @see mtree.PartitionFunction#process(mtree.utils.Pair, java.util.Set, mtree.DistanceFunction)
		 */
		@Override
		public Pair<Set<DATA>> process(
				final Pair<DATA> promoted,
				Set<DATA> dataSet,
				final DistanceFunction<? super DATA> distanceFunction
			)
		{try{__CLR4_4_1gugukv4p5gk1.R.inc(607);
			__CLR4_4_1gugukv4p5gk1.R.inc(608);List<DATA> queue1 = new ArrayList<DATA>(dataSet);
			// Sort by distance to the first promoted data
			__CLR4_4_1gugukv4p5gk1.R.inc(609);Collections.sort(queue1, new Comparator<DATA>() {
				@Override
				public int compare(DATA data1, DATA data2) {try{__CLR4_4_1gugukv4p5gk1.R.inc(610);
					__CLR4_4_1gugukv4p5gk1.R.inc(611);double distance1 = distanceFunction.calculate(data1, promoted.first);
					__CLR4_4_1gugukv4p5gk1.R.inc(612);double distance2 = distanceFunction.calculate(data2, promoted.first);
					__CLR4_4_1gugukv4p5gk1.R.inc(613);return Double.compare(distance1, distance2);
				}finally{__CLR4_4_1gugukv4p5gk1.R.flushNeeded();}}
			});
			
			__CLR4_4_1gugukv4p5gk1.R.inc(614);List<DATA> queue2 = new ArrayList<DATA>(dataSet);
			// Sort by distance to the second promoted data
			__CLR4_4_1gugukv4p5gk1.R.inc(615);Collections.sort(queue2, new Comparator<DATA>() {
				@Override
				public int compare(DATA data1, DATA data2) {try{__CLR4_4_1gugukv4p5gk1.R.inc(616);
					__CLR4_4_1gugukv4p5gk1.R.inc(617);double distance1 = distanceFunction.calculate(data1, promoted.second);
					__CLR4_4_1gugukv4p5gk1.R.inc(618);double distance2 = distanceFunction.calculate(data2, promoted.second);
					__CLR4_4_1gugukv4p5gk1.R.inc(619);return Double.compare(distance1, distance2);
				}finally{__CLR4_4_1gugukv4p5gk1.R.flushNeeded();}}
			});
			
			__CLR4_4_1gugukv4p5gk1.R.inc(620);Pair<Set<DATA>> partitions = new Pair<Set<DATA>>(new HashSet<DATA>(), new HashSet<DATA>());
			
			__CLR4_4_1gugukv4p5gk1.R.inc(621);int index1 = 0;
			__CLR4_4_1gugukv4p5gk1.R.inc(622);int index2 = 0;
	
			__CLR4_4_1gugukv4p5gk1.R.inc(623);while((((index1 < queue1.size()  ||  index2 != queue2.size())&&(__CLR4_4_1gugukv4p5gk1.R.iget(624)!=0|true))||(__CLR4_4_1gugukv4p5gk1.R.iget(625)==0&false))) {{
				__CLR4_4_1gugukv4p5gk1.R.inc(626);while((((index1 < queue1.size())&&(__CLR4_4_1gugukv4p5gk1.R.iget(627)!=0|true))||(__CLR4_4_1gugukv4p5gk1.R.iget(628)==0&false))) {{
					__CLR4_4_1gugukv4p5gk1.R.inc(629);DATA data = queue1.get(index1++);
					__CLR4_4_1gugukv4p5gk1.R.inc(630);if((((!partitions.second.contains(data))&&(__CLR4_4_1gugukv4p5gk1.R.iget(631)!=0|true))||(__CLR4_4_1gugukv4p5gk1.R.iget(632)==0&false))) {{
						__CLR4_4_1gugukv4p5gk1.R.inc(633);partitions.first.add(data);
						__CLR4_4_1gugukv4p5gk1.R.inc(634);break;
					}
				}}
	
				}__CLR4_4_1gugukv4p5gk1.R.inc(635);while((((index2 < queue2.size())&&(__CLR4_4_1gugukv4p5gk1.R.iget(636)!=0|true))||(__CLR4_4_1gugukv4p5gk1.R.iget(637)==0&false))) {{
					__CLR4_4_1gugukv4p5gk1.R.inc(638);DATA data = queue2.get(index2++);
					__CLR4_4_1gugukv4p5gk1.R.inc(639);if((((!partitions.first.contains(data))&&(__CLR4_4_1gugukv4p5gk1.R.iget(640)!=0|true))||(__CLR4_4_1gugukv4p5gk1.R.iget(641)==0&false))) {{
						__CLR4_4_1gugukv4p5gk1.R.inc(642);partitions.second.add(data);
						__CLR4_4_1gugukv4p5gk1.R.inc(643);break;
					}
				}}
			}}
			
			}__CLR4_4_1gugukv4p5gk1.R.inc(644);return partitions;
		}finally{__CLR4_4_1gugukv4p5gk1.R.flushNeeded();}}
	}
}
