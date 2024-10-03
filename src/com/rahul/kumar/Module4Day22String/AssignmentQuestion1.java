package com.rahul.kumar.Module4Day22String;
/*Problem Description
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.*/



public class AssignmentQuestion1 {

    public static  String solve(String A) {
        StringBuilder str = new StringBuilder(A.length());
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)>='a' && A.charAt(i)<='z'){
               str.append((char)('A' +(A.charAt(i) - 'a')));
            }
            else{
                str.append((char)('a' +(A.charAt(i) - 'A')));
            }
        }
        return str.toString();
    }
	public static void main(String[] args) {
		String A = "tHiSiSaStRiNg";
		System.out.println(solve(A));
	}
}
