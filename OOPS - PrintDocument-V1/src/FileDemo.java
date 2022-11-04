
public class FileDemo {

	public static void main(String[] args) {
		
		// File java_crash_course_pdf
		File javaCrashCoursePDF = 
				new File();
		
		javaCrashCoursePDF.title = "Java Crash Course - Learn in 2 weeks";
		javaCrashCoursePDF.noOfPages = 75;
		javaCrashCoursePDF.sizeInMegaBytes = 2.6F;
		
		javaCrashCoursePDF.display();
		
		File harryPotterPDF = new File();
		harryPotterPDF.title = "Harry Potter - Part 4";
		harryPotterPDF.noOfPages = 490;
		harryPotterPDF.sizeInMegaBytes = 4.8F;
		harryPotterPDF.driveLetter = 'D';
		
		harryPotterPDF.display();
		
		File movieScriptInceptionPDF = new File();
		movieScriptInceptionPDF.title = "Inception - Draft v2.4 by Nolan Brothers";
		movieScriptInceptionPDF.noOfPages = 275;
		movieScriptInceptionPDF.sizeInMegaBytes = 6.4F;
		movieScriptInceptionPDF.type = "DOC";
		
		movieScriptInceptionPDF.display();	
		
		File healthyLivingFile = new File(
			"How to experience a healthy life", 120, 12.1F, "PDF", 'D');
		healthyLivingFile.display();
		
	}
}
