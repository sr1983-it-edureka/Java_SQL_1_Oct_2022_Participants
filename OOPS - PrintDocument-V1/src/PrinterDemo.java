
public class PrinterDemo {

	public static void main(String[] args) {
		
		// int a[] = new int[]{1, 3, 5};
		
		// Allocate the necessary memory for printer05
		Printer printer05 = new Printer();
		
		printer05.color = "White";
		printer05.model = "HP Deskjet 1234";
		printer05.price = 15000.00F;
		printer05.display();
		
		// 
		Printer printer08 = new Printer();

		printer08.color = "Black";
		printer08.model = "HP Deskjet 6789";
		printer08.price = 18000.00F;
		printer08.display();

	}
}
