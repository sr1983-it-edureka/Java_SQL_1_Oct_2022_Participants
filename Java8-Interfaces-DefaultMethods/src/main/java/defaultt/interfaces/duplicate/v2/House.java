package defaultt.interfaces.duplicate.v2;

public class House implements Buildable, OwnershipChange{

	@Override
	public void build() {
		
		System.out.println("Building the house");
		System.out.println("Number of rooms, layout, arrnagmenet of items");
		
	}

	@Override
	public void changeOwnership() {
		
		System.out.println("Applying for katha, e-Katha");
		
	}
	
	
	public String appointDelegator() {
		
//		return Buildable.super.appointDelegator();
		return OwnershipChange.super.appointDelegator();
	}
	

}
