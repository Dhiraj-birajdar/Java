package edu.classtrack.repository;

import edu.classtrack.dto.ClassSchedule;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassScheduleRepository implements CollegeRepository<ClassSchedule> {

    @PersistenceContext
    private EntityManager entityManager;

    public List<ClassSchedule> findAll() {
        return entityManager.createQuery("SELECT c FROM ClassSchedule c", ClassSchedule.class).getResultList();
    }

    public ClassSchedule findById(Long id) {
        return entityManager.find(ClassSchedule.class, id);
    }

    @Transactional
    public ClassSchedule save(ClassSchedule classSchedule) {
        entityManager.persist(classSchedule);
        return classSchedule;
    }

    @Transactional
    public ClassSchedule update(ClassSchedule classSchedule) {
        ClassSchedule existingClassSchedule = entityManager.find(ClassSchedule.class, classSchedule.getId());
        if(existingClassSchedule == null)
            return null;
        return entityManager.merge(classSchedule);
    }

    @Transactional
    public String delete(Long id) {
        ClassSchedule classSchedule = entityManager.find(ClassSchedule.class, id);
        if(classSchedule != null){
            try {
                entityManager.remove(classSchedule);
            } catch (Exception e) {
                return "Error deleting the class schedule: " + e.getMessage();
            }
            return "Class schedule deleted successfully!";
        }
        return "Class schedule not found!";
    }
}
