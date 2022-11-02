
public class StringDemo {

	public static void main(String[] args) {
		
		// A, B, C
//		char rating = 'A';
		
		// Excellent, Good, Average, Bad
		
		String rating = "Excellent";
		System.out.println("Rating is ->" + rating);
		
		int length = rating.length();
		
		System.out.println("Length of the string is -> " + length);
		
		// Last 3 years 
		String[] ratings = {"Good", "Average", "Excellent"};
		
		for (int ratingIndex = 0; 
				ratingIndex < ratings.length; ratingIndex ++) {
			
			System.out.println(ratings[ratingIndex]);
		}
	}
}
