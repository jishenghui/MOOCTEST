package net.mooctest;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentAlgorithmManager extends AlgorithmManager {
    private ExecutorService threadPool;
    private ReentrantLock lock = new ReentrantLock();

    public ConcurrentAlgorithmManager(int threadCount) {
        threadPool = Executors.newFixedThreadPool(threadCount);
    }

    public Future<AlgorithmPerformance> parallelSort(String algoName, DataStructure data) throws Exception {
        Algorithm algo = getAlgorithm(algoName);
        if (algo == null) {
            throw new AlgorithmNotFoundException("Algorithm not found: " + algoName);
        }
        return threadPool.submit(() -> {
            lock.lock();
            try {
                return algo.evaluatePerformance(data);
            } finally {
                lock.unlock();
            }
        });
    }

    public Future<Integer> parallelSearch(String algoName, DataStructure data, int target) throws Exception {
        Algorithm algo = getAlgorithm(algoName);
        if (algo == null) {
            throw new AlgorithmNotFoundException("Algorithm not found: " + algoName);
        }
        return threadPool.submit(() -> {
            lock.lock();
            try {
                return algo.search(data, target);
            } finally {
                lock.unlock();
            }
        });
    }

    public void shutdown() {
        threadPool.shutdown();
    }
}
