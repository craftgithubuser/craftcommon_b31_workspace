package com.day13.map;

import java.util.*;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hm2 = new HashMap<Integer, String>();
		
		hm2.put(1, "One");
		hm2.put(2, "Two");
		hm2.put(3, "Three");
		hm2.put(4, "Four");
		
		// Traversing HashMap
		// For-each
		Set<Map.Entry<Integer, String>> st = hm2.entrySet();
		
		 for(Map.Entry<Integer, String> et : st) {
		      System.out.println(et.getKey()+" : "+et.getValue());
		    }  
	}
	
	

}
