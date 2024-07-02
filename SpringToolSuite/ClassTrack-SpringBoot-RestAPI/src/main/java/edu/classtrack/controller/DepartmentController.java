package edu.classtrack.controller;

import edu.classtrack.dto.Department;
import edu.classtrack.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final CollegeService<Department> departmentService;

    DepartmentController( CollegeService<Department> departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("")
    public List<Department> getAllDepartments() {
        return departmentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDepartmentById(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        Department department = departmentService.findById(id);
        if(department == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(department);
    }

    @PostMapping("")
    public ResponseEntity<?> createDepartment(@Valid @RequestBody Department department) {
        if(department == null)
            return ResponseEntity.badRequest().body("Department cannot be null");
        department.setId(null);
        return ResponseEntity.ok(departmentService.save(department));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateDepartment(@PathVariable Long id,@Valid @RequestBody Department department) {
        if(id == null || department == null)
            return ResponseEntity.badRequest().body("ID and Department cannot be null");
        department.setId(id);
        Department updatedDepartment = departmentService.update(department);
        if(updatedDepartment == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updatedDepartment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDepartment(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        String s = departmentService.delete(id);
        return ResponseEntity.ok(s);
    }
}



//• Department Endpoints:
//• GET /api/departments: Get all departments.
//• GET /api/departments/{id}: Get a specific department by ID.
//• POST /api/departments: Create a new department.
//• PUT /api/departments/{id}: Update an existing department.
//• DELETE /api/departments/{id}: Delete a department by ID.