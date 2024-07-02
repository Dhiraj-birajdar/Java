package edu.classtrack.repository;

import edu.classtrack.dto.Department;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository implements CollegeRepository<Department>{

    @PersistenceContext
    private EntityManager entityManager;

    public List<Department> findAll() {
        return entityManager.createQuery("SELECT c FROM Department c", Department.class).getResultList();
    }

    public Department findById(Long id) {
        return entityManager.find(Department.class, id);
    }

    @Transactional
    public Department save(Department department) {
        entityManager.persist(department);
        return department;
    }

    @Transactional
    public Department update(Department department) {
        Department existingDepartment = entityManager.find(Department.class, department.getId());
        if(existingDepartment == null)
            return null;
        return entityManager.merge(department);
    }

    @Transactional
    public String delete(Long id) {
        Department department = entityManager.find(Department.class, id);
        if(department != null){
            try {
                entityManager.remove(department);
            } catch (Exception e) {
                return "Error deleting the department: " + e.getMessage();
            }
            return "Department deleted successfully!";
        }
        return "Department not found!";
    }
}
