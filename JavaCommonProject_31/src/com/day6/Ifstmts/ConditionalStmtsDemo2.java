package com.day6.Ifstmts;

import java.util.Scanner;

public class ConditionalStmtsDemo2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String consent = "n";
		
		do {
		System.out.println("\n Please enter you mark value: ");
		double mark = in.nextDouble();
		
		String grade;
		
		if(mark >=90 && mark <=100) {
			grade = "A+";
		}
		else if(mark >=80 && mark <90) {
			grade = "A";
		}
		else if(mark >=70 && mark <80) {
			grade = "B";
		}
		else if(mark >=60 && mark <70) {
			grade = "C";
		}
		else if(mark >=50 && mark <60) {
			grade = "D";
		}
		else if(mark >=30 && mark <50) {
			grade = "F";
		}
		else {
			grade = "No Grade";
		}
		System.out.println("Student Grade: " +  grade);
		
		System.out.println("\nTo proceed click y/Y");
		consent= in.next();
		
		}while(consent.equalsIgnoreCase("y"));

	}

}
