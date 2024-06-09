package me.app;

import me.app.service.TravelService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJavaConfigApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringJavaConfigApplication.class, args);
        TravelService travelService = applicationContext.getBean(TravelService.class);
        travelService.travel();
    }

}
