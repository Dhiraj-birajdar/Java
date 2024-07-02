package edu.classtrack.controller;

import edu.classtrack.dto.ClassSchedule;
import edu.classtrack.service.CollegeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classschedules")
public class ClassScheduleController {

    private final CollegeService<ClassSchedule> classScheduleService;

    public ClassScheduleController(CollegeService<ClassSchedule> classScheduleService) {
        this.classScheduleService = classScheduleService;
    }

    @GetMapping("")
    public List<ClassSchedule> getAllClassSchedules() {
        return classScheduleService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClassScheduleById(@PathVariable Long id) {
        if (id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        ClassSchedule classSchedule = classScheduleService.findById(id);
        if (classSchedule == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(classSchedule);
    }

    @PostMapping("")
    public ResponseEntity<?> createClassSchedule(@Valid @RequestBody ClassSchedule classSchedule) {
        if (classSchedule == null)
            return ResponseEntity.badRequest().body("Class schedule cannot be null");
        classSchedule.setId(null);
        return ResponseEntity.ok(classScheduleService.save(classSchedule));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateClassSchedule(@PathVariable Long id,@Valid @RequestBody ClassSchedule classSchedule) {
        if (id == null || classSchedule == null)
            return ResponseEntity.badRequest().body("ID and Class schedule cannot be null");
        classSchedule.setId(id);
        ClassSchedule updatedClassSchedule = classScheduleService.update(classSchedule);
        if (updatedClassSchedule == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(updatedClassSchedule);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClassSchedule(@PathVariable Long id) {
        if (id == null)
            return ResponseEntity.badRequest().body("ID cannot be null");
        String s = classScheduleService.delete(id);
        return ResponseEntity.ok(s);
    }

}

//• Class Schedule Endpoints:
//• GET /api/classSchedules: Get all class schedules.
//• GET /api/classSchedules/{id}: Get a specific class schedule by ID.
//• POST /api/classSchedules: Create a new class schedule.
//• PUT /api/classSchedules/{id}: Update an existing class schedule.
//• DELETE /api/classSchedules/{id}: Delete a class schedule by ID