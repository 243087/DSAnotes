package com.rahul.kumar.Module5Day31_ModularArithmeticAndGCD;

import java.util.HashMap;

public class Program1_FindTheCountOfPairs_HashMap {

	static void countPairs(int []arr, int M) {
		HashMap<Integer, Integer> freqMap = new HashMap<>();
	    int ans = 0;
	    
	    for(int i=0;i<arr.length;i++) {
	    	int val = arr[i]%M;
	    	if(val<0)                    // this is for -ve number(using the property of Modulous)
	    		 val += M;
	    	
	    	int need = -1;
	    	if(val==0)
	    		need = 0;
	    	else
	    		need = M-val;
	    	
	    	if(freqMap.containsKey(need))
	    		 ans += freqMap.get(need);                       //          TC = O[N]        SC = O[M]
	    	
	    	freqMap.put(val,freqMap.getOrDefault(val,0)+1);
	    }
	    System.out.println(ans);
	}
	public static void main(String[] args) {

		int []arr = {2,3,4,8,6,15,5,12,17,7,18,10,9,16,21}; 
		int modulo = 6;
		countPairs(arr,modulo);
	}
}
