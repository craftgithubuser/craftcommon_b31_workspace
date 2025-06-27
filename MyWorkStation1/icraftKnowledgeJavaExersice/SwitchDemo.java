package icraftKnowledgeJavaExersice;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter week day in number");
	int day = in.nextInt();
	
	switch(day){
		case 1:
			System.out.println("Today is monday");
		break;
		
		case 2:
			System.out.println("Today is tuesday");
		break;
		
		case 3:
			System.out.println("Today is Wednesday");
		break;
		
		case 4:
			System.out.println("Today is thursday");
		break;
		
		case 5:
			System.out.println("Today is Frieday");
		break;
		
		case 6:
			System.out.println("Today is Saturday");
		break;
		
		case 7:
			System.out.println("Today is Sunday");
		break;
		
		default:
			System.out.println("that's not valid day ");
		break;
		
		
	}
	
	
	
	
	
	}

}
