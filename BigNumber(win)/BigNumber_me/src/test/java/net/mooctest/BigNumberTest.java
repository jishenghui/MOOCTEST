package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BigNumberTest {
	BigNumber bigNumber;
	@Before
	public void setUp() throws Exception {
		bigNumber=new BigNumber();
	}

	@Test
	public void testBigNumberSimpleMulti() {
		assertEquals(Integer.toString(12*56),BigNumber.bigNumberSimpleMulti("12","+56"));
		assertEquals(Integer.toString(-12*56),BigNumber.bigNumberSimpleMulti("-12","56"));
		assertEquals(Integer.toString(+12*(-56)),BigNumber.bigNumberSimpleMulti("+12","-56"));
		assertEquals(Integer.toString((-12)*(-56)),BigNumber.bigNumberSimpleMulti("-12","-56"));
		assertEquals(Integer.toString((1)*(10)),BigNumber.bigNumberSimpleMulti("1","10"));
		assertEquals("0",BigNumber.bigNumberSimpleMulti("0","0"));

	}
//	@Test
//	public void OutTestBigNumberSimpleMulti1(){
//		assertEquals("尾零叠加错误",Integer.toString((55)*(2)),BigNumber.bigNumberSimpleMulti("55","2"));
//	}
//	@Test
//	public void OutTestBigNumberSimpleMulti2(){
//		assertEquals("小数计算错误",Double.toString((55.5)*(2)),BigNumber.bigNumberSimpleMulti("55.5","2"));
//	}
	@Test
	public void testBigNumberAdd() {
		assertEquals(Integer.toString(780+56),BigNumber.bigNumberAdd("780","56"));
		assertEquals(Integer.toString(78+560),BigNumber.bigNumberAdd("78","560"));
		assertEquals(Integer.toString(1+9),BigNumber.bigNumberAdd("1","9"));
		assertEquals("999999999999999999999999999910122", BigNumber.bigNumberAdd("99999999999999999999999999999999", "123"));


	}

//	@Test
//	public void OutTestBigNumberAdd1(){
//		assertEquals("叠加为0的错误",Integer.toString(0+0),BigNumber.bigNumberAdd("0","0"));
//	}
//	@Test
//	public void OutTestBigNumberAdd2(){
//		assertEquals("负数计算错误",Integer.toString(-1+1),BigNumber.bigNumberAdd("-1","1"));
//	}

	@Test
	public void testBigNumberSub() {
		assertEquals(Integer.toString(12-34),BigNumber.bigNumberSub("12","34"));
		assertEquals(Integer.toString(12-345),BigNumber.bigNumberSub("12","345"));
		assertEquals(Integer.toString(111-111),BigNumber.bigNumberSub("111","111"));
		assertEquals(Integer.toString(76-81),BigNumber.bigNumberSub("76","81"));
		assertEquals(Integer.toString(345-12),BigNumber.bigNumberSub("345","12"));
		assertEquals(Integer.toString(112-12),BigNumber.bigNumberSub("112","12"));
		assertEquals("-9999999999999999999999999998877", BigNumber.bigNumberSub("123", "9999999999999999999999999999000"));

	}

}
