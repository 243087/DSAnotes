package com.rahul.kumar.Module6Day43_Queue;

import java.util.Arrays;

public class Program2_FindMaxOfEverySubArrayOfSizeK {

	static int []findMaxInSubarrays(int []arr, int k){
		if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) 
	        return new int[0];

	    int n = arr.length;
	    int[] result = new int[n - k + 1];                	// Number of subarrays of size K
	    int resultIndex = 0;
	    
	    for (int i=0;i<=n-k;i++) {
	        int max = arr[i]; 

	        for (int j=i;j<i+k;j++) {
	            if (arr[j] > max)
	                max = arr[j];
	        } 
	        result[resultIndex++] = max;
	    }

	    return result;                                  //            TC = O[N*K]        SC = O[N]
	}
	public static void main(String[] args) {
        int[] arr = {3,2,3,4,5,5,4,5,6};
        int k = 3; 

        System.out.println(Arrays.toString(findMaxInSubarrays(arr, k)));
    }
}
