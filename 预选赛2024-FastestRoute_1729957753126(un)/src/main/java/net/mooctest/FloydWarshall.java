package net.mooctest;

import java.util.ArrayList;
import java.util.List;

public class FloydWarshall {

    private double[][] dist;  // Stores the shortest distances between all nodes
    private Node[][] next;    // Used for reconstructing the path
    private int numNodes;

    public FloydWarshall(Graph graph) {
        this.numNodes = graph.getNodes().size();
        this.dist = new double[numNodes][numNodes];
        this.next = new Node[numNodes][numNodes];

        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                dist[i][j] = Double.MAX_VALUE;
                next[i][j] = null;
            }
        }

        for (Node u : graph.getNodes().values()) {
            int uId = u.getNodeId() - 1;
            for (Edge edge : u.getNeighbors()) {
                int vId = edge.getNeighbor().getNodeId() - 1;
                dist[uId][vId] = edge.getDistance();
                next[uId][vId] = edge.getNeighbor();
            }
        }

        for (int k = 0; k < numNodes; k++) {
            for (int i = 0; i < numNodes; i++) {
                for (int j = 0; j < numNodes; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }
    }

    public List<Node> getShortestPath(Node u, Node v) {
        List<Node> path = new ArrayList<>();
        int uId = u.getNodeId() - 1;
        int vId = v.getNodeId() - 1;

        if (next[uId][vId] == null) {
            return path;
        }

        path.add(u);
        while (uId != vId) {
            u = next[uId][vId];
            uId = u.getNodeId() - 1;
            path.add(u);
        }
        return path;
    }

    public void printDistanceMatrix() {
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                if (dist[i][j] == Double.MAX_VALUE) {
                    System.out.print("∞ ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
