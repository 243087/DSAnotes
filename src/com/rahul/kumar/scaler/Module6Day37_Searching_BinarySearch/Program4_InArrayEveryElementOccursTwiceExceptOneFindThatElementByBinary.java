package com.rahul.kumar.scaler.Module6Day37_Searching_BinarySearch;


//Every element occurs twice except for 1. Find that unique element.
//Note :  Duplicates are adjacent to each other and array isn't necessarily sorted.    
public class Program4_InArrayEveryElementOccursTwiceExceptOneFindThatElementByBinary {

	static int safeGet(int []arr, int index) {
		if(index>=0 && index<arr.length)
			return arr[index];
		return Integer.MAX_VALUE;
	}
	static int findElement(int []arr) {
		int l = 0;
		int r = arr.length-1;
		 
		while(l<=r) {
			int mid = l + (r-l)/2;
// this is Case 1: we return value only when our adjacent element is not equal to each other means after finding mid need to check 
//  mid-1 != mid && mid != mid+1 			
			if(safeGet(arr,mid)!=safeGet(arr,mid-1) && safeGet(arr,mid)!=safeGet(arr,mid+1))
				 return arr[mid];
			  
			int firstOccurance = mid;
			if(safeGet(arr,mid)==safeGet(arr,mid-1))
				firstOccurance = mid-1;
			
			if(firstOccurance%2 == 0)
				l = mid+1;
			else
				r = mid-1;
		}
		return -1;                                     //         TC = O[logN]       SC = O[1]
	}
	public static void main(String[] args) {
		int []arr = {8,8,5,5,9,9,6,2,2,4,4};
		System.out.println(findElement(arr));
		
	}
}
