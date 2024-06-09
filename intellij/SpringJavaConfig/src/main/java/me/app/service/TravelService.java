package me.app.service;

import me.app.model.Vehicle;
import org.springframework.stereotype.Service;


public class TravelService {

    private VehicleService vehicleService;

    public TravelService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public void travel() {
        Vehicle vehicle = vehicleService.getVehicle();
        vehicle.move();
        vehicle.stop();
    }
}
