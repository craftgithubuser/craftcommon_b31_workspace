package loopingexersice;

//public class FinancialCalculators {
	import java.util.Scanner;

	public class FinancialCalculators {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Welcome to Financial Calculators!");
	        System.out.println("Choose a calculator:");
	        System.out.println("1. Mortgage Calculator");
	        System.out.print("Enter your choice: ");
	        int choice = input.nextInt();

	        switch (choice) {
	            case 1:
	                mortgageCalculator(input);
	                break;
	            default:
	                System.out.println("Invalid option.");
	        }

	        input.close();
	    }
	

    public static void mortgageCalculator(Scanner input) {
        System.out.print("Enter loan amount (principal): ");
        double P = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 7.625): ");
        double r = input.nextDouble() / 100;

        System.out.print("Enter loan term in years: ");
        int y = input.nextInt();

        int n = y * 12;           // Total number of monthly payments
        double i = r / 12;        // Monthly interest rate

        double M = (P * (i * Math.pow(1 + i, n))) / (Math.pow(1 + i, n) - 1);
        double totalPayment = M * n;
        double totalInterest = totalPayment - P;

        System.out.printf("Monthly Payment: $%.2f\n", M);
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);
    }
}
