
<%@ page import="java.sql.*"%>
<%
String name = request.getParameter("val");
if (name == null || name.trim().equals("")) {
	out.print("<p>msg</p>");
} else {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture", "root", "");
		PreparedStatement ps = con.prepareStatement("select * from product where pname like '" + name + "%'");
		ResultSet rs = ps.executeQuery();
		if (!rs.isBeforeFirst()) {
	out.println("<p>No Record Found!</p>");
		} else {
	while (rs.next()) {
		out.print("<p>" + rs.getString(2) + "</p>");
	}
		}
		con.close();
	} catch (Exception e) {
		out.print(e);
	}
}
%>
