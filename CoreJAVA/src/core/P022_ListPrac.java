package core;

import java.util.ArrayList;
import java.util.List;

class Laptop {
	int ram;
	String model;
	double price;

	public Laptop(int ram, String model, double price) {
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}

}

public class P022_ListPrac {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(8, "lenovo", 43565.650);
		Laptop l2 = new Laptop(12, "dell", 53565.650);
		Laptop l3 = new Laptop(16, "apple", 63565.650);
		Laptop l4 = new Laptop(24, "asus", 76565.650);
		Laptop l5 = new Laptop(32, "hp", 83565.650);

		List<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);

		System.out.println(list);
		for (Laptop l : list) {
			System.out.println(l);
		}
	}
}
