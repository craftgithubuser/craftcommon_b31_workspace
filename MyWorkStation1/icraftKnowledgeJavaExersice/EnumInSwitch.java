package icraftKnowledgeJavaExersice;

public class EnumInSwitch {
	public  enum vowel {a,e,i,o,u}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Example using Enum in Switch Statement.
// as we have said, java allows to use enum in switch cases. so we are ceating a enum of vowel alphabets and usign its elements in switch case.
	vowel[] character = vowel.values();
		for (vowel Now:	character) {
			switch(Now) {
			case a:
				System.out.println(" 'a' is a vowel");
			break;
			
			case e:
				System.out.println(" 'e' is a vowel");
			break;
			
			case i:
				System.out.println(" 'i' is a vowel");
			break;
			
			case o:
				System.out.println(" 'o' is a vowel");
			break;
			
			case u:
				System.out.println(" 'u' is a vowel");
			break;
			default:
				System.out.println("it is a constant");
			
			}
		}
				
		
	}

}
