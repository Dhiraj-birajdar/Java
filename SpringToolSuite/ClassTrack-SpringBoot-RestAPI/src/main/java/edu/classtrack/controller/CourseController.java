package edu.classtrack.controller;

import edu.classtrack.dto.Course;
import edu.classtrack.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CollegeService<Course> courseService;

    CourseController(CollegeService<Course> courseService) {
        this.courseService = courseService;
    }

    @GetMapping("")
    public List<Course> getAllCourses() {
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        Course course = courseService.findById(id);
        if(course == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(course);
    }

    @PostMapping("")
    public ResponseEntity<?> createCourse(@Valid @RequestBody Course course) {
        if(course == null)
            return ResponseEntity.badRequest().body("Course cannot be null");
        course.setId(null);
        return ResponseEntity.ok(courseService.save(course));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCourse(@PathVariable Long id,@Valid @RequestBody Course course) {
        if(id == null || course == null)
            return ResponseEntity.badRequest().body("ID and Course cannot be null");
        course.setId(id);
        Course updatedCourse = courseService.update(course);
        if(updatedCourse == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updatedCourse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        String s = courseService.delete(id);
        return ResponseEntity.ok(s);
    }
}

//• Course Endpoints:
//• GET /api/courses: Get all courses.
//• GET /api/courses/{id}: Get a specific course by ID.
//• POST /api/courses: Create a new course.
//• PUT /api/courses/{id}: Update an existing course.
//• DELETE /api/courses/{id}: Delete a course by ID.
