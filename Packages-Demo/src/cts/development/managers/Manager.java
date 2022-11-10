package cts.development.managers;

import cts.advertisement.*;

import cts.development.testers.Tester;

public class Manager {

	Advertisment internJobs;
	Tester raghu;
	
	Ad1 ad1;
	Ad2 ad2;
	
	
	public static void main(String[] args) {
		
		Advertisment adObj = new Advertisment();
		System.out.println(adObj.SPONSOR_NAME);
		adObj.runAdvertisement();
//		adObj.myPrivateInfo();
		
//		adObj.packageLevelAccessMethod();
		
//		System.out.println("Outcome ->" + adObj.overallOutcome);

//		adObj.moneySpent
	}
	
}
