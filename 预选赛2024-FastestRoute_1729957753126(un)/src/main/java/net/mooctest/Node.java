package net.mooctest;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int nodeId;
    private boolean isObstacle;
    private List<Edge> neighbors; // ���ڽڵ�;���
    private String roadType; // ��·���ͣ����磬���ٹ�·�������·���շѹ�·��
    private boolean tollRoad; // ָʾ���Ƿ�Ϊ�շѹ�·
    private boolean restrictedForHeavyVehicles; // ָʾ�Ƿ��������ͳ���
    private boolean highRiskArea; // ָʾ���Ƿ�Ϊ�߷�������
    private double costPerKm; // ÿ�����ȼ�ϻ���Դ�ɱ�
    private int openTime;  // ��·���ſ�ʼʱ�䣨Сʱ��
    private int closeTime; // ��·�ر�ʱ��

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
