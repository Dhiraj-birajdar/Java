package me.app.service;


import me.app.model.Vehicle;
import me.app.model.VehicleType;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("taxi")
@Profile("default")
@Primary
public class TaxiService implements VehicleService{

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TAXI, UUID.randomUUID());
    }
}
