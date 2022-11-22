package com.edureka.javasql1.xml.schemas;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class SchemaValidator {

	String xsdFilename;
	String xmlFilename;
	
	public SchemaValidator(String xsdFilename, String xmlFilename) {
	
		this.xsdFilename = xsdFilename;
		this.xmlFilename = xmlFilename;
	}
	
	public void validate() throws IOException, SAXException {

		Schema schema = getSchema();
		
		Validator validator = schema.newValidator();
		
		File fileObj = new File(xmlFilename);
		StreamSource source = new StreamSource(fileObj);
		
		validator.validate(source);
		System.out.println("VALIDATION DONE");
	}
	
	Schema getSchema() throws SAXException {
		
		SchemaFactory factory = 
				SchemaFactory.newDefaultInstance();
		
		File schema = new File(xsdFilename);
		Schema schemaObj = factory.newSchema(schema);
		
		return schemaObj;
	}
}
