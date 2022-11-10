
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
	
	void applyManagerPositionV1() throws Exception {
	
		StringBuilder errorMessage = new StringBuilder();
		
		boolean designationRuleFailed = false;
		
		// Designation Rule failed
		if (!designation.equals("Team-Lead")) {

			errorMessage.append(name + ", You are not a team lead."
					+ "So you cannot apply for manager's position. ");

			designationRuleFailed = true;
		}
		
		// No of project -> atleast 3		
		boolean noOfCompletedProjectsRuleFailed = false;
		if (totalCompletedProjects < 3) {
			
			// Windows - /r/n, Unix - /n, Mac -> 
			errorMessage.append(System.getProperty("line.separator"));
			errorMessage.append(name 
				+ ", You have not completed 3 projects"
				+ ". So, you cannot apply for manager's position");

			noOfCompletedProjectsRuleFailed = true;
		}
		
		if (designationRuleFailed || noOfCompletedProjectsRuleFailed ) {

			// Exception
			Exception e = new Exception(errorMessage.toString());
			throw e;

		}else {

			String message = name 
					+ ", Your application for manager's position is received"
					+ "You will hear from us within a week's time";
			System.out.println(message);
		}
	}
	
	
	void applyManagerPositionV2() throws ManagerialPositionApplyException {
		
		ManagerialPositionApplyException exception = new ManagerialPositionApplyException();
				
		boolean designationRuleFailed = false;
		
		// Designation Rule failed
		if (!designation.equals("Team-Lead")) {

			exception.addRejectionReason(name + ", You are not a team lead."
					+ "So you cannot apply for manager's position. ");

			designationRuleFailed = true;
		}
		
		// No of project -> atleast 3		
		boolean noOfCompletedProjectsRuleFailed = false;
		if (totalCompletedProjects < 3) {
						
			exception.addRejectionReason(name 
					+ ", You have not completed 3 projects"
					+ ". So, you cannot apply for manager's position");

			noOfCompletedProjectsRuleFailed = true;
		}
		
		
		if (designationRuleFailed || noOfCompletedProjectsRuleFailed ) {

			throw exception;

		}else {

			String message = name 
					+ ", Your application for manager's position is received"
					+ "You will hear from us within a week's time";
			System.out.println(message);
		}
	}	
	void display() {
		
		
	}
}
