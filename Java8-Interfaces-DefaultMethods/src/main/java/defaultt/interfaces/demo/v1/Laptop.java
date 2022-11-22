package defaultt.interfaces.demo.v1;

public class Laptop implements Buildable, OwnershipChange{

	@Override
	public void build() {
		
		System.out.println("Assembling electronic devices");
		System.out.println("Connecting them...");
	}

}
