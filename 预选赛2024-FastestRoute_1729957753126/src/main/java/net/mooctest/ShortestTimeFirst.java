package net.mooctest;

import java.util.*;

public class ShortestTimeFirst extends SearchAlgorithm {

    public ShortestTimeFirst(Graph graph, Node startNode, Node endNode, Vehicle vehicle,
                             TrafficCondition trafficCondition, WeatherCondition weatherCondition, int currentTime) {
        super(graph, startNode, endNode, vehicle, trafficCondition, weatherCondition, currentTime);
    }

    @Override
    public PathResult findPath() {
        PriorityQueue<PathNode> pq = new PriorityQueue<>(Comparator.comparingDouble(PathNode::getDistance));
        Map<Node, Double> distances = new HashMap<>();
        Map<Node, Node> predecessors = new HashMap<>();
        Map<Node, Integer> nodeVisitTimes = new HashMap<>(); // Node visit time

        pq.add(new PathNode(startNode, 0));
        distances.put(startNode, 0.0);
        nodeVisitTimes.put(startNode, currentTime);

        while (!pq.isEmpty()) {
            PathNode currentPathNode = pq.poll();
            Node currentNode = currentPathNode.getNode();
            int currentVisitTime = nodeVisitTimes.get(currentNode);

            if (currentNode.equals(endNode)) {
                return reconstructPath(predecessors);
            }

            for (Edge edge : currentNode.getNeighbors()) {
                Node neighbor = edge.getNeighbor();
                double originalTime = calculateTravelTime(edge, vehicle); // Calculate time based on road and vehicle type

                // Adjust time
                double adjustedTime = trafficCondition.adjustWeight(originalTime, neighbor.getNodeId());
                adjustedTime = weatherCondition.adjustWeightForWeather(adjustedTime, neighbor);

                // Check if road is closed
                int estimatedVisitTime = currentVisitTime + (int) adjustedTime;
                if (!neighbor.isOpenAt(estimatedVisitTime)) {
                    continue;
                }

                double newTime = distances.get(currentNode) + adjustedTime;

                if (!distances.containsKey(neighbor) || newTime < distances.get(neighbor)) {
                    distances.put(neighbor, newTime);
                    predecessors.put(neighbor, currentNode);
                    nodeVisitTimes.put(neighbor, estimatedVisitTime); // Record visit time
                    pq.add(new PathNode(neighbor, newTime));
                }
            }
        }

        return null;
    }

    // Calculate actual travel time on the road, depending on road and vehicle type
    public double calculateTravelTime(Edge edge, Vehicle vehicle) {
        double baseSpeed = 50.0; // Default speed 50 km/h
        Node neighbor = edge.getNeighbor();
        switch (neighbor.getRoadType()) {
            case "Highway":
                baseSpeed = 100.0;
                break;
            case "Toll Road":
                baseSpeed = 80.0;
                break;
            case "Regular Road":
                baseSpeed = 50.0;
                break;
        }
        if (vehicle.getVehicleType().equals("Heavy Vehicle")) {
            baseSpeed *= 0.75; // Heavy vehicles are slower
        }
        return edge.getDistance() / baseSpeed; // Return time
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
