import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter some number ->");
		
		int number = scanner.nextInt();
		
		System.out.println("Number received from user is " + number);
	}
}
