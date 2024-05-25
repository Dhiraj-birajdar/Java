package com.accidents.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {
		ClientSelect cs = new ClientSelect();

		Configuration cfg = new Configuration();
		cfg.configure();
//		cfg.addAnnotatedClass(Car.class); // or specify in hibernate.cfg.xml file
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Car car = new Car(2, "Ford", "jon", 9999.0);
		cs.insert(session, car);

		car = session.get(Car.class, 1);
		car.setCost(698288.0);
		cs.update(session, car);

		car = session.get(Car.class, 2);
		cs.delete(session, car);

		car = new Car(6, "Range Rover", "bob", 999594.0);
		cs.saveOrUpdate(session, car);

		System.out.println("Success");
	}

	boolean insert(Session s, Car c) {
		Transaction tr = s.beginTransaction();
		int i = (int) s.save(c);
		tr.commit();
		return i > 0 ? true : false;
	}

	void update(Session s, Car c) {
		Transaction tr = s.beginTransaction();
		s.update(c);
		tr.commit();
	}

	void delete(Session s, Car c) {
		Transaction tr = s.beginTransaction();
		s.delete(c);
		tr.commit();
	}

	void saveOrUpdate(Session s, Car c) {
		Transaction tr = s.beginTransaction();
		s.saveOrUpdate(c);
		tr.commit();
	}
}
