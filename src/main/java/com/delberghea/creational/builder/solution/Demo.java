package com.delberghea.creational.builder.solution;

import com.delberghea.creational.builder.solution.model.House;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Starting demo of Builder solution");

        // We can now customize our House.
        House builtHouse = House.builder()
                .withDoors(3)
                .withRooms(5)
                .withGarage()
                .withWindows(7)
                .build();

        // We cal build some empty
        House builtHouse2 = House.builder().build();

        // Or some with garden and statues.
        House customHouse = House.builder()
                .withGarden()
                .withFancyStatues()
                .build();

        System.out.println(builtHouse);
        System.out.println(builtHouse2);
        System.out.println(customHouse);

        // But we can't make benefit of polymorphism.
        // And yet, we can not define required arguments. Since for example we have an empty House.
        // We only protect our codebase from evolving with new attributes without causing compilation error.

        // Let's take a look to our problem with required arguments. Lets make a new implementation which allow us to give required arguments
        House houseBuiltWithRequiredArgs = House.builderWithRequiredArgs(3, 4, 7)
                .withSwimmingPool()
                .build();

        System.out.println(houseBuiltWithRequiredArgs);

        // Here, we have an implementation where our House can not have null value (int) and forces us to give values.
        // But we can not make profit of Polymorphism.
        // Sadly, Builder is not a design pattern to use for Polymorphism, or it need to make custom builder for each child, which will cause to have a lot of classes.

    }
}