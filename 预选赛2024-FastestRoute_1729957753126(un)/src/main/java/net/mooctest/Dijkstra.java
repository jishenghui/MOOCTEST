package net.mooctest;
import java.util.*;

public class Dijkstra extends SearchAlgorithm {

    private Map<Integer, GasStation> gasStations; // Records gas stations on the map

    public Dijkstra(Graph graph, Node startNode, Node endNode, Vehicle vehicle,
                    TrafficCondition trafficCondition, WeatherCondition weatherCondition, int currentTime,
                    Map<Integer, GasStation> gasStations) {
        super(graph, startNode, endNode, vehicle, trafficCondition, weatherCondition, currentTime);
        this.gasStations = gasStations;
    }

    @Override
    public PathResult findPath() {
        PriorityQueue<PathNode> pq = new PriorityQueue<>(Comparator.comparingDouble(PathNode::getDistance));
        Map<Node, Double> distances = new HashMap<>();
        Map<Node, Node> predecessors = new HashMap<>();
        Map<Node, Integer> nodeVisitTimes = new HashMap<>(); // Node visit time

        pq.add(new PathNode(startNode, 0));
        distances.put(startNode, 0.0);
        nodeVisitTimes.put(startNode, currentTime); // Initial node visit time

        while (!pq.isEmpty()) {
            PathNode currentPathNode = pq.poll();
            Node currentNode = currentPathNode.getNode();
            int currentVisitTime = nodeVisitTimes.get(currentNode);

            if (currentNode.equals(endNode)) {
                return reconstructPath(predecessors);
            }

            for (Edge edge : currentNode.getNeighbors()) {
                Node neighbor = edge.getNeighbor();
                double originalDistance = edge.getDistance();

                double adjustedDistance = trafficCondition.adjustWeight(originalDistance, neighbor.getNodeId());
                adjustedDistance = weatherCondition.adjustWeightForWeather(adjustedDistance, neighbor);

                if (!vehicle.isEmergencyVehicle()) {
                    if (!neighbor.isOpenAt(currentVisitTime)) {
                        continue; // Road is closed
                    }
                    if (neighbor.isHighRiskArea()) {
                        continue; // Skip high-risk area
                    }
                }

                // Fuel check
                if (vehicle.needsRefueling(adjustedDistance)) {
                    GasStation gasStation = gasStations.get(currentNode.getNodeId());
                    if (gasStation != null) {
                        gasStation.refuel(vehicle, vehicle.getFuelCapacity() - vehicle.getCurrentFuel());
                    } else {
                        continue; // Insufficient fuel and no gas station available
                    }
                }

                double newDistance = distances.get(currentNode) + adjustedDistance;

                if (!distances.containsKey(neighbor) || newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    predecessors.put(neighbor, currentNode);
                    nodeVisitTimes.put(neighbor, currentVisitTime + (int)adjustedDistance);
                    pq.add(new PathNode(neighbor, newDistance));
                }
            }
        }

        return null;  // No path found
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
