package com.day9.polymorphism;

public class MethodOverloadingDemo1 {
	
	// method overloading: when we have multiple methods with same name but different paramters:
	// using method overloading we achive compile time polymorphism
	
	 int add(int a, int b) {
		return a + b;
	}
	
	 double add(double a, double b) {
		return a + b;
	}
	
	 double add(double a, int b) {
		return a + b;
	}
	
	 int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingDemo1 m1 = new MethodOverloadingDemo1();
		
		double returnVal = m1.add(10.4, 40);
		
		System.out.println("Total: " + returnVal);
	}

}
