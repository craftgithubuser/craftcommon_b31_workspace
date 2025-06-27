package icraftKnowledgeJavaExersice;

import java.util.Scanner;

public class ConditionalStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Mark");
		int mark = in.nextInt();
		
		String Grade;
		
		if (mark>=90 && mark <=100) {
			Grade = "A";
		}
		else if(mark>80 && mark <=89) {
			Grade = "B";
		}
		
		else if (mark >=70 && mark <=79) {
			Grade = "C";
			
		}
		else if (mark>=60 && mark <=69) {
			Grade = "D";
		}
		else {
			Grade = "No Grade";
		}
	System.out.println("Student Grade is :" + ""+Grade);
	}
 
}
