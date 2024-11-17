package net.mooctest;

public class BSTDataStructure implements DataStructure {
	public class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private Node root;
    private int size;

    public BSTDataStructure() {
        root = null;
        size = 0;
    }

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.data) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = addRecursive(current.right, value);
        }
        return current;
    }

    @Override
    public void add(int value) {
        root = addRecursive(root, value);
        size++;
    }

    @Override
    public int get(int index) {
        throw new UnsupportedOperationException("BST does not support index-based access");
    }

    @Override
    public void set(int index, int value) {
        throw new UnsupportedOperationException("BST does not support index-based modification");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        inorderToArray(root, result, new int[]{0});
        return result;
    }

    public void inorderToArray(Node node, int[] result, int[] index) {
        if (node != null) {
            inorderToArray(node.left, result, index);
            result[index[0]++] = node.data;
            inorderToArray(node.right, result, index);
        }
    }

    @Override
    public void fromArray(int[] data) {
        root = null;
        size = 0;
        for (int value : data) {
            add(value);
        }
    }
}
