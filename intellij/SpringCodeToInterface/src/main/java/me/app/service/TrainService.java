package me.app.service;


import me.app.model.Vehicle;
import me.app.model.VehicleType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
//@Primary
public class TrainService implements VehicleService{

    @Override
    public Vehicle getVehicle() {

        return new Vehicle(VehicleType.TRAIN, UUID.randomUUID());
    }
}
