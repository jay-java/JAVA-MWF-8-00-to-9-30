package user_methods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbConnection.DatabaseConnectivity;
import model.User;

public class UsersMethods {
	public void createUser(User u) {
		try {
			Connection conn = DatabaseConnectivity.dbConnect();
			String sql = "insert into userdata(id,name,contact,address) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, u.getId());
			pst.setString(2, u.getName());
			pst.setLong(3, u.getContact());
			pst.setString(4, u.getAddress());
//			executeUpdate() -> DML(insert,update,delete) 
//			executeQuery() -> DQL(select)
			pst.executeUpdate();
			System.out.println("data inserted successfully");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public User getUser(int id) {
		User u = null;
		try {
			Connection conn = DatabaseConnectivity.dbConnect();
			String sql = "select * from userdata where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
			} else {
				System.out.println("data not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	public List<User> getAllUser() {
		List<User> usersList = new ArrayList<User>();
		try {
			Connection conn = DatabaseConnectivity.dbConnect();
			String sql = "select * from userdata";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setContact(rs.getLong("contact"));
				u.setAddress(rs.getString("address"));
				usersList.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usersList;
	}

	public void updateUser(User u) {
		try {
			Connection conn = DatabaseConnectivity.dbConnect();
			String sql = "update userdata set contact=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setLong(1, u.getContact());
			pst.setInt(2, u.getId());
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser(int id) {
		try {
			Connection conn = DatabaseConnectivity.dbConnect();
			String sql = "delete from userdata where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.executeUpdate();
			System.out.println("data deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
