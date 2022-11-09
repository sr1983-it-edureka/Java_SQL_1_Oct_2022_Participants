import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterationDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks = CollectionSamples.marks();
	
		Iterator<Integer> iterator = marks.iterator();
		
		while (iterator.hasNext()) {
			
			int mark = iterator.next();
		
			System.out.println(mark);
		}		
		
	}
}
