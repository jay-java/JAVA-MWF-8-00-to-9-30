package consInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext con = new ClassPathXmlApplicationContext("consInjection/consInjections.xml");

		User u1 = (User) con.getBean("u1");
		System.out.println(u1);

	}
}
