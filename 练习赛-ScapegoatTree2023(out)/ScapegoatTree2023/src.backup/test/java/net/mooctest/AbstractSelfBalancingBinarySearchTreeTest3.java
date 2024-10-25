package net.mooctest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
//author:TheOnlyman
public class AbstractSelfBalancingBinarySearchTreeTest3 {

	AbstractSelfBalancingBinarySearchTree abt;
	AbstractBinarySearchTree.Node node;
	@Before
	public void setUp() {
		abt = new AbstractSelfBalancingBinarySearchTree() {
			@Override
			protected Node createNode(int value, Node parent, Node left, Node right) {
				return new Node(value,parent,left,right);
			}
		};
		node = null;
	}

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
	public void test0() {

	}

	@Test
	public void randomTest() {
		int n = 100;
		Random rnd = new Random(998244353);
		for(int i=1;i<=10;i++) {
			Random random = new Random(rnd.nextInt(100));
			for (int j=1;j<=1000;j++) {
				node = abt.insert(random.nextInt(n));
				try {
					abt.rotateLeft(abt.root);
				} catch (Exception e) {
				}
				try {
					abt.rotateLeft(abt.root.left);
				} catch (Exception e) {
				}
				try {
					abt.rotateLeft(abt.root.right);
				} catch (Exception e) {
				}
				try {
					abt.rotateRight(abt.root);
				} catch (Exception e) {
				}
			}
			abt.root.isLeaf();
			for (int j=1;j<=1000;j++) {
				abt.search(random.nextInt(n));
				abt.delete(random.nextInt(n));
				try {
					abt.rotateLeft(abt.root);
				} catch (Exception e) {
				}
				try {
					abt.rotateLeft(abt.root.left);
				} catch (Exception e) {
				}
				try {
					abt.rotateLeft(abt.root.right);
				} catch (Exception e) {
				}
				try {
					abt.rotateRight(abt.root);
				} catch (Exception e) {
				}
			}
		}
	}

	@Test(timeout=10000)
	public void test1() {
		for(int i=1;i<=10;++i) {
			ScapegoatTree scapegoatTree0 = new ScapegoatTree();
			ScapegoatTree.Node [] nod = new ScapegoatTree.Node[105];
			for(int j=1;j<=100;++j) {
				nod[j]=scapegoatTree0.createNode(j%17, null, null, null);
				scapegoatTree0.createNode(j%13, nod[j], null, null);
				scapegoatTree0.insert(j%7);
				scapegoatTree0.delete(j%11);
				try {

					if(scapegoatTree0.contains(j)) {}
				}catch(Exception e) {

				}
			}
			try {
				int szz=scapegoatTree0.size;
				int mxx=scapegoatTree0.getMaximum();
				int mii=scapegoatTree0.getMinimum();
			}catch(Exception e) {

			}
			for(int j=5;j<=100;++j) {
				if(scapegoatTree0.root==nod[j]) {}
				if(nod[j].parent==null) {
					int f=j%4+1;
					if(nod[f].left==null) {
						nod[f].left=nod[j];
						nod[j].parent=nod[f];
					}else if(nod[f].right==null) {
						nod[f].right=nod[j];
						nod[j].parent=nod[f];
					}
					if(nod[j].isLeaf()) {
					}
				}
				scapegoatTree0.printTree();
				scapegoatTree0.printTreeInOrder();
				scapegoatTree0.printTreePostOrder();
				scapegoatTree0.printTreePreOrder();
			}
			try {
				for(int j=1;j<=10;++j) {
					scapegoatTree0.printSubtree(nod[j]);
				}
			}catch(Exception e2) {

			}
		}
	}
	@Test(timeout=10000)
	public void test3() {
		for(int i=1;i<=10;++i) {
			ScapegoatTree scapegoatTree0 = new ScapegoatTree();
			for(int j=1;j<=1000;++j) {
				scapegoatTree0.insert(j%7);
				scapegoatTree0.delete(j%11);
				try {
					if(scapegoatTree0.contains(j)) {}
				}catch(Exception e) {

				}
			}
			try {
				int szz=scapegoatTree0.size;
				int mxx=scapegoatTree0.getMaximum();
				int mii=scapegoatTree0.getMinimum();
			}catch(Exception e) {

			}
			for(int j=1;j<=1000;++j) {
				try {
					scapegoatTree0.contains(j);
					scapegoatTree0.getSuccessor(j);
					scapegoatTree0.delete(j);
				}catch(Exception e) {

				}
			}
		}
	}

}
