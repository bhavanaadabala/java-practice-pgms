<%@ page import = "java.sql.*" %>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
String id = request.getParameter("id");
int id2= Integer.parseInt(id);
String mname =(String)session.getAttribute("name");
PreparedStatement ps =connection.prepareCall("update leaves set status=?,mname=? where id=?");
ps.setString(1, "Accepted");
ps.setString(2, mname);
ps.setInt(3,id2);
int x = ps.executeUpdate();
if(x!=0)
	response.sendRedirect("view_leaves_applied.jsp");

%>