import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter some number ->");
		
		if (scanner.hasNextInt() ) {

			int number = scanner.nextInt();
			
			System.out.println("Number received from user is " + number);
		}else {
			System.out.println("You have to enter integer values only");
		}
		
	}
}
