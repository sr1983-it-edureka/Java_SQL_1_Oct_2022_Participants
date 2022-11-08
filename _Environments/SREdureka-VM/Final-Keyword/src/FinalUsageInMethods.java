
public class FinalUsageInMethods {

	public static void main(String[] args) {
		
		//  Parent class deciding my method cannot/should not
		// be overriden my classes
		// How to enforce this?
	}
}

class WritingDevice{
	
	final void write() {
		System.out.println("I am writing something");
	}
}

// Pen is-a writingdevice
class Pen extends WritingDevice {
	
//	void write() {
//		System.out.println("PEN - I am writing something");
//	}
}

class Pencil extends WritingDevice{
	
//	void write() {
//		System.out.println("PENCIL - I am writing something");
//	}
}