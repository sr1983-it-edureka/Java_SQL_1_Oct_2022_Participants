package xpath;

import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EmployeeXPathUtils {
	
	// Step1 -> Constructing the xpath expression
	// Step 2 -> Compile the expression
	// Step 3 -> Evaluate the expression

	XPath employeeXPath;
	Document document;
	
	public EmployeeXPathUtils(XPath employeeXPath, Document document) {
		
		this.employeeXPath = employeeXPath;
		this.document = document;
	}
	
	public ArrayList<String> getNames(int age) {
		
		ArrayList<String> result = new ArrayList<>();
		
		String expression = 
		String.format("/employees/employee[age>%d]/firstName/text()", age);
			
		XPathExpression expressionObj;
		try {
			expressionObj = employeeXPath.compile(expression);
			
			NodeList firstNamesList = (NodeList)expressionObj.evaluate(
					document, XPathConstants.NODESET);
			
			for (int index = 0; index < firstNamesList.getLength(); index ++) {
				
				Node firstNameNode = firstNamesList.item(index);
				String firstName = firstNameNode.getNodeValue();
				
				result.add(firstName);
			}
			return result;			
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String[] getNames(String id) {
		
		String firstName = getText(id, "firstName");
		String lastName = getText(id, "lastName");

		return new String[] {firstName, lastName};
	}

	
	public String getText(String id, String elementName) {
		
		String expression = String.format("/employees/employee[@id=%s]/%s/text()", id, elementName);
				
		XPathExpression expressionObj;
		try {
			expressionObj = employeeXPath.compile(expression);
			
			String value = (String) expressionObj.evaluate(document, XPathConstants.STRING);
			return value;
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}	


}
