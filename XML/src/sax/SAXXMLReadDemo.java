package sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SAXXMLReadDemo {

	public static void main(String[] args) {
		
		// Simple API For XML
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		SAXParser parser;
		try {
			parser = factory.newSAXParser();
			
			File employeeXmlFile = new File("employees.xml");
			
			EmployeesProcessor processor = new EmployeesProcessor();
			try {
				parser.parse(employeeXmlFile, processor);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
