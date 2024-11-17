package net.mooctest;

import java.util.PriorityQueue;

public class HeapDataStructure implements DataStructure {
    private PriorityQueue<Integer> heap;

    public HeapDataStructure() {
        heap = new PriorityQueue<>(); // Default minimum heap
    }

    @Override
    public int[] toArray() {
        Object[] tempArray = heap.toArray();
        int[] result = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            result[i] = (int) tempArray[i];
        }
        return result;
    }

    @Override
    public void fromArray(int[] data) {
        heap.clear();
        for (int value : data) {
            heap.add(value);
        }
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public void add(int value) {
        heap.add(value);
    }

    @Override
    public int get(int index) {
        throw new UnsupportedOperationException("Heap does not support random access");
    }

    @Override
    public void set(int index, int value) {
        throw new UnsupportedOperationException("Heap does not support setting specific elements");
    }
}
