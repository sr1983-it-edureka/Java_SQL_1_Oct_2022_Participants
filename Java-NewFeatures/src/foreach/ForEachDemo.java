package foreach;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		for (int index = 1; index <=15; index ++) {
			numbers.add(index);
		}

		demo1(numbers);
	}
	
	static void demo1(List<Integer> numbers) {
		
		// (t) -> t%2 != 0
		numbers.stream().forEach((item) -> {
			System.out.println(item);
		});
	}
}
