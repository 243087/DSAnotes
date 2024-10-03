package com.rahul.kumar.Day10_StringQuestion;

import java.util.Scanner;

public class Program3GivenAStringPrintTheCountOfUpperCase {

	static void countUpperCase(String str) {
		int count = 0;
		String value = "";
		for(int i=0;i<str.length();i++) {
	//		if(str.charAt(i)>=65 && str.charAt(i)<=90) {
			if(str.charAt(i)>='A'  && str.charAt(i)<='Z') {
				count++;
			    value += str.charAt(i);
			}
		}
		System.out.println("Total is "+count+" and value is "+value);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		countUpperCase(str);
	}
}
