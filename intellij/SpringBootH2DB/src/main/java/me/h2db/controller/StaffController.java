package me.h2db.controller;

import jakarta.validation.Valid;
import me.h2db.dto.Staff;
import me.h2db.service.StaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    // Constructor injection for StaffService
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    // Get all staff
    @GetMapping("/all")
    public ResponseEntity<List<Staff>> getAllStaff() {
        List<Staff> staffList = staffService.getAllStaff();
        return ResponseEntity.ok(staffList);
    }

    // Get staff by role
    @GetMapping("/role/{role}")
    public ResponseEntity<?> getStaffByRole(@Valid @PathVariable String role) {
        List<Staff> staffList = staffService.getStaffByRole(role);
        if (staffList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("No staff found with role " + role);
        }
        return ResponseEntity.ok(staffList);
    }

    // Get staff by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getStaffById(@PathVariable int id) {
        Staff staff = staffService.getStaffById(id);
        if (staff == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("No staff found with id " + id);
        }
        return ResponseEntity.ok(staff);
    }

    // Get staff by experience
    @GetMapping("/experience/{exp}")
    public ResponseEntity<?> getStaffByExperience(@PathVariable int exp) {
        List<Staff> staffList = staffService.getStaffAboveExp(exp);
        if (staffList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body("No staff found with experience greater than " + exp + " years");
        }
        return ResponseEntity.ok(staffList);
    }

    // Add a new staff
    @PostMapping("/add")
    public ResponseEntity<String> addStaff(@Valid @RequestBody Staff staff) {
        staff.setStaffId(0); // Setting staff ID to 0 to ensure it is null
        boolean isAdded = staffService.addStaff(staff);
        if (isAdded) {
            return ResponseEntity.status(HttpStatus.CREATED)
                                 .body("Staff added successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                 .body("Failed to add staff");
        }
    }

    // Update an existing staff
    @PutMapping("/update")
    public ResponseEntity<String> updateStaff(@Valid @RequestBody Staff staff) {
        boolean isUpdated = staffService.updateStaff(staff);
        if (isUpdated) {
            return ResponseEntity.ok("Staff updated successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                 .body("Failed to update staff");
        }
    }

    // Delete a staff member
    @DeleteMapping("/delete/{staffId}")
    public ResponseEntity<String> deleteStaff(@PathVariable int staffId) {
        boolean isDeleted = staffService.deleteStaff(staffId);
        if (isDeleted) {
            return ResponseEntity.ok("Staff deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                 .body("Failed to delete staff");
        }
    }
}
