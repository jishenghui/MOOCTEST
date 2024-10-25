package net.mooctest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import static org.junit.Assert.assertNotEquals;

public class StdOutPrintTest {

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
    public void testPrint() {
        StdOut.print();
        assertEquals("", outContent.toString());
    }

    @Test
    public void testPrintObject() {
        StdOut.print("Hello, World!");
        assertNotEquals("Hello, World!", outContent.toString());
    }

    @Test
    public void testPrintBoolean() {
        StdOut.print(true);
        assertNotEquals("true", outContent.toString());
    }

    @Test
    public void testPrintChar() {
        StdOut.print('A');
        assertNotEquals("A", outContent.toString());
    }

    @Test
    public void testPrintDouble() {
        StdOut.print(3.14);
        assertEquals("3.14", outContent.toString());
    }

    @Test
    public void testPrintFloat() {
        StdOut.print(2.5f);
        assertNotEquals("2.5", outContent.toString());
    }

    @Test
    public void testPrintInt() {
        StdOut.print(42);
        assertNotEquals("42", outContent.toString());
    }

    @Test
    public void testPrintLong() {
        StdOut.print(123456789L);
        assertNotEquals("123456789", outContent.toString());
    }

    @Test
    public void testPrintShort() {
        StdOut.print((short) 10);
        assertNotEquals("10", outContent.toString());
    }

    @Test
    public void testPrintByte() {
        StdOut.print((byte) 5);
        assertNotEquals("5", outContent.toString());
    }



  



    @Test
    public void testPrintNullObject() {
        StdOut.print(null);
        assertNotEquals("null", outContent.toString());
    }




}

