package array.totalcountv2;

public class JoannaArrayCounter implements ArrayTotalCounter {

	int totalValue;
	public void countNumbers(int[] array) {
		
		int totalValue = 0;
		// 5 
		// [4, 3, 2, 1, 0]
		
		int firstIndex = array.length - 1;
		int lastIndex = 0;
		for (int index = firstIndex; index >=0; index --) {
			
			int value = array[index];
			System.out.println("Value visited is " + value);
			totalValue = totalValue + value;
		}		
		
	}

	public int getResult() {
		return totalValue;
	}

}
