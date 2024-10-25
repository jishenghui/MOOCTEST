/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

// YOU SHOULD NOT MODIFY THIS FILE

/**
 * Airport object. An airport is represented by its:
 *   - 3-letter IATA code name (e.g., "LAX")
 *   - name (e.g., "Los Angeles International")
 *   - city (e.g., "Los Angeles"
 *   - country (e.g., "USA")
 *   - coordinates (x,y), given as longitude (-180...180) and latitude (-90...+90)
 */
public class Airport {public static class __CLR4_4_100lo0x9to1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0034\u0032\u0033\u0035\u0038\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697946106729L,8589935092L,48,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	// Private data (The x,y coordinates are provided by the Point2D class)
	
    private final String code; // IATA code
    private final String name; // airport name
    private final String city; // city
    private final String country; // country
	private final Point2D location; // coordinates

    /** Basic constructor.
     * @param code IATA code (String)
     * @param name full name (String)
     * @param city city (String)
     * @param country country (String)
     * @param x x-coordinate [longitude] (float)
     * @param y y-coordinate [latitude] (float)
     */
    public Airport(String code, String name, String city, String country, float x, float y) {try{__CLR4_4_100lo0x9to1.R.inc(0);
        __CLR4_4_100lo0x9to1.R.inc(1);this.code = code;
        __CLR4_4_100lo0x9to1.R.inc(2);this.name = name;
        __CLR4_4_100lo0x9to1.R.inc(3);this.city = city;
        __CLR4_4_100lo0x9to1.R.inc(4);this.country = country;
        __CLR4_4_100lo0x9to1.R.inc(5);this.location = new Point2D(x, y);
    }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}
    
	/** Minimal constructor.
     * 
	 * @param code Airport's IATA code (String)
     */
	public Airport(String code) {try{__CLR4_4_100lo0x9to1.R.inc(6);
		__CLR4_4_100lo0x9to1.R.inc(7);this.code = code;
		__CLR4_4_100lo0x9to1.R.inc(8);this.name = "";
        __CLR4_4_100lo0x9to1.R.inc(9);this.city = "";
        __CLR4_4_100lo0x9to1.R.inc(10);this.country = "";
		__CLR4_4_100lo0x9to1.R.inc(11);this.location = new Point2D();
	}finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}

    // Standard functions - Getters and toString
    public String getName() {try{__CLR4_4_100lo0x9to1.R.inc(12); __CLR4_4_100lo0x9to1.R.inc(13);return name; }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}

    public String getCode() {try{__CLR4_4_100lo0x9to1.R.inc(14); __CLR4_4_100lo0x9to1.R.inc(15);return code; }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}

    public String getCity() {try{__CLR4_4_100lo0x9to1.R.inc(16); __CLR4_4_100lo0x9to1.R.inc(17);return city; }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}

    public String getCountry() {try{__CLR4_4_100lo0x9to1.R.inc(18); __CLR4_4_100lo0x9to1.R.inc(19);return country; }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}

	public float getX() {try{__CLR4_4_100lo0x9to1.R.inc(20); __CLR4_4_100lo0x9to1.R.inc(21);return location.getX(); }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}
	
	public float getY() {try{__CLR4_4_100lo0x9to1.R.inc(22); __CLR4_4_100lo0x9to1.R.inc(23);return location.getY(); }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}
	
	public float getCoord(int i) {try{__CLR4_4_100lo0x9to1.R.inc(24); __CLR4_4_100lo0x9to1.R.inc(25);return location.get(i); }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}
	
	public Point2D getPoint2D() {try{__CLR4_4_100lo0x9to1.R.inc(26); __CLR4_4_100lo0x9to1.R.inc(27);return location; }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}
    
    public String toString() {try{__CLR4_4_100lo0x9to1.R.inc(28); __CLR4_4_100lo0x9to1.R.inc(29);return city; }finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}
    
	/** Generate string according to desired format.
     * 
	 * @param format Formatting code
     */
    public String getString(String format) {try{__CLR4_4_100lo0x9to1.R.inc(30);
    	__CLR4_4_100lo0x9to1.R.inc(31);if ((((format.compareTo("default") == 0 || format.compareTo("") == 0)&&(__CLR4_4_100lo0x9to1.R.iget(32)!=0|true))||(__CLR4_4_100lo0x9to1.R.iget(33)==0&false))) {{
    		__CLR4_4_100lo0x9to1.R.inc(34);return toString();
    	}
    	}else {__CLR4_4_100lo0x9to1.R.inc(35);if ((((format.compareTo("code-only") == 0)&&(__CLR4_4_100lo0x9to1.R.iget(36)!=0|true))||(__CLR4_4_100lo0x9to1.R.iget(37)==0&false))) {{
    		__CLR4_4_100lo0x9to1.R.inc(38);return code;
    	}
    	}else {__CLR4_4_100lo0x9to1.R.inc(39);if ((((format.compareTo("full") == 0)&&(__CLR4_4_100lo0x9to1.R.iget(40)!=0|true))||(__CLR4_4_100lo0x9to1.R.iget(41)==0&false))) {{
    		__CLR4_4_100lo0x9to1.R.inc(42);return code + ", " + name + ", " + city + ", " + country + ", (" + location.getX() + "," + location.getY() + ")";
    	}
    	}else {__CLR4_4_100lo0x9to1.R.inc(43);if ((((format.compareTo("attributes") == 0)&&(__CLR4_4_100lo0x9to1.R.iget(44)!=0|true))||(__CLR4_4_100lo0x9to1.R.iget(45)==0&false))) {{
    		__CLR4_4_100lo0x9to1.R.inc(46);return name + ", " + city + ", " + country + ", (" + location.getX() + "," + location.getY() + ")";
    	}
    	}else {__CLR4_4_100lo0x9to1.R.inc(47);return "Invalid format!";
    }}}}}finally{__CLR4_4_100lo0x9to1.R.flushNeeded();}}
}
