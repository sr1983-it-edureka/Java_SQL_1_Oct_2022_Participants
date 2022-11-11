
public class DBUtils {

	public static String 
	        connectionUrl = "jdbc:sqlserver://localhost:1433;"
	        		+ "databaseName=First_LinuxDB;user=sa;password=Root123$"
	        		+ ";encrypt=true;trustServerCertificate=true;";

	public static void loadDriver() {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
