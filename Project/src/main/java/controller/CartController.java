package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CartDao;
import dao.ProdcutDao;
import models.Cart;
import models.Product;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/cartcontroller")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int cart_id = Integer.parseInt(request.getParameter("cart_id"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		Cart c1 = CartDao.getCartByCartId(cart_id);
		c1.setTotal_price(c1.getPprice() * qty);
		c1.setQty(qty);
		CartDao.updateCart(c1);
		response.sendRedirect("cart.jsp");

//		String action = request.getParameter("action");
//		System.out.println(action);
//		if (action != null && action.equalsIgnoreCase("addtocart")) {
//			Cart c = new Cart();
//			c.setPid(Integer.parseInt(request.getParameter("pid")));
//			c.setCus_id(Integer.parseInt(request.getParameter("cusid")));
//			int pid = Integer.parseInt(request.getParameter("pid"));
//			Product p = ProdcutDao.getProductPid(pid);
//			c.setPprice(p.getPprice());
//			c.setQty(1);
//			c.setTotal_price(p.getPprice());
//			c.setPayment_status("pending");
//			System.out.println(c);
//			CartDao.addToCart(c);
//
//			response.sendRedirect("customer-home.jsp");
//		} else {
//			System.out.println("action null");
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
