package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
//		User u1 = new User("flutter", 487654321, "mumbai", "flutter@gmail.com", "flutter@123");
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		// to store data into databse
//		session.save(u1);

		// to fetch data
//		User u = session.get(User.class, 2);
//		System.out.println(u);

		// to update data
//		User u1 = new User(3, "flutter", 487654321, "kolkata", "flutter@gmail.com", "flutter@123");
//		session.update(u1);

		// HQl - hibernate query language
//		select * from table_name; -> MySQL
//		from User; -> HQL

		// tp update data
//		update tb_name set name=? where id=?; -> MySQl
//		update User set name=:?,contact=:? where id=:id?;

		// to delete data

		// delete user
		User u1 = new User(3, "flutter", 487654321, "kolkata", "flutter@gmail.com", "flutter@123");
		session.delete(u1);

		tx.commit();
		session.close();
		sf.close();
	}
}
