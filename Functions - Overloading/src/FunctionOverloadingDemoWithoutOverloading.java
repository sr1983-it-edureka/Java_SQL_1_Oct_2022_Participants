
public class FunctionOverloadingDemoWithoutOverloading {

	public static void main(String[] args) {
		
		int x = 10, y = 20, z = 30;
		
		// Options 
		// Option 1
		
		int result1 = add(x, y);
		int finalResult = add(z, result1);
		System.out.println("Addition result ->" + finalResult);
	
//		// Option 2
//		
		finalResult = addThreeNumbers(x, y, z);
		System.out.println("Addition result ->" + finalResult);		
	
	
		finalResult =  addFourNumbers(20,  40, 60,  80);
		System.out.println("Addition result ->" + finalResult);		
		
	}
	

	static int add(int a, int b){
		
		int c = a + b;
		return c;
	}
	
	static int addThreeNumbers (int a, int b, int c){
		
		int d = a + b + c;
		return d;
	}

	static int addFourNumbers (int a, int b, int c, int d){
		
		int e = a + b + c + d;
		return e;
	}

	static float addThreeNumbersDecimal(float a, float b) {
		return a + b;
	}
	
	static float addIntegerAndDecimal(int a, float b) {
		return a+b;
	}
	
}
