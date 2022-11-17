package binary;

public class LogicalOperators_OR {

	public static void main(String[] args) {
		
		float bankBalance = 50000F;
		boolean myFriendsAvailability = false;
		
		if (bankBalance >= 100000 ||
				myFriendsAvailability == true) {
			System.out.println("Go for a trip...");
		}else {
			System.out.println("No trip...");
		}
		
	}
}
