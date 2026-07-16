package ManyToMany;

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

		Student2 s1 = new Student2();
		s1.setId(1);
		s1.setName("abc");
		s1.setContact(98765321);

		Student2 s2 = new Student2();
		s2.setId(2);
		s2.setName("user");
		s2.setContact(98765321);

		Course2 c1 = new Course2();
		c1.setCid(1);
		c1.setCname("java");
		c1.setCduration("6 months");

		Course2 c2 = new Course2();
		c2.setCid(2);
		c2.setCname("python");
		c2.setCduration("4 months");

		List<Course2> courseList = new ArrayList<Course2>();
		courseList.add(c1);
		courseList.add(c2);

		List<Student2> studentList = new ArrayList<Student2>();
		studentList.add(s1);
		studentList.add(s2);

		s1.setCourses(courseList);
		s2.setCourses(courseList);

		c1.setStudent(studentList);
		c2.setStudent(studentList);

		session.save(s1);
		session.save(s2);
		session.save(c1);
		session.save(c2);

		tx.commit();
		session.close();
		sf.close();

	}
}
