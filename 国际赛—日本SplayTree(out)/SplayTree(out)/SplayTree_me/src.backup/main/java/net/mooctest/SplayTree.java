package net.mooctest;

import java.util.Arrays;

public class SplayTree <T extends Comparable<T>> {
	SplaySubTree<T> root;
	
	public SplayTree(){
		root = new SplaySubTree<T>(null);
	}
	
	/**
	 * @param index - of the node to search for.
	 * @return  - null if index<=0 or index>=size otherwise SubTree at index. 
	 */
	public T get(long index) {
		SplaySubTree<T> cT = root.get(index);
		if(cT==null)return null;
		cT.splay();
		root = cT;
		return cT.getData();
	}
	
	/**
	 * @return - the number of nodes in the tree.
	 */
	public long size() { return root.size();}

	/**
	 * @param node - to search for.
	 * @return - the index of node. All nodes are ordered according to the compareTo(T) method.
	 *         
	 */
	public long indexOf(T node) {
		long index = root.indexOf(node);
		get(index);
		return index;
	}
	
	/**
	 * @param node - is added to the tree.
	 *             If node is null tree is unchanged.
	 */
	public void add(T node) {
		root = root.add(node);
	}
	
	/**
	 * @param node - is removed from the tree.
	 *             If node is null tree is unchanged.
	 */
	public void remove(T node) {
		root = root.remove(node);
	}
	
	/**
	 * @param node
	 * @return
	 */
	public boolean contains(T node) {
		SplaySubTree<T> temp = root.find(node);
		if(temp!=null){
			temp.splay();
			root = temp;
		}
		return temp != null;
	}
	
	@Override
	public String toString(){
		return root.toString();
	}

	public static void main(String[] args) {
		SplayTree<Integer> test = new SplayTree<Integer>();
		int howmanynumbers = 10000;
		for (int i = 0; i < howmanynumbers; i++) {
			int val = (int)(Math.random()*100);
//			System.out.print(val + " ");
//			System.out.println("size=" + test.size());
			test.add(val);
		}
//		System.out.println();
		
//		test.add(2);
//		test.add(3);
//		test.add(1);
//		test.add(5);
		
		//Hello World
		
		System.out.println(test.size());
		//System.out.println(test);
	}
}
