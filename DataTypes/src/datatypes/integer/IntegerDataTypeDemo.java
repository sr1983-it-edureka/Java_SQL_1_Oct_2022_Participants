package datatypes.integer;

public class IntegerDataTypeDemo {

	public static void main(String[] args) {
		
		int noOfITEmployees = 123456;
		
		// Memory 
		// 4 bytes 
		// 32 bits
		// 2 pow (31)
		
		// -2,147,483,648 ------- [+2,147,483,647]
		
		System.out.println("Memory of int " + Integer.SIZE);
		
		System.out.println("Min Value ->" + Integer.MIN_VALUE);
		System.out.println("Max Value ->" + Integer.MAX_VALUE);
		
	}
}
