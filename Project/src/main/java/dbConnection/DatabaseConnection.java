package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection createConnection() {
		String url = "jdbc:mysql://localhost:3306/furniture";
		String username = "root";
		String password = "";
		Connection conn = null;
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
