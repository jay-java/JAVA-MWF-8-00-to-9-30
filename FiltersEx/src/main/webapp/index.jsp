<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="servlet1" name="frm" method="post">
		<table style="border: 1px solid black">
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="insert"></td>
			</tr>
		</table>
	</form>

</body>
</html>