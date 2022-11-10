package cts.advertisement;

public class Campaign {

	public static void main(String[] args) {
		
		Advertisment adObj = new Advertisment();
		adObj.runAdvertisement();
//		adObj.myPrivateInfo();
		System.out.println(adObj.SPONSOR_NAME);
		
		// Access to private is restricted
//		adObj.moneySpent
		
		System.out.println("Outcome ->" + adObj.overallOutcome);

		
	}
}
