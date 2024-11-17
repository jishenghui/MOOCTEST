package net.mooctest;

public class OptimizedQuickSort implements Algorithm {
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
            if (high - low <= 10) {
                // Optimizing insertion sort for small-scale arrays
                insertionSort(data, low, high);
            } else {
                int pi = partition(data, low, high);
                quickSort(data, low, pi - 1);
                quickSort(data, pi + 1, high);
            }
        }
    }

    public void insertionSort(DataStructure data, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = data.get(i);
            int j = i - 1;
            while (j >= low && data.get(j) > key) {
                comparisons++;
                data.set(j + 1, data.get(j));
                j--;
            }
            swaps++;
            data.set(j + 1, key);
        }
    }

    public int partition(DataStructure data, int low, int high) {
        int pivot = medianOfThree(data, low, high);
        int i = low - 1;
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

    public int medianOfThree(DataStructure data, int low, int high) {
        int mid = low + (high - low) / 2;
        if (data.get(low) > data.get(mid)) {
            swap(data, low, mid);
        }
        if (data.get(low) > data.get(high)) {
            swap(data, low, high);
        }
        if (data.get(mid) > data.get(high)) {
            swap(data, mid, high);
        }
        swap(data, mid, high - 1);
        return data.get(high - 1);
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
        return "Optimized Quick Sort";
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
