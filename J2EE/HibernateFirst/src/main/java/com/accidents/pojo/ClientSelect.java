package com.accidents.pojo;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		System.out.println(cfg.getProperty("connection.username"));
//		cfg.addAnnotatedClass(Car.class); // or specify in hibernate.cfg.xml file
		SessionFactory factory = cfg.buildSessionFactory();		
		Session session = factory.openSession();		
		Car car = session.get(Car.class,1);
		System.out.println(car);
		System.out.println(session.get(Car.class, 2).getCompany());
//		session.
		System.out.println();
	}

}
