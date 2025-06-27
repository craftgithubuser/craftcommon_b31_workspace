package icraftKnowledgeJavaExersice;

public class Main {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	public static void main(String[] args) {
			
			
			
			System.out.println("i love pizza");
			System.out.println("it's really good!");
			System.out.println("my name is ashenafi zemedkun");
			System.out.println("this is my first java programming concept");
			
		// now we goonna learn about variable in java	
			
	// variable is a place holder or container for a value that have as the value it contains.
			//ex x=123 y="ashenafi", z=true/faulse
	// in variable we can store anything as long as we declair the data type.
	// we have like 8 type of data type which we gonna work with our variables

	/*Data type		Size	primitive/ reference	Value
	 * 
	 * boolean		1 bit	primitive				true or false
	 * byte			1 byte	primitive				-128 to 127		
	 * short		2 byte	primitive				-32768 to 32,767
	 * int			4 bytes	primitive				-2 billion to 2 billion
	 * long			8 bytes primitive				-9 quintillion to 9 quintillion
	 * 
	 * float		4 bytes primitive				fractional number up to 6-7 digits ex 3.141592f
	 * double		8 bytes primitive				fractional numbe up to 15 digits ex.3.1415926535389793
	 * 
	 * char			2 bytes	primitive				single character/ letter/ASCII vale ex. 'f'
	 * string		varies	reference				a sequence of characters ex. "hello world!"*/
			

	/* now lets go with the data type 	declaration and asiignment
	 * so when we do ex int X; we are dclaring.. we we say x=123 we are assigning
	 * wehen we put it all together we are saying initialization
	 * we will take the data type followed by the variable name we will called initialization.
	 * 						int x; declaration
	 * 
	 *						 x= 123; assignment
	 * 
	 * 						int x=123 ; initialization
	 */
			
		//	int x; // declaration
			
			//x = 123 ;// assignment
			
			//long x = 0987090980980980980l;	//some reason long data type required capital L at the end and dstill ditsnt work for now but it should. 
			int y = 123; // initionalization
			double m = 3.4343434487973497;
			float z = 1.34f;
			char c = 'c';
			String name = "ashenfi";
			System.out.println("my area code strart with :   "+y);
			//System.out.println(" this is the good example of long data type" + y);
			System.out.println("this is the example of floate" +z);
			System.out.println(m );
			System.out.println(z );
			System.out.println(c );
			System.out.println(y );
			
	// now we will see how to swap two variable in java
			
			String a = "Zeritu";
			String b = "kebede";
			
			String temp;

			temp = a;
			a = b;
			b = temp;
			System.out.println(a);
			System.out.println(b);
			
	// user input iys called scanner 
	// first we gonna gonna write out side of the class  writeimport java.util.c
			
			
			
			
		}
		
}
