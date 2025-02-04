package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.HashMap;
import java.util.Map;

public class Program4_MinimumWindowSubString_Optimised {

	    public static String minWindow(String s, String t) {
	        if (s == null || t == null || s.length() < t.length()) return "";

	        
	        Map<Character, Integer> freqT = getFreqMap(t);       
	        Map<Character, Integer> freqS = new HashMap<>();

	        int start = -1, end = -1;                            
	        int minLen = Integer.MAX_VALUE;                     //           TC = O[N]      SC = O[1]
	        int l = 0;                                           

	        for (int r = 0; r < s.length(); r++) {
	            char ch = s.charAt(r);
	            if (freqS.containsKey(ch)==false)
	            	freqS.put(ch,1);
	            else {
	            	int freq = freqS.get(ch);
	            	freqS.put(ch,freq+1);
	            }

	            // Check if the current window satisfies the condition
	            while (compare(freqS, freqT)) {
	                   if (r - l + 1 < minLen) {
	                    minLen = r - l + 1;
	                    start = l;
	                    end = r;
	                }

	                // Shrink the window from the left
	                char leftChar = s.charAt(l);
	                freqS.put(leftChar, freqS.get(leftChar) - 1);
	                if (freqS.get(leftChar) == 0) {
	                    freqS.remove(leftChar);
	                }
	                l++;
	            }
	        }

	        // Return the minimum window substring
	        if (start == -1) {
	            return "";
	        } else {
	            return s.substring(start, end + 1);
	        }
	    }

	    // Method to calculate frequency map of characters in a string
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

	    // Method to compare if freqS satisfies freqT
	    static boolean compare(Map<Character, Integer> freqS, Map<Character, Integer> freqT) {
	    	for (char ch : freqT.keySet()) {
	            if (!freqS.containsKey(ch) || freqS.get(ch) < freqT.get(ch)) {
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
