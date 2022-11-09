import java.io.File;
import java.io.FileInputStream;

public class FileReadDemo {

	public static void main(String[] args) {
		
		File sampleFile = new File("/home/labuser/java_sql_1/git"
				+ "/Java_SQL_1_Oct_2022_Participants"
				+ "/_Environments/IO - Files/sample.txt");
		
		FileInputStream fis = new FileInputStream(sampleFile);
	}
}
