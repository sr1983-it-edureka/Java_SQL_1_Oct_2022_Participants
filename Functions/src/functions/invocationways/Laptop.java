package functions.invocationways;

public class Laptop{
	
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
		
		System.out.println("-------------------");
	}
}