package com.day4.operators;

import java.util.Scanner;

public class TernaryOperatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter your kids age:");
		int age = in.nextInt();
		
		String value;
		
		value = (age >= 6) ? "Eligable to School" : "under age";
		
		System.out.println(value);

	}

}
