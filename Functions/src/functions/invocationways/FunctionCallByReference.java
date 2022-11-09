package functions.invocationways;

public class FunctionCallByReference {

	public static void main(String[] args) {
		
		Laptop dellLaptop = new Laptop("Dell", "Black");
		dellLaptop.display();
		
		demoFunction(dellLaptop);
		
		dellLaptop.display();
	}
	
	static void demoFunction(Laptop laptop) {
		
		laptop.color = "White";
		
		laptop.display();
	}
}
