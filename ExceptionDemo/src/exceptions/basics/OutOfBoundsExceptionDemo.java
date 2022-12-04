package exceptions.basics;

public class OutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		
//		stringDemo();
		arraysDemo();
	}
	
	static void stringDemo(){
		
		String str = "Java SQL Training";
		
		System.out.println(str);
		System.out.println("Length ->" + str.length());
		
		System.out.println("First Character " + str.charAt(0));
		
		int lastCharIndex = str.length() - 1;
		System.out.println("Last Character " + str.charAt(lastCharIndex));
		
	}
	
	static void arraysDemo(){
		
		// [0 - 4]
		int [] numbers = {1, 3, 5, 8, 10};
		
		// 5 / 2 -> 2
		int middle = numbers.length / 2;
		
		int middleNumber = numbers[middle];
		System.out.println("Middle number is " + middleNumber);
		
		System.out.println(numbers[5]);
	}
}
