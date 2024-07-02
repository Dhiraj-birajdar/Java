package edu.classtrack.repository;

import edu.classtrack.dto.Faculty;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacultyRepository implements CollegeRepository<Faculty>{

    @PersistenceContext
    private EntityManager entityManager;

    public List<Faculty> findAll() {
        return entityManager.createQuery("SELECT c FROM Faculty c", Faculty.class).getResultList();
    }

    public Faculty findById(Long id) {
        return entityManager.find(Faculty.class, id);
    }

    @Transactional
    public Faculty save(Faculty faculty) {
        String email = faculty.getEmail();
        Faculty existingFaculty = entityManager.createQuery("SELECT c FROM Faculty c WHERE c.email = :email", Faculty.class)
                .setParameter("email", email)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
        if(existingFaculty == null){
            entityManager.persist(faculty);
            return faculty;

        }
        return null;
    }

    @Transactional
    public Faculty update(Faculty faculty) {
        Faculty existingFaculty = entityManager.find(Faculty.class, faculty.getId());
        if(existingFaculty == null)
            return null;
        String email = faculty.getEmail();
        if(!existingFaculty.getEmail().equals(email)){
            Faculty facultyByEmail = entityManager.createQuery("SELECT c FROM Faculty c WHERE c.email = :email", Faculty.class)
                    .setParameter("email", email)
                    .getResultList()
                    .stream()
                    .findFirst()
                    .orElse(null);
            if(facultyByEmail != null)
                return null;
        }
        return entityManager.merge(faculty);
    }

    @Transactional
    public String delete(Long id) {
        Faculty faculty = entityManager.find(Faculty.class, id);
        if(faculty != null){
            try {
                entityManager.remove(faculty);
            } catch (Exception e) {
                return "Error deleting the faculty: " + e.getMessage();
            }
            return "Faculty deleted successfully!";
        }
        return "Faculty not found!";
    }
}
