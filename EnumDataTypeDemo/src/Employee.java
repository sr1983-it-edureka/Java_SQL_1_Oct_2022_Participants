
public class Employee {

	private String name;
	
	private String designation;
	
	@Deprecated
	private Designation designation2;
	
	@Deprecated
	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}

	public Employee(String name, Designation designation2) {
		this.name = name;
		this.designation2 = designation2;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Deprecated
	public String getDesignation() {
		return designation;
	}
	
	@Deprecated
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Designation getDesignation2() {
		return designation2;
	}

	public void setDesignation2(Designation designation2) {
		this.designation2 = designation2;
	}
}
