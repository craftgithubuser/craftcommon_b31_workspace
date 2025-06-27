package icraftKnowledgeJavaExersice;

public class ArthmeticOperations {
	public static void main(String[] args) { 
		
		// declare variables
		int a = 11, b = 5;// this is called module operator and it gives us reminder  after we divided two numbers
		int x = a % b;
		
		// addition operator
		System.out.println("a + b = " + (a + b));
		
		// subtraction operator
		System.out.println("a - b = " + (a - b));
		
		// multiplication operator
		System.out.println("a * b = " + (a * b));
		
		// division operator
		System.out.println("a / b = " + (a / b));
		
		// modulo operator
		System.out.println("a % b = " + (a % b));
		
		// prefix incremental / decremental
		System.out.println(--a);//
		System.out.println(++a);
				
		// postfix incremental / decremental
		System.out.println(a--);
		System.out.println(a++);
		
		System.out.println(x);// module operator result 1
		
		// Assighment operators
		// Assighment operators are used to assign value
		
		for( int i=0; i<8; i++) {
			
		System.out.println("The loop reselt will be: "+i);
		
		}
	}
}

