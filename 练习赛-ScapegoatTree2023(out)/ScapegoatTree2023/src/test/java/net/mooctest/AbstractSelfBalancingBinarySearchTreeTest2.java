package net.mooctest;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import javax.enterprise.inject.New;

import org.evosuite.shaded.antlr.CSharpCodeGenerator;
import org.junit.Test;



public class AbstractSelfBalancingBinarySearchTreeTest2 {

	@Test
	public void test() {
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
	public void test1() {
		ScapegoatTree scapegoatTree = new ScapegoatTree(0);
//		scapegoatTree.printTree();
		AbstractBinarySearchTree.Node  node = scapegoatTree.insert(1);
		scapegoatTree.printTree();
		assertNotNull(scapegoatTree.insert(2));
		assertNotNull(scapegoatTree.insert(3));
		assertNotNull(scapegoatTree.insert(-1));
		assertNotNull(scapegoatTree.insert(2));
		assertNull(scapegoatTree.delete(-1));
		assertNotNull(scapegoatTree.insert(10));
		assertNotNull(scapegoatTree.search(10));
		assertNull(scapegoatTree.delete(100));
		scapegoatTree.printTree();
		System.out.println();
		scapegoatTree.printSubtree(node);
		System.out.println();
		scapegoatTree.printTreeInOrder();
		System.out.println();
		scapegoatTree.printTreePreOrder();
		System.out.println();
		scapegoatTree.printTreePostOrder();
//		assertTrue(false);
		
	}
	
	@Test
	public void test2() {
		ScapegoatTree scapegoatTree = new ScapegoatTree(1);
		scapegoatTree.insert(2);
		scapegoatTree.insert(3);
		scapegoatTree.insert(4);
		System.out.println("test2");
		scapegoatTree.printTree();
		
		System.out.println(scapegoatTree.getSize());
		scapegoatTree.delete(4);
		
		System.out.println(scapegoatTree.getMaximum());
		
		ScapegoatTree scapegoatTree2 = new ScapegoatTree(1);
		scapegoatTree2.insert(4);
		scapegoatTree2.insert(5);
		scapegoatTree2.insert(3);
		scapegoatTree2.printTree();
		System.out.println(scapegoatTree2.getMinimum());
		assertEquals(3, scapegoatTree2.getMinimum());
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		AbstractBinarySearchTree.Node node1 = null;
		AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(1, node, null, null);
		scapegoatTree2.findScapegoatNode(node);
		scapegoatTree2.findScapegoatNode(node2);
		scapegoatTree2.getNodeHeight(node);
		scapegoatTree2.getNodeHeight(node1);
		scapegoatTree.delete(node1);
		AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(1, null, null, null);
		scapegoatTree.delete(node3);
		AbstractBinarySearchTree.Node node4 = new AbstractBinarySearchTree.Node(1, null, null, node2);
		scapegoatTree.delete(node4);
		AbstractBinarySearchTree.Node node5 = new AbstractBinarySearchTree.Node(1, null, node2, null);
		scapegoatTree.delete(node5);
		AbstractBinarySearchTree.Node node6 = new AbstractBinarySearchTree.Node(1, null, node2, node2);
		scapegoatTree.delete(node6);
		AbstractBinarySearchTree.Node node7 = new AbstractBinarySearchTree.Node(1, null, null, null);
		

	}
	
	@Test
	public void test4() {
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, null, null);
		AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, null, null);
		node.right = node1;
		node.left = node3;
		node1.left = node2;
		node2.left = node;
		node.parent = node2;
		AbstractBinarySearchTree.Node node4 = null;
		AbstractBinarySearchTree.Node node5 = new AbstractBinarySearchTree.Node(null, null, null, null);
		AbstractBinarySearchTree.Node node6 = new AbstractBinarySearchTree.Node(null, null, null, null);
		AbstractBinarySearchTree.Node node7 = new AbstractBinarySearchTree.Node(1, null, null, null);
		assertTrue(node.equals(node));
		assertFalse(node.equals(node4));
		assertFalse(node.equals(new String("1")));
		assertFalse(node.equals(node1));
		assertTrue(node5.equals(node6));
		assertFalse(node5.equals(node1));
		assertTrue(node.equals(node7));
		assertEquals(32, node.hashCode());
		assertEquals(31, node5.hashCode());
		ScapegoatTree scapegoatTree = new ScapegoatTree(0);
		scapegoatTree.delete(node);
		scapegoatTree.printSubtree(node5);
		scapegoatTree.insert(1);
		scapegoatTree.insert(3);
		scapegoatTree.insert(-3);
		scapegoatTree.insert(4);
		assertTrue(scapegoatTree.contains(1));
		assertFalse(scapegoatTree.contains(2));
		assertEquals(3, scapegoatTree.getSuccessor(1));
		scapegoatTree.printTree();
		assertEquals(4, scapegoatTree.getSuccessor(3));
		scapegoatTree.insert(5);
		scapegoatTree.insert(6);
		scapegoatTree.insert(-1);
		scapegoatTree.insert(0);
		scapegoatTree.insert(-2);
		scapegoatTree.printTree();
		assertEquals(1, scapegoatTree.getSuccessor(0));
		try {
			scapegoatTree.getSuccessor(6);
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		}

		
	}
	
	@Test
	public void test5() {
		ScapegoatTree s = new ScapegoatTree(2);
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.printTree();
		s.delete(3);

	}
	
	@Test
	public void test6() {
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, node1, null);
		AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, node1, node2);
		node.right = node1;
		
		scapegoatTree.rotateLeft(node);
//		scapegoatTree.rotateLeft(node2);
		scapegoatTree.rotateLeft(node3);
	}
	
	@Test
	public void test7() {
		
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, null, null);
		AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, null, null);
		
		node1.parent = node;
		node.right = node1;
		node2.parent = node1;
		node1.left = node2;
		node3.parent = node1;
		node1.right = node3;
		scapegoatTree.rotateLeft(node1);
				
	}
	
	@Test
	public void test8() {
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(1, null, null, null);
//		AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(1, null, null, null);
		node1.parent = node;
		node.left = node1;
		scapegoatTree.rotateRight(node);
		
		
	}
	
	@Test
	public void test9() {
		
		assertEquals(0, MathUtils.getDigitFromNumber(1, 2));
		assertEquals(2, MathUtils.getMax(1, 2));
		assertEquals(2, MathUtils.getMax(2, 1));
		MathUtils mathUtils = new MathUtils();
	}
	
	@Test
	public void test10() {
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		scapegoatTree.root = node;
		
//		System.out.println(scapegoatTree.root.value);
		scapegoatTree.search(1);
		try {
			scapegoatTree.insert(2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("空指针异常");
		}
		
	}
	@Test
	public void test11() {
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(1, null, null, null);
		AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(2, null, null, null);
		AbstractBinarySearchTree.Node node2 = new AbstractBinarySearchTree.Node(3, null, null, null);
		AbstractBinarySearchTree.Node node3 = new AbstractBinarySearchTree.Node(4, null, null, null);
		node2.parent = node;
		node1.left = node2;
		node.right = node1;
		node.left = node3;
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		assertNotNull(scapegoatTree.delete(node));;
		
	}
	
	@Test
	public void test12() {
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		scapegoatTree.root = node;
		
		scapegoatTree.printTreeInOrder();

		ScapegoatTree scapegoatTree1 = new ScapegoatTree();
		
		scapegoatTree1.printTreePreOrder();
		scapegoatTree1.root = node;
		scapegoatTree1.printTreePreOrder();
		
		ScapegoatTree scapegoatTree2 = new ScapegoatTree();
//		scapegoatTree1.root = node;
		
		scapegoatTree2.printTreePostOrder();
		scapegoatTree2.root = node;
		scapegoatTree2.printTreePostOrder();
		
	}
	
	@Test
	public void test13() throws Exception {
		Class<ScapegoatTree> class1 = ScapegoatTree.class;
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		Method method = class1.getDeclaredMethod("getSibling",AbstractBinarySearchTree.Node.class);
		method.setAccessible(true);
		assertNull(method.invoke(scapegoatTree, node));
		
	}

	@Test
	public synchronized void test14() {
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		AbstractBinarySearchTree.Node node = null;
		scapegoatTree.delete(node);
	}
	
}
