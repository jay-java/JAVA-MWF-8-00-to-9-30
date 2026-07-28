package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext con = new ClassPathXmlApplicationContext("com/orm/springorm.xml");
		UserDAO dao = (UserDAO) con.getBean("dao");
		User u1 = new User(1, "java", 987654321, "xyz");
		dao.createUser(u1);
	}
}
