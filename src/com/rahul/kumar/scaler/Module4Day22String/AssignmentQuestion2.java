package com.rahul.kumar.scaler.Module4Day22String;
/*Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.*/


public class AssignmentQuestion2 {

    public static String solve(String A) {

    char []str = A.toCharArray();
    int n = A.length();
    for(int i=0;i<n/2;i++){
       char temp = str[i];
       str[i] = str[n-1-i];
       str[n-1-i] = temp;
    }
    return new String(str);
    }
	public static void main(String[] args) {
		String A = "scaler";
		System.out.println(solve(A));
	}
}
