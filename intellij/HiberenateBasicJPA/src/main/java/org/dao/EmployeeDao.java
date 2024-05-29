package org.dao;

import org.dto.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDao {

    public EntityManager getEntityManager(){
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dhiraj");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        return entityManager;
        return Persistence.createEntityManagerFactory("dhiraj").createEntityManager();
    }

    public void saveEmployee(Employee employee){
        EntityManager entityManager = getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();
   }

   public void findEmployee(int id){
        EntityManager entityManager = getEntityManager();
        Employee employee = entityManager.find(Employee.class, id);
       System.out.println(employee);
   }

   public void updateEmployee(int id, Employee employee){
        EntityManager entityManager = getEntityManager();
        Employee dbEmployee1 = entityManager.find(Employee.class,id);
        if(dbEmployee1 != null){
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            employee.setId(dbEmployee1.getId());
            entityManager.merge(employee);

            entityTransaction.commit();
        }

   }
   public void removeEmployee(int id){
        EntityManager entityManager = getEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(entityManager.find(Employee.class,id));
        entityTransaction.commit();
   }
}
