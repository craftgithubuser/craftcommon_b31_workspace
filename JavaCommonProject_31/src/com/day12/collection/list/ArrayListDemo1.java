package com.day12.collection.list;

import java.util.*;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		//creating an arrayList
		ArrayList<String> fruits = new ArrayList<String>();
		
		//Adding elements or data to arrayLists
	    fruits.add("Mango");
	    fruits.add("Apple");
	    fruits.add("Berry");
	    fruits.add("Orange");
//	    fruits.add(0, "Banana");
	    fruits.set(0, "Banana");
	    fruits.add("Banana");
	    
//	    fruits.remove(0); 
//	    fruits.clear();
//	    System.out.println(fruits.get(1));
	    
	    Iterator it = fruits.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
		
	}

}
