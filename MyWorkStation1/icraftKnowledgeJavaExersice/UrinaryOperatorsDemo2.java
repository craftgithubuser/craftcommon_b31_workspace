package icraftKnowledgeJavaExersice;

public class UrinaryOperatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declare variables
		int a = 12, b = 12;
		int result1, result2;
		
		// original value
		System.out.println("Value of a: " + a); //12
		// increment operator
		result1 = a++; //12
		System.out.println("result1 After increment: " + result1); //12
		System.out.println("Value of a after increment: " + a);//13
		
		System.out.println("Value of b: " + b); //12
		// decrement operator
		result2 = b--; // 12
		System.out.println("result2 After decrement: " + result2); //12
		System.out.println("Value of b after decrement: " + b);//11
	}

}
