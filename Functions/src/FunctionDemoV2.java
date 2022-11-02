
public class FunctionDemoV2 {

	public static void main(String[] args) {
		
		
		openBrowser();
		printDocument();
		downloadSoftware();
	}
	
	static void openBrowser(){
		
		// Open a Browser
		
		System.out.println("Opening Browser....");
		System.out.println("Chrome Browser Opened....");
		System.out.println("The website facebook.com is opened");	
		System.out.println();
	}
	
	static void printDocument(){
		
		// Send document to a printer
		
		System.out.println("The document is now sent to the priinter");
		System.out.println("Document printer after 4 seconds");		
		System.out.println();
	}
	
	static void downloadSoftware(){
		
		// Download the updated version for a software
		System.out.println("Attempting to download the updated version");
		System.out.println("The softwaer Zoom Application is now updated to the latest version");
		
	}
}
