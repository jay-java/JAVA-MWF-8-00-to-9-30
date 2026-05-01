package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectivity {
	public static Connection dbConnect() {
		Connection conn = null;
		String username = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/user";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("database connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
