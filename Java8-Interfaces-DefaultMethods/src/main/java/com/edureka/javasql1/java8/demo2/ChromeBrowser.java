package com.edureka.javasql1.java8.demo2;

public class ChromeBrowser implements Browser {

	@Override
	public void open() {
		
		System.out.println("Open Chrome Browser...");		
	}

	@Override
	public void close() {

		System.out.println("Closing Chrome Browser...");		
		
	}

}
