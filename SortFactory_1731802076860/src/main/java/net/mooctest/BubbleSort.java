package net.mooctest;

public class BubbleSort implements Algorithm {
    private int comparisons = 0;
    private int swaps = 0;

    @Override
    public void sort(DataStructure data) {
        comparisons = 0;
        swaps = 0;
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = 0; j < data.size() - i - 1; j++) {
                comparisons++;
                if (data.get(j) > data.get(j + 1)) {
                    swaps++;
                    swap(data, j, j + 1);
                }
            }
        }
    }

    public void swap(DataStructure data, int i, int j) {
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
    }

    @Override
    public int search(DataStructure data, int target) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }

    @Override
    public AlgorithmPerformance evaluatePerformance(DataStructure data) {
        long startTime = System.nanoTime();
        sort(data);
        long endTime = System.nanoTime();
        long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        return new AlgorithmPerformance(endTime - startTime, comparisons, swaps, memoryUsed, 1);
    }
}
