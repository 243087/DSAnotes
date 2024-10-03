package com.rahul.kumar.scaler.Module6Day41_Stack1;

import java.util.Stack;

public class Program4_GivenStringRemoveEqualPairOfConsecutiveElementsTillPossible {

	static String removeEqualPairs(String str) {
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!st.isEmpty() && ch == st.peek()) {
				st.pop();
			}
			else {
				st.push(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty())
			sb.append(st.pop());  
		
		return sb.reverse().toString();                               //        TC = O[N]           SC = O[N]
	}
	public static void main(String[] args) {
		String str = "abbcbbcacx";
		System.out.println(removeEqualPairs(str));
	}
}
