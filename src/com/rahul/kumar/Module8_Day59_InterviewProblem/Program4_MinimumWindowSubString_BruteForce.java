package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.HashMap;
import java.util.Map;

// Given two String s and t. Find the minimum window in s which contains all characters of t(including duplicates). if no such window 
// exits return an empty string.
public class Program4_MinimumWindowSubString_BruteForce {

	static String minWindow(String s, String t) {
		
		 int minLen = Integer.MAX_VALUE;        // To store the length of the minimum substring
	     String ans = "";                       // To store the minimum substring
	        
		for (int l = 0; l < s.length(); l++) {
            for (int r = l; r < s.length(); r++) {
                String sub = s.substring(l, r + 1);

                
                // Get frequency maps for the substring and target
                Map<Character, Integer> freqSub = getFreqMap(sub);
                Map<Character, Integer> freqT = getFreqMap(t);
                
                if (r - l + 1 < minLen && compare(freqSub, freqT)) {
                    minLen = r - l + 1; // Update minimum length
                    ans = sub; // Update answer
                }
            }
        }
		return ans;
	}
	 static Map<Character, Integer> getFreqMap(String a) {
	        Map<Character, Integer> hm = new HashMap<>();
	        for (char ch : a.toCharArray()) {
	            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
	        }
	        return hm;
	    }
	 static boolean compare(Map<Character, Integer> freqSub, Map<Character, Integer> freqT) {
	        for (char ch : freqT.keySet()) {
	            if (freqSub.getOrDefault(ch, 0) < freqT.get(ch)) {
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
