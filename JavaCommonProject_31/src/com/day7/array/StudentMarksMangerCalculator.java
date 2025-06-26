package com.day7.array;

public class StudentMarksMangerCalculator {

	public static void main(String[] args) {
		
		int [][] studentMarks = 
	    {
	    	{67,78,80,95,70},
	    	{98,78,89,95,97,90},
	    	{67,78,80,95,99,80, 98},
	    	{87,67,98,95,66,60},
	    	{78,78,80,95,67,87},
		};
		//row-size = 5 , index 0-4 and column-size = 6, index =0-5
	
	
//	    studentMarks[0][0]= 67;
//	    studentMarks[4][5]= 87;
		
		int sum = 0;
		
		for(int i=0; i<studentMarks.length; i++) {
			
			for(int j=0; j<studentMarks[i].length; j++) {
				
				sum = sum + studentMarks[i][j];
			}
			
			double avg =  sum /studentMarks[i].length;
			
			System.out.println("Total mark row : "  + sum);
			
			System.out.println("Average mark row : "  + avg);
			
			System.out.println("\n");
			
			sum = 0;
			
		}
		
		
			
	}
}
