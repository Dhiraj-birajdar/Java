package me.h2db.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import me.h2db.dto.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StaffDao {

    @PersistenceContext
    private EntityManager entityManager;
    List<Staff> staffList;
    boolean isStaffListUpdated = false;


    public List<Staff> getAllStaff() {
        if (!isStaffListUpdated) {
            staffList = entityManager.createQuery("SELECT s FROM Staff s", Staff.class).getResultList();
            isStaffListUpdated = true;
        }
        return staffList;
    }

    @Transactional
    public boolean addStaff(Staff staff) {

        try {
            entityManager.persist(staff);
            isStaffListUpdated = false;
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Transactional
    public boolean updateStaff(Staff staff) {
        try {
            entityManager.merge(staff);
            isStaffListUpdated = false;
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }

    @Transactional
    public boolean deleteStaff(int staffId) {
        try {
            Staff staff = entityManager.find(Staff.class, staffId);
            entityManager.remove(staff);
            isStaffListUpdated = false;
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
