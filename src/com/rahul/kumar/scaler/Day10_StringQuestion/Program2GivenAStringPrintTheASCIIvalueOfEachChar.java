package com.rahul.kumar.scaler.Day10_StringQuestion;

import java.util.Scanner;

public class Program2GivenAStringPrintTheASCIIvalueOfEachChar {

	static void printASCII(String name) {
		for(int i=0;i<name.length();i++) {
			System.out.println((int)name.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		
		printASCII(name);
		}
}
