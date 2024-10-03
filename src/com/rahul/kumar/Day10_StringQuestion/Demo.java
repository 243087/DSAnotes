package com.rahul.kumar.Day10_StringQuestion;

public class Demo {

	 public static String solve(String A) {
	        String original = "";
	        for(int i=0;i<A.length();i++){
	            char ch = A.charAt(i);

	                int index = ch - 'a' + 1;
	                original += ch + Integer.toString(index);
	        }
	        return original;
	    }
	public static void main(String[] args) {
		String str = "scaler";
		System.out.println(solve(str));
	}
}
