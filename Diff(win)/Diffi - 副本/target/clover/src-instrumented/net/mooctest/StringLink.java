/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class StringLink {public static class __CLR4_4_1acacludsz014{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711785637941L,8589935092L,411,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int posOrig;
    private int posNew;
    private int len;

    public StringLink(int posOrig, int posNew, int len) {try{__CLR4_4_1acacludsz014.R.inc(372);
        __CLR4_4_1acacludsz014.R.inc(373);this.posOrig = posOrig;
        __CLR4_4_1acacludsz014.R.inc(374);this.posNew = posNew;
        __CLR4_4_1acacludsz014.R.inc(375);this.len = len;
    }finally{__CLR4_4_1acacludsz014.R.flushNeeded();}}

    public StringLink(byte[] data) {try{__CLR4_4_1acacludsz014.R.inc(376);
        __CLR4_4_1acacludsz014.R.inc(377);DataInputStream iis = null;
        __CLR4_4_1acacludsz014.R.inc(378);try {
            __CLR4_4_1acacludsz014.R.inc(379);ByteArrayInputStream bos = new ByteArrayInputStream(data);
            __CLR4_4_1acacludsz014.R.inc(380);iis = new DataInputStream(bos);
            __CLR4_4_1acacludsz014.R.inc(381);len = iis.readInt();
            __CLR4_4_1acacludsz014.R.inc(382);posOrig = iis.readInt();
            __CLR4_4_1acacludsz014.R.inc(383);posNew = iis.readInt();
        } catch (IOException ex) {
            __CLR4_4_1acacludsz014.R.inc(384);ex.printStackTrace();
        } finally {
            __CLR4_4_1acacludsz014.R.inc(385);try {
                __CLR4_4_1acacludsz014.R.inc(386);iis.close();
            } catch (IOException ex) {
                __CLR4_4_1acacludsz014.R.inc(387);ex.printStackTrace();
            }
        }
    }finally{__CLR4_4_1acacludsz014.R.flushNeeded();}}

    public int getLen() {try{__CLR4_4_1acacludsz014.R.inc(388);
        __CLR4_4_1acacludsz014.R.inc(389);return len;
    }finally{__CLR4_4_1acacludsz014.R.flushNeeded();}}

    public int getPosNew() {try{__CLR4_4_1acacludsz014.R.inc(390);
        __CLR4_4_1acacludsz014.R.inc(391);return posNew;
    }finally{__CLR4_4_1acacludsz014.R.flushNeeded();}}

    public int getPosOrig() {try{__CLR4_4_1acacludsz014.R.inc(392);
        __CLR4_4_1acacludsz014.R.inc(393);return posOrig;
    }finally{__CLR4_4_1acacludsz014.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_4_1acacludsz014.R.inc(394);
        __CLR4_4_1acacludsz014.R.inc(395);return "{" + len + ": " + posOrig + "-->" + posNew + "}";
    }finally{__CLR4_4_1acacludsz014.R.flushNeeded();}}

    public byte[] toBytes() {try{__CLR4_4_1acacludsz014.R.inc(396);
        __CLR4_4_1acacludsz014.R.inc(397);DataOutputStream oos = null;
        __CLR4_4_1acacludsz014.R.inc(398);try {
            __CLR4_4_1acacludsz014.R.inc(399);ByteArrayOutputStream bos = new ByteArrayOutputStream(12);
            __CLR4_4_1acacludsz014.R.inc(400);oos = new DataOutputStream(bos);
            __CLR4_4_1acacludsz014.R.inc(401);oos.writeInt(len);
            __CLR4_4_1acacludsz014.R.inc(402);oos.writeInt(posOrig);
            __CLR4_4_1acacludsz014.R.inc(403);oos.writeInt(posNew);
            __CLR4_4_1acacludsz014.R.inc(404);oos.flush();
            __CLR4_4_1acacludsz014.R.inc(405);return bos.toByteArray();
        } catch (IOException ex) {
            __CLR4_4_1acacludsz014.R.inc(406);ex.printStackTrace();
        } finally {
            __CLR4_4_1acacludsz014.R.inc(407);try {
                __CLR4_4_1acacludsz014.R.inc(408);oos.close();
            } catch (IOException ex) {
                __CLR4_4_1acacludsz014.R.inc(409);ex.printStackTrace();
            }
        }
        __CLR4_4_1acacludsz014.R.inc(410);return null;
    }finally{__CLR4_4_1acacludsz014.R.flushNeeded();}}
}