package com.day13.map;

import java.util.*;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
	    hm.put("a",100);
	    hm.put("b",200);
	    hm.put("c",300);
	    hm.put("d",400);
	    
//	    System.out.println(hm.get("c"));
	    
		// Traversing HashMap
		// For-each
	    Set<Map.Entry<String,Integer>> st = hm.entrySet();
	    
	    for(Map.Entry<String,Integer> me:st)
	    {
	      System.out.print(me.getKey()+":");
	      System.out.println(me.getValue());
	    }
	    
	    System.out.println("\n Using Iterator Interface: ");
	    
	    //Iterator - interface
	    Iterator itr = st.iterator();
	    
	    while(itr.hasNext()) {
	    	Map.Entry<String,Integer> mp = (Map.Entry<String,Integer>) itr.next();
		      System.out.print(mp.getKey()+":");
		      System.out.println(mp.getValue());
	    }
	    

	}

}
