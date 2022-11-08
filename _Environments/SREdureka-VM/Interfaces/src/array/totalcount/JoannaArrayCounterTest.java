package array.totalcount;

public class JoannaArrayCounterTest {

	public static void main(String[] args) {
		
		JoannaArrayCounter counter1 = 
			new JoannaArrayCounter();
		
		int [] array = {1, 100, 300, 400};
		int totalCount = counter1.countNumbers(array);
		
		System.out.println("Total Count " + totalCount);
	}
}
