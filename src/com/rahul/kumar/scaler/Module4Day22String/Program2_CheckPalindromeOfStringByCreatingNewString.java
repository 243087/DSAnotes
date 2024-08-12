package com.rahul.kumar.scaler.Module4Day22String;

import java.util.Scanner;

// By creating reverse of String and compare with original string
public class Program2_CheckPalindromeOfStringByCreatingNewString {

      static void palindromeCheck(String str) {
    	  String revStr = "";
    	  for(int i=0;i<str.length();i++) {
    		  revStr += str.charAt(str.length()-1-i);
    	  }                                                     //   TC = O[N]       SC = O[N}
           System.out.println("Reversed string is "+revStr);
    	  if(str.equals(revStr))
    		  System.out.println("Given string "+str+" is palindrome ");
    	  else
    		  System.out.println("Given string "+str+" is not palindrome");
      }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		palindromeCheck(str);
	}
}
