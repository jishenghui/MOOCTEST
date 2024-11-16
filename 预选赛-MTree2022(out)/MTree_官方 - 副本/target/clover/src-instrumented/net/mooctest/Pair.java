/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

/**
 * A pair of objects of the same type.
 *
 * @param <T> The type of the objects.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Pair<T> {public static class __CLR4_4_1gigikv4p5gjj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047643911L,8589935092L,606,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	/**
	 * The first object.
	 */
	public T first;
	
	
	/**
	 * The second object.
	 */
	public T second;
	
	/**
	 * Creates a pair of {@code null} objects.
	 */
	public Pair() {try{__CLR4_4_1gigikv4p5gjj.R.inc(594);}finally{__CLR4_4_1gigikv4p5gjj.R.flushNeeded();}}
	
	/**
	 * Creates a pair with the objects specified in the arguments.
	 * @param first  The first object.
	 * @param second The second object.
	 */
	public Pair(T first, T second) {try{__CLR4_4_1gigikv4p5gjj.R.inc(595);
		__CLR4_4_1gigikv4p5gjj.R.inc(596);this.first = first;
		__CLR4_4_1gigikv4p5gjj.R.inc(597);this.second = second;
	}finally{__CLR4_4_1gigikv4p5gjj.R.flushNeeded();}}

	/**
	 * Accesses an object by its index. The {@link #first} object has index
	 * {@code 0} and the {@link #second} object has index {@code 1}.
	 * @param index The index of the object to be accessed.
	 * @return The {@link #first} object if {@code index} is {@code 0}; the
	 *         {@link #second} object if {@code index} is {@code 1}.
	 * @throws IllegalArgumentException If {@code index} is neither {@code 0}
	 *         or {@code 1}.
	 */
	public T get(int index) throws IllegalArgumentException {try{__CLR4_4_1gigikv4p5gjj.R.inc(598);
		boolean __CLB4_4_1_bool0=false;__CLR4_4_1gigikv4p5gjj.R.inc(599);switch(index) {
		case 0:if (!__CLB4_4_1_bool0) {__CLR4_4_1gigikv4p5gjj.R.inc(600);__CLB4_4_1_bool0=true;} __CLR4_4_1gigikv4p5gjj.R.inc(601);return first;
		case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_1gigikv4p5gjj.R.inc(602);__CLB4_4_1_bool0=true;} __CLR4_4_1gigikv4p5gjj.R.inc(603);return second;
		default:if (!__CLB4_4_1_bool0) {__CLR4_4_1gigikv4p5gjj.R.inc(604);__CLB4_4_1_bool0=true;} __CLR4_4_1gigikv4p5gjj.R.inc(605);throw new IllegalArgumentException();
		}
	}finally{__CLR4_4_1gigikv4p5gjj.R.flushNeeded();}}

}
