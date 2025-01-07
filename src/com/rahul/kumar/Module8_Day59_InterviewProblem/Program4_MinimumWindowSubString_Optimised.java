package com.rahul.kumar.Module8_Day59_InterviewProblem;

import java.util.HashMap;
import java.util.Map;

public class Program4_MinimumWindowSubString_Optimised {

	    public static String minWindow(String s, String t) {
	        if (s == null || t == null || s.length() < t.length()) return "";

	        
	        Map<Character, Integer> freqT = getFreqMap(t);       // Frequency map for target string
	        Map<Character, Integer> freqS = new HashMap<>();

	        int start = -1, end = -1;                            // To store the indices of the minimum window
	        int minLen = Integer.MAX_VALUE;                      // Minimum length of the substring
	        int l = 0;                                           // Left pointer for the sliding window

	        for (int r = 0; r < s.length(); r++) {
	            char ch = s.charAt(r);
	            freqS.put(ch, freqS.getOrDefault(ch, 0) + 1); // Add the character to freqS

	            // Check if the current window satisfies the condition
	            while (compare(freqS, freqT)) {
	                // Update the minimum window if the current window is smaller
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
	        return (start == -1) ? "" : s.substring(start, end + 1);
	    }

	    // Method to calculate frequency map of characters in a string
	    static Map<Character, Integer> getFreqMap(String a) {
	        Map<Character, Integer> hm = new HashMap<>();
	        for (char ch : a.toCharArray()) {
	            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
	        }
	        return hm;
	    }

	    // Method to compare if freqS satisfies freqT
	    static boolean compare(Map<Character, Integer> freqS, Map<Character, Integer> freqT) {
	        for (char ch : freqT.keySet()) {
	            if (freqS.getOrDefault(ch, 0) < freqT.get(ch)) {
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
