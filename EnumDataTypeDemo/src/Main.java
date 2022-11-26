
public class Main {

	public static void main(String[] args) {
		
//		payrollProcessV1();

		payrollProcessV2();
	}
	
	static void payrollProcessV1() {
		
		Employee e1 = new Employee("Krishna", "Manager");
		Employee e2 = new Employee("Aarti", "HR");
		
		Organization organization = new Organization();
		organization.payrollProcessv1(e1);
		
		organization.payrollProcessv1(e2);

		Employee e3 = new Employee("Sweta", "Managr");
		organization.payrollProcessv1(e3);
	}

	static void payrollProcessV2() {
		
		Employee e1 = new Employee("Krishna", Designation.MANAGER);
		Employee e2 = new Employee("Aarti", Designation.HR);
		
		Organization organization = new Organization();
		organization.payrollProcessv2(e1);
		
		organization.payrollProcessv2(e2);

		Employee e3 = new Employee("Sweta", Designation.MANAGER);
		organization.payrollProcessv2(e3);
	}

}
