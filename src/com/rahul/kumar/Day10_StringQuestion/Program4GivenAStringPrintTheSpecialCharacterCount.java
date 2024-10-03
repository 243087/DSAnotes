package com.rahul.kumar.Day10_StringQuestion;

import java.util.Scanner;

public class Program4GivenAStringPrintTheSpecialCharacterCount {

	static void printSpecialCharCount(String check) {
		int count =0;
		for(int i=0;i<check.length();i++) {
			char ch = check.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')) {
				  continue;
			}
			count++;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String check = sc.nextLine();
		
		printSpecialCharCount(check);
		
	}
}
