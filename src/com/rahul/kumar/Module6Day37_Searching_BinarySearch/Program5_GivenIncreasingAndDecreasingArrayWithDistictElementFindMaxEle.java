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
			if(safeGet(arr,mid) > safeGet(arr,mid-1) && safeGet(arr,mid) > safeGet(arr,mid+1)) {  //                 5(mid)
				return arr[mid];                                                 // this if cond is for like            1   4
			}                                                                   //                                   0
			
			if(safeGet(arr,mid) > safeGet(arr,mid-1) && safeGet(arr,mid) < safeGet(arr,mid+1)) {  //                 5
				l = mid+1;                                               //     this if cond is for like           1(mid) 4
			}                                                            //                                       0        
			else {                                                       //      this else cond is for               5
				r = mid-1;                                               //                                        1   4(mid) 
			}                                                            //                                              3
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