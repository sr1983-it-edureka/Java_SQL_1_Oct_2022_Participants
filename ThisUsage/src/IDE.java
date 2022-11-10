
public class IDE {

	String name;
	String version;
	
	public IDE(String name, String version) {
		
		this.name = name;
		this.version = version;
		
		display();
		this.display();
	}
	
	void display() {
		
		System.out.println(name);
		System.out.println(this.name);
		System.out.println("The value of [this] is " + this);
	}
	
	public String toString() {
		return String.format("%s [Name %s, Version %s]", "IDE", name, version);
	}
}
