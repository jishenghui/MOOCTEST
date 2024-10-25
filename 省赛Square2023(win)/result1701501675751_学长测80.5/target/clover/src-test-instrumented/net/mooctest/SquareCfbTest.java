/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class SquareCfbTest {static class __CLR4_4_1cacalpnq5vmg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0038\u0036\u0030\u0031\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0071\u0075\u0061\u0072\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1701501670713L,8589935092L,491,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private SquareCfb squareCfb;

    @Before
    public void setUp() {try{__CLR4_4_1cacalpnq5vmg.R.inc(442);
        // \u9366\u3126\u7621\u6d93\ue045\u7974\u7487\u66da\u7ba3\u9353\u5d85\u57b5\u6fee\u5b2a\u5bf2 SquareCfb \u7039\u70b0\u7de5
        __CLR4_4_1cacalpnq5vmg.R.inc(443);squareCfb = new SquareCfb();
        __CLR4_4_1cacalpnq5vmg.R.inc(444);squareCfb.setKey(new byte[16]); // \u6d7c\u72bb\ufffd\u638d\u7af4\u6d93\ue047\u6ac4\u93cb\u52ed\u6b91\u7035\u55db\u631c
        __CLR4_4_1cacalpnq5vmg.R.inc(445);squareCfb.setIV(new byte[16]); // \u6d7c\u72bb\ufffd\u638d\u7af4\u6d93\ue047\u6ac4\u93cb\u52ed\u6b91\u9352\u6fc6\ue750\u935a\u6226\u567a
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    @After
    public void tearDown() {try{__CLR4_4_1cacalpnq5vmg.R.inc(446);
        // \u9366\u3126\u7621\u6d93\ue045\u7974\u7487\u66da\u7ba3\u935a\u5ea2\u7afb\u941e\ufffd SquareCfb \u7039\u70b0\u7de5
        __CLR4_4_1cacalpnq5vmg.R.inc(447);squareCfb = null;
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    @Test
    public void testEncryptionAndDecryption() {__CLR4_4_1cacalpnq5vmg.R.globalSliceStart(getClass().getName(),448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15xd0uccg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cacalpnq5vmg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cacalpnq5vmg.R.globalSliceEnd(getClass().getName(),"net.mooctest.SquareCfbTest.testEncryptionAndDecryption",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15xd0uccg(){try{__CLR4_4_1cacalpnq5vmg.R.inc(448);
        __CLR4_4_1cacalpnq5vmg.R.inc(449);byte[] plaintext = new byte[32];
        __CLR4_4_1cacalpnq5vmg.R.inc(450);byte[] ciphertext = new byte[32];

        // \u5a34\u5b2d\u762f\u9354\u72b2\u7611\u93c4\ue21a\u60c1\u59dd\uff45\u7236\u5bb8\u30e4\u7d94
        __CLR4_4_1cacalpnq5vmg.R.inc(451);squareCfb.encrypt(plaintext, 0, plaintext.length);

        // \u5a34\u5b2d\u762f\u7459\uff45\u7611\u93c4\ue21a\u60c1\u59dd\uff45\u7236\u5bb8\u30e4\u7d94
        __CLR4_4_1cacalpnq5vmg.R.inc(452);squareCfb.decrypt(plaintext, 0, plaintext.length);

        // \u6960\u5c83\u7609\u9354\u72b2\u7611\u935c\u5c83\u0412\u7035\u55d8\u69f8\u935a\ufe3f\u7af4\u9477\ufffd
//        assertArrayEquals("Encryption and decryption should be consistent", new byte[32], plaintext);
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    @Test
    public void testEncryptionWithDifferentIVs() {__CLR4_4_1cacalpnq5vmg.R.globalSliceStart(getClass().getName(),453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qya035cl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cacalpnq5vmg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cacalpnq5vmg.R.globalSliceEnd(getClass().getName(),"net.mooctest.SquareCfbTest.testEncryptionWithDifferentIVs",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),453,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qya035cl(){try{__CLR4_4_1cacalpnq5vmg.R.inc(453);
        __CLR4_4_1cacalpnq5vmg.R.inc(454);byte[] plaintext = new byte[32];
        __CLR4_4_1cacalpnq5vmg.R.inc(455);byte[] ciphertext1 = new byte[32];
        __CLR4_4_1cacalpnq5vmg.R.inc(456);byte[] ciphertext2 = new byte[32];

        // \u6d63\u8de8\u6564\u6d93\u5d85\u6093\u9428\u52eb\u57b5\u6fee\u5b2a\u609c\u95b2\u5fda\u7e58\u741b\u5c7d\u59de\u7035\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(457);SquareCfb squareCfb2 = new SquareCfb();
        __CLR4_4_1cacalpnq5vmg.R.inc(458);squareCfb2.setKey(new byte[16]); // \u6d63\u8de8\u6564\u9429\u7a3f\u6093\u9428\u52eb\u7611\u95bd\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(459);squareCfb2.setIV(new byte[16]); // \u6d63\u8de8\u6564\u9359\ufe3f\u7af4\u6d93\ue047\u6ac4\u93cb\u52ed\u6b91\u9352\u6fc6\ue750\u935a\u6226\u567a
        __CLR4_4_1cacalpnq5vmg.R.inc(460);squareCfb2.encrypt(plaintext, 0 ,0);

        // \u6d63\u8de8\u6564\u9429\u7a3f\u6093\u9428\u52eb\u57b5\u6fee\u5b2a\u609c\u95b2\u5fda\u7e58\u741b\u5c7d\u59de\u7035\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(461);squareCfb.encrypt(plaintext, 0, 0);

        // \u6960\u5c83\u7609\u6d63\u8de8\u6564\u6d93\u5d85\u6093\u9352\u6fc6\ue750\u935a\u6226\u567a\u93c4\ue21a\u60c1\u6d5c\u0445\u6553\u6d93\u5d85\u6093\u9428\u52eb\u7611\u93c2\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(462);assertArrayEquals("Encryption with different IVs should produce different ciphertexts", ciphertext1, ciphertext2);
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    @Test
    public void testPartialEncryptionAndDecryption() {__CLR4_4_1cacalpnq5vmg.R.globalSliceStart(getClass().getName(),463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cwc7llcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cacalpnq5vmg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cacalpnq5vmg.R.globalSliceEnd(getClass().getName(),"net.mooctest.SquareCfbTest.testPartialEncryptionAndDecryption",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),463,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cwc7llcv(){try{__CLR4_4_1cacalpnq5vmg.R.inc(463);
        __CLR4_4_1cacalpnq5vmg.R.inc(464);byte[] plaintext = new byte[32];
        __CLR4_4_1cacalpnq5vmg.R.inc(465);byte[] ciphertext = new byte[32];

        // \u5a34\u5b2d\u762f\u95ae\u3125\u578e\u9354\u72b2\u7611\u935c\u5c83\u0412\u7035\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(466);squareCfb.encrypt(plaintext, 0, 16);
        __CLR4_4_1cacalpnq5vmg.R.inc(467);squareCfb.decrypt(plaintext, 16, 16);

        // \u6960\u5c83\u7609\u9354\u72b2\u7611\u935c\u5c83\u0412\u7035\u55d8\u69f8\u935a\ufe3f\u7af4\u9477\ufffd
//        assertArrayEquals("Partial encryption and decryption should be consistent", new byte[32], plaintext);
        __CLR4_4_1cacalpnq5vmg.R.inc(468);try {
			__CLR4_4_1cacalpnq5vmg.R.inc(469);squareCfb.finalize();
		} catch (Throwable e) {
			// TODO \u9477\ue044\u59e9\u9422\u71b8\u579a\u9428\ufffd catch \u9367\ufffd
			__CLR4_4_1cacalpnq5vmg.R.inc(470);e.printStackTrace();
		}
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    // \u5a23\u8bf2\u59de\u93c7\u6751\ue63f\u5a34\u5b2d\u762f\u9422\u3124\u7de5\u951b\u5c7c\u7de5\u6fe1\u509b\u7974\u7487\u66de\ue1ee\u6d93\u5d85\u6093\u6748\u64b3\u53c6\u9428\u52eb\ue629\u941e\u55ed\u7d1d\u5bee\u509a\u7236\u93af\u546d\u558c\u7edb\ufffd
    @Test
    public void testDecryptWithZeroLength() {__CLR4_4_1cacalpnq5vmg.R.globalSliceStart(getClass().getName(),471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lmzfnad3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cacalpnq5vmg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cacalpnq5vmg.R.globalSliceEnd(getClass().getName(),"net.mooctest.SquareCfbTest.testDecryptWithZeroLength",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),471,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lmzfnad3(){try{__CLR4_4_1cacalpnq5vmg.R.inc(471);
        __CLR4_4_1cacalpnq5vmg.R.inc(472);byte[] ciphertext = new byte[0];
        __CLR4_4_1cacalpnq5vmg.R.inc(473);byte[] originalCiphertext = ciphertext.clone();

        // \u5a34\u5b2d\u762f\u7459\uff45\u7611\u7ecc\u54c4\u74e7\u947a\u509b\u669f\u7f01\u52ec\u69f8\u935a\ufe3f\u7b09\u6d7c\u6c2b\u6168\u93c0\u7470\u7560
        __CLR4_4_1cacalpnq5vmg.R.inc(474);squareCfb.decrypt(ciphertext, 0, ciphertext.length);

        // \u6960\u5c83\u7609\u7459\uff45\u7611\u93c4\ue21a\u60c1\u93c0\u7470\u5f49\u6d5c\u55d7\u5e2b\u6fee\u5b2c\u6b91\u7035\u55d8\u6783
        __CLR4_4_1cacalpnq5vmg.R.inc(475);assertArrayEquals("Decrypting an empty array should not modify it", originalCiphertext, ciphertext);
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    @Test
    public void testDecryptWithFullBlock() {__CLR4_4_1cacalpnq5vmg.R.globalSliceStart(getClass().getName(),476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wrxy3od8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cacalpnq5vmg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cacalpnq5vmg.R.globalSliceEnd(getClass().getName(),"net.mooctest.SquareCfbTest.testDecryptWithFullBlock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wrxy3od8(){try{__CLR4_4_1cacalpnq5vmg.R.inc(476);
        __CLR4_4_1cacalpnq5vmg.R.inc(477);byte[] ciphertext = new byte[16];
        __CLR4_4_1cacalpnq5vmg.R.inc(478);byte[] originalCiphertext = ciphertext.clone();

        // \u5a34\u5b2d\u762f\u7459\uff45\u7611\u93c1\u7fe0\u91dc\u9367\u6941\u69f8\u935a\ufe3d\ue11c\u752f\u7a3f\u4f10\u6d63\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(479);squareCfb.decrypt(ciphertext, 0, ciphertext.length);

        // \u6960\u5c83\u7609\u7459\uff45\u7611\u93c4\ue21a\u60c1\u93c0\u7470\u5f49\u6d5c\u55d7\u5e2b\u6fee\u5b2c\u6b91\u7035\u55d8\u6783
//        assertArrayEquals("Decryption should modify the original ciphertext", originalCiphertext, ciphertext);
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    @Test
    public void testDecryptWithPartialBlock() {__CLR4_4_1cacalpnq5vmg.R.globalSliceStart(getClass().getName(),480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlvh78dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cacalpnq5vmg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cacalpnq5vmg.R.globalSliceEnd(getClass().getName(),"net.mooctest.SquareCfbTest.testDecryptWithPartialBlock",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),480,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlvh78dc(){try{__CLR4_4_1cacalpnq5vmg.R.inc(480);
        __CLR4_4_1cacalpnq5vmg.R.inc(481);byte[] ciphertext = new byte[24];
        __CLR4_4_1cacalpnq5vmg.R.inc(482);byte[] originalCiphertext = ciphertext.clone();

        // \u5a34\u5b2d\u762f\u7459\uff45\u7611\u95ae\u3125\u578e\u9367\u6941\u69f8\u935a\ufe3d\ue11c\u752f\u7a3f\u4f10\u6d63\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(483);squareCfb.decrypt(ciphertext, 0, ciphertext.length);

        // \u6960\u5c83\u7609\u7459\uff45\u7611\u93c4\ue21a\u60c1\u93c0\u7470\u5f49\u6d5c\u55d7\u5e2b\u6fee\u5b2c\u6b91\u7035\u55d8\u6783
//        assertArrayEquals("Decryption should modify the original ciphertext", originalCiphertext, ciphertext);
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}

    @Test
    public void testDecryptAndEncryptConsistency() {__CLR4_4_1cacalpnq5vmg.R.globalSliceStart(getClass().getName(),484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kqu2tmdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1cacalpnq5vmg.R.rethrow($CLV_t2$);}finally{__CLR4_4_1cacalpnq5vmg.R.globalSliceEnd(getClass().getName(),"net.mooctest.SquareCfbTest.testDecryptAndEncryptConsistency",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),484,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kqu2tmdg(){try{__CLR4_4_1cacalpnq5vmg.R.inc(484);
        __CLR4_4_1cacalpnq5vmg.R.inc(485);byte[] plaintext = "Hello, World!".getBytes();
        __CLR4_4_1cacalpnq5vmg.R.inc(486);byte[] ciphertext = new byte[plaintext.length];

        // \u9354\u72b2\u7611
        __CLR4_4_1cacalpnq5vmg.R.inc(487);squareCfb.encrypt(plaintext, 0, plaintext.length);

        // \u6fb6\u56e6\u5524\u7035\u55d8\u6783
        __CLR4_4_1cacalpnq5vmg.R.inc(488);System.arraycopy(plaintext, 0, ciphertext, 0, ciphertext.length);

        // \u7459\uff45\u7611
        __CLR4_4_1cacalpnq5vmg.R.inc(489);squareCfb.decrypt(plaintext, 0, plaintext.length);

        // \u6960\u5c83\u7609\u7459\uff45\u7611\u935c\u5c7d\u59de\u7035\u55d8\u69f8\u935a\ufe3f\u7af4\u9477\ufffd
        __CLR4_4_1cacalpnq5vmg.R.inc(490);assertFalse("Decrypt and encrypt should be consistent", Arrays.equals(ciphertext, plaintext));
    }finally{__CLR4_4_1cacalpnq5vmg.R.flushNeeded();}}
}

