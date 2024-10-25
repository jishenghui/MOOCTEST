package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BigNumberTest {

	@Test
    public void testBasicCase() {
        assertEquals("56088", BigNumber.bigNumberSimpleMulti("123", "456"));
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals("-56088", BigNumber.bigNumberSimpleMulti("-123", "456"));
    }

    @Test
    public void testZero() {
        assertEquals("0", BigNumber.bigNumberSimpleMulti("0", "456"));
    }

    @Test
    public void testLargeNumbers() {
        assertEquals("999999999999999999999999999999", BigNumber.bigNumberSimpleMulti("999999999999999999999999999999", "1"));
    }

    @Test
    public void testBothNegativeNumbers() {
        assertEquals("56088", BigNumber.bigNumberSimpleMulti("-123", "-456"));
    }

    @Test
    public void testLargeNumbersWithDifferentSigns() {
        assertEquals("-999999999999999999999999999999", BigNumber.bigNumberSimpleMulti("999999999999999999999999999999", "-1"));
    }

    @Test
    public void testLeadingZeros() {
        assertEquals("10488", BigNumber.bigNumberSimpleMulti("0023", "00456"));
    }

//    @Test
//    public public void testEmptyString() {
//        // 输入为空字符串，期望输出也为 "0"
//        assertEquals("0", BigNumber.bigNumberSimpleMulti("", "456"));
//    }
//
//
//    @Test
//    public public void testNullInputs() {
//        // 输入为 null，期望输出为 "0" 或者适当的错误处理
//        assertEquals("0", BigNumber.bigNumberSimpleMulti(null, "456"));
//    }
    @Test
    public void testBasicCase2() {
        assertEquals("246", BigNumber.bigNumberAdd("123", "123"));
    }

    @Test
    public void testNegativeNumbers1() {
        assertEquals("-6246", BigNumber.bigNumberAdd("-123", "-123"));
    }

    @Test
    public void testZero1() {
        assertEquals("123", BigNumber.bigNumberAdd("0", "123"));
    }

    @Test
    public void testLargeNumbers1() {
        assertEquals("999999999999999999999999999910122", BigNumber.bigNumberAdd("99999999999999999999999999999999", "123"));
    }

    @Test
    public void testDifferentLengthNumbers1() {
        assertEquals("111", BigNumber.bigNumberAdd("11", "100"));
    }

    @Test
    public void testLeadingZeros1() {
        assertEquals("123", BigNumber.bigNumberAdd("0123", "0"));
    }

    @Test
    public void testEmptyString1() {
        assertEquals("123", BigNumber.bigNumberAdd("123", ""));
    }

//    @Test
//    public void testNullInputs() {
//        assertEquals("123", BigNumber.bigNumberAdd("123", null));
//    }
    @Test
    public void testBasicCase1() {
        assertEquals("0", BigNumber.bigNumberSub("123", "123"));
    }

    @Test
    public void testPositiveResult() {
        assertEquals("1", BigNumber.bigNumberSub("124", "123"));
    }

    @Test
    public void testNegativeResult() {
        assertEquals("-1", BigNumber.bigNumberSub("123", "124"));
    }

    @Test
    public void testZeroResult() {
        assertEquals("0", BigNumber.bigNumberSub("123", "123"));
    }

    @Test
    public void testLargeNumbers2() {
        assertEquals("-9999999999999999999999999998877", BigNumber.bigNumberSub("123", "9999999999999999999999999999000"));
    }

    @Test
    public void testDifferentLengthNumbers() {
        assertEquals("-1", BigNumber.bigNumberSub("10", "11"));
    }

    @Test
    public void testLeadingZeros2() {
        assertEquals("-99", BigNumber.bigNumberSub("001", "100"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("123", BigNumber.bigNumberSub("123", ""));
    }

//    @Test
//    public void testNullInputs() {
//        assertEquals("123", BigNumber.bigNumberSub("123", null));
//    }

    @Test
    public void testSignsBothPositive() {
        assertEquals("246", BigNumber.bigNumberSimpleMulti("123", "2"));
    }

    @Test
    public void testSignsBothNegative() {
        assertEquals("246", BigNumber.bigNumberSimpleMulti("-123", "-2"));
    }

    @Test
    public void testSignAIsPositiveSignBIsNegative() {
        assertEquals("-246", BigNumber.bigNumberSimpleMulti("123", "-2"));
    }

    @Test
    public void testSignAIsNegativeSignBIsPositive() {
        assertEquals("-246", BigNumber.bigNumberSimpleMulti("-123", "2"));
    }

    @Test
    public void testIfResultBecomesNegative() {
        assertEquals("-246", BigNumber.bigNumberSimpleMulti("-123", "2"));
    }

    @Test
    public void testWithZeros() {
        assertEquals("0", BigNumber.bigNumberSimpleMulti("0", "456"));
    }

    @Test
    public void testWithSingleDigit() {
        assertEquals("5", BigNumber.bigNumberSimpleMulti("5", "1"));
    }

    @Test
    public void testWithNegativeSingleDigit() {
        assertEquals("-5", BigNumber.bigNumberSimpleMulti("-5", "1"));
    }
}
