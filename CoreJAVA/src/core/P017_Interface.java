package core;

interface interface1 {
	public void interface1Method();

	public static void staticInterface1() {
		System.out.println("static interface 1");
	}
}

interface interface2 extends interface1 {
	public void interface2Method();

	public static void staticInterface2() {
		System.out.println("static interface 2");
	}
}

interface interface3 {
	void interface3Method();

	public static void staticInterface3() {
		System.out.println("static interface 3");
	}
}

class InterfaceCall implements interface2, interface3 {

	@Override
	public void interface1Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2Method() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

}

public class P017_Interface {
	public static void main(String[] args) {
		InterfaceCall i = new InterfaceCall();
		i.interface1Method();
		i.interface2Method();
		i.interface3Method();
		interface1.staticInterface1();
		interface2.staticInterface2();
		interface3.staticInterface3();

	}
}
