
import java.sql.*;

public class UpdateDemo {

	   public static void main(String args[])throws Exception 
	    {

		   DBUtils.loadDriver();
		   
	     
	        Connection con = DriverManager.getConnection(
	        		DBUtils.connectionUrl);
	        System.out.println("Connected to the database");
	    	
	        Statement st=con.createStatement();
	/*
	        System.out.println("Before creating the table...");
	        st.execute("create table student(no varchar(10),name varchar(20))");
	        System.out.println("table created");
	  */              
	   //     st.executeUpdate("insert into student values('109', 'Tenzin')");
	     //   System.out.println("  row inserted");
	        
	        st.executeUpdate("update employee set name='Shunmuga Raja' "
	        		+ "where name='sr'");
	        System.out.println("row updated");
	         
	        con.close();
	        System.out.println("Connection closed...");
	        
	    }   
}
