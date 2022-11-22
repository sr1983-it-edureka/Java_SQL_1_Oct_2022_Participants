package defaultt.interfaces.duplicate.v2;

public interface OwnershipChange {

	default void changeOwnership() {

		System.out.println("Giving it to the admin team");
		System.out.println("Finding the owner");
		System.out.println("Updating the new owner in the inventory");

	}	
	
	default String appointDelegator() {
		return "My Assistant";
	}
	
}
