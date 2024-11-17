package net.mooctest;

import java.util.Arrays;

public class ArrayDataStructure implements DataStructure {
    private int[] array;
    private int size;

    public ArrayDataStructure(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    @Override
    public int[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public void fromArray(int[] data) {
        array = Arrays.copyOf(data, data.length);
        size = data.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int value) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = value;
    }

    @Override
    public int get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }

    @Override
    public void set(int index, int value) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        array[index] = value;
    }
}
