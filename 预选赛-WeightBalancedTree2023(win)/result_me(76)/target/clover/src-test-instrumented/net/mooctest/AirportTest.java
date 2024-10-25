/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import net.mooctest.BJTree.Node;

public class AirportTest {static class __CLR4_4_1dqdqlo0xvj2v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0038\u0032\u0033\u005c\u005c\u0031\u0032\u0036\u0035\u0038\u0031\u005c\u005c\u0057\u0065\u0069\u0067\u0068\u0074\u0042\u0061\u006c\u0061\u006e\u0063\u0065\u0064\u0054\u0072\u0065\u0065\u0032\u0030\u0032\u0033\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1697947120461L,8589935092L,585,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() {__CLR4_4_1dqdqlo0xvj2v.R.globalSliceStart(getClass().getName(),494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt3dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dqdqlo0xvj2v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dqdqlo0xvj2v.R.globalSliceEnd(getClass().getName(),"net.mooctest.AirportTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt3dq(){try{__CLR4_4_1dqdqlo0xvj2v.R.inc(494);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(495);Airport airport = new Airport("123");
		__CLR4_4_1dqdqlo0xvj2v.R.inc(496);Airport airport2 = new Airport("123","123123","1231","22222",1,1);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(497);System.out.println();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(498);assertNotNull(airport.getCity());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(499);assertNotNull(airport.getCode());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(500);assertNotNull(airport2.getCountry());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(501);assertNotNull(airport2.getName());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(502);assertNotNull(airport2.getString("123"));
		
		__CLR4_4_1dqdqlo0xvj2v.R.inc(503);assertNotNull(airport2.getX());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(504);assertNotNull(airport2.getY());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(505);assertNotNull(airport2.getPoint2D());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(506);assertNotNull(airport2.getCoord(1));
		__CLR4_4_1dqdqlo0xvj2v.R.inc(507);System.out.println(airport);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(508);System.out.println(airport2);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(509);System.out.println(airport2.getString("default"));
		__CLR4_4_1dqdqlo0xvj2v.R.inc(510);System.out.println(airport2.getString("code-only"));
		__CLR4_4_1dqdqlo0xvj2v.R.inc(511);System.out.println(airport2.getString("full"));
		__CLR4_4_1dqdqlo0xvj2v.R.inc(512);System.out.println(airport2.getString("attributes"));
	}finally{__CLR4_4_1dqdqlo0xvj2v.R.flushNeeded();}}
	
	@Test
	public void test2(){__CLR4_4_1dqdqlo0xvj2v.R.globalSliceStart(getClass().getName(),513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_17n6a7be9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dqdqlo0xvj2v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dqdqlo0xvj2v.R.globalSliceEnd(getClass().getName(),"net.mooctest.AirportTest.test2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),513,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_17n6a7be9(){try{__CLR4_4_1dqdqlo0xvj2v.R.inc(513);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(514);BJTree<Integer, Integer> bjTree = new BJTree<>();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(515);try {
			__CLR4_4_1dqdqlo0xvj2v.R.inc(516);bjTree.delete(1);
			__CLR4_4_1dqdqlo0xvj2v.R.inc(517);bjTree.clear();
			__CLR4_4_1dqdqlo0xvj2v.R.inc(518);assertNull(bjTree.find(1));
			__CLR4_4_1dqdqlo0xvj2v.R.inc(519);assertNull(bjTree.getMax());
			__CLR4_4_1dqdqlo0xvj2v.R.inc(520);assertNull(bjTree.getMin());
			__CLR4_4_1dqdqlo0xvj2v.R.inc(521);assertNotNull(bjTree.getPreorderList());
			__CLR4_4_1dqdqlo0xvj2v.R.inc(522);assertNull(bjTree.findDown(2));
			__CLR4_4_1dqdqlo0xvj2v.R.inc(523);assertNull(bjTree.findUp(2));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		__CLR4_4_1dqdqlo0xvj2v.R.inc(524);for (int i = 0; (((i < 5)&&(__CLR4_4_1dqdqlo0xvj2v.R.iget(525)!=0|true))||(__CLR4_4_1dqdqlo0xvj2v.R.iget(526)==0&false)); i++) {{
			__CLR4_4_1dqdqlo0xvj2v.R.inc(527);try {
				__CLR4_4_1dqdqlo0xvj2v.R.inc(528);bjTree.insert(i, i+1, 0.2f);
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}
		}__CLR4_4_1dqdqlo0xvj2v.R.inc(529);for (int i = 0; (((i < 5)&&(__CLR4_4_1dqdqlo0xvj2v.R.iget(530)!=0|true))||(__CLR4_4_1dqdqlo0xvj2v.R.iget(531)==0&false)); i++) {{
			__CLR4_4_1dqdqlo0xvj2v.R.inc(532);try {
				__CLR4_4_1dqdqlo0xvj2v.R.inc(533);bjTree.find(i);
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}
		}__CLR4_4_1dqdqlo0xvj2v.R.inc(534);assertNotNull(bjTree.getMax());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(535);assertNotNull(bjTree.getMin());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(536);assertNotNull(bjTree.getPreorderList());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(537);assertNotNull(bjTree.findDown(2));
		__CLR4_4_1dqdqlo0xvj2v.R.inc(538);assertNotNull(bjTree.findUp(2));
		__CLR4_4_1dqdqlo0xvj2v.R.inc(539);for (int i = 0; (((i < 5)&&(__CLR4_4_1dqdqlo0xvj2v.R.iget(540)!=0|true))||(__CLR4_4_1dqdqlo0xvj2v.R.iget(541)==0&false)); i++) {{
			__CLR4_4_1dqdqlo0xvj2v.R.inc(542);try {
				__CLR4_4_1dqdqlo0xvj2v.R.inc(543);bjTree.delete(i);
			} catch (Exception e) {
				// TODO: handle exception
			}		
		}

	}}finally{__CLR4_4_1dqdqlo0xvj2v.R.flushNeeded();}}
	

	
	
	@Test
	public void test4() {__CLR4_4_1dqdqlo0xvj2v.R.globalSliceStart(getClass().getName(),544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e567s9f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dqdqlo0xvj2v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dqdqlo0xvj2v.R.globalSliceEnd(getClass().getName(),"net.mooctest.AirportTest.test4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),544,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e567s9f4(){try{__CLR4_4_1dqdqlo0xvj2v.R.inc(544);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(545);BJTree<String, Airport> tree = new BJTree<>();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(546);CommandHandler commandHandler = new CommandHandler(tree);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(547);try {
			__CLR4_4_1dqdqlo0xvj2v.R.inc(548);commandHandler.processCommand("123");
			__CLR4_4_1dqdqlo0xvj2v.R.inc(549);commandHandler.processCommand(":");
			__CLR4_4_1dqdqlo0xvj2v.R.inc(550);commandHandler.processCommand("hzb:insert:insert");
//			commandHandler.processCommand(":insert");
//			commandHandler.processCommand("delete");
		} catch (Exception e) {
			// TODO \u9477\ue044\u59e9\u9422\u71b8\u579a\u9428\ufffd catch \u9367\ufffd
			__CLR4_4_1dqdqlo0xvj2v.R.inc(551);e.printStackTrace();
		}
	}finally{__CLR4_4_1dqdqlo0xvj2v.R.flushNeeded();}}
	
	@Test
	public void test5() {__CLR4_4_1dqdqlo0xvj2v.R.globalSliceStart(getClass().getName(),552);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1he66kqfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dqdqlo0xvj2v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dqdqlo0xvj2v.R.globalSliceEnd(getClass().getName(),"net.mooctest.AirportTest.test5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),552,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1he66kqfc(){try{__CLR4_4_1dqdqlo0xvj2v.R.inc(552);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(553);Point2D point2d = new Point2D();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(554);float[] a = {1.2f,3f};
		__CLR4_4_1dqdqlo0xvj2v.R.inc(555);float[] b = {1.2f,3f,1f};
		__CLR4_4_1dqdqlo0xvj2v.R.inc(556);Point2D point2d1 = new Point2D(a);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(557);try {
			__CLR4_4_1dqdqlo0xvj2v.R.inc(558);Point2D point2d3 = new Point2D(b);
		} catch (AssertionError e) {
			// TODO: handle exception
		}
		
		__CLR4_4_1dqdqlo0xvj2v.R.inc(559);Point2D point2d2 = new Point2D(point2d);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(560);assertNotNull(point2d.getDim());
		__CLR4_4_1dqdqlo0xvj2v.R.inc(561);System.out.println(point2d);
		
	}finally{__CLR4_4_1dqdqlo0xvj2v.R.flushNeeded();}}
//	@Test
//	public void test6() {
//		String[] args = new String[3];
//		BJTreeTester.main(args);
//	}
	
	@Test
	public void test7() {__CLR4_4_1dqdqlo0xvj2v.R.globalSliceStart(getClass().getName(),562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nw645ofm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dqdqlo0xvj2v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dqdqlo0xvj2v.R.globalSliceEnd(getClass().getName(),"net.mooctest.AirportTest.test7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),562,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nw645ofm(){try{__CLR4_4_1dqdqlo0xvj2v.R.inc(562);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(563);CommandHandler.summarizeFind(null, null, null);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(564);Airport reAirport  = new Airport("Asd");
		__CLR4_4_1dqdqlo0xvj2v.R.inc(565);CommandHandler.summarizeFind(null, null, reAirport);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(566);CommandHandler.summarizeGet(null, null);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(567);CommandHandler.summarizeGet(null, reAirport);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(568);ArrayList<String> list = new ArrayList<>();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(569);ArrayList<String> list1 = new ArrayList<>();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(570);list1.add("asda");
		__CLR4_4_1dqdqlo0xvj2v.R.inc(571);CommandHandler.treeStructure(list1);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(572);list.add("[");
		__CLR4_4_1dqdqlo0xvj2v.R.inc(573);list.add("asda");
		__CLR4_4_1dqdqlo0xvj2v.R.inc(574);list.add("as2d");
		__CLR4_4_1dqdqlo0xvj2v.R.inc(575);CommandHandler.treeStructure(list);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(576);Iterator<String> iter = list.iterator();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(577);CommandHandler.treeStructureHelper(iter, "asda");
	}finally{__CLR4_4_1dqdqlo0xvj2v.R.flushNeeded();}}
	@Test
	public void test8() {__CLR4_4_1dqdqlo0xvj2v.R.globalSliceStart(getClass().getName(),578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1r562y5g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1dqdqlo0xvj2v.R.rethrow($CLV_t2$);}finally{__CLR4_4_1dqdqlo0xvj2v.R.globalSliceEnd(getClass().getName(),"net.mooctest.AirportTest.test8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),578,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1r562y5g2(){try{__CLR4_4_1dqdqlo0xvj2v.R.inc(578);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(579);BJTree<String, String> bjTree = new BJTree<>();
		__CLR4_4_1dqdqlo0xvj2v.R.inc(580);BJTree.ExternalNode node = bjTree.new ExternalNode("a", "b", 0);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(581);node.find("c");
		__CLR4_4_1dqdqlo0xvj2v.R.inc(582);List<BJTree.Node> nodes = new ArrayList<>();
//		node.buildTree(nodes);
		__CLR4_4_1dqdqlo0xvj2v.R.inc(583);nodes.add(bjTree.new ExternalNode("123", "as", 0));
		__CLR4_4_1dqdqlo0xvj2v.R.inc(584);node.buildTree(nodes);
		
	}finally{__CLR4_4_1dqdqlo0xvj2v.R.flushNeeded();}}
	

}
