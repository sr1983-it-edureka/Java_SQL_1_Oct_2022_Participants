
public class IDEDemo {

	public static void main(String[] args) {

		
		IDE eclipse = new IDE("Eclipse for Java", "2023");
		eclipse.display();
		
//		System.out.println(this);
		// Microsoft Visual Code
		IDE msVisualCode = new IDE(
			"MS Visual Code", "10.5");
		msVisualCode.display();
		
	}
}
