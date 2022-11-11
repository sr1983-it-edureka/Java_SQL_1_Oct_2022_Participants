
import java.sql.*;

public class DBMetadata {

	public static void main(String[] args) throws Exception{
		
		DBUtils.loadDriver();
		
     
        Connection con=DriverManager.getConnection(
        		DBUtils.connectionUrl);
        System.out.println("Connected to the database");
     
     DatabaseMetaData rsmd=con.getMetaData();
    
     System.out.println("database name="+rsmd.getDatabaseProductName());
     System.out.println("database version="+rsmd.getDatabaseProductVersion());
     System.out.println("Driver version="+rsmd.getDriverVersion());
     System.out.println("Table name size="+rsmd.getMaxTableNameLength());
     System.out.println("max no. of columns="+rsmd.getMaxColumnsInTable());  
     con.close();
     
	}
}
