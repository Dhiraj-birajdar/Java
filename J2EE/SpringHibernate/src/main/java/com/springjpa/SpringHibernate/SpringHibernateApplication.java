package com.springjpa.SpringHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springjpa")
@EntityScan("com.springjpa.dto")
public class SpringHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateApplication.class, args);
	}
}
