package core;

//compiletime - overloading
class Overload {
	public void add(int a, int b) {
		System.out.println("int add : " + (a + b));
	}

	public void add(double a, double b) {
		System.out.println("double add : " + (a + b));
	}

	public void add(long a, long b) {
		System.out.println("long add : " + (a + b));
	}

}

//runtime - overriding
class Parent {
	public void call() {
		System.out.println("call in parent");
	}
}

class Child extends Parent {
	public void call() {
		super.call();
		System.out.println("call in child");
	}
}

public class P014_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		o.add(345, 456);

		Child c = new Child();
		c.call();
	}
}
