import java.util.Scanner;

public class ArrayDeclarationUsingNewSyntax {

	public static void main(String[] args) {
		
		// Default Input - Keyboard
		// System.in
		
		// Scanner 
		
		Scanner inputFromKeyboard = new Scanner(System.in);
		
		System.out.println("Enter attendees information "
				+ "for the last 5 sessions");
		
//		int[] attendeesCount = {25, 24, 25, 23, 19};
		
		int[] attendeesCountArray = new int[5];
		
		for (int counter = 1; counter <=5; counter ++) {
			
			System.out.println("Enter the attendees count");
			
			int attendeesCount = inputFromKeyboard.nextInt();
			
			attendeesCountArray[(counter - 1)] = attendeesCount;			
		}
		
		// Print all the elements
		
		
		for (int arrayIndex = 0; 
				arrayIndex < attendeesCountArray.length;
					arrayIndex ++ ) {
			int temp = attendeesCountArray[arrayIndex];
//			System.out.println("Attendees Count -> " + temp);
			System.out.println("Attendees Count for a session -> " 
					+ attendeesCountArray[arrayIndex]);
		}
	}
}
