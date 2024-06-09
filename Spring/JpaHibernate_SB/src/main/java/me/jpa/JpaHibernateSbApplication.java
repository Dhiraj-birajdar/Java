package me.jpa;

import me.jpa.dto.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaHibernateSbApplication {

    public static void main(String[] args) {

        SpringApplication.run(JpaHibernateSbApplication.class, args);

        User u = new User();
        System.out.println(u);


    }

//    static void hi(String string, int id, boolean flag, short number)

}
