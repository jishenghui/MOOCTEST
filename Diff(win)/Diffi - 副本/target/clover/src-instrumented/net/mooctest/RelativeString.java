/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public final class RelativeString {public static class __CLR4_4_15o5oludsz006{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711785637941L,8589935092L,275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Vector<StringLink> links;
    private String absolute;

    public RelativeString() {try{__CLR4_4_15o5oludsz006.R.inc(204);
        __CLR4_4_15o5oludsz006.R.inc(205);links = new Vector<StringLink>();
        __CLR4_4_15o5oludsz006.R.inc(206);absolute = "";
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public RelativeString(InputStream I) {
        this();__CLR4_4_15o5oludsz006.R.inc(208);try{__CLR4_4_15o5oludsz006.R.inc(207);
        __CLR4_4_15o5oludsz006.R.inc(209);try {
            __CLR4_4_15o5oludsz006.R.inc(210);DataInputStream iis = new DataInputStream(I);
            __CLR4_4_15o5oludsz006.R.inc(211);int linkcount = iis.readInt();
            __CLR4_4_15o5oludsz006.R.inc(212);byte[] data = new byte[12];
            __CLR4_4_15o5oludsz006.R.inc(213);for (int i = 0; (((i < linkcount)&&(__CLR4_4_15o5oludsz006.R.iget(214)!=0|true))||(__CLR4_4_15o5oludsz006.R.iget(215)==0&false)); i++) {{
                __CLR4_4_15o5oludsz006.R.inc(216);iis.read(data);
                __CLR4_4_15o5oludsz006.R.inc(217);links.add(new StringLink(data));
            }
            }__CLR4_4_15o5oludsz006.R.inc(218);int abslen=iis.readInt();
            __CLR4_4_15o5oludsz006.R.inc(219);data = new byte[abslen];
            __CLR4_4_15o5oludsz006.R.inc(220);iis.read(data);
            __CLR4_4_15o5oludsz006.R.inc(221);StringBuilder sb=new StringBuilder();
            __CLR4_4_15o5oludsz006.R.inc(222);for(int i=0;(((i<abslen)&&(__CLR4_4_15o5oludsz006.R.iget(223)!=0|true))||(__CLR4_4_15o5oludsz006.R.iget(224)==0&false));i++)
                {__CLR4_4_15o5oludsz006.R.inc(225);sb.append((char)data[i]);
            }__CLR4_4_15o5oludsz006.R.inc(226);absolute=sb.toString();
        } catch (Exception e) {
            __CLR4_4_15o5oludsz006.R.inc(227);e.printStackTrace();
        }
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public String getAbsolute() {try{__CLR4_4_15o5oludsz006.R.inc(228);
        __CLR4_4_15o5oludsz006.R.inc(229);return absolute;
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public void setAbsolute(String absolute) {try{__CLR4_4_15o5oludsz006.R.inc(230);
        __CLR4_4_15o5oludsz006.R.inc(231);this.absolute = absolute;
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public int linksCount() {try{__CLR4_4_15o5oludsz006.R.inc(232);
        __CLR4_4_15o5oludsz006.R.inc(233);return links.size();
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public StringLink getLink(int index) {try{__CLR4_4_15o5oludsz006.R.inc(234);
        __CLR4_4_15o5oludsz006.R.inc(235);return links.elementAt(index);
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public boolean addLink(StringLink e) {try{__CLR4_4_15o5oludsz006.R.inc(236);
        __CLR4_4_15o5oludsz006.R.inc(237);return links.add(e);
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_15o5oludsz006.R.inc(238);
        __CLR4_4_15o5oludsz006.R.inc(239);return linksCount() + " links, " + absolute.length() + " absolute chars (" + (8 + absolute.length() + linksCount() * 12) + " Bytes ^= -" + bytessaved() + "Bytes)";
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public void debugPrint() {try{__CLR4_4_15o5oludsz006.R.inc(240);
        __CLR4_4_15o5oludsz006.R.inc(241);System.out.println("Debugprint: " + this);
        __CLR4_4_15o5oludsz006.R.inc(242);for (int i = 0; (((i < links.size())&&(__CLR4_4_15o5oludsz006.R.iget(243)!=0|true))||(__CLR4_4_15o5oludsz006.R.iget(244)==0&false)); i++) {{
            __CLR4_4_15o5oludsz006.R.inc(245);System.out.format("(%0" + (Math.round(Math.floor(Math.log10(links.size()))) + 1) + "d)", i);
            __CLR4_4_15o5oludsz006.R.inc(246);System.out.println(" " + links.elementAt(i));
        }
        }__CLR4_4_15o5oludsz006.R.inc(247);System.out.println("[" + absolute + "]");
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    public void bytesToStream(OutputStream os) {try{__CLR4_4_15o5oludsz006.R.inc(248);
        __CLR4_4_15o5oludsz006.R.inc(249);try {
            __CLR4_4_15o5oludsz006.R.inc(250);DataOutputStream oos = null;
            __CLR4_4_15o5oludsz006.R.inc(251);oos = new DataOutputStream(os);
            __CLR4_4_15o5oludsz006.R.inc(252);oos.writeInt(links.size());
            __CLR4_4_15o5oludsz006.R.inc(253);for (int i = 0; (((i < links.size())&&(__CLR4_4_15o5oludsz006.R.iget(254)!=0|true))||(__CLR4_4_15o5oludsz006.R.iget(255)==0&false)); i++) {{
                __CLR4_4_15o5oludsz006.R.inc(256);oos.write(links.elementAt(i).toBytes());
            }
            }__CLR4_4_15o5oludsz006.R.inc(257);oos.writeInt(absolute.length());
            __CLR4_4_15o5oludsz006.R.inc(258);oos.writeBytes(absolute);
            __CLR4_4_15o5oludsz006.R.inc(259);oos.flush();
        } catch (IOException ex) {
            __CLR4_4_15o5oludsz006.R.inc(260);ex.printStackTrace();
        }
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}

    private int bytessaved() {try{__CLR4_4_15o5oludsz006.R.inc(261);
        __CLR4_4_15o5oludsz006.R.inc(262);int result = -8;
        __CLR4_4_15o5oludsz006.R.inc(263);for (int i = 0; (((i < links.size())&&(__CLR4_4_15o5oludsz006.R.iget(264)!=0|true))||(__CLR4_4_15o5oludsz006.R.iget(265)==0&false)); i++) {{
            __CLR4_4_15o5oludsz006.R.inc(266);result += (links.elementAt(i).getLen() - 12);
        }
        }__CLR4_4_15o5oludsz006.R.inc(267);return result;
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}
    public int getLength()
    {try{__CLR4_4_15o5oludsz006.R.inc(268);
        __CLR4_4_15o5oludsz006.R.inc(269);int result = absolute.length();
        __CLR4_4_15o5oludsz006.R.inc(270);for (int i = 0; (((i < links.size())&&(__CLR4_4_15o5oludsz006.R.iget(271)!=0|true))||(__CLR4_4_15o5oludsz006.R.iget(272)==0&false)); i++) {{
            __CLR4_4_15o5oludsz006.R.inc(273);result += (links.elementAt(i).getLen());
        }
        }__CLR4_4_15o5oludsz006.R.inc(274);return result;
    }finally{__CLR4_4_15o5oludsz006.R.flushNeeded();}}
}