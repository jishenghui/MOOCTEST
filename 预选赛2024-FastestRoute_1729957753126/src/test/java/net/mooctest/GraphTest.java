package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTest {

	@Test
    public void testNodeConstructorAndGetters() {
        Node node = new Node(1, false, "Highway", false, false, false, 1.5, 0, 24);
        assertEquals(1, node.getNodeId());
        
    }

}
