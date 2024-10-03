package com.rahul.kumar.scaler.Module5Day35_Sorting1_CountAndMergerSort;


//Given an a[n], calculate number of pairs[ i , j ], such that i<j && a[ i ] > a[ j ], i and j are index of array.
public class Program5_GivenArrayCalculatePairsIandJsuchThatIlessJAndArrayOfIGreaterThanJ {

	static void countPairs(int []arr) {
		int count =0;
	     for(int i=0;i<arr.length;i++) {
	    	 for(int j =i+1;j<arr.length;j++) {
	    		 if(arr[i]>arr[j])
	    			 count++;
	    	 }
	     }
	     System.out.println(count);                            //          TC = O[N^2]         SC = O[1]  
	}
	public static void main(String[] args) {
		int []arr = {5,3,1,4,2};
		countPairs(arr);
	}
}
