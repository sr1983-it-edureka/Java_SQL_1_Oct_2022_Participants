package clazz.multiple.interfaces.demo.v1;

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

}
