package com.icraft.day2;

import java.util.Scanner;

public class ScannerEmployeeInfo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter your first name: ");
		String firstName = in.next();
		
		System.out.println("please enter your last name: ");
		String lastName = in.next();
		
		System.out.println("please enter your age: ");
		int age = in.nextInt();
		
		System.out.println("please enter your salary: ");
		double salary = in.nextDouble();
		
		System.out.println("please enter your bonus: ");
		double bonus = in.nextDouble();
		
		double totalSalary = salary + bonus;
		
		System.out.println("Employee Name: " + firstName + " " + lastName);
		System.out.println("Employee Age: " + age);
		System.out.println("Employee Salary: " + totalSalary);

	}

}
