package net.mooctest;
import java.util.Map;

public class TrafficCondition {
    private Map<Integer, String> trafficData; // 从节点 ID 映射到流量状况，例如 “Clear”、“Congested”、“Closed”

    public TrafficCondition(Map<Integer, String> trafficData) {
        this.trafficData = trafficData;
    }

    public String getTrafficStatus(int nodeId) {
        return trafficData.getOrDefault(nodeId, "Clear");
    }

    public void updateTrafficStatus(int nodeId, String status) {
        trafficData.put(nodeId, status);
    }

    public double adjustWeight(double originalWeight, int nodeId) {
        String trafficStatus = getTrafficStatus(nodeId);
        switch (trafficStatus) {
            case "Clear":
                return originalWeight;
            case "Congested":
                return originalWeight * 2; // Double weight in case of congestion
            case "Closed":
                return Double.MAX_VALUE; // Impassable if the road is closed
            case "Accident":
                return originalWeight * 3; // Increase weight if there’s an accident
            default:
                return originalWeight;
        }
    }
}
