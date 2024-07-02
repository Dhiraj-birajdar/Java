package edu.classtrack.repository;

import edu.classtrack.dto.Classroom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassroomRepository implements CollegeRepository<Classroom> {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Classroom> findAll() {
        return entityManager.createQuery("SELECT c FROM Classroom c", Classroom.class).getResultList();
    }

    public Classroom findById(Long id) {
        return entityManager.find(Classroom.class, id);
    }

    @Transactional
    public Classroom save(Classroom classroom) {
        entityManager.persist(classroom);
        return classroom;
    }

    @Transactional
    public Classroom update(Classroom classroom) {
        Classroom existingClassroom = entityManager.find(Classroom.class, classroom.getId());
        if(existingClassroom == null)
            return null;
        return entityManager.merge(classroom);
    }

    @Transactional
    public String delete(Long id) {
        Classroom classroom = entityManager.find(Classroom.class, id);
        if(classroom != null){
            try {
                entityManager.remove(classroom);
//                entityManager.flush();
            } catch (Exception e) {
                return "Error deleting the classroom: " + e.getMessage();
            }
            return "Classroom deleted successfully!";
        }
        return "Classroom not found!";
    }

}
