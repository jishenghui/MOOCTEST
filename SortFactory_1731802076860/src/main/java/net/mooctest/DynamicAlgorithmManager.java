package net.mooctest;

public class DynamicAlgorithmManager extends AlgorithmManager {
    private PerformanceTracker performanceTracker;

    public DynamicAlgorithmManager(PerformanceTracker performanceTracker) {
        this.performanceTracker = performanceTracker;
    }

    public void autoSelectAndSort(DataStructure data) throws Exception {
        String optimalAlgo = selectOptimalAlgorithm(data);
        System.out.println("Optimal algorithm selected: " + optimalAlgo);
        sortData(optimalAlgo, data);
    }

    public String selectOptimalAlgorithm(DataStructure data) {
        if (isSorted(data)) {
            return "InsertionSort";
        } else if (data.size() > 1000) {
            return "ParallelMergeSort";
        } else {
            return "OptimizedQuickSort";
        }
    }

    public boolean isSorted(DataStructure data) {
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i - 1) > data.get(i)) {
                return false;
            }
        }
        return true;
    }
}
