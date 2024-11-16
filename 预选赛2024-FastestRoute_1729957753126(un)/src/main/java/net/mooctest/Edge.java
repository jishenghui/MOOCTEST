package net.mooctest;
public class Edge {
    private Node neighbor;
    private double distance;

    public Edge(Node neighbor, double distance) {
        this.neighbor = neighbor;
        this.distance = distance;
    }

    public Node getNeighbor() {
        return neighbor;
    }

    public double getDistance() {
        return distance;
    }
}


