package com.day11.absctration.absctractClass;

public class AbsctractionMainDemo {

	public static void main(String[] args) {
		
		Figure f1 = new FigureImpl();
		f1.calcArea(10);
		
		A a1 = new B();
		a1.callme();
		a1.callmetoo();

	}

}
