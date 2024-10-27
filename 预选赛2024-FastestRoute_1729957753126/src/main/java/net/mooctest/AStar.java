package net.mooctest;

import java.util.*;

public class AStar extends SearchAlgorithm {

    public AStar(Graph graph, Node startNode, Node endNode, Vehicle vehicle,
                 TrafficCondition trafficCondition, WeatherCondition weatherCondition, int currentTime) {
        super(graph, startNode, endNode, vehicle, trafficCondition, weatherCondition, currentTime);
    }

    public double heuristic(Node node) {
        double distanceToEnd = Math.abs(node.getNodeId() - endNode.getNodeId());
        double roadTypeFactor = 1.0;
        if (node.getRoadType().equals("Highway")) {
            roadTypeFactor = 0.8; // Prioritize highways
        }
        if (node.isHighRiskArea()) {
            roadTypeFactor = 2.0; // Avoid high-risk areas
        }
        return distanceToEnd * roadTypeFactor;
    }

    @Override
    public PathResult findPath() {
        PriorityQueue<PathNode> pq = new PriorityQueue<>(Comparator.comparingDouble(PathNode::getEstimatedTotalDistance));
        Map<Node, Double> gScores = new HashMap<>();
        Map<Node, Double> fScores = new HashMap<>();
        Map<Node, Node> predecessors = new HashMap<>();
        Map<Node, Integer> nodeVisitTimes = new HashMap<>(); // Node visit time

        gScores.put(startNode, 0.0);
        fScores.put(startNode, heuristic(startNode));
        pq.add(new PathNode(startNode, 0, fScores.get(startNode)));
        nodeVisitTimes.put(startNode, currentTime); // Record initial time

        while (!pq.isEmpty()) {
            PathNode currentPathNode = pq.poll();
            Node currentNode = currentPathNode.getNode();
            int currentVisitTime = nodeVisitTimes.get(currentNode);

            if (currentNode.equals(endNode)) {
                return reconstructPath(predecessors);
            }

            for (Edge edge : currentNode.getNeighbors()) {
                Node neighbor = edge.getNeighbor();
                double tentativeGScore = gScores.get(currentNode) + edge.getDistance();

                double adjustedDistance = trafficCondition.adjustWeight(tentativeGScore, neighbor.getNodeId());
                adjustedDistance = weatherCondition.adjustWeightForWeather(adjustedDistance, neighbor);

                if (!vehicle.isEmergencyVehicle() && !neighbor.isOpenAt(currentVisitTime)) {
                    continue;
                }

                if (neighbor.isHighRiskArea() && !vehicle.isEmergencyVehicle()) {
                    continue; // Skip high-risk areas
                }

                if (vehicle.needsRefueling(adjustedDistance)) {
                    continue;
                }

                if (!gScores.containsKey(neighbor) || tentativeGScore < gScores.get(neighbor)) {
                    gScores.put(neighbor, tentativeGScore);
                    double fScore = tentativeGScore + heuristic(neighbor);
                    fScores.put(neighbor, fScore);
                    predecessors.put(neighbor, currentNode);
                    nodeVisitTimes.put(neighbor, currentVisitTime + (int)adjustedDistance);
                    pq.add(new PathNode(neighbor, tentativeGScore, fScore));
                }
            }
        }

        return null;
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
