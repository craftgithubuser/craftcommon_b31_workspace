package com.day5.looping;

public class LoopStmtsDemo4 {

	public static void main(String[] args) {
		
//		write java code that will print odd numbers from 1 to 20.
//		1,3,5,7,9,11,13,15,17,19
		
		int i=1;
		while(i<=20) {
			System.out.print(i + " ");
			i +=2;
		}
		
		System.out.println("\n");
		
		int k=1;
		while(k<=20) {
			if(k % 2 != 0)
			System.out.print(k + " ");
			k++;
		}

	}

}
