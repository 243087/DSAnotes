package com.rahul.kumar.Module4Day22String;

// <Question>: You are given a string S, and you have to find all the amazing substrings of S. An amazing Substring is one that 
//             starts with a vowel (a, e, i, o, u, A, E, I, O, U).
public class AdditionalAssignment3 {

	static int countVowels(String s) {
		int vCount = 0;
		int lastIndex = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				lastIndex = s.length()-i;
				vCount += lastIndex;
			}
		}
		return vCount;
	}
	public static void main(String[] args) {
		String s = "ABEC";
		System.out.println(countVowels(s));
	}
}
