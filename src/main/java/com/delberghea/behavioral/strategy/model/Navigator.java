package com.delberghea.behavioral.strategy.model;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public RouteStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     *
     * @param distance
     * @return
     */
    public double calcSpeedToDistance(double distance) {
        return this.strategy.costForDistance(distance);
    }
}
