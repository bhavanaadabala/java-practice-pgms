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
<tr><td>ID</td><td>Patient Name</td><td>date</td><td>Time</td><td>Specialist</td><td>Status</td><td>Action</td></tr>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
String specialist = (String)session.getAttribute("specialist");
PreparedStatement ps = connection.prepareStatement("select * from appointment where specialist=?");
ps.setString(1,specialist);
ResultSet rs = ps.executeQuery();
while(rs.next())
{
	%>
	<tr>
	<td><%= rs.getInt(1) %></td><td><%= rs.getString("pname") %></td><td><%= rs.getString("doa") %></td><td><%= rs.getString("toa") %></td><td><%= rs.getString("specialist") %></td>
	<td><%= rs.getString("status") %></td>
	<td> <a href="accept.jsp?id=<%=rs.getInt(1)%>">Accept</a></td>
	</tr>
<%} %>
</table>	
</body>
</html>