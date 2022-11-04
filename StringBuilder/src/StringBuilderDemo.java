
public class StringBuilderDemo {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Today we learnt about constructor. ");
		sb.append("In addition to constructor, "
				+ "we also understood constructor overloading.");
		sb.append("Right now, we are also learning how to use "
				+ "String Builder");
		
		
		System.out.println(sb.toString());
		System.out.println();
		
		
		sb.delete(30, 50);
		
		
		System.out.println(sb);
		
		sb.insert(15, "NEW TEXT INSERTED FROM THIS POINT");
		System.out.println();
		
		System.out.println(sb);
	}
}
