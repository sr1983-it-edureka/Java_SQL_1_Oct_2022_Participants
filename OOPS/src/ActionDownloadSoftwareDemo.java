
public class ActionDownloadSoftwareDemo {

	public static void main(String[] args) {
		
	}
	
	void downloadSoftware(){
		
		// Action
		// Download the software Eclipse with version 2023 from eclipse.org
		
		/* Objects:
		 *  shunmugaLaptop
		 */
		
		/* Catergories
		 * Laptop [shunmugaLaptop, johnLaptop, markLaptop]
		 */		
		
		// Primary object
//		shunmugaLaptop
		
		//Action name
//		download_software
		
		// Dependent Elements for the action
		// What all things have to be present?
		// Dependent element - 1
			// Software name - "Eclipse"
		// Dependent Element - 2
			// Software version - "2023"
		// Depndent Element - 3
			// fromWhichPlace - "eclipse.org" 
		
		Laptop shunmugaLaptop = null;
		shunmugaLaptop.downloadSoftware("eclipse", "2023", "eclipse.org");

	}	
	
	class Laptop {
		
		void downloadSoftware(String softwareName, String softwareVersion,
				String place) {
			
		}
	}	
}
