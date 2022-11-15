import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ApplicationTerminator {

	public void shutdown() {
		
		Project scannerProject = new Project(
			"Scanner", false, 12345.67F);
		Project packagesProject = new Project(
			"Packages", true, 23456.78F);
		Project servletProject = new Project("Servlet", true, 122.65F);
		Project oopsProject = new Project("OOPS", true, 543.55F);
		Project operatorsProject = new Project("Operators", false, 5454.56F);
		
		String filename = "eclipse-data.obj";
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filename);
			
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(scannerProject);
			oos.writeObject(packagesProject);
			oos.writeObject(servletProject);
			oos.writeObject(oopsProject);
			oos.writeObject(operatorsProject);
			
			
			
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if (fos != null) {
				
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (oos != null) {
				
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		
				
	}
}
