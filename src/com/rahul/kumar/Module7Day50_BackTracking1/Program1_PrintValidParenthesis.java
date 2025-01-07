package com.rahul.kumar.Module7Day50_BackTracking1;

import java.util.ArrayList;

// Given an int A write a function to generate all combinations of well formed parenthesis of length 2A
public class Program1_PrintValidParenthesis {
    int A;
    ArrayList<String> ans;
	 ArrayList<String> generateParenthesis(int A){
		this.A = A;
        this.ans = new ArrayList<>();
        generateVP("",0,0);
        return ans;                                                //            TC = O[N*2^N]           SC = O[N]
	}
	 public void generateVP(String str,int open,int close){
	        if(open==A && close==A){
	            ans.add(str);
	            return;
	        }
	        if(open<A)                                           // open parenthesis should not me more than the A
	           generateVP(str+"(",open+1,close);
	        if(close<open)
	            generateVP(str+")",open,close+1);                // close parenthesis should not be more than open
	 
	    }
	public static void main(String[] args) {
		Program1_PrintValidParenthesis sol = new Program1_PrintValidParenthesis();
		ArrayList<String> result = sol.generateParenthesis(3);
		System.out.println(result);
	}
}
