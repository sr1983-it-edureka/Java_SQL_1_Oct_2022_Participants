
import java.sql.*;

public class AutoCommitDemo {

	public static void main(String args[])throws Exception
	{
		DBUtils.loadDriver();
		
	 
	    Connection con=DriverManager.getConnection(
	    		DBUtils.connectionUrl);
	    System.out.println("Connected to the database");

	Statement stmt=con.createStatement();
	con.setAutoCommit(false);
	stmt.addBatch("update employee set name='102_1' where name='102'");
	stmt.addBatch("insert into employee values('200','200')");
	try
	{
	    stmt.executeBatch();    
	    System.out.println("batch executed");
	    con.commit();
	}
	catch(Exception e)
	{
	    try
	    {
	        con.rollback();
	        System.out.println("batch cancelled");
	        e.printStackTrace();
	    }
	    catch(Exception e1)
	    {
	        System.out.println(e1);
	    }
	     con.close();   
	    }
	}
	   }
