package com.day10.StringHandling;

public class StringHandlingDemo1 {

	public static void main(String[] args) {

		String name = "Ronaldo";

		name.concat(" Messi"); //

		System.out.println(name); //Ronaldo

		String strnew = "I" + " Like" + " Java" + " Language";
		System.out.println(strnew);
		int len = strnew.length();

		System.out.println("Length of strnew: " + len);

		String str2 = "This Java class";

		char ch = str2.charAt(5);
		System.out.println(ch);
		
		String str3 = "ISMAEL";
		String str4 = "Ismael";
		
		//check if the two string are the same:
		if(str3.equals(str4)) {
			System.out.println("The two string are equal");
		}
		else {
			System.out.println("The two string are not equal");
		}
		
		System.out.println(strnew.toLowerCase());
		System.out.println(strnew.toUpperCase());
		
		String str5 = "Today is holiday. Tomorrow is working day!";
		String subStr =  str5.substring(18);
		System.out.println(subStr);
		
		String [] value = str5.split(" ");
		for(String elt: value) {
			System.out.println(elt);
		}
		
		//String - immutable, StringBuilder, StringBuffer - mutable
		
		StringBuffer sf = new StringBuffer("Hello");
		sf.insert(5, " World");
		System.out.println(sf);
		
		
		// equals --> for string
		// == ----> for numbers
		// = ---> operator assignement operator

	}

}
