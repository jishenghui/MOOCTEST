package net.mooctest;
public class Node extends Vector {
	protected String sName;

	public Node() {
		super(0.0, 0.0);
	}

	public Node(double dX, double dY) {
		super(dX, dY);
	}

	public Node(String sName, double dX, double dY) {
		super(dX, dY);
		this.sName = sName;
	}

	// Set name for the node ...
	public void setName(String sName) {
		this.sName = sName;
	}

	// Convert node to a string ...
	public String toString() {
		return "Node(\"" + sName + "\") is at (" + dX + "," + dY + ")";
	}

}
