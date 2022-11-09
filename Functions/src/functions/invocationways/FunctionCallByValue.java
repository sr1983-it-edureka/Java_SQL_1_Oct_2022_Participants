package functions.invocationways;

public class FunctionCallByValue {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 20;
		
		add(a, b);

		System.out.println("Within Main function");
		System.out.println(
				String.format("A is %d and B is %d", a, b));

	}
	
	static int add(int a, int b) {
		
		// a -> 10 -> 100
		// b --> 20 --> 200
		
		System.out.println("Within Add function");
		
		a = 100;
		b = 200;
		
		System.out.println(String.format("A is %d and B is %d", a, b));
		return 0;
	}
}
