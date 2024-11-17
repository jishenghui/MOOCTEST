package net.mooctest;

public class AlgorithmPerformance {
    private long timeTaken;
    private int comparisons;
    private int swaps;
    private long memoryUsed;
    private int threadCount;

    public AlgorithmPerformance(long timeTaken, int comparisons, int swaps, long memoryUsed, int threadCount) {
        this.timeTaken = timeTaken;
        this.comparisons = comparisons;
        this.swaps = swaps;
        this.memoryUsed = memoryUsed;
        this.threadCount = threadCount;
    }

    public long getTimeTaken() {
        return timeTaken;
    }

    public int getComparisons() {
        return comparisons;
    }

    public int getSwaps() {
        return swaps;
    }

    public long getMemoryUsed() {
        return memoryUsed;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public void report() {
        System.out.println("Performance Report:");
        System.out.println("Time taken: " + timeTaken + " ns");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Memory used: " + memoryUsed + " bytes");
        System.out.println("Thread count: " + threadCount);
    }
}
