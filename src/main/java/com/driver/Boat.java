package com.driver;

public class Boat implements WaterVehicle {

    private String name;
    private int capacity;

    public Boat() {

    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
