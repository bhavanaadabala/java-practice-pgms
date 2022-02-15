<%@ page import = "java.sql.*" %>
<%@ page import = "java.text.ParseException" %>
<%@ page import = "java.text.SimpleDateFormat"%>
<%@page import = "java.time.LocalDate"%>
<%@page import = "java.time.temporal.ChronoUnit"%>
<%@page import = "java.util.Date"%>
<%@page import = "java.util.concurrent.TimeUnit"%>

<%

Connection connection= null;
Class.forName("com.mysql.cj.jdbc.Driver");
String url ="jdbc:mysql://localhost:3306/mondee";
String user ="root";
String pass = "Meta@123";
connection = DriverManager.getConnection(url, user, pass);
String ename =request.getParameter("ename");
String fromdate = request.getParameter("fromdate");
String todate = request.getParameter("todate");
String field = request.getParameter("field");

SimpleDateFormat myformat= new SimpleDateFormat("yyyy-MM-dd");



Date date1 = myformat.parse(fromdate);
Date date2 = myformat.parse(todate);

long difference = date2.getTime()-date1.getTime();

long totalDays =TimeUnit.DAYS.convert(difference,TimeUnit.MILLISECONDS);

String sql = "insert into leaves(eid,ename,mname,fromdate,todate,field,status) values (?,?,?,?,?,?,?)";
int id =(Integer)session.getAttribute("id");
PreparedStatement ps = connection.prepareStatement(sql);
ps.setInt(1,id);
ps.setString(2,ename);
ps.setString(3,"none");
ps.setString(4,fromdate);
ps.setString(5,todate);
ps.setString(6,field);
ps.setString(7,"pending");
int x = ps.executeUpdate();
if(totalDays+1<=3)
{
	

if (x!=0)
	response.sendRedirect("leave_applied.jsp");
}
else
	{
	out.println("leave is not applicable for more than 3 days");
	}

%>