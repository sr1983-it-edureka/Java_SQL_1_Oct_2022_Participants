package com.edureka.javasql1.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_XML)
	public String hello() {
		
		String xmlContent = "<hello>"
				+ "Hello Everyone"
				+ "</hello>";
		
		return xmlContent;
	}
}
