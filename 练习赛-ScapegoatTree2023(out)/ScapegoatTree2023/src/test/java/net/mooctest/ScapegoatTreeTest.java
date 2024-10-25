package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
//author:TheOnlyman
public class ScapegoatTreeTest {

	@Test
	public void test1() {
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		for(int i=0;i < 10;i++) {
			scapegoatTree.insert(i);
		}
		for(int i = 0;i < 10;i++) {
			scapegoatTree.delete(i);
		}
		for(int i=10;i >= 0;i--) {
			scapegoatTree.insert(i);
		}
//		for(int i = 0;i < 10;i++) {
//			scapegoatTree.delete(i);
//		}
		scapegoatTree.printTree();
		scapegoatTree.printTreeInOrder();
		scapegoatTree.printTreePostOrder();
		scapegoatTree.printTreePreOrder();
		
		
//		
	}
	
	@Test
	public void test2() {
		ScapegoatTree scapegoatTree = new ScapegoatTree(0);
		AbstractBinarySearchTree.Node node = new AbstractBinarySearchTree.Node(null, null, null, null);
		AbstractBinarySearchTree.Node node1 = null;
		scapegoatTree.findScapegoatNode(node);
		scapegoatTree.getNodeHeight(node1);
		scapegoatTree.printSubtree(node);
		
				
	}
	
	@Test
	public void test3() {
		ScapegoatTree scapegoatTree = new ScapegoatTree();
		Class<ScapegoatTree> class1 = ScapegoatTree.class;
		AbstractBinarySearchTree.Node node1 = new AbstractBinarySearchTree.Node(null,null,null,null);
		try {
			Method method = class1.getDeclaredMethod("getSibling", AbstractBinarySearchTree.Node.class);
			method.setAccessible(true);
			method.invoke(scapegoatTree, node1);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
