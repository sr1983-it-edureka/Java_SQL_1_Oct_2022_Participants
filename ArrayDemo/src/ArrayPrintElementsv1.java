
public class ArrayPrintElementsv1 {

	public static void main(String[] args) {
		
		// Terminator 1, Terminator 2, ... Terminator 6
		
		// 8.1, 8.5, 6.5,
		
		// 0 - 5
		float terminatorMovieRatings [] = {
			8.1F, 8.5F,6.5F, 6.2F, 6.7F,6.4F 
		};
		
		System.out.println("Length of array -> " 
				+ terminatorMovieRatings.length);
		
		// Array has elements, 
		// access every element, print element
		
		for (int counter = 1; counter <=6; counter ++) {
			
			int arrayIndex = (counter - 1);
			float movieRating = terminatorMovieRatings[arrayIndex];
			
			System.out.println("Counter is " + counter);
			System.out.println("Array Index is " + arrayIndex);
			System.out.println("Array Element is " + movieRating);
			System.out.println();
		}
	}
}
