
public class EmployeeDemo2 {

	public static void main(String[] args) {
		
		// If you apply for manager's position, then
		//	you have to completed atleast 3 projects
		//	your current designation must be team-lead
		
		try {

			Employee balu = new Employee("Balu", "Junior Developer", 100);
			balu.applyManagerPosition();			

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Employee rajesh = new Employee("Rajesh", "Team-Lead", 200);
			rajesh.applyManagerPosition();			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
