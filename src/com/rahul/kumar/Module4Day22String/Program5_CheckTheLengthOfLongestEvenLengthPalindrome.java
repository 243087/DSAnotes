package com.rahul.kumar.Module4Day22String;

public class Program5_CheckTheLengthOfLongestEvenLengthPalindrome {

	static int checkpalindrome(String str) {
		int maxLength =0;
		for(int l=0;l<str.length();l++) {
			for(int r=l;r<str.length();r++) {
				int length = r-l+1;
				if(length%2==1) {
					continue;
				}
				if(checkPalindrome(str,l,r)) {                          // TC = O[N^3]         SC = O[1]
					maxLength = Math.max(maxLength, length);
				}
			}
		}
		return maxLength;
	}
	static boolean checkPalindrome(String str, int l, int r) {
		while(l<r) {
			if(str.charAt(l)!=str.charAt(r))
				return false;
			l++;
			r--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "abccbh";
		System.out.println(checkpalindrome(str));
	}
}
