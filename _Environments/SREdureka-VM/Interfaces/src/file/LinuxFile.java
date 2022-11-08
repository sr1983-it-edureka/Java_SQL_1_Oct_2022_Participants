package file;

public class LinuxFile implements File{

	String filename;
	
	LinuxFile(String lFilename) {
		filename = lFilename;
	}
	
	public String read() {
		
		System.out.println("File reading is faster in Linux");
		
		return "Linux OS - Read Operation";
	}

	public void copy(String toWhichLocation) {
		
		System.out.println("Copy operation is faster");		
	}

	public void delete() {

		System.out.println("Delete operation is super-fast");		
	}

}
