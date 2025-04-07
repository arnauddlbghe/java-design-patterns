package com.delberghea.behavioral.strategy.model;

public class PublicTransportStrategy implements RouteStrategy {

    private final double costMultiplicator;
    private final double speedMultiplicator;

    public PublicTransportStrategy() {
        this.costMultiplicator = 1.1;
        this.speedMultiplicator = 1.6;
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
