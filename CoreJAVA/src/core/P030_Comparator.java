package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private double salary;

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId() - o2.getId();
	}

}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class P030_Comparator {
	public static void main(String[] args) {
		Employee e1 = new Employee(11, "java", 345756.4);
		Employee e2 = new Employee(23, "python", 545756.4);
		Employee e3 = new Employee(45, "dart", 565756.4);
		Employee e4 = new Employee(12, "kotlin", 435756.4);
		Employee e5 = new Employee(3, "C with classes", 845756.4);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		for (Employee e : empList) {
			System.out.println(e);
		}
		System.out.println();
		Collections.sort(empList, new IdComparator());
		for (Employee e : empList) {
			System.out.println(e);
		}

		System.out.println();
		List<Employee> empList1 = new ArrayList<Employee>(empList);
		Collections.sort(empList1, new NameComparator());
		for (Employee e : empList1) {
			System.out.println(e);
		}
	}
}
