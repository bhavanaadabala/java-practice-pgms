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
String email =request.getParameter("email");
String phone =request.getParameter("phone");
long mobile = Long.parseLong(phone);
String field =request.getParameter("field");
String sql = "insert into employee(name,password,email,phone,field) values (?,?,?,?,?)";			
	PreparedStatement ps =connection.prepareStatement(sql);

	ps.setString(1, name);
	ps.setString(2, password);
	ps.setString(3, email);
	ps.setLong(4, mobile);
	ps.setString(5, field);
	int x =ps.executeUpdate();
	if (x!=0)
		
		response.sendRedirect("./employee_login.html");
%>
<h1 align="center">Registered Successfully </h1>
</body>
</html>