package array.totalcount;

public class TotalCountMain {

	public static void main(String[] args) {
		
		person1Algorithm();
	}
	
	static void person1Algorithm() {
		
		int [] array = {-10, 0, 10, -20, 20, 30, 70};
	
		ArrayTotalCounterRam ram 
			= new ArrayTotalCounterRam(array);
		
		int totalCount 
			= ram.calculateTotalCount();
	
		System.out.println("Total Count " + totalCount);
	}
}
