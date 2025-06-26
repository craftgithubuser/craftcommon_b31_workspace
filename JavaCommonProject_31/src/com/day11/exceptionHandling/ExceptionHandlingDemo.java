package com.day11.exceptionHandling;

public class ExceptionHandlingDemo {
	
	public static void main(String[] args) {
		
		int a =10, b=0;
		try {
			
			int value[] = new int[5];
			value[5] = 10;
			
			int result = a / b;
			System.out.println(result);
			
		} catch(Exception ex) {
		} 

		
		System.out.println("This is end line of the code");

	}

}
