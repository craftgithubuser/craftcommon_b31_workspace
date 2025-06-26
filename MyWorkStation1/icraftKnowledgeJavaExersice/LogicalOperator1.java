package icraftKnowledgeJavaExersice;

import java.util.Scanner;

public class LogicalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		
		
		double number = scanner.nextDouble();
		String result;
		
		result =(number>0.0)? "Positive" : " negetive";
		System.out.println(number + " is " + result);
	}

}
