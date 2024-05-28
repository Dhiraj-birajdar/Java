package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class FacultyMain {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Faculty.class);
		configuration.addAnnotatedClass(Subject.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Faculty faculty = new Faculty("sam");
		List<Subject> ls = new ArrayList<>();
		Subject s1= new Subject("math");
		Subject s2 = new Subject("python");
		session.save(s1);
		session.save(s2);
		ls.add(s1);
		ls.add(s2);
		faculty.setSubjects(ls);
		
		session.save(faculty);
		
		transaction.commit();
		
		System.out.println(faculty);
	}
}
