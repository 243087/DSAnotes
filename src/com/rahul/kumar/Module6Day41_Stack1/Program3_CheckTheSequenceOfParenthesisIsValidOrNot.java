package com.rahul.kumar.Module6Day41_Stack1;

import java.util.Stack;

public class Program3_CheckTheSequenceOfParenthesisIsValidOrNot {

	static boolean valid(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(' )
				st.push(ch);
			else if(!st.isEmpty()) {
				if(ch=='}' && st.peek()=='{')
					st.pop();
				else if(ch==']' && st.peek()=='[')
					st.pop();
				else if(ch==')' && st.peek()=='(')
					st.pop();
				else
					return false;
			}
			else
				return false;
		}
		return st.isEmpty();                     //               TC = O[N]             SC = O[N]
	}
	public static void main(String[] args) {
		String input ="{[()]}";
		boolean result = valid(input);
		System.out.println(result);
	}
}
