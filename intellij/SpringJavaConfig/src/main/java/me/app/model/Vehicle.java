package me.app.model;

import java.util.UUID;

public class Vehicle {

    private String vehicleType;
    private UUID vehicleId;

    public void move() {
        System.out.println(vehicleType+" is moving registration number: "+vehicleId);
    }

    public void stop() {
        System.out.println(vehicleType+" is stopped registration number: "+vehicleId);
    }

    public Vehicle(String vehicleType, UUID vehicleId) {
        this.vehicleType = vehicleType;
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", vehicleId=" + vehicleId +
                '}';
    }


    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }
}
