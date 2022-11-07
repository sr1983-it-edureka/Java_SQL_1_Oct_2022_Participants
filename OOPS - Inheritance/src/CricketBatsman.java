
// Child Class 
public class CricketBatsman extends Cricketer { // ParentClass

	int noOf100s;
	int noOf50s;

	void hitSix() {
		
		System.out.println("The player " + name + "has hit a six. ");
		System.out.println("The entire crowd is roaring...");
	}
	
	void takeASingle() {
		System.out.println("The player took a single");
	}
	
	void display() {
		
		super.display();
		
		System.out.println("No of 100s " + noOf100s);
		System.out.println("No of 50s " + noOf50s);
	}

}
