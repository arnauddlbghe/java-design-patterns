package com.delberghea.creational.builder.solution;

import com.delberghea.creational.builder.solution.model.House;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Starting demo of Builder solution");

        // On est maintenant capable de construire nos maisons, quelque soit les paramètres.
        House builtHouse = House.builder()
                .withDoors(3)
                .withRooms(5)
                .withGarage()
                .withWindows(7)
                .build();

        // On peut produire des maisons vides.
        House builtHouse2 = House.builder().build();

        // Ou des maisons qui ont plusieurs attributs.
        House customHouse = House.builder()
                .withGarden()
                .withFancyStatues()
                .build();

        System.out.println(builtHouse);
        System.out.println(builtHouse2);
        System.out.println(customHouse);

        // Malheureusement, on ne profite pas du polymorphisme ou de divers comportement lié à nos maisons.
        // On ne profite pas non plus de la restriction sur les paramètres requis.
        // Ici on garantit uniquement qu'en cas d'évolution de notre maison nous n'aurons pas besoin de mettre à jour nos précédents constructeurs.

        // In a first time, let's implemente a new solution for requiredArgs.
        House houseBuiltWithRequiredArgs = House.builderWithRequiredArgs(3, 4, 7)
                .withSwimmingPool()
                .build();

        System.out.println(houseBuiltWithRequiredArgs);

        // Here, we have an implementation where our House can not have null value (int) and forces us to give values.
        // But we can not make profit of Polymorphism.

    }
}