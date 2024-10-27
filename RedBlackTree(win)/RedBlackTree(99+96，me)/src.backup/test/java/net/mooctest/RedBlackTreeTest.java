package net.mooctest;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedBlackTreeTest {

    @Test(timeout=1000)
    public void testIsLeaf() {
        Node leafNode = new Node(5, null, null, null);
        assertTrue(leafNode.isLeaf());

        Node parentNode = new Node(10, null, null, null);
        Node leftChild = new Node(7, parentNode, leafNode, null);
        Node rightChild = new Node(7, parentNode, null, leafNode);
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

        assertTrue(node1.equals(node1));
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
    @Test(timeout=1000)
    public void testInsertion() {
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
    @Test(timeout=1000)
    public void testDelete() {
    	RedBlackTree tree = new RedBlackTree();
    	tree.delete(-1);
    	tree.insert(2);
    	tree.insert(1);
    	tree.insert(7);
    	tree.insert(6);
    	tree.insert(4);
    	tree.insert(5);
    	tree.insert(3);
    	tree.insert(8);
    	tree.insert(9);
    	tree.insert(10);
    	
    	tree.delete(10);
    	tree.delete(9);
    	tree.delete(10);

    	
    	
    	assertNotNull(tree.search(10));
    	assertNotNull(tree.search(9));
    	assertNotNull(tree.search(8));
    	assertNotNull(tree.search(7));
    	assertNotNull(tree.search(6));
    	assertNotNull(tree.search(5));
    	assertNotNull(tree.search(4));
    	assertNotNull(tree.search(3));

    	RedBlackTree tree1 = new RedBlackTree();
        RedBlackTree.RedBlackNode node1 = new RedBlackTree.RedBlackNode(10, null, null, null, RedBlackTree.ColorEnum.RED);
        RedBlackTree.RedBlackNode node2 = new RedBlackTree.RedBlackNode(20, node1, null, null, RedBlackTree.ColorEnum.BLACK);
        RedBlackTree.RedBlackNode node3 = new RedBlackTree.RedBlackNode(5, node1, null, null, RedBlackTree.ColorEnum.RED);
        RedBlackTree.RedBlackNode node5 = new RedBlackTree.RedBlackNode(5, node1, null, null, RedBlackTree.ColorEnum.BLACK);
        RedBlackTree.RedBlackNode node4 = new RedBlackTree.RedBlackNode(15, node2, null, null, RedBlackTree.ColorEnum.BLACK);
        
        node4.left = node5;
        node4.right = node2;
        node5.left= node3;
        node5.right = node1;
        

        tree1.root = node4;
        tree1.delete(5);
        assertNotNull(tree1.search(5));
	}


    @Test(timeout=1000)
    public void testMinMax() {
        RedBlackTree tree = new RedBlackTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        assertEquals(3, tree.getMinimum());
        assertEquals(15, tree.getMaximum());
        tree.printTree();
        tree.printTreeInOrder();
        tree.printTreePostOrder();
        tree.printTreePreOrder();
    }

    
    @Test(timeout=1000)
    public void testGetSize() {
    	RedBlackTree tree = new RedBlackTree();
    	tree.insert(7);
    	tree.insert(6);
    	tree.insert(4);
    	tree.insert(5);
    	tree.insert(3);
    	tree.insert(8);
    	tree.insert(9);
    	tree.insert(10);
    	
    	assertEquals(8, tree.getSize());
	}
    @Test(timeout=1000)
    public void testContains() {
    	RedBlackTree tree = new RedBlackTree();
    	assertFalse(tree.contains(1));
    	tree.insert(7);
    	tree.insert(6);
    	assertTrue(tree.contains(6));
    }
    @Test(timeout=1000)
    public void testGetSuccessor() {
    	RedBlackTree tree = new RedBlackTree();
    	tree.insert(7);
    	tree.insert(6);
    	tree.insert(4);
    	tree.insert(5);
    	tree.insert(3);
    	tree.insert(8);
    	tree.insert(9);
    	tree.insert(10);
//    	assertNull(tree.getSuccessor(1));
    	assertNotNull(tree.getSuccessor(9));
//    	assertEquals(6,tree.getSuccessor(-10));

//    	assertEquals(4,tree.getSuccessor(0));
    }
    private static class Tree extends AbstractBinaryTree {
        @Override
        protected Node createNode(int value, Node parent, Node left, Node right) {
            return new Node(value, parent, left, right);
        }
    }
    @Test(timeout=1000)
    public void testGetMaxANDMin() {
    	Tree tree = new Tree();
    	Node node1 = tree.insert(7);
    	Node node2 = tree.insert(6);
    	Node node3 = tree.insert(4);
    	Node node4 = tree.insert(5);
    	Node node5 = tree.insert(3);
    	Node node6 = tree.insert(8);
    	Node node7 = tree.insert(9);
    	Node node8 = tree.insert(10);
    	assertEquals(10,tree.getMaximum());
    	assertEquals(3,tree.getMinimum());

//    	assertEquals(4,tree.getSuccessor(0));
    }
    @Test(timeout=1000)
    public void testAbstractDelete() {
    	Tree tree = new Tree();
    	Node node1 = tree.insert(7);
    	Node node2 = tree.insert(6);
    	Node node3 = tree.insert(4);
    	Node node4 = tree.insert(5);
    	Node node5 = tree.insert(3);
    	Node node6 = tree.insert(8);
    	Node node7 = tree.insert(9);
    	Node node8 = tree.insert(10);
    	Node node9 = tree.insert(1);
    	Node node10 = tree.insert(2);
    	Node node11 = tree.insert(11);
    	
    	assertNull(tree.delete(node11));
    	assertNotNull(tree.delete(node5));
    	assertNotNull(tree.delete(node1));
    	assertNull(tree.delete(node10));
    	assertNull(tree.delete(null));

//    	assertEquals(4,tree.getSuccessor(0));
    }
    @Test(timeout=1000)
    public void testAbstractRotatel() {
    	Tree tree = new Tree();
    	Node node1 = tree.insert(7);
    	Node node2 = tree.insert(6);
    	Node node3 = tree.insert(4);
    	Node node4 = tree.insert(5);
    	Node node5 = tree.insert(3);
    	Node node6 = tree.insert(8);
    	Node node7 = tree.insert(9);
    	Node node8 = tree.insert(10);
    	Node node9 = tree.insert(1);
    	Node node10 = tree.insert(2);
    	Node node11 = tree.insert(11);
    	
    	assertEquals(node6,tree.rotateLeft(node1));
    	assertEquals(node10,tree.rotateLeft(node9));
    	assertEquals(node2,tree.rotateRight(node1));
    	assertEquals(node3,tree.rotateRight(node2));

//    	assertEquals(4,tree.getSuccessor(0));
    }

    
}
