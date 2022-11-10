
public class EmployeeDemo {

	public static void main(String[] args) {
		
		// If you apply for manager's position, then
		//	you have to completed atleast 3 projects
		//	your current designation must be team-lead
		
		try {


			Employee rajesh = new Employee("Rajesh", "Team-Lead", 200);
			rajesh.applyManagerPositionV1();
			
			

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Employee manu = new Employee("Manu", "Team-Lead", 200);			
			manu.applyManagerPositionV1();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
		
			Employee balu = new Employee("Balu", "Junior Developer", 100);
			balu.applyManagerPositionV1();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try {

			Employee anusha = new Employee("Anusha", "Team-Lead", 200);
			anusha.applyManagerPositionV1();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	
	
	}
	
}
