package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CartDao;
import models.Cart;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/cartcontroller")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		if (action != null && action.equalsIgnoreCase("addtocart")) {
			Cart c = new Cart();
			c.setPid(Integer.parseInt(request.getParameter("pid")));
			c.setCus_id(Integer.parseInt(request.getParameter("cusid")));
			System.out.println(c);
			CartDao.addToCart(c);

			response.sendRedirect("customer-home.jsp");
		} else {
			System.out.println("action null");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
