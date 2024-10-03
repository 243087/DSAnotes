 package com.rahul.kumar.Module4Day22String;

import java.util.Arrays;
import java.util.Scanner;

public class Program1_convertUpperCaseStringToLowerCaseAndReverseUsingCharArray {

	static void convertString(String str){
		char [] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				arr[i] = (char)(str.charAt(i) - 32);
			}
			else {
				arr[i] = (char)(str.charAt(i) + 32);
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);                           //  TC = O[N]           SC = O[N]
		}
	}
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.next();
		convertString(str);
	}
}
