
public class FunctionWithReturnValuesDemo2 {

	public static void main(String[] args) {
		
		int result1 = getNoOfAttendees();
		
		String myFavColors[] = getFavColors();
	}
	
	static int getNoOfAttendees(){
		
		System.out.println("No of attendess in today's session");
		return 20;
	}
	
	static float getInterestRate() {
		System.out.println("Interest rate for car loan...");
		float interstRate = 8.12F;
		return interstRate;
	}
	
	static String[] getFavColors(){
		
		String[] favColors = {"RED", "GREEN", "BLUE"};
		return favColors;
	}
}
