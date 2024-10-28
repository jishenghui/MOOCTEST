/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Set;

/**
 * Defines an object to be used to split a node in an M-Tree. A node must be
 * split when it has reached its maximum capacity and a new child node would be
 * added to it.
 * 
 * <p>The splitting consists in choosing a pair of "promoted" data objects from
 * the children and then partition the set of children in two partitions
 * corresponding to the two promoted data objects.
 *
 * @param <DATA> The type of the data objects.
 */
public interface SplitFunction<DATA> {public static class __CLR4_4_1i1i1kv4p5gki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047643911L,8589935092L,652,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * Processes the splitting of a node.
	 * 
	 * @param dataSet A set of data that are keys to the children of the node
	 *        to be split.
	 * @param distanceFunction A {@linkplain DistanceFunction distance function}
	 *        that can be used to help splitting the node.
	 * @return A {@link SplitResult} object with a pair of promoted data objects
	 *         and a pair of corresponding partitions of the data objects.
	 */
	SplitResult<DATA> process(Set<DATA> dataSet, DistanceFunction<? super DATA> distanceFunction);
	
	
	/**
	 * An object used as the result for the
	 * {@link SplitFunction#process(Set, DistanceFunction)} method.
	 *
	 * @param <DATA> The type of the data objects.
	 */
	public static class SplitResult<DATA> {

		/**
		 * A pair of promoted data objects.
		 */
		public Pair<DATA> promoted;
		
		/**
		 * A pair of partitions corresponding to the {@code promoted} data
		 * objects.
		 */
		public Pair<Set<DATA>> partitions;

		/**
		 * The constructor for a {@link SplitResult} object.
		 */
		public SplitResult(Pair<DATA> promoted, Pair<Set<DATA>> partitions) {try{__CLR4_4_1i1i1kv4p5gki.R.inc(649);
			__CLR4_4_1i1i1kv4p5gki.R.inc(650);this.promoted = promoted;
			__CLR4_4_1i1i1kv4p5gki.R.inc(651);this.partitions = partitions;
		}finally{__CLR4_4_1i1i1kv4p5gki.R.flushNeeded();}}
		
	}
	
}
