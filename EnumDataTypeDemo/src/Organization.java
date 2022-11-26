
public class Organization {

	public void payrollProcessv1(Employee employee) {
		
		String empName = employee.getName();
		String designation = employee.getDesignation();
		
		if (designation.equals("Manager")) {
			// 
			System.out.println("Payroll processing for Manager " 
			+ empName);
		}else if (designation.equals("VP")) {
			
			System.out.println("Payroll for VP.." + empName);
		}else if (designation.equals("Director")) {
			
			System.out.println("Payroll for director.." + empName);
		}else if (designation.equals("HR")) {
			
			System.out.println("Payroll processing for HR.. " + empName);
		}
	}


	public void payrollProcessv2(Employee employee) {
		
		String empName = employee.getName();
		Designation designationObj = employee.getDesignation2();
		
		if (designationObj.equals(Designation.MANAGER)) {
			// 
			System.out.println("Payroll processing for Manager " 
			+ empName);
		}else if (designationObj.equals(Designation.VIP)) {
			
			System.out.println("Payroll for VP.." + empName);
		}else if (designationObj.equals(Designation.DIRECTOR)) {
			
			System.out.println("Payroll for director.." + empName);
		}else if (designationObj.equals(Designation.HR)) {
			
			System.out.println("Payroll processing for HR.. " + empName);
		}
	}

}
