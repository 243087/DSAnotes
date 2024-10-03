package com.rahul.kumar.Day6FunctionQuestion;

import java.util.Scanner;

public class Demo {
	
/*	static int solve(int A) {
		  if(A<0)
	           return 0;
	        for(int i=1;i<=A/i;i++){
	            if(i*i ==A)
	               return 1;   
	        }
	        return 0;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	System.out.println(solve(num));
	} */
	 public static void main(String[] args) {
		   Scanner scn = new Scanner(System.in);
	        
	        int n = scn.nextInt();
	        
	        // Loop for N rows
	        for (int i = 1; i <= n; i++)
	    	{
	    	    // Print leading 0s
	    		int spaces = n - i;
	    		for (int j = 1; j <= spaces; j++){
	    			 System.out.print("0 ");
	    		}
	    		// Print non-zero number series
	    		int lim = 2 * i - 1;
	            int cnt = 1;
	            for (int j = 1; j <= lim; j++)
	    		{
	    		    System.out.print((n-i+1)*cnt + " ");
	                cnt++;
	    		}
	    		// Print trailing 0s
	    		for (int j = 1; j <= spaces; j++){
	    			System.out.print("0 ");
	    		}
	        	System.out.println();
	    	}
	    }
}
