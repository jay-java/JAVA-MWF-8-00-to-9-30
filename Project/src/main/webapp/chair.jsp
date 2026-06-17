<%@page import="models.Product"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProdcutDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="customer-header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="untree_co-section product-section before-footer-section">
		<div class="container">
			<div class="row">
				<%
				List<Product> list = ProdcutDao.getProductsByCategory("Chair");
				%>
				<%
				for (Product p : list) {
				%>
				<!-- Start Column 1 -->
				<div class="col-12 col-md-4 col-lg-3 mb-5">
					<a class="product-item" href="#"> <img
						src="pimages/<%=p.getPimage()%>"
						class="img-fluid product-thumbnail">
						<h3 class="product-title"><%=p.getPname()%></h3> <strong
						class="product-price">Rs. <%=p.getPprice()%></strong> <span
						class="icon-cross"> <img src="images/cross.svg"
							class="img-fluid">
					</span>
					</a>
				</div>
				<!-- End Column 1 -->
				<%
				}
				%>

			</div>
		</div>
	</div>
</body>
</html>