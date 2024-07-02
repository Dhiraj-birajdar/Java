package edu.classtrack.controller;

import edu.classtrack.dto.Subject;
import edu.classtrack.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    private final CollegeService<Subject> subjectService;

    SubjectController(CollegeService<Subject> subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("")
    public List<Subject> getAllSubjects() {
        return subjectService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSubjectById(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        Subject subject = subjectService.findById(id);
        if(subject == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(subject);
    }

    @PostMapping("")
    public ResponseEntity<?> createSubject(@Valid @RequestBody Subject subject) {
        if(subject == null)
            return ResponseEntity.badRequest().body("Subject cannot be null");
        subject.setId(null);
        return ResponseEntity.ok(subjectService.save(subject));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSubject(@PathVariable Long id,@Valid @RequestBody Subject subject) {
        if(id == null || subject == null)
            return ResponseEntity.badRequest().body("ID and Subject cannot be null");
        subject.setId(id);
        Subject updatedSubject = subjectService.update(subject);
        if(updatedSubject == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updatedSubject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSubject(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        String s = subjectService.delete(id);
        return ResponseEntity.ok(s);
    }
}

//• Subject Endpoints:
//• GET /api/subjects: Get all subjects.
//• GET /api/subjects/{id}: Get a specific subject by ID.
//• POST /api/subjects: Create a new subject.
//• PUT /api/subjects/{id}: Update an existing subject.
//• DELETE /api/subjects/{id}: Delete a subject by ID.
