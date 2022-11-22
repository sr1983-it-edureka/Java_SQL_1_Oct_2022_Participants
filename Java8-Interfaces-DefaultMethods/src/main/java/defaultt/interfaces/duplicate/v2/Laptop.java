package defaultt.interfaces.duplicate.v2;

public class Laptop implements Buildable, OwnershipChange{

	@Override
	public void build() {
		
		System.out.println("Assembling electronic devices");
		System.out.println("Connecting them...");
	}
	
	public String appointDelegator() {
		return "I am going to it by myself";
	}
	

}
