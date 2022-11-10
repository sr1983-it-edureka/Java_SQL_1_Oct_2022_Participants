
public class BreakUsage {

	public static void main(String[] args) {
		
		// A batch - 25
		
		for (int index = 1; index <=25; index ++) {

			if (index == 10) {
				break;
			}

			System.out.println("Process some element at the end " + index);
		
		}
		
		System.out.println("After For Loop");
	}
}
