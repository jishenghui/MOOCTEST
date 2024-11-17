package net.mooctest;

import java.util.HashMap;
import java.util.Map;

public class PerformanceTracker {
    private Map<String, AlgorithmPerformance> performanceMap = new HashMap<>();

    public void trackPerformance(String algoName, AlgorithmPerformance performance) {
        performanceMap.put(algoName, performance);
    }

    public AlgorithmPerformance getBestPerformance() {
        return performanceMap.values().stream()
                .min((p1, p2) -> Long.compare(p1.getTimeTaken(), p2.getTimeTaken()))
                .orElse(null);
    }

    public void generateReport() {
        System.out.println("Algorithm Performance Report:");
        for (String algoName : performanceMap.keySet()) {
            System.out.println("Algorithm: " + algoName);
            performanceMap.get(algoName).report();
        }
    }
}
