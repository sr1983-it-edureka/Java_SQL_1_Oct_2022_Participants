
public class ActionPrintDocumentDemo {

	public static void main(String[] args) {
		

	}


	void printFileAction() {
		
		// Printer printer-05 printing java-crash-course-pdf-file
		// Action
		
		
		/* Objects:
		 *  printer-05
		 *  java-crash-course-pdf-file
		 */
		
		/* Catergories
		 * Printer [printer-05, printer-08]
		 * File [java-coursepdf, sqlFile, helloWorldJavaFile]
		 */
		
		// Primary object
//		printer_05 
		
		//Action name
//		print_file 
		
		// Dependent Elements for the action
		// What all things have to be present?
		// Dependent element - 1
			// File name - "java crash course pdf"	
		
		Printer printer_05 = null;
		
		File javaCrashCoursePDF = null;
		printer_05.printFile(javaCrashCoursePDF);
	}
		
	
	class Printer {
		
		void printFile(File fileObject) {
			
		}
	}

	class File {
		
	}
}






