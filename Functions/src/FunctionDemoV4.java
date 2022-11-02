
public class FunctionDemoV4 {

	public static void main(String[] args) {
		
		genericOpenBrowser("facebook.com");
		genericOpenBrowser("instagram.com");
		genericOpenBrowser("twitter.com");
		genericOpenBrowser("edureka.com");
		
		printDocument();
		
		downloadSoftware();
	}
	
	static void genericOpenBrowser(String websiteName){
		
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
	
	static void downloadSoftware(){
		
		// Download the updated version for a software
		System.out.println("Attempting to download the updated version");
		System.out.println("The software Zoom is now updated to the latest version - 11.1");
		
	}
}
