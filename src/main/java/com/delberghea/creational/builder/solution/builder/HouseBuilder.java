package com.delberghea.creational.builder.solution.builder;

import com.delberghea.creational.builder.solution.model.House;

public interface HouseBuilder {

    HouseBuilderImpl withWindows(int windows);
    HouseBuilderImpl withDoors(int doors);
    HouseBuilderImpl withRooms(int rooms);
    HouseBuilderImpl withGarage();
    HouseBuilderImpl withSwimmingPool();
    HouseBuilderImpl withFancyStatues();
    HouseBuilderImpl withGarden();
    House build();
}
