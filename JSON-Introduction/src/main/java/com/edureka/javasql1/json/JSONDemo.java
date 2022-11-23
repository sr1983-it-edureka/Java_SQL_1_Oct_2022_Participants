package com.edureka.javasql1.json;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONDemo {

	public static void main(String[] args) throws Exception {
		
		createJSONObject();
		readJSONData();
	}
	
	static void createJSONObject() {
		

		JSONObject person1 = new JSONObject();
		
		person1.put("name", "Rajesh");
		person1.put("age", 25);
		person1.put("location", "Bangalore");
		
		String jsonRepresentation = person1.toJSONString();
		System.out.println(jsonRepresentation);
		
	}
	
	static void readJSONData() throws Exception {
		
		JSONParser parser = new JSONParser();
		
		File fileObj = new File("person.json");
		FileReader reader = new FileReader(fileObj);
		
		Object object = parser.parse(reader);
		
		if (object instanceof JSONObject) {
			
			JSONObject jsonObj = (JSONObject)object;
			
			Iterator<String> iterator 
				= jsonObj.keySet().iterator();
			
			while (iterator.hasNext()) {
				
				String attributeName = iterator.next();
				
				String attributeValue = (String)
						jsonObj.get(attributeName);
				
				System.out.println(String.format(
					"Name %s, Value %s", attributeName, attributeValue));
			}
		}
		
	}
}
