
public class FunctionDemoV5 {

	public static void main(String[] args) {
		
		openBrowser("facebook.com");
		openBrowser("instagram.com");
		openBrowser("twitter.com");
		openBrowser("edureka.com");
		
		printDocument();
		
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
	
	static void printDocument(){
		
		// Send document to a printer
		
		System.out.println("The document is now sent to the priinter");
		System.out.println("Document printer after 4 seconds");		
		System.out.println();
	}
	
	static void downloadSoftware(
		String softwareName, float version){
		
		// Download the updated version for a software
		System.out.println("Attempting to download the updated version");
		System.out.println("The software " + softwareName 
				+ " is now updated to the latest version - " + version);
		
	}
}
