package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BSTTest {

    private BST<String, Integer> bst;

    @Before
    public void setUp() {
        bst = new BST<>();
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
    
}
