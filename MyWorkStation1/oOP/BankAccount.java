package oOP;

public class BankAccount {
	
	int accountNumber;
	String accountHolder;
	double accountBalance;
	

	
	
	void displayBalance() {
		
		System.out.println(accountNumber +" "+ accountHolder+" "+ accountBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount bankaccount1= new BankAccount();

bankaccount1.accountNumber= 1262676762;
bankaccount1.accountHolder="Ashenafi Zemedkun";
bankaccount1.accountBalance= 90035.95;

bankaccount1.displayBalance();

BankAccount bankaccount2= new BankAccount();
bankaccount2.accountNumber=1262676781;
bankaccount2.accountHolder="Heaven Ashenafi";
bankaccount2.accountBalance=7593.25;

bankaccount2.displayBalance();

BankAccount bankaccount3= new BankAccount();
bankaccount3.accountNumber=1262767123;
bankaccount3.accountHolder="Elizabeth Ashenafi";
bankaccount3.accountBalance=7646.89;

bankaccount3.displayBalance();

//public void deposit() {
//	]
//}













	}

}
