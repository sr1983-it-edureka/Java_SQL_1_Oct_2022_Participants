package file;

public class FileDemo {

	public static void main(String[] args) {
		
//		demo1();
		demo2();
	}
	
	static void demo1() {
		
		File file1 = new File();
		file1.display();
		
		MovieFile movieFile = new MovieFile();
		movieFile.display();
		
		SpreadSheetFile ssFile = new SpreadSheetFile();
		ssFile.display();		
	}
	
	static void demo2() {
		
		// file1 reference is pointing an object 
		File file1 = new File();
		file1.display();
		
		// movieFile1 reference is pointing to an object
		MovieFile movieFile1 = new MovieFile();
		movieFile1.display();
		
		// A base class object can refer to a 
		// child class object
		
		// "file1" reference is pointing to another reference "movieFile1"
		
		// "file1" is pointing to the object referred by "movieFile1"
		
		// to Make changes to the object, the references "file1" or
		// "movieFile1" can be used
		file1 = movieFile1;
		file1.display();
	}
	
}
