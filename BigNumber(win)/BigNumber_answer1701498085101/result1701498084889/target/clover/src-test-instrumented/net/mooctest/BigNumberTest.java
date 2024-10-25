/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BigNumberTest {static class __CLR4_4_14s4slpno0x4h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0035\u0039\u0039\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0042\u0069\u0067\u004e\u0075\u006d\u0062\u0065\u0072\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701498080161L,8589935092L,232,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
    public void testBasicCase() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pi2n1p4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testBasicCase",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pi2n1p4s(){try{__CLR4_4_14s4slpno0x4h.R.inc(172);
        __CLR4_4_14s4slpno0x4h.R.inc(173);assertEquals("56088", BigNumber.bigNumberSimpleMulti("123", "456"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testNegativeNumbers() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mj81bq4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testNegativeNumbers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mj81bq4u(){try{__CLR4_4_14s4slpno0x4h.R.inc(174);
        __CLR4_4_14s4slpno0x4h.R.inc(175);assertEquals("-56088", BigNumber.bigNumberSimpleMulti("-123", "456"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testZero() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cqj5i74w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testZero",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),176,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cqj5i74w(){try{__CLR4_4_14s4slpno0x4h.R.inc(176);
        __CLR4_4_14s4slpno0x4h.R.inc(177);assertEquals("0", BigNumber.bigNumberSimpleMulti("0", "456"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testLargeNumbers() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1g96puw4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testLargeNumbers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),178,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1g96puw4y(){try{__CLR4_4_14s4slpno0x4h.R.inc(178);
        __CLR4_4_14s4slpno0x4h.R.inc(179);assertEquals("999999999999999999999999999999", BigNumber.bigNumberSimpleMulti("999999999999999999999999999999", "1"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testBothNegativeNumbers() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1md71av50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testBothNegativeNumbers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),180,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1md71av50(){try{__CLR4_4_14s4slpno0x4h.R.inc(180);
        __CLR4_4_14s4slpno0x4h.R.inc(181);assertEquals("56088", BigNumber.bigNumberSimpleMulti("-123", "-456"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testLargeNumbersWithDifferentSigns() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sxifhn52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testLargeNumbersWithDifferentSigns",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sxifhn52(){try{__CLR4_4_14s4slpno0x4h.R.inc(182);
        __CLR4_4_14s4slpno0x4h.R.inc(183);assertEquals("-999999999999999999999999999999", BigNumber.bigNumberSimpleMulti("999999999999999999999999999999", "-1"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testLeadingZeros() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1owqxry54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testLeadingZeros",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),184,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1owqxry54(){try{__CLR4_4_14s4slpno0x4h.R.inc(184);
        __CLR4_4_14s4slpno0x4h.R.inc(185);assertEquals("10488", BigNumber.bigNumberSimpleMulti("0023", "00456"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

//    @Test
//    public public void testEmptyString() {
//        // \u6748\u64b3\u53c6\u6d93\u8679\u2516\u701b\u6943\ue0c1\u6d93\u8be7\u7d1d\u93c8\u71b8\u6e5c\u6748\u64b3\u56ad\u6d94\u71b6\u8d1f "0"
//        assertEquals("0", BigNumber.bigNumberSimpleMulti("", "456"));
//    }
//
//
//    @Test
//    public public void testNullInputs() {
//        // \u6748\u64b3\u53c6\u6d93\ufffd null\u951b\u5c7e\u6e61\u93c8\u6d9c\u7ded\u9351\u8f70\u8d1f "0" \u93b4\u682c\ufffd\u5474\ufffd\u509a\u7d8b\u9428\u52ef\u654a\u7487\ue21a\ue629\u941e\ufffd
//        assertEquals("0", BigNumber.bigNumberSimpleMulti(null, "456"));
//    }
    @Test
    public void testBasicCase2() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xkezvx56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testBasicCase2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),186,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xkezvx56(){try{__CLR4_4_14s4slpno0x4h.R.inc(186);
        __CLR4_4_14s4slpno0x4h.R.inc(187);assertEquals("246", BigNumber.bigNumberAdd("123", "123"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testNegativeNumbers1() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jqgdhn58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testNegativeNumbers1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),188,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jqgdhn58(){try{__CLR4_4_14s4slpno0x4h.R.inc(188);
        __CLR4_4_14s4slpno0x4h.R.inc(189);assertEquals("-6246", BigNumber.bigNumberAdd("-123", "-123"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testZero1() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15h6yq5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testZero1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15h6yq5a(){try{__CLR4_4_14s4slpno0x4h.R.inc(190);
        __CLR4_4_14s4slpno0x4h.R.inc(191);assertEquals("123", BigNumber.bigNumberAdd("0", "123"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testLargeNumbers1() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1osnwdl5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testLargeNumbers1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1osnwdl5c(){try{__CLR4_4_14s4slpno0x4h.R.inc(192);
        __CLR4_4_14s4slpno0x4h.R.inc(193);assertEquals("999999999999999999999999999910122", BigNumber.bigNumberAdd("99999999999999999999999999999999", "123"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testDifferentLengthNumbers1() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1spu2zf5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testDifferentLengthNumbers1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),194,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1spu2zf5e(){try{__CLR4_4_14s4slpno0x4h.R.inc(194);
        __CLR4_4_14s4slpno0x4h.R.inc(195);assertEquals("111", BigNumber.bigNumberAdd("11", "100"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testLeadingZeros1() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ueer5t5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testLeadingZeros1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),196,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ueer5t5g(){try{__CLR4_4_14s4slpno0x4h.R.inc(196);
        __CLR4_4_14s4slpno0x4h.R.inc(197);assertEquals("123", BigNumber.bigNumberAdd("0123", "0"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testEmptyString1() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b7yw7g5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testEmptyString1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b7yw7g5i(){try{__CLR4_4_14s4slpno0x4h.R.inc(198);
        __CLR4_4_14s4slpno0x4h.R.inc(199);assertEquals("123", BigNumber.bigNumberAdd("123", ""));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

//    @Test
//    public void testNullInputs() {
//        assertEquals("123", BigNumber.bigNumberAdd("123", null));
//    }
    @Test
    public void testBasicCase1() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ubf13g5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testBasicCase1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),200,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ubf13g5k(){try{__CLR4_4_14s4slpno0x4h.R.inc(200);
        __CLR4_4_14s4slpno0x4h.R.inc(201);assertEquals("0", BigNumber.bigNumberSub("123", "123"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testPositiveResult() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1mb9cep5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testPositiveResult",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),202,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1mb9cep5m(){try{__CLR4_4_14s4slpno0x4h.R.inc(202);
        __CLR4_4_14s4slpno0x4h.R.inc(203);assertEquals("1", BigNumber.bigNumberSub("124", "123"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testNegativeResult() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ot7lwr5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testNegativeResult",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ot7lwr5o(){try{__CLR4_4_14s4slpno0x4h.R.inc(204);
        __CLR4_4_14s4slpno0x4h.R.inc(205);assertEquals("-1", BigNumber.bigNumberSub("123", "124"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testZeroResult() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gqa64e5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testZeroResult",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),206,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gqa64e5q(){try{__CLR4_4_14s4slpno0x4h.R.inc(206);
        __CLR4_4_14s4slpno0x4h.R.inc(207);assertEquals("0", BigNumber.bigNumberSub("123", "123"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testLargeNumbers2() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ljnxl45s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testLargeNumbers2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ljnxl45s(){try{__CLR4_4_14s4slpno0x4h.R.inc(208);
        __CLR4_4_14s4slpno0x4h.R.inc(209);assertEquals("-9999999999999999999999999998877", BigNumber.bigNumberSub("123", "9999999999999999999999999999000"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testDifferentLengthNumbers() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18tdqqs5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testDifferentLengthNumbers",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18tdqqs5u(){try{__CLR4_4_14s4slpno0x4h.R.inc(210);
        __CLR4_4_14s4slpno0x4h.R.inc(211);assertEquals("-1", BigNumber.bigNumberSub("10", "11"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testLeadingZeros2() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xnepya5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testLeadingZeros2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),212,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xnepya5w(){try{__CLR4_4_14s4slpno0x4h.R.inc(212);
        __CLR4_4_14s4slpno0x4h.R.inc(213);assertEquals("-99", BigNumber.bigNumberSub("001", "100"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testEmptyString() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lzzl3n5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testEmptyString",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lzzl3n5y(){try{__CLR4_4_14s4slpno0x4h.R.inc(214);
        __CLR4_4_14s4slpno0x4h.R.inc(215);assertEquals("123", BigNumber.bigNumberSub("123", ""));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

//    @Test
//    public void testNullInputs() {
//        assertEquals("123", BigNumber.bigNumberSub("123", null));
//    }

    @Test
    public void testSignsBothPositive() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15h1jvf60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testSignsBothPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15h1jvf60(){try{__CLR4_4_14s4slpno0x4h.R.inc(216);
        __CLR4_4_14s4slpno0x4h.R.inc(217);assertEquals("246", BigNumber.bigNumberSimpleMulti("123", "2"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testSignsBothNegative() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pxsv1b62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testSignsBothNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),218,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pxsv1b62(){try{__CLR4_4_14s4slpno0x4h.R.inc(218);
        __CLR4_4_14s4slpno0x4h.R.inc(219);assertEquals("246", BigNumber.bigNumberSimpleMulti("-123", "-2"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testSignAIsPositiveSignBIsNegative() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ng90uu64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testSignAIsPositiveSignBIsNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ng90uu64(){try{__CLR4_4_14s4slpno0x4h.R.inc(220);
        __CLR4_4_14s4slpno0x4h.R.inc(221);assertEquals("-246", BigNumber.bigNumberSimpleMulti("123", "-2"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testSignAIsNegativeSignBIsPositive() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1co31wi66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testSignAIsNegativeSignBIsPositive",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1co31wi66(){try{__CLR4_4_14s4slpno0x4h.R.inc(222);
        __CLR4_4_14s4slpno0x4h.R.inc(223);assertEquals("-246", BigNumber.bigNumberSimpleMulti("-123", "2"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testIfResultBecomesNegative() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r2h3mk68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testIfResultBecomesNegative",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r2h3mk68(){try{__CLR4_4_14s4slpno0x4h.R.inc(224);
        __CLR4_4_14s4slpno0x4h.R.inc(225);assertEquals("-246", BigNumber.bigNumberSimpleMulti("-123", "2"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testWithZeros() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1d4172y6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testWithZeros",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1d4172y6a(){try{__CLR4_4_14s4slpno0x4h.R.inc(226);
        __CLR4_4_14s4slpno0x4h.R.inc(227);assertEquals("0", BigNumber.bigNumberSimpleMulti("0", "456"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testWithSingleDigit() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163r7l86c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testWithSingleDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163r7l86c(){try{__CLR4_4_14s4slpno0x4h.R.inc(228);
        __CLR4_4_14s4slpno0x4h.R.inc(229);assertEquals("5", BigNumber.bigNumberSimpleMulti("5", "1"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}

    @Test
    public void testWithNegativeSingleDigit() {__CLR4_4_14s4slpno0x4h.R.globalSliceStart(getClass().getName(),230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uew5j36e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s4slpno0x4h.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s4slpno0x4h.R.globalSliceEnd(getClass().getName(),"net.mooctest.BigNumberTest.testWithNegativeSingleDigit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uew5j36e(){try{__CLR4_4_14s4slpno0x4h.R.inc(230);
        __CLR4_4_14s4slpno0x4h.R.inc(231);assertEquals("-5", BigNumber.bigNumberSimpleMulti("-5", "1"));
    }finally{__CLR4_4_14s4slpno0x4h.R.flushNeeded();}}
}
