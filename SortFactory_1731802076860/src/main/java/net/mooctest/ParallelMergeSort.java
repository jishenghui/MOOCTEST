package net.mooctest;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class ParallelMergeSort implements Algorithm {
    private int comparisons = 0;
    private ForkJoinPool forkJoinPool;

    public ParallelMergeSort(int parallelism) {
        forkJoinPool = new ForkJoinPool(parallelism);
    }

    @Override
    public void sort(DataStructure data) {
        comparisons = 0;
        forkJoinPool.invoke(new MergeSortTask(data, 0, data.size() - 1));
    }

    public class MergeSortTask extends RecursiveAction {
        private DataStructure data;
        private int low, high;

        public MergeSortTask(DataStructure data, int low, int high) {
            this.data = data;
            this.low = low;
            this.high = high;
        }

        @Override
        protected void compute() {
            if (low < high) {
                int mid = (low + high) / 2;
                MergeSortTask leftTask = new MergeSortTask(data, low, mid);
                MergeSortTask rightTask = new MergeSortTask(data, mid + 1, high);
                invokeAll(leftTask, rightTask);
                merge(data, low, mid, high);
            }
        }

        public void merge(DataStructure data, int low, int mid, int high) {
            int[] left = new int[mid - low + 1];
            int[] right = new int[high - mid];
            for (int i = 0; i < left.length; i++) {
                left[i] = data.get(low + i);
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = data.get(mid + 1 + i);
            }

            int i = 0, j = 0, k = low;
            while (i < left.length && j < right.length) {
                comparisons++;
                if (left[i] <= right[j]) {
                    data.set(k++, left[i++]);
                } else {
                    data.set(k++, right[j++]);
                }
            }

            while (i < left.length) {
                data.set(k++, left[i++]);
            }

            while (j < right.length) {
                data.set(k++, right[j++]);
            }
        }
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
        return "Parallel Merge Sort";
    }

    @Override
    public AlgorithmPerformance evaluatePerformance(DataStructure data) {
        long startTime = System.nanoTime();
        sort(data);
        long endTime = System.nanoTime();
        long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        return new AlgorithmPerformance(endTime - startTime, comparisons, 0, memoryUsed, forkJoinPool.getParallelism());
    }
}
