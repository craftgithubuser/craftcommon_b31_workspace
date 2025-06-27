package financialCalculatorProject;

import java.util.Scanner;

public class FinancialCalculators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Financial Calculators!");
        System.out.println("Choose a calculator:");
        System.out.println("1 - Mortgage Calculator");
        System.out.println("2 - Future Value of Investment");
        System.out.println("3 - Present Value of Annuity");
        System.out.println("Any other number - Invalid");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                mortgageCalculator(input);
                break;
            case 2:
                futureValueCalculator(input);
                break;
            case 3:
                presentValueCalculator(input);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }

        input.close();
    }

    public static void mortgageCalculator(Scanner input) {
        System.out.println("=== Mortgage Calculator ===");
        
        System.out.print("Enter the loan amount (Principal): ");
        double principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = input.nextDouble() / 100;

        System.out.print("Enter the loan term in years: ");
        int years = input.nextInt();

        int n = 12 * years; // total payments
        double i = annualRate * 12; // monthly interest rate

        double M = principal * (Math.pow(1 + i, n) * i) / (Math.pow(1 + i, n) - 1);
        double totalInterest = (M * n) - principal;

        System.out.printf("Monthly Payment: $%.2f\n", M);
        System.out.printf("Total Interest: $%.2f\n", totalInterest);
    }

    public static void futureValueCalculator(Scanner input) {
        System.out.println("=== Future Value Calculator ===");

        System.out.print("Enter initial deposit (Principal): ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = input.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        	years *= 365;
        // Assuming compound interest annually
        double futureValue = principal * Math.pow(1 + annualRate, years);
        double totalInterest = futureValue - principal;

        System.out.printf("Future Value: $%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f\n", totalInterest);
    }

    public static void presentValueCalculator(Scanner input) {
        System.out.println("=== Present Value of Annuity Calculator ===");

        System.out.print("Enter monthly payout amount: ");
        double monthlyPayout = input.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualRate = input.nextDouble() / 100;

        System.out.print("Enter number of years for payout: ");
        int years = input.nextInt();

        int months = years * 12;
        double monthlyRate = annualRate / 12;

        double presentValue = monthlyPayout * (1 - Math.pow(1 + monthlyRate, -months)) / monthlyRate;

        System.out.printf("You need to invest today: $%.2f\n", presentValue);
    }
}

