package net.mooctest;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int nodeId;
    private boolean isObstacle;
    private List<Edge> neighbors; // 相邻节点和距离
    private String roadType; // 道路类型（例如，高速公路、常规道路、收费公路）
    private boolean tollRoad; // 指示它是否为收费公路
    private boolean restrictedForHeavyVehicles; // 指示是否限制重型车辆
    private boolean highRiskArea; // 指示它是否为高风险区域
    private double costPerKm; // 每公里的燃料或能源成本
    private int openTime;  // 道路开放开始时间（小时）
    private int closeTime; // 道路关闭时间

    public Node(int nodeId, boolean isObstacle, String roadType, boolean tollRoad,
                boolean restrictedForHeavyVehicles, boolean highRiskArea,
                double costPerKm, int openTime, int closeTime) {
        this.nodeId = nodeId;
        this.isObstacle = isObstacle;
        this.roadType = roadType;
        this.tollRoad = tollRoad;
        this.restrictedForHeavyVehicles = restrictedForHeavyVehicles;
        this.highRiskArea = highRiskArea;
        this.costPerKm = costPerKm;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.neighbors = new ArrayList<>();
    }

    public int getNodeId() {
        return nodeId;
    }

    public boolean isObstacle() {
        return isObstacle;
    }

    public List<Edge> getNeighbors() {
        return neighbors;
    }

    public String getRoadType() {
        return roadType;
    }

    public boolean isTollRoad() {
        return tollRoad;
    }

    public boolean isRestrictedForHeavyVehicles() {
        return restrictedForHeavyVehicles;
    }

    public boolean isHighRiskArea() {
        return highRiskArea;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public boolean isOpenAt(int currentTime) {
        return currentTime >= openTime && currentTime <= closeTime;
    }

    public void addNeighbor(Node neighbor, double distance) {
        if (!neighbor.isObstacle()) {
            this.neighbors.add(new Edge(neighbor, distance));
        }
    }
}
