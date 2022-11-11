package statements.select;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuerySelectiveFieldsDemo {

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

			String selectQuery 
				= "select name, id from employee";
			
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			while (resultSet.next()) {
				
				String name = resultSet.getString(1);
				int id = resultSet.getInt(2);
				
				System.out.println(String.format(
					"Name is %s and Id is %d,", 
						name, id));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
