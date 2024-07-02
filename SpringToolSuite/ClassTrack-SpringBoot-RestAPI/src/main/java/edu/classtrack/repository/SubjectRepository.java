package edu.classtrack.repository;

import edu.classtrack.dto.Subject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SubjectRepository implements CollegeRepository<Subject>{

    @PersistenceContext
    private EntityManager entityManager;

    public List<Subject> findAll() {
        return entityManager.createQuery("SELECT c FROM Subject c", Subject.class).getResultList();
    }

    public Subject findById(Long id) {
        return entityManager.find(Subject.class, id);
    }

    @Transactional
    public Subject save(Subject subject) {
        entityManager.persist(subject);
        return subject;
    }

    @Transactional
    public Subject update(Subject subject) {
        Subject existingSubject = entityManager.find(Subject.class, subject.getId());
        if(existingSubject == null)
            return null;
        return entityManager.merge(subject);
    }

    @Transactional
    public String delete(Long id) {
        Subject subject = entityManager.find(Subject.class, id);
        if(subject != null){
            try {
                entityManager.remove(subject);
            } catch (Exception e) {
                return "Error deleting the subject: " + e.getMessage();
            }
            return "Subject deleted successfully!";
        }
        return "Subject not found!";
    }
}
