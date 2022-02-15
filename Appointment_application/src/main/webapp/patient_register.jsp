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
String username =request.getParameter("username");
String password =request.getParameter("password");
String email =request.getParameter("email");
String phone =request.getParameter("phone");
long mobile = Long.parseLong(phone);
String address =request.getParameter("address");
String sql = "insert into patient(name,password,email,phone,address) values (?,?,?,?,?)";			
	PreparedStatement ps =connection.prepareStatement(sql);
	ps.setString(1, username);
	ps.setString(2, password);
	ps.setString(3, email);
	ps.setLong(4, mobile);
	ps.setString(5, address);
	int x =ps.executeUpdate();
	if (x!=0)
		response.sendRedirect("./patient_login.html");
%>
<h1 align="center">Registered Successfully </h1>
</body>
</html>