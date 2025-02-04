package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.HashMap;
import java.util.Map;

//<Question>: Given two String s and t. Find the minimum window in s which contains all characters of t(including duplicates). 
//            if no such window exits return an empty string.
public class Program4_MinimumWindowSubString_BruteForce {

	static String minWindow(String s, String t) {
		
		 int minLen = Integer.MAX_VALUE;        
	     String ans = "";                      
	        
		for (int l = 0; l < s.length(); l++) {
            for (int r = l; r < s.length(); r++) {
                String sub = s.substring(l, r + 1);

                                                                           //           TC = O[N^2*(N+M)]
                // Get frequency maps for the substring and target
                Map<Character, Integer> freqSub = getFreqMap(sub);
                Map<Character, Integer> freqT = getFreqMap(t);
                
                if (r - l + 1 < minLen && compare(freqSub, freqT)) {
                    minLen = r - l + 1; 
                    ans = sub;
                }
            }
        }
		return ans;
	}
	 static Map<Character, Integer> getFreqMap(String a) {
	        Map<Character, Integer> hm = new HashMap<>();
	        for(int i=0;i<a.length();i++) {
	        	char ch = a.charAt(i);
	        	if(hm.containsKey(ch)==false)
	        		hm.put(ch,1);
	        	else {
	        		int freq = hm.get(ch);
	        		hm.put(ch,freq+1);
	        	}
	        }
	        return hm;
	    }
	 static boolean compare(Map<Character, Integer> freqSub, Map<Character, Integer> freqT) {
	        for (char ch : freqT.keySet()) {
	            if (!freqSub.containsKey(ch) || freqSub.get(ch) < freqT.get(ch)) {
	                return false;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
		String s1 ="ADOBECODEBANC";
		String s2 ="ABC";
		System.out.println(minWindow(s1,s2));
	}
}
