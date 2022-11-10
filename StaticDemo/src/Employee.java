
public class Employee {

	// Object based variables / Instance variables
	// Non static variables
	String name;
	String id;
	
	//  Static variables Class based variables
	static int totalCount;
	
	public Employee(String name, String id) {
				
		this.name = name;
		this.id = id;	
		
//		totalCount = totalCount + 1;
//		this.totalCount = this.totalCount + 1;
	}
	
	void display() {
		

		System.out.println(
			String.format("Name is %s and ID is %s", name, id));
		System.out.println("Total Count is -> " + totalCount);
	}
}
