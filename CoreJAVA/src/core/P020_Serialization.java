package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
		Users u1 = new Users(1, "java", "ahmedabad", 987654321);

		// serialization
//		FileOutputStream fos = new FileOutputStream("users.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(u1);
//		oos.flush();
//		oos.close();
//		System.out.println("done");

		// de-se
		FileInputStream fis = new FileInputStream("users.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Users u = (Users) ois.readObject();
		System.out.println(u);
	}
}
