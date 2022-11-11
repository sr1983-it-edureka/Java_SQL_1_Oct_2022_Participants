import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {

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
			
			String insertQuery = "insert into employee (id, name, address) "
					+ "values (?, ?, ?) ";
			
			// 3 seconds
			PreparedStatement preparedStatement 
				= connection.prepareStatement(insertQuery);
			
			
			for (int index = 0; index < 10; index ++) {
				
				int id = 5000 + index;
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, "E-" + id);
				preparedStatement.setString(3, "Address-" + id);
				
				// 1 second
				int noOfRowsAffected = preparedStatement.executeUpdate();
				
				System.out.println("No of row affected " + noOfRowsAffected);
				
			}
			
			// total = 3 + (1 * 10) = 13
			
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
