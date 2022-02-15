<html>
<body bgcolor="grey">
<%@page import="java.sql.*" %>

<%
Connection con=null;
PreparedStatement ps=null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mondee";
String un="root";
String pass="Meta@123";
con=DriverManager.getConnection(url, un, pass);
String name=request.getParameter("name");
String password=request.getParameter("password");
String query="select * from manager where name=? and password=? ";
ps=con.prepareStatement(query);
ps.setString(1,name);
ps.setString(2,password );
ResultSet rs=ps.executeQuery();
if(rs.next())
		session.setAttribute("id",rs.getInt(1));
        session.setAttribute("field",rs.getString(6));
		response.sendRedirect("manager_profile.html");
%>
</body>
</html>