package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Users implements Serializable {
	private int id;
	private String name;
	private String address;
	private long contact;

	Users(int id, String name, String address, long contact) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "id = " + id + " name = " + name + " address = " + address + " contact = " + contact;
	}
}

public class P020_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter id");
//		int id = sc.nextInt();
//		System.out.println("enter contact");
//		long contact = sc.nextLong();
//		System.out.println("enter name");
//		String name = sc.next();
//		System.out.println("enter address");
//		String address = sc.next();
//		Users u1 = new Users(id, name, address, contact);
		System.out.println("enter character : ");
		char c = sc.next().charAt(0);
		System.out.println(c);

		// serialization
//		FileOutputStream fos = new FileOutputStream("users.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(u1);
//		oos.flush();
//		oos.close();
//		System.out.println("done");

		// de-se
//		FileInputStream fis = new FileInputStream("users.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		Users u = (Users) ois.readObject();
//		System.out.println(u);
	}
}
