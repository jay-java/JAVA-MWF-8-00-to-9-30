package user;

import model.User;

public class UserJDBC {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setId(1);
		u1.setName("siddharth");
		u1.setContact(789465132);
		u1.setAddress("mumbai");

		UsersMethods u = new UsersMethods();
		u.createUser(u1);

	}
}
