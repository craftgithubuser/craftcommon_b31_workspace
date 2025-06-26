package icraftKnowledgeJavaExersice;

import java.util.Scanner;

public class Logicaloperators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	logical operators = used to connect two or more expressions
//		
//				&& = (AND)  bothe conditions must be true
//				|| = (OR) either condition myst be true
//				! = (NOT) reverses boolean value of a condition

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("you are playing a game! press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") || !response.equals("Q")) {
			System.out.println("You quit the game");
			
		}
		else {
			System.out.println("you are still playing the game*pew pew");
		}
	
		
		
		
		
		
	}

}
