<html>
<body bgcolor="white">
<%@ page import = "java.sql.*" %>
<h1 align="center">WELCOME TO MANAGER HOME
<br><br><br>

<a href="index.html">Logout</a>
</h1>
<table border="2" width="400" height="200" align="center">
<tr><td>ID</td><td>Name</td><td>EMail</td><td>Phone</td><td>Field</td></tr>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
int id = (Integer)session.getAttribute("id");
PreparedStatement ps = connection.prepareStatement("select * from manager where id=?");
ps.setInt(1,id);
ResultSet rs = ps.executeQuery();
while(rs.next()){
	%>
	<tr>
	<td><%= rs.getInt(1) %></td><td><%= rs.getString(2) %></td><td><%= rs.getString(4) %></td><td><%= rs.getInt(5) %></td><td><%= rs.getString(6) %></td>
	</tr>
	
<%} %>
</table>	
</body>
</html>