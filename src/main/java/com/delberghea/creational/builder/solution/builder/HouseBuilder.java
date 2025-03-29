package com.delberghea.creational.builder.solution.builder;

import com.delberghea.creational.builder.solution.model.House;

public interface HouseBuilder {

    HouseBuilder withWindows(int windows);
    HouseBuilder withDoors(int doors);
    HouseBuilder withRooms(int rooms);
    HouseBuilder withGarage();
    HouseBuilder withSwimmingPool();
    HouseBuilder withFancyStatues();
    HouseBuilder withGarden();
    House build();
}
