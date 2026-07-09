package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		User u1 = new User(1, "java", 987654321, "ahmedabad", "java@gmail.com", "java@123");
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(u1);

		tx.commit();
		session.close();
		sf.close();
	}
}
