package com.rahul.kumar.Module4Day22String;

import java.util.Scanner;

public class Program1_ConvertUpperCaseStringToLowerAndViseVersa {

	static String convertString(String str) {
		String chanStr ="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			       chanStr += (char)(str.charAt(i) - 32);
			else
				   chanStr += (char)(str.charAt(i) + 32);
		}
		return chanStr;                                 //   TC = O[N]               SC = O[1]
		
	}
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		System.out.println(convertString(str));
	}
}
