package com.accidentsreport;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Car.class);
		configuration.addAnnotatedClass(Location.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
	
		
		CarMain.addCar(session, new Car("porshe",new Location("pune")));
		
		session.close();
		sessionFactory.close();
	}

	static void addCar(Session session, Car car) {
		
		Transaction transaction = session.beginTransaction();
		session.save(car);
		transaction.commit();
	}
}
