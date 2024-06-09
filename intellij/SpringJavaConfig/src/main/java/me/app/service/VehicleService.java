package me.app.service;

import me.app.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.UUID;

public class VehicleService {

    public Vehicle getVehicle(){
        return new Vehicle("car", UUID.randomUUID());
    }
}
