
public class ArrayPrintElementsv2 {

	public static void main(String[] args) {
		
		// Terminator 1, Terminator 2, ... Terminator 6
		
		// 8.1, 8.5, 6.5,
		
		// 0 - 5
		float terminatorMovieRatings [] = {
			8.1F, 8.5F,6.5F
		};
		
		System.out.println("Length of array -> " 
				+ terminatorMovieRatings.length);
		
		// Array has elements, 
		// access every element, print element
		
		// <=5 [0, 1, 2, 3, 4, 5]
		// <6  [0, 1, 2, 3, 4, 5]
		for (int arrayIndex = 0; 
				arrayIndex < terminatorMovieRatings.length; 
					arrayIndex ++) {
		
			float movieRating = terminatorMovieRatings[arrayIndex];
			
			System.out.println("Array Index is " + arrayIndex);
			System.out.println("Array Element is " + movieRating);
			System.out.println();
		}
	}
}
