package user;

import java.util.List;
import java.util.Scanner;

import model.User;
import user_methods.UsersMethods;

public class UserJDBC {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("enter id : ");
//		int id = sc.nextInt();
//		System.out.println("enter name : ");
//		String name = sc.next();
//		System.out.println("enter contact");
//		long contact = sc.nextLong();
//		System.out.println("enter address");
//		String address = sc.next();
//		User u1 = new User();
//		u1.setId(2);
//		u1.setName("harsh");
//		u1.setContact(789465132);
//		u1.setAddress("ahmedabad");

		
		
		// to create user
		UsersMethods u = new UsersMethods();
//		u.createUser(u1);

		
		
		// to fetch user by id
//		User u2 = u.getUser(1);
//		System.out.println(u2);

		
		
		// to fetch list of users
//		List<User> list = u.getAllUser();
//		System.out.println(list);
//		for (User u2 : list) {
//			System.out.println(u2);
//		}

		
		
		// to update user
//		User u1 = new User();
//		u1.setId(2);
//		u1.setContact(987654321);
//		u.updateUser(u1);

		
		
		// to delete user
		u.deleteUser(1);
	}
}
