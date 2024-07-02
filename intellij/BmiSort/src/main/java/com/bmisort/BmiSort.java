package com.bmisort;


import com.bmisort.entity.Student;

import java.util.Comparator;

public class BmiSort implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getBmi().compareTo(o2.getBmi());
    }
}
