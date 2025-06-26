package oOP;

public class Book {
String title;
String author;
float price;

void displayDetails() {
	
	System.out.println(title + " "+ author+ " " + price + " ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	Book book1 = new Book();
	book1.title = "Fikir Eske Mekabir";
	book1.author = "Addis Alemayehu";
	book1.price = 49.99f;
	book1.displayDetails();
	
	
	Book book2 = new Book();
	book2.title = "Mogachochu";
	book2.author = "Ashu bilishu";
	book2.price = 17.97f;
	book2.displayDetails();
	
	
	Book book3 = new Book();
	book3.title = "Abraha we Atsbaha";
	book3.author = "Amha";
	book3.price = 22.19f;
	book3.displayDetails();
	
	}

}
