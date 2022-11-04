
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


class Laptop{
	
	String manufacturerName;
	String color;
	
	Laptop(){
		
	}
	
	Laptop(String lManufactureName, String lColor){
		
		color = lColor;
		manufacturerName = lManufactureName;
	}
	
	void display() {
		
		System.out.println("Manufacturer's name is " + manufacturerName);
		System.out.println("Color of the laptop is " + color);
	}
}