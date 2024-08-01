package com.dhiraj.reactive;

import com.dhiraj.reactive.student.Student;
import com.dhiraj.reactive.student.StudentRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveWebR2DbcApplication {

    public static void main(String[] args) {

		SpringApplication.run(ReactiveWebR2DbcApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner runner(StudentRepository repository) {
//		Faker fake = new Faker();
//        return args -> {
//            for (int i = 0; i < 5; i++) {
//                repository.save(
//                        Student.builder()
//                                .firstname(fake.name().firstName())
//                                .lastname(fake.name().lastName())
//								.address(fake.address().fullAddress())
//								.phone(fake.phoneNumber().cellPhone())
//                                .age(fake.number().numberBetween(12,25))
//                                .build()
//                ).subscribe();
//            }
//        };
//    }
}
