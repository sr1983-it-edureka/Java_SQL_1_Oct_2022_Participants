package xpath;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XPathDemo {

	public static void main(String[] args) {
		
		XPath employeeXPath = returnXPath();
		Document employeeDocument = returnDocument("employees.xml");
		
		EmployeeXPathUtils employeePathUtils = new EmployeeXPathUtils(
			employeeXPath, employeeDocument);
		
		String names[] = employeePathUtils.getNames("104");
		System.out.println(names[0] + "-" + names[1]);
		
		ArrayList<String> nameList = employeePathUtils.getNames(25);
		System.out.println(nameList);
	}
	
	static XPath returnXPath() {
		
		XPathFactory factory  = XPathFactory.newInstance();
		
		XPath xPath = factory.newXPath();
		return xPath;
	}
	
	static Document returnDocument(String filename) {
		
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		
		try {
			return factory.newDocumentBuilder().parse(filename);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
}
