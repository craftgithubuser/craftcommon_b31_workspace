package com.day6.branching;

public class BreakStmtsDemo {

	public static void main(String[] args) {


		for(int i=1; i<=100; i++) {
			
			if(i == 15)
				continue;
			
			System.out.print(i + " ");
		}

	}

}
