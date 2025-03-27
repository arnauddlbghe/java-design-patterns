package com.delberghea.creational.builder.solution.builder;

import com.delberghea.creational.builder.solution.model.House;

public class HouseBuilderImpl implements HouseBuilder {

    private final House house;

    public HouseBuilderImpl() {
        this.house = new House();
    }


    @Override
    public HouseBuilderImpl withWindows(int windows) {
        this.house.setWindows(windows);
        return this;
    }

    @Override
    public HouseBuilderImpl withDoors(int doors) {
        this.house.setDoors(doors);
        return this;
    }

    @Override
    public HouseBuilderImpl withRooms(int rooms) {
        this.house.setRooms(rooms);
        return this;
    }

    @Override
    public HouseBuilderImpl withGarage() {
        this.house.setHasGarage(true);
        return this;
    }

    @Override
    public HouseBuilderImpl withSwimmingPool() {
        this.house.setHasSwimPool(true);
        return this;
    }

    @Override
    public HouseBuilderImpl withFancyStatues() {
        this.house.setHasFancyStatues(true);
        return this;
    }

    @Override
    public HouseBuilderImpl withGarden() {
        this.house.setHasGarden(true);
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }
}
