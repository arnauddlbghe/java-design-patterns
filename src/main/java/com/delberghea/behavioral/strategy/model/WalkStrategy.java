package com.delberghea.behavioral.strategy.model;

public class WalkStrategy implements RouteStrategy {

    private final double costMultiplicator;
    private final double speedMultiplicator;

    public WalkStrategy() {
        this.costMultiplicator = 1.0;
        this.speedMultiplicator = 1.0;
    }

    @Override
    public double costForDistance(double distance) {
        return distance * costMultiplicator;
    }
}
