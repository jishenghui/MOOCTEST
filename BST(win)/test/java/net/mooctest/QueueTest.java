package net.mooctest;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    private Queue<Integer> queue;

    @Before
    public void setUp() {
        queue = new Queue<>();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testSize() {
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
    
}

