package edu.classtrack.service;

import edu.classtrack.dto.Course;
import edu.classtrack.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CollegeService<Course> {

    private final CollegeRepository<Course> courseRepository;

    public CourseService(CollegeRepository<Course> courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course findById(Long id) {
        return courseRepository.findById(id);
    }

    public Course save(Course course) {
        return courseRepository.save(course);
    }

    public Course update(Course course) {
        return courseRepository.update(course);
    }

    public String delete(Long id) {
        return courseRepository.delete(id);
    }

}
