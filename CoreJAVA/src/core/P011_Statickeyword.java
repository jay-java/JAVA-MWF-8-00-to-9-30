package core;

import java.sql.Date;

class Student {
	int id;
	String name;
	long contact;
	static String col_name = "XYZ";

	public void data() {
		System.out.println("data in student class");
	}

	public static void call() {
		System.out.println("call static in student class");
	}

}

public class P011_Statickeyword {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "java";
		s1.contact = 987654321;

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.contact);
		System.out.println(s1.col_name);

		s1.data();
		Student.call();

		Student s2 = new Student();
		s2.id = 2;
		s2.name = "python";
		s2.contact = 98743454321l;

	}
}
