<html>
<body bgcolor="wheat">
<%@ page import = "java.sql.*" %>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
String name =request.getParameter("name");
String password =request.getParameter("password");

String sql = "select * from employee where name=? and password=?";		
	PreparedStatement ps =connection.prepareStatement(sql);
	ps.setString(1, name);
	ps.setString(2, password);
	ResultSet rs=ps.executeQuery();
	if (rs.next())
		session.setAttribute("id",rs.getInt(1));
		
		response.sendRedirect("./employee_profile.html");
%>
<h1 align="center">Registered Successfully </h1>
</body>
</html>