package com.delberghea.behavioral.strategy.model;

public class RoadStrategy implements RouteStrategy {

    private final double costMultiplicator;
    private final double speedMultiplicator;

    public RoadStrategy() {
        this.costMultiplicator = 1.7;
        this.speedMultiplicator = 2.0;
    }

    public double getCostMultiplicator() {
        return costMultiplicator;
    }

    public double getSpeedMultiplicator() {
        return speedMultiplicator;
    }

    @Override
    public double costForDistance(double distance) {
        return distance * costMultiplicator;
    }
}
