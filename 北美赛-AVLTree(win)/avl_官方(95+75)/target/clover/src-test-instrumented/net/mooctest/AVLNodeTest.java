/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.hamcrest.core.StringContains.containsString;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class AVLNodeTest {static class __CLR4_4_18q8qlg87volb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u006d\u006f\u006f\u0063\u0074\u0065\u0073\u0074\u005c\u005c\u0070\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u005c\u005c\u0037\u0031\u0039\u0034\u005c\u005c\u0031\u0031\u0037\u0038\u0033\u0030\u005c\u005c\u0041\u0056\u004c\u0054\u0072\u0065\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1680972928299L,8589935092L,472,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@Test
	public void test() throws Exception {__CLR4_4_18q8qlg87volb.R.globalSliceStart(getClass().getName(),314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1zi4lt38q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_18q8qlg87volb.R.rethrow($CLV_t2$);}finally{__CLR4_4_18q8qlg87volb.R.globalSliceEnd(getClass().getName(),"net.mooctest.AVLNodeTest.test",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1zi4lt38q() throws Exception{try{__CLR4_4_18q8qlg87volb.R.inc(314);


		__CLR4_4_18q8qlg87volb.R.inc(315);final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		__CLR4_4_18q8qlg87volb.R.inc(316);PrintStream oldOUT = System.out;
		__CLR4_4_18q8qlg87volb.R.inc(317);System.setOut(new PrintStream(outContent));
		__CLR4_4_18q8qlg87volb.R.inc(318);System.out.println(outContent.toString());


		__CLR4_4_18q8qlg87volb.R.inc(319);AVLNode<Integer> n1 = new AVLNode<>(40);
		__CLR4_4_18q8qlg87volb.R.inc(320);AVLNode<Integer> n2 = new AVLNode<>(40);
		__CLR4_4_18q8qlg87volb.R.inc(321);AVLNode<Integer> n3 = new AVLNode<>(40);


		__CLR4_4_18q8qlg87volb.R.inc(322);n1.insert(20);
		__CLR4_4_18q8qlg87volb.R.inc(323);n1.insert(60);
		__CLR4_4_18q8qlg87volb.R.inc(324);n1.insert(10);
		__CLR4_4_18q8qlg87volb.R.inc(325);n1.insert(30);
		__CLR4_4_18q8qlg87volb.R.inc(326);n1.insert(50);
		__CLR4_4_18q8qlg87volb.R.inc(327);n1.insert(70);

		__CLR4_4_18q8qlg87volb.R.inc(328);assertTrue(n1.search(10));
		__CLR4_4_18q8qlg87volb.R.inc(329);assertTrue(n1.search(20));
		__CLR4_4_18q8qlg87volb.R.inc(330);assertTrue(n1.search(30));
		__CLR4_4_18q8qlg87volb.R.inc(331);assertTrue(n1.search(40));
		__CLR4_4_18q8qlg87volb.R.inc(332);assertTrue(n1.search(50));
		__CLR4_4_18q8qlg87volb.R.inc(333);assertTrue(n1.search(60));
		__CLR4_4_18q8qlg87volb.R.inc(334);assertTrue(n1.search(70));
		__CLR4_4_18q8qlg87volb.R.inc(335);assertFalse(n1.search(5));
		__CLR4_4_18q8qlg87volb.R.inc(336);assertFalse(n1.search(100));
		__CLR4_4_18q8qlg87volb.R.inc(337);n1 = n1.delete(20);
		__CLR4_4_18q8qlg87volb.R.inc(338);n1 = n1.delete(60);
		__CLR4_4_18q8qlg87volb.R.inc(339);n1 = n1.delete(10);

		assert (((!n1.search(10))&&(__CLR4_4_18q8qlg87volb.R.iget(340)!=0|true))||(__CLR4_4_18q8qlg87volb.R.iget(341)==0&false));
		assert (((!n1.search(20))&&(__CLR4_4_18q8qlg87volb.R.iget(342)!=0|true))||(__CLR4_4_18q8qlg87volb.R.iget(343)==0&false));
		assert (((!n1.search(60))&&(__CLR4_4_18q8qlg87volb.R.iget(344)!=0|true))||(__CLR4_4_18q8qlg87volb.R.iget(345)==0&false));
		assert (((n1.search(30))&&(__CLR4_4_18q8qlg87volb.R.iget(346)!=0|true))||(__CLR4_4_18q8qlg87volb.R.iget(347)==0&false));
		assert (((n1.search(40))&&(__CLR4_4_18q8qlg87volb.R.iget(348)!=0|true))||(__CLR4_4_18q8qlg87volb.R.iget(349)==0&false));
		assert (((n1.search(50))&&(__CLR4_4_18q8qlg87volb.R.iget(350)!=0|true))||(__CLR4_4_18q8qlg87volb.R.iget(351)==0&false));
		assert (((n1.search(70))&&(__CLR4_4_18q8qlg87volb.R.iget(352)!=0|true))||(__CLR4_4_18q8qlg87volb.R.iget(353)==0&false));

		__CLR4_4_18q8qlg87volb.R.inc(354);try {
			__CLR4_4_18q8qlg87volb.R.inc(355);n1.insert(40);
		} catch (Exception e) {
			__CLR4_4_18q8qlg87volb.R.inc(356);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(357);assertNull(n2.delete(0));
		__CLR4_4_18q8qlg87volb.R.inc(358);n1.findMin(n2);
		__CLR4_4_18q8qlg87volb.R.inc(359);n1.getLeft();
		__CLR4_4_18q8qlg87volb.R.inc(360);n1.getRight();

		__CLR4_4_18q8qlg87volb.R.inc(361);n2.findMin(n1);
		__CLR4_4_18q8qlg87volb.R.inc(362);n1 = n1.delete(40);
		__CLR4_4_18q8qlg87volb.R.inc(363);n1 = n1.delete(20);



		__CLR4_4_18q8qlg87volb.R.inc(364);try {
			__CLR4_4_18q8qlg87volb.R.inc(365);n2.insert(2);
		} catch (Exception e) {
			__CLR4_4_18q8qlg87volb.R.inc(366);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(367);try {
			__CLR4_4_18q8qlg87volb.R.inc(368);n2.insert(0);
		} catch (Exception e) {
			__CLR4_4_18q8qlg87volb.R.inc(369);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(370);n2.insert(10);
		__CLR4_4_18q8qlg87volb.R.inc(371);n2.insert(101);
		__CLR4_4_18q8qlg87volb.R.inc(372);n2.insert(102);
		__CLR4_4_18q8qlg87volb.R.inc(373);n2.insert(-1);
		__CLR4_4_18q8qlg87volb.R.inc(374);n2.insert(-2);
		__CLR4_4_18q8qlg87volb.R.inc(375);try {
			__CLR4_4_18q8qlg87volb.R.inc(376);n2.insert(100);
		}catch (Exception e){}

		__CLR4_4_18q8qlg87volb.R.inc(377);n3.insert(10);
		__CLR4_4_18q8qlg87volb.R.inc(378);n3.insert(15);
		__CLR4_4_18q8qlg87volb.R.inc(379);n3.insert(20);
		__CLR4_4_18q8qlg87volb.R.inc(380);n3.insert(25);
		__CLR4_4_18q8qlg87volb.R.inc(381);n3.insert(70);
		__CLR4_4_18q8qlg87volb.R.inc(382);n3.insert(100);
		__CLR4_4_18q8qlg87volb.R.inc(383);TreePrinter.printNode(n1);
		__CLR4_4_18q8qlg87volb.R.inc(384);TreePrinter.printNode(n2);
		__CLR4_4_18q8qlg87volb.R.inc(385);TreePrinter.printNode(n3);

		__CLR4_4_18q8qlg87volb.R.inc(386);try {
			__CLR4_4_18q8qlg87volb.R.inc(387);n3.insert(73);
		}catch (Exception e){
			__CLR4_4_18q8qlg87volb.R.inc(388);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(389);try {
			__CLR4_4_18q8qlg87volb.R.inc(390);n3.insert(72);
		}catch (Exception e){
			__CLR4_4_18q8qlg87volb.R.inc(391);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(392);n3.delete(2);
		__CLR4_4_18q8qlg87volb.R.inc(393);n3.delete(10);
		__CLR4_4_18q8qlg87volb.R.inc(394);n3.delete(50);
		__CLR4_4_18q8qlg87volb.R.inc(395);n3.delete(100);
		__CLR4_4_18q8qlg87volb.R.inc(396);n3.delete(73);

		__CLR4_4_18q8qlg87volb.R.inc(397);AVLNode<Integer> n4 = new AVLNode<>(40, null, n2);
		__CLR4_4_18q8qlg87volb.R.inc(398);AVLNode<Integer> n5 = new AVLNode<>(40, n1, null);

		__CLR4_4_18q8qlg87volb.R.inc(399);n4.delete(10);
		__CLR4_4_18q8qlg87volb.R.inc(400);Class<?> clazz = AVLNode.class;
		__CLR4_4_18q8qlg87volb.R.inc(401);Method method = clazz.getDeclaredMethod("remove", Object.class, AVLNode.class);
		__CLR4_4_18q8qlg87volb.R.inc(402);method.setAccessible(true);
		__CLR4_4_18q8qlg87volb.R.inc(403);Object result = method.invoke(n4, 10, n4);
		__CLR4_4_18q8qlg87volb.R.inc(404);Object result1 = method.invoke(n4, 50, n4);
		__CLR4_4_18q8qlg87volb.R.inc(405);Object result2 = method.invoke(n5, 10, n4);
		__CLR4_4_18q8qlg87volb.R.inc(406);Object result3 = method.invoke(n4, 50, n4);
		__CLR4_4_18q8qlg87volb.R.inc(407);Tree t1 = new Tree();
		__CLR4_4_18q8qlg87volb.R.inc(408);Tree t2 = new Tree();

		__CLR4_4_18q8qlg87volb.R.inc(409);assertTrue(t1.insertWord("a"));
		__CLR4_4_18q8qlg87volb.R.inc(410);assertTrue(t1.insertWord("b"));
		__CLR4_4_18q8qlg87volb.R.inc(411);try {
			__CLR4_4_18q8qlg87volb.R.inc(412);t1.insertWord("a");
		}catch (Exception e){
			__CLR4_4_18q8qlg87volb.R.inc(413);System.out.println(e.getMessage());
		}

		__CLR4_4_18q8qlg87volb.R.inc(414);assertNotEquals("", t1.toString());
		__CLR4_4_18q8qlg87volb.R.inc(415);assertNotEquals(" ", t1.toString());

		__CLR4_4_18q8qlg87volb.R.inc(416);File f1 = new File("src/test/resources/1.txt");
		__CLR4_4_18q8qlg87volb.R.inc(417);t1.insertWords(f1);
//		try{
//			File f2 = new File("src/test/resources");
//			t1.insertWords(f2);
//		}catch (Exception e){
//		}
		__CLR4_4_18q8qlg87volb.R.inc(418);try {
			__CLR4_4_18q8qlg87volb.R.inc(419);t1.deleteWord(null);
		}catch (Exception e){
			__CLR4_4_18q8qlg87volb.R.inc(420);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(421);t1.deleteWords(f1);
		__CLR4_4_18q8qlg87volb.R.inc(422);try {
			__CLR4_4_18q8qlg87volb.R.inc(423);t1.searchWord("a");
		}catch (Exception e){
			__CLR4_4_18q8qlg87volb.R.inc(424);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(425);try {
			__CLR4_4_18q8qlg87volb.R.inc(426);t1.deleteWord("a");
		}catch (Exception e){
			__CLR4_4_18q8qlg87volb.R.inc(427);System.out.println(e.getMessage());
		}
		__CLR4_4_18q8qlg87volb.R.inc(428);assertTrue(t1.insertWord("a"));
		__CLR4_4_18q8qlg87volb.R.inc(429);assertTrue(t1.insertWord("ada"));
		__CLR4_4_18q8qlg87volb.R.inc(430);assertTrue(t1.insertWord("aa"));
		__CLR4_4_18q8qlg87volb.R.inc(431);Class<?> clazz1 = Tree.class;
		__CLR4_4_18q8qlg87volb.R.inc(432);Field field = clazz1.getDeclaredField("size");
		__CLR4_4_18q8qlg87volb.R.inc(433);field.setAccessible(true);
		__CLR4_4_18q8qlg87volb.R.inc(434);int size = (int)field.get(t1);
		__CLR4_4_18q8qlg87volb.R.inc(435);assertEquals(3, size);

		__CLR4_4_18q8qlg87volb.R.inc(436);assertFalse(t1.deleteWord("da"));
		__CLR4_4_18q8qlg87volb.R.inc(437);assertTrue(t1.deleteWord("ada"));
		__CLR4_4_18q8qlg87volb.R.inc(438);assertTrue(t1.deleteWord("aa"));
		__CLR4_4_18q8qlg87volb.R.inc(439);assertTrue(t1.deleteWord("a"));

		__CLR4_4_18q8qlg87volb.R.inc(440);size = (int)field.get(t1);
		__CLR4_4_18q8qlg87volb.R.inc(441);assertEquals(0, size);

		__CLR4_4_18q8qlg87volb.R.inc(442);t1.insertWords(f1);
//		t1.deleteWord(null);
//		try{
//			File f2 = new File("src/test/resources");
//			t1.deleteWords(f2);
//		}catch (Exception e){
//		}
//		try{
//			File f2 = new File("src/test/resources");
//			t1.searchWords(f2);
//		}catch (Exception e){
//		}
//		t1.deleteWord("n");
		__CLR4_4_18q8qlg87volb.R.inc(443);t1.searchWords(f1);
		__CLR4_4_18q8qlg87volb.R.inc(444);t1.getHeight();
		__CLR4_4_18q8qlg87volb.R.inc(445);t1.getSize();
		__CLR4_4_18q8qlg87volb.R.inc(446);t2.getHeight();


		__CLR4_4_18q8qlg87volb.R.inc(447);t2.insertWord("a");
		__CLR4_4_18q8qlg87volb.R.inc(448);t2.insertWord("ada");
		__CLR4_4_18q8qlg87volb.R.inc(449);t2.insertWord("aa");

		__CLR4_4_18q8qlg87volb.R.inc(450);assertTrue(t2.deleteWord("ada"));
		__CLR4_4_18q8qlg87volb.R.inc(451);assertTrue(t2.deleteWord("a"));
		__CLR4_4_18q8qlg87volb.R.inc(452);assertTrue(t2.deleteWord("aa"));
//		System.out.println(t2.toString());
		__CLR4_4_18q8qlg87volb.R.inc(453);String s1 = "  b";
		__CLR4_4_18q8qlg87volb.R.inc(454);String s2 = " a";
		__CLR4_4_18q8qlg87volb.R.inc(455);String s3 = "        ";
		__CLR4_4_18q8qlg87volb.R.inc(456);String s4 = " 40";
		__CLR4_4_18q8qlg87volb.R.inc(457);String s5 = "100 70";
		__CLR4_4_18q8qlg87volb.R.inc(458);String s6 = "        ";
		__CLR4_4_18q8qlg87volb.R.inc(459);String s7 = "        ";


		__CLR4_4_18q8qlg87volb.R.inc(460);assertThat(outContent.toString(), containsString("null"));
		__CLR4_4_18q8qlg87volb.R.inc(461);assertThat(outContent.toString(), containsString("Tree is empty"));
		__CLR4_4_18q8qlg87volb.R.inc(462);assertThat(outContent.toString(), containsString("a"));
		__CLR4_4_18q8qlg87volb.R.inc(463);assertThat(outContent.toString(), containsString("b"));
		__CLR4_4_18q8qlg87volb.R.inc(464);assertThat(outContent.toString(), containsString("Duplicate"));
		__CLR4_4_18q8qlg87volb.R.inc(465);assertThat(outContent.toString(), containsString(s1));
		__CLR4_4_18q8qlg87volb.R.inc(466);assertThat(outContent.toString(), containsString(s2));
		__CLR4_4_18q8qlg87volb.R.inc(467);assertThat(outContent.toString(), containsString(s3));
		__CLR4_4_18q8qlg87volb.R.inc(468);assertThat(outContent.toString(), containsString(s4));
		__CLR4_4_18q8qlg87volb.R.inc(469);assertThat(outContent.toString(), containsString(s5));
		__CLR4_4_18q8qlg87volb.R.inc(470);assertThat(outContent.toString(), containsString(s6));
		__CLR4_4_18q8qlg87volb.R.inc(471);assertThat(outContent.toString(), containsString(s7));

	}finally{__CLR4_4_18q8qlg87volb.R.flushNeeded();}}




}
