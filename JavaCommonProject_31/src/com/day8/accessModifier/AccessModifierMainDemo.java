package com.day8.accessModifier;

public class AccessModifierMainDemo {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
		System.out.println("Account Holder: " + acc.accountHolderName);
//		System.out.println("Account Balance: " +  acc.balance);
		System.out.println("Account Branch Code: " +  acc.branchCode);
		System.out.println("Account Account Type: " +  acc.accountType);

	}

}
