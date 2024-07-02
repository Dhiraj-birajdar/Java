package edu.classtrack.controller;

import edu.classtrack.dto.Faculty;
import edu.classtrack.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculties")
public class FacultyController {

    private final CollegeService<Faculty> facultyService;

    FacultyController(CollegeService<Faculty> facultyService) {
        this.facultyService = facultyService;
    }

    @GetMapping("")
    public List<Faculty> getAllFacultys() {
        return facultyService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFacultyById(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        Faculty faculty = facultyService.findById(id);
        if(faculty == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(faculty);
    }

    @PostMapping("")
    public ResponseEntity<?> createFaculty(@Valid @RequestBody Faculty faculty) {
        if(faculty == null)
            return ResponseEntity.badRequest().body("Faculty cannot be null");
        faculty.setId(null);
        Faculty f = facultyService.save(faculty);
        if(f == null)
            return ResponseEntity.badRequest().body("Faculty with email " + faculty.getEmail() + " already exists!");
        return ResponseEntity.ok(f);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateFaculty(@PathVariable Long id,@Valid @RequestBody Faculty faculty) {
        if(id == null || faculty == null)
            return ResponseEntity.badRequest().body("ID and Faculty cannot be null");
        faculty.setId(id);
        Faculty updatedfaculty = facultyService.update(faculty);
        if(updatedfaculty == null)
            return ResponseEntity.badRequest().body("Faculty with email " + faculty.getEmail() + " already exists! or Faculty with ID " + id + " does not exist!");
        return ResponseEntity.ok(updatedfaculty);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFaculty(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        String s = facultyService.delete(id);
        return ResponseEntity.ok(s);
    }
}

//• Faculty Endpoints:
//• GET /api/faculties: Get all faculties.
//• GET /api/faculties/{id}: Get a specific faculty by ID.
//• POST /api/faculties: Create a new faculty.
//• PUT /api/faculties/{id}: Update an existing faculty.
//• DELETE /api/faculties/{id}: Delete a faculty by ID.
