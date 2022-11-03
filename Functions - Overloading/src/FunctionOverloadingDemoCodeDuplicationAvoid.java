
public class FunctionOverloadingDemoCodeDuplicationAvoid {

	public static void main(String[] args) {

		int result = add(10);
		System.out.println("Result is " + result);

		result = add(10, 20);
		System.out.println("Result is " + result);
		
		result = add(10, 20, 30);
		System.out.println("Result is " + result);
		
		result = add(20, 30, 40, 50);
		System.out.println("Result is " + result);
		
		
//		float floatResult = add(20.12F, 40.98F);
//		System.out.println("Result is " + floatResult);		
	}
	
	static int add(int ... numbers){
		
		int totalValue = 0;
		for (int index = 0; index < numbers.length; index ++) {
		
			totalValue = totalValue + numbers[index];
		}
		return totalValue;
	}
	
	
	static float add(float ... numbers){
		
		float totalValue = 0;
		for (int index = 0; index < numbers.length; index ++) {
		
			totalValue = totalValue + numbers[index];
		}
		return totalValue;
	}
	
	/*static float add(float a, float b){
		
		float c = a + b;
		return c;
	}

	static float add(float a, float b, float c){
		
		float d = a + b + c;
		return d;
	}*/
}
