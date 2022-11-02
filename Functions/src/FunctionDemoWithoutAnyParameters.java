
public class FunctionDemoWithoutAnyParameters {

	public static void main(String[] args) {
		
		printSomething();
		
//		printSomething2("Hello World", 100, 1.23F, 'Z', "Addition");
		printSomething2("Hello World", 100, 1.23F, 'Z');
	}
	
	static void printSomething() {
		
		System.out.println("Printing something to the Console window..");
	}
	
	static void printSomething2(String str, int i, float f, char c) {
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(f);
		System.out.println(c);
	}
}
