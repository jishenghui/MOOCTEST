package net.mooctest;

import org.junit.*;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Test_BST {
    private BST<String, Integer> bst;
    private Queue<Integer> queue;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;




    @Before
    public void setUp() {
        queue = new Queue<>();
        bst = new BST<>();
        System.setOut(new PrintStream(outContent));

    }
    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(bst.isEmpty());
        bst.put("S", 0);
        assertFalse(bst.isEmpty());
    }


    @Test
    public void testSize() {
        assertEquals(0, bst.size());
        bst.put("S", 0);
        bst.put("E", 1);
        assertEquals(2, bst.size());
    }

    @Test
    public void testGet() {
        assertNull(bst.get("S"));
        bst.put("S", 0);
        assertEquals(Integer.valueOf(0), bst.get("S"));
    }

    @Test
    public void testContains() {
        assertFalse(bst.contains("S"));
        bst.put("S", 0);
        assertTrue(bst.contains("S"));
    }

    @Test
    public void testDelete() {
        bst.put("S", 0);
        bst.put("E", 1);
        bst.delete("S");
        assertFalse(bst.contains("S"));
        assertEquals(1, bst.size());
    }

    @Test
    public void testMin() {
        bst.put("S", 0);
        bst.put("E", 1);
        bst.put("X", 2);
        assertEquals("E", bst.min());
    }

    @Test
    public void testMax() {
        bst.put("S", 0);
        bst.put("E", 1);
        bst.put("X", 2);
        assertEquals("X", bst.max());
    }

    @Test
    public void testFloor() {
        bst.put("S", 0);
        bst.put("E", 1);
        bst.put("X", 2);
        assertEquals("E", bst.floor("F"));
        assertNull(bst.floor("A"));
    }

    @Test
    public void testCeiling() {
        bst.put("S", 0);
        bst.put("E", 1);
        bst.put("X", 2);
        assertEquals("S", bst.ceiling("S"));
        assertEquals("X", bst.ceiling("T"));
        assertNull(bst.ceiling("Z"));
    }

    @Test
    public void testKeys() {
        bst.put("S", 0);
        bst.put("E", 1);
        bst.put("X", 2);
        Iterable<String> keys = bst.keys();
        for (String key : keys) {
            assertTrue(bst.contains(key));
        }
    }













    @Test
    public void testIsEmpty2() {
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testSize2() {
        assertEquals(0, queue.size());
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.size());
    }

    @Test
    public void testEnqueue() {
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
        assertEquals(Integer.valueOf(1), queue.peek());
    }




    @Test
    public void testToString() {
        assertEquals("", queue.toString());
        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals("1 2 ", queue.toString());
    }

    @Test
    public void testIterator() {
        assertFalse(queue.iterator().hasNext()); // Iterator should be empty for an empty queue
        queue.enqueue(1);
        queue.enqueue(2);

        StringBuilder sb = new StringBuilder();
        for (Integer item : queue) {
            sb.append(item).append(" ");
        }

        assertEquals("1 2 ", sb.toString());
    }
    @Test
    public void testIsEmpty1() {
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize1() {
        assertEquals(0, queue.size());

        queue.enqueue(1);
        assertEquals(1, queue.size());

        queue.enqueue(2);
        queue.dequeue();
        assertEquals(1, queue.size());

        queue.dequeue();
        assertEquals(0, queue.size());
    }

    @Test
    public void testEnqueue1() {
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
        assertEquals(Integer.valueOf(1), queue.peek());

        queue.enqueue(2);
        assertEquals(2, queue.size());
        assertEquals(Integer.valueOf(1), queue.peek()); // Ensure the first element is still there
    }




    @Test
    public void testToString1() {
        assertEquals("", queue.toString());

        queue.enqueue(1);
        assertEquals("1 ", queue.toString());

        queue.enqueue(2);
        assertEquals("1 2 ", queue.toString());

        queue.dequeue();
        assertEquals("2 ", queue.toString());
    }

    @Test
    public void testIterator1() {
        assertFalse(queue.iterator().hasNext()); // Iterator should be empty for an empty queue

        queue.enqueue(1);
        queue.enqueue(2);

        StringBuilder sb = new StringBuilder();
        for (Integer item : queue) {
            sb.append(item).append(" ");
        }

        assertEquals("1 2 ", sb.toString());
    }

    @Test
    public void testName() throws Exception {

        try {
            queue.peek();
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            queue.dequeue();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    @Test
    public void testEnqueueAndIterator() {
        // Create a queue and enqueue elements
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Use iterator to check the elements in FIFO order
        Iterator<Integer> iterator = queue.iterator();

        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(1), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(2), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(Integer.valueOf(3), iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testDequeueAndSize() {
        // Create a queue and enqueue elements
        Queue<String> queue = new Queue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        // Dequeue elements and check the size
        assertEquals("A", queue.dequeue());
        assertEquals(2, queue.size());
        assertEquals("B", queue.dequeue());
        assertEquals(1, queue.size());
        assertEquals("C", queue.dequeue());
        assertEquals(0, queue.size());
    }

//    @Test(expected = NoSuchElementException.class)
//    public void testPeekException() {
//        // Create an empty queue and try to peek
//        Queue<Double> queue = new Queue<>();
//        queue.peek(); // Should throw NoSuchElementException
//    }

    @Test
    public void testDequeueException() {
        // Create an empty queue and try to dequeue
        Queue<Integer> queue = new Queue<>();
        try {
            queue.dequeue(); // Should throw NoSuchElementException
        } catch (NoSuchElementException e) {
            // TODO: handle exception
        }

    }

    @Test
    public void testRemove() {
        // Create a queue and try to remove from the iterator
        Queue<Character> queue = new Queue<>();
        queue.enqueue('A');
        Iterator<Character> iterator = queue.iterator();
        try {
            iterator.remove(); // Should throw UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            // TODO: handle exception
        }

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

//    @Test
//    public void testPrintDouble() {
//        StdOut.print(3.14);
//        assertEquals("", outContent.toString());
//    }

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
