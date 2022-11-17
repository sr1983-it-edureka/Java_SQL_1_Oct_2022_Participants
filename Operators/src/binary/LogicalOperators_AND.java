package binary;

public class LogicalOperators_AND {

	public static void main(String[] args) {
		
		// Ratings - A, B, C [A]
		// Should have company for more than year 
		// Eligible for a bonus
		
		boolean employeeHasStayedMoreThanAYear = true;
		char ratingOfEmployee = 'A';
		
		if (employeeHasStayedMoreThanAYear == true
			&& ratingOfEmployee == 'A') {
			System.out.println("Bonus Elgible");
		}else {
			System.out.println("Bonus NOT Eligible");
		}
		
		
	}
}
