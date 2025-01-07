package com.rahul.kumar.Module4Day22String;

import java.util.Scanner;

// By creating reverse of String and compare with original string
public class Program2_CheckPalindromeOfStringByCreatingNewString {

      static void palindromeCheck(String str) {
    	  String revStr = "";
    	  for(int i=str.length()-1;i>=0;i--) {
    		  revStr += str.charAt(i);
    	  }                                                     //   TC = O[N]       SC = O[N}
           System.out.println("Reversed string is "+revStr);
    	  if(str.equalsIgnoreCase(revStr))
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
