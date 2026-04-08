package core;

class Student1 {
	private int id;
	private String name;
	private double per;

	Student1() {

	}

	Student1(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
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

	public void setPer(double per) {
		this.per = per;
	}

	public double getPer() {
		return per;
	}

	@Override
	public String toString() {
		return "Student : id = " + id + " name = " + name + " per = " + per;
	}
}

public class P016_Encapsulation {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setId(12);
		s1.setName("java");
		s1.setPer(87.32);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getPer());

		System.out.println(s1);
		Student1 s2 = new Student1(1, "python", 78.52);
		System.out.println(s2);
	}
}
