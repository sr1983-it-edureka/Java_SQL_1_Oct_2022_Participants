package thread.basics;

public class DownloaderThread implements Runnable{

	String threadName;
	String artifactName;
	
	public DownloaderThread(String threadName, String artifactName) {
	
		this.threadName = threadName;
		this.artifactName = artifactName;
	}
	
	public void run() {
		

		for (int index = 1; index < 7; index ++) {
			
			System.out.println(threadName 
					+ "Downloading the content " + artifactName);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	
}
