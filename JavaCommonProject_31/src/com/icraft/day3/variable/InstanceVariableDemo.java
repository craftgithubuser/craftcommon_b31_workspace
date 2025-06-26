package com.icraft.day3.variable;

public class InstanceVariableDemo {
	
	
	int age = 25; //instance variable
	
	public void methodOne() {
		int i = 10; // i is local variable
		System.out.println("i : " + i);
		System.out.println("age in method one: " + age);
	}

	public void methodTwo() {
		int j = 20; // j i local variable
		System.out.println("j : " + j);
		System.out.println("age in method two: " + age);
	}
	
	public static void main(String[] args) {
		
		InstanceVariableDemo m1 = new InstanceVariableDemo();
		m1.age = 40;
		m1.methodOne();
		
		InstanceVariableDemo m2 = new InstanceVariableDemo();
		m2.methodOne();
		
	}

}
