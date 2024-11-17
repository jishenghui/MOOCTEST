package net.mooctest;

public class LinkedListDataStructure implements DataStructure {
	public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedListDataStructure() {
        head = null;
        size = 0;
    }

    @Override
    public int[] toArray() {
        int[] array = new int[size];
        Node current = head;
        int i = 0;
        while (current != null) {
            array[i++] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    public void fromArray(int[] data) {
        head = null;
        size = 0;
        for (int value : data) {
            add(value);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public int get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void set(int index, int value) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }
}
