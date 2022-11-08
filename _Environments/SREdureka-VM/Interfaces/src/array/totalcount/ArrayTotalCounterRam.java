package array.totalcount;

public class ArrayTotalCounterRam {

	int[] array;
	
	ArrayTotalCounterRam(int lArray[]) {
		
		array = lArray;
	}
	
	int calculateTotalCount() {
		
		int totalCount = 0;
		
		// 4
		// [0, 1, 2, 3 4]
		int lastIndex = array.length - 1;
		for (int index = 0; index <= lastIndex; index ++) {
			
			int value = array[index];
			System.out.println("Value " + value);
			totalCount = totalCount + value;
		}
		
		return totalCount;
	}
}
