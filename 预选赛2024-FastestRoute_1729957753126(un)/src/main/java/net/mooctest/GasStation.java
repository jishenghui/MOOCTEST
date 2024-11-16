package net.mooctest;

public class GasStation {
    private int nodeId;  // Node ID where the gas station is located
    private double fuelCostPerLitre;

    public GasStation(int nodeId, double fuelCostPerLitre) {
        this.nodeId = nodeId;
        this.fuelCostPerLitre = fuelCostPerLitre;
    }

    public int getNodeId() {
        return nodeId;
    }

    public double getFuelCostPerLitre() {
        return fuelCostPerLitre;
    }

    public void refuel(Vehicle vehicle, double amount) {
        double totalCost = amount * fuelCostPerLitre;
        vehicle.refuel(amount);
        System.out.println("Refueled " + amount + " litres at node " + nodeId + " for " + totalCost + " cost.");
    }
}
