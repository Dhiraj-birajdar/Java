package me.app.configuration;

import me.app.service.TravelService;
import me.app.service.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleServiceConfig {


    @Bean
    public VehicleService getVehicleService(){
        return new VehicleService();
    }

//    @Bean
//    public TravelService getTravelService(){
//        return new TravelService(getVehicleService());
//    }
}
