package com.edureka.javasql1.java8.demo1;

public class FirefoxBrowser implements Browser {


	@Override
	public void open() {
		
		System.out.println("Open Firefox Browser...");		
	}

	@Override
	public void close() {

		System.out.println("Closing Firefox Browser...");		
		
	}

	@Override
	public void openTab() {
		
		System.out.println("Open Tab - Same implementation for all browsers..");
	}

	@Override
	public void closeTab() {

		System.out.println("Close Tab - Same implementation for all browsers..");		
	}


}
