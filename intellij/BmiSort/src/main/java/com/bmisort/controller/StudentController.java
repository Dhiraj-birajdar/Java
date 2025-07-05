package com.bmisort.controller;

import com.bmisort.BmiSort;
import com.bmisort.entity.Student;
import com.bmisort.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
	private StudentService studentService;


    @GetMapping("/students")
    public List<Student> saveAnd(){
		List<Student> ls= new ArrayList<>();
		ls.add(new Student("a",12.0,51.2,23.3));
		ls.add(new Student("b",52.0,81.5,33.1));
		ls.add(new Student("c",12.1,31.4,73.4));
		ls.add(new Student("d",42.3,31.4,13.4));
//		gfdf



		Collections.sort(ls);
		ls.forEach(System.out::println);

		studentService.save(ls);

		return ls;
	}

	@GetMapping("/{n}")
	public String print(@PathVariable int n) {
		return studentService.pascal(n);
	}

	@GetMapping("/upto/{n}")
	public String printn(@PathVariable int n){
		StringBuilder sb = new StringBuilder("");
		for (int i = 1; i <= n; i++) {
			System.out.println(studentService.pascal(i));
			sb.append("<br>"+studentService.pascal(i));
		}
		return sb.toString();
	}
}
