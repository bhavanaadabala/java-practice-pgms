<html>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">WELCOME TO DOCTOR HOME
<br><br><br>
<a href="doctor_profile.jsp">Doctor Profile</a>
<a href="index.html">Logout</a>
</h1>
<br><br><br>
<%@ page import = "java.sql.*" %>
<table border="2" width="400" height="200" align="center">
<tr><td>ID</td><td>Name</td><td>EMail</td><td>Phone</td><td>Specialist</td></tr>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
int id = (Integer)session.getAttribute("id");
PreparedStatement ps = connection.prepareStatement("select * from doctor where id=?");
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