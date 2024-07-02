package edu.classtrack.repository;

import edu.classtrack.dto.FacultyAttendance;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FacultyAttendanceRepository implements CollegeRepository<FacultyAttendance> {

    @PersistenceContext
    private EntityManager entityManager;

    public List<FacultyAttendance> findAll() {
        return entityManager.createQuery("SELECT c FROM FacultyAttendance c", FacultyAttendance.class).getResultList();
    }

    public FacultyAttendance findById(Long id) {
        return entityManager.find(FacultyAttendance.class, id);
    }

    @Transactional
    public FacultyAttendance save(FacultyAttendance facultyattendance) {
        entityManager.persist(facultyattendance);
        return facultyattendance;
    }

    @Transactional
    public FacultyAttendance update(FacultyAttendance facultyattendance) {
        FacultyAttendance existingFacultyAttendance = entityManager.find(FacultyAttendance.class, facultyattendance.getId());
        if(existingFacultyAttendance == null)
            return null;
        return entityManager.merge(facultyattendance);
    }

    @Transactional
    public String delete(Long id) {
        FacultyAttendance facultyattendance = entityManager.find(FacultyAttendance.class, id);
        if(facultyattendance != null){
            try {
                entityManager.remove(facultyattendance);
            } catch (Exception e) {
                return "Error deleting the facultyattendance: " + e.getMessage();
            }
            return "FacultyAttendance deleted successfully!";
        }
        return "FacultyAttendance not found!";
    }
}
