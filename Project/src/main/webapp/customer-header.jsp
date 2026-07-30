<%@page import="com.dao.CartDao"%>
<%@page import="models.Cart"%>
<%@page import="java.util.List"%>
<%@page import="models.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="author" content="Untree.co">
<link rel="shortcut icon" href="favicon.png">

<meta name="description" content="" />
<meta name="keywords" content="bootstrap, bootstrap4" />

<!-- Bootstrap CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css"
	rel="stylesheet">
<link href="css/tiny-slider.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<title>Insert title here</title>
<script type="text/javascript">
	var request = new XMLHttpRequest();
	function searchItem() {
		var name = document.vinform.pname.value;
		var url = "AjaxSearch.jsp?val=" + name;
		try {
			request.onreadystatechange = function() {
				if (request.readyState == 4) {
					var val = request.responseText;
					document.getElementById('result').innerHTML = val;
				}
			}
			request.open("GET", url, true);
			request.send();
		} catch (e) {
		}
	}
</script>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);
	%>
	<%
	Customer c = null;
	if (session.getAttribute("customer") != null) {
		c = (Customer) session.getAttribute("customer");
	}
	%>
	<!-- Start Header/Navigation -->
	<nav
		class="custom-navbar navbar navbar navbar-expand-md navbar-dark bg-dark"
		arial-label="Furni navigation bar">

		<div class="container">
			<a class="navbar-brand" href="seller-home.jsp">Furni<span>.</span></a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarsFurni"
				aria-controls="navbarsFurni" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarsFurni">
				<ul class="custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0">
					<li class="nav-item active"><a class="nav-link"
						href="customer-home.jsp">Home</a></li>
					<div class="dropdown">
						<button class="dropbtn">Products</button>
						<div class="dropdown-content">
							<a href="chair.jsp">Chair</a> <a href="sofa.jsp">Sofa</a> <a
								href="table.jsp">Table</a>
						</div>
					</div>
				</ul>

				<div class="dropdown">
					<button class="dropbtn">
						Welcome,
						<%=c.getName()%></button>
					<div class="dropdown-content">
						<a href="seller-profile.jsp">Profile</a> <a
							href="seller-change-password.jsp">Change Password</a> <a
							href="seller-logout.jsp">Logout</a>
					</div>
				</div>
				<div class="dropdown">
					<form name="vinform">
						<input type="text" name="pname" onkeyup="searchItem()"
							placeholder="search product">
					</form>
					<div class="dropdown-content">
						<a style="color: black;" id="result" href="product.jsp"></a>
					</div>
				</div>
				<ul class="custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5">
					<li><a class="nav-link" href="#"><img
							src="images/user.svg"></a></li>
					<%
					List<Cart> cartList = CartDao.getCartByCusID(c.getId());
					%>
					<li><a class="nav-link" href="cart.jsp"><%=cartList.size()%><img
							src="images/cart.svg"></a></li>
				</ul>
			</div>
		</div>

	</nav>
	<!-- End Header/Navigation -->
</body>
</html>