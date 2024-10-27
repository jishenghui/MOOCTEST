package net.mooctest;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    private Map<Integer, Node> nodes;

    public Graph() {
        nodes = new HashMap<>();
    }

    public void addNode(Node node) {
        nodes.put(node.getNodeId(), node);
    }

    public void addEdge(int fromNodeId, int toNodeId, double distance) {
        Node fromNode = nodes.get(fromNodeId);
        Node toNode = nodes.get(toNodeId);
        if (fromNode != null && toNode != null) {
            fromNode.addNeighbor(toNode, distance);
        }
    }

    public Node getNode(int nodeId) {
        return nodes.get(nodeId);
    }

    public Map<Integer, Node> getNodes() {
        return nodes;
    }
}


