package com.rahul.kumar.Module6Day42_Stack2;

import java.util.Stack;
//<Question> : Find sum of ( max-min ) for all subarrays.

public class Program10_FindSumOf_MaxMinusMin_OfAllSubArray_Optimised {

	static int sum(int []arr) {
		 int n = arr.length;

	        int[] ngl = nearestGreaterOnLeft(arr);
	        int[] ngr = nearestGreaterOnRight(arr);

	      /*  int[] nsl = nearestSmallerOnLeft(arr);  // instead of writing again for min on left and right we can do as below
	        int[] nsr = nearestSmallerOnRight(arr); */
	        
	        int[] nsl = nearestGreaterOnLeft(negateArray(arr));
	        int[] nsr = nearestGreaterOnRight(negateArray(arr));

	        long result = 0;                                            //         TC = O[N]       SC = O[N]
	        for (int i = 0; i < n; i++) {
	            long maxContribution = (long) arr[i] * (i - ngl[i]) * (ngr[i] - i);
	            long minContribution = (long) arr[i] * (i - nsl[i]) * (nsr[i] - i);
	            result += maxContribution - minContribution;
	        }
	        return (int) result;
	}
	static int[] nearestGreaterOnLeft(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
            	newArr[i] = -1;
			}
			else {
				newArr[i] = stack.peek();
			}
			stack.push(i);
        }

        return newArr;
    }
	static int[] nearestGreaterOnRight(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
            	newArr[i] = arr.length;
			}
			else {
				newArr[i] = stack.peek();
			}
			stack.push(i);
        }

        return newArr;
    }
	  static int[] negateArray(int[] arr) {
	        int[] negArr = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            negArr[i] = -arr[i];
	        }
	        return negArr;
	    }

	public static void main(String[] args) {
		int []arr = {2,7,4};
		System.out.println(sum(arr));
	}
	
 /*	static int[] nearestSmallerOnLeft(int []arr) {
		int []newArr = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
				st.pop();
			}
			if(st.isEmpty())
				 newArr[i] = -1;
			else
				 newArr[i] = st.peek();
			
			st.push(i);
		}
		return newArr;
	}
	 static int[] nearestSmallerOnRight(int[] arr) {
		 int []newArr = new int[arr.length];
			Stack<Integer> st = new Stack<>();
			
			for(int i=arr.length-1;i>=0;i--) {
				while(!st.isEmpty() && arr[st.peek()]>=arr[i]) {
					st.pop();
				}
				if(st.isEmpty())
					 newArr[i] = arr.length;
				else
					 newArr[i] = st.peek();
				
				st.push(i);
			}
			return newArr;
	 }
	 */
}
