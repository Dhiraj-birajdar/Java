package edu.classtrack.repository;

import edu.classtrack.dto.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseRepository implements CollegeRepository<Course>{

    @PersistenceContext
    private EntityManager entityManager;

    public List<Course> findAll() {
        return entityManager.createQuery("SELECT c FROM Course c", Course.class).getResultList();
    }

    public Course findById(Long id) {
        return entityManager.find(Course.class, id);
    }

    @Transactional
    public Course save(Course course) {
        entityManager.persist(course);
        return course;
    }

    @Transactional
    public Course update(Course course) {
        Course existingCourse = entityManager.find(Course.class, course.getId());
        if(existingCourse == null)
            return null;
        return entityManager.merge(course);
    }

    @Transactional
    public String delete(Long id) {
        Course course = entityManager.find(Course.class, id);
        if(course != null){
            try {
                entityManager.remove(course);
            } catch (Exception e) {
                return "Error deleting the course: " + e.getMessage();
            }
            return "Course deleted successfully!";
        }
        return "Course not found!";
    }
}
