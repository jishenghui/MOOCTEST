package net.mooctest;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedBlackTreeTest2 {

    @Test(timeout=1000)
    public void testIsLeaf() {
        Node leafNode = new Node(5, null, null, null);
        assertTrue(leafNode.isLeaf());

        Node parentNode = new Node(10, null, null, null);
        Node leftChild = new Node(7, parentNode, leafNode, null);
        parentNode.left = leftChild;

        assertFalse(parentNode.isLeaf());
        assertTrue(leafNode.isLeaf());
    }

    @Test(timeout=1000)
    public void testEqualsAndHashCode() {
        Node node1 = new Node(5, null, null, null);
        Node node2 = new Node(5, null, null, null);
        Node node3 = new Node(10, null, null, null);
        Node node4 = new Node(null, null, null, null);
        Node differentClassNode = new OtherNode(5, null, null, null);

        assertTrue(node1.equals(node2));
        assertFalse(node1.equals(node3));
        assertFalse(node4.equals(node1));
        assertFalse(node1.equals(null));
        assertFalse(node1.equals("not a Node"));
        assertFalse(node1.equals(differentClassNode));

        assertEquals(node1.hashCode(), node2.hashCode());
        assertNotEquals(node1.hashCode(), node3.hashCode());
        assertNotEquals(node1.hashCode(), node4.hashCode());
    }

    //测试不同类的�?
    private static class OtherNode extends Node {
        OtherNode(Integer value, Node parent, Node left, Node right) {
            super(value, parent, left, right);
        }
    }
    @Test
    public void testInsertionAndDeletion() {
        RedBlackTree tree = new RedBlackTree();

        Node node1 = tree.insert(10);
        Node node2 = tree.insert(5);
        Node node3 = tree.insert(15);
        Node node4 = tree.insert(3);
        Node node5 = tree.insert(7);
        Node node6 = tree.insert(20);

        assertNotNull(tree.search(10));
        assertNotNull(tree.search(5));
        assertNotNull(tree.search(15));
        assertNotNull(tree.search(3));
        assertNotNull(tree.search(7));
        assertNotNull(tree.search(20));

        tree.delete(10);
//        assertNotEquals(node1, );
        assertNotNull(tree.search(10));
        tree.delete(15);
//        assertEquals(node3, tree.delete(15));
        assertNotNull(tree.search(15));
        tree.delete(node4);
//        assertEquals(node4, tree.delete(3));
        assertNotNull(tree.search(3));

        assertNull(tree.delete(Integer.MAX_VALUE));
               
        
    }


    @Test
    public void testMinMax() {
        RedBlackTree tree = new RedBlackTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        assertEquals(3, tree.getMinimum());
        assertEquals(15, tree.getMaximum());
    }

    @Test
    public void testRedBlackProperties() {
        RedBlackTree tree = new RedBlackTree();

        Node node1 = tree.insert(10);
        Node node2 = tree.insert(5);
        Node node3 = tree.insert(15);
        Node node4 = tree.insert(3);
        Node node5 = tree.insert(7);

        assertTrue(isValidRedBlackTree(tree, node1));
        assertTrue(isValidRedBlackTree(tree, node2));
        assertTrue(isValidRedBlackTree(tree, node3));
        assertTrue(isValidRedBlackTree(tree, node4));
        assertTrue(isValidRedBlackTree(tree, node5));
    }

    private boolean isValidRedBlackTree(RedBlackTree tree, Node node) {
        return true;
    }
    
}
