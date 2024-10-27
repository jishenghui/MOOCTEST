package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class FastestRouteTest {


    AStar aStar;//A星算法
    BellmanFord bellmanFord;//贝尔福算法
    Dijkstra dijkstra;//迪杰斯特拉算法
    FloydWarshall floydWarshall;//弗洛伊德算法
    Graph graph;//图
    IterativeDeepeningSearch iterativeDeepeningSearch;//深搜
    ShortestTimeFirst shortestTimeFirst;//最短路径
    TrafficCondition trafficCondition;//图的路况
    Vehicle vehicle;//图上的交通工具
    WeatherCondition weatherCondition;//天气状况

    Node[] nodes;
    Edge[] edges;
    String[] roadTypes = {"highway", "regular road", "toll road"};//Type of road (e.g., highway, regular road, toll road)
    boolean[] is = {true, false};
    double[] costPerKms = {15, 13, 12, 11};
    int[] openTimes = {4, 5, 6, 7, 8};
    int[] closeTime = {20, 19, 18, 17, 16};
    double[] distances = {1, 1.5, 2, 2.5, 3, 3.5, 4};//距离表
    String[] traffic = {"Clear", "Congested", "Closed", "other"};
    GasStation[] gasStations;

    @Before
    public void setUp() throws Exception {
        //参数表的实例化
        nodes = new Node[16];
        edges = new Edge[16];
        graph = new Graph();
        vehicle = new Vehicle("Standard Vehicle", 10, false, 200, 200, 12, 20, true);
        Map<Integer, String> trafficDataMap = new TreeMap<>();
        gasStations = new GasStation[5];

        //节点初始化
        for (int i = 0; i < 16; i++) {
            nodes[i] = new Node(i, false, roadTypes[i % 3], is[i % 2], is[i % 2], is[i % 2], costPerKms[i % 4], openTimes[i % 5], closeTime[i % 5]);
            graph.addNode(nodes[i]);
        }

        //图初始化
        for (int i = 0; i < 16; i++) {
            int num1 = i;
            int num2 = i;
            edges[i] = new Edge(nodes[(num1 >> 2 + num2 << 2) % 16], distances[i % 7]);
            graph.addEdge(((num1 >> 2 + num2 << 1) % 16), ((num1 >> 3 + num2 << 3) % 16), distances[i % 7] * 5);
        }
        graph.addEdge(((15 >> 2 + 15 << 1) % 16), (15), distances[15 % 7]);//确保联通性
        graph.addEdge(((9 >> 2 + 9 << 1) % 16), (7), distances[6 % 7]);//确保联通性
        graph.addEdge((7), (15), distances[12 % 7]);//确保联通性

        //天气情况初始化
        for (int i = 0; i < 16; i++) {
            trafficDataMap.put(i, traffic[i % 4]);
        }
        trafficCondition = new TrafficCondition(trafficDataMap);
        weatherCondition = new WeatherCondition("Rainy");

        //加油站初始化
        for (int i = 0; i < 5; i++) {
            gasStations[i] = new GasStation(((i >> 2 + 14) * 3) % 16, 10);
        }
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAStar() {
        aStar = new AStar(graph, nodes[0], nodes[15], vehicle, trafficCondition, weatherCondition, 6);
        PathResult path = aStar.findPath();
        List<Node> list = path.getPath();
        Node node1 = list.get(0);
        Node node2 = list.get(1);
        assertEquals(0, node1.getNodeId());
        double disAdd = 0;
        for (Edge edges : node1.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 193.0, 0.001);
        assertEquals(node1.getRoadType(), "highway");
        assertEquals(node1.isHighRiskArea(), true);
        assertEquals(node1.isObstacle(), false);
        assertEquals(node1.isOpenAt(12), true);
        assertEquals(node1.isOpenAt(2), false);
        assertEquals(node1.isRestrictedForHeavyVehicles(), true);
        assertEquals(node1.getCostPerKm(), 15.0, 0.01);
        assertEquals(node1.equals(node2), false);


        assertEquals(15, node2.getNodeId());
        disAdd = 0;
        for (Edge edges : node2.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 0.0, 0.001);
        assertEquals(node2.getRoadType(), "highway");
        assertEquals(node2.isHighRiskArea(), false);
        assertEquals(node2.isObstacle(), false);
        assertEquals(node2.isOpenAt(12), true);
        assertEquals(node2.isOpenAt(2), false);
        assertEquals(node2.isRestrictedForHeavyVehicles(), false);
        assertEquals(node2.getCostPerKm(), 11.0, 0.01);


    }

    @Test
    public void testBellmanFord() {
        bellmanFord = new BellmanFord(graph, nodes[0], nodes[15], vehicle, trafficCondition, weatherCondition, 6);
        PathResult path = bellmanFord.findPath();
        List<Node> list = path.getPath();
        Node node1 = list.get(0);
        Node node2 = list.get(1);
        assertEquals(0, node1.getNodeId());
        double disAdd = 0;
        for (Edge edges : node1.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 193.0, 0.001);
        assertEquals(node1.getRoadType(), "highway");
        assertEquals(node1.isHighRiskArea(), true);
        assertEquals(node1.isObstacle(), false);
        assertEquals(node1.isOpenAt(12), true);
        assertEquals(node1.isOpenAt(2), false);
        assertEquals(node1.isRestrictedForHeavyVehicles(), true);
        assertEquals(node1.getCostPerKm(), 15.0, 0.01);
        assertEquals(node1.equals(node2), false);


        assertEquals(15, node2.getNodeId());
        disAdd = 0;
        for (Edge edges : node2.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 0.0, 0.001);
        assertEquals(node2.getRoadType(), "highway");
        assertEquals(node2.isHighRiskArea(), false);
        assertEquals(node2.isObstacle(), false);
        assertEquals(node2.isOpenAt(12), true);
        assertEquals(node2.isOpenAt(2), false);
        assertEquals(node2.isRestrictedForHeavyVehicles(), false);
        assertEquals(node2.getCostPerKm(), 11.0, 0.01);


    }

    @Test
    public void testDijkstra() {
        Map<Integer, GasStation> gasStationsMap = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            gasStationsMap.put(gasStations[i].getNodeId(), gasStations[i]);
        }
        dijkstra = new Dijkstra(graph, nodes[0], nodes[15], vehicle, trafficCondition, weatherCondition, 6, gasStationsMap);
        PathResult path = dijkstra.findPath();
        List<Node> list = path.getPath();
        Node node1 = list.get(0);
        Node node2 = list.get(1);
        assertEquals(0, node1.getNodeId());
        double disAdd = 0;
        for (Edge edges : node1.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 193.0, 0.001);
        assertEquals(node1.getRoadType(), "highway");
        assertEquals(node1.isHighRiskArea(), true);
        assertEquals(node1.isObstacle(), false);
        assertEquals(node1.isOpenAt(12), true);
        assertEquals(node1.isOpenAt(2), false);
        assertEquals(node1.isRestrictedForHeavyVehicles(), true);
        assertEquals(node1.getCostPerKm(), 15.0, 0.01);
        assertEquals(node1.equals(node2), false);


        assertEquals(15, node2.getNodeId());
        disAdd = 0;
        for (Edge edges : node2.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 0.0, 0.001);
        assertEquals(node2.getRoadType(), "highway");
        assertEquals(node2.isHighRiskArea(), false);
        assertEquals(node2.isObstacle(), false);
        assertEquals(node2.isOpenAt(12), true);
        assertEquals(node2.isOpenAt(2), false);
        assertEquals(node2.isRestrictedForHeavyVehicles(), false);
        assertEquals(node2.getCostPerKm(), 11.0, 0.01);

        System.out.println();
    }


    @Test
    public void testFloydWarshall() {
        //参数表的实例化
        nodes = new Node[16];
        edges = new Edge[16];
        graph = new Graph();
        gasStations = new GasStation[5];

        //节点初始化
        for (int i = 0; i < 16; i++) {
            nodes[i] = new Node(i + 1, false, roadTypes[i % 3], is[i % 2], is[i % 2], is[i % 2], costPerKms[i % 4], openTimes[i % 5], closeTime[i % 5]);
            graph.addNode(nodes[i]);
        }

        //图初始化
        for (int i = 0; i < 16; i++) {
            int num1 = i;
            int num2 = i;
            edges[i] = new Edge(nodes[(num1 >> 2 + num2 << 2) % 16], distances[i % 7]);
            graph.addEdge(((num1 >> 2 + num2 << 1) % 16), ((num1 >> 3 + num2 << 3) % 16), distances[i % 7] * 25);
        }
        graph.addEdge(((15 >> 2 + 15 << 1) % 16), (15), distances[15 % 7]);//确保联通性
        graph.addEdge(((9 >> 2 + 9 << 1) % 16), (7), distances[6 % 7]);//确保联通性
        graph.addEdge((7), (15), distances[12 % 7]);//确保联通性


        floydWarshall = new FloydWarshall(graph);

        List<Node> list = floydWarshall.getShortestPath(nodes[6], nodes[14]);
        PathResult path = new PathResult(list);
        Node node1 = list.get(0);
        Node node2 = list.get(1);
        assertEquals(7, node1.getNodeId());
        double disAdd = 0;
        for (Edge edges : node1.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 3.5, 0.001);
        assertEquals(node1.getRoadType(), "highway");
        assertEquals(node1.isHighRiskArea(), true);
        assertEquals(node1.isObstacle(), false);
        assertEquals(node1.isOpenAt(12), true);
        assertEquals(node1.isOpenAt(2), false);
        assertEquals(node1.isRestrictedForHeavyVehicles(), true);
        assertEquals(node1.getCostPerKm(), 12.0, 0.01);
        assertEquals(node1.equals(node2), false);


        assertEquals(15, node2.getNodeId());
        disAdd = 0;
        for (Edge edges : node2.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 0.0, 0.001);
        assertEquals(node2.getRoadType(), "toll road");
        assertEquals(node2.isHighRiskArea(), true);
        assertEquals(node2.isObstacle(), false);
        assertEquals(node2.isOpenAt(12), true);
        assertEquals(node2.isOpenAt(2), false);
        assertEquals(node2.isRestrictedForHeavyVehicles(), true);
        assertEquals(node2.getCostPerKm(), 12.0, 0.01);

        System.out.println();
    }


    @Test
    public void testShortestTimeFirst() {
        Map<Integer, GasStation> gasStationsMap = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            gasStationsMap.put(gasStations[i].getNodeId(), gasStations[i]);
        }
        shortestTimeFirst = new ShortestTimeFirst(graph, nodes[0], nodes[15], vehicle, trafficCondition, weatherCondition, 6);
        PathResult path = shortestTimeFirst.findPath();
        List<Node> list = path.getPath();
        Node node1 = list.get(0);
        Node node2 = list.get(1);
        assertEquals(0, node1.getNodeId());
        double disAdd = 0;
        for (Edge edges : node1.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 193.0, 0.001);
        assertEquals(node1.getRoadType(), "highway");
        assertEquals(node1.isHighRiskArea(), true);
        assertEquals(node1.isObstacle(), false);
        assertEquals(node1.isOpenAt(12), true);
        assertEquals(node1.isOpenAt(2), false);
        assertEquals(node1.isRestrictedForHeavyVehicles(), true);
        assertEquals(node1.getCostPerKm(), 15.0, 0.01);
        assertEquals(node1.equals(node2), false);


        assertEquals(15, node2.getNodeId());
        disAdd = 0;
        for (Edge edges : node2.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 0.0, 0.001);
        assertEquals(node2.getRoadType(), "highway");
        assertEquals(node2.isHighRiskArea(), false);
        assertEquals(node2.isObstacle(), false);
        assertEquals(node2.isOpenAt(12), true);
        assertEquals(node2.isOpenAt(2), false);
        assertEquals(node2.isRestrictedForHeavyVehicles(), false);
        assertEquals(node2.getCostPerKm(), 11.0, 0.01);

        System.out.println();
    }


    @Test
    public void testIterativeDeepeningSearch() {
        Map<Integer, GasStation> gasStationsMap = new TreeMap<>();
        for (int i = 0; i < 5; i++) {
            gasStationsMap.put(gasStations[i].getNodeId(), gasStations[i]);
        }
        iterativeDeepeningSearch = new IterativeDeepeningSearch(graph, nodes[0], nodes[15], vehicle, trafficCondition, weatherCondition, 6, 1000);
        PathResult path = iterativeDeepeningSearch.findPath();
        List<Node> list = path.getPath();
        Node node1 = list.get(0);
        Node node2 = list.get(1);
        assertEquals(0, node1.getNodeId());
        double disAdd = 0;
        for (Edge edges : node1.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 193.0, 0.001);
        assertEquals(node1.getRoadType(), "highway");
        assertEquals(node1.isHighRiskArea(), true);
        assertEquals(node1.isObstacle(), false);
        assertEquals(node1.isOpenAt(12), true);
        assertEquals(node1.isOpenAt(2), false);
        assertEquals(node1.isRestrictedForHeavyVehicles(), true);
        assertEquals(node1.getCostPerKm(), 15.0, 0.01);
        assertEquals(node1.equals(node2), false);


        assertEquals(15, node2.getNodeId());
        disAdd = 0;
        for (Edge edges : node2.getNeighbors()) {
            disAdd += edges.getDistance();
        }
        assertEquals(disAdd, 0.0, 0.001);
        assertEquals(node2.getRoadType(), "highway");
        assertEquals(node2.isHighRiskArea(), false);
        assertEquals(node2.isObstacle(), false);
        assertEquals(node2.isOpenAt(12), true);
        assertEquals(node2.isOpenAt(2), false);
        assertEquals(node2.isRestrictedForHeavyVehicles(), false);
        assertEquals(node2.getCostPerKm(), 11.0, 0.01);

        System.out.println();
    }


}