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

        // Malheureusement, on ne profite pas du polymorphisme ou de divers comportement lié à nos maisons. Ici on garantit uniquement qu'en cas d'évolution de notre maison nous n'aurons pas besoin de mettre à jour nos précédents constructeurs.
    }
}