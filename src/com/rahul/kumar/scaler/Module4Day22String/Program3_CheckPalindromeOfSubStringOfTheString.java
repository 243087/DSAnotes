package com.rahul.kumar.scaler.Module4Day22String;

import java.util.Scanner;

public class Program3_CheckPalindromeOfSubStringOfTheString {

	static String palindromeCheck(String str, int l, int r) {
		while(l<r) {
			if(str.charAt(l)!=str.charAt(r))
				return "Sub String is not Palindrome";
			l++;
			r--;
		}
		return "Sub String is Palindrome";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Enter the 1st index");
		int left = sc.nextInt();
		System.out.println("Enter the 2nd index");
		int right = sc.nextInt();
		System.out.println(palindromeCheck(str,left,right));
	}
}
