package core;

class A {
	A() {
		System.out.println("def A cons");
	}

	A(int i) {
		System.out.println("i = " + i);
	}

	public void classA() {
		System.out.println("class A method");
	}
}

//single
class B extends A {
	public void classB() {
		System.out.println("class B method");
	}
}

//multilevel
class C extends B {
	public void classC() {
		System.out.println("class C method");
	}
}

//hierarchical
class D extends A {
	public void classD() {
		System.out.println("class D method");
	}
}

public class P013_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();

		C c = new C();
		c.classA();
		c.classB();
		c.classC();

		D d = new D();
		d.classA();
		d.classD();
	}
}
