import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
	
	public static void main(String[] args) {
		
		String filename = "/home/labuser/java_sql_1/git/Java_SQL_1_Oct_2022_Participants/IO - Files/sample.txt";
		
		File sampleFile = new File(filename);
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(sampleFile);
						
			while (true) {
				
				int data = fis.read();
				
				if (data == -1) {
					break;					
				}else {

					char content = (char)data;
					
					// EOF - End of File
					// -1
					
					System.out.print(content);
				}
			}	
									
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			
			System.out.println("Finally Called...");
			try {
				if (fis != null) {
					fis.close();					
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}			
		}
		
	}
}
