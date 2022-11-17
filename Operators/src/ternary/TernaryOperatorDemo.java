package ternary;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		
		int a = 200, b = 100;
		int bigNumber = findBigNumber(20, 90);
		System.out.println(
			String.format("%d, %d, The bigger one is %d", a, b, bigNumber));
		
		bigNumber = (a > b) ? a : b;
		System.out.println(
				String.format("%d, %d, The bigger one is %d", a, b, bigNumber));
		
		int smallNumber = (a > b) ? b : a;
		System.out.println(
				String.format("%d, %d, The Smaller one is %d", a, b, smallNumber));
		
		smallNumber = (a < b) ? a : b;
		
		System.out.println(
				String.format("%d, %d, The Smaller one is %d", a, b, smallNumber));	
		
		int c = 60, d = 80, x = 10, y = 20; 
		int outcome = (a > b) ? ( c > d ? c : d) : (x < y ? x : y);
		System.out.println(outcome);
		
	}
	
	static int nestedTernaryFunction() {
		
		//int outcome = (a > b) ? ( c > d ? c : d) : (x < y ? x : y);
		
		int a = 200, b = 100;
		int c = 60, d = 80, x = 10, y = 20; 

		if (a > b) {
			
			if (c > d) {
				return c;
			}else {
				return d;
			}
		}else {
			
			if (x < y) {
				return x;
			}else {
				return y;
			}
		}
	}
	
	static int findBigNumber(int a, int b) {
		
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
}
