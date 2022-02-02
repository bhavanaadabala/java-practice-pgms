package com.mondee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoctorRegister  extends HttpServlet{
	Connection connection = null;
	PreparedStatement ps =null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url ="jdbc:mysql://localhost:3306/mondee";
		String username ="root";
		String password = "Meta@123";
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
	
	String username =request.getParameter("username");
	String password =request.getParameter("password");
	String email =request.getParameter("email");
	String phone =request.getParameter("phone");
	long mobile = Long.parseLong(phone);
	String specialist = request.getParameter("specialist");
	PrintWriter pw = response.getWriter();
	String sql = "insert into doctor(name,password,email,phone,specialist) values (?,?,?,?,?)";			
	try {
		ps =connection.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, mobile);
		ps.setString(5, specialist);
		int x =ps.executeUpdate();
		if (x!=0)
			pw.println("<html><body bgcolor='blue'><h1 align= 'center'>");
		    pw.println("Registerd Succesfully</h1></body></html>");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

}
}


