package net.mooctest;

public interface Algorithm {
    void sort(DataStructure data);
    int search(DataStructure data, int target);
    String getName();
    AlgorithmPerformance evaluatePerformance(DataStructure data);
}
