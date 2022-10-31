
public class IfElseDemo2 {

	public static void main(String[] args) {
		
		// 1 - 7
		// Monday - Sunday
		int dayOfWeek = 6;
		
		if (dayOfWeek == 1 || dayOfWeek == 2
				|| dayOfWeek == 3 || dayOfWeek == 4
				|| dayOfWeek == 5) {
			System.out.println("Weekday");
		}else {
			System.out.println("Weekend..");
		}
	}
}
