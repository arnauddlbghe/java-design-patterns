package com.delberghea.creational.builder.problems.multipleconstructor.model;

public class HouseWithSwimmingPool extends House {
    public HouseWithSwimmingPool(int windows, int doors, int rooms) {
        super(windows, doors, rooms, false, true, false, false);
    }
}
