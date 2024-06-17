package com.rahul.kumar.scaler.Day10_StringQuestion;

import java.util.Scanner;

public class Program1GivenAStringPrintTheCharOneByOne {

	static void printString(String name) {
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		printString(name);
	}
}
