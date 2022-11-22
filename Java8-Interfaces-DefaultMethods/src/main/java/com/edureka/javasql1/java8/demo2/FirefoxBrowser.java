package com.edureka.javasql1.java8.demo2;

public class FirefoxBrowser implements Browser {


	@Override
	public void open() {
		
		System.out.println("Open Firefox Browser...");		
	}

	@Override
	public void close() {

		System.out.println("Closing Firefox Browser...");		
		
	}

}
