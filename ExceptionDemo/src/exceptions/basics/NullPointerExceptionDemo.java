package exceptions.basics;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		System.out.println(str);
		
		str = "Good Morning";
		System.out.println(str);
		
		str = null;
		System.out.println(str.length());
	}
}
