package com.day12.collection.set;

import java.util.*;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // Creating HashSet
	    Set<String> hs = new HashSet<String>();
	    // Adding elements
	    hs.add("Mohan");
	    hs.add("Rohan");
	    hs.add("Sohan");
	    hs.add("Mohan");
	    
	    // Displaying HashSet
//	    System.out.println(hs);
	    
	    //Travering over hashset
//	    for(String elt: hs) {
//	    	System.out.println(elt);
//	    }
	    
	    Iterator it = hs.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }

	}

}
