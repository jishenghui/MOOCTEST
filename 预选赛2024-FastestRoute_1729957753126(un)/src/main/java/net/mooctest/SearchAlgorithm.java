package net.mooctest;
public abstract class SearchAlgorithm {
    protected Graph graph;
    protected Node startNode;
    protected Node endNode;
    protected Vehicle vehicle;
    protected TrafficCondition trafficCondition;
    protected WeatherCondition weatherCondition;
    protected int currentTime; // Current time, may affect road segment opening and closing

    public SearchAlgorithm(Graph graph, Node startNode, Node endNode, Vehicle vehicle,
                           TrafficCondition trafficCondition, WeatherCondition weatherCondition, int currentTime) {
        this.graph = graph;
        this.startNode = startNode;
        this.endNode = endNode;
        this.vehicle = vehicle;
        this.trafficCondition = trafficCondition;
        this.weatherCondition = weatherCondition;
        this.currentTime = currentTime;
    }

    public abstract PathResult findPath();
}


