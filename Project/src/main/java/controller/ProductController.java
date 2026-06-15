package controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.ProdcutDao;
import models.Product;

@WebServlet("/product")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		System.out.println(cd);
		String[] items = cd.split(";");
		for (String string : items) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length() - 1);
			}
		}
		return "";
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("post called");
		String action = request.getParameter("action");
		System.out.println(action);
		if (action != null && action.equalsIgnoreCase("upload")) {
			Product p = new Product();
			String savePath = "C:\\Users\\Admin\\JAVA MWF 8-00\\Project\\src\\main\\webapp\\pimages";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file1 = request.getPart("image");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);
			String filePath = savePath + File.separator + fileName;

			String savePath2 = "C:\\Users\\Admin\\JAVA MWF 8-00\\Project\\src\\main\\webapp\\pimages";
			File imgSaveDir = new File(savePath2);
			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}

			p.setPname(request.getParameter("pname"));
			p.setPimage(fileName);
			p.setPprice(Integer.parseInt(request.getParameter("pprice")));
			p.setPcategory(request.getParameter("pcategory"));
			p.setSid(Integer.parseInt(request.getParameter("sid")));
			System.out.println(p);
			ProdcutDao.insertProduct(p);
			response.sendRedirect("seller-home.jsp");
		}

		if (action.equalsIgnoreCase("update")) {
			Product p = new Product();
			String savePath = "C:\\Users\\Admin\\JAVA MWF 8-00\\Project\\src\\main\\webapp\\pimages";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file1 = request.getPart("image");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);
			String filePath = savePath + File.separator + fileName;

			String savePath2 = "C:\\Users\\Admin\\JAVA MWF 8-00\\Project\\src\\main\\webapp\\pimages";
			File imgSaveDir = new File(savePath2);
			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}

			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setPimage(fileName);
			p.setPname(request.getParameter("pname"));
			p.setPprice(Integer.parseInt(request.getParameter("pprice")));
			p.setPcategory(request.getParameter("pcategory"));

			ProdcutDao.updateProduct(p);
			response.sendRedirect("seller-manage-product.jsp");
		}
	}

}
