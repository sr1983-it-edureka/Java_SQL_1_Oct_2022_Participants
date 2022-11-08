package file;

// ChildClass
public class WindowsFile implements File{

	String filename;
	
	WindowsFile(String lFilename) {
		filename = lFilename;
	}
	
	public String read() {

		System.out.println("File is read on Windows OS");
		System.out.println("Returning some text");
		return "Windows OS -- File Read";
	}

	public void copy(String toWhichLocation) {
		
		System.out.println("Attempting to " + filename 
			+ " to a different location " + toWhichLocation);		
	}

	public void delete() {
		
		System.out.println("Deleting file " + filename);		
	}

}
