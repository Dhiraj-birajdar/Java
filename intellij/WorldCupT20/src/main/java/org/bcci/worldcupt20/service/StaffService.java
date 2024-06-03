package org.bcci.worldcupt20.service;

import org.bcci.worldcupt20.dao.StaffDao;
import org.bcci.worldcupt20.dto.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StaffService {

    public final StaffDao staffDao;

    @Autowired
    public StaffService(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    public List<Staff> getAllStaff() {
        return staffDao.getAllStaff();
    }

    public Staff getCaptain() {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getRole().equals("Captain"))
                .findFirst()
                .orElse(null);
    }

    public Staff getCoach() {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getRole().equals("Head Coach"))
                .findFirst()
                .orElse(null);
    }

    public List<Staff> getBatsmans() {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getRole().equals("Batsman"))
                .toList();
    }

    public List<Staff> getBowlers() {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getRole().equals("Bowler"))
                .toList();
    }

    public List<Staff> getCoaches() {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getRole().contains("Coach"))
                .toList();
    }

    public List<HashMap<String,String>> getStaffNames() {
        return staffDao.getAllStaff()
                .stream()
                .map(staff -> {
                    HashMap<String, String> staffName = new HashMap<>();
                    staffName.put("firstName", staff.getFirstName());
                    staffName.put("lastName", staff.getLastName());
                    return staffName;
                })
                .toList();
    }

    public List<Staff> getHighestPaidStaff() {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getSalary() > 1000000)
                .toList();
    }
}
