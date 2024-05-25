package org.accidents.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();
        System.out.println(cfg.getProperty("connection.username"));
//		cfg.addAnnotatedClass(Car.class); // or specify in hibernate.cfg.xml file
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tr = session.beginTransaction();
		Car carI = new Car(3, "Bugatti", "jon", 9999999.0);

		Car car = session.get(Car.class,2);
		car.setCompany("Tata");
		session.persist(carI);
		session.merge(car);
		session.remove(car);
		session.saveOrUpdate(carI);
		tr.commit();

        System.out.println(car);
//        System.out.println(session.get(Car.class, 2).getCompany());
    }

}
