package edu.classtrack.controller;

import edu.classtrack.dto.Classroom;
import edu.classtrack.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {

    private final CollegeService<Classroom> classroomService;

    ClassroomController(CollegeService<Classroom> classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping("")
    public List<Classroom> getAllClassrooms() {
        return classroomService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClassroomById(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        Classroom classroom = classroomService.findById(id);
        if(classroom == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(classroom);
    }

   @PostMapping("")
    public ResponseEntity<?> createClassroom(@Valid @RequestBody Classroom classroom) {
        if(classroom == null)
            return ResponseEntity.badRequest().body("Classroom cannot be null");
        classroom.setId(null);
        return ResponseEntity.ok(classroomService.save(classroom));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateClassroom(@PathVariable Long id,@Valid @RequestBody Classroom classroom) {
        if (id == null || classroom == null)
            return ResponseEntity.badRequest().body("ID and Classroom cannot be null");
        classroom.setId(id);
        Classroom updatedClassroom = classroomService.update(classroom);
        if (updatedClassroom == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updatedClassroom);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClassroom(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        String s = classroomService.delete(id);
        return ResponseEntity.ok(s);
    }

}

//• Classroom Endpoints:
//• GET /api/classrooms: Get all classrooms.
//• GET /api/classrooms/{id}: Get a specific classroom by ID.
//• POST /api/classrooms: Create a new classroom.
//• PUT /api/classrooms/{id}: Update an existing classroom.
//• DELETE /api/classrooms/{id}: Delete a classroom by ID.