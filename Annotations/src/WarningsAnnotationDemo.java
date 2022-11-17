import java.util.ArrayList;
import java.util.Iterator;

public class WarningsAnnotationDemo  {

	public static void main(String[] args) {
		
		
		anyTypeArrayList();
	}

	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })
	static void anyTypeArrayList() {
		
		ArrayList list = new ArrayList<>();
		
		list.add(new String("hello"));
		list.add(new Integer(10));
		list.add(new Float(10.124F));
		list.add(new String("good afternoon"));
		list.add(new Double(10.1234D));
		list.add(new String("good night"));
		list.add(new Character('U'));
		
		
		System.out.println(list);
		
		Iterator<Object> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			
			Object anObject = iterator.next();
			System.out.println(anObject);
			
			if (anObject instanceof String) {
				String strObj = (String)anObject;
				System.out.println(strObj + ", Length " +  strObj.length());				
			}else {
				System.out.println(anObject);
			}
		}
	}
}
