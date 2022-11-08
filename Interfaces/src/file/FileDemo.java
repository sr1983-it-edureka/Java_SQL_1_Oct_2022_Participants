package file;

public class FileDemo {

	public static void main(String[] args) {
		
//		File fileObject = new File();
	
		// "windowsUpdateLog" refers to an object
		// "windowsUpdateLog" is a reference
		WindowsFile windowsUpdateLog
			= new WindowsFile("Windows Update.log");
		windowsUpdateLog.delete();
		
		// windowsUpdateLogInterfacewindowsUpdateLogInterface is a reference
		File windowsUpdateLogInterface 
			= new WindowsFile("Windows Update.log");
	
		// "windowsUpdateLogInterface" reference can point to 
		// another reference "windowsUpdateLog"
		
		// "windowsUpdateLogInterface" reference points to the object
		// which is pointed to "windowUpdateLog"
		windowsUpdateLogInterface = windowsUpdateLog;
		
		windowsUpdateLogInterface.copy("D:\\temp");
		windowsUpdateLog.copy("D:\\temp");
		
		
		File fileInterface 
			= new LinuxFile("system.log");
	}
}
