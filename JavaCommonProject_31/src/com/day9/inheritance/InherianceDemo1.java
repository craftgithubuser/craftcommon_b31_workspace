package com.day9.inheritance;

class Animal {
	
	// field and method of the parent class
	String name;

	public void eat() {
		System.out.println("I can eat");
	}
}

// inherit from Animal 
class Dog extends Animal {

	// new method in subclass
	public void display() {
		System.out.println("My name is " + name);
	}
}

public class InherianceDemo1 {
	public static void main(String[] args) {
		
		// create an object of the subclass
		Dog d1 = new Dog();
		
		// access field of superclass
		d1.name = "Rohu";
		d1.display();
		d1.eat();
	}
}


// 
