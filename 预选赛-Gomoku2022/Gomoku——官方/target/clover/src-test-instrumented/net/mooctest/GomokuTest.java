/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.*;
import java.util.*;

import org.junit.Test;


public class GomokuTest {static class __CLR4_4_1ehehkv4p59ly{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0036\u0031\u0039\u0030\u005c\u005c\u0031\u0031\u0033\u0038\u0036\u0033\u005c\u005c\u0047\u006f\u006d\u006f\u006b\u0075\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1635047635150L,8589935092L,640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

  @Test(timeout = 4000)
  public void test()  {__CLR4_4_1ehehkv4p59ly.R.globalSliceStart(getClass().getName(),521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3eh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ehehkv4p59ly.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ehehkv4p59ly.R.globalSliceEnd(getClass().getName(),"net.mooctest.GomokuTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3eh(){try{__CLR4_4_1ehehkv4p59ly.R.inc(521);
	  __CLR4_4_1ehehkv4p59ly.R.inc(522);Gomoku.initBoard();
      __CLR4_4_1ehehkv4p59ly.R.inc(523);assertEquals("[000000000000000, 000000000000000, 0, 000000222100000]", Gomoku.getString(0, 0).toString());
      __CLR4_4_1ehehkv4p59ly.R.inc(524);assertTrue(Gomoku.checkSituation(2, Gomoku.getString(0, 0), 4));
      __CLR4_4_1ehehkv4p59ly.R.inc(525);assertEquals("[000000001100000, 000000222000000, 0000000, 000000000000]", Gomoku.getString(6, 9).toString());
      __CLR4_4_1ehehkv4p59ly.R.inc(526);assertTrue(Gomoku.checkSituation(2, Gomoku.getString(6, 6), 3));
      
//      System.out.println(Gomoku.getString(6, 9).toString());
      __CLR4_4_1ehehkv4p59ly.R.inc(527);assertEquals(-396900, Gomoku.computeScore());
      
      __CLR4_4_1ehehkv4p59ly.R.inc(528);assertEquals(4903300, Gomoku.alphaBeta(new Node(1,6,9), -1000000000, 1000000000, 1));
	  __CLR4_4_1ehehkv4p59ly.R.inc(529);assertEquals(-5156700, Gomoku.alphaBeta(new Node(1,6,5), -1000000000, 1000000000, 2));
	  __CLR4_4_1ehehkv4p59ly.R.inc(530);assertEquals(-44700, Gomoku.alphaBeta(new Node(1,6,9), -1000000000, 1000000000, 3));
	  
	  __CLR4_4_1ehehkv4p59ly.R.inc(531);List<Node> nodes = new ArrayList<Node>();
	  
	  __CLR4_4_1ehehkv4p59ly.R.inc(532);for (int i=0; (((i<15)&&(__CLR4_4_1ehehkv4p59ly.R.iget(533)!=0|true))||(__CLR4_4_1ehehkv4p59ly.R.iget(534)==0&false)); ++i) {{
		  __CLR4_4_1ehehkv4p59ly.R.inc(535);for (int j=0; (((j<15)&&(__CLR4_4_1ehehkv4p59ly.R.iget(536)!=0|true))||(__CLR4_4_1ehehkv4p59ly.R.iget(537)==0&false)); ++j) {{
			  __CLR4_4_1ehehkv4p59ly.R.inc(538);if ((((Gomoku.isValid(i, j))&&(__CLR4_4_1ehehkv4p59ly.R.iget(539)!=0|true))||(__CLR4_4_1ehehkv4p59ly.R.iget(540)==0&false))) {{
				  __CLR4_4_1ehehkv4p59ly.R.inc(541);Node node = new Node();
				  __CLR4_4_1ehehkv4p59ly.R.inc(542);node.p = 1;
				  __CLR4_4_1ehehkv4p59ly.R.inc(543);node.x = i;
				  __CLR4_4_1ehehkv4p59ly.R.inc(544);node.y = j;
				  __CLR4_4_1ehehkv4p59ly.R.inc(545);nodes.add(node);
			  }
		  }}
	  }}
	  
	  }__CLR4_4_1ehehkv4p59ly.R.inc(546);Node res = Gomoku.getBestStep(nodes);
	  __CLR4_4_1ehehkv4p59ly.R.inc(547);assertEquals(6, res.x);
	  __CLR4_4_1ehehkv4p59ly.R.inc(548);assertEquals(5, res.y);
	  
//      System.out.println(Gomoku.alphaBeta(new Node(1,6,9), -1000000000, 1000000000, 1));
//      System.out.println(Gomoku.alphaBeta(new Node(1,6,5), -1000000000, 1000000000, 3));
	  
      
  }finally{__CLR4_4_1ehehkv4p59ly.R.flushNeeded();}}
  @Test(timeout = 6000)
  public void test2()  {__CLR4_4_1ehehkv4p59ly.R.globalSliceStart(getClass().getName(),549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7bf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ehehkv4p59ly.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ehehkv4p59ly.R.globalSliceEnd(getClass().getName(),"net.mooctest.GomokuTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),549,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7bf9(){try{__CLR4_4_1ehehkv4p59ly.R.inc(549);
	  
	  __CLR4_4_1ehehkv4p59ly.R.inc(550);Gomoku.initBoard();
	  __CLR4_4_1ehehkv4p59ly.R.inc(551);Gomoku.showScore();
  }finally{__CLR4_4_1ehehkv4p59ly.R.flushNeeded();}}
  @Test(timeout = 6000)
  public void test3()  {__CLR4_4_1ehehkv4p59ly.R.globalSliceStart(getClass().getName(),552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1aw68zsfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ehehkv4p59ly.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ehehkv4p59ly.R.globalSliceEnd(getClass().getName(),"net.mooctest.GomokuTest.test3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1aw68zsfc(){try{__CLR4_4_1ehehkv4p59ly.R.inc(552);
	  
	  __CLR4_4_1ehehkv4p59ly.R.inc(553);Class cls = Gomoku.class;
	  __CLR4_4_1ehehkv4p59ly.R.inc(554);int[][] nBoard = new int[15][15];
	  __CLR4_4_1ehehkv4p59ly.R.inc(555);nBoard[10][9] = 1;
	  __CLR4_4_1ehehkv4p59ly.R.inc(556);nBoard[6][9] = 2; 
	  __CLR4_4_1ehehkv4p59ly.R.inc(557);try {
		__CLR4_4_1ehehkv4p59ly.R.inc(558);Field fld = cls.getDeclaredField("board");
		__CLR4_4_1ehehkv4p59ly.R.inc(559);fld.setAccessible(true);
		__CLR4_4_1ehehkv4p59ly.R.inc(560);Object obj = fld.get(null);
		__CLR4_4_1ehehkv4p59ly.R.inc(561);fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(562);e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(563);e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(564);e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(565);e.printStackTrace();
		}
	  __CLR4_4_1ehehkv4p59ly.R.inc(566);Gomoku.initBoard();
	  __CLR4_4_1ehehkv4p59ly.R.inc(567);assertTrue(Gomoku.checkSituation(2, Gomoku.getString(6, 9), 1));
	  __CLR4_4_1ehehkv4p59ly.R.inc(568);assertTrue(Gomoku.checkSituation(1, Gomoku.getString(10, 9), 3));
	  __CLR4_4_1ehehkv4p59ly.R.inc(569);assertEquals(-556056710, Gomoku.alphaBeta(new Node(2,6,5), -1000000000, 1000000000, 3));
	  
  }finally{__CLR4_4_1ehehkv4p59ly.R.flushNeeded();}}
  @Test(timeout = 6000)
  public void test4()  {__CLR4_4_1ehehkv4p59ly.R.globalSliceStart(getClass().getName(),570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ehehkv4p59ly.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ehehkv4p59ly.R.globalSliceEnd(getClass().getName(),"net.mooctest.GomokuTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),570,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9fu(){try{__CLR4_4_1ehehkv4p59ly.R.inc(570);
	  
	  __CLR4_4_1ehehkv4p59ly.R.inc(571);Class cls = Gomoku.class;
	  __CLR4_4_1ehehkv4p59ly.R.inc(572);int[][] nBoard = new int[15][15];
	  __CLR4_4_1ehehkv4p59ly.R.inc(573);nBoard[10][9] = 1;
	  __CLR4_4_1ehehkv4p59ly.R.inc(574);nBoard[6][9] = 2; 
	  __CLR4_4_1ehehkv4p59ly.R.inc(575);nBoard[6][10] = 2;
	  __CLR4_4_1ehehkv4p59ly.R.inc(576);try {
		__CLR4_4_1ehehkv4p59ly.R.inc(577);Field fld = cls.getDeclaredField("board");
		__CLR4_4_1ehehkv4p59ly.R.inc(578);fld.setAccessible(true);
		__CLR4_4_1ehehkv4p59ly.R.inc(579);Object obj = fld.get(null);
		__CLR4_4_1ehehkv4p59ly.R.inc(580);fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(581);e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(582);e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(583);e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(584);e.printStackTrace();
		}
	  __CLR4_4_1ehehkv4p59ly.R.inc(585);Gomoku.initBoard();
	  __CLR4_4_1ehehkv4p59ly.R.inc(586);assertTrue(Gomoku.checkSituation(2, Gomoku.getString(6, 9), 0));
	  __CLR4_4_1ehehkv4p59ly.R.inc(587);assertEquals(-499658910,Gomoku.computeScore());
  }finally{__CLR4_4_1ehehkv4p59ly.R.flushNeeded();}}
  
  @Test(timeout = 6000)
  public void test5()  {__CLR4_4_1ehehkv4p59ly.R.globalSliceStart(getClass().getName(),588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ehehkv4p59ly.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ehehkv4p59ly.R.globalSliceEnd(getClass().getName(),"net.mooctest.GomokuTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),588,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqgc(){try{__CLR4_4_1ehehkv4p59ly.R.inc(588);
	  __CLR4_4_1ehehkv4p59ly.R.inc(589);Class cls = Gomoku.class;
	  __CLR4_4_1ehehkv4p59ly.R.inc(590);int[][] nBoard = new int[15][15];
	  __CLR4_4_1ehehkv4p59ly.R.inc(591);nBoard[10][9] = 0;
	  __CLR4_4_1ehehkv4p59ly.R.inc(592);nBoard[7][9] = 1; 
	  __CLR4_4_1ehehkv4p59ly.R.inc(593);nBoard[6][9] = 1;
	  __CLR4_4_1ehehkv4p59ly.R.inc(594);try {
		__CLR4_4_1ehehkv4p59ly.R.inc(595);Field fld = cls.getDeclaredField("board");
		__CLR4_4_1ehehkv4p59ly.R.inc(596);fld.setAccessible(true);
		__CLR4_4_1ehehkv4p59ly.R.inc(597);Object obj = fld.get(null);
		__CLR4_4_1ehehkv4p59ly.R.inc(598);fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(599);e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(600);e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(601);e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(602);e.printStackTrace();
		}
	  __CLR4_4_1ehehkv4p59ly.R.inc(603);Gomoku.initBoard();
	  __CLR4_4_1ehehkv4p59ly.R.inc(604);assertTrue(Gomoku.checkSituation(1, Gomoku.getString(7, 5), 4));
	  __CLR4_4_1ehehkv4p59ly.R.inc(605);assertTrue(Gomoku.checkSituation(1, Gomoku.getString(8, 5), 4));
	  __CLR4_4_1ehehkv4p59ly.R.inc(606);assertTrue(Gomoku.checkSituation(1, Gomoku.getString(9, 5), 4));
	  __CLR4_4_1ehehkv4p59ly.R.inc(607);assertTrue(Gomoku.checkSituation(2, Gomoku.getString(9, 5), 4));
	  __CLR4_4_1ehehkv4p59ly.R.inc(608);assertTrue(Gomoku.checkSituation(2, Gomoku.getString(8, 14), 8));
	  __CLR4_4_1ehehkv4p59ly.R.inc(609);assertTrue(Gomoku.checkSituation(1, Gomoku.getString(8, 14), 7));
	  
	  
	  __CLR4_4_1ehehkv4p59ly.R.inc(610);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 0));
	  __CLR4_4_1ehehkv4p59ly.R.inc(611);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 1));
	  __CLR4_4_1ehehkv4p59ly.R.inc(612);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 2));
	  __CLR4_4_1ehehkv4p59ly.R.inc(613);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 3));
	  __CLR4_4_1ehehkv4p59ly.R.inc(614);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 4));
	  __CLR4_4_1ehehkv4p59ly.R.inc(615);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 5));
	  __CLR4_4_1ehehkv4p59ly.R.inc(616);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 6));
	  __CLR4_4_1ehehkv4p59ly.R.inc(617);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 7));
	  __CLR4_4_1ehehkv4p59ly.R.inc(618);assertFalse(Gomoku.checkSituation(-1, Gomoku.getString(6, 9), 8));
	  __CLR4_4_1ehehkv4p59ly.R.inc(619);assertEquals(493950800, Gomoku.alphaBeta(new Node(1,10,9), -1000000000, 1000000000, 2));
	  
  }finally{__CLR4_4_1ehehkv4p59ly.R.flushNeeded();}}
  
  @Test(timeout = 6000)
  public void test6()  {__CLR4_4_1ehehkv4p59ly.R.globalSliceStart(getClass().getName(),620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1kn65d7h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1ehehkv4p59ly.R.rethrow($CLV_t2$);}finally{__CLR4_4_1ehehkv4p59ly.R.globalSliceEnd(getClass().getName(),"net.mooctest.GomokuTest.test6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),620,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1kn65d7h8(){try{__CLR4_4_1ehehkv4p59ly.R.inc(620);
	  __CLR4_4_1ehehkv4p59ly.R.inc(621);Class cls = Gomoku.class;
	  __CLR4_4_1ehehkv4p59ly.R.inc(622);int[][] nBoard = new int[15][15];
	  __CLR4_4_1ehehkv4p59ly.R.inc(623);nBoard[7][9] = 1; 
	  __CLR4_4_1ehehkv4p59ly.R.inc(624);nBoard[6][9] = 1;
	  __CLR4_4_1ehehkv4p59ly.R.inc(625);nBoard[10][9] = 1;
	  __CLR4_4_1ehehkv4p59ly.R.inc(626);nBoard[11][8] = 2;
	  __CLR4_4_1ehehkv4p59ly.R.inc(627);nBoard[12][9] = 2;
	  __CLR4_4_1ehehkv4p59ly.R.inc(628);try {
		__CLR4_4_1ehehkv4p59ly.R.inc(629);Field fld = cls.getDeclaredField("board");
		__CLR4_4_1ehehkv4p59ly.R.inc(630);fld.setAccessible(true);
		__CLR4_4_1ehehkv4p59ly.R.inc(631);Object obj = fld.get(null);
		__CLR4_4_1ehehkv4p59ly.R.inc(632);fld.set(null, nBoard);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(633);e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(634);e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(635);e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			__CLR4_4_1ehehkv4p59ly.R.inc(636);e.printStackTrace();
		}
	  __CLR4_4_1ehehkv4p59ly.R.inc(637);Gomoku.initBoard();
	  __CLR4_4_1ehehkv4p59ly.R.inc(638);assertTrue(Gomoku.checkSituation(1, Gomoku.getString(7, 9), 0));
	  __CLR4_4_1ehehkv4p59ly.R.inc(639);assertEquals("[000000111110200, 000001121100000, 000000, 0000002100000]",Gomoku.getString(7, 9).toString());
	  
	  
	  
  }finally{__CLR4_4_1ehehkv4p59ly.R.flushNeeded();}}
  
  
}
