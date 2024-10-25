/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class DiffiTest2 {static class __CLR4_4_1btbtludsz035{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0037\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0044\u0069\u0066\u0066\u0069\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1711785638684L,8589935092L,497,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void test() {__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),425,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3bt(){try{__CLR4_4_1btbtludsz035.R.inc(425);
    	__CLR4_4_1btbtludsz035.R.inc(426);Option option = new Option(null);
    	__CLR4_4_1btbtludsz035.R.inc(427);Option option1 = new Option(null);
    	__CLR4_4_1btbtludsz035.R.inc(428);Diffi diffi = new Diffi(option);
    	__CLR4_4_1btbtludsz035.R.inc(429);diffi.addOption(option1);
    	
//    	diffi.parse(new String[3]);
    }finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    @Test
    public void test1()  {__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_14e6beuby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_14e6beuby(){try{__CLR4_4_1btbtludsz035.R.inc(430);
		__CLR4_4_1btbtludsz035.R.inc(431);ExtBoolArray extBoolArray = new ExtBoolArray(3);
		__CLR4_4_1btbtludsz035.R.inc(432);extBoolArray.setTrue(1, 2);
		__CLR4_4_1btbtludsz035.R.inc(433);assertFalse(extBoolArray.isFalse(1, 3));
		__CLR4_4_1btbtludsz035.R.inc(434);extBoolArray.setTrue(0, 2);
		__CLR4_4_1btbtludsz035.R.inc(435);assertTrue(extBoolArray.isFalse(2, 1));
		__CLR4_4_1btbtludsz035.R.inc(436);assertEquals(0, extBoolArray.left());
		__CLR4_4_1btbtludsz035.R.inc(437);ExtBoolArray extBoolArray1 = new ExtBoolArray(3);
		__CLR4_4_1btbtludsz035.R.inc(438);assertEquals(0, extBoolArray.left());
	}finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    
    @Test
	public void test2(){__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bc7(){try{__CLR4_4_1btbtludsz035.R.inc(439);
    	__CLR4_4_1btbtludsz035.R.inc(440);try {
    		__CLR4_4_1btbtludsz035.R.inc(441);FileDiffPatch.createPatch("/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt");
    		__CLR4_4_1btbtludsz035.R.inc(442);FileDiffPatch.createPatch("/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt", "/Diffi/src/test/java/net/mooctest/aa.txt",true);
    			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    
    @Test
	public void test3()  {__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zscb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),443,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zscb(){try{__CLR4_4_1btbtludsz035.R.inc(443);
//		try {
////			System.out.println(rootPath);
////			StringFromFile.readString(");
//			String rootPath = System.getProperty("user.dir");
//			
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
    	__CLR4_4_1btbtludsz035.R.inc(444);String rootPath = System.getProperty("user.dir");
    	__CLR4_4_1btbtludsz035.R.inc(445);System.out.println(rootPath);
    	__CLR4_4_1btbtludsz035.R.inc(446);String path = rootPath + "\\src\\test\\java\\net\\mooctest\\aa.txt";
    	__CLR4_4_1btbtludsz035.R.inc(447);try {
    		__CLR4_4_1btbtludsz035.R.inc(448);FileDiffPatch fileDiffPatch = new FileDiffPatch();
    		__CLR4_4_1btbtludsz035.R.inc(449);StringFromFile.readString(path);
    		__CLR4_4_1btbtludsz035.R.inc(450);FileDiffPatch.createPatch(path, path, path);
    		__CLR4_4_1btbtludsz035.R.inc(451);FileDiffPatch.createPatch(path, path, path,true);
    		__CLR4_4_1btbtludsz035.R.inc(452);FileDiffPatch.doPatch(path, path, path);
    		__CLR4_4_1btbtludsz035.R.inc(453);FileDiffPatch.doPatch(path, path, path,true);
    		__CLR4_4_1btbtludsz035.R.inc(454);FileDiffPatch.doPatch("A", null, null);
		} catch (Exception e) {
			// TODO: handle exception
			__CLR4_4_1btbtludsz035.R.inc(455);e.printStackTrace();
		}
    	
	}finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    
    @Test
	public void test4() throws Exception {__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9co();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9co() throws Exception{try{__CLR4_4_1btbtludsz035.R.inc(456);
    	__CLR4_4_1btbtludsz035.R.inc(457);IndexedString indexedString = new IndexedString("abc");
    	__CLR4_4_1btbtludsz035.R.inc(458);assertEquals(-1, indexedString.indexOf(new char[3]));
//    	assertEquals(, actual);
	}finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    @Test
	public void test5() throws Exception {__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),459,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqcr() throws Exception{try{__CLR4_4_1btbtludsz035.R.inc(459);
		__CLR4_4_1btbtludsz035.R.inc(460);Option option = new Option("hzb","hh");
		__CLR4_4_1btbtludsz035.R.inc(461);Option option1 = new Option("hzb",true,"hh","hh1");
		__CLR4_4_1btbtludsz035.R.inc(462);assertEquals("hh", option.getBeschriebung());
		__CLR4_4_1btbtludsz035.R.inc(463);assertEquals("", option.getDelim());
		__CLR4_4_1btbtludsz035.R.inc(464);assertTrue(option1.isHasArg());
		__CLR4_4_1btbtludsz035.R.inc(465);assertFalse(option.isHasArg());
		__CLR4_4_1btbtludsz035.R.inc(466);assertEquals("hzb", option.getName());
		__CLR4_4_1btbtludsz035.R.inc(467);assertEquals("", option.getDefaultv());
		__CLR4_4_1btbtludsz035.R.inc(468);assertEquals("hh1", option1.getDefaultv());
		__CLR4_4_1btbtludsz035.R.inc(469);assertFalse(option.isIsSet());
		__CLR4_4_1btbtludsz035.R.inc(470);option.parse("a");
		__CLR4_4_1btbtludsz035.R.inc(471);assertTrue(option.isIsSet());
		__CLR4_4_1btbtludsz035.R.inc(472);try {
			__CLR4_4_1btbtludsz035.R.inc(473);option.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
			__CLR4_4_1btbtludsz035.R.inc(474);e.printStackTrace();
		}
		__CLR4_4_1btbtludsz035.R.inc(475);try {
			__CLR4_4_1btbtludsz035.R.inc(476);option1.getValue();
		} catch (RuntimeException e) {
			// TODO: handle exception
			__CLR4_4_1btbtludsz035.R.inc(477);e.printStackTrace();
		}
		__CLR4_4_1btbtludsz035.R.inc(478);Option option2 = new Option("hzb", "h", true, "h", "a");
		__CLR4_4_1btbtludsz035.R.inc(479);option2.parse("hzbhaaaa");
		__CLR4_4_1btbtludsz035.R.inc(480);try {

			__CLR4_4_1btbtludsz035.R.inc(481);assertEquals("aaa", option2.getValue());
		} catch (RuntimeException e) {
			// TODO: handle exception
			__CLR4_4_1btbtludsz035.R.inc(482);e.printStackTrace();
		}
		__CLR4_4_1btbtludsz035.R.inc(483);assertFalse(option.is("aaa"));
		__CLR4_4_1btbtludsz035.R.inc(484);Option option3 = new Option("");
		__CLR4_4_1btbtludsz035.R.inc(485);assertTrue(option3.is("-"));
		__CLR4_4_1btbtludsz035.R.inc(486);assertFalse(option2.is("-"));
		__CLR4_4_1btbtludsz035.R.inc(487);Option option4 = new Option("",true,"","");
		__CLR4_4_1btbtludsz035.R.inc(488);assertTrue(option4.is("-"));
		__CLR4_4_1btbtludsz035.R.inc(489);option4.parse("abcd");
		__CLR4_4_1btbtludsz035.R.inc(490);assertFalse(option4.is("-"));
		
	}finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    @Test
	public void test6() throws Exception {__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d7dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d7dn() throws Exception{try{__CLR4_4_1btbtludsz035.R.inc(491);
    	__CLR4_4_1btbtludsz035.R.inc(492);String rootPath = System.getProperty("user.dir");
    	__CLR4_4_1btbtludsz035.R.inc(493);System.out.println(rootPath);
    	__CLR4_4_1btbtludsz035.R.inc(494);String path = rootPath + "\\src\\test\\java\\net\\mooctest\\b.txt";
//    	RelativeString relativeString = new RelativeString(new FileInputStream(path));
//    	RelativeString relativeString1 = new RelativeString(new FileInputStream("a"));
//    	relativeString.debugPrint();
	}finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    @Test
	public void test7() throws Exception {__CLR4_4_1btbtludsz035.R.globalSliceStart(getClass().getName(),495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw645odr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1btbtludsz035.R.rethrow($CLV_t2$);}finally{__CLR4_4_1btbtludsz035.R.globalSliceEnd(getClass().getName(),"net.mooctest.DiffiTest2.test7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),495,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw645odr() throws Exception{try{__CLR4_4_1btbtludsz035.R.inc(495);
		__CLR4_4_1btbtludsz035.R.inc(496);StringLink stringLink = new StringLink(new byte[24]);
		
	}finally{__CLR4_4_1btbtludsz035.R.flushNeeded();}}
    

}