package net.mooctest;
import java.util.List;

import java.util.List;

public class PathResult {
    private List<Node> path;

    public PathResult(List<Node> path) {
        this.path = path;
    }

    public List<Node> getPath() {
        return path;
    }

    public void printPath() {
        for (Node node : path) {
            System.out.print(node.getNodeId() + " -> ");
        }
        System.out.println("End");
    }
}


