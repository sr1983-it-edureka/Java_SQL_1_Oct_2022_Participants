package com.edureka.javasql1.xml.schemas;

public class Main {

	public static void main(String[] args) throws Exception{
		
		SchemaValidator validator
			= new SchemaValidator("person.xsd", "person2.xml");
		validator.validate();
	}
}
