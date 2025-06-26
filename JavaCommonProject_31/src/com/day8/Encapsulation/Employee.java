package com.day8.Encapsulation;

// variables need to be private and method needs to be public to achieve encapsulation!

public class Employee {
	// Private fields - hidden from outside world
	private String name;
	private int age;
	private double salary;
	private String ssn;

	// getter method - get the data - read-only
	// setter method - set the data - write-only

	// Public getters and setters with validation
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18 && age <= 65) {
			this.age = age;
		} else {
			throw new IllegalArgumentException("Invalid age for employee");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			throw new IllegalArgumentException("Salary cannot be negative");
		}
	}

	// Only provide getter for SSN (immutable)
	public String getSsn() {
		return "XXX-XX-" + ssn.substring(ssn.length() - 4);
	}
	// No setter for SSN - can't be changed after creation

}