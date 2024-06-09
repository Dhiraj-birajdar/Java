package me.app.service;

import me.app.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PublicTransportationService {

    private VehicleService vehicleService;

    public PublicTransportationService(@Qualifier("taxi") VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    public Vehicle startTrip() {
        Vehicle vehicle = vehicleService.getVehicle();
        System.out.println("Starting public trip with " + vehicle.getVehicleType() + " " + vehicle.getVehicleId());
        return vehicle;
    }

    public void endTrip(Vehicle vehicle) {
        System.out.println("Ending public trip with " + vehicle.getVehicleType() + " " + vehicle.getVehicleId());
    }
}
