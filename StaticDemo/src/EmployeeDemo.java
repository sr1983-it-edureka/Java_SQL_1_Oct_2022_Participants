
public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee sweta = new Employee("Sweta", "101");
		sweta.display();
		
		Employee rajesh = new Employee("Rajesh", "102");
		rajesh.display();
		
		Employee akash = new Employee("Akash", "103");
		akash.display();

		sweta.totalCount = 123;
		
		rajesh.display();
		
//		sweta.id = "102";
//		sweta.name = "Sweta S";
//		sweta.totalCount = 100;
//		
		sweta.display();
		rajesh.display();
		
//		rajesh.totalCount = -100;
//		
//		rajesh.display();
//		sweta.display();
		
	}
}
