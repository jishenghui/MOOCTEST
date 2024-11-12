package net.mooctest;

import java.util.ArrayList;
import java.util.List;

/** BJTree (skeletal) implementation.
*
* MODIFY THE FOLLOWING CLASS.
*
* You are free to make whatever changes you like or to create additional
* classes and files, but avoid reusing/modifying the other files given in this
* folder.
*/
public class BJTree<Key extends Comparable<Key>, Value> {

	// Parameters used to determine when to rebalance (see Lecture 13 slides)
	
	private final float ALPHA = 0.66667f; // maximum allowed balance ratio
	private final float BETA = 0.25f; // max ratio filter for exemption
	
	// --------------------------------------------------
	// PUBLIC NODE CLASS
	// --------------------------------------------------
	
	public abstract class Node {
		Key key;
		float weight;
		float maxWeight;
		
		abstract Value find(Key x);
		abstract Node insert(Key x, Value v, float w) throws Exception;
		abstract Node delete(Key x) throws Exception;
		abstract ArrayList<String> getPreorderList(ArrayList<String> arr);
		abstract Value getMin();
		abstract Value getMax();
		abstract Value findDown(Key x);
		abstract Value findUp(Key x);
		abstract Node rebuild(Key x);
		abstract Node buildTree(List<Node> list);
		abstract ArrayList<Node> getExternalNodes(ArrayList<Node> arr);
	}
	
	// --------------------------------------------------
	// INTERNAL NODE CLASS 
	// --------------------------------------------------
	
	public class InternalNode extends Node {
		Node left;
		Node right;
		
		InternalNode(Key key, Node left, Node right) {
			this.key = key;
			this.left = left;
			this.right = right;
			this.weight = this.left.weight + this.right.weight;
			this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
		}
		
		Value find(Key x) {
			if (x.compareTo(this.key) >= 0) {
				return this.right.find(x);
			} else { 		// compare < 0 
				return this.left.find(x);
			}
		}
		
		private boolean balance() {
			float bal = Math.max(this.left.weight, this.right.weight) / this.weight;
			if (bal <= ALPHA) {
				return true;
			} else {
				return false;
			}
		}
		
		private boolean maxR() {
			float maxRat = this.maxWeight / this.weight;
			if (maxRat > BETA) {
				return true;
			} else {
				return false;
			}
		}
		
		Node rebuild(Key x) {
			if (!this.balance() && !this.maxR()) {
				ArrayList<Node> nodes = new ArrayList<>();
				nodes = this.getExternalNodes(nodes);
				return this.buildTree(nodes);
			} else {
				int compare = x.compareTo(this.key);
				if (compare >= 0) {
					this.right = this.right.rebuild(x);
				} else { 		// compare < 0 
					this.left = this.left.rebuild(x);
				}
			}
			return this;
		}
		
		Node buildTree(List<Node> nodes) {
			//System.out.println(nodes.size());
			int k = nodes.size();
			//if (k == 0) {
			//	return null;
			//}
			if (k == 1) {
				return nodes.get(0);
			}
			float totalWeight = 0;
			for (int i = 0; i < k; i++) {
				totalWeight += nodes.get(i).weight;
			}
			int b = 0;
			float lWt = 0;
			float rWt = totalWeight;
			float deltaMin = totalWeight;
			
			for (int i = 0; i < k; i++) {
				lWt += nodes.get(i).weight; 
				rWt -= nodes.get(i).weight;
				float delta = Math.abs(rWt-lWt);
				if (delta < deltaMin) {
					b = i + 1;
					deltaMin = delta;
				}
			}
			//System.out.println("b:" + b + " k:" + k);
			
			Node L = this.buildTree(nodes.subList(0, b));
			Node R = this.buildTree(nodes.subList(b, k));
			
			return new InternalNode(nodes.get(b).key, L, R);
		}
		
		ArrayList<Node> getExternalNodes(ArrayList<Node> arr) {
			arr = this.left.getExternalNodes(arr);
			arr = this.right.getExternalNodes(arr);
			return arr;
		}
		
		Node insert(Key x, Value v, float w) throws Exception {
			if (x.compareTo(this.key) < 0) {
				this.left = this.left.insert(x, v, w);
			} else { // compare >= 0
				this.right = this.right.insert(x, v, w);
			}
			
			// Update the weights and max weights and the tree traverses back from the recursion
			this.weight = this.left.weight + this.right.weight;
			this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
			
			return this;
		}
		
		Node delete(Key x) throws Exception {
			Node filler;
			
			if (x.compareTo(this.key) >= 0) {
				filler = this.right.delete(x);
				if (filler == null) {
					return this.left;
				} else {
					this.right = filler;
					this.weight = this.left.weight + this.right.weight;
					this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
					return this;
				}
			} else {
				filler = this.left.delete(x);
				if (filler == null) {
					return this.right;
				} else {
					this.left = filler;
					this.weight = this.left.weight + this.right.weight;
					this.maxWeight = Math.max(this.left.maxWeight, this.right.maxWeight);
					return this;
				}
			}
		}
		
		ArrayList<String> getPreorderList(ArrayList<String> arr) {
			arr.add("(" + this.key.toString() + ") wt: " + this.weight);
			arr = this.left.getPreorderList(arr);
			arr = this.right.getPreorderList(arr);
			return arr;
		}
		
		Value getMin() { 
			return this.left.getMin();
		}
		
		Value getMax() {
			return this.right.getMax();
		}
		
		Value findDown(Key x) {
			if (x.compareTo(this.key) < 0) { // x goes in left subtree
				return this.left.findDown(x);
			} else { // x goes in right subtree
				Value v = this.right.findDown(x);
				if (v == null) {
					return this.left.getMax();
				} else {
					return v;
				}
			}
		}
		
		Value findUp(Key x) {
			if (x.compareTo(this.key) < 0) { // x goes in left subtree
				Value v = this.left.findUp(x);
				if (v == null) {
					return this.right.getMin();
				} else {
					return v;
				}
			} else { // x goes in right subtree
				return this.right.findUp(x);
			}
		}
		
	}
	
	public class ExternalNode extends Node {
		Value value;
		
		ExternalNode(Key key, Value value, float w) {
			this.key = key;
			this.value = value;
			this.weight = w;
			this.maxWeight = w;
		}
		
		Value find(Key x) {
			if (x.compareTo(this.key) == 0) {
				return this.value;
			} else {
				return null;
			}
		}
		
		Node rebuild(Key x) {
			return this;
		}
		
		Node buildTree(List<Node> nodes) {
			return nodes.get(0);
		}
		
		Node insert(Key x, Value v, float w) throws Exception {
			if (x.compareTo(this.key) == 0) {
				throw new Exception("Duplicate Key!");
			} else {
				Node q = new ExternalNode(x,v, w);
				if (x.compareTo(this.key) < 0) {
					return new InternalNode(this.key, q, this);
				} else { // compare > 0
					return new InternalNode(x, this, q);
				}
			}
		}
	
		Node delete(Key x) throws Exception {
			if (x.compareTo(this.key) == 0) { // found the key!
				return null;
			} else { // fell out of the tree?
				throw new Exception("Deleting non-existent key");
			}
		}
		
		ArrayList<String> getPreorderList(ArrayList<String> arr) {
			arr.add("[" + this.key.toString() + " " + this.value.toString() + "] wt: " + this.weight);
			return arr;
		}
		
		ArrayList<Node> getExternalNodes(ArrayList<Node> arr) {
			arr.add(this);
			return arr;
		}
		
		Value getMin() {
			return this.value;
		}
		
		Value getMax() {
			return this.value;
		}
		
		Value findDown(Key x) {
			if (x.compareTo(this.key) >= 0) {
				return this.value;
			} else {
				return null;
			}
		}
		
		Value findUp(Key x) {
			if (x.compareTo(this.key) <= 0) {
				return this.value;
			} else {
				return null;
			}
		}
	}
	
	// --------------------------------------------------
	// PUBLIC BJTree FUNCTIONS
	// --------------------------------------------------
	
	private Node root;
	
	public BJTree() {
		this.root = null;
	}
	
	public Value find(Key x) {
		if (this.root == null) {
			return null;
		} else {
			return this.root.find(x);
		}
	}
	
	public void insert(Key x, Value v, float w) throws Exception {
		if (this.root == null) {
			this.root = new ExternalNode(x, v, w);
		} else {
			this.root = this.root.insert(x, v, w);
		}
		this.root = this.root.rebuild(x);
	}
	
	
	public void delete(Key x) throws Exception {
		if (this.root == null) {
			return;
		} else {
			this.root = this.root.delete(x);
		}
		if (this.root != null) {
			this.root = this.root.rebuild(x);
		}
	}
	
	public void clear() {
		this.root = null;
	}
	
	public ArrayList<String> getPreorderList() {
		ArrayList<String> array = new ArrayList<>();
		if (this.root == null) {
			return array;
		} else {
			return this.root.getPreorderList(array);
		}
	}
	
	public Value getMin() {
		if (this.root == null) {
			return null;
		} else {
			return this.root.getMin();
		}
	}
	
	public Value getMax() {
		if (this.root == null) {
			return null;
		} else {
			return this.root.getMax();
		}
	}
	
	public Value findDown(Key x)  {
		if (this.root == null) {
			return null;
		} else {
			return this.root.findDown(x);
		}
	}
	
	public Value findUp(Key x)  {
		if (this.root == null) {
			return null;
		} else {
			return this.root.findUp(x);
		}
	}
	
}
