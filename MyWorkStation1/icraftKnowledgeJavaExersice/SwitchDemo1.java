package icraftKnowledgeJavaExersice;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter week day in number");
		int day = in.nextInt();
		String dayName;
		switch(day){
			case 1:
				dayName="Today is Monday";
			break;
			
			case 2:
				dayName="Today is Tuesday";
			break;
			
			case 3:
				dayName="Today is Wednesday";
			break;
			
			case 4:
				dayName="Today is Thersday";
			break;
			
			case 5:
				dayName="Today is Frieday";
			break;
			
			case 6:
				dayName="Today is Saterday";
			break;
			
			case 7:
				dayName="Today is Sunday";
			break;
			
			default:
				dayName="Invalide day";
			break;
					
		}
		
		System.out.println(dayName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
