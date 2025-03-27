package com.delberghea.creational.builder.problems.multipleconstructor.model;

public class HouseWithFancyStatues extends House {
    public HouseWithFancyStatues(int windows, int doors, int rooms) {
        super(windows, doors, rooms, false, false, true, false);
    }
}
