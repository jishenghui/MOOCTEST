package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AbstractSelfBalancingBinarySearchTreeTest4 {

	@Test
	public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
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

		ScapegoatTree st1 = new ScapegoatTree(100);
		ScapegoatTree st2 = new ScapegoatTree();

		st1.insert(1);
		st1.insert(2);
		st1.insert(3);
		st1.insert(5);
		st1.insert(7);
		st1.insert(-23);
		st1.insert(87);
		st1.insert(1000);
		st1.insert(0);
		st1.insert(0);

		st1.delete(1);
		st1.delete(100);
		st1.delete(10);
		st1.delete(1);
		st1.delete(1000);

		assertFalse(st1.contains(1));
		assertTrue(st1.contains(0));

		assertEquals(-23,st1.getMinimum());
		assertEquals(87,st1.getMaximum());

		assertEquals(2,st1.getSuccessor(0));
		assertEquals(3,st1.getSuccessor(2));

		st1.printTreePreOrder();
		st1.printTreeInOrder();
		st1.printTreePostOrder();
		st2.printTreePreOrder();
		st2.printTreeInOrder();
		st2.printTreePostOrder();
		st1.printTree();

		AbstractBinarySearchTree.Node abstn0 = new AbstractBinarySearchTree.Node(null,null,null,null);
		assertEquals(31,abstn0.hashCode());

		AbstractBinarySearchTree.Node abstn1 = new AbstractBinarySearchTree.Node(1,null,null,null);
		AbstractBinarySearchTree.Node abstn2 = new AbstractBinarySearchTree.Node(2,null,null,null);
		AbstractBinarySearchTree.Node abstn3 = new AbstractBinarySearchTree.Node(2,abstn2,abstn1,null);
		AbstractBinarySearchTree.Node abstn4 = new AbstractBinarySearchTree.Node(2,abstn2,abstn1,null);
		AbstractBinarySearchTree.Node abstn5 = new AbstractBinarySearchTree.Node(2,abstn2,abstn1,null);
		AbstractBinarySearchTree.Node abstn6 = new AbstractBinarySearchTree.Node(2,null,abstn3,abstn5);
		AbstractBinarySearchTree.Node abstn00 = new AbstractBinarySearchTree.Node(null,abstn1,null,null);

		assertEquals(32,abstn1.hashCode());

		assertFalse(abstn1.equals(null));
		assertFalse(abstn1.equals(new Integer(1)));
		assertFalse(abstn1.equals(new String("1")));
		assertTrue(abstn1.equals(abstn1));
		assertFalse(abstn1.equals(abstn0));
		assertFalse(abstn1.equals(abstn2));
		assertTrue(abstn0.equals(abstn0));
		assertFalse(abstn0.equals(abstn1));
		assertTrue(abstn0.equals(abstn00));

		st2.insert(1);
		st2.insert(1);
		st2.insert(2);
		st2.insert(3);
		st2.insert(5);
		st2.insert(7);
		st2.insert(-23);
		st2.insert(87);
		st2.insert(1000);
		st2.insert(0);
		st2.insert(-1);

		assertEquals(1,st2.getSuccessor(0));
		assertEquals(3,st2.getSuccessor(2));

		st2.printTree();
		st2.printTreePreOrder();
		st2.printTreeInOrder();
		st2.printTreePostOrder();

		st2.delete(-1);
		st2.delete(1);
		st2.delete(100);
		st2.delete(10);
		st2.delete(0);
		st2.delete(null);

		st2.printTree();

		st2.delete(abstn0);
		st2.delete(abstractBinarySearchTree_Node1);
		st2.delete(abstn3);

		assertEquals(2,MathUtils.getMax(1,2));
		assertEquals(2,MathUtils.getMax(2,1));
		assertEquals(1,MathUtils.getMax(1,1));
		assertEquals(0,MathUtils.getDigitFromNumber(1,1));

		st1.printSubtree(abstn1);
		st1.printSubtree(abstn0);
		st1.printSubtree(abstn2);


		ScapegoatTree st3 = new ScapegoatTree(1);
		st3.insert(1);
		st3.insert(2);
		st3.insert(1);
		st3.insert(4);
		st3.insert(2);
		st3.printTree();
		st3.delete(2);

		st3.rotateRight(abstn3);
		st3.rotateRight(abstn5);

		st3.rotateLeft(abstn1);
		st3.rotateLeft(abstn2);

		st3.rotateRight(abstn6);

		ScapegoatTree stm = new ScapegoatTree();
		Class clazz = stm.getClass();
		Method method1,method2,method3;
		method1 = clazz.getDeclaredMethod("getNodeHeight", AbstractBinarySearchTree.Node.class);
		method2 = clazz.getDeclaredMethod("getSibling", AbstractBinarySearchTree.Node.class);
		method3 = clazz.getDeclaredMethod("findScapegoatNode", AbstractBinarySearchTree.Node.class);
		method1.setAccessible(true);
		method2.setAccessible(true);
		method3.setAccessible(true);
		method1.invoke(stm,(AbstractBinarySearchTree.Node)null);
		method2.invoke(stm,abstn0);
		method3.invoke(stm,abstn0);

		MathUtils a = new MathUtils();
	}

}
