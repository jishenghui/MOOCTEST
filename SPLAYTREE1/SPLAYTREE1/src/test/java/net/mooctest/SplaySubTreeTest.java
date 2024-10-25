package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplaySubTreeTest {

    private SplaySubTree<String> splaySubTreeUnderTest;

    @Before
    public void setUp() {
        splaySubTreeUnderTest = new SplaySubTree<>("node");
    }

    @Test
    public void testToString() {
        // Setup
        // Run the test
        final String result = splaySubTreeUnderTest.toString();

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    public void testGet() {
        // Setup
        // Run the test
        final SplaySubTree<String> result = splaySubTreeUnderTest.get(0L);

        // Verify the results
    }

    @Test
    public void testIndexOf() {
        // Setup
        // Run the test
        final long result = splaySubTreeUnderTest.indexOf("node");

        // Verify the results
        assertEquals(0L, result);
    }

    @Test
    public void testAdd() {
        // Setup
        // Run the test
        final SplaySubTree<String> result = splaySubTreeUnderTest.add("node");

        // Verify the results
    }

    @Test
    public void testRemove() {
        // Setup
        // Run the test
        final SplaySubTree<String> result = splaySubTreeUnderTest.remove("node");

        // Verify the results
    }

    @Test
    public void testJoin() {
        assertNull(splaySubTreeUnderTest.join(new SplaySubTree<>("node")));
    }

    @Test
    public void testSplit() {
        assertNull(splaySubTreeUnderTest.split("node"));
    }

    @Test
    public void testFind() {
        // Setup
        // Run the test
        final SplaySubTree<String> result = splaySubTreeUnderTest.find("node");

        // Verify the results
    }

    @Test
    public void testSplay() {
        assertFalse(splaySubTreeUnderTest.splay());
    }
}
