package org.bcci.worldcupt20.controller;

import org.bcci.worldcupt20.dto.Staff;
import org.bcci.worldcupt20.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/all")
    public List<Staff> getAllStaff() {
        return staffService.getAllStaff();
    }

    @CrossOrigin("http://localhost:4200")
    @GetMapping("/captain")
    public Staff getCaptain() {
        return staffService.getCaptain();
    }

    @GetMapping("/coach")
    public Staff getCoach() {
        return staffService.getCoach();
    }

    @GetMapping("/batsmans")
    public List<Staff> getBatsmans() {
        return staffService.getBatsmans();
    }

    @GetMapping("/bowlers")
    public List<Staff> getBowlers() {
        return staffService.getBowlers();
    }

    @GetMapping("/coaches")
    public List<Staff> getCoaches() {
        return staffService.getCoaches();
    }

    @GetMapping("/staff")
    public List<HashMap<String, String>> getStaffNames() {
        return staffService.getStaffNames();
    }

    @GetMapping("/highestpaid")
    public List<Staff> getHighestPaidStaff() {
        return staffService.getHighestPaidStaff();
    }

}
