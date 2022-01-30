package database_project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbcconnection {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306";
        String username="root";
        String password="Meta@123";
        Connection c=DriverManager.getConnection(url, username, password);
        if(c!=null)
        	System.out.println("connection successfull");
        else
        	System.out.println("connection unsuccessfull");
        
        	
        	
        
        
	}

}
