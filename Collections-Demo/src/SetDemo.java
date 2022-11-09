import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		// Duplicates
		// Ordering of elements - wont be maintained
		HashSet<Integer> numbers = new HashSet<>();
	
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);		
	
		Iterator<Integer> iterator = numbers.iterator();
		
		while (iterator.hasNext()) {
			
			int number = iterator.next();
		
			System.out.println(number);
		}		

	}
}
