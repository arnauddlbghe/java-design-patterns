package com.delberghea.creational.builder.solution.builder;

import com.delberghea.creational.builder.solution.model.House;

public class HouseBuilderRequiredArgsImpl implements HouseBuilder {

    private final House house;

    public HouseBuilderRequiredArgsImpl(int windows, int doors, int rooms) {
        this.house = new House();
        this.house.setWindows(windows);
        this.house.setDoors(doors);
        this.house.setRooms(rooms);
    }


    @Override
    public HouseBuilderRequiredArgsImpl withWindows(int windows) {
        return this;
    }

    @Override
    public HouseBuilderRequiredArgsImpl withDoors(int doors) {
        return this;
    }

    @Override
    public HouseBuilderRequiredArgsImpl withRooms(int rooms) {
        return this;
    }

    @Override
    public HouseBuilderRequiredArgsImpl withGarage() {
        this.house.setHasGarage(true);
        return this;
    }

    @Override
    public HouseBuilderRequiredArgsImpl withSwimmingPool() {
        this.house.setHasSwimPool(true);
        return this;
    }

    @Override
    public HouseBuilderRequiredArgsImpl withFancyStatues() {
        this.house.setHasFancyStatues(true);
        return this;
    }

    @Override
    public HouseBuilderRequiredArgsImpl withGarden() {
        this.house.setHasGarden(true);
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }
}
