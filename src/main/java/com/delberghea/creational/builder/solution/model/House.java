package com.delberghea.creational.builder.solution.model;

import com.delberghea.creational.builder.solution.builder.HouseBuilder;
import com.delberghea.creational.builder.solution.builder.HouseBuilderImpl;
import com.delberghea.creational.builder.solution.builder.HouseBuilderRequiredArgsImpl;

public class House {

    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasFancyStatues;
    private boolean hasGarden;

    public static HouseBuilder builder() {
        return new HouseBuilderImpl();
    }

    public static HouseBuilder builderWithRequiredArgs(int windows, int doors, int rooms) {
        return new HouseBuilderRequiredArgsImpl(windows, doors, rooms);
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean isHasFancyStatues() {
        return hasFancyStatues;
    }

    public void setHasFancyStatues(boolean hasFancyStatues) {
        this.hasFancyStatues = hasFancyStatues;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }


    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimPool=" + hasSwimPool +
                ", hasFancyStatues=" + hasFancyStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
