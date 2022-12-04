package custom.exception.simple;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = scanner.nextInt();
		
		System.out.println("Enter salary");
		
		float salary = scanner.nextFloat();
		
		PersonDetails person = new PersonDetails("Joy", age, salary);
		
		try {
			person.validate();
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
		
	}
}
