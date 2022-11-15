import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMReadDemo {

	public static void main(String[] args) {
		
		// XML - Extensible Markup language
	
		Document myResumeDocument = createDocument();
		
		// Root element
		
		Element resumeElement = myResumeDocument.getDocumentElement();
		
		System.out.println(resumeElement.getNodeName());
		
		NodeList projectsNodeList 
			= myResumeDocument.getElementsByTagName("project");
		
		for (int index = 0; index < projectsNodeList.getLength(); index ++) {
			
			Node projectNode = projectsNodeList.item(index);
			
			
			if (projectNode.getNodeType() == Node.ELEMENT_NODE) {
				
				Element projectElement = (Element)projectNode;
				
				String id = projectElement.getAttribute("id");
				
				String projectName = 
				projectElement.getElementsByTagName("name")
					.item(0).getTextContent();

				String teamSize = 
				projectElement.getElementsByTagName("teamSize")
					.item(0).getTextContent();

				String budget = 
						projectElement.getElementsByTagName("budget")
					.item(0).getTextContent();
				
				System.out.println(
					String.format("Project : ID is %s, Name is %s,"
						+ "Team Size %s, Budget %s", 
							id, projectName, teamSize, budget));
			}
		}
	}
	
	static Document createDocument() {
		
		DocumentBuilderFactory factory = 
		DocumentBuilderFactory.newInstance();
		
		try {
			return factory.newDocumentBuilder().parse("myresume.xml");
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
