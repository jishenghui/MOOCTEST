package net.mooctest;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmManager {
    protected List<Algorithm> algorithms = new ArrayList<>();

    public void addAlgorithm(Algorithm algo) {
        algorithms.add(algo);
    }

    public Algorithm getAlgorithm(String name) {
        for (Algorithm algo : algorithms) {
            if (algo.getName().equalsIgnoreCase(name)) {
                return algo;
            }
        }
        return null;
    }

    public void sortData(String algoName, DataStructure data) throws Exception {
        Algorithm algo = getAlgorithm(algoName);
        if (algo == null) {
            throw new AlgorithmNotFoundException("Algorithm not found: " + algoName);
        }
        algo.sort(data);
    }

    public int searchData(String algoName, DataStructure data, int target) throws Exception {
        Algorithm algo = getAlgorithm(algoName);
        if (algo == null) {
            throw new AlgorithmNotFoundException("Algorithm not found: " + algoName);
        }
        return algo.search(data, target);
    }
}
