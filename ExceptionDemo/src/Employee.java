
public class Employee {

	String name;
	String designation;
	int totalCompletedProjects;
	
	public Employee(String lName, String lDesignation, 
			int lTotalCompletedProjects) {
		
		name = lName;
		designation = lDesignation;
		totalCompletedProjects = lTotalCompletedProjects;
	}
	
	void applyManagerPosition() throws Exception {
	
		if (designation.equals("Team-Lead")) {

			System.out.println(name + ", Your application for manager's position is received");
			System.out.println("You will hear from us within a week's time");

		}else {
			
			String message = name + ", You are not a team lead."
					+ "So you cannot apply for manager's position";
					
			Exception e = new Exception(message);
			throw e;
		}
		
	}
	
	void display() {
		
		
	}
}
