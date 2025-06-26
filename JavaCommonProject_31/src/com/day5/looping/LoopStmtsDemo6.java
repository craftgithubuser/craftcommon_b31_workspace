package com.day5.looping;

public class LoopStmtsDemo6 {

	public static void main(String[] args) {
		
//		write java code that will print.
//		1,2,3,4,5
//		1,2,3,4,5
//		1,2,3,4,5
//		1,2,3,4,5
		
		for(int j = 1; j<=4; j++) {
			
			for(int i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
		}

	}

}
