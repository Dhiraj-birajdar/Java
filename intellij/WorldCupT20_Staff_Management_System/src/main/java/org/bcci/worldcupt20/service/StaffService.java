package org.bcci.worldcupt20.service;

import org.bcci.worldcupt20.dao.StaffDao;
import org.bcci.worldcupt20.dto.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Service
public class StaffService {

    public StaffDao staffDao;

//    field/property injection of StaffDao needs auto-wiring
//    @Autowired
//    public StaffDao staffDao;

//    constructor injection of StaffDao on need of auto-wiring
//    public StaffService(StaffDao staffDao) {
//        this.staffDao = staffDao;
//    }


    //    setter injection of StaffDao needs auto-wiring
    @Autowired
    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    public List<Staff> getAllStaff() {
        return staffDao.getAllStaff();
    }

    public List<Staff> getStaffByRole(String role) {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getRole().toLowerCase().contains(role))
                .toList();
    }

    public Staff getStaffById(int id) {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> staff.getStaffId() == id)
                .findAny()
                .orElse(null);
    }

    public List<Staff> getStaffAboveExp(int exp) {
        return staffDao.getAllStaff()
                .stream()
                .filter(staff -> LocalDateTime.now().getYear() - staff.getHireDate().getYear() > exp)
                .toList();
    }

    public boolean addStaff(Staff staff) {
        return staffDao.addStaff(staff);
    }

    public boolean updateStaff(Staff staff) {
        return staffDao.updateStaff(staff);
    }

    public boolean deleteStaff(int staffId) {
        return staffDao.deleteStaff(staffId);
    }
}
