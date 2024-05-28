package org.criteria_query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        //reads 1 row with id 1 as Employee object
//        Employee employee = session.load(Employee.class, 1);
//        System.out.println(employee);

//        creates a new Employee object and saves it to the database
//        employee = new Employee("Jamie", "dev", "john@mail.com", 10000, 25, 2);
//        session.save(employee);

        //updates the email of the employee with id 1
//        employee = session.load(Employee.class, 1);
//        employee.setEmail("radha@mail.com");
//        session.update(employee);
//        System.out.println(session.load(Employee.class, 1));

        //deletes the employee with id 8
//        employee = session.load(Employee.class, 8);
//        session.delete(employee);

//        employee = new Employee("Jamie", "dev", "john@mail.com", 10000, 25, 2);
//        session.saveOrUpdate(employee);

        Employee e1 = new Employee("Jamie", "dev", "@mail.com", 10000, 25, 2);
        Employee e2 = new Employee("Jamie", "dev", "@mail.com", 10000, 25, 2);
        System.out.println(e1.equals(e2)); //true

        Employee e3 = session.load(Employee.class, 1);
        Employee e4 = session.load(Employee.class, 1);
        System.out.println(e3.equals(e4)); //false

        transaction.commit();
    }
}