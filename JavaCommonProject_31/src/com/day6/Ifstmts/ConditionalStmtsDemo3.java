package com.day6.Ifstmts;

public class ConditionalStmtsDemo3 {

	public static void main(String[] args) {

		int age = 17;
		int weight = 70;

		if (age >= 18) {
			
			if (weight > 80) {
				System.out.println("you are eligible");
			} else {
				System.out.println("you are not eligible, due to weight issue");
			}
			
			
		} else {
			System.out.println("you are not totally eligible");
		}

	}

}
