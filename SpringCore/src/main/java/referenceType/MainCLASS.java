package referenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCLASS {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("referenceType/refrence.xml");
		User u = (User) con.getBean("u1");
		System.out.println(u);
	}
}
