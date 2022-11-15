
public class Main {

	public static void main(String[] args) {
		
		
		ApplicationTerminator eclipseTerminator = new ApplicationTerminator();
		eclipseTerminator.shutdown();
		
		ApplicationLauncher eclipseLauncher = new  
				ApplicationLauncher();
		eclipseLauncher.retriveObjects();
				
	}
	
}
