package thread.basics;

public class Main {

	public static void main(String[] args) {
		
//		demo1();
		demo2();
	}
	
	static void demo2() {
		
		NumberPrinterThread npt1 
		= new NumberPrinterThread("NPT1");
	
		Thread t1 = new Thread(npt1);
		t1.start();

		DownloaderThread dt1 = new DownloaderThread("DT1", "Eclipse 2022");
		Thread t2 = new Thread(dt1);
		t2.start();

		DownloaderThread dt2 = new DownloaderThread("DT2", "MySQL");
		Thread t3 = new Thread(dt2);
		t3.start();		
		
		PrintPagesThread ppt1 = new PrintPagesThread("PPT1", "Harry Potter.pdf", 15);
		Thread t4 = new Thread(ppt1);
		t4.start();
		
		PrintPagesThread ppt2 = new PrintPagesThread("PPT2", "Java Crash Course.pdf", 8);
		Thread t5 = new Thread(ppt2);
		t5.start();
	}
	
	static void demo1() {
		
		NumberPrinterThread npt1 
			= new NumberPrinterThread("NPT1");
		
		Thread t1 = new Thread(npt1);
		t1.start();
		
		NumberPrinterThread npt2 = 
				new NumberPrinterThread("NPT2");
		
		Thread t2 = new Thread(npt2);
		t2.start();

		NumberPrinterThread npt3 = 
				new NumberPrinterThread("NPT3");
		
		Thread t3 = new Thread(npt3);
		t3.start();
	
	}
}
