
import java.util.Scanner;

public class HelloUser {;
    private static final String Zemen = null;

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zemen Guanche: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + Zemen+ "! Welcome to Java.");
        
        scanner.close();
    }
}