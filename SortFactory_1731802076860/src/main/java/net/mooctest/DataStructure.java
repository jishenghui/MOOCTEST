package net.mooctest;

public interface DataStructure {
    int[] toArray();
    void fromArray(int[] data);
    int size();
    void add(int value);
    int get(int index);
    void set(int index, int value);
}
