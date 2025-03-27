package com.delberghea.creational.builder.problems.multipleconstructor.model;

public class HouseWithGarage extends House {

    public HouseWithGarage(int windows, int doors, int rooms) {
        super(windows, doors, rooms, true, false, false, false);
    }
}
