package array.totalcountv2;

public class TeacherMain {

	public static void main(String[] args) {
		
		int [] array = {-10, 0, 10, -20, 20, 30, 70};
		
		ArrayTotalCounter forRam = new ArrayTotalCounterRam();
		forRam.countNumbers(array);
		int result = forRam.getResult();
		
		ArrayTotalCounter forJoannna = new JoannaArrayCounter();
		forJoannna.countNumbers(array);
		result = forJoannna.getResult();
		
	}
}
