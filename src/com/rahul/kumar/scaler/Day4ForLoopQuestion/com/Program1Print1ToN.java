package com.rahul.kumar.scaler.Day4ForLoopQuestion.com;

import java.util.Scanner;

public class Program1Print1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
	    int num = sc.nextInt();
	    
	    for(int i=1;i<=num;i++) {
	    	if(i==num) {
	    	System.out.print(i);
	    	}
	    	else {
	    		System.out.print(i+" ");
	    	}
	    }
	}
}
