package org.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringMvcDemoApplication.class, args);
        System.out.println("Hello World");
    }

}
