package net.mooctest;
public class Edge {
	protected Node node1, node2;
	protected String sName;

	public Edge() {
	}

	public Edge(Node node1, Node node2) {
		this.node1 = node1;
		this.node2 = node2;
	}

	public Edge(String sName, Node node1, Node node2) {
		this.node1 = node1;
		this.node2 = node2;
		this.sName = sName;
	}

	// Compute edge length ...
	public double length() {
		return node1.sub(node2).length();
	}

	// Convert node to a string ...
	public String toString() {
		return "Edge(\"" + sName + "\") connects nodes (" + node1.sName + ", " + node2.sName + ")";
	}
}
