
public class ConstructorDemo {

	public static void main(String[] args) {
		
		// johnLaptop
			// color -> Black
			// manufacturerName -> Lenova
		
		Laptop johnLaptop = new Laptop();
		johnLaptop.manufacturerName = "Lenova";
		johnLaptop.color = "Black";
		johnLaptop.display();
		
		// jennyLaptop
			//color - White
			//manufacturerName -> Dell 
	
		Laptop jennyLaptop 
			= new Laptop("Dell", "White");
		jennyLaptop.display();
	}
}


