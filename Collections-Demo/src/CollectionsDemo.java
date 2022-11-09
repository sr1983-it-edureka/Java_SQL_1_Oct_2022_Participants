import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		// Approach 1
//		CollectionSamples samples = new CollectionSamples();
//			samples.softwares();
//		ArrayList<String> softwares = samples.softwares();
		
		// Approach 2
		ArrayList<String> softwares = CollectionSamples.softwares();
		
		for (int index = 0; index < softwares.size(); index ++) {
			
			String software = softwares.get(index);
			
			System.out.println("Software is " + software);
		}
	}
}
