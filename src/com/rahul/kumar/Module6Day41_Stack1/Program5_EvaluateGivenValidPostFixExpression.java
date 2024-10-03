package com.rahul.kumar.Module6Day41_Stack1;

import java.util.Stack;

public class Program5_EvaluateGivenValidPostFixExpression {

	static int operatorSolve(String []A) {
		
		 Stack<Integer> st = new Stack<>();
	        for(int i=0;i<A.length;i++){
	            if(A[i].equals("+") || A[i].equals("-") || A[i].equals("*") || A[i].equals("/")){
	                int b = st.pop();
	                int a = st.pop();
	                
	                if(A[i].equals("+"))
	                   st.push(a+b);
	                else if(A[i].equals("-"))
	                   st.push(a-b);
	                else if(A[i].equals("*"))
	                   st.push(a*b);
	                else if(A[i].equals("/"))
	                   st.push(a/b);       
	            }
	            else{
	                st.push(Integer.parseInt(A[i]));
	            }
	        }
	        return st.peek();                                    //         TC = O[N]            SC = O[N]
	}
	public static void main(String[] args) {
		String [] str = {"2","1","+","3","*"};
		System.out.println(operatorSolve(str));
	}
}
