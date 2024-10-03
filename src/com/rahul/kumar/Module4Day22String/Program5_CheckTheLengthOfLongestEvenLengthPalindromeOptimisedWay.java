package com.rahul.kumar.Module4Day22String;

public class Program5_CheckTheLengthOfLongestEvenLengthPalindromeOptimisedWay {

    static int checkPalindrome(String str) {
        int maxLength = 0;
        for (int center = 0; center < str.length() - 1; center++) {
            int l = center;
            int r = center + 1;

            while (l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
                l--;
                r++;
            }
            int length = r - l - 1; 
            if (length % 2 == 0) {   
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
	public static void main(String[] args) {
		String str = "adaebcdfdcbetggte";
		System.out.println(checkPalindrome(str));
	}
}
