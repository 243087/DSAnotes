package com.rahul.kumar.Module3Day15.PrefixSum;

import java.util.Arrays;

public class Program6SpecialIndex {

	 public static  void cntIndexesToMakeBalance(int arr[], int n) {
		 int []oddPreSum = new int[arr.length];
		 int []evenPreSum = new int[arr.length];
		 oddPreSum[0]=0;
		 evenPreSum[0]=arr[0];
		 for(int i=1;i<arr.length;i++) {
			 int val =0;
			 int val2 = 0;
			 if(i%2==1) 
				 val = arr[i];
			 else
				 val2 = arr[i];
			 
			 oddPreSum[i] = oddPreSum[i-1]+val;
			 evenPreSum[i] = evenPreSum[i-1]+val2;
		 }
		 System.out.println("Odd Prefix sum array is : "+Arrays.toString(oddPreSum));
		 System.out.println("Even Prefix sum array is : "+Arrays.toString(evenPreSum));
		 
		 
		 int count =0;
		 int oddSum =0;
		 int evenSum =0;
		 for(int i=0;i<arr.length;i++) {
			 if(i==0) {
				 oddSum = evenPreSum[arr.length-1]-evenPreSum[i];
				 evenSum = oddPreSum[arr.length-1]-oddPreSum[i];
			 }
			 else {
				 oddSum = oddPreSum[i-1]+ (evenPreSum[arr.length-1]-evenPreSum[i]);
				 evenSum = evenPreSum[i-1]+ (oddPreSum[arr.length-1]-oddPreSum[i]);
			 }
			 if(oddSum == evenSum)
				 count++;
		 }
		 System.out.println(count);
	    }
	public static void main(String[] args) {
		int []arr = {4,3,2,7,6,-2};
		int n = arr.length;
		System.out.println("Given array is "+Arrays.toString(arr));
		cntIndexesToMakeBalance(arr,n);
		
	}
}
