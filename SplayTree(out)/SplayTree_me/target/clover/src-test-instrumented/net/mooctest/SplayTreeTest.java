/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplayTreeTest {static class __CLR4_4_12ty2tyll4qxt54{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0038\u005c\u005c\u0039\u0039\u0032\u0037\u0037\u005c\u005c\u0053\u0050\u004c\u0041\u0059\u0054\u0052\u0045\u0045\u0031\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691646986663L,8589935092L,3765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test(timeout = 4000)
	  public void test00()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1pt4bd2ty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test00",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3670,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1pt4bd2ty() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3670);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3671);SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3672);Integer integer0 = new Integer(0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3673);SplaySubTree<Integer> splaySubTree0 = new SplaySubTree<Integer>(integer0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3674);splayTree0.root = splaySubTree0;
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3675);Integer integer1 = Integer.getInteger("", (-1));
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3676);splayTree0.add(integer1);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3677);boolean boolean0 = splayTree0.contains(integer0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3678);assertTrue(boolean0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13yt33u2u7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test01",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13yt33u2u7() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3679);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3680);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3681);splayTree0.add("");
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3682);splayTree0.add("P");
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3683);long long0 = splayTree0.indexOf("");
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3684);assertEquals(1L, long0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_177t1wb2ud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test02",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3685,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_177t1wb2ud() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3685);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3686);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3687);splayTree0.add("");
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3688);long long0 = splayTree0.size();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3689);assertEquals(1L, long0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1agt0os2ui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test03",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3690,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1agt0os2ui() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3690);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3691);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3692);long long0 = splayTree0.indexOf((String) null);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3693);assertEquals((-1L), long0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dpszh92um();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test04",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dpszh92um() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3694);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3695);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3696);splayTree0.root = null;
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3697);try { 
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3698);splayTree0.toString();
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3699);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gysy9q2us();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test05",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3700,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gysy9q2us() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3700);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3701);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3702);splayTree0.root = null;
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3703);try { 
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3704);splayTree0.size();
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3705);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1k7sx272uy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test06",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3706,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1k7sx272uy() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3706);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3707);SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3708);Integer integer0 = new Integer(0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3709);splayTree0.root = null;
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3710);try { 
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3711);splayTree0.remove(integer0);
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3712);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ngsvuo2v5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test07",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3713,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ngsvuo2v5() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3713);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3714);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3715);splayTree0.root = null;
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3716);try { 
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3717);splayTree0.get(0L);
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3718);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qpsun52vb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test08",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3719,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qpsun52vb() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3719);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3720);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3721);splayTree0.add("");
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3722);try { 
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3723);splayTree0.contains((String) null);
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3724);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tystfm2vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test09",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tystfm2vh() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3725);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3726);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3727);splayTree0.root = null;
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3728);try { 
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3729);splayTree0.add("");
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3730);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	      }
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ufo0uw2vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ufo0uw2vn() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3731);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3732);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3733);splayTree0.add("");
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3734);String string0 = splayTree0.get(1L);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3735);assertEquals("", string0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1xonznd2vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3736,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1xonznd2vs() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3736);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3737);String[] stringArray0 = new String[6];
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3738);SplayTree.main(stringArray0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1y3g3ja2vv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3739,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1y3g3ja2vv() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3739);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3740);SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3741);Integer integer0 = new Integer(0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3742);boolean boolean0 = splayTree0.contains(integer0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3743);assertFalse(boolean0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uug4qt2w0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3744,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uug4qt2w0() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3744);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3745);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3746);String string0 = splayTree0.get(0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3747);assertNull(string0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rlg5yc2w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3748,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rlg5yc2w4() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3748);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3749);SplayTree<String> splayTree0 = new SplayTree<String>();
	      // Undeclared exception!
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3750);try { 
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3751);splayTree0.indexOf("");
	        __CLR4_4_12ty2tyll4qxt54.R.inc(3752);fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         
	      }
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ocg75v2w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test15",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ocg75v2w9() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3753);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3754);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3755);long long0 = splayTree0.size();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3756);assertEquals(0L, long0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1l3g8de2wd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test16",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3757,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1l3g8de2wd() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3757);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3758);SplayTree<String> splayTree0 = new SplayTree<String>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3759);String string0 = splayTree0.toString();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3760);assertEquals(" data=null left= null right null sz=0 cnt=0\n", string0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {__CLR4_4_12ty2tyll4qxt54.R.globalSliceStart(getClass().getName(),3761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hug9kx2wh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12ty2tyll4qxt54.R.rethrow($CLV_t2$);}finally{__CLR4_4_12ty2tyll4qxt54.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.test17",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),3761,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hug9kx2wh() throws Throwable{try{__CLR4_4_12ty2tyll4qxt54.R.inc(3761);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3762);SplayTree<Integer> splayTree0 = new SplayTree<Integer>();
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3763);Integer integer0 = new Integer(0);
	      __CLR4_4_12ty2tyll4qxt54.R.inc(3764);splayTree0.remove(integer0);
	  }finally{__CLR4_4_12ty2tyll4qxt54.R.flushNeeded();}}

}
