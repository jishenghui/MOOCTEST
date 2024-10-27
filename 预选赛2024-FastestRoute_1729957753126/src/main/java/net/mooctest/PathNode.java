package net.mooctest;
public class PathNode {
    private Node node;
    private double distance;
    private double estimatedTotalDistance;

    public PathNode(Node node, double distance) {
        this(node, distance, distance);
    }

    public PathNode(Node node, double distance, double estimatedTotalDistance) {
        this.node = node;
        this.distance = distance;
        this.estimatedTotalDistance = estimatedTotalDistance;
    }

    public Node getNode() {
        return node;
    }

    public double getDistance() {
        return distance;
    }

    public double getEstimatedTotalDistance() {
        return estimatedTotalDistance;
    }
}


