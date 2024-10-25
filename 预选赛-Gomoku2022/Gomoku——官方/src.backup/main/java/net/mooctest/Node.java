package net.mooctest;

public class Node {
    public int p;
    public int x;
    public int y;

    public Node() {

    }

    public Node(int p, int x, int y) {
        this.p = p;
        this.x = x;
        this.y = y;
    }

    public Node(Node node) {
        this.p = node.p == Gomoku.AI ? Gomoku.PLAYER : Gomoku.AI;
        this.x = node.x;
        this.y = node.y;
    }

}
