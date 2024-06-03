package org.bcci.worldcupt20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "org.bcci.worldcupt20")
@EntityScan(basePackages = "org.bcci.worldcupt20.dto")
public class WorldCupT20Application {

    public static void main(String[] args) {
        SpringApplication.run(WorldCupT20Application.class, args);
    }

}
