package org.bcci.worldcupt20.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.bcci.worldcupt20.dto.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StaffDao {

    @PersistenceContext
    private EntityManager entityManager;
    List<Staff> staffList;


    public List<Staff> getAllStaff() {
        if (staffList == null) {
            staffList = entityManager.createQuery("SELECT s FROM Staff s", Staff.class).getResultList();
        }
        return staffList;
    }

    @Transactional
    public boolean addStaff(Staff staff) {

        try {
            entityManager.persist(staff);
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
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            return false;
        }
    }
}
