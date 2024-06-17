package com.rahul.kumar.scaler.Day5PatternQuestion.com;

import java.util.Scanner;

public class PrintStarPatternAsShown7 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	     int num = sc.nextInt();
	     int space = num-2;

	     for(int i=1;i<=num;i++){
	         for(int j=1;j<=num;j++){
	             if(j==1 || j==num){
	                 System.out.print("*");
	             }
	             else{
	                 for(int k=2;k<(num-2);k++){
	                     System.out.print(" ");
	                 }
	             }
	         }
	         System.out.println();
	     }
	}
}
