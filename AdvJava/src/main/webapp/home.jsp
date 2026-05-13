<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	User u = null;
	if (session.getAttribute("user") != null) {
		u = (User) session.getAttribute("user");
	}
	%>
	<%-- <%= %> expression tag--%>
	<h1>
		Welcome,
		<%=u.getName()%>
	</h1>
</body>
</html>