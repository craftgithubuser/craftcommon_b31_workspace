package com.day6.branching;

import com.day8.accessModifier.BankAccount;

public class AccessModifierMainDemo2 extends BankAccount {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount();
		
		System.out.println("Account Holder: " + acc.accountHolderName);
//		System.out.println("Account Branch Code: " +  acc.branchCode);
//		System.out.println("Account Account Type: " +  acc.accountType);
		
	}

}
