package thread.basics;

public class NumberPrinterThread implements Runnable {

	String threadName;
	
	public NumberPrinterThread(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {

		for (int index = 1; index <= 10; index ++) {
			System.out.println(threadName + "[ Printing number " + index);
		
			int seconds = 2;
			try {
				
//				if (index >=1 && index <=5) {
				
//					if (threadName.equals("NPT1")) {
						Thread.sleep(seconds * 1000);
//					}
//				}else {
//					if (threadName.equals("NPT2")) {
//						Thread.sleep(seconds * 1000);
//					}					
//				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
