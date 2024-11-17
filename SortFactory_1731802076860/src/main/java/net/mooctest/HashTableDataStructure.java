package net.mooctest;

import java.util.HashMap;

public class HashTableDataStructure implements DataStructure {
    private HashMap<Integer, Integer> hashTable;

    public HashTableDataStructure() {
        hashTable = new HashMap<>();
    }

    @Override
    public int[] toArray() {
        int[] array = new int[hashTable.size()];
        int index = 0;
        for (int key : hashTable.keySet()) {
            array[index++] = hashTable.get(key);
        }
        return array;
    }

    @Override
    public void fromArray(int[] data) {
        hashTable.clear();
        for (int i = 0; i < data.length; i++) {
            hashTable.put(i, data[i]);
        }
    }

    @Override
    public int size() {
        return hashTable.size();
    }

    @Override
    public void add(int value) {
        hashTable.put(hashTable.size(), value);
    }

    @Override
    public int get(int index) {
        return hashTable.get(index);
    }

    @Override
    public void set(int index, int value) {
        hashTable.put(index, value);
    }
}
