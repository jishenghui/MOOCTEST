package net.mooctest;

import java.util.*;

public class BellmanFord extends SearchAlgorithm {

    public BellmanFord(Graph graph, Node startNode, Node endNode, Vehicle vehicle,
                       TrafficCondition trafficCondition, WeatherCondition weatherCondition, int currentTime) {
        super(graph, startNode, endNode, vehicle, trafficCondition, weatherCondition, currentTime);
    }

    @Override
    public PathResult findPath() {
        Map<Node, Double> distances = new HashMap<>();
        Map<Node, Node> predecessors = new HashMap<>();

        for (Node node : graph.getNodes().values()) {
            distances.put(node, Double.MAX_VALUE);
        }
        distances.put(startNode, 0.0);

        int V = graph.getNodes().size();
        for (int i = 1; i <= V - 1; i++) {
            for (Node currentNode : graph.getNodes().values()) {
                for (Edge edge : currentNode.getNeighbors()) {
                    Node neighbor = edge.getNeighbor();
                    double originalDistance = edge.getDistance();
                    double adjustedDistance = trafficCondition.adjustWeight(originalDistance, neighbor.getNodeId());
                    adjustedDistance = weatherCondition.adjustWeightForWeather(adjustedDistance, neighbor);

                    if (distances.get(currentNode) != Double.MAX_VALUE && distances.get(currentNode) + adjustedDistance < distances.get(neighbor)) {
                        distances.put(neighbor, distances.get(currentNode) + adjustedDistance);
                        predecessors.put(neighbor, currentNode);
                    }
                }
            }
        }

        for (Node currentNode : graph.getNodes().values()) {
            for (Edge edge : currentNode.getNeighbors()) {
                Node neighbor = edge.getNeighbor();
                double originalDistance = edge.getDistance();
                double adjustedDistance = trafficCondition.adjustWeight(originalDistance, neighbor.getNodeId());
                adjustedDistance = weatherCondition.adjustWeightForWeather(adjustedDistance, neighbor);

                if (distances.get(currentNode) != Double.MAX_VALUE && distances.get(currentNode) + adjustedDistance < distances.get(neighbor)) {
                    System.out.println("Graph contains negative weight cycle");
                    return null;
                }
            }
        }

        return reconstructPath(predecessors);
    }

    public PathResult reconstructPath(Map<Node, Node> predecessors) {
        List<Node> path = new ArrayList<>();
        Node current = endNode;

        while (current != null) {
            path.add(current);
            current = predecessors.get(current);
        }
        Collections.reverse(path);
        return new PathResult(path);
    }
}

