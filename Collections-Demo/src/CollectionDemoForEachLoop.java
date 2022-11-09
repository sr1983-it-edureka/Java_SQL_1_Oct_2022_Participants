import java.util.ArrayList;

public class CollectionDemoForEachLoop {

	public static void main(String[] args) {
		
		ArrayList<String> softwares = CollectionSamples.softwares();
		
		// For Each  loop / Enhanced For loop
		for (String software : softwares) {
			System.out.println("Software is " + software);
		}
	}
}
