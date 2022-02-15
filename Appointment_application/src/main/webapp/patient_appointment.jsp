<%@ page import = "java.sql.*" %>
<%
Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
String pname =request.getParameter("pname");
String doa = request.getParameter("doa");
String toa = request.getParameter("toa");
String specialist = request.getParameter("specialist");
String sql = "insert into appointment(pid,pname,dname,doa,toa,specialist,status) values (?,?,?,?,?,?,?)";
int pid =(Integer)session.getAttribute("pid");
PreparedStatement ps = connection.prepareStatement(sql);
ps.setInt(1,pid);
ps.setString(2,pname);
ps.setString(3,"None");
ps.setString(4,doa);
ps.setString(5,toa);
ps.setString(6,specialist);
ps.setString(7,"pending");
int x = ps.executeUpdate();
if (x!=0)
	response.sendRedirect("appointment_applied.jsp");
%>