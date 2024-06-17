package com.rahul.kumar.scaler.Day10_StringQuestion;

import java.util.Scanner;

public class Program5GivenAStringReturnTheReverse {

	static void reverseString(String str) {
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev +=str.charAt(i);
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		reverseString(str);
	}
}
