package com.day7.array;

public class StudentMarksManger {

	public static void main(String[] args) {
		
		int [] studentMarks = {67,78,80,95,55,77}; //index=0-5, size=6
		
		int sum = 0;
		
		//for-each loops
		
		for(int elt: studentMarks) {
			sum = sum + elt;
		}
		
		double avg = sum / studentMarks.length;
		
		System.out.println("Total mark:" + sum);
		
		System.out.println("Average mark:" + avg);

	}

}
