/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

public class Node {public static class __CLR4_4_1e6e6kv4p59jw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u0047\u006f\u006d\u006f\u006b\u0075\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047634904L,8589935092L,521,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public int p;
    public int x;
    public int y;

    public Node() {try{__CLR4_4_1e6e6kv4p59jw.R.inc(510);

    }finally{__CLR4_4_1e6e6kv4p59jw.R.flushNeeded();}}

    public Node(int p, int x, int y) {try{__CLR4_4_1e6e6kv4p59jw.R.inc(511);
        __CLR4_4_1e6e6kv4p59jw.R.inc(512);this.p = p;
        __CLR4_4_1e6e6kv4p59jw.R.inc(513);this.x = x;
        __CLR4_4_1e6e6kv4p59jw.R.inc(514);this.y = y;
    }finally{__CLR4_4_1e6e6kv4p59jw.R.flushNeeded();}}

    public Node(Node node) {try{__CLR4_4_1e6e6kv4p59jw.R.inc(515);
        __CLR4_4_1e6e6kv4p59jw.R.inc(516);this.p = (((node.p == Gomoku.AI )&&(__CLR4_4_1e6e6kv4p59jw.R.iget(517)!=0|true))||(__CLR4_4_1e6e6kv4p59jw.R.iget(518)==0&false))? Gomoku.PLAYER : Gomoku.AI;
        __CLR4_4_1e6e6kv4p59jw.R.inc(519);this.x = node.x;
        __CLR4_4_1e6e6kv4p59jw.R.inc(520);this.y = node.y;
    }finally{__CLR4_4_1e6e6kv4p59jw.R.flushNeeded();}}

}