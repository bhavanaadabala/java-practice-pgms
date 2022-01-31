package database_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Assignment 
{
	public static void main(String[] args) throws Exception 
	{
          Class.forName("com.mysql.cj.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/mondee";
          String username="root";
          String password="Meta@123";
          Connection c=DriverManager.getConnection(url, username, password);
          Statement sc=c.createStatement();
           char option=' ';
           String ename=" ";
           int eid=0;
           int esalary=0;
          do
        {
        	   if(option!='n')
        	   {
        	   System.out.println("Employee Database Enter the choice 1.Insert 2.Update 3.Delete 4.Select 5.Exit");
            Scanner s=new Scanner(System.in);
			int ch=s.nextInt();
			switch(ch)
		 {
			case 1:
			System.out.println("enter eid,ename,esalary");
		    Scanner sa=new Scanner(System.in);
			eid=sa.nextInt();
		    Scanner st=new Scanner(System.in);
			ename=st.next();
			Scanner ss=new Scanner(System.in);
		    esalary=ss.nextInt();
			String sqlquery="insert into employee values ("+eid+","+ename+","+esalary+")"; 
			sc.executeUpdate(sqlquery);
			System.out.println("record inserted");
			break;
			
			case 2:
				PreparedStatement ps=c.prepareStatement("update employee set esalary=?  where eid=?");
				System.out.println("esalary");
				Scanner scan=new Scanner(System.in);
				esalary=scan.nextInt();
				System.out.println("eid");
				Scanner sc1=new Scanner(System.in);
				eid=sc1.nextInt();
				ps.setInt(1,esalary);
				ps.setInt(2, eid);
                ps.executeUpdate();
				System.out.println("record updated");
				break;
				
				
			case 3:
				PreparedStatement ps1=c.prepareStatement("delete from employee where eid=?");
				System.out.println("eid");
				Scanner p=new Scanner(System.in);
				eid=p.nextInt();
				ps1.setInt(1, eid);
			    ps1.executeUpdate();
			    System.out.println("record deleted");
			    break;
			case 4:
				PreparedStatement p1=c.prepareStatement("select * from employee");
				ResultSet rs = p1.executeQuery();	
				while(rs.next())
					System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getInt("esalary"));
				break;
			case 5:
				System.out.println("exit");
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid option:\t");
				
			}
			
			System.out.println("do you want to continue y/n");
			Scanner sd=new Scanner(System.in);
			 option=sd.next().charAt(0);
        	   }
	        }while(option=='y');  
	}
	
}
		