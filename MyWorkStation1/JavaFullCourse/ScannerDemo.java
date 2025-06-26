package JavaFullCourse;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = scanner.nextLine();
		
		System.out.println("what is your age?");
		int age = scanner.nextInt();
		
		System.out.println("What is your favorite food ?");
		String food = scanner.nextLine();
		scanner.nextLine();// the reason to we put an closing scanner is to get to the next line of code.
		scanner.close();// we always have to close our scanner 
		
		System.out.println("hello your name is :"+ name);
		System.out.println("your age is :"+ age);
		System.out.println("your favorite food is :" + food);
		
		
	}

}
