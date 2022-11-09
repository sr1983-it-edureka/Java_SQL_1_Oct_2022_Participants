
public class StringFormatDemo {

	public static void main(String[] args) {
		
		int a = 10;
		float f = 1.23F;
		
		String str1 = "Hello";
		String str2 = "Good Morning";
		
		System.out.println("A is " + a + ", Float F is " 
			+ f + ", Str1 is " + str1 + ", Str2 is " + str2);
		
		// A is 10, Float F is 1.23, Str1 is Hello, Str2 is Good Morning

		System.out.println(String.format(
		"A is %d, Float F is %f, Str1 is %s, Str2 is %s", 
			a, f, str1,  str2));
	}
}
