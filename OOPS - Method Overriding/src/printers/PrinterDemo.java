package printers;

public class PrinterDemo {

	public static void main(String[] args) {
		
		Printer printer01 = new Printer();
		printer01.print();
		
		ColorPrinter colorPrinter02 = new ColorPrinter();
		colorPrinter02.print();
	}
}
