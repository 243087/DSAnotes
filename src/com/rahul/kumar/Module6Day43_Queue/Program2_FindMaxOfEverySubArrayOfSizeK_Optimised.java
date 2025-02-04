package com.rahul.kumar.Module6Day43_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// <Question> : Find max of every subarray of size K.
public class Program2_FindMaxOfEverySubArrayOfSizeK_Optimised {

	static int[] findMaxInSubarrays(int[]arr, int k) {
		 Deque<Integer> deque = new LinkedList<>();
	        int n = arr.length;                                     //         TC = O[N]       SC = O[N]

	        // Array to store the result
	        int[] result = new int[n - k + 1];
	        int idx = 0;

	        for (int i = 0; i < n; i++) {
	            int val = arr[i];

	            // Remove elements from the rear that are smaller than or equal to the current element
	            while (!deque.isEmpty() && arr[deque.peekLast()] <= val) {
	                deque.removeLast();
	            }

	            // Remove elements from the front if they are out of the current window
	            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
	                deque.removeFirst();
	            }

	            // Add the current index to the deque
	            deque.addLast(i);

	            // Store the max of the current window in the result array
	            if (i >= k - 1) {
	                result[idx++] = arr[deque.peekFirst()];
	            }
	        }

	        return result;
	}
	public static void main(String[] args) {
        int[] arr = {3,2,3,4,5,5,4,5,6};
        int k = 3; 

        System.out.println(Arrays.toString(findMaxInSubarrays(arr, k)));
    }
}
