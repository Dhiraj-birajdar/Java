package org.bcci.worldcupt20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@ComponentScan(basePackages = "org.bcci.worldcupt20")
@EntityScan(basePackages = "org.bcci.worldcupt20.dto")
@EnableAspectJAutoProxy
public class WorldCupT20Application {

    public static void main(String[] args) {

        SpringApplication.run(WorldCupT20Application.class, args);

        String s1 = "Hello";
        String s2 = s1.intern();
    }

}
