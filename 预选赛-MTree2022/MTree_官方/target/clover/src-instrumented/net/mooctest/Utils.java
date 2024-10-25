/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Some utilities.
 */
public final class Utils {public static class __CLR4_4_1i4i4kv4p5gkr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u004d\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047643911L,8589935092L,691,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Don't let anyone instantiate this class.
     */
	private Utils() {try{__CLR4_4_1i4i4kv4p5gkr.R.inc(652);}finally{__CLR4_4_1i4i4kv4p5gkr.R.flushNeeded();}}

	
	/**
	 * Identifies the minimum and maximum elements from an iterable, according
	 * to the natural ordering of the elements.
	 * @param items An {@link Iterable} object with the elements
	 * @param <T> The type of the elements.
	 * @return A pair with the minimum and maximum elements.
	 */
	public static <T extends Comparable<T>> Pair<T> minMax(Iterable<T> items) {try{__CLR4_4_1i4i4kv4p5gkr.R.inc(653);
		__CLR4_4_1i4i4kv4p5gkr.R.inc(654);Iterator<T> iterator = items.iterator();
		__CLR4_4_1i4i4kv4p5gkr.R.inc(655);if((((!iterator.hasNext())&&(__CLR4_4_1i4i4kv4p5gkr.R.iget(656)!=0|true))||(__CLR4_4_1i4i4kv4p5gkr.R.iget(657)==0&false))) {{
			__CLR4_4_1i4i4kv4p5gkr.R.inc(658);return null;
		}
		
		}__CLR4_4_1i4i4kv4p5gkr.R.inc(659);T min = iterator.next();
		__CLR4_4_1i4i4kv4p5gkr.R.inc(660);T max = min;
		
		__CLR4_4_1i4i4kv4p5gkr.R.inc(661);while((((iterator.hasNext())&&(__CLR4_4_1i4i4kv4p5gkr.R.iget(662)!=0|true))||(__CLR4_4_1i4i4kv4p5gkr.R.iget(663)==0&false))) {{
			__CLR4_4_1i4i4kv4p5gkr.R.inc(664);T item = iterator.next();
			__CLR4_4_1i4i4kv4p5gkr.R.inc(665);if((((item.compareTo(min) < 0)&&(__CLR4_4_1i4i4kv4p5gkr.R.iget(666)!=0|true))||(__CLR4_4_1i4i4kv4p5gkr.R.iget(667)==0&false))) {{
				__CLR4_4_1i4i4kv4p5gkr.R.inc(668);min = item;
			}
			}__CLR4_4_1i4i4kv4p5gkr.R.inc(669);if((((item.compareTo(max) > 0)&&(__CLR4_4_1i4i4kv4p5gkr.R.iget(670)!=0|true))||(__CLR4_4_1i4i4kv4p5gkr.R.iget(671)==0&false))) {{
				__CLR4_4_1i4i4kv4p5gkr.R.inc(672);max = item;
			}
		}}
		
		}__CLR4_4_1i4i4kv4p5gkr.R.inc(673);return new Pair<T>(min, max);
	}finally{__CLR4_4_1i4i4kv4p5gkr.R.flushNeeded();}}
	
	
	/**
	 * Randomly chooses elements from the collection.
	 * @param collection The collection.
	 * @param n The number of elements to choose.
	 * @param <T> The type of the elements.
	 * @return A list with the chosen elements.
	 */
	public static <T> List<T> randomSample(Collection<T> collection, int n) {try{__CLR4_4_1i4i4kv4p5gkr.R.inc(674);
		__CLR4_4_1i4i4kv4p5gkr.R.inc(675);List<T> list = new ArrayList<T>(collection);
		__CLR4_4_1i4i4kv4p5gkr.R.inc(676);List<T> sample = new ArrayList<T>(n);
		__CLR4_4_1i4i4kv4p5gkr.R.inc(677);Random random = new Random();
		__CLR4_4_1i4i4kv4p5gkr.R.inc(678);while((((n > 0  &&  !list.isEmpty())&&(__CLR4_4_1i4i4kv4p5gkr.R.iget(679)!=0|true))||(__CLR4_4_1i4i4kv4p5gkr.R.iget(680)==0&false))) {{
			__CLR4_4_1i4i4kv4p5gkr.R.inc(681);int index = random.nextInt(list.size());
			__CLR4_4_1i4i4kv4p5gkr.R.inc(682);sample.add(list.get(index));
			__CLR4_4_1i4i4kv4p5gkr.R.inc(683);int indexLast = list.size() - 1;
			__CLR4_4_1i4i4kv4p5gkr.R.inc(684);T last = list.remove(indexLast);
			__CLR4_4_1i4i4kv4p5gkr.R.inc(685);if((((index < indexLast)&&(__CLR4_4_1i4i4kv4p5gkr.R.iget(686)!=0|true))||(__CLR4_4_1i4i4kv4p5gkr.R.iget(687)==0&false))) {{
				__CLR4_4_1i4i4kv4p5gkr.R.inc(688);list.set(index, last);
			}
			}__CLR4_4_1i4i4kv4p5gkr.R.inc(689);n--;
		}
		}__CLR4_4_1i4i4kv4p5gkr.R.inc(690);return sample;
	}finally{__CLR4_4_1i4i4kv4p5gkr.R.flushNeeded();}}
	
}
