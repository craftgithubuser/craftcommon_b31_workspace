import java.util.Scanner;

public class ConditionalIfdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);	
	System.out.println("please enter positive numbers from 1 to 100,000");
	int number = in.nextInt();
		
	if(number<=10 && number >1)	{
		System.out.println("Its one digit number");
	}else if (number <100 && number >10) {
		System.out.println("Its two digit number");
	}else if (number <1000 && number >100) {
		System.out.println("Its three digit number");
	}else if (number <10000 && number >1000) {
		System.out.println("Its four digit number");
	}else if (number <100000 && number >10000) {
		System.out.println("Its five digit number");
	}else if (number <1000000 && number >10000) {
		System.out.println("Its six digit number");
	}else {
		System.out.println(number + " : "+"this number  is not between 1 & 999999");
	}
		
		
	}
	

}
