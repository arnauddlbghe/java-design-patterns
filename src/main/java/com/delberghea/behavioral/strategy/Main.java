package com.delberghea.behavioral.strategy;

import com.delberghea.behavioral.strategy.model.*;

public class Main {

    public static void main(String[] args) {
        RouteStrategy strategy = new PublicTransportStrategy();
        RouteStrategy strategy2 = new RoadStrategy();
        RouteStrategy strategy3 = new WalkStrategy();

        Navigator navigator = new Navigator(strategy);
        System.out.println(navigator.calcSpeedToDistance(8.7));

        navigator.setStrategy(strategy2);
        System.out.println(navigator.calcSpeedToDistance(8.7));

        navigator.setStrategy(strategy3);
        System.out.println(navigator.calcSpeedToDistance(8.7));
    }
}