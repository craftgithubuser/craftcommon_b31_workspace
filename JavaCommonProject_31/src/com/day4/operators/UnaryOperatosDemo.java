package com.day4.operators;

public class UnaryOperatosDemo {

	public static void main(String[] args) {
		
		// declare variables
		int a = 12, b = 12;
		int result1, result2;
		
		// original value
		System.out.println("Value of a: " + a); //12
		// increment operator
		result1 = ++a; //13
		System.out.println("After increment: " + result1); //13
		System.out.println("Value of a after increment: " + a);//13
		
		System.out.println("Value of b: " + b); //12
		// decrement operator
		result2 = --b; // 11
		System.out.println("After decrement: " + result2); //11
		System.out.println("Value of b after decrement: " + b);//11
	}

}
