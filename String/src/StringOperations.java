
public class StringOperations {

	public static void main(String[] args) {
	
		lengthDemo();
		findCharacterDemo();
	}
	
	static void lengthDemo() {
		
		
		String hello = "Hello";
		
		// Length -> Name
		// No parameters - ()
		// Data Type of paraemter
		// Return Value -> int
		int length = hello.length();
		
//		String length1 = hello.length();
		
		System.out.println(length);			
	}
	
	static void findCharacterDemo() {
		
		String welcomeMessage = "Welcome Universe";
		
		char someChar = welcomeMessage.charAt(10);
//		boolean someChar2 = welcomeMessage.charAt(10);
		
		System.out.println(someChar);
	}
	
}
