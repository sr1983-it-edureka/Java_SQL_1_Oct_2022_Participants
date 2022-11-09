
public class WrapperClassDemo {

	public static void main(String[] args) {
		
		// primitive data type 
		int a;
		
		Integer aObj = new Integer(10);
		Float f = new Float(1.23f);
		
		Long longData = new Long(1000000);
		
		String numberData = "10";
		
		Integer value = Integer.parseInt(numberData);
		System.out.println(value);
		
		numberData = "2.34";
		Float floatValue = Float.parseFloat(numberData);
		System.out.println(floatValue);
	}	
}
