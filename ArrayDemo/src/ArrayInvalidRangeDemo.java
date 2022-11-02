
public class ArrayInvalidRangeDemo {

	public static void main(String[] args) {
		
		// Index ranges [0 - 4]
		char appraisalRatings [] = {'A', 'B', 'C', 'A', 'C'};

		char sixthElement = appraisalRatings[-10];
		System.out.println(sixthElement);
	}
}
