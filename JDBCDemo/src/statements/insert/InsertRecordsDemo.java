package statements.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordsDemo {

	public static void main(String[] args) {
		
		
		String msSqlDriverClassname 
		= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
		try {
			Class.forName(msSqlDriverClassname);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String connectionUrl = "jdbc:sqlserver://localhost:1433;"
	        		+ "databaseName=javasql_training;user=sa;password=Root123$"
	        		+ ";encrypt=true;trustServerCertificate=true;";
		
		Connection connection = null;
		try {
			
			connection = DriverManager.getConnection(connectionUrl);

			System.out.println("Database Connection DONE");		
			
			
			Statement statement = connection.createStatement();
			
			int noOfRowsAffected = statement.executeUpdate(
				"insert into employee (id, name, address) "
				+ "values (2000, 'E-2000', 'Address-2000') ");
			
			System.out.println("No of row affected " + noOfRowsAffected);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if (connection != null) {
					connection.close();					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
