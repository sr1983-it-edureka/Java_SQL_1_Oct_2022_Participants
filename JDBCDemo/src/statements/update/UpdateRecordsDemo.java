package statements.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordsDemo {

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
			
			String updateQuery = 
				String.format("update employee set address = '%s' where id = %d",
						"Chennai", 105);
			int noOfRowsAffected = statement.executeUpdate(updateQuery);
			
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
