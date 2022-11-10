import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		
		String filename = "newfile.txt";
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(filename);
			
			String hello = "hello";
			
			for (int index = 0; index < hello.length(); index ++) {
				
				char aCharacter = hello.charAt(index);
			
				fos.write((int)aCharacter);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
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
