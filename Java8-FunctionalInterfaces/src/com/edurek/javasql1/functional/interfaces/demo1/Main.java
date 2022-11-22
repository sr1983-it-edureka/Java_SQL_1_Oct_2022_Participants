package com.edurek.javasql1.functional.interfaces.demo1;

public class Main {

	public static void main(String[] args) {
		
		
//		variation1();
//		variation2();
//		variation3();
		variation4();
	}
	
	static void variation1() {

		String message = "hello %%% hai ###";

		// Variation 1
		AbusiveWordsCheckerImpl checker
			= new AbusiveWordsCheckerImpl();
		
		boolean result = checker.check(message);	
		System.out.println("Result is " + result);
		
	}
	
	static void variation2() {

		String message = "hello %%% hai ###";

		// Variation 2
		AbusiveWordsChecker checkerInterfaceRef = 
				new AbusiveWordsCheckerImpl();
		boolean result = checkerInterfaceRef.check(message);
		System.out.println("Result is " + result);
		
	}
	
	static void variation3() {
		
		class A{
			
		}
		
		class B implements AbusiveWordsChecker{

			@Override
			public boolean check(String data) {
				return false;
			}
			
		}
		
		// Variation 3				
		AbusiveWordsChecker checkerIntRef2 = 
				new AbusiveWordsChecker() {
					
					@Override
					public boolean check(String data) {
						
						if (data.contains("***") || data.contains("$$$")) {
							return true;
						}else {
							return false;
						}
					}
				};
		boolean result = checkerIntRef2.check("hello ***");
		System.out.println("Result is " + result);

	}
	
	static void variation4() {
		
		// Variation 4
		// Lambda expression
		
		AbusiveWordsChecker innerAnonClass = 				
			(String data) -> {
				if (data.contains("***") || data.contains("$$$")) {
					return true;
				}else {
					return false;
				}
			};
					
		/**
		 * 
@FunctionalInterface
public interface Addition {

	int add(int a, int b);
}		 */
			
		
		AbusiveWordsChecker checkerIntRef3 = 
				(String data) -> {
					
				if (data.contains("***") || data.contains("$$$")) {
					return true;
				}else {
					return false;
				}
					
		};
		boolean result = checkerIntRef3.check("hello");
		System.out.println("Result is " + result);

	}
}
