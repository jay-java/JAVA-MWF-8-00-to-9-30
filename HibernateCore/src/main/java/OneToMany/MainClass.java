package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student1 s1 = new Student1();
		s1.setId(1);
		s1.setName("abc");
		s1.setContact(98765321);

		Course1 c1 = new Course1();
		c1.setCid(1);
		c1.setCname("java");
		c1.setCduration("6 months");

		Course1 c2 = new Course1();
		c2.setCid(2);
		c2.setCname("python");
		c2.setCduration("4 months");

		List<Course1> courseList = new ArrayList<Course1>();
		courseList.add(c1);
		courseList.add(c2);

		s1.setCourses(courseList);

		c1.setStudent(s1);
		c2.setStudent(s1);

		session.save(s1);
		session.save(c1);
		session.save(c2);

		tx.commit();
		session.close();
		sf.close();
	}
}
