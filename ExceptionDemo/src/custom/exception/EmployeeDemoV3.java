package custom.exception;
import java.util.ArrayList;

public class EmployeeDemoV3 {

	public static void main(String[] args) {
		
		// If you apply for manager's position, then
		//	you have to completed atleast 3 projects
		//	your current designation must be team-lead
		
		try {

			Employee balu = new Employee("Balu", "Junior Developer", 2);
			balu.applyManagerPositionV2();			

		}catch (ManagerialPositionApplyException e) {
			e.printStackTrace();
			
			System.out.println(e.getRejectionReasonsCount());
			
			ArrayList<String> rejectionReasons = e.getRejectionReasons();
			System.out.println(rejectionReasons);
		}
		
		try {
			Employee rajesh = new Employee("Rajesh", "Team-Lead", 1);
			rajesh.applyManagerPositionV2();			
		}catch (ManagerialPositionApplyException e) {
			e.printStackTrace();
			
			System.out.println(e.getRejectionReasonsCount());
			
		}
	}
}
