
public class IDEDemo {

	public static void main(String[] args) {

		// s2 refers to the data [Good Morning]
		// s2 refers to the object [Good Morning]
		// s2 is a reference to the object [Good Morning]
		
		String s2 = new String ("Good Morning");
		
		// "eclipse" is an object
		// "eclipse" is a reference
		// "eclipse" reference is reference to some data
			// data (object)
		
		IDE eclipse = new IDE("Eclipse for Java", "2023");
		
		// Microsoft Visual Code
		IDE msVisualCode = new IDE(
			"MS Visual Code", "10.5");
		
	}
}
