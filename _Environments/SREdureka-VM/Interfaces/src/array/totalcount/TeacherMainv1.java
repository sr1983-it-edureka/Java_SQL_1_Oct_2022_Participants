package array.totalcount;

public class TeacherMainv1 {

	public static void main(String[] args) {
		
		// Ram's version
		
		int [] array = {-10, 0, 10, -20, 20, 30, 70};
		
		ArrayTotalCounterRam ram 
			= new ArrayTotalCounterRam(array);
		
		int totalCount 
			= ram.calculateTotalCount();
	
		System.out.println("Total Count " + totalCount);
		
		// Joan's version
		
		JoannaArrayCounter counter1 = 
				new JoannaArrayCounter();
			
		int [] array2 = {1, 100, 300, 400};
		int totalCount2 = counter1.countNumbers(array2);
		
		System.out.println("Total Count " + totalCount2);
		
	}
}
