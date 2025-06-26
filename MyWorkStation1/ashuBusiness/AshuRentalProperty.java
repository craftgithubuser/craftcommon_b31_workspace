
package ashuBusiness;

import java.util.Scanner;

public class AshuRentalProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		class PropertyApp {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        // Get customer info
		        System.out.println("=== Welcome to Ashu Property Portal ===");
		        System.out.print("Enter your name: ");
		        String name = input.nextLine();

		        System.out.print("Enter your contact number: ");
		        String contact = input.nextLine();

		        // Select purpose
		        System.out.println("Hi " + name + "! Are you looking to:");
		        System.out.println("1 - Rent a property");
		        System.out.println("2 - Buy a property");
		        int choice = input.nextInt();

		        // Show property list based on choice
		        if (choice == 1) {
		            showRentalProperties();
		        } else if (choice == 2) {
		            showSaleProperties();
		        } else {
		            System.out.println("Invalid choice! Please select 1 or 2.");
		            input.close();
		            return;
		        }

		        // Property selection
		        System.out.print("Enter the number of the property you’re interested in: ");
		        int propertyChoice = input.nextInt();

		        System.out.println("Thank you, " + name + "! We will contact you soon at " + contact +
		                " regarding property #" + propertyChoice);

		        input.close();
		    }

		    // Sample rental properties
		    public static void showRentalProperties() {
		        System.out.println("\n--- Rental Properties ---");
		        System.out.println("1. Apartment in Downtown - $1,200/month");
		        System.out.println("2. 2-Bedroom Condo - $1,500/month");
		        System.out.println("3. Studio near University - $900/month");
		    }

		    // Sample properties for sale
		    public static void showSaleProperties() {
		        System.out.println("\n--- Properties for Sale ---");
		        System.out.println("1. 3-Bedroom House - $250,000");
		        System.out.println("2. Luxury Villa - $800,000");
		        System.out.println("3. Townhouse - $180,000");
		    }
		}

	}

}
