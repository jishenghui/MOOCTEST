package net.mooctest;

public class RouteOptimizer {
    private SearchAlgorithm searchAlgorithm;

    public RouteOptimizer(SearchAlgorithm searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

    public PathResult optimizeRoute() {
        return searchAlgorithm.findPath();
    }
}


