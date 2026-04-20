package core;

class Userss {
	final int id = 1;

	final public void change() {
//		id++;
		System.out.println(id + " in user class");
	}
}

class NewClass extends Userss {
	public void changeqq() {
//		id++;
		System.out.println("change in new class");
	}
}

public class P025_Final {
	public static void main(String[] args) {
		Userss u = new Userss();
		u.change();
	}
}
