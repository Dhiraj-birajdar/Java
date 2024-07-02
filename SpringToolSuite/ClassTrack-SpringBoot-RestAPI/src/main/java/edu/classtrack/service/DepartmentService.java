package edu.classtrack.service;

import edu.classtrack.dto.Department;
import edu.classtrack.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService implements CollegeService<Department> {

    private final CollegeRepository<Department> departmentRepository;

    public DepartmentService(CollegeRepository<Department> departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public Department findById(Long id) {
        return departmentRepository.findById(id);
    }

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public Department update(Department department) {
        return departmentRepository.update(department);
    }

    public String delete(Long id) {
        return departmentRepository.delete(id);
    }

}
