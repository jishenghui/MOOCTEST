/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import javax.enterprise.inject.New;

import org.junit.Test;

public class SplayTreeTest {static class __CLR4_4_1eyeyll4usq9x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0033\u0033\u0038\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0053\u0050\u004c\u0041\u0059\u0054\u0052\u0045\u0045\u0031\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691653468638L,8589935092L,661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testAddAndSize() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1umhzowey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testAddAndSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),538,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1umhzowey(){try{__CLR4_4_1eyeyll4usq9x.R.inc(538);
        __CLR4_4_1eyeyll4usq9x.R.inc(539);SplaySubTree<Integer> tree = new SplaySubTree<>(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(540);assertEquals(1, tree.size());

        __CLR4_4_1eyeyll4usq9x.R.inc(541);tree = tree.add(Integer.valueOf(3));
        __CLR4_4_1eyeyll4usq9x.R.inc(542);tree = tree.add(Integer.valueOf(8));
        __CLR4_4_1eyeyll4usq9x.R.inc(543);tree = tree.add(Integer.valueOf(2));
        __CLR4_4_1eyeyll4usq9x.R.inc(544);tree = tree.add(Integer.valueOf(4));

        __CLR4_4_1eyeyll4usq9x.R.inc(545);assertEquals(5, tree.size());
        __CLR4_4_1eyeyll4usq9x.R.inc(546);System.out.println(tree.toString());
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}

    @Test
    public void testIndexOf() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1656tvif7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testIndexOf",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),547,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1656tvif7(){try{__CLR4_4_1eyeyll4usq9x.R.inc(547);
        __CLR4_4_1eyeyll4usq9x.R.inc(548);SplaySubTree<Integer> tree = new SplaySubTree<>(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(549);tree = tree.add(3);
        __CLR4_4_1eyeyll4usq9x.R.inc(550);tree = tree.add(8);
        __CLR4_4_1eyeyll4usq9x.R.inc(551);tree = tree.add(2);
        __CLR4_4_1eyeyll4usq9x.R.inc(552);tree = tree.add(4);

        __CLR4_4_1eyeyll4usq9x.R.inc(553);assertEquals(4, tree.indexOf(5));
        __CLR4_4_1eyeyll4usq9x.R.inc(554);assertEquals(2, tree.indexOf(3));
        __CLR4_4_1eyeyll4usq9x.R.inc(555);assertEquals(5, tree.indexOf(8));
        __CLR4_4_1eyeyll4usq9x.R.inc(556);assertEquals(1, tree.indexOf(2));
        __CLR4_4_1eyeyll4usq9x.R.inc(557);assertEquals(3, tree.indexOf(4));
        __CLR4_4_1eyeyll4usq9x.R.inc(558);assertEquals(-1, tree.indexOf(7)); 
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}

    @Test
    public void testRemove() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1ej1cn1fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),559,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1ej1cn1fj(){try{__CLR4_4_1eyeyll4usq9x.R.inc(559);
    	__CLR4_4_1eyeyll4usq9x.R.inc(560);SplaySubTree<Integer> tree = new SplaySubTree<>(null);

        __CLR4_4_1eyeyll4usq9x.R.inc(561);tree = tree.remove(5);

        __CLR4_4_1eyeyll4usq9x.R.inc(562);assertNull(tree.getData());
        
        __CLR4_4_1eyeyll4usq9x.R.inc(563);SplaySubTree<Integer> tree1 = new SplaySubTree<>(5);

        __CLR4_4_1eyeyll4usq9x.R.inc(564);tree1 = tree1.remove(10);

        __CLR4_4_1eyeyll4usq9x.R.inc(565);assertEquals(1, tree1.size());
        
        __CLR4_4_1eyeyll4usq9x.R.inc(566);SplaySubTree<Integer> tree2 = new SplaySubTree<>(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(567);tree2 = tree2.add(3);
        __CLR4_4_1eyeyll4usq9x.R.inc(568);tree2 = tree2.add(8);

        __CLR4_4_1eyeyll4usq9x.R.inc(569);tree2 = tree2.remove(5);

        __CLR4_4_1eyeyll4usq9x.R.inc(570);assertEquals(2, tree2.size());
        
        __CLR4_4_1eyeyll4usq9x.R.inc(571);assertEquals(Integer.valueOf(5), tree2.getData());

        __CLR4_4_1eyeyll4usq9x.R.inc(572);SplaySubTree<Integer> tree3 = new SplaySubTree<>(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(573);tree3 = tree3.remove(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(574);assertEquals(0, tree3.size());
        __CLR4_4_1eyeyll4usq9x.R.inc(575);SplaySubTree<Integer> tree4 = new SplaySubTree<>(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(576);tree4 = tree4.add(6);
        __CLR4_4_1eyeyll4usq9x.R.inc(577);tree4 = tree4.add(7);
        __CLR4_4_1eyeyll4usq9x.R.inc(578);tree4 = tree4.add(8);
        __CLR4_4_1eyeyll4usq9x.R.inc(579);tree4 = tree4.add(9);
        __CLR4_4_1eyeyll4usq9x.R.inc(580);tree4 = tree4.add(10);
        __CLR4_4_1eyeyll4usq9x.R.inc(581);tree4 = tree4.add(11);
        __CLR4_4_1eyeyll4usq9x.R.inc(582);tree4 = tree4.remove(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(583);assertEquals(6, tree4.size());
      
        
        
         
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    

    @Test
    public void testJoinAndSplit() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1sqq3veg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testJoinAndSplit",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),584,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1sqq3veg8(){try{__CLR4_4_1eyeyll4usq9x.R.inc(584);
    	__CLR4_4_1eyeyll4usq9x.R.inc(585);SplaySubTree<Integer> tree = new SplaySubTree<>(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(586);tree = tree.add(3);
        __CLR4_4_1eyeyll4usq9x.R.inc(587);tree = tree.add(8);
        __CLR4_4_1eyeyll4usq9x.R.inc(588);tree = tree.add(2);
        __CLR4_4_1eyeyll4usq9x.R.inc(589);tree = tree.add(4);
        
        __CLR4_4_1eyeyll4usq9x.R.inc(590);SplaySubTree<Integer> tree1 = new SplaySubTree<Integer>(0);
        
        __CLR4_4_1eyeyll4usq9x.R.inc(591);assertNull(tree1.join(tree));
        __CLR4_4_1eyeyll4usq9x.R.inc(592);assertNull(tree1.split(2));
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    @Test
    public void testFind() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1b6e5w2gh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testFind",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),593,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1b6e5w2gh(){try{__CLR4_4_1eyeyll4usq9x.R.inc(593);
    	__CLR4_4_1eyeyll4usq9x.R.inc(594);SplaySubTree<Integer> tree = new SplaySubTree<>(null);
        __CLR4_4_1eyeyll4usq9x.R.inc(595);assertNull(tree.find(1));
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    @Test
    public void testGet() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1tpje3vgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1tpje3vgk(){try{__CLR4_4_1eyeyll4usq9x.R.inc(596);
    	__CLR4_4_1eyeyll4usq9x.R.inc(597);SplaySubTree<Integer> tree = new SplaySubTree<>(null);
    	__CLR4_4_1eyeyll4usq9x.R.inc(598);assertNull(tree.get(-1));
    	__CLR4_4_1eyeyll4usq9x.R.inc(599);assertNull(tree.get(1));
    	__CLR4_4_1eyeyll4usq9x.R.inc(600);SplaySubTree<Integer> tree1 = new SplaySubTree<>(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(601);tree1 = tree1.add(3);
        __CLR4_4_1eyeyll4usq9x.R.inc(602);tree1 = tree1.add(8);
        __CLR4_4_1eyeyll4usq9x.R.inc(603);tree1 = tree1.add(2);
        __CLR4_4_1eyeyll4usq9x.R.inc(604);assertEquals(Integer.valueOf(2), tree1.get(1).getData());
        __CLR4_4_1eyeyll4usq9x.R.inc(605);tree1 = tree1.add(4);
        __CLR4_4_1eyeyll4usq9x.R.inc(606);System.out.println(tree1.toString());
        __CLR4_4_1eyeyll4usq9x.R.inc(607);assertEquals(Integer.valueOf(2), tree1.get(1).getData());
        __CLR4_4_1eyeyll4usq9x.R.inc(608);assertEquals(Integer.valueOf(5), tree1.get(4).getData());
        
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    
    @Test
    public void testSplayTreeAddAndSize() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11fy8s1gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testSplayTreeAddAndSize",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11fy8s1gx(){try{__CLR4_4_1eyeyll4usq9x.R.inc(609);
    	__CLR4_4_1eyeyll4usq9x.R.inc(610);SplayTree<String> splayTree = new SplayTree<String>();
    	
    	__CLR4_4_1eyeyll4usq9x.R.inc(611);splayTree.add("apple");
    	__CLR4_4_1eyeyll4usq9x.R.inc(612);splayTree.add("apple1");
    	__CLR4_4_1eyeyll4usq9x.R.inc(613);splayTree.add("apple2");
    	__CLR4_4_1eyeyll4usq9x.R.inc(614);splayTree.add("apple3");
    	__CLR4_4_1eyeyll4usq9x.R.inc(615);splayTree.add("apple4");
    	
    	__CLR4_4_1eyeyll4usq9x.R.inc(616);assertEquals(5, splayTree.size());
    	__CLR4_4_1eyeyll4usq9x.R.inc(617);System.out.println(splayTree.toString());    	
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    
    @Test
    public void testSplayTreeIndexOF() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_131hxojh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testSplayTreeIndexOF",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_131hxojh6(){try{__CLR4_4_1eyeyll4usq9x.R.inc(618);
    	__CLR4_4_1eyeyll4usq9x.R.inc(619);SplayTree<Integer> splayTree = new SplayTree<>();
    	__CLR4_4_1eyeyll4usq9x.R.inc(620);splayTree.add(5);
    	__CLR4_4_1eyeyll4usq9x.R.inc(621);splayTree.add(3);
    	__CLR4_4_1eyeyll4usq9x.R.inc(622);splayTree.add(8);
    	__CLR4_4_1eyeyll4usq9x.R.inc(623);splayTree.add(2);
    	__CLR4_4_1eyeyll4usq9x.R.inc(624);splayTree.add(4);
    	__CLR4_4_1eyeyll4usq9x.R.inc(625);System.out.println(splayTree.toString());
    	__CLR4_4_1eyeyll4usq9x.R.inc(626);assertEquals(-1, splayTree.indexOf(-1));
//    	assertEquals(3, splayTree.indexOf(1));
//
//    	assertEquals(4, splayTree.indexOf(2));
//
//    	assertEquals(5, splayTree.indexOf(3));
//
//    	assertEquals(8, splayTree.indexOf(4));

    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    
    @Test
    public void testSplayTreeContains() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17bus3rhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testSplayTreeContains",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17bus3rhf(){try{__CLR4_4_1eyeyll4usq9x.R.inc(627);
    	__CLR4_4_1eyeyll4usq9x.R.inc(628);SplayTree<Integer> tree = new SplayTree<>();
    	
    	__CLR4_4_1eyeyll4usq9x.R.inc(629);tree.add(5);__CLR4_4_1eyeyll4usq9x.R.inc(630);;
        __CLR4_4_1eyeyll4usq9x.R.inc(631);tree.add(3);
        __CLR4_4_1eyeyll4usq9x.R.inc(632);tree.add(8);
        __CLR4_4_1eyeyll4usq9x.R.inc(633);tree.add(2);
        __CLR4_4_1eyeyll4usq9x.R.inc(634);tree.add(4);
        
        __CLR4_4_1eyeyll4usq9x.R.inc(635);assertNotNull(tree.contains(5));
        __CLR4_4_1eyeyll4usq9x.R.inc(636);assertNotNull(tree.contains(0));
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    
    @Test
    public void testSplayTreeRemove() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15bqc76hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testSplayTreeRemove",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),637,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15bqc76hp(){try{__CLR4_4_1eyeyll4usq9x.R.inc(637);
    	__CLR4_4_1eyeyll4usq9x.R.inc(638);SplayTree<Integer> tree = new SplayTree<>();
    	
    	__CLR4_4_1eyeyll4usq9x.R.inc(639);tree.add(5);__CLR4_4_1eyeyll4usq9x.R.inc(640);;
        __CLR4_4_1eyeyll4usq9x.R.inc(641);tree.add(3);
        __CLR4_4_1eyeyll4usq9x.R.inc(642);tree.add(8);
        __CLR4_4_1eyeyll4usq9x.R.inc(643);tree.add(2);
        __CLR4_4_1eyeyll4usq9x.R.inc(644);tree.add(4);
        __CLR4_4_1eyeyll4usq9x.R.inc(645);tree.add(10);
        
        __CLR4_4_1eyeyll4usq9x.R.inc(646);System.out.println(tree.toString());
        
        __CLR4_4_1eyeyll4usq9x.R.inc(647);tree.remove(5);
        __CLR4_4_1eyeyll4usq9x.R.inc(648);tree.remove(1);
        
        __CLR4_4_1eyeyll4usq9x.R.inc(649);System.out.println(tree);
//        assertEquals(5, tree.get(index));
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    
    @Test
    public void testSplayTreeGet() {__CLR4_4_1eyeyll4usq9x.R.globalSliceStart(getClass().getName(),650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11qe4l2i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1eyeyll4usq9x.R.rethrow($CLV_t2$);}finally{__CLR4_4_1eyeyll4usq9x.R.globalSliceEnd(getClass().getName(),"net.mooctest.SplayTreeTest.testSplayTreeGet",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11qe4l2i2(){try{__CLR4_4_1eyeyll4usq9x.R.inc(650);
    	__CLR4_4_1eyeyll4usq9x.R.inc(651);SplayTree<String> tree = new SplayTree<>();
    	__CLR4_4_1eyeyll4usq9x.R.inc(652);tree.add("a");
    	__CLR4_4_1eyeyll4usq9x.R.inc(653);tree.add("b");
    	__CLR4_4_1eyeyll4usq9x.R.inc(654);tree.add("c");
    	__CLR4_4_1eyeyll4usq9x.R.inc(655);tree.add("b");
    	__CLR4_4_1eyeyll4usq9x.R.inc(656);tree.add("e");
    	
    	__CLR4_4_1eyeyll4usq9x.R.inc(657);SplayTree<String> tree1 = new SplayTree<>();
    	__CLR4_4_1eyeyll4usq9x.R.inc(658);assertNotNull(tree.get(3));
    	
    	__CLR4_4_1eyeyll4usq9x.R.inc(659);tree1.add(null);
    	__CLR4_4_1eyeyll4usq9x.R.inc(660);assertNull(tree1.get(1));
    }finally{__CLR4_4_1eyeyll4usq9x.R.flushNeeded();}}
    

}
