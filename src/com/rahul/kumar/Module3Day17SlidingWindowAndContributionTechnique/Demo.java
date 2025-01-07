package com.rahul.kumar.Module3Day17SlidingWindowAndContributionTechnique;

import java.util.Arrays;

public class Demo {

	/*
	 * static void sumSubArr(int []arr) { int []preSum = new int[arr.length];
	 * preSum[0] = arr[0]; for(int i=1;i<arr.length;i++) { preSum[i] = preSum[i-1] +
	 * arr[i]; }
	 * System.out.println("Prefix sum array is : "+Arrays.toString(preSum));
	 * 
	 * int totalSum = 0; for(int s= 0;s<arr.length;s++) { for(int
	 * e=s;e<arr.length;e++) { int sum = 0; if(s==0) sum = preSum[e]; else sum =
	 * preSum[e] - preSum[s-1];
	 * 
	 * totalSum +=sum; } } System.out.println(totalSum); }
	 */
	
	/*
	 * static void sumSubArr(int []arr) { int totalSum = 0; for(int
	 * i=0;i<arr.length;i++) { long contri = (i+1)*(arr.length-i); totalSum +=
	 * arr[i]*contri; } System.out.println(totalSum); }
	 */
	/*
	 * static void printIndex(int []arr, int k) { int l = 0; int r = k-1;
	 * while(r<arr.length) { System.out.println(arr[l]+"-"+arr[r]); l++; r++; }
	 * 
	 * }
	 */
	/*
	 * static void sumSub(int []arr, int k) { int l = 0; int r = k-1; int totalSum =
	 * -Integer.MAX_VALUE; while(r<arr.length) { int sum = 0; for(int i=l;i<=r;i++)
	 * { sum += arr[i]; } l++;r++; totalSum = Math.max(totalSum,sum); }
	 * System.out.println(totalSum); }
	 */
	
	// Sliding WIndow problem
	
	/*
	 * static void sumSub(int []arr, int k) { int subSum = 0; for(int i=0;i<k;i++) {
	 * subSum += arr[i]; } int totalSum = subSum; int l = 1; int r = k;
	 * while(r<arr.length) { int remove = arr[l-1]; int add = arr[r]; subSum =
	 * subSum - remove + add; totalSum = Math.max(subSum,totalSum); l++; r++; }
	 * System.out.println(totalSum); }
	 */
	 static void countDistinctElements(int[] arr, int k) {
	        int l = 0;
	        int r = k - 1;

	        while (r < arr.length) {
	            System.out.print("Window [" + l + " - " + r + "]: ");
	            System.out.println(countDistinct(arr, l, r)); // Count distinct elements in the current window
	            l++;
	            r++;
	        }
	    }

	    static int countDistinct(int[] arr, int l, int r) {
	        int count = 0;
	        for (int i = l; i <= r; i++) {
	            boolean isDistinct = true;
	            for (int j = l; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    isDistinct = false;
	                    break;
	                }
	            }
	            if (isDistinct) {
	                count++;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		int []arr = {3,-2,4,-1,2,6};
		int length = 4;
		countDistinctElements(arr,length);
	}
	
}



