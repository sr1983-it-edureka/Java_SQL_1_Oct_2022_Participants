package sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EmployeesProcessor extends DefaultHandler {

	boolean firstNameVisited = false;
	boolean lastNameVisited = false;
	boolean ageVisited = false;
	boolean salaryVisited = false;
	
	public void startDocument() throws SAXException {
		
		System.out.println("Start Document");
		// no op
	}

	public void startElement(String uri, String localName, String qName, 
			Attributes attributes) throws SAXException {

		System.out.println("Start Element -> " + qName);
		
		StringBuilder contents = new StringBuilder();
		int count = attributes.getLength();
		for (int index=0; index < count; index ++) {
			
			String attributeName = attributes.getQName(index);
			String attributeValue = attributes.getValue(index);
			
			contents.append(String.format(
				"Attr Name -> %s, Attr Value -> %s ", attributeName, attributeValue));;
		}
		
		if (qName.equals("firstName")) {
			firstNameVisited = true;
		}else if (qName.equals("lastName")) {
			lastNameVisited = true;
		}else if (qName.equals("age")) {
			ageVisited = true;
		}else if (qName.equals("salary")) {
			salaryVisited = true;
		}
		
		System.out.println(contents.toString());
	}

    public void characters (char ch[], int start, int length)
            throws SAXException
        {
            String value = new String(ch, start, length);
//            System.out.println("Value ->" + value);
            
            if (firstNameVisited) {
            	System.out.println("First Name -> " + value);
            	firstNameVisited = false;
            }
            
            if (lastNameVisited) {
            	
            	System.out.println("Last Name ->" + value);
            	lastNameVisited = false;
            }
            
            if (ageVisited) {
            	System.out.println("Age -> " + value);
            	ageVisited = false;
            }
            
            if (salaryVisited) {
            	System.out.println("Salary -> " + value);
            	salaryVisited = false;
            }
        }
	
	public void endElement(String uri, String localName, 
			String qName) throws SAXException {
		
		System.out.println("End Element -> " + qName);
		// no op
	}

	public void endDocument() throws SAXException {
		
		System.out.println("End Document");
		// no op
	}

}
