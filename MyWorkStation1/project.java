import java.util.Scanner;

public class project {

	//private static final int P = 53000;
	//private static final double i = 0.07625;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double a;
		
		System.out.println("Welcome to Ashu financial calculators"); 
	
		System.out.println("please choose 1 for motrtgage calculator ,/n 2 for future value ,/n 3 for present value");
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		int choice  =scanner.nextInt();
		 
		if(choice>3) {
			
		switch(choice){
		
		case 1: 
			System.out.println(" you choose mortgageCalculator");
		break;
		
		case 2:
			System.out.println(" you choose futurValue");
		break;
		
		case 3: 
			System.out.println(" you choose presentvalue");
		break;
		default :  
			System.out.println(" invalid selection") ;
			System.out.close();
		}
		
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("please enter the principal amount");
		
		double P = in.nextDouble();	//(P) refers principal principal
		
		System.out.println("please enter the the loan term" );
		
		int y = in.nextInt();   	// y refers loan term in years loanTermInYears

		double  r = 0.07625;	// r refers annual interest rate annualInterestRate

		

		int n = y*12;	// n refers number of monthly payments  numberOfMonthlyPayments

		double i = r/12;	// i refers number of interest rate monthlyInterestRate
		
		//double M = (P+i)/180; // Monthly payments   
		
		// a = M=(P*(i*(1+i)^n / ((1+i)^n)-1)) ; this formula interpreted to 
		double M = (P * ( 1 * Math.pow(1 + i, n))) / ( Math.pow(1+ i, n) - 1);
		double totalInterest= (M*n)-P;	//total interest calculator
		
		 
		 in.close();
		 
	      
		  System.out.println("your annual interest rate is :" + " "+totalInterest); 
	//	  System.out.println("your monthly payment supposed to be "+ M);
	//	  System.out.println("your monthly payment is"+ a);
		  System.out.printf("Monthly Payment: $%.2f\n", M);
		}
		
	}
}

