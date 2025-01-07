package com.rahul.kumar.Module5Day24_1DArrays;

import java.util.Arrays;

// <Problem Description> : Given a non-negative number represented as an array of digits, add 1 to the number(increment the number
//represented by the digits).The digits are stored such that the most significant digit is at the head of the list.
//NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :
//Explanation 1:
//Given vector is [1, 2, 3].
//The returned vector should be [1, 2, 4] as 123 + 1 = 124.
public class Assignment_AdditionalProblem {

	  public static int[] plusOne(int[] A) {
	        int carry = 1;
	        int size = A.length;

	        // Traverse the digits of the number in reverse order
	        for (int i = size - 1; i >= 0; i--) {
	            int num = A[i] + carry;
	            if (num == 10) {
	                A[i] = 0;
	                carry = 1;
	            } else {
	                A[i] = num;
	                carry = 0;
	                break;  // No need to continue if there's no carry
	            }
	        }

	         // If there's a carry left, we need a larger array to store the result
	        if (carry == 1) {
	            int[] res = new int[size + 1];
	            res[0] = 1;
	            for (int i = 0; i < size; i++) {
	                res[i + 1] = A[i]; // Manually copy elements from A to res
	            }
	            return res;
	        }

	         // Find the first non-zero element to remove leading zeros
	        int start = 0;
	        while (start < size && A[start] == 0) {
	            start++;
	        }

	        // Create a new array without leading zeros
	        int[] result = new int[size - start];
	        for (int i = start; i < result.length; i++) {
	            result[i - start] = A[i];
	        }

	        return result;
	    }
	public static void main(String[] args) {
			int []arr = {2,9,9};
			System.out.println(Arrays.toString(plusOne(arr)));
	}
}
