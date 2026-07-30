package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext con = new ClassPathXmlApplicationContext("com/orm/springorm.xml");
		UserDAO dao = (UserDAO) con.getBean("dao");
//		User u1 = new User(3, "dart", 9876543210l, "delhi");
//		dao.createUser(u1);

		// to fetch data from db
//		User u1= dao.getUserById(1);
//		System.out.println(u1);

//		User u1 = new User(3, "flutter", 9876543210l, "delhi");
//		dao.updateUser(u1);

//		dao.deleteUser(1);

	}
}
