package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;


public class TreePrinterTest {

	@Test
    public void testPrintNode() {
        AVLNode<Integer> node1 = new AVLNode<>(1);
        AVLNode<Integer> node3 = new AVLNode<>(3);
        AVLNode<Integer> node2 = new AVLNode<>(2,node1,node3);
        AVLNode<Integer> node5 = new AVLNode<>(5);
        AVLNode<Integer> node7 = new AVLNode<>(7);
        AVLNode<Integer> node6 = new AVLNode<>(6,node5,node7);
        AVLNode<Integer> root = new AVLNode<>(4,node2,node6);

        String expectedOutput =
                "   4   \n" +
                "  / \\  \n" +
                " 2   6 \n" +
                "/ \\ / \\ \n" +
                "1 3 5 7 \n";

        String output = TreePrinter.printNode(root);
        assertEquals(expectedOutput, output);
    }



}
