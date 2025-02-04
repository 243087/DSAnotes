package com.rahul.kumar.Module6Day37_Searching_BinarySearch;


//Given an increasing - decreasing array with distinct elements. Find the max element.
public class Program5_GivenIncreasingAndDecreasingArrayWithDistictElementFindMaxEle {

	static int safeGet(int []arr, int index) {
		if(index>=0 && index<arr.length)
			return arr[index];
		return -Integer.MAX_VALUE;
	}
	static int findMaxElement(int []arr) {                           //             TC = O[logN]      SC= O[1]
		int l = 0;
		int r = arr.length-1;
		while(l<=r) {
			int mid = l +(r-l)/2;
			if(safeGet(arr,mid) > safeGet(arr,mid-1) && safeGet(arr,mid) > safeGet(arr,mid+1)) {  //               
				return arr[mid];                                               
			}                                                                   
			
			if(safeGet(arr,mid) > safeGet(arr,mid-1) && safeGet(arr,mid) < safeGet(arr,mid+1)) {  
				l = mid+1;                                               
			}                                                                 
			else {                                                       
				r = mid-1;                                             
			}                                                           
		}
		return -1;
	}
	public static void main(String[] args) {
		int []arr = {1,3,5,2};
		System.out.println(findMaxElement(arr));
	}
}
//                                                        5                                                                   
//                                                      3   2
//                                                    1