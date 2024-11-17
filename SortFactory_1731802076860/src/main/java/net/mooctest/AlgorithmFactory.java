package net.mooctest;

public class AlgorithmFactory {
    public Algorithm getAlgorithm(String name) {
        switch (name.toLowerCase()) {
            case "quicksort":
                return new OptimizedQuickSort();
            case "bubblesort":
                return new BubbleSort();
            case "parallelmergesort":
                return new ParallelMergeSort(4); // The default concurrency is 4
            default:
                throw new AlgorithmNotFoundException("Algorithm not found: " + name);
        }
    }
}
