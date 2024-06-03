package org.bcci.worldcupt20.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.bcci.worldcupt20.dto.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StaffDao {

    @PersistenceContext
    private EntityManager entityManager;
    List<Staff> staffList;


    public List<Staff> getAllStaff() {
        if(staffList == null) {
            staffList = entityManager.createQuery("SELECT s FROM Staff s", Staff.class).getResultList();
        }
        return staffList;
    }
}
