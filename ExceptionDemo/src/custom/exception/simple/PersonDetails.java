package custom.exception.simple;

public class PersonDetails {

	private String name;
	private int age;
	private float salary;
	
	public PersonDetails(String name, int age, float salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
		
	}
	
	public void validate() throws NegativeNumberException {
		
		boolean ageValidationError = false;
		boolean salaryValidationError = false;
		
		if (age < 0) {
			ageValidationError = true;
		}
		
		if (salary < 0.00F) {
			salaryValidationError = true;
		}

		StringBuilder errorMessages = new StringBuilder();
		
		if (ageValidationError) {
			errorMessages.append("\r\n");
			errorMessages.append("Age cannot be negative : " + age);
		}
		
		if (salaryValidationError) {
			errorMessages.append("\r\n");
			errorMessages.append("Salary cannot be negative : " + salary);			
		}
		
		if (ageValidationError || salaryValidationError) {
			throw new NegativeNumberException(errorMessages.toString());			
		}
	}
	
	void display() {
		
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Salary is " + salary);
	}
}
