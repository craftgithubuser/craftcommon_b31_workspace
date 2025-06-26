package com.day8.accessModifier;

//Example demonstrating different access modifiers
public class BankAccount {
	
	// Private - only accessible within this class
	private double balance = 1000.3;
	private String accountNumber = "123456789098trty";

	// Protected - accessible within package and subclasses
	protected String accountType = "Saving";

	// Default (package-private) - accessible within package
	String branchCode = "00000TR";

	// Public - accessible from anywhere
	public String accountHolderName = "Jamie";

}