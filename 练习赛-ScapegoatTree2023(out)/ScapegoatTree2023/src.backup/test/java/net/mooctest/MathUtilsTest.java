package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;
//author:TheOnlyman
public class MathUtilsTest {

	@Test
	public void test() {
		MathUtils mathUtils = new MathUtils();

		double a1 = MathUtils.getDigitFromNumber(10, 10);
		assertEquals(0,a1,1e-6);
		double a2 = MathUtils.getMax(1,2);
		assertEquals(2,a2,1e-6);
		double a3 = MathUtils.logarithm(10,10);
		assertEquals(1,a3,1e-6);
		double a4 = MathUtils.getMax(2,1);
		assertEquals(2,a2,1e-6);
		double a5 = MathUtils.logarithm(100,3);
		assertEquals(0.23856062735983122,a5,1e-10);
	}

}
