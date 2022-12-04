package exceptions.basics;

public class DivideByZeroDemov2 {

	public static void main(String[] args) {
		
		// Segment 1
		int x = 10;
		int y = 0;
			
		int z = 0;
		try {
			z = (x / y);
		}catch (Exception e) {
			System.out.println("Some Error in Segment 1 -> Division");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Division Result is " + z);			
		
		
		// Segment 2
		int a = 10;
		int b = 20;
		
		int c = a + b;
		System.out.println("Addition Result  is " + c);
	
	
		System.out.println("Segemnt 3");
		
		
		System.out.println("Segment 4");
		
		
		
	}
}
