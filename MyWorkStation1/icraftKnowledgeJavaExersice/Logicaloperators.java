package icraftKnowledgeJavaExersice;

import java.io.InputStream;

public class Logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// logical operators = used to connect two or more experessions
		// && = (AND) both conditions must be true
		// ||=(OR) either condition must be true
		// ! = (NOT) reverses boolean value of codition
		
	scanner scanner = Scanner(System.in);

	System.out.println("you are playing a game! press q or Q to quit");
	String response = scanner.next();
	
	if(response.equals("q") || response.equals("Q")) {
		System.out.println("You quit the game");
	}
		
	else {
		
	    System.out.println("You are still playiing the *pew pew*");
		
	}
			
		
		
		
		
		
		
		
			
	}

	private static scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

