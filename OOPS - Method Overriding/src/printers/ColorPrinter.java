package printers;

// ColorPrinter is-a Printer
public class ColorPrinter extends Printer{

	void print() {
		
		System.out.println("I am color printer and can "
				+ "print any document in any color");
	}
}
