package net.mooctest;

import java.util.*;

public class IterativeDeepeningSearch extends SearchAlgorithm {

    private int maxDepth;

    public IterativeDeepeningSearch(Graph graph, Node startNode, Node endNode, Vehicle vehicle,
                                    TrafficCondition trafficCondition, WeatherCondition weatherCondition, int currentTime, int maxDepth) {
        super(graph, startNode, endNode, vehicle, trafficCondition, weatherCondition, currentTime);
        this.maxDepth = maxDepth;
    }

    @Override
    public PathResult findPath() {
        for (int depth = 0; depth <= maxDepth; depth++) {
            PathResult result = depthLimitedSearch(startNode, endNode, depth, new HashSet<>());
            if (result != null) {
                return result;
            }
        }
        return null; // No feasible path found
    }

    public PathResult depthLimitedSearch(Node current, Node goal, int depth, Set<Node> visited) {
        if (depth == 0 && current.equals(goal)) {
            return new PathResult(Collections.singletonList(current));
        }
        if (depth > 0) {
            visited.add(current);
            for (Edge edge : current.getNeighbors()) {
                Node neighbor = edge.getNeighbor();
                if (!visited.contains(neighbor)) {
                    PathResult result = depthLimitedSearch(neighbor, goal, depth - 1, visited);
                    if (result != null) {
                        List<Node> path = new ArrayList<>(result.getPath());
                        path.add(0, current);
                        return new PathResult(path);
                    }
                }
            }
            visited.remove(current);
        }
        return null;
    }
}

