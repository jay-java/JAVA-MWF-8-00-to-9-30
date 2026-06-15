<%@page import="models.Product"%>
<%@page import="dao.ProdcutDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="seller-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="untree_co-section before-footer-section">
		<div class="container">
			<div class="row mb-5">
				<form class="col-md-12" method="post">
					<div class="site-blocks-table">
						<table class="table">
							<thead>
								<tr>
									<th class="product-thumbnail">Image</th>
									<th class="product-name">Product</th>
									<th class="product-price">Price</th>
									<th class="product-price">Category</th>
									<th class="product-total">Edit</th>
									<th class="product-remove">Remove</th>
								</tr>
							</thead>
							<tbody>
								<%
								List<Product> list = ProdcutDao.getProductsBySid(s.getId());
								%>
								<%
								for (Product p : list) {
								%>
								<tr>
									<td class="product-thumbnail"><img
										src="pimages/<%=p.getPimage()%>" alt="Image" class="img-fluid"></td>
									<td class="product-name">
										<h2 class="h5 text-black"><%=p.getPname()%></h2>
									</td>
									<td>Rs. <%=p.getPprice()%></td>
									<td><%=p.getPcategory()%></td>

									<td><a
										href="seller-single-product.jsp?pid=<%=p.getPid()%>"
										class="btn btn-black btn-sm">Edit</a></td>
									<td><a href="seller-remove-product.jsp?pid=<%=p.getPid()%>"
										class="btn btn-black btn-sm">Remove</a></td>
								</tr>
								<%
								}
								%>
							</tbody>
						</table>
					</div>
				</form>
			</div>

		</div>
	</div>
</body>
</html>