package me.app.model;

import java.util.UUID;

public class Vehicle {

    private VehicleType vehicleType;
    private UUID vehicleId;

    public Vehicle(VehicleType vehicleType, UUID vehicleId) {
        this.vehicleType = vehicleType;
        this.vehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "TaxiService{" +
                "vehicleType=" + vehicleType +
                ", vehicleId=" + vehicleId +
                '}';
    }
}
