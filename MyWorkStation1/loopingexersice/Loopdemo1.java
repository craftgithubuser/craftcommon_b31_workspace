package loopingexersice;

// this multiplication code takes number from user. 

import java.util.Scanner;

import icraftKnowledgeJavaExersice.scanner;

public class Loopdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter your number");
		
		int number = scanner.nextInt();
		
		for(int i = 0; i <=112; i ++) {
			
			System.out.println(i +" * "+ number +" = "+i * number);
		}
		
		
	}
	
}
