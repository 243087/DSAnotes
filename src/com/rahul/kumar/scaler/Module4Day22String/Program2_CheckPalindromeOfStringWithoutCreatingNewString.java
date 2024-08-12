package com.rahul.kumar.scaler.Module4Day22String;

import java.util.Scanner;

public class Program2_CheckPalindromeOfStringWithoutCreatingNewString {

	static String palindromeCheck(String str) {
		int l=0;
		int r=str.length()-1;
		while(l<r) {
			if(str.charAt(l) != str.charAt(r))
				 return "Not palindrome";
			l++;
			r--;			
		}
		return "Palindrome";                            //         TC = O[N]           SC = O[1]
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println(palindromeCheck(str));
	}
}
