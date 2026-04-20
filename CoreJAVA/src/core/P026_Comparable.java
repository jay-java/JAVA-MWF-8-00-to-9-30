package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
	int id;
	String name;
	int age;

	Students(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Students o) {
		return this.age - o.age;
	}

}

public class P026_Comparable {
	public static void main(String[] args) {
		Students s1 = new Students(1, "java", 32);
		Students s2 = new Students(2, "python", 87);
		Students s3 = new Students(3, "dot net", 12);
		Students s4 = new Students(4, "kotlin", 42);
		Students s5 = new Students(5, "node", 62);
		List<Students> studentsList = new ArrayList<Students>();
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);

		System.out.println(studentsList);
		for (Students s : studentsList) {
			System.out.println(s);
		}

		Collections.sort(studentsList);
		for (Students s : studentsList) {
			System.out.println(s);
		}
	}
}
