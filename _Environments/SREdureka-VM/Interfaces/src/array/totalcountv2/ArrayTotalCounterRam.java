package array.totalcountv2;

public class ArrayTotalCounterRam implements ArrayTotalCounter{

	int totalCount;
	
	public void countNumbers(int[] array) {
		
		
		// 4
		// [0, 1, 2, 3 4]
		int lastIndex = array.length - 1;
		for (int index = 0; index <= lastIndex; index ++) {
			
			int value = array[index];
			System.out.println("Value " + value);
			totalCount = totalCount + value;
		}
		
		
	}

	public int getResult() {
		return totalCount;
	}

}
