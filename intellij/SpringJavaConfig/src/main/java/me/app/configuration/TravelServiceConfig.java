package me.app.configuration;

import me.app.service.TravelService;
import me.app.service.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TravelServiceConfig {

//    private VehicleServiceConfig vehicleServiceConfig;
//    public TravelServiceConfig(VehicleServiceConfig vehicleServiceConfig){
//        this.vehicleServiceConfig = vehicleServiceConfig;
//    }

    @Bean
    public TravelService getTravelService(VehicleService vehicleService){
        return new TravelService(vehicleService);
    }
}
