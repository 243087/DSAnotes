package com.rahul.kumar.scaler.Day11_HashSetHashMap;

import java.util.HashMap;

public class Program4PerformAllTheBasicOperationOfHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Sasaram", 98);
		hm.put("Dehri", 80);
	    hm.put("Gaya", 90);
	    hm.put("Maldiv", 10);
	    
//	    System.out.println(hm);
//	    System.out.println(hm.size());
	//    System.out.println(hm.get("Sasaram")); // to get the value using the key 
	    
	    if(hm.containsKey("Goa")) {
	//    System.out.println(hm.get("Goa"));
	    }
	    hm.remove("Maldiv");
//	    System.out.println(hm);
	    
	    for(String print : hm.keySet()) {
	    	System.out.println(print+" "+hm.get(print));
	    }
	    
	}
}
