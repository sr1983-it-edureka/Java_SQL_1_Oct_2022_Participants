package clazz.multiple.interfaces.demo.v1;

public class Laptop implements Buildable, OwnershipChange{

	@Override
	public void build() {
		
		System.out.println("Assembling electronic devices");
		System.out.println("Connecting them...");
	}

	@Override
	public void changeOwnership() {
		
		
		System.out.println("Giving it to the admin team");
		System.out.println("Finding the owner");
		System.out.println("Updating the new owner in the inventory");
		
	}

}
