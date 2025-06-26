
//public class projectDemo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	package com.ashu.calculators;

		import java.util.Scanner;

		public class projectDemo {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.println("Welcome to Financial Calculators!");
		        System.out.println("Choose a calculator:");
		        System.out.println("1 - Mortgage Calculator");
		        System.out.println("2 - Future Value Calculator");
		        System.out.println("3 - Present Value Calculator");
		        System.out.print("Enter choice: ");

		        int choice = input.nextInt();

		        switch (choice) {
		            case 1 -> MortgageCalculator.calculate(input);
		            case 2 -> FutureValueCalculator.calculate(input);
		            case 3 -> PresentValueCalculator.calculate(input);
		            default -> System.out.println("Invalid choice. Please try again.");
		        }

		        input.close();
		
		

	}

}
