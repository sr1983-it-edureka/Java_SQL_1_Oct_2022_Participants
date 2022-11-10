import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
	
		String sourceFilename = "/home/labuser/java_sql_1/git/Java_SQL_1_Oct_2022_Participants/Functions - Overloading/src/FunctionOverloadingDemo.java";
		String targetFilename = "/home/labuser/java_sql_1/git/Java_SQL_1_Oct_2022_Participants/IO - Files/FunctionOverloadingDemo.txt";
		
		File sourceFileObject = new File(sourceFilename);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(sourceFileObject);
			fos = new FileOutputStream(targetFilename);
						
			while (true) {
				
				int data = fis.read();
				
				if (data == -1) {
					break;					
				}else {

					char content = (char)data;
					
					// EOF - End of File
					// -1
					
					fos.write((int)content);
//					System.out.print(content);
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
			
			try {
				if (fos != null) {
					fos.close();					
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}					
		}		
	}
	
}
