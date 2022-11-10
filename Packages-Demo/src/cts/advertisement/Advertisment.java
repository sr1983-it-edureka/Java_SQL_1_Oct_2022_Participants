package cts.advertisement;

public class Advertisment {

	// Within the class
	// Within a class belonging to the same package
	// Outside class (not part of the same package)
	public String SPONSOR_NAME = "Johnson";
	
	// Within the class	
	private double moneySpent = 123232;
	
	// default access / package level access
	//[Within the same class]
	// Within a class belonging to the same package
	String overallOutcome = "MIXED";
	
	public void runAdvertisement() {
		
		System.out.println("Running some advetisement"
				+ " which is sponsored by " + SPONSOR_NAME);
	}
	
	void packageLevelAccessMethod() {
		System.out.println("I am access to all my member classes");
	}
	
	private void myPrivateInfo() {
		System.out.println("Some secret information");
	}
	
	public static void main(String[] args) {
		
		Advertisment adObj = new Advertisment();
		adObj.runAdvertisement();
		adObj.myPrivateInfo();
		adObj.packageLevelAccessMethod();
		
		System.out.println("Money Spent " + adObj.moneySpent);
//		System.out.println(SPON);
		
		System.out.println("Outcome ->" + adObj.overallOutcome);
	}
}
