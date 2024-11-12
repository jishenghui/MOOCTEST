/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

// YOU SHOULD NOT MODIFY THIS FILE

/**
 * A 2-dimensional point. We represent a point as a 2-element array of type
 * float.
 */

public class Point2D {public static class __CLR4_4_1cscslo0xvj0x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697947119799L,8589935092L,494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	final static int DIM = 2; // spatial dimension
	float[] coord; // coordinates

	/**
	 * Default constructor.
	 * 
	 */
	public Point2D() {try{__CLR4_4_1cscslo0xvj0x.R.inc(460);
		__CLR4_4_1cscslo0xvj0x.R.inc(461);coord = new float[DIM];
		__CLR4_4_1cscslo0xvj0x.R.inc(462);for (int i = 0; (((i < DIM)&&(__CLR4_4_1cscslo0xvj0x.R.iget(463)!=0|true))||(__CLR4_4_1cscslo0xvj0x.R.iget(464)==0&false)); i++)
			{__CLR4_4_1cscslo0xvj0x.R.inc(465);coord[i] = 0;
	}}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

	/**
	 * Construct from coordinates.
	 * 
	 * @param coord The array of coordinates.
	 */
	public Point2D(float x, float y) {try{__CLR4_4_1cscslo0xvj0x.R.inc(466);
		__CLR4_4_1cscslo0xvj0x.R.inc(467);coord = new float[DIM];
		__CLR4_4_1cscslo0xvj0x.R.inc(468);coord[0] = x;
		__CLR4_4_1cscslo0xvj0x.R.inc(469);coord[1] = y;
	}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

	/**
	 * Construct from a 2-element coordinate array.
	 * 
	 * @param coord The array of coordinates.
	 */
	public Point2D(float[] coord) {try{__CLR4_4_1cscslo0xvj0x.R.inc(470);
		assert((((coord.length == DIM))&&(__CLR4_4_1cscslo0xvj0x.R.iget(471)!=0|true))||(__CLR4_4_1cscslo0xvj0x.R.iget(472)==0&false));
		__CLR4_4_1cscslo0xvj0x.R.inc(473);this.coord = new float[DIM];
		__CLR4_4_1cscslo0xvj0x.R.inc(474);for (int i = 0; (((i < DIM)&&(__CLR4_4_1cscslo0xvj0x.R.iget(475)!=0|true))||(__CLR4_4_1cscslo0xvj0x.R.iget(476)==0&false)); i++)
			{__CLR4_4_1cscslo0xvj0x.R.inc(477);this.coord[i] = coord[i];
	}}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

	/**
	 * Copy constructor.
	 * 
	 * @param p The point to copy.
	 */
	public Point2D(Point2D p) {try{__CLR4_4_1cscslo0xvj0x.R.inc(478);
		__CLR4_4_1cscslo0xvj0x.R.inc(479);coord = new float[DIM];
		__CLR4_4_1cscslo0xvj0x.R.inc(480);for (int i = 0; (((i < DIM)&&(__CLR4_4_1cscslo0xvj0x.R.iget(481)!=0|true))||(__CLR4_4_1cscslo0xvj0x.R.iget(482)==0&false)); i++)
			{__CLR4_4_1cscslo0xvj0x.R.inc(483);coord[i] = p.get(i);
	}}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

	/**
	 * Get the dimension.
	 * 
	 * @return The dimension
	 */
	public static int getDim() {try{__CLR4_4_1cscslo0xvj0x.R.inc(484);
		__CLR4_4_1cscslo0xvj0x.R.inc(485);return DIM;
	}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

	/**
	 * Get the i-th coordinate (i=0 for x, i=1 for y).
	 * 
	 * @param i The coordinate index 0 or 1.
	 * @return The i-th coordinate of the point.
	 */
	public float get(int i) {try{__CLR4_4_1cscslo0xvj0x.R.inc(486);
		__CLR4_4_1cscslo0xvj0x.R.inc(487);return coord[i];
	}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

	/**
	 * Get the x-coordinate.
	 * 
	 * @return The x-coordinate of the point.
	 */
	public float getX() {try{__CLR4_4_1cscslo0xvj0x.R.inc(488);
		__CLR4_4_1cscslo0xvj0x.R.inc(489);return coord[0];
	}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

	/**
	 * Get the y-coordinate.
	 * 
	 * @return The y-coordinate of the point.
	 */
	public float getY() {try{__CLR4_4_1cscslo0xvj0x.R.inc(490);
		__CLR4_4_1cscslo0xvj0x.R.inc(491);return coord[1];
	}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}
	
	/**
	 * Express point as a string.
	 * 
	 * @return String representation of the point.
	 */
	public String toString() {try{__CLR4_4_1cscslo0xvj0x.R.inc(492);
		__CLR4_4_1cscslo0xvj0x.R.inc(493);return "(" + coord[0] + "," + coord[1] + ")";
	}finally{__CLR4_4_1cscslo0xvj0x.R.flushNeeded();}}

}
