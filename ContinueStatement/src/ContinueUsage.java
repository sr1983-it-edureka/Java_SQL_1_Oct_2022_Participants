
public class ContinueUsage {

	public static void main(String[] args) {
		
		for (int index = 1; index <=10; index ++) {
			
			if (index == 5) {
				continue;
				// Skip the current iteration, 
				// but continue with the next iteration
			}
			
			System.out.println("Process element-> " + index );
		}
	}
}
