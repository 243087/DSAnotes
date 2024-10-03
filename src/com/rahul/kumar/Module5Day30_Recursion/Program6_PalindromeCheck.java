package com.rahul.kumar.Module5Day30_Recursion;

import java.util.Scanner;

public class Program6_PalindromeCheck {

	static boolean checkPalin(String str, int l, int r) {
		
		if(l>=r)
			return true;
		if(str.charAt(l) != str.charAt(r)) {
			return false;
		}
		 return checkPalin(str,l+1,r-1);                    //              TC = O[N]         SC = O[N}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		int l=0;
		int r=str.length()-1;
		System.out.println(checkPalin(str,l,r));
	}
}
