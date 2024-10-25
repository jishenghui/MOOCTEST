/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.junit.Test;

public class DiffiTest {static class __CLR4_4_1bfbflpniwbrs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0035\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701489467785L,8589935092L,529,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test() {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3bf(){try{__CLR4_4_1bfbflpniwbrs.R.inc(411);
    	__CLR4_4_1bfbflpniwbrs.R.inc(412);Option option = new Option(null);
    	__CLR4_4_1bfbflpniwbrs.R.inc(413);Diffi diffi = new Diffi(option);
    }finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test1() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beubi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beubi() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(414);
    	__CLR4_4_1bfbflpniwbrs.R.inc(415);ExtBoolArray extBoolArray = new ExtBoolArray(10);
    	__CLR4_4_1bfbflpniwbrs.R.inc(416);assertTrue(extBoolArray.isFalse(10, 2));
    	
    	__CLR4_4_1bfbflpniwbrs.R.inc(417);assertTrue(extBoolArray.isFalse(0, 9));
    	__CLR4_4_1bfbflpniwbrs.R.inc(418);extBoolArray.setTrue(5, 5);
    	__CLR4_4_1bfbflpniwbrs.R.inc(419);assertFalse(extBoolArray.isFalse(5, 5));
    	__CLR4_4_1bfbflpniwbrs.R.inc(420);assertEquals(9, extBoolArray.left());
    	__CLR4_4_1bfbflpniwbrs.R.inc(421);extBoolArray.setTrue(0, 9);
    	__CLR4_4_1bfbflpniwbrs.R.inc(422);assertEquals(0, extBoolArray.left());
		__CLR4_4_1bfbflpniwbrs.R.inc(423);extBoolArray.setTrue(9, 6);
		
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test2() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bbs() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(424);
		__CLR4_4_1bfbflpniwbrs.R.inc(425);IndexedString indexedString = new IndexedString("123");
		__CLR4_4_1bfbflpniwbrs.R.inc(426);char[] c = "123".toCharArray();
		__CLR4_4_1bfbflpniwbrs.R.inc(427);char[] c1 = "223".toCharArray();
		__CLR4_4_1bfbflpniwbrs.R.inc(428);assertEquals(0, indexedString.indexOf(c));
		__CLR4_4_1bfbflpniwbrs.R.inc(429);assertEquals(-1, indexedString.indexOf(c1));
		__CLR4_4_1bfbflpniwbrs.R.inc(430);assertEquals(-1, indexedString.indexOf("11111111".toCharArray()));
		__CLR4_4_1bfbflpniwbrs.R.inc(431);assertEquals(-1, indexedString.indexOf("1234455".toCharArray()));

	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test3() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),432,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsc0() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(432);
    	__CLR4_4_1bfbflpniwbrs.R.inc(433);Option option = new Option(null);
    	__CLR4_4_1bfbflpniwbrs.R.inc(434);Option option2 = new Option("\u947b\u89c4\u7049","\u6fc2\u85c9\u6086");
    	__CLR4_4_1bfbflpniwbrs.R.inc(435);Option option3 = new Option("\u947b\u89c4\u7049",true,"\u6fc2\u85c9\u6086","no");
    	__CLR4_4_1bfbflpniwbrs.R.inc(436);Option option4 = new Option("","");
    	__CLR4_4_1bfbflpniwbrs.R.inc(437);Option option5 = new Option(null,true,"\u6fc2\u85c9\u6086","no");
    	__CLR4_4_1bfbflpniwbrs.R.inc(438);Option option6 = new Option("111",true,"11","no");
    	__CLR4_4_1bfbflpniwbrs.R.inc(439);Diffi diffi = new Diffi(option);
    	__CLR4_4_1bfbflpniwbrs.R.inc(440);assertEquals("\u6fc2\u85c9\u6086", option2.getBeschriebung());
    	__CLR4_4_1bfbflpniwbrs.R.inc(441);assertEquals("", option.getBeschriebung());
    	__CLR4_4_1bfbflpniwbrs.R.inc(442);assertEquals("", option2.getDelim());
		__CLR4_4_1bfbflpniwbrs.R.inc(443);assertFalse(option2.isHasArg());
		__CLR4_4_1bfbflpniwbrs.R.inc(444);assertTrue(option3.isHasArg());
		__CLR4_4_1bfbflpniwbrs.R.inc(445);assertEquals("\u947b\u89c4\u7049", option2.getName());
		__CLR4_4_1bfbflpniwbrs.R.inc(446);assertNull(option.getName());
		__CLR4_4_1bfbflpniwbrs.R.inc(447);assertEquals("",option4.getName() );
		__CLR4_4_1bfbflpniwbrs.R.inc(448);assertEquals("", option2.getDefaultv());
		__CLR4_4_1bfbflpniwbrs.R.inc(449);assertEquals("no", option3.getDefaultv());
		__CLR4_4_1bfbflpniwbrs.R.inc(450);assertFalse(option.isIsSet());
		__CLR4_4_1bfbflpniwbrs.R.inc(451);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(452);option2.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		__CLR4_4_1bfbflpniwbrs.R.inc(453);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(454);option3.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
		}
		__CLR4_4_1bfbflpniwbrs.R.inc(455);option2.parse("1");
		__CLR4_4_1bfbflpniwbrs.R.inc(456);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(457);option3.parse("2");
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1bfbflpniwbrs.R.inc(458);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(459);option5.parse("1234");
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		
		__CLR4_4_1bfbflpniwbrs.R.inc(460);option2.parse("1234");
		__CLR4_4_1bfbflpniwbrs.R.inc(461);option6.parse("111111111");
		__CLR4_4_1bfbflpniwbrs.R.inc(462);assertEquals("111", option6.getValue());
		__CLR4_4_1bfbflpniwbrs.R.inc(463);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(464);assertTrue(option.is("123"));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		__CLR4_4_1bfbflpniwbrs.R.inc(465);assertFalse(option2.is("\u947b\u89c4\u7049"));
		__CLR4_4_1bfbflpniwbrs.R.inc(466);assertFalse(option6.is("-111"+"11"));
		
		
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    
    @Test
	public void test4() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9cz() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(467);
//    	Option option = new Option(null);
    	__CLR4_4_1bfbflpniwbrs.R.inc(468);Diffi diffi = new Diffi();
    	__CLR4_4_1bfbflpniwbrs.R.inc(469);Option option2 = new Option("\u947b\u89c4\u7049","\u6fc2\u85c9\u6086");
    	__CLR4_4_1bfbflpniwbrs.R.inc(470);diffi.addOption(option2);
//    	option2.parse("111111");
    	__CLR4_4_1bfbflpniwbrs.R.inc(471);String[] strings = {"-\u947b\u89c4\u7049"+"","22","33"};
		__CLR4_4_1bfbflpniwbrs.R.inc(472);diffi.parse(strings);
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test5() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqd5() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(473);
    	__CLR4_4_1bfbflpniwbrs.R.inc(474);FileDiffPatch.createPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt");
    	__CLR4_4_1bfbflpniwbrs.R.inc(475);FileDiffPatch.createPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);
    	__CLR4_4_1bfbflpniwbrs.R.inc(476);try {
    		__CLR4_4_1bfbflpniwbrs.R.inc(477);FileDiffPatch.createPatch("src/main/java/net/mooctest/input1.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);
    	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	__CLR4_4_1bfbflpniwbrs.R.inc(478);FileDiffPatch.doPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt");
    	__CLR4_4_1bfbflpniwbrs.R.inc(479);FileDiffPatch.doPatch("src/main/java/net/mooctest/input.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);
    	__CLR4_4_1bfbflpniwbrs.R.inc(480);try {
    		__CLR4_4_1bfbflpniwbrs.R.inc(481);FileDiffPatch.doPatch("src/main/java/net/mooctest/input1.txt", "src/main/java/net/mooctest/input2.txt", "src/main/java/net/mooctest/output.txt",true);
        	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test6() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d7de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d7de() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(482);
    	__CLR4_4_1bfbflpniwbrs.R.inc(483);FileInputStream b = new FileInputStream("src/main/java/net/mooctest/input.txt");
    	__CLR4_4_1bfbflpniwbrs.R.inc(484);RelativeString relativeString = new RelativeString();
    	
    	__CLR4_4_1bfbflpniwbrs.R.inc(485);try {
    		__CLR4_4_1bfbflpniwbrs.R.inc(486);FileInputStream b1 = new FileInputStream("src/main/java/net/mooctest/input1.txt");
        	
    		__CLR4_4_1bfbflpniwbrs.R.inc(487);RelativeString r = new RelativeString(b1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		__CLR4_4_1bfbflpniwbrs.R.inc(488);StringFromFile stringFromFile = new StringFromFile();
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test7() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw645odl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),489,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw645odl() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(489);
    	__CLR4_4_1bfbflpniwbrs.R.inc(490);StringIncrementor stringIncrementor = new StringIncrementor();
    	__CLR4_4_1bfbflpniwbrs.R.inc(491);stringIncrementor.diff("", "");
    	__CLR4_4_1bfbflpniwbrs.R.inc(492);stringIncrementor.diff("", "123456789012122");
    	__CLR4_4_1bfbflpniwbrs.R.inc(493);stringIncrementor.diff("123456789012122", "123456789012122");
    	__CLR4_4_1bfbflpniwbrs.R.inc(494);try {
    		__CLR4_4_1bfbflpniwbrs.R.inc(495);stringIncrementor.diff(null,null);
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
    	__CLR4_4_1bfbflpniwbrs.R.inc(496);try {
    		__CLR4_4_1bfbflpniwbrs.R.inc(497);stringIncrementor.diff("11", "123456789012122",true);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    	__CLR4_4_1bfbflpniwbrs.R.inc(498);stringIncrementor.diff("123456789012122", "123456789012122",true);
//    	stringIncrementor.diff("1111", "12345678901212211111111111111111111111111",true);
    	
    	
    	
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    
    @Test
	public void test8() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r562y5dv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),499,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r562y5dv() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(499);
    	__CLR4_4_1bfbflpniwbrs.R.inc(500);StringLink stringLink = new StringLink(1,2,3);
		__CLR4_4_1bfbflpniwbrs.R.inc(501);byte[] bs = "aaaa".getBytes();
		__CLR4_4_1bfbflpniwbrs.R.inc(502);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(503);StringLink stringLin1 = new StringLink(bs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		__CLR4_4_1bfbflpniwbrs.R.inc(504);assertEquals(3, stringLink.getLen());
		__CLR4_4_1bfbflpniwbrs.R.inc(505);assertEquals(2, stringLink.getPosNew());
		__CLR4_4_1bfbflpniwbrs.R.inc(506);assertEquals(1, stringLink.getPosOrig());
		__CLR4_4_1bfbflpniwbrs.R.inc(507);assertNotNull(stringLink.toBytes());
		__CLR4_4_1bfbflpniwbrs.R.inc(508);StringLink stringLink2 = new StringLink(1,2,-1);
		__CLR4_4_1bfbflpniwbrs.R.inc(509);assertNotNull(stringLink.toBytes());
		
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test9() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ue61qme6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),510,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ue61qme6() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(510);
    	__CLR4_4_1bfbflpniwbrs.R.inc(511);RelativeString relativeString = new RelativeString();
		__CLR4_4_1bfbflpniwbrs.R.inc(512);assertEquals(0, relativeString.linksCount());
		__CLR4_4_1bfbflpniwbrs.R.inc(513);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(514);assertEquals("", relativeString.getLink(0));
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		__CLR4_4_1bfbflpniwbrs.R.inc(515);assertTrue(relativeString.addLink(new StringLink(0, 1, 2)));
		__CLR4_4_1bfbflpniwbrs.R.inc(516);assertNotNull(relativeString.getLink(0));
		__CLR4_4_1bfbflpniwbrs.R.inc(517);relativeString.debugPrint();
		__CLR4_4_1bfbflpniwbrs.R.inc(518);FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/net/mooctest/output.txt");
		__CLR4_4_1bfbflpniwbrs.R.inc(519);relativeString.bytesToStream(fileOutputStream);
		__CLR4_4_1bfbflpniwbrs.R.inc(520);try {
			__CLR4_4_1bfbflpniwbrs.R.inc(521);FileOutputStream fileOutputStream1 = new FileOutputStream("src/main/java/net/mooctest/output2.txt");
			__CLR4_4_1bfbflpniwbrs.R.inc(522);relativeString.bytesToStream(fileOutputStream1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		__CLR4_4_1bfbflpniwbrs.R.inc(523);assertEquals(2, relativeString.getLength());
		__CLR4_4_1bfbflpniwbrs.R.inc(524);StringIncrementor stringIncrementor = new StringIncrementor();
		}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}
    @Test
	public void test10() throws Exception {__CLR4_4_1bfbflpniwbrs.R.globalSliceStart(getClass().getName(),525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uwel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1bfbflpniwbrs.R.rethrow($CLV_t2$);}finally{__CLR4_4_1bfbflpniwbrs.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),525,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uwel() throws Exception{try{__CLR4_4_1bfbflpniwbrs.R.inc(525);
//    	RelativeString relativeString = new RelativeString(new FileInputStream("src/main/java/net/mooctest/input.txt"));
    	__CLR4_4_1bfbflpniwbrs.R.inc(526);RelativeString relativeString = new RelativeString();
    	__CLR4_4_1bfbflpniwbrs.R.inc(527);relativeString.addLink(new StringLink("123".getBytes()));
    	
    	__CLR4_4_1bfbflpniwbrs.R.inc(528);StringIncrementor.patch("123", relativeString);
	}finally{__CLR4_4_1bfbflpniwbrs.R.flushNeeded();}}

}