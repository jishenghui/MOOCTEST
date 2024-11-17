package net.mooctest;

import java.util.concurrent.*;

public class MultiThreadedSearch {
    private ThreadPoolExecutor executor;

    public MultiThreadedSearch(int threadCount) {
        // Use ThreadPoolExecutor instead of ExecutorService
        executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(threadCount);
    }

    public int parallelSearch(int[] data, int target) throws InterruptedException, ExecutionException {
        int partitionSize = data.length / executor.getPoolSize(); // Fixed to getPoolSize() to obtain thread pool size
        Future<Integer>[] futures = new Future[executor.getPoolSize()];

        for (int i = 0; i < executor.getPoolSize(); i++) {
            final int start = i * partitionSize;
            final int end = (i == executor.getPoolSize() - 1) ? data.length : start + partitionSize;
            futures[i] = executor.submit(() -> linearSearch(data, target, start, end));
        }

        // Check the results of each partition
        for (Future<Integer> future : futures) {
            int result = future.get();
            if (result != -1) {
                return result;
            }
        }
        return -1; // If all partitions cannot find the target, return -1
    }

    public int linearSearch(int[] data, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public void shutdown() {
        executor.shutdown(); // Normal shutdown of thread pool
    }
}
