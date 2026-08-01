<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
	<h2>Hello World!</h2>
	<h1>
		<a href="register">Register</a>
	</h1>
	<%-- <%
	int num = (Integer) (request.getAttribute("num"));
	String name = (String) request.getAttribute("name");
	%>
	<%
	out.print(num);
	out.print(name);
	%> --%>

	<h1>Num : ${num }</h1>
	<h1>Name : ${name }</h1>
	<h1>List : ${list }</h1>

	<c:forEach items="${list }" var="i">
		<h1>${i }</h1>
	</c:forEach>

</body>
</html>
