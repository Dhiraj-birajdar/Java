package com.bmisort.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student implements Comparable<Student> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name ;
    Double height;
    Double weight;
    Double age;
Double bmi;
    public Student(String name, Double h, Double w, Double a){
        this.name = name;
        weight = w;
        height = h;
        age = a;

        bmi = w/(h*h);
    }

    public Student() {

    }


    @Override
    public int compareTo(Student o) {
         return this.bmi.compareTo(o.getBmi());
    }
}
