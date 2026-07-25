package consAmbiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("consAmbiguity/consAmbiguity.xml");
		User u = (User) con.getBean("u1");
		System.out.println(u);
		
	}
}
