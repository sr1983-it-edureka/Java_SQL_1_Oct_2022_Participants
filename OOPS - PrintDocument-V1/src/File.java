
// Size size;
//	content;

public class File {
	
	String type; // Image, DOC, PDF, Sheet
	int noOfPages;
	float sizeInMegaBytes; // sizeInKiloBytes, sizeInMegaBytes
	String title;
	char driveLetter;
	
	File(){	
		// Initial / Default values
		type = "PDF";	
		driveLetter = 'C';
	}
	
	File (String tTitle, int tNfOfPages, float tSizeInMegaBytes, 
			String tType, char tDriveLetter){
		
		title = tTitle;
		noOfPages = tNfOfPages;
		sizeInMegaBytes = tSizeInMegaBytes;
		type = tType;
		driveLetter = tDriveLetter;
	}
	
	void display() {
		
		System.out.println("Title -> " + title);
		System.out.println("Type of the file -> " + type);
		System.out.println("No of Pages -> " + noOfPages);
		System.out.println("Size in MB -> " + sizeInMegaBytes);
		System.out.println("Drive Letter ->" + driveLetter);
		
		System.out.println();
	}
}
