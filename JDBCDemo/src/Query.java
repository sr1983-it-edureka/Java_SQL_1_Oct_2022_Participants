
public class Query {

	// 
	// INSERT INTO EMPLOYEE (col1, col2, col3) VALUES (1, abc, def)
	// Stage 1
		// Syntax validated [3 seconds]
	// Stage 2
		// Query execution [1 second]
	
	// Statement -> [] -> 4 seconds
	// Statement -> 10 inserts -> (10 * 4) seconds 
	
	// PreparedStatement -> precompiled statement
	// INSERT INTO EMPLOYEE (col1, col2, col3) VALUES (?, ?, ?)
	// Instance 1
		//  Stage 1
			// Syntax Validation - 3 seconds
		// Stage 2
			// Query executed - 1 second
	
	// Instance 2
		// Query execution - 1 second
	
}
