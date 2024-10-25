package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryExponentiationTest {

	@Test
    public void testCalculatePowerRecursive() {
        BinaryExponentiation calculator = new BinaryExponentiation();

        assertEquals(1, calculator.calculatePower(2, 0));
        assertEquals(2, calculator.calculatePower(2, 1));
        assertEquals(16, calculator.calculatePower(2, 4));
        assertEquals(81, calculator.calculatePower(3, 4));
        assertEquals(1024, calculator.calculatePower(2, 10));
        assertEquals(10000000000L, calculator.calculatePower(10, 10));
    }

    @Test
    public void testCalculatePowerIterative() {
        BinaryExponentiation calculator = new BinaryExponentiation();

        assertEquals(1, calculator.power(2, 0));
        assertEquals(2, calculator.power(2, 1));
        assertEquals(16, calculator.power(2, 4));
        assertEquals(81, calculator.power(3, 4));
        assertEquals(1024, calculator.power(2, 10));
        assertEquals(10000000000L, calculator.power(10, 10));
    }

}
