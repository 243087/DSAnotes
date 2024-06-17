package com.rahul.kumar.scaler.Day10_StringQuestion;

import java.util.Scanner;

public class Program6GivenAStringCheckPalindromeOrNot {
	
	static void palindromeCheck(String str) {
		String original = str;
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev +=str.charAt(i);
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String check = sc.next();
		
		palindromeCheck(check);
	}
}
