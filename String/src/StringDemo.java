
public class StringDemo {

	public static void main(String[] args) {
		
//		lengthDemo();
//		findCharactersDemo();
		
		findPositionsDemo();
	}
	
	static void lengthDemo() {
		
		
		// A, B, C
//		char rating = 'A';
		
		// Excellent, Good, Average, Bad
		
		String rating = "Excellent";
		System.out.println("Rating is ->" + rating);
		
		int length = rating.length();
//		boolean length2 = rating.length();
		
		System.out.println("Length of the string is -> " + length);
		
		// Last 3 years 
		String[] ratings = {"Good", "Average", "Excellent"};
		
		for (int ratingIndex = 0; 
				ratingIndex < ratings.length; ratingIndex ++) {
			
			System.out.println(ratings[ratingIndex]);
		}		
		
	}
	
	static void findCharactersDemo(){
		
		String goodMorning = "Good Morning Universe";
		
		char tenthChar = goodMorning.charAt(10);
		System.out.println("The tenth character is " + tenthChar);
		
		char fifteenthChar = goodMorning.charAt(15);
		System.out.println("The fifteenth character is " + fifteenthChar);		
	}
	
	
	static void findPositionsDemo(){
		
		String goodMorning = "Good Morning Universe";
		
		char uCharacter = 'U';
		int position = goodMorning.indexOf(uCharacter);
		
		System.out.println("The character " + uCharacter + " is present "
			+ " at position " + position);
	}
	
}
