package com.bmisort.repository;

import com.bmisort.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {



    @Query("select name from Student where bmi =(select max(bmi) from Student)")
    public String max();
}
