package com.rahul.kumar.Module4Day22String;

// <Question> :Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the 
//             array.The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both
//             S1 and S2.
// Example:    the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
public class AdditionalAssignment1 {

	static String commonPrefix(String []str) {
		int n = str.length;
		int m = str[0].length();
		for(int i=0;i<n;i++) {                         //     this is basically for finding the minlength string
			if(m>str[i].length())
				 m = str[i].length();
		}
		StringBuilder ans = new StringBuilder();
		
		for(int i=0;i<m;i++) {
			int temp = 1;
			for(int j=1;j<n;j++) {
				if(str[j-1].charAt(i)!=str[j].charAt(i)) {
					temp = 0;
					break;
				}
			}
			if(temp == 1)
				ans.append(str[0].charAt(i));
			else
				break;	
		}
		return ans.toString();
		
	}
	public static void main(String[] args) {
		String [] str = {"abcdefgh","abcdefghijk","abcdefgh"};
		System.out.println(commonPrefix(str));
	}
}
