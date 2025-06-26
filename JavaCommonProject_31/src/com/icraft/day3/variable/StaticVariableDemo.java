package com.icraft.day3.variable;

public class StaticVariableDemo {
	
	String studentName = "James"; //instance variable
	static int section = 101;  //static variable --global variable
	
	public void display() {
		System.out.println("student name : " +  studentName);
		System.out.println("section : " +  section);
	}
	
	public static void main(String[] args) {
		
		StaticVariableDemo m1 = new StaticVariableDemo();
		m1.studentName = "Abebe";
		m1.section = 102;
		m1.display();
		
		StaticVariableDemo m2 = new StaticVariableDemo();
		m2.display();
	}

}
