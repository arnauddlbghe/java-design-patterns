package com.delberghea.creational.builder.problems.multipleconstructor.model;

public class HouseWithGarden extends House {
    public HouseWithGarden(int windows, int doors, int rooms) {
        super(windows, doors, rooms, false, false, false, true);
    }
}
