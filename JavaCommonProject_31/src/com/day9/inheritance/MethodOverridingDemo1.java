package com.day9.inheritance;

class Shape {
	
    public double getArea() {
        return 0.0;
    }
    
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
	
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void display() {
        System.out.println("Child: Area of a circle " + getArea());
        System.out.println("Parent: Area of a circle " + super.getArea());
    }
}


public class MethodOverridingDemo1 {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(5.0);
		c1.display(); // Calls Circle's version
	}

}
