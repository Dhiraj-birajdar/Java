package edu.classtrack.controller;

import edu.classtrack.dto.FacultyAttendance;
import edu.classtrack.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/faculty-attendances")
public class FacultyAttendanceController {

    private final CollegeService<FacultyAttendance> facultyAttendanceService;

    FacultyAttendanceController(CollegeService<FacultyAttendance> facultyAttendanceService) {
        this.facultyAttendanceService = facultyAttendanceService;
    }

    @GetMapping("")
    public List<FacultyAttendance> getAllFacultyAttendances() {
        return facultyAttendanceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFacultyAttendanceById(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        FacultyAttendance facultyAttendance = facultyAttendanceService.findById(id);
        if(facultyAttendance == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(facultyAttendance);
    }

    @PostMapping("")
    public ResponseEntity<?> createFacultyAttendance(@Valid @RequestBody FacultyAttendance facultyAttendance) {
        if(facultyAttendance == null)
            return ResponseEntity.badRequest().body("FacultyAttendance cannot be null");
        facultyAttendance.setId(null);
        return ResponseEntity.ok(facultyAttendanceService.save(facultyAttendance));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateFacultyAttendance(@PathVariable Long id,@Valid @RequestBody FacultyAttendance facultyAttendance) {
        if(id == null || facultyAttendance == null)
            return ResponseEntity.badRequest().body("ID and FacultyAttendance cannot be null");
        facultyAttendance.setId(id);
        FacultyAttendance updatedFacultyAttendance = facultyAttendanceService.update(facultyAttendance);
        if(updatedFacultyAttendance == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updatedFacultyAttendance);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFacultyAttendance(@PathVariable Long id) {
        if(id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        String s = facultyAttendanceService.delete(id);
        return ResponseEntity.ok(s);
    }
}

//• FacultyAttendance Endpoints:
//• GET /api/faculty-attendances: Get all facultyAttendances.
//• GET /api/faculty-attendances/{id}: Get a specific facultyAttendance by ID.
//• POST /api/faculty-attendances: Create a new facultyAttendance.
//• PUT /api/faculty-attendances/{id}: Update an existing facultyAttendance.
//• DELETE /api/faculty-attendances/{id}: Delete a facultyAttendance by ID.
