package com.delberghea.creational.builder.problems.multipleconstructor;

import com.delberghea.creational.builder.problems.multipleconstructor.model.House;
import com.delberghea.creational.builder.problems.multipleconstructor.model.HouseWithFancyStatues;
import com.delberghea.creational.builder.problems.multipleconstructor.model.HouseWithGarden;
import com.delberghea.creational.builder.problems.multipleconstructor.model.HouseWithSwimmingPool;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Starting demo of Builder case problem using Big Constructor");

        House statuesHouse = new HouseWithFancyStatues(10, 10, 10);
        House poolHouse = new HouseWithSwimmingPool(10, 10, 10);
        House gardenHouse = new HouseWithGarden(10, 10, 10);
        House garageHouse = new HouseWithGarden(10, 10, 10);
        System.out.println(statuesHouse);
        System.out.println(poolHouse);
        System.out.println(gardenHouse);
        System.out.println(garageHouse);

        HouseWithFancyStatues houseWithFancyStatues = new HouseWithFancyStatues(10, 10, 10);
        System.out.println(houseWithFancyStatues);

        // It looks already better than the other problem. Here we can make usage of polymorphism, and we get to know pretty fast with which House we are working.
        // Creating a new House will not cause any trouble neither. We can implement our HouseWithCorridor without touching to others House. Just the basic "House" will have his constructor updated.


        // But still we have a problem. What if i want a house with FancyStatues AND a SwimmingPool ? Before i could create that, but now I can't anymore.
    }
}
