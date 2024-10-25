/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Set;


/**
 * A {@linkplain SplitFunction split function} that is defined by composing
 * a {@linkplain PromotionFunction promotion function} and a
 * {@linkplain PartitionFunction partition function}.
 *
 * @param <DATA> The type of the data objects.
 */
public class ComposedSplitFunction<DATA> implements SplitFunction<DATA> {public static class __CLR4_4_100kv4p5gf5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047643911L,8589935092L,7,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private PromotionFunction<DATA> promotionFunction;
	private PartitionFunction<DATA> partitionFunction;

	/**
	 * The constructor of a {@link SplitFunction} composed by a
	 * {@link PromotionFunction} and a {@link PartitionFunction}.
	 */
	public ComposedSplitFunction(
			PromotionFunction<DATA> promotionFunction,
			PartitionFunction<DATA> partitionFunction
		)
	{try{__CLR4_4_100kv4p5gf5.R.inc(0);
		__CLR4_4_100kv4p5gf5.R.inc(1);this.promotionFunction = promotionFunction;
		__CLR4_4_100kv4p5gf5.R.inc(2);this.partitionFunction = partitionFunction;
	}finally{__CLR4_4_100kv4p5gf5.R.flushNeeded();}}

	
	@Override
	public SplitResult<DATA> process(Set<DATA> dataSet, DistanceFunction<? super DATA> distanceFunction) {try{__CLR4_4_100kv4p5gf5.R.inc(3);
		__CLR4_4_100kv4p5gf5.R.inc(4);Pair<DATA> promoted = promotionFunction.process(dataSet, distanceFunction);
		__CLR4_4_100kv4p5gf5.R.inc(5);Pair<Set<DATA>> partitions = partitionFunction.process(promoted, dataSet, distanceFunction);
		__CLR4_4_100kv4p5gf5.R.inc(6);return new SplitResult<DATA>(promoted, partitions);
	}finally{__CLR4_4_100kv4p5gf5.R.flushNeeded();}}

}
