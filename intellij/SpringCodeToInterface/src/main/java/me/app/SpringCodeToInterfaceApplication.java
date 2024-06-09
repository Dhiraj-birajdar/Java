package me.app;

import me.app.model.Vehicle;
import me.app.service.PublicTransportationService;
import me.app.service.StateTransportationService;
import me.app.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCodeToInterfaceApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringCodeToInterfaceApplication.class, args);

// Get the bean of PublicTransportationService
        PublicTransportationService publicTransportationService = applicationContext.getBean(PublicTransportationService.class);
        Vehicle vehicle = publicTransportationService.startTrip();
        publicTransportationService.endTrip(vehicle);


        StateTransportationService stateTransportationService = applicationContext.getBean(StateTransportationService.class);
        Vehicle vehicle1 = stateTransportationService.startTrip();
        stateTransportationService.endTrip(vehicle1);


    }

}
