package com.rahul.kumar.scaler.Module4Day22String;
/*Problem Description

You are given a string A of size N.
Return the string A after reversing the string word by word.

NOTE:
    > A sequence of non-space characters constitutes a word.
    > Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
    > If there are multiple spaces between words, reduce them to a single space in the reversed string.
*/
public class AssignmentQuestion3 {

	 public static String solve(String A) {
	        int size = A.length();
	        StringBuilder ans = new StringBuilder();
	        
	        for(int i= size-1;i>=0;i--){
	            if(A.charAt(i) !=' '){
	                StringBuilder temp = new StringBuilder();
	                while(i>=0 && A.charAt(i)!=' '){
	                    temp.append(A.charAt(i));
	                    i--;
	                }
	                
	                 temp.reverse();
	                if(ans.length()!=0)
	                   ans.append(' ');

	                ans.append(temp);  

	            }
	        }
	        return ans.toString();
	    }
	 
	public static void main(String[] args) {
		String s ="the sky is   blue    ";
		System.out.println(solve(s));
	}
}
