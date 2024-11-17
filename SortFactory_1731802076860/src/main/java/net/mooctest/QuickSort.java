package net.mooctest;

public class QuickSort implements Algorithm {
    private int comparisons = 0;
    private int swaps = 0;

    @Override
    public void sort(DataStructure data) {
        comparisons = 0;
        swaps = 0;
        quickSort(data, 0, data.size() - 1);
    }

    public void quickSort(DataStructure data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    public int partition(DataStructure data, int low, int high) {
        int pivot = data.get(high);
        int i = low - 1; // I is the index of the last element less than pivot
        for (int j = low; j < high; j++) {
            comparisons++;
            if (data.get(j) < pivot) {
                i++;
                swap(data, i, j);
            }
        }
        swap(data, i + 1, high);
        return i + 1;
    }

    public void swap(DataStructure data, int i, int j) {
        int temp = data.get(i);
        data.set(i, data.get(j));
        data.set(j, temp);
        swaps++;
    }

    @Override
    public int search(DataStructure data, int target) {
        return binarySearch(data, 0, data.size() - 1, target);
    }

    public int binarySearch(DataStructure data, int low, int high, int target) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (data.get(mid) == target) {
                return mid;
            }
            if (data.get(mid) > target) {
                return binarySearch(data, low, mid - 1, target);
            }
            return binarySearch(data, mid + 1, high, target);
        }
        return -1;
    }

    @Override
    public String getName() {
        return "Quick Sort";
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
