/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import java.util.Arrays;

public class SplayTree <T extends Comparable<T>> {public static class __CLR4_4_1dudull4usq5h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0038\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0050\u004c\u0041\u0059\u0054\u0052\u0045\u0045\u0031\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691653466433L,8589935092L,538,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	SplaySubTree<T> root;
	
	public SplayTree(){try{__CLR4_4_1dudull4usq5h.R.inc(498);
		__CLR4_4_1dudull4usq5h.R.inc(499);root = new SplaySubTree<T>(null);
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}
	
	/**
	 * @param index - of the node to search for.
	 * @return  - null if index<=0 or index>=size otherwise SubTree at index. 
	 */
	public T get(long index) {try{__CLR4_4_1dudull4usq5h.R.inc(500);
		__CLR4_4_1dudull4usq5h.R.inc(501);SplaySubTree<T> cT = root.get(index);
		__CLR4_4_1dudull4usq5h.R.inc(502);if((((cT==null)&&(__CLR4_4_1dudull4usq5h.R.iget(503)!=0|true))||(__CLR4_4_1dudull4usq5h.R.iget(504)==0&false))){__CLR4_4_1dudull4usq5h.R.inc(505);return null;
		}__CLR4_4_1dudull4usq5h.R.inc(506);cT.splay();
		__CLR4_4_1dudull4usq5h.R.inc(507);root = cT;
		__CLR4_4_1dudull4usq5h.R.inc(508);return cT.getData();
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}
	
	/**
	 * @return - the number of nodes in the tree.
	 */
	public long size() {try{__CLR4_4_1dudull4usq5h.R.inc(509); __CLR4_4_1dudull4usq5h.R.inc(510);return root.size();}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}

	/**
	 * @param node - to search for.
	 * @return - the index of node. All nodes are ordered according to the compareTo(T) method.
	 *         
	 */
	public long indexOf(T node) {try{__CLR4_4_1dudull4usq5h.R.inc(511);
		__CLR4_4_1dudull4usq5h.R.inc(512);long index = root.indexOf(node);
		__CLR4_4_1dudull4usq5h.R.inc(513);get(index);
		__CLR4_4_1dudull4usq5h.R.inc(514);return index;
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}
	
	/**
	 * @param node - is added to the tree.
	 *             If node is null tree is unchanged.
	 */
	public void add(T node) {try{__CLR4_4_1dudull4usq5h.R.inc(515);
		__CLR4_4_1dudull4usq5h.R.inc(516);root = root.add(node);
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}
	
	/**
	 * @param node - is removed from the tree.
	 *             If node is null tree is unchanged.
	 */
	public void remove(T node) {try{__CLR4_4_1dudull4usq5h.R.inc(517);
		__CLR4_4_1dudull4usq5h.R.inc(518);root = root.remove(node);
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}
	
	/**
	 * @param node
	 * @return
	 */
	public boolean contains(T node) {try{__CLR4_4_1dudull4usq5h.R.inc(519);
		__CLR4_4_1dudull4usq5h.R.inc(520);SplaySubTree<T> temp = root.find(node);
		__CLR4_4_1dudull4usq5h.R.inc(521);if((((temp!=null)&&(__CLR4_4_1dudull4usq5h.R.iget(522)!=0|true))||(__CLR4_4_1dudull4usq5h.R.iget(523)==0&false))){{
			__CLR4_4_1dudull4usq5h.R.inc(524);temp.splay();
			__CLR4_4_1dudull4usq5h.R.inc(525);root = temp;
		}
		}__CLR4_4_1dudull4usq5h.R.inc(526);return temp != null;
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}
	
	@Override
	public String toString(){try{__CLR4_4_1dudull4usq5h.R.inc(527);
		__CLR4_4_1dudull4usq5h.R.inc(528);return root.toString();
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}

	public static void main(String[] args) {try{__CLR4_4_1dudull4usq5h.R.inc(529);
		__CLR4_4_1dudull4usq5h.R.inc(530);SplayTree<Integer> test = new SplayTree<Integer>();
		__CLR4_4_1dudull4usq5h.R.inc(531);int howmanynumbers = 10000;
		__CLR4_4_1dudull4usq5h.R.inc(532);for (int i = 0; (((i < howmanynumbers)&&(__CLR4_4_1dudull4usq5h.R.iget(533)!=0|true))||(__CLR4_4_1dudull4usq5h.R.iget(534)==0&false)); i++) {{
			__CLR4_4_1dudull4usq5h.R.inc(535);int val = (int)(Math.random()*100);
//			System.out.print(val + " ");
//			System.out.println("size=" + test.size());
			__CLR4_4_1dudull4usq5h.R.inc(536);test.add(val);
		}
//		System.out.println();
		
//		test.add(2);
//		test.add(3);
//		test.add(1);
//		test.add(5);
		
		//Hello World
		
		}__CLR4_4_1dudull4usq5h.R.inc(537);System.out.println(test.size());
		//System.out.println(test);
	}finally{__CLR4_4_1dudull4usq5h.R.flushNeeded();}}
}
