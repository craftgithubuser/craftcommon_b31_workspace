import java.util.Scanner;

public class Project1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	import java.util.Scanner;

		public class FinancialCalculators {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.println("🔢 Welcome to Ashu's Financial Calculators 🔢");

		        for (;;) {
		            System.out.println("\nChoose a calculator:");
		            System.out.println("1 - Mortgage Calculator");
		            System.out.println("2 - Future Value Calculator");
		            System.out.println("3 - Present Value of Annuity Calculator");
		            System.out.println("0 - Exit");
		            System.out.print("Enter your choice: ");

		            int choice = input.nextInt();

		            if (choice == 0) {
		                System.out.println("Thank you for using the calculators. Goodbye!");
		                break;
		            }

		            switch (choice) {
		                case 1:
		                    runMortgageCalculator(input);
		                    break;
		                case 2:
		                    runFutureValueCalculator(input);
		                    break;
		                case 3:
		                    runPresentValueCalculator(input);
		                    break;
		                default:
		                    System.out.println("❌ Invalid choice. Please try again.");
		            }
		        }

		        input.close();
		    }

		    // Mortgage Calculator
		    public static void runMortgageCalculator(Scanner input) {
		        System.out.println("\n🏠 Mortgage Calculator");

		        System.out.print("Enter loan amount (principal): ");
		        double principal = input.nextDouble();

		        System.out.print("Enter annual interest rate (e.g., 7.625): ");
		        double annualInterestRate = input.nextDouble() / 100;

		        System.out.print("Enter loan term in years: ");
		        int years = input.nextInt();

		        int totalMonths = years * 12;
		        double monthlyRate = annualInterestRate / 12;

		        double numerator = principal * monthlyRate * Math.pow(1 + monthlyRate, totalMonths);
		        double denominator = Math.pow(1 + monthlyRate, totalMonths) - 1;
		        double monthlyPayment = numerator / denominator;

		        double totalInterest = (monthlyPayment * totalMonths) - principal;

		        System.out.printf("📅 Monthly Payment: $%.2f\n", monthlyPayment);
		        System.out.printf("💸 Total Interest Paid: $%.2f\n", totalInterest);
		    }

		    // Future Value Calculator
		    public static void runFutureValueCalculator(Scanner input) {
		        System.out.println("\n💰 Future Value Calculator");

		        System.out.print("Enter deposit amount: ");
		        double deposit = input.nextDouble();

		        System.out.print("Enter annual interest rate (e.g., 5): ");
		        double annualRate = input.nextDouble() / 100;

		        System.out.print("Enter number of years: ");
		        double years = input.nextDouble();

		        int daysPerYear = 365;
		        double futureValue = deposit * Math.pow(1 + (annualRate / daysPerYear), daysPerYear * years);
		        double totalInterest = futureValue - deposit;

		        System.out.printf("📈 Future Value: $%.2f\n", futureValue);
		        System.out.printf("💵 Total Interest Earned: $%.2f\n", totalInterest);
		    }

		    // Present Value of Annuity Calculator
		    public static void runPresentValueCalculator(Scanner input) {
		        System.out.println("\n📉 Present Value of Annuity Calculator");

		        System.out.print("Enter monthly payout amount: ");
		        double monthlyPayout = input.nextDouble();

		        System.out.print("Enter expected annual interest rate (e.g., 5): ");
		        double annualRate = input.nextDouble() / 100;

		        System.out.print("Enter number of years to pay out: ");
		        int years = input.nextInt();

		        int totalMonths = years * 12;
		        double monthlyRate = annualRate / 12;

		        double presentValue = monthlyPayout * ((1 - Math.pow(1 + monthlyRate, -totalMonths)) / monthlyRate);

		        System.out.printf("💳 Present Value of Annuity: $%.2f\n", presentValue);
		    }
		}

	}


