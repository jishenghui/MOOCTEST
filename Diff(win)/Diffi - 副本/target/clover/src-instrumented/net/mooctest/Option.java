/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
public class Option {public static class __CLR4_4_14a4aludsyzzp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711785637941L,8589935092L,204,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String mname;
    private String mbeschriebung;
    private String mdelim;
    private boolean mhasArg;
    private String mdefaultv;
    private String mvalue;
    private boolean misSet;

    public Option(String name, String beschreibung, boolean hasArg, String delim, String defaultv) {try{__CLR4_4_14a4aludsyzzp.R.inc(154);
        __CLR4_4_14a4aludsyzzp.R.inc(155);this.mname = name;
        __CLR4_4_14a4aludsyzzp.R.inc(156);this.mbeschriebung = beschreibung;
        __CLR4_4_14a4aludsyzzp.R.inc(157);this.mdelim = delim;
        __CLR4_4_14a4aludsyzzp.R.inc(158);this.mhasArg = hasArg;
        __CLR4_4_14a4aludsyzzp.R.inc(159);this.mdefaultv = defaultv;
        __CLR4_4_14a4aludsyzzp.R.inc(160);misSet = false;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}
    
    public Option(String name, String beschreibung) {
        this(name, beschreibung, false, "", "");__CLR4_4_14a4aludsyzzp.R.inc(162);try{__CLR4_4_14a4aludsyzzp.R.inc(161);
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}
    
    public Option(String name) {
        this(name, "", false, "", "");__CLR4_4_14a4aludsyzzp.R.inc(164);try{__CLR4_4_14a4aludsyzzp.R.inc(163);
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}
    
    public Option(String name, boolean hasArg, String delim, String defaultv) {
        this(name, "", hasArg, delim, defaultv);__CLR4_4_14a4aludsyzzp.R.inc(166);try{__CLR4_4_14a4aludsyzzp.R.inc(165);
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public String getBeschriebung() {try{__CLR4_4_14a4aludsyzzp.R.inc(167);
        __CLR4_4_14a4aludsyzzp.R.inc(168);return mbeschriebung;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public String getDelim() {try{__CLR4_4_14a4aludsyzzp.R.inc(169);
        __CLR4_4_14a4aludsyzzp.R.inc(170);return mdelim;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public boolean isHasArg() {try{__CLR4_4_14a4aludsyzzp.R.inc(171);
        __CLR4_4_14a4aludsyzzp.R.inc(172);return mhasArg;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public String getName() {try{__CLR4_4_14a4aludsyzzp.R.inc(173);
        __CLR4_4_14a4aludsyzzp.R.inc(174);return mname;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public String getDefaultv() {try{__CLR4_4_14a4aludsyzzp.R.inc(175);
        __CLR4_4_14a4aludsyzzp.R.inc(176);return mdefaultv;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public boolean isIsSet() {try{__CLR4_4_14a4aludsyzzp.R.inc(177);
        __CLR4_4_14a4aludsyzzp.R.inc(178);return misSet;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public String getValue() {try{__CLR4_4_14a4aludsyzzp.R.inc(179);
        __CLR4_4_14a4aludsyzzp.R.inc(180);if ((((!mhasArg)&&(__CLR4_4_14a4aludsyzzp.R.iget(181)!=0|true))||(__CLR4_4_14a4aludsyzzp.R.iget(182)==0&false))) {{
            __CLR4_4_14a4aludsyzzp.R.inc(183);throw new RuntimeException("Option has no argument.");
        }
        }__CLR4_4_14a4aludsyzzp.R.inc(184);if ((((!misSet)&&(__CLR4_4_14a4aludsyzzp.R.iget(185)!=0|true))||(__CLR4_4_14a4aludsyzzp.R.iget(186)==0&false))) {{
            __CLR4_4_14a4aludsyzzp.R.inc(187);throw new RuntimeException("Option is not set.");
        }
        }__CLR4_4_14a4aludsyzzp.R.inc(188);return mvalue;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public boolean is(String s) {try{__CLR4_4_14a4aludsyzzp.R.inc(189);
        __CLR4_4_14a4aludsyzzp.R.inc(190);return s.startsWith(((((mname.isEmpty() )&&(__CLR4_4_14a4aludsyzzp.R.iget(191)!=0|true))||(__CLR4_4_14a4aludsyzzp.R.iget(192)==0&false))? "" : "-") + mname + ((((mhasArg )&&(__CLR4_4_14a4aludsyzzp.R.iget(193)!=0|true))||(__CLR4_4_14a4aludsyzzp.R.iget(194)==0&false))? mdelim : "")) && !misSet;
    }finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}

    public void parse(String s) {try{__CLR4_4_14a4aludsyzzp.R.inc(195);
        __CLR4_4_14a4aludsyzzp.R.inc(196);misSet = true;
        __CLR4_4_14a4aludsyzzp.R.inc(197);if ((((mhasArg)&&(__CLR4_4_14a4aludsyzzp.R.iget(198)!=0|true))||(__CLR4_4_14a4aludsyzzp.R.iget(199)==0&false))) {{
            __CLR4_4_14a4aludsyzzp.R.inc(200);mvalue = s.substring(mname.length() + ((((mname.isEmpty() )&&(__CLR4_4_14a4aludsyzzp.R.iget(201)!=0|true))||(__CLR4_4_14a4aludsyzzp.R.iget(202)==0&false))? 0 : 1) + mdelim.length());
        } }else {{
            __CLR4_4_14a4aludsyzzp.R.inc(203);mvalue = mdefaultv;
        }
    }}finally{__CLR4_4_14a4aludsyzzp.R.flushNeeded();}}
}