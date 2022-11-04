
public class ShortDataTypeDemo {

	public static void main(String[] args) {
		
		short age = 10;
		
		int noOfPeopleInHousehold = 15;
		
		// Memory 
		// 2 bytes  [16]
		//  15
		// -32,768 -------- [+32,767]
		
		System.out.println("Memory of short " + Short.SIZE);
		
		
		System.out.println("Min Value ->" + Short.MIN_VALUE);
		System.out.println("Max Value ->" + Short.MAX_VALUE);
		
	}
}
