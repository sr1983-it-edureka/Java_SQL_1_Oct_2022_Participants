package com.edureka.javasql1.java8.demo2;

public interface Browser {

	void open();
	
	void close();
	
	default void openTab() {
		
		System.out.println("Open Tab - Same implementation for all browsers..");
	}

	default void closeTab() {

		System.out.println("Close Tab - Same implementation for all browsers..");		
	}	
	
}
