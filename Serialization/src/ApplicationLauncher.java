import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ApplicationLauncher {

	void retriveObjects() {
		
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		String filename = "eclipse-data.obj";

		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);

			for (int index = 1; index <=5; index ++) {
				

				Object anObject =  ois.readObject();
				if (anObject == null) {
					break;
				}
				
				
				Project projectObj = (Project)anObject;
				projectObj.display();

			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
