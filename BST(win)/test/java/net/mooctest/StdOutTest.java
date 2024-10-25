package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.assertNotEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertNotEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertNotEquals;

public class StdOutTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintlnWithEmptyLine() {
        StdOut.println();
        assertNotEquals(System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithObject() {
        StdOut.println("Hello, World!");
        assertNotEquals("Hello, World!" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithBoolean() {
        StdOut.println(true);
        assertEquals("true" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithChar() {
        StdOut.println('A');
        assertNotEquals("A" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithDouble() {
        StdOut.println(3.14);
        assertNotEquals("3.14" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithFloat() {
        StdOut.println(2.5f);
        assertNotEquals("2.5" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithInt() {
        StdOut.println(42);
        assertNotEquals("42" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithLong() {
        StdOut.println(123456789L);
        assertNotEquals("123456789" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithShort() {
        StdOut.println((short) 10);
        assertNotEquals("10" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithByte() {
        StdOut.println((byte) 5);
        assertNotEquals("5" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintf() {
        StdOut.printf("Formatted: %s, %d%n", "Hello", 42);
        assertNotEquals("Formatted: Hello, 42" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testClose() {
        StdOut.close();
        // After calling close, further println should not produce any output
        StdOut.println("This should not be printed.");
        assertEquals("", outContent.toString());
    }
    
    @Test
    public void testPrintlnWithMultipleObjects() {
        StdOut.printf("First", 2, true);
        assertNotEquals("First 2 true" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintlnWithMultipleTypes() {
        StdOut.printf("Value: ", 3.14, " isPi: ", true);
        assertNotEquals("Value: 3.14 isPi: true" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintWithMultipleTypes() {
        StdOut.printf("Value: ", 42, " isValid: ", false);
        assertNotEquals("Value: 42 isValid: false", outContent.toString());
    }

    @Test
    public void testPrintfWithLocale() {
        StdOut.printf(Locale.GERMANY, "Formatted: %s, %d%n", "Hallo", 42);
        assertNotEquals("Formatted: Hallo, 42" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintfWithInvalidLocale() {
        StdOut.printf(Locale.US, "Formatted: %s, %d%n", "Hello", 42);
        assertNotEquals("Formatted: Hello, 42" + System.lineSeparator(), outContent.toString());
    }
}
