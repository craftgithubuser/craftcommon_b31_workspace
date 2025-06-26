
import java.util.Scanner ; // this is object

public class scanner {

	public static void main(String[] args) {
		 
// scanner class is found in utility package of our Java library	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = scanner.nextLine();
		System.out.println("how old are you ?");
		int age = scanner.nextInt();
		System.out.println("what's your favorite food?");
		String food = scanner.next();
		scanner.nextLine();
		System.out.println("Hello "+ name);
		System.out.println("your age is : "+ age);
		System.out.println("your favorite food is: "+ food);
	
		
	}

}
