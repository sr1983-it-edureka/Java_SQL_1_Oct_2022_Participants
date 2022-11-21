import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	
		//  Key [Integer]		Value [String]
		//  10 -> Google Chrome
		// 	22 -> Windows Explorer
		//  35 -> Eclipse
		//  35 -> Eclipse 2.0
		
		// Hash - Ordering not going to be maintained
		HashMap<Integer, String> tasks = new HashMap<>();
		
		tasks.put(10, "Google Chrome");
		tasks.put(22, "Windows Explorer");
		tasks.put(35, "Eclipse");
		tasks.put(48, "Firefox");
		
		// 3 Differnt Data
		// Keys, Values, Key & Value
		
//		printKeys(tasks);
//		printValues(tasks);
		
//		basicOperations(tasks);
		
//		printKeysAndValuesV1(tasks);
		printKeysAndValuesV2(tasks);
	}
	
	static void basicOperations(HashMap<Integer, String> tasks) {
		
		// Valid Keys
		String value = tasks.get(48);
		System.out.println(value);
		
		// Invalid Key
		value = tasks.get(100);
		System.out.println(value);
		
		boolean containsKey100 = tasks.containsKey(100);
		System.out.println("Key 100 Contained in Map ?" + containsKey100);		
	}
	
	static void printKeys(HashMap<Integer, String> tasks) {
		
		Iterator<Integer> iterator  = tasks.keySet().iterator();		
		
		while (iterator.hasNext()) {
			
			int taskId = iterator.next();
		
			System.out.println(taskId);
		}		
		System.out.println();		
	}
	
	static void printValues(HashMap<Integer, String> tasks) {
		
		Iterator<String> strIterator = tasks.values().iterator();

		while (strIterator.hasNext()) {
			
			String taskName = strIterator.next();
		
			System.out.println(taskName);
		}				
	}
	
	static void printKeysAndValuesV1(HashMap<Integer, String> tasks){
		
		Iterator<Integer> iterator  = tasks.keySet().iterator();		
		
		while (iterator.hasNext()) {
			
			int taskId = iterator.next();
			
			String taskName = tasks.get(taskId);
		
			System.out.println(String.format(
				"Key is %d and value is %s", taskId, taskName));
			
		}		
		System.out.println();		
	}


	static void printKeysAndValuesV2(HashMap<Integer, String> tasks){
		
		System.out.println("Retreing data from map based on Map.Entry");
		Iterator<Map.Entry<Integer, String>> iterator  = tasks.entrySet().iterator();
		
		while (iterator.hasNext()) {
			
			Map.Entry<Integer, String> entry = iterator.next();
			
			int taskId = entry.getKey();
			String taskName = entry.getValue();
					
			System.out.println(String.format(
				"Key is %d and value is %s", taskId, taskName));
			
		}		
		System.out.println();		
	}


}
