package com.rahul.kumar.scaler.Day10_StringQuestion;

public class Demo {

	static void makeUpperCase(String str) {
		String revString = "";
		for(int i=0;i<str.length();i++) {
			int num = str.charAt(i) + 32;
			revString += (char)num;
		}
		System.out.print(revString);
	}
	public static void main(String[] args) {
		String str = "rahul";
		makeUpperCase(str);
	}
}
