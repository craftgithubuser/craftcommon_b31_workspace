package com.icraft.day3.variable;

public class LocalVariableDemo {

	public void methodOne() {
		int i = 10; // i is local variable
		System.out.println("i : " + i);
	}

	public void methodTwo() {
		int j = 20; // j i local variable
		System.out.println("j : " + j);
//		System.out.println("i : " + i);
	}
	
	public static void main(String[] args) {
		
//		 new LocalVariableDemo().methodOne();
//		 new LocalVariableDemo().methodTwo();
		
		LocalVariableDemo l1 = new LocalVariableDemo();
		l1.methodOne();
		l1.methodTwo();
	}
}
// object - its an instance of a class - real-world exist -physically exist entity
// class - blueprint or template of an object