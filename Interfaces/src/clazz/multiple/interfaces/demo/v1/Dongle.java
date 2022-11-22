package clazz.multiple.interfaces.demo.v1;

public class Dongle implements OwnershipChange{

	@Override
	public void changeOwnership() {
		
		System.out.println("Giving it to the admin team");
		System.out.println("Finding the owner");
		System.out.println("Updating the new owner in the inventory");
		
	}

}
