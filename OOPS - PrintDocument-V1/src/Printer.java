

public class Printer {

	String color;
	String model;
	float price;
	
	void printFile(File fileObject) {
		
	}


	void display() {
		
		StringBuilder contents = new StringBuilder();
		
		contents.append("Color is ").append(color).append(" , ");
		contents.append("Model is ").append(model).append(" , ");
		contents.append("Price is ").append(price);
		
		System.out.println(contents.toString());
	}
}
