package com.rahul.kumar.Module4Day22String;

public class Program6_FindTheLongestLengthPalindrome {

	static int palindrome(String str) {
		int oddLength = checkOddPalindrome(str);
		int evnLength = checkEvenPalindrome(str);
		return Math.max(oddLength,evnLength);
	}
	static int checkOddPalindrome(String str) {
		int maxLength =0;
		for(int center=0;center<str.length();center++) {
			int l= center;
			int r= center;

			while(l>=0 && r<=str.length()-1 && str.charAt(l) == str.charAt(r)) {
				l--;
				r++;
			}
			int length = r-l-1;                                               // TC = O[N^2]          SC = O[1]
			
			if(length%2 ==1)
			    maxLength =  Math.max(maxLength, length);
		}
		return maxLength;
	}
	
    static int checkEvenPalindrome(String str) {
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
		String str = "aaaabaaa";
        System.out.println(palindrome(str));
		
	}
}
