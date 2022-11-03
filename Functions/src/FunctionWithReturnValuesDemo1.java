
public class FunctionWithReturnValuesDemo1 {

	public static void main(String[] args) {
		
//		int c = add(10, 40);
//		System.out.println("Result of addition within main is " + c);
//
//		int d = add(20, 50);
//		System.out.println("Result of addition within main is " + d);
	
		
		int[] results = arithmeticOperations(28, 5);
	
		for (int index = 0; index < results.length; index ++) {
			System.out.println("Arithmetic Operation Result -> " 
				+ results[index]);
		}
	}
	
	static int add(int a, int b){
		
		int c = a + b;
		System.out.println("Result of addition within add is " + c);
		
		return c;
	}
	
	static int[] arithmeticOperations(int a, int b){
		
		int addResult = a + b;
		int subResult = a - b;
		int multiplicationResult = a * b;
		int divisionQuotientResult = a / b;
		int divisionRemainderResult = a % b;
		
		int [] results = {
				addResult, subResult, multiplicationResult,
				divisionQuotientResult, divisionRemainderResult
		};
		
		return results;
	}
}
