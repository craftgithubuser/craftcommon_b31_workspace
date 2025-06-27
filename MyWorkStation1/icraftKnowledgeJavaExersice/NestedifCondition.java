package icraftKnowledgeJavaExersice;

import java.util.Scanner;

public class NestedifCondition {

	public static void main(String[] args) {
		// 
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Enter your name");
//		String name = in.nextLine();
//		System.out.println("Enter your age");
//		int age = in.nextInt();
//		System.out.println("Enter your weight");
//		int weight = in.nextInt();
//		
		int age = 15;
		int weight = 7;
		String name = "user";
		
		if (age>=18) {
			
			if (weight > 50) {
				System.out.println("Hi"+ " " +name +" "+ "Congratulation you are eligible");
			}
			else {
				System.out.println("Hi "+ " " +name +""+"you are not eligible");
			}
		} 
		
		else {
			System.out.println("dont even think about it");
		}
		
		
	}

}
