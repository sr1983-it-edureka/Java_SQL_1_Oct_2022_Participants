
public class FunctionDemoV6 {

	public static void main(String[] args) {
		
		openBrowser("facebook.com");
		openBrowser("instagram.com");
		openBrowser("twitter.com");
		openBrowser("edureka.com");
		
		printDocument("FunctionDemov6.java", "PRINTER-5", 20);
		printDocument("Java Course.pdf", "PRINTER-9", 10);
		
		downloadSoftware(
			"Google Chrome", 51.1F);
		downloadSoftware(
			"Skype", 25.34F);		
		
	}
	
	static void openBrowser(String websiteName){
		
		// Open a Browser
		
		System.out.println("Opening Browser....");
		System.out.println("Chrome Browser Opened....");
		System.out.println("The website " + websiteName + " is opened");	
		System.out.println();
	}
	
	
	static void downloadSoftware(
		String softwareName, float version){
		
		// Download the updated version for a software
		System.out.println("Attempting to download the updated version");
		System.out.println("The software " + softwareName 
				+ " is now updated to the latest version - " + version);
		
	}


	static void printDocument(
		String documentName, String printerID, int noOfPages){
		
		// Send document to a printer
		
		System.out.println("The document " + documentName 
			+ " is now sent to the printer " + printerID);
		System.out.println("Printing done for the first " 
				+ noOfPages + " pages");		
		System.out.println();
	}
	
}
