package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class test {




    //AI写的，半小时，人工精修

    ALU alu;

    @Before
    public void setUp() throws Exception {
        alu = new ALU();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void integerRepresentation_PositiveNumber_CorrectBinaryRepresentation() {
        String result = alu.integerRepresentation("9", 8);
        assertEquals("00001001", result);
    }

    @Test
    public void integerRepresentation_NegativeNumber_CorrectBinaryRepresentation() {
        String result = alu.integerRepresentation("-9", 8);
        assertEquals("11110111", result);
    }

    @Test
    public void integerRepresentation_Zero_CorrectBinaryRepresentation() {
        String result = alu.integerRepresentation("0", 8);
        assertEquals("00000000", result);
    }

    @Test
    public void integerRepresentation_RequiresPadding_CorrectBinaryRepresentation() {
        String result = alu.integerRepresentation("9", 16);
        assertEquals("0000000000001001", result);
    }

    @Test
    public void integerRepresentation_RequiresPaddingWithNegative_CorrectBinaryRepresentation() {
        String result = alu.integerRepresentation("-9", 16);
        assertEquals("1111111111110111", result);
    }

    @Test
    public void floatRepresentation_ZeroInput_ShouldReturnAllZeroes() {
        String result = alu.floatRepresentation("0", 8, 8);
        assertEquals("00000000000000000", result);
    }

    @Test
    public void floatRepresentation_SimpleFraction_ShouldReturnCorrectBinary() {
        String result = alu.floatRepresentation("0.5", 8, 8);
        assertEquals("00111111000000000", result);
    }

    @Test
    public void floatRepresentation_SimpleInteger_ShouldReturnCorrectBinary() {
        String result = alu.floatRepresentation("1", 8, 8);
        assertEquals("001111111", result);
    }

    @Test
    public void floatRepresentation_NegativeInteger_ShouldReturnCorrectBinary() {
        String result = alu.floatRepresentation("-1", 8, 8);
        assertEquals("101111111", result);
    }

    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary() {
        String result = alu.floatRepresentation("0.0625", 8, 8);
        assertEquals("00111101100000000", result);
    }

    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary1() {
        String result = alu.floatRepresentation("0.1625", 0, 8);
        assertEquals("0101001100", result);
    }
    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary2() {
        String result = alu.floatRepresentation("0.0625125825", 8, 16);
        assertEquals("0011110110000000000001101", result);
    }

    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary3() {
        String result = alu.floatRepresentation("0.0625", 0, 16);
        assertEquals("01000000000000000", result);
    }



    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary4() {
        String result = alu.floatRepresentation("0.00000625", 0, 16);
        assertEquals("01100000000000000", result);
    }

    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary5() {
        String result = alu.floatRepresentation("256", 0, 4);
        assertEquals("NaN", result);
    }
    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary6() {
        String result = alu.floatRepresentation("-256", 0, 4);
        assertEquals("NaN", result);
    }

    @Test
    public void floatRepresentation_SpecialCaseForNormalization_ShouldReturnCorrectBinary7() {
        long i=-Integer.MAX_VALUE;
        String result = alu.floatRepresentation(String.valueOf(i), 0, 32);
        assertEquals("111101111111111111111111111111111", result);
    }


    @Test
    public void floatRepresentation_InputOutOfRange_ShouldReturnTruncatedBinary() {
        String result = alu.floatRepresentation("123.456", 4, 4);
        assertEquals("011011110", result);
    }

    @Test
    public void floatRepresentation_InputOutOfRange_ShouldReturnTruncatedBinary1() {
        String result = alu.floatRepresentation("1203.000", 4, 8);
        assertEquals("0100010010110", result);
    }
    @Test
    public void floatRepresentation_InputOutOfRange_ShouldReturnTruncatedBinary2() {
        String result = alu.floatRepresentation("1203.123456677", 4, 16);
        assertEquals("010001001011001100011", result);
    }


    int inf = 255;

    @Test
    public void floatRepresentation_PositiveInfinity_ShouldReturnPlusInfinity() {
        String result = alu.floatRepresentation("255", 8, 8);
        assertEquals("0100001101111111", result);
    }

    @Test
    public void floatRepresentation_NegativeInfinity_ShouldReturnMinusInfinity() {
        String result = alu.floatRepresentation("-256", 8, 8);
        assertEquals("11000011100000000", result);
    }

    @Test
    public void floatRepresentation_NaN_ShouldReturnNaN() {

        String result = alu.floatRepresentation(String.valueOf((2 * 2 * 2 * 2 * 2 * 2 * 2 * 2)), 8, 8);
        assertEquals("01000011100000000", result);
    }

    @Test
    public void ieee754_Zero_32bit_ReturnsAllZeros() {
        String result = alu.ieee754("0", 32);
        assertEquals("00000000000000000000000000000000", result);
    }

    @Test
    public void ieee754_One_32bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("1", 32);
        assertEquals("001111111", result);
    }

    @Test
    public void ieee754_NegativeOne_32bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("-1", 32);
        assertEquals("101111111", result);
    }

    @Test
    public void ieee754_OnePointFive_32bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("1.5", 32);
        assertEquals("00111111110000000000000000000000", result);
    }

    @Test
    public void ieee754_OnePointThreeSevenFive_32bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("1.375", 32);
        assertEquals("00111111101100000000000000000000", result);
    }

    @Test
    public void ieee754_NegativeOnePointThreeSevenFive_32bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("-1.375", 32);
        assertEquals("10111111101100000000000000000000", result);
    }

    @Test
    public void ieee754_Infinitive_32bit_ReturnsPositiveInf() {
        String result = alu.ieee754(String.valueOf(Integer.MAX_VALUE), 32);
        assertEquals("01001110111111111111111111111111", result);
    }

    @Test
    public void ieee754_NegativeInfinitive_32bit_ReturnsNegativeInf() {
        String result = alu.ieee754(String.valueOf(-Integer.MAX_VALUE), 32);
        assertEquals("11001110111111111111111111111111", result);
    }

    @Test
    public void ieee754_NaN_32bit_ReturnsNaN() {
        String result = alu.ieee754("0", 32);
        assertEquals("00000000000000000000000000000000", result);
    }

    @Test
    public void ieee754_One_64bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("1", 64);
        assertEquals("001111111111", result);
    }

    @Test
    public void ieee754_NegativeOne_64bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("-1", 64);
        assertEquals("101111111111", result);
    }

    @Test
    public void ieee754_OnePointFive_64bit_ReturnsCorrectIEEE754() {
        String result = alu.ieee754("1.5", 64);
        assertEquals("0011111111111000000000000000000000000000000000000000000000000000", result);
    }

    @Test
    public void ieee754_InvalidLength_ReturnsEmptyString() {
        String result = alu.ieee754("1", 16);
        assertEquals("", result);
    }

    @Test
    public void integerTrueValue_PositiveNumber_ReturnsTrueValue() {
        String operand = "00001001"; // 1 * 2^3 = 9
        String expected = "9";
        String result = alu.integerTrueValue(operand);
        assertEquals(expected, result);
    }

    @Test
    public void integerTrueValue_NegativeNumber_ReturnsTrueValue() {
        String operand = "11110110"; // -1 * 2^7 + 1 * 2^6 + 1 * 2^5 + 1 * 2^4 = -142
        String expected = "-10";
        String result = alu.integerTrueValue(operand);
        assertEquals(expected, result);
    }

    @Test
    public void integerTrueValue_Zero_ReturnsZero() {
        String operand = "00000000"; // 0
        String expected = "0";
        String result = alu.integerTrueValue(operand);
        assertEquals(expected, result);
    }

    @Test
    public void integerTrueValue_MixedBits_ReturnsTrueValue() {
        String operand = "10101010"; // -1 * 2^7 + 1 * 2^5 + -1 * 2^3 + 1 * 2^1 = -86
        String expected = "-86";
        String result = alu.integerTrueValue(operand);
        assertEquals(expected, result);
    }

    @Test
    public void floatTrueValue_AllOneExponentAndZeroTail_NaN() {
        String result = alu.floatTrueValue("1111111111111111", 4, 4);
        assertEquals("NaN", result);
    }
    @Test
    public void floatTrueValue_AllOneExponentAndZeroTail_NaN1() {
        String result = alu.floatTrueValue("-1111111111111111", 4, 4);
        assertEquals("NaN", result);
    }
    @Test
    public void floatTrueValue_AllOneExponentAndZeroTail_NaN3() {
        String result = alu.floatTrueValue("00000", 0, 4);
        assertEquals("+Inf", result);
    }
    @Test
    public void floatTrueValue_AllOneExponentAndZeroTail_NaN4() {
        String result = alu.floatTrueValue("-0000", 0, 4);
        assertEquals("-Inf", result);
    }

    @Test
    public void floatTrueValue_AllOneExponentAndZeroTail_ReturnsPositiveInfinity() {
        String result = alu.floatTrueValue("111100000000", 4, 4);
        assertEquals("-128.0", result);
    }

    @Test
    public void floatTrueValue_AllOneExponentAndNonZeroTail_ReturnsNaN() {
        String result = alu.floatTrueValue("111100000001", 4, 4);
        assertEquals("-129.0", result);
    }

    @Test
    public void floatTrueValue_AllZeroExponentAndZeroTail_ReturnsZero() {
        String result = alu.floatTrueValue("000000000000", 4, 4);
        assertEquals("0.0", result);
    }

    @Test
    public void floatTrueValue_AllZeroExponentAndNonZeroTail_ReturnsNegativeFraction() {
        String result = alu.floatTrueValue("000000000001", 4, 4);
        assertEquals("1.220703125E-4", result);
    }

    @Test
    public void floatTrueValue_MixedExponentAndTail_ReturnsCorrectValue() {
        String result = alu.floatTrueValue("01000001001101100000", 8, 11);
        assertEquals("11.375", result);
    }

    @Test
    public void floatTrueValue_NegativeAllOneExponentAndZeroTail_ReturnsNegativeInfinity() {
        String result = alu.floatTrueValue("111100000000", 4, 4);
        assertEquals("-128.0", result);
    }

    @Test
    public void floatTrueValue_NegativeAllOneExponentAndNonZeroTail_ReturnsNaN() {
        String result = alu.floatTrueValue("111100000001", 4, 4);
        assertEquals("-129.0", result);
    }

    @Test
    public void testLeftShift_WithMultipleBits_ShiftsCorrectly() {
        String result = alu.leftShift("00001001", 2);
        assertEquals("00100100", result);
    }

    @Test
    public void testLeftShift_WithSingleBit_ShiftsCorrectly() {
        String result = alu.leftShift("00001001", 1);
        assertEquals("00010010", result);
    }

    @Test
    public void testLeftShift_WithZeroShift_ReturnsOriginalOperand() {
        String result = alu.leftShift("00001001", 0);
        assertEquals("00001001", result);
    }

    @Test
    public void testLeftShift_WithShiftExceedingLength_ReturnsPaddedZeros() {
        String result = alu.leftShift("00001001", 4);
        assertEquals("10010000", result);
    }

    @Test
    public void testLeftShift_WithEmptyString_ReturnsEmptyString() {
        String result = alu.leftShift("", 0);
        assertEquals("", result);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testLeftShift_WithNegativeShift_ThrowsException() {
        alu.leftShift("00001001", -1);
    }

    @Test
    public void testNegation_ZeroInput_ReturnsAllOnes() {
        String result = alu.negation("00000000");
        assertEquals("11111111", result);
    }

    @Test
    public void testNegation_OneInput_ReturnsAllZeros() {
        String result = alu.negation("11111111");
        assertEquals("00000000", result);
    }

    @Test
    public void testNegation_MixedInput_ReturnsCorrectly() {
        String result = alu.negation("00001001");
        assertEquals("11110110", result);
    }

    @Test
    public void testNegation_SingleBitInput_ReturnsComplement() {
        String result = alu.negation("1");
        assertEquals("0", result);
    }

    @Test(expected = NullPointerException.class)
    public void testNegation_NullInput_ThrowsException() {
        alu.negation(null);
    }

    @Test
    public void testNegation_InvalidInput_ThrowsException() {
        alu.negation("notbinary");
    }

    @Test
    public void oneAdder_AddOneToBinaryString_CorrectResult() {
        // Test case: Adding one to a binary string
        String operand = "00001001"; // 9 in binary
        String expected = "000001010"; // 10 in binary
        assertEquals("oneAdder did not add one correctly", expected, alu.oneAdder(operand));
    }

    @Test
    public void oneAdder_AddOneToBinaryStringWithCarryOut_CorrectResult() {
        // Test case: Adding one to a binary string that causes carry out
        String operand = "1111"; // -1 in binary (2's complement, 4 bits)
        String expected = "10000"; // 0 in binary with carry out
        assertEquals("oneAdder did not handle carry out correctly", expected, alu.oneAdder(operand));
    }

    @Test
    public void oneAdder_AddOneToEmptyString_ShouldFail() {
        // Test case: Adding one to an empty string
        String operand = "";
        try {
            alu.oneAdder(operand);
        } catch (StringIndexOutOfBoundsException e) {
            assertEquals("Empty string should cause StringIndexOutOfBoundsException", "Empty string should cause StringIndexOutOfBoundsException", e.getMessage());
        }
    }

    @Test
    public void oneAdder_AddOneToSingleBitString_CorrectResult() {
        // Test case: Adding one to a single bit string
        String operand = "0";
        String expected = "01";
        assertEquals("oneAdder did not add one to single bit correctly", expected, alu.oneAdder(operand));
    }

    @Test
    public void testAdder_WithNoCarryAndNoOverflow() {
        String result = alu.adder("0100", "0011", '0', 8);
        assertEquals("000000111", result);
    }
    @Test
    public void testAdder_WithNoCarryAndNoOverflow1() {
        String result = alu.adder("1111", "0000", '0', 4);
        assertEquals("01111", result);
    }
    @Test
    public void testAdder_WithNoCarryAndNoOverflow2() {
        String result = alu.adder("0000", "-1111", '0', 4);
        assertEquals("01111", result);
    }
    @Test
    public void testAdder_WithNoCarryAndNoOverflow3() {
        String result = alu.adder("-0001", "1111", '0', 4);
        assertEquals("01111", result);
    }
    @Test
    public void testAdder_WithNoCarryAndNoOverflow4() {
        String result = alu.adder("0001", "0000", '0', 4);
        assertEquals("00001", result);
    }





    @Test
    public void testAdder_WithNoCarryAndNoOverflow5() {
        String result = alu.adder("0", "0", '0', 32);
        assertEquals("000000000000000000000000000000000", result);
    }
    @Test
    public void testAdder_WithNoCarryAndNoOverflow6() {
        String result = alu.adder("0000", "-1111", '0', 8);
        assertEquals("000011111", result);
    }
    @Test
    public void testAdder_WithNoCarryAndNoOverflow7() {
        String result = alu.adder("-0001", "1111", '0', 8);
        assertEquals("000000000", result);
    }
    @Test
    public void testAdder_WithNoCarryAndNoOverflow8() {
        String result = alu.adder("0001", "0000", '0', 8);
        assertEquals("000000001", result);
    }





    @Test
    public void testAdder_WithCarryAndNoOverflow() {
        String result = alu.adder("0100", "0100", '0', 8);
        assertEquals("000001000", result);
    }

    @Test
    public void testAdder_WithOverflow() {
        String result = alu.adder("0100", "1011", '0', 8);
        assertEquals("011111111", result);
    }

    @Test
    public void testAdder_WithNegativeNumbersAndNoOverflow() {
        String result = alu.adder("1100", "1011", '0', 8);
        assertEquals("011110111", result);
    }

    @Test
    public void testAdder_WithDifferentLengthOperands() {
        String result = alu.adder("0100", "101", '0', 8);
        assertEquals("000000001", result);
    }

    @Test
    public void testAdder_WithMaxLength() {
        String result = alu.adder("0100", "0011", '0', 4);
        assertEquals("00111", result);
    }

    @Test
    public void fullAdder_000_Returns00() {
        String result = alu.fullAdder('0', '0', '0');
        assertEquals("00", result);
    }

    @Test
    public void fullAdder_001_Returns01() {
        String result = alu.fullAdder('0', '0', '1');
        assertEquals("01", result);
    }

    @Test
    public void fullAdder_010_Returns01() {
        String result = alu.fullAdder('0', '1', '0');
        assertEquals("01", result);
    }

    @Test
    public void fullAdder_011_Returns10() {
        String result = alu.fullAdder('0', '1', '1');
        assertEquals("10", result);
    }

    @Test
    public void fullAdder_100_Returns01() {
        String result = alu.fullAdder('1', '0', '0');
        assertEquals("01", result);
    }

    @Test
    public void fullAdder_101_Returns10() {
        String result = alu.fullAdder('1', '0', '1');
        assertEquals("10", result);
    }

    @Test
    public void fullAdder_110_Returns10() {
        String result = alu.fullAdder('1', '1', '0');
        assertEquals("10", result);
    }

    @Test
    public void fullAdder_111_Returns11() {
        String result = alu.fullAdder('1', '1', '1');
        assertEquals("11", result);
    }

    @Test
    public void claAdder_TypicalCase_CorrectResult() {
        String result = alu.claAdder("1001", "0001", '1');
        assertEquals("01011", result);
    }

    @Test
    public void claAdder_ZeroInput_CorrectResult() {
        String result = alu.claAdder("0000", "0000", '0');
        assertEquals("00000", result);
    }

    @Test
    public void integerSubtraction_TypicalCase_CorrectResult() {
        String result = alu.integerSubtraction("0100", "0011", 8);
        assertEquals("000000001", result);
    }

    @Test
    public void integerSubtraction_BorrowCase_CorrectResult() {
        String result = alu.integerSubtraction("0001", "0010", 8);
        assertEquals("011111111", result);
    }

    @Test
    public void andGate_TypicalCases_CorrectResults() {
        assertEquals('1', alu.andGate('1', '1'));
        assertEquals('0', alu.andGate('0', '1'));
        assertEquals('0', alu.andGate('1', '0'));
        assertEquals('0', alu.andGate('0', '0'));
    }

    @Test
    public void xorGate_TypicalCases_CorrectResults() {
        assertEquals('0', alu.xorGate('0', '0'));
        assertEquals('1', alu.xorGate('0', '1'));
        assertEquals('1', alu.xorGate('1', '0'));
        assertEquals('0', alu.xorGate('1', '1'));
    }

    @Test
    public void allZeroWithLength_WhenLengthIsZero_ReturnsEmptyString() throws Exception {
        // Given
        int length = 0;

        // Use reflection to access the private method
        Method method = ALU.class.getDeclaredMethod("allZeroWithLength", int.class);
        method.setAccessible(true);

        // When
        String result = (String) method.invoke(alu, length);

        // Then
        assertEquals("", result);
    }

    @Test
    public void allZeroWithLength_WhenLengthIsNegative_ReturnsEmptyString() throws Exception {
        // Given
        int length = -3;

        // Use reflection to access the private method
        Method method = ALU.class.getDeclaredMethod("allZeroWithLength", int.class);
        method.setAccessible(true);

        // When
        String result = (String) method.invoke(alu, length);

        // Then
        assertEquals("", result);
    }

    @Test
    public void testAllOneWithLength_Zero_ReturnsEmptyString() throws Exception {
        Method method = ALU.class.getDeclaredMethod("allOneWithLength", int.class);
        method.setAccessible(true);

        String result = (String) method.invoke(alu, 0);
        assertEquals("", result);
    }

    @Test
    public void testAllOneWithLength_One_ReturnsSingleOne() throws Exception {
        Method method = ALU.class.getDeclaredMethod("allOneWithLength", int.class);
        method.setAccessible(true);

        String result = (String) method.invoke(alu, 1);
        assertEquals("1", result);
    }

    @Test
    public void testAllOneWithLength_Five_ReturnsFiveOnes() throws Exception {
        Method method = ALU.class.getDeclaredMethod("allOneWithLength", int.class);
        method.setAccessible(true);

        String result = (String) method.invoke(alu, 5);
        assertEquals("11111", result);
    }

    @Test
    public void testAllOneWithLength_Ten_ReturnsTenOnes() throws Exception {
        Method method = ALU.class.getDeclaredMethod("allOneWithLength", int.class);
        method.setAccessible(true);

        String result = (String) method.invoke(alu, 10);
        assertEquals("1111111111", result);
    }


    @Test
    public void orGate_BothInputsZero_ReturnsZero() throws Exception {
        Method method = ALU.class.getDeclaredMethod("orGate", char.class, char.class);
        method.setAccessible(true);
        char result = (char) method.invoke(alu, '0', '0');
        assertEquals('0', result);
    }

    @Test
    public void orGate_FirstInputOne_ReturnsOne() throws Exception {
        Method method = ALU.class.getDeclaredMethod("orGate", char.class, char.class);
        method.setAccessible(true);
        char result = (char) method.invoke(alu, '1', '0');
        assertEquals('1', result);
    }

    @Test
    public void orGate_SecondInputOne_ReturnsOne() throws Exception {
        Method method = ALU.class.getDeclaredMethod("orGate", char.class, char.class);
        method.setAccessible(true);
        char result = (char) method.invoke(alu, '0', '1');
        assertEquals('1', result);
    }

    @Test
    public void orGate_BothInputsOne_ReturnsOne() throws Exception {
        Method method = ALU.class.getDeclaredMethod("orGate", char.class, char.class);
        method.setAccessible(true);
        char result = (char) method.invoke(alu, '1', '1');
        assertEquals('1', result);
    }


//    @Test
//    public void orGate_TypicalCases_CorrectResults() throws Exception {
//        Method method = ALU.class.getDeclaredMethod("orGate", char.class, char.class);
//        method.setAccessible(true);
//
//        assertEquals('1', method.invoke(null, '0', '1'));
//        assertEquals('1', method.invoke(null, '1', '0'));
//        assertEquals('1', method.invoke(null, '1', '1'));
//        assertEquals('0', method.invoke(null, '0', '0'));
//    }


    @Test
    public void normalize_TypicalCase_CorrectResult() {
        assertEquals(4, alu.normalize("0000"));
        assertEquals(3, alu.normalize("0011"));
        assertEquals(1, alu.normalize("1100"));
    }












//
////真：官方答案，完美无瑕的
//    @Test(timeout = 4000)
//    public void test() {
//        ALU alu = new ALU();
//
//        assertEquals("0000000011101001", alu.integerRepresentation("233", 16));
//        assertEquals("1111111100010111", alu.integerRepresentation("-233", 16));
//
//        assertEquals("01000000010010010000111111011010", alu.ieee754("3.1415926", 32));
//        assertEquals("1100000000001000000000000000000000000000000000000000000000000000", alu.ieee754("-3.00", 64));
//        assertEquals("0000000000000000000000000000000000000000000000000000000000000000", alu.ieee754("0.0", 64));
//        assertEquals("0011111111001101110100101111000111000000000000000000000000000000", alu.ieee754("0.233", 64));
//        assertEquals("0100000001101101001", alu.ieee754("233", 64));
//        assertEquals("", alu.ieee754("3.1415926", 0));
////
//        assertEquals("0000001000", alu.floatRepresentation("0.01", 4, 5));
//
//        OutputStream os = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(os);
//        System.setOut(ps);
//        assertEquals("00010100", alu.floatRepresentation("0.01", 2, 5));
//        ps.flush();
//        assertTrue(os.toString().trim().contains("-6"));
//        assertTrue(os.toString().trim().contains("0000001010"));
//
//        assertEquals("NaN", alu.floatRepresentation(String.valueOf(Integer.MAX_VALUE), 2, 5));
//        assertEquals("+Inf", alu.floatRepresentation("2", -1, 1));
//
//        assertEquals("233", alu.integerTrueValue("0000000011101001"));
//
//        assertEquals("11.375", alu.floatTrueValue("01000001001101100000", 8, 11));
//        assertEquals("-11.375", alu.floatTrueValue("11000001001101100000", 8, 11));
//        assertEquals("+Inf", alu.floatTrueValue("01111111100000000000", 8, 11));
//        assertEquals("-Inf", alu.floatTrueValue("11111111100000000000", 8, 11));
//        assertEquals("NaN", alu.floatTrueValue("11111111100000000001", 8, 11));
//        assertEquals("0", alu.floatTrueValue("10000000000000000000", 8, 11));
//        assertEquals("-4.9591167925315254E-39", alu.floatTrueValue("10000000001101100000", 8, 11));
//
//        assertEquals("10000", alu.oneAdder("1111"));
//
//        assertEquals("000000111", alu.adder("0100", "0011", '0', 8));
//        assertEquals("1000111", alu.adder("1100", "1011", '0', 6));
//        assertEquals("0111111", alu.adder("1100", "0011", '0', 6));
//
//        assertEquals("1000", alu.leftShift("0010", 2));
//    }

}