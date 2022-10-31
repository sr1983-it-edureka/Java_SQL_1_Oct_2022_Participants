
public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		
//		int salaryEmployee = 15000;
		
		float salaryOfAnEmployee
		= 150000.43F;
		
		float bonusPercentage = 12.0F;
		
		float result1 = 
		(salaryOfAnEmployee * bonusPercentage) / 100;
		
		float newSalary = 
		salaryOfAnEmployee + result1;
		
		System.out.println(result1);
		System.out.println(newSalary);
		
		int a = 15;
		int b = 5;
		
		// / - Operator
		// a, b -> Operands
		int c = (a / b);
		System.out.println(c);
		
		int d = (a % b);
		System.out.println(d);
		
		c = a + b;
		c = a - b;

	}
}
