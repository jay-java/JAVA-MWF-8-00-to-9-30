package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dbConnection.DatabaseConnection;
import models.Cart;

public class CartDao {
	public static void addToCart(Cart c) {
		try {
			Connection conn = DatabaseConnection.createConnection();
			String url = "insert into cart (pid,cus_id) values(?,?)";
			PreparedStatement pst = conn.prepareStatement(url);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getCus_id());
			pst.executeUpdate();
			System.out.println("added to cart");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Cart> getCartByCusID(int id) {
		List<Cart> list = new ArrayList<Cart>();
		try {
			Connection conn = DatabaseConnection.createConnection();
			String url = "select * from cart where cus_id=?";
			PreparedStatement pst = conn.prepareStatement(url);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Cart c = new Cart();
				c.setCart_id(rs.getInt("cart_id"));
				c.setPid(rs.getInt("pid"));
				c.setCus_id(rs.getInt("cus_id"));
				list.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void removeFromCart(int cart_id) {
		try {
			Connection conn = DatabaseConnection.createConnection();
			String url = "delete from cart where cart_id=?";
			PreparedStatement pst = conn.prepareStatement(url);
			pst.setInt(1, cart_id);
			pst.executeUpdate();
			System.out.println("product removed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
