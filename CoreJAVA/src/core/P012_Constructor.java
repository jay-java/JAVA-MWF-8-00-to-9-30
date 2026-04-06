package core;

class Data {
	double l, b;

	Data() {
		System.out.println("default constructor");
	}

	Data(double l, double b) {
		this.l = l;
		this.b = b;
		System.out.println("in cons -> l = " + l + " b = " + b);
	}

	Data(Data d) {

	}

	public void areaOfRectangle() {
		System.out.println("area of reactangle is : " + (l * b));
	}

	Data(int i) {
		System.out.println("parameter cons : " + i);
	}

	Data(int i, String j) {
		System.out.println("parameter cons : " + i + j);
	}

	public void showData() {
		System.out.println("show data fun");
	}

}

class CopyData {
	double l, b;

	CopyData() {
		System.out.println("def cons");
	}

	CopyData(Data d) {
		this.l = d.l;
		this.b = d.b;
	}

	public void areaOfRec() {
		System.out.println("area of rectangle : " + (l * b));
	}

}

public class P012_Constructor {
	public static void main(String[] args) {
		Data d1 = new Data(12);
		d1.showData();

		Data d2 = new Data(12, "java");

		Data d3 = new Data(23.34, 54.84);
		d3.areaOfRectangle();

		CopyData c = new CopyData(d3);
		c.areaOfRec();
	}
}
