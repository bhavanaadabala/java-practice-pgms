<html>
<body bgcolor="wheat">
<br><br><br>
<h1 align="center">WELCOME TO PATIENT HOME
<br><br><br>
<a href="index.html">Logout</a>
</h1>
<br><br><br>
<%@ page import = "java.sql.*" %>
<table border="2" width="400" height="200" align="center">
<tr><td>id</td><td>eid</td><td>ename</td><td>mname</td><td>fromdate</td><td>todate</td><td>field</td><td>Status</td></tr>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
PreparedStatement ps = connection.prepareStatement("select * from leaves ");
ResultSet rs = ps.executeQuery();
while(rs.next())
{
	%>
	<tr>
	<td><%= rs.getInt(1) %></td><td><%= rs.getInt(2) %></td><td><%= rs.getString("ename") %></td><td><%= rs.getString("mname") %></td><td><%= rs.getString("fromdate") %></td><td><%= rs.getString("todate") %></td><td><%= rs.getString("field") %></td><td><%= rs.getString("status") %></td>
	
	</tr>
	
<%} %>
</table>	
</body>
</html>