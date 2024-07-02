package com.bmisort;

import com.bmisort.entity.Student;
import com.bmisort.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@ComponentScan("com")
public class BmiSortApplication {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(BmiSortApplication.class, args)
			.getBean(BmiSortApplication.class)
			.run();
	}

	private void run() {
		List<Student> ls= new ArrayList<>();
		ls.add(new Student("aman",12.0,51.2,23.3));
		ls.add(new Student("bill",52.0,81.5,33.1));
		ls.add(new Student("casie",12.1,31.4,73.4));
		ls.add(new Student("dave",42.3,31.4,13.4));

		Collections.sort(ls);
		ls.forEach(System.out::println);

		studentRepository.saveAll(ls);
	}
}
