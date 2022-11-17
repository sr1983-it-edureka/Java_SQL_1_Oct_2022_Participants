package statements.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class BatchInsertRecordsDemo_DefaultCommitNo {

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
			connection.setAutoCommit(false);
			
			System.out.println("Database Connection DONE");		
			
			
			Statement statement = connection.createStatement();
			
			ArrayList<Employee> employees = createEmployees();
			
			Iterator<Employee> iterator = employees.iterator();
			
			while (iterator.hasNext()) {
				
				Employee employee = iterator.next();
				
				// validation (3) + execution (1) = 4 seconds
				String query = 
					String.format("insert into employee (id, name, address) "
								+ "values (%d, '%s', '%s') ",
								employee.id, employee.name, employee.address);
				
				statement.addBatch(query);
			}	
			
			/**
			 * 
			 * Student arun = ...;
			 * arun.insert()
			 * 
			 * arun.update('Arun Kumar');
			 * 
			 * arun.delete();
			 */
			
			// Execute
			int[] results = statement.executeBatch();
			
			for (int value : results) {
				System.out.println("Records affected " + value);
			}
			
			connection.commit();
			
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
	
	static ArrayList<Employee> createEmployees(){
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		for (int index = 1; index <= 10; index ++) {
			
			Employee e = new Employee();
			e.id = 7000 + index;
			e.name = "E - " + e.id;
			e.address = "Address - " + e.id;
			
			employees.add(e);
		}
		
		return employees;
	}
}
