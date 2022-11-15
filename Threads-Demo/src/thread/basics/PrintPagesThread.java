package thread.basics;

public class PrintPagesThread implements Runnable{

	String threadName;
	String documentName;
	int noOfPages;
	
	public PrintPagesThread(String threadName, 
		String documentName, int nofOfPages) {
	
		this.threadName = threadName;
		this.documentName = documentName;
		this.noOfPages = nofOfPages;
	}

	@Override
	public void run() {
		
		
		for (int index =1; index <=noOfPages; index ++) {
			
			String message = 
			String.format("%s [printing the document %s, current page %d", 
				threadName, documentName, index);
			System.out.println(message);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
}
