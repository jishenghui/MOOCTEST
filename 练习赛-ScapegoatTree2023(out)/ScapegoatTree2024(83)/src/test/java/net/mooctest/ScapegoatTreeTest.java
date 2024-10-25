package net.mooctest;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ScapegoatTreeTest {
//    mvn test-compile org.pitest:pitest-maven:mutationCoverage

    ScapegoatTree scapegoatTree;
    @Before
    public void TestSetUp() throws Exception {
        scapegoatTree=new ScapegoatTree(0.6);
    }

    @Test
    public void TestInsert() {
        int[]arr=new int[]{322,509 ,974 ,389 ,815 ,416 ,787 ,18 ,34 ,65, 315, 540, 521, 184, 982, 861 ,972 ,76, 715, 320, 214, 893, 516 };
        for (int i = 0; i < arr.length; i++) {
            scapegoatTree.insert(arr[i]);
        }

    }

    @Test
    public void TestAbstractBinarySearchTree_print_hash(){
        int[]arr=new int[]{322,509 ,974 ,389 ,815 ,416 ,787 ,18 ,34 ,65, 315, 540, 521, 184, 982, 861 ,972 ,76, 715, 320, 214, 893, 516 };
        for (int i = 0; i < arr.length; i++) {
            scapegoatTree.insert(arr[i]);
        }
        scapegoatTree.printTree();
        scapegoatTree.printTreePostOrder();
        scapegoatTree.printTreePreOrder();
        AbstractBinarySearchTree.Node node=scapegoatTree.root;
        System.out.println(node.hashCode());
        scapegoatTree.printSubtree(node);
        node.value=null;
        System.out.println(node.hashCode());
        scapegoatTree.printSubtree(node);
        scapegoatTree.printTree();
        scapegoatTree.printTreePostOrder();
        scapegoatTree.printTreePreOrder();
        node.left=null;
        node.right=null;
        scapegoatTree.printTree();
        scapegoatTree.printTreePostOrder();
        scapegoatTree.printSubtree(node);
        scapegoatTree.printTreePreOrder();


    }
    @Test
    public void TestAbstractBinarySearchTreeGetSuccessor(){
        int[]arr=new int[]{322,509 ,974 ,389 ,815 ,416 ,787 ,18 ,34 ,65, 315, 540, 521, 184, 982, 861 ,972 ,76, 715, 320, 214, 893, 516 };
        for (int i = 0; i < arr.length; i++) {
            scapegoatTree.insert(arr[i]);
        }
        AbstractBinarySearchTree.Node node=scapegoatTree.root;
        node=node.left.left;
        System.out.println(scapegoatTree.getSuccessor(18));
        assertEquals((Integer) 76,scapegoatTree.getSuccessor(node).value);//右子树的最左节点
        node=scapegoatTree.root;
        assertEquals((Integer)516,scapegoatTree.getSuccessor(node).value);
        node=node.left.right;
        assertEquals((Integer)509,scapegoatTree.getSuccessor(node).value);//最顶层的节点

    }

    @Test
    public void delete() {
        assertNull(scapegoatTree.delete(-1));
        assertNull(scapegoatTree.delete(null));
        int[]arr=new int[]{322,509 ,974 ,389 ,815 ,416 ,787 ,18 ,34 ,65, 315, 540, 521, 184, 982, 861 ,972 ,76, 715, 320, 214, 893, 516 };
        for (int i = 0; i < arr.length; i++) {
            scapegoatTree.insert(arr[i]);
        }
        assertEquals(982,scapegoatTree.getMaximum());
        assertEquals((Integer)972,scapegoatTree.delete(861).value);
        assertEquals((Integer)893,scapegoatTree.delete(972).value);
        assertEquals((Integer)982,scapegoatTree.delete(974).value);
//        scapegoatTree.printTree();

        AbstractBinarySearchTree.Node node2=scapegoatTree.root;
        AbstractBinarySearchTree.Node node1=scapegoatTree.root.right.left;
        node2=node2.right.right;
        node2.right=node1;
        AbstractBinarySearchTree.Node node3=scapegoatTree.root;
        node3.right.left=null;
//        scapegoatTree.printTree();
        scapegoatTree.delete(982);
        scapegoatTree.delete(509);
    }


    @Test
    public void createNode() {

    }

    @Test
    public void findScapegoatNode() {
        scapegoatTree.insert(509);
        assertNull(scapegoatTree.findScapegoatNode(new AbstractBinarySearchTree.Node(509,null,null,null)));
    }

    @Test
    public void rebuildTree() {
    }

    @Test
    public void getSubtreeSize() {
        scapegoatTree.insert(509);
        assertNull(scapegoatTree.findScapegoatNode(new AbstractBinarySearchTree.Node(509,null,null,null)));
    }

    @Test
    public void getNodeHeight() {
        assertEquals(-1,scapegoatTree.getNodeHeight(null));
    }

    @Test
    public void equals(){
        int[]arr=new int[]{322,509 ,974 ,389 ,815 ,416 ,787 ,18 ,34 ,65, 315, 540, 521, 184, 982, 861 ,972 ,76, 715, 320, 214, 893, 516 };
        for (int i = 0; i < arr.length; i++) {
            scapegoatTree.insert(arr[i]);
        }
        AbstractBinarySearchTree.Node node1=scapegoatTree.root;
        AbstractBinarySearchTree.Node node2=scapegoatTree.root;
        assertTrue(node1.equals(node2));
        scapegoatTree.printTree();
        assertFalse(node1.equals(null));
        assertFalse(node1.equals(1));
        node1=node1.left;
        assertFalse(node1.equals(node2));
        node1.value=node2.value;
        assertTrue(node1.equals(node2));
        node1.value=null;
        assertFalse(node1.equals(node2));
        node2.value=null;
        assertTrue(node1.equals(node2));

    }

    @Test
    public void TestGetDigitFromNumber() {
        int num=18726345;
        char[] s=Integer.toString(num).toCharArray();
        int index=s.length-3;
        assertEquals(MathUtils.getDigitFromNumber(num,index),s[s.length-index-1]-'0');;
    }

    @Test
    public void TestGetMax() {
        int max=2;
        int min=1;
        assertTrue(MathUtils.getMax(max,min)==max);
    }

    @Test
    public void TestLogarithm() {
        double a=12;
        double base=128;
        assertEquals(Math.log(a) / Math.log(base),MathUtils.logarithm(base,a),0.01);
    }


    @Test
    public void testzero() {
        ScapegoatTree scapegoatTree0 = new ScapegoatTree();
        AbstractBinarySearchTree.Node abstractBinarySearchTree_Node0 = scapegoatTree0.createNode((-3252),
                (AbstractBinarySearchTree.Node) null, (AbstractBinarySearchTree.Node) null,
                (AbstractBinarySearchTree.Node) null);
        AbstractBinarySearchTree.Node abstractBinarySearchTree_Node1 = new AbstractBinarySearchTree.Node(
                abstractBinarySearchTree_Node0.value, abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node0,
                abstractBinarySearchTree_Node0);
        AbstractBinarySearchTree.Node abstractBinarySearchTree_Node2 = scapegoatTree0
                .rotateRight(abstractBinarySearchTree_Node1);
        scapegoatTree0.rotateLeft(abstractBinarySearchTree_Node1);
        AbstractBinarySearchTree.Node abstractBinarySearchTree_Node3 = scapegoatTree0
                .rotateRight(abstractBinarySearchTree_Node2);
        assertTrue(abstractBinarySearchTree_Node1.isLeaf());
        assertSame(abstractBinarySearchTree_Node0, abstractBinarySearchTree_Node3);
    }
    @Test
    public void TestGetDigitFromNumber1() {
        int num=18726345;
        char[] s=Integer.toString(num).toCharArray();
        int index=s.length-3;
        assertEquals(MathUtils.getDigitFromNumber(num,index),s[s.length-index-1]-'0');;
    }

    @Test
    public void TestGetMax1() {
        int max=2;
        int min=1;
        assertTrue(MathUtils.getMax(max,min)==max);
    }

    @Test
    public void TestLogarithm1() {
        double a=12;
        double base=128;
        assertEquals(Math.log(a) / Math.log(base),MathUtils.logarithm(base,a),0.01);
    }

}
