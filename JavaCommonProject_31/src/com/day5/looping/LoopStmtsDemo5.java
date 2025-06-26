package com.day5.looping;

public class LoopStmtsDemo5 {

	public static void main(String[] args) {
		
//		write java code that will print even numbers from 1 to 20.
//		2,4,6,8,10,12,14,16,18,20

		for(int i=1; i<=20; i++) {
			if(i % 2 == 0)
				System.out.print(i + " ");
		}
		
	}

}
