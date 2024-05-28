package com.college;

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
	
		
		FacultyMain.addFaculty(session, new Faculty("john"), "c", "c++");
		
		session.close();
		sessionFactory.close();
	}

	static void addFaculty(Session session, Faculty faculty, String...subs) {
		
		Transaction transaction = session.beginTransaction();
		List<Subject> ls = new ArrayList<>();
		for(String sub: subs) 
			ls.add(new Subject(sub));		
		faculty.setSubjects(ls);
		session.save(faculty);
		transaction.commit();
	}
}
