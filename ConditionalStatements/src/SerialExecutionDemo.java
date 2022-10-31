
public class SerialExecutionDemo {

	public static void main(String[] args) {
		
		int a = 10;
		a = 11;
		System.out.println(a);
		
		int b;
		b = 20;
		System.out.println(b);
		
		int c = 30;
		System.out.println(c);
	}
}
