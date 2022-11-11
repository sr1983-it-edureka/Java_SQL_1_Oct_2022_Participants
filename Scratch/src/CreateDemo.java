import java.sql.*;

public class CreateDemo {

	   public static void main(String args[])throws Exception 
	    {

		   DBUtils.loadDriver();
		   
	     
	        Connection con=DriverManager.getConnection(
	        		DBUtils.connectionUrl);
	        System.out.println("Connected to the database");
	    	
	        Statement st=con.createStatement();
	
	        System.out.println("Before creating the table...");
	        st.execute("create table student(no varchar(10),name varchar(20))");
	        System.out.println("table created");
	                
	        st.executeUpdate("insert into student values('1', 'sr')");
	        st.executeUpdate("insert into student values('2', 'jc')");
	        
	        System.out.println("  row inserted");
	        
	         
	        con.close();
	        System.out.println("Connection closed...");
	        
	    }   
}
